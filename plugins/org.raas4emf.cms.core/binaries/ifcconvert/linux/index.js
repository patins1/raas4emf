// dependencies
const AWS = require('aws-sdk');
const util = require('util');
const fs = require('fs');
const fsp = fs.promises;
const exec = require('child_process').exec;
// get reference to S3 client
const s3 = new AWS.S3();


async function downloadFromS3(path, params) {
    var file = fs.createWriteStream(path);
    let readStream = s3.getObject(params).createReadStream();
    readStream.pipe(file);
    return new Promise(resolve => {
        file.on('finish', resolve);
    });
}

async function doConvert(cmd) {
    return new Promise(resolve => {

        const child = exec(cmd, (error) => {
            console.log("Process complete! Result: " + error);
            resolve();
        });

        // Log process stdout and stderr
        child.stdout.on('data', console.log);
        child.stderr.on('data', console.error);
    });
}


exports.handler = async (event, context, callback) => {

    // Read options from the event parameter.
    //console.log("Reading options from event:\n", util.inspect(event, {depth: 5}));
    const srcBucket = event.Records[0].s3.bucket.name;
    // Object key may have spaces or unicode non-ASCII characters.
    const srcKey = decodeURIComponent(event.Records[0].s3.object.key.replace(/\+/g, " "));
    const dstBucket = srcBucket;
    const dstKey = srcKey + ".dae";

    const params = {
        Bucket: srcBucket,
        Key: srcKey
    };

    try {

        var srcPath = "/tmp/" + srcKey;
        var dstPath = "/tmp/" + dstKey;
        if (fs.existsSync(dstPath)) fs.unlinkSync(dstPath);

        await downloadFromS3(srcPath, params);

        console.info("input size=" + (await fsp.stat(srcPath)).size);

        const cmd = "./IfcConvert --weld-vertices --use-element-hierarchy --use-element-types --orient-shells " + srcPath + " " + dstPath;

        await doConvert(cmd);


        var buffer = await fsp.readFile(dstPath);

        const destparams = {
            Bucket: dstBucket,
            Key: dstKey,
            Body: buffer,
            ContentType: "text/plain"
        };

        const putResult = await s3.putObject(destparams).promise();

        console.log('Successfully downloaded ' + srcBucket + '/' + srcKey + ' and converted to ' + dstBucket + '/' + dstKey);

    }
    catch (error) {
        console.log(error);
        return;
    }
};
