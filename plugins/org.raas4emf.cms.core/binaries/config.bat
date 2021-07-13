SET AWS_ACCOUNT_ID=512347797255

echo "The IFC -> COLLADA -> GLTF transformation chain will be installed for account %XX%"

SET S3_BUCKET=elasticbeanstalk-ap-southeast-2-%AWS_ACCOUNT_ID%

echo Creating policy ..

aws iam create-policy --policy-name GraphicsConversionPolicy --region ap-southeast-2 --policy-document "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Action\":[\"logs:PutLogEvents\",\"logs:CreateLogGroup\",\"logs:CreateLogStream\"],\"Resource\":\"arn:aws:logs:*:*:*\"},{\"Effect\":\"Allow\",\"Action\":[\"s3:GetObject\"],\"Resource\":\"arn:aws:s3:::%S3_BUCKET%/*\"},{\"Effect\":\"Allow\",\"Action\":[\"s3:PutObject\"],\"Resource\":\"arn:aws:s3:::%S3_BUCKET%/*\"}]}"

echo Creating role ..

aws iam create-role --role-name GraphicsConversionRole --description "Lambda Role for Graphics Conversion" --region ap-southeast-2 --assume-role-policy-document "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"lambda.amazonaws.com\"},\"Action\":\"sts:AssumeRole\"}]}"

echo Add policy to role ..

aws iam attach-role-policy --role-name "GraphicsConversionRole" --policy-arn "arn:aws:iam::%AWS_ACCOUNT_ID%:policy/GraphicsConversionPolicy" --region ap-southeast-2




echo "=============================Creating the lambda function Collada2Gltf_Function for .dae => .gltf .."

"C:\Program Files\7-Zip\7z.exe" a -tzip .\collada2gltf\linux\linux.zip .\collada2gltf\linux\index.js .\collada2gltf\linux\COLLADA2GLTF-bin

aws lambda create-function --function-name Collada2Gltf_Function --zip-file fileb://collada2gltf/linux/linux.zip --handler index.handler --runtime nodejs12.x --timeout 60 --memory-size 512 --role arn:aws:iam::%AWS_ACCOUNT_ID%:role/GraphicsConversionRole

echo Grant S3 execution rights to our Lambda function..

aws lambda add-permission --function-name Collada2Gltf_Function --principal s3.amazonaws.com --statement-id s3invoke --action "lambda:InvokeFunction" --source-arn arn:aws:s3:::%S3_BUCKET% --source-account %AWS_ACCOUNT_ID%

echo Check that permission was granted ..

aws lambda get-policy --function-name Collada2Gltf_Function 

echo Add trigger ..

aws s3api put-bucket-notification-configuration --bucket %S3_BUCKET% --notification-configuration "{\"LambdaFunctionConfigurations\":[{\"Id\":\"my-lambda-function-s3-event-configuration-for-Collada2Gltf_Function\",\"LambdaFunctionArn\":\"arn:aws:lambda:ap-southeast-2:%AWS_ACCOUNT_ID%:function:Collada2Gltf_Function\",\"Events\":[\"s3:ObjectCreated:Put\"],\"Filter\":{\"Key\":{\"FilterRules\":[{\"Name\":\"suffix\",\"Value\":\".dae\"}]}}}]}"




echo "=============================Creating the lambda function Ifc2Collada_Function for .ifc => .dae .."

"C:\Program Files\7-Zip\7z.exe" a -tzip .\ifcconvert\linux\linux.zip .\ifcconvert\linux\index.js .\ifcconvert\linux\IfcConvert

aws lambda create-function --function-name Ifc2Collada_Function --zip-file fileb://ifcconvert/linux/linux.zip --handler index.handler --runtime nodejs12.x --timeout 60 --memory-size 512 --role arn:aws:iam::%AWS_ACCOUNT_ID%:role/GraphicsConversionRole

echo Grant S3 execution rights to our Lambda function..

aws lambda add-permission --function-name Ifc2Collada_Function --principal s3.amazonaws.com --statement-id s3invoke --action "lambda:InvokeFunction" --source-arn arn:aws:s3:::%S3_BUCKET% --source-account %AWS_ACCOUNT_ID%

echo Check that permission was granted ..

aws lambda get-policy --function-name Ifc2Collada_Function 

echo Add trigger ..

aws s3api put-bucket-notification-configuration --bucket %S3_BUCKET% --notification-configuration "{\"LambdaFunctionConfigurations\":[{\"Id\":\"my-lambda-function-s3-event-configuration-for-Ifc2Collada_Function\",\"LambdaFunctionArn\":\"arn:aws:lambda:ap-southeast-2:%AWS_ACCOUNT_ID%:function:Ifc2Collada_Function\",\"Events\":[\"s3:ObjectCreated:Put\"],\"Filter\":{\"Key\":{\"FilterRules\":[{\"Name\":\"suffix\",\"Value\":\".ifc\"}]}}}]}"
