var g_path;
var g_ids = [];
var zoomId;
var countProgress;
var g_colors;
var reviseSelection = function (s) { return s; };
if (g_colors == null) g_colors= {};
var g_colorSchemes;
var b_colorSchemes = {};
var materialCtls = [];
var g_visibility = [];
var useOctree = false, octree;

var g_ortho;
if (g_ortho == null) g_ortho = false;
var g_angle = 45;
var g_cameraHistory = [];
var g_selectedInfo = [];
//multiple extension
var g_paths = [];
var g_num_clients;
var up;
var g_dragging = false;
var g_worldPosition;
var g_customInit;
var g_fullyLoaded;
var g_offs;
var g_finished = false;  // for selenium
var g_clients = [];
var g_lastPos;
var g_cameraTransforms = [];
var g_incidentTransforms = [];
var isInParse = false;
var defaultScheme;

var g_map;
var g_overlay;
var g_colladaUnit = 1;	
var g_mapcenter;  
var g_mapapikey;  
var g_mapsteps = 20;
var g_mapenabled = false;  

var key = {};
key.LEFT = 37;
key.UP = 38;
key.RIGHT = 39;
key.DOWN = 40;
key.A = 65;
key.S = 83;
key.D = 68;
key.W = 87;
key.R = 82;
key.I = 73;
key.O = 79;
key.B = 66;
key.F = 70;
key.T = 84;
key.SHIFT = 16;
key.CTRL = 17;
key.PG_UP = 33;
key.PG_DN = 34;
key.PLUS = 75;
key.MINUS = 77;
key.ESCAPE = 27;

var keyIsDown = new Array();
var g_pickInfoElem;
var g_pathTransforms = [];
var distanceBetweenRemotePoints_times_distanceToScreen = null;
var distanceBetweenRemotePoints_times_distanceToScreen_eye = null;

//threejs specific global initializations
var g_oldWorldPosition;
var g_dir;
if (g_dir == null) g_dir = "";
var g_renderer;
if (g_renderer == null) g_renderer = getParameterByName(document.URL,"renderer") || "webgl"; 
var doCollada= document.evaluate!=undefined && g_renderer!="svg";
var doJsonLoader = true;
var doGLTF = false;
var container, stats, rendererStats;
var projector;
var mouse;

var gui, jstree, misc, selectionInfoGui, extrusionLengthGui, closingAngleGui, lazyRenderingGui, materialVisibilityGui, fpsGui, componentsGui;
var effectController;
var geoHandle;
var materials, current_material;
var m_h, m_s, m_l;
var light, pointLight, ambientLight;
var updateMaterials;
var sceneCube, envCube;		
var clock;
var tubeGeometry;
var tubeGeometryPointAt;
var animateTube;
var hasFire = false;
var mapA = null;
var blinkJob;
var blinkingObjects;
var camLeft, camBottom, camWidth, camHeight;

var oldMsg = null;
var allMsg = null;
var occurences = 0;
var overrideSettings;
if (overrideSettings == null) overrideSettings = {}; 
var USE_BUFFERGEOMETRY = true;
var inProcessMessage;
var t_dir = "https://raw.githubusercontent.com/timoxley/threejs/master/examples/";

var trident = !!navigator.userAgent.match(/Trident\/7.0/);
var net = !!navigator.userAgent.match(/.NET4.0E/);
var isIE11 = trident && net;

var framesCount = 0;
var startedTestFps=null;
var testFps=null;
var disableRendering = false;


window.onerror = function myErrorHandler(errorMsg, url, lineNumber) {
	$("#progress").html("Fatal error occured: " + errorMsg);//or any message
	myLog(errorMsg);
	myLog("Location: "+url+" ("+lineNumber+")");
    return false;
};

function processMessage(event) {
	inProcessMessage = true;
	try {
		if (event.data.selectShape) {
			selectShape(event.data.selectShape,g_clients[0].id.substring("threejs".length));
			return;
		}
		if (event.data.locateShape) {
			locateShape(event.data.locateShape,g_clients[0].id.substring("threejs".length));
			return;
		}
		if (!event.data.g_path) { alert("Unknown message received! "+event.data); return; }
		g_path = event.data.g_path;
		if (g_clients.length>0) {
			calcPaths();
			load2(0);
		} else {
			start();
		}
	} 
	finally {
		inProcessMessage = false;
	}
}

window.addEventListener("message", processMessage, false);

function myLogHTML(msg)
{

    	if (msg!=oldMsg) {
    		allMsg = oldMsg+"<br>"+allMsg;
    		prevMsgs = g_pickInfoElem.innerHTML;
    		g_pickInfoElem.innerHTML = msg+"<br>"+allMsg;
    		occurences=1;
    	} else {
    		occurences++;
    		g_pickInfoElem.innerHTML = msg+"("+occurences+")<br>"+allMsg;		
    	}
    	oldMsg=msg;
    	
}

function myLog(msg)
{
    // attempt to send a message to the console
    try
    {
    	if (effectController.log_on_screen)
    		myLogHTML(msg);
    	else
    		console.log(msg);
    }
    // fail gracefully if it does not exist
    catch(e){}
}

var bounding_sphere = null;
var bounding_box = null;
var oldBBbox = null;
var oldBBSphere = null;
function paintBoundingBox(bbox, g_client, id) {
	g_client.scene.remove(bounding_box);

    if (!bbox || oldBBbox && oldBBbox.equals(bbox)) {
    	oldBBbox = null;
    	updateClient(g_client);
    	return;
    }
	oldBBbox = bbox;
	var min = bbox.min;
	var max = bbox.max;
	
	var geometry = new THREE.CubeGeometry( max.x-min.x, max.y-min.y, max.z-min.z );	
	
	var material = new THREE.MeshLambertMaterial({
		color: Math.random() * 0xffffff,
		opacity:  1 ,
		transparent: false
	});
	
	var mesh = new THREE.Mesh( geometry, material );	
	mesh.position = lerpVector(min,max,0.5);
	
	g_client.scene.add( mesh );
	mesh.updateMatrixWorld();
	bounding_box = mesh;
	
	updateClient(g_client);
	
}

function paintBoundingSphere(bsphere, g_client) {
	g_client.scene.remove(bounding_sphere);

    if (!bsphere || oldBBSphere && oldBBSphere.equals(bsphere)) {
    	oldBBSphere = null;
    	updateClient(g_client);
    	return;
    }
    oldBBSphere = bsphere;
	
	var geometry = new THREE.SphereGeometry( bsphere.radius, 32, 32 );
		
	var material = new THREE.MeshLambertMaterial({
		color: Math.random() * 0xffffff,
		opacity:  1 ,
		transparent: false
	});
	
	var mesh = new THREE.Mesh( geometry, material );	
	mesh.position = bsphere.center;
	
	g_client.scene.add( mesh );
	mesh.updateMatrixWorld();
	bounding_sphere = mesh;
	
	updateClient(g_client);
	
}

var oldFaceNormalsHelper, oldVertexNormalsHelper, meshWithVisualizedNormals;

function paintNormals(mesh, g_client) {
	g_client.scene.remove(oldFaceNormalsHelper);
	g_client.scene.remove(oldVertexNormalsHelper);

    if (!mesh || meshWithVisualizedNormals == mesh) {
    	meshWithVisualizedNormals = null;
    	updateClient(g_client);
    	return;
    }
    meshWithVisualizedNormals = mesh;

    mesh = THREE.BufferGeometryUtils.assureMeshWithNoBufferGeometry(mesh);
    g_client.scene.add( oldFaceNormalsHelper = new THREE.FaceNormalsHelper( mesh, 1 ) );
    g_client.scene.add( oldVertexNormalsHelper = new THREE.VertexNormalsHelper( mesh, 1 ) );
	
	updateClient(g_client);
	
}

function printBoundingBox(lines, artifactId) {
	var g_client = resolveArtifact(artifactId);

    for (var tt = 0; tt < lines.length; ) {
	    	
//  var id = lines[tt+6];
//	var transform = getObjectsWithSplittings(id,g_client);
	
    var min = asVector3M([lines[tt+0],lines[tt+1],lines[tt+2]]);
    var max = asVector3M([lines[tt+3],lines[tt+4],lines[tt+5]]);
    
    paintBoundingBox(new THREE.Box3(min,max),g_client);
	
	tt += 7;	
	
    }
	
	updateClient(g_client);
	
}

function locate(transforms,g_client,steps) {
	var bbox = getBoundingBoxOfTree(transforms);
	if (!bbox) return false;
    var target = lerpVector(bbox.min,bbox.max,0.5);   
    var diag = bbox.max.distanceTo(bbox.min);
    var eye = target.clone().add(new THREE.Vector3(-0.65 * diag,0.65 * diag,0.65 * diag));

    if (g_client.objects && !keyIsDown[key.SHIFT]) {
		var s_camera = g_client.g_camera;
		setEyeAndTarget(eye,target,g_client);
		var raycaster = getRaycaster(new THREE.Vector2(),g_client);
		var intersects = raycaster.intersectObjects( g_client.objects );
		g_client.g_camera = g_client.controls.object = s_camera;
	
		if (intersects)
	    for (var tt = 0; tt < intersects.length; tt++) {	
	    	var object = intersects[ tt ].object;
	    	if (g_selectedInfo.length>0 && object.uuid==g_selectedInfo[0].uuid) break;
	    	if (isIntersectedObjectVisible(object, g_client)) {
		    	eye = intersects[ tt ].point;
	    		myLog("In between: "+object.uuid);
	    	}
	    }	    
    }
	
    doSetCamera(eye,target,g_angle,null,steps,g_client);
	return true;
}

function isIntersectedObjectVisible(object, g_client) {
	var material = g_client.g_colors[object.material.name];
	return (object.visible || g_client.additionalObjectsToSelect.indexOf(object)>=0) && material && material.opacity != 0 && material.visible;
}

function getParameterByName(url,name)
{
  if (!name) return null;
  name = name.replace(/[\[]/, "\\\[").replace(/[\]]/, "\\\]");
  var regexS = "[\\?&]" + name + "=([^&#]*)";
  var regex = new RegExp(regexS);
  var results = regex.exec(url);
  if(results == null)
    return null;
  else
    return decodeURIComponent(results[1].replace(/\+/g, " "));
}

function selectShape(id, artifactId) {	
	var g_client = resolveArtifact(artifactId);
	var transform = getObjectsWithSplittings(id,g_client);
	if (transform.length>0 && isFinallyVisible(transform[0])) {
	    for (var tt = 0; tt < transform.length; tt++) {
	    	transform[tt].visible = true;
	    }
		select(transform,g_client);
	} else {
		unSelectAll(g_client);
		if (transform.length>0) hideSiblings(transform,effectController.quickmode ? g_client.originalRoot : g_client.root);
	}
    updateSelectableObjects(g_client);
    updateClient(g_client);
}

function isolateShape(id, artifactId) {
	var g_client = resolveArtifact(artifactId);
	var transform = getObjectsWithSplittings(id,g_client);
	if (transform.length>0) {
		unSelectAll(g_client);
		hideSiblings(transform,effectController.quickmode ? g_client.originalRoot : g_client.root);
	    updateSelectableObjects(g_client);
	    updateClient(g_client);
	}
}

function readCamera(artifactId) {
	var g_client = resolveArtifact(artifactId);
	var g_camera = g_client.g_camera;	
	return vector3ToArray(g_camera.eye).concat(vector3ToArray(g_camera.target)).concat([g_angle,g_ortho]);
}

function resolveArtifact(artifactId) {
	return document.getElementById('threejs'+artifactId);	
}

function setCamera(args,steps,artifactId) {
	var g_client = resolveArtifact(artifactId);
	doSetCamera(asVector3([args[0],args[1],args[2]]),asVector3([args[3],args[4],args[5]]),args[6],args[7],steps,g_client);	  
}

function clickCamera(args,steps,artifactId) {
	var g_client = resolveArtifact(artifactId);
	var aspect = 1;
	var camera = new THREE.PerspectiveCamera( args[6], aspect, 0.5, 1000 );
	camera.position = camera.eye = asVector3([args[0],args[1],args[2]]);	
	camera.up = up;
	camera.lookAt(camera.target = asVector3([args[3],args[4],args[5]]));	
	camera.updateProjectionMatrix();
	camera.updateMatrixWorld();
	g_client.additionalCamera = camera;	
    updateClient(g_client);	
}

function StrToIntArray(a) {
	return [parseInt(a[0]),parseInt(a[1]),parseInt(a[2])];
}

function asVector3(a) {
	return new THREE.Vector3(a[0],a[2],-a[1]);
}

function asVector3M(a) {
	var v = asVector3(a);
	return new THREE.Vector3(v.x/1000,v.y/1000,v.z/1000);
}

function vector3ToArray(v) {
	return [v.x,-v.z,v.y];
}


function vector3ToArrayMM(v) {
	var a = vector3ToArray(v);	
	return [Math.round(a[0]*1000),Math.round(a[1]*1000),Math.round(a[2]*1000)];
}

function doSetCamera(eye,target,angle,ortho,steps,g_client) {
	g_client = g_client || g_clients[0];
	if (target.length == 3) {
		target = asVector3(target);
	}
	var g_camera = g_client.g_camera;
	var oldOrtho = g_ortho;
	if (ortho!=null)
		effectController.orthographic=g_ortho=ortho;
	countProgress=0;
	if (zoomId) window.clearInterval(zoomId);
	if (g_camera && eye.distanceTo(g_camera.eye)<0.001 && target.distanceTo(g_camera.target)<0.001) return;
	if (steps<=1) {
		g_angle=angle;
		setEyeAndTarget(eye,target,g_client);
		return;
	}
	var oldEye = g_camera.eye.clone();
	var oldTarget = g_camera.target.clone();
	var oldUp = new THREE.Vector3().setFromMatrixColumn(1,new THREE.Matrix4().getInverse(new THREE.Matrix4().lookAt(g_camera.eye, g_camera.target, up)).transpose());
	var newUp = new THREE.Vector3().setFromMatrixColumn(1,new THREE.Matrix4().getInverse(new THREE.Matrix4().lookAt(eye, target, up)).transpose());
	var oriUp = up.clone();
	var oldAngle = g_angle;
	g_cameraHistory.push([oldEye,oldTarget,g_angle,oldOrtho,steps,g_client]);
	zoomId = window.setInterval(function() {
		countProgress++;
		var t=countProgress/steps;
		g_angle = lerpScalar(oldAngle, angle, t);
		setEyeAndTarget(lerpVector(oldEye, eye, t), lerpVector(oldTarget, target, t),g_client, /*countProgress<steps ? lerpVector(oldUp, newUp, t) :*/ oriUp);
		updateClient(g_client);
		if (countProgress>=steps) 
			window.clearInterval(zoomId);
	}, 50);
	  
}

function hideShape(id, artifactId) {
	var g_client = resolveArtifact(artifactId);
	var transform = getObjectsWithSplittings(id,g_client);
	if (transform.length>0) {
		unSelectAll(g_client);
	    for (var tt = 0; tt < transform.length; tt++) {
	    	transform[tt].visible = false;
	    }
	    updateClient(g_client);
	}
}

function resetVisibility(transform) {
	transform.visible = true;
	var children = transform.children;
    for (var tt = 0; tt < children.length; tt++) {
    	resetVisibility(children[tt]);
    }
}

function resetVisibilityToFalse(transform) {
	transform.visible = false;
	var children = transform.children;
    for (var tt = 0; tt < children.length; tt++) {
    	resetVisibilityToFalse(children[tt]);
    }
}

function hideSiblings(visibleNodes,root) {
	var parentsOfVisibleNodes = [];
    for (var tt = 0; tt < visibleNodes.length; tt++) {
    	var p=visibleNodes[tt].parent;
    	while (p!=null && parentsOfVisibleNodes.indexOf(p) == -1) {
    		parentsOfVisibleNodes.push(p);
    		p = p.parent;    		
    	}
    }
    showOrHide(root,visibleNodes,parentsOfVisibleNodes);
}

function showOrHide(node,visibleNodes,parentsOfVisibleNodes) {
	if (visibleNodes.indexOf(node) != -1) {
		resetVisibility(node);
		return;
	}
	if (parentsOfVisibleNodes.indexOf(node) == -1) {
		resetVisibilityToFalse(node);
		return;
	}
	node.visible = true;
	var children = node.children;
    for (var tt = 0; tt < children.length; tt++) {
    	showOrHide(children[tt],visibleNodes,parentsOfVisibleNodes);
    }
}

function isFinallyVisible(transform) {
	return transform.visible;
}

function locateShape(id, artifactId) {
	var g_client = resolveArtifact(artifactId);
	var transform = getObjectsWithSplittings(id,g_client);
	if (transform.length>0) {
		  locate(transform,g_client,20);
		  updateClient(g_client);
	}
}

function calcPaths() {
	if (!g_path) g_path = window.location.href;
	if (!g_path || g_path.lastIndexOf("threejs/modelviewer.html?artifact=")!=-1) {
	    var index = g_path.lastIndexOf('/threejs');
	    // Point at the parent directory's assets directory for the moment
	    g_ids = getParameterByName(g_path,'artifact').split(","); 
	    var filename = getParameterByName(g_path,'filename'); 
	  	g_num_clients = g_ids.length;
	    for (var ii = 0; ii < g_num_clients; ii++) 
	        g_paths[ii] = g_path.substring(0, index)+'/services/Artifact/GetArtifact/'+g_ids[ii]+'/'+filename;
	} else {
	    var index2 = g_path.lastIndexOf('artifact=');
	    g_ids = getParameterByName(g_path,'artifact').split(","); 
	    var filename = getParameterByName(g_path,'filename'); 
	  	g_num_clients = g_ids.length;
	    for (var ii = 0; ii < g_num_clients; ii++) 
	        g_paths[ii] = g_path.substring(0, index2+'artifact='.length)+g_ids[ii]+"&filename="+filename;
	}
    var filename = getParameterByName(g_path,'filename'); 
    var ext = filename.substring(filename.lastIndexOf("."));
    doJsonLoader = (ext == ".js");
    doCollada = (ext == ".dae");
    doGLTF = (ext == ".json");
	
}

function buildTable() {

	  // Create a bunch of clients.
	  var ii = 0;
	  var tbodyElem = document.getElementById('clients');
	  if (g_num_clients == 1) {
	      var objElem = createRenderer(tbodyElem,ii);
	      objElem.style.width = '100%';
	      objElem.style.height = g_num_clients==1 ? '100%' : 'auto';		  
	  } else
	  for (var ii = 0; ii < g_num_clients; ii++) {
			  var tdElem = document.createElement('div');
			  var objElem = createRenderer(tdElem,ii);
		      objElem.style.width = '100%';
		      objElem.style.height = g_num_clients==1 ? '100%' : 'auto';
		      tdElem.raasClient = objElem;
		      tdElem.style.flex = '0 0 49.9%';
		      tdElem.style.height = 'auto';
		      tbodyElem.appendChild(tdElem);

		  

		      
	  }
	  
}

function createRenderer(container,ii) {
	var renderer;
    if (g_renderer == "webgl") {
    	renderer = new THREE.WebGLRenderer({ 'antialias': effectController.antialias, alpha: true});
		container.appendChild( renderer.domElement );
   } else if (g_renderer == "canvas") {
	   	renderer = new THREE.CanvasRenderer();
		container.appendChild( renderer.domElement );
	} else if (g_renderer == "software") {
		renderer = new THREE.SoftwareRenderer();
		container.appendChild( renderer.domElement );
	} else if (g_renderer == "svg") {
		renderer = new THREE.SVGRenderer();
		container.appendChild( renderer.domElement );
		renderer.setQuality( 'low' );
	} else if (g_renderer == "css") {
		renderer = new THREE.CSS3DObject();
		container.appendChild( renderer.domElement );
	} else if (g_renderer == "webgldeferred") {
		renderer = new THREE.WebGLDeferredRenderer();
		container.appendChild( renderer.domElement );
	} else {
		alert("Renderer "+renderName+" unknown!");
		return;
	}
    var g_client = renderer.domElement;
    g_client.setAttribute('tabindex','0'); // make canvas focusable
    g_client.id = 'threejs' + g_ids[ii];
    g_client.name = 'threejs' + g_ids[ii];
    g_client.renderer = renderer;
    g_clients.push(g_client);
	var col = g_mapenabled ? { color: 0x000000, a: 0 }/* the default value */ : { r: 1, g: 1, b: 1, color: 0x0, a: 0 }/* prevents dark ragged outline of selection in IE / WebGL mode */;
	g_client.renderer.setClearColor( col.color, col.a  );
	renderer.clear();	
    return g_client;
}

function installRendererEvents(g_client) {
	var renderer = g_client.renderer;
	renderer.domElement.addEventListener( 'mousemove', onDocumentMouseMove, false );
	renderer.domElement.addEventListener( 'mousedown', onDocumentMouseDown, false );
	renderer.domElement.addEventListener( 'mouseup', onDocumentMouseUp, false );
	renderer.domElement.addEventListener( 'mousewheel', onDocumentMouseWheel, false );
	renderer.domElement.addEventListener( 'dblclick', onDocumentDblClick, false );
	renderer.domElement.addEventListener( 'DOMMouseScroll', onDocumentMouseWheel, false ); // firefox
	renderer.domElement.addEventListener( 'touchmove', touchHandler, false );
	renderer.domElement.addEventListener( 'touchstart', touchHandler, false );
	renderer.domElement.addEventListener( 'touchend', touchHandler, false );
}

function touchHandler(event) {
	event.preventDefault();
//	if (event.touches.length > 1 || (event.type == "touchend" && event.touches.length > 0))
//		return;

	
	var newEvt = document.createEvent("MouseEvents");
	var type = null;
	var touch = event.touches.length>0 ? event.touches[0] : event.changedTouches[0];
	var g_client = event.target;
	var detail = 1;
	var button = 0;
	switch (event.type) {
		case "touchstart": 
			type = "mousedown"; 
			distanceBetweenRemotePoints_times_distanceToScreen = null; 
			if ( event.touches.length > 1) return; 
			break;
		case "touchmove":  
			type = "mousemove"; 
			
			if (event.type=="touchmove" && event.touches.length > 1) {
				
				var distX = (event.touches[0].clientX - event.touches[1].clientX);
				var distY = (event.touches[0].clientY - event.touches[1].clientY);
				var distanceBetweenScreenPoints = Math.sqrt(distX*distX + distY*distY);
	
				var g_camera = g_client.g_camera;
	
				if (distanceBetweenRemotePoints_times_distanceToScreen==null && g_worldPosition!=null) {
					// this equation always holds: distanceBetweenRemotePoints / distanceToRemote = distanceBetweenScreenPoints / distanceToScreen
					var distanceToRemote = g_worldPosition.distanceTo(g_camera.eye);
					distanceBetweenRemotePoints_times_distanceToScreen = distanceBetweenScreenPoints * distanceToRemote; // use equation to calculate distanceBetweenRemotePoints * distanceToScreen
					distanceBetweenRemotePoints_times_distanceToScreen_eye = g_camera.eye.clone();
					return;
				} else
				if (distanceBetweenRemotePoints_times_distanceToScreen!=null && distanceBetweenRemotePoints_times_distanceToScreen!=-1 && g_worldPosition!=null)  {
					var distanceToRemote = distanceBetweenRemotePoints_times_distanceToScreen / distanceBetweenScreenPoints; // use equation to calculate distanceToRemote
	//				var newEye = g_worldPosition.clone().add(distanceBetweenRemotePoints_times_distanceToScreen_eye.clone().sub(g_worldPosition).normalize().multiplyScalar(distanceToRemote));
					var t = distanceToRemote/g_worldPosition.distanceTo(g_camera.eye); // calculate factor how much the distance should be changed
					setEyeAndTarget(lerpVector(g_camera.target, g_camera.eye, t),g_camera.target,g_client); // change distance, but to the current target point
	//				setEyeAndTarget(newEye,g_camera.target,g_client);
					//g_pickInfoElem.innerHTML = "d="+distanceBetweenRemotePoints_times_distanceToScreen+" t="+t;
					updateClient(g_client);
					return;
				}
			} else { 
				distanceBetweenRemotePoints_times_distanceToScreen = null; 
			}
		break;
		case "touchend":   
			type = "mouseup"; 
			if (event.changedTouches.length>0 &&  event.changedTouches[0] == touch && event.touches.length>=2) touch = event.touches[1];
			distanceBetweenRemotePoints_times_distanceToScreen = null; 
			if ( event.touches.length > 2) return; 
			if ( event.touches.length == 2) type = "mousedown";   
			break;
	}
	
	if (!touch) {
		return;
		touch = { "screenX":0,"screenY":0,"clientX":0,"clientY":0 };
	}

//	var newMsg = event.type+" ##"+event.touches.length+" #"+event.changedTouches.length;
//	if (touch)
//		  newMsg += " screenY="+touch.screenY+" clientY="+touch.clientY+" pageY="+touch.pageY+" d="+document.documentElement.scrollTop;// event.type+" #"+event.touches.length;
////	  newMsg += " screenX="+touch.screenX+" clientX="+touch.clientX+" pageX="+touch.pageX;// event.type+" #"+event.touches.length;
////	  newMsg += " screenX="+touch.screenX+" screenY="+touch.screenY+" clientX="+touch.clientX+" clientY="+touch.clientY;// event.type+" #"+event.touches.length;
//
//	myLog(newMsg);

//	if (event.touches.length > 1) {				
//			touch = { "screenX":0,"screenY":0,"clientX":0,"clientY":0 };
//			for (var ii = 0; ii < event.touches.length; ++ii) {
//				touch.screenX += event.touches[ii].screenX;
//				touch.screenY += event.touches[ii].screenY;
//				touch.clientX += event.touches[ii].clientX;
//				touch.clientY += event.touches[ii].clientY;
//			}
//			touch.screenX /= event.touches.length;
//			touch.screenY /= event.touches.length;
//			touch.clientX /= event.touches.length;
//			touch.clientY /= event.touches.length;
//	}
	
//    g_pickInfoElem.innerHTML = "#touches="+event.touches.length+" #changedTouches="+event.changedTouches.length+" screenX="+touch.screenX+" screenY="+touch.screenY+" detail="+detail+" dist="+g_lastDistance;
	newEvt.initMouseEvent(type, true, true, event.target.ownerDocument.defaultView, detail,
			touch.screenX, touch.screenY, touch.clientX, touch.clientY,
		false, false, /*event.touches.length > 1*/false, false, button, null);
	event.target.dispatchEvent(newEvt);
	
	
}

function setClientSize(g_client) {
	var newWidth  = g_client.parentNode.offsetWidth;
	var newHeight = g_client.parentNode.offsetHeight;
	g_client.renderer.setSize( newWidth, newHeight );
	if (!g_mapenabled)
	updateProjection(g_client);
	var customContainer = document.getElementById('clients');
	if (gui && customContainer) {
		gui.domElement.style.top = (customContainer.offsetTop+5)+"px";
		gui.domElement.style.right = effectController.displaceGui ? (document.body.offsetWidth-customContainer.offsetLeft-customContainer.offsetWidth+5)+"px" : "5px";
	}
}

function onWindowResize() {
	g_clients.forEach(function (g_client) {
		 setClientSize(g_client);
		 if (!g_mapenabled)
		 updateClient(g_client);
	});
}

function traverseAllObjects(f, g_client) {
	g_client.scene.traverse(f);
	if (g_client.originalRoot) g_client.originalRoot.traverse(f);	
	
}

function getObjectsWithSplittings(name,g_client) {
	g_client = g_client || g_clients[0];
	name = asArray(name);
	var found = [];
	for (var j = 0; j < name.length; ++j) {
		var n = name[j];
		var n_ = n+"_";	
		var f = function ( object ) {	
			if (object.uuid && (object.uuid == n || object.uuid.indexOf(n_)==0)) {
				found.push(object);
			}
		};
		traverseAllObjects(f, g_client);
	}
	return found;
}

function getObjectsWithIDs(name,g_client) {
	g_client = g_client || g_clients[0];
	name = asArray(name);
	var found = [];
	for (var j = 0; j < name.length; ++j) {
		var n = name[j];
		var f = function ( tree ) {	
			if (tree.id == n) found.push(tree);		
			var object = tree.getObjectById( n, true);
			if (object) found.push(object);		
		};
		f(g_client.scene);
		if (g_client.originalRoot) f(g_client.originalRoot);	
	}
	return found;
}

function asArray(x) {
	if (!x)
		return []; else
	if (x instanceof Array)
		return x; else
		return [x];
}

function updateWebGL() {
	if (g_mapenabled && placeInto && g_overlay.getProjection()) {
		var sw = g_overlay.getProjection().fromLatLngToContainerPixel(new google.maps.LatLng(g_mapcenter[0],g_mapcenter[1]));
		var own;
		if (g_map.ownPosition) own = g_overlay.getProjection().fromLatLngToContainerPixel(g_map.ownPosition);
		else own = sw;
		var southWest = g_map.getBounds().getSouthWest();
		var northEast = g_map.getBounds().getNorthEast();
		var northWest = new google.maps.LatLng(northEast.lat(),southWest.lng());
		var height = google.maps.geometry.spherical.computeDistanceBetween(northWest,southWest);
		var width = google.maps.geometry.spherical.computeDistanceBetween(northWest,northEast);
		var div = document.getElementById('clients');
		var map_canvas = g_map.getDiv();
		placeInto(sw.x+map_canvas.offsetLeft-div.offsetLeft, sw.y+map_canvas.offsetTop-div.offsetTop, width*div.offsetWidth/map_canvas.offsetWidth, height*div.offsetHeight/map_canvas.offsetHeight,g_map.getTilt()==45,own.x+map_canvas.offsetLeft-div.offsetLeft, own.y+map_canvas.offsetTop-div.offsetTop);
	}
}

function simulateResize() {
	
}

function placeInto(px,py,width,height,tilt45,ox,oy) {
	if (!g_finished) return;
	
//	width = width * g_colladaUnit;
//	height = height * g_colladaUnit;
	var scale = 1;///g_colladaUnit;
	var g_client = g_clients[0];
	var g_camera = g_client.g_camera;	

    var bbox = getBoundingBoxOfTree(g_client.root);
    var buildingY_in_meters = bbox.max.z - bbox.min.z;
    var buildingX_in_meters = bbox.max.x - bbox.min.x;

    myLog("Meters of building = (" + buildingX_in_meters+", "+buildingY_in_meters+") within total map space (" + width + ", " + height + ")");

    var buildingY_in_pixel = g_client.parentNode.offsetHeight * buildingY_in_meters / height;
    
    myLog("Pixels y of building = " + buildingY_in_pixel);
    
    var eyey = (py-g_client.parentNode.offsetHeight/2)*height/g_client.parentNode.offsetHeight;
    var eyex = (px-g_client.parentNode.offsetWidth/2)*width/g_client.parentNode.offsetWidth;
    
    myLog("Center of building in pixel = (" + px+", " + py + ") within total map space (" + g_client.parentNode.offsetWidth+", " + g_client.parentNode.offsetHeight + ")");
    myLog("eyex " + eyex +" eyey = " + eyey);
    
	var z  = height*g_colladaUnit;
	if (!g_ortho) {
		z  =  Math.pow(2,19-g_map.getZoom())/5.2493438317251968503937007874016*1000*2*g_colladaUnit;
    	g_angle = THREE.Math.radToDeg(Math.asin(height*g_colladaUnit/2/z))*2;
//		z = height*g_colladaUnit/2 / Math.sin(THREE.Math.degToRad(g_angle/2));
	    myLog("Angle = " + g_angle);
	}
	myLog("Distance above earth in meters = " + z);
    eyex = eyey = 0;
    
	var target = new THREE.Vector3(eyex,bbox.min.y,eyey);
	var eye = new THREE.Vector3(target.x,z+target.y,target.z);
	if (tilt45)
		eye.z = eye.z + height;
	
	if (!g_ortho && false||true) {
		var newTarget = getPos(eye,target,px,py,g_client);
		if (newTarget) {
			var ownTarget = getPos(eye,target,ox,oy,g_client);
			target = newTarget;
			eye = new THREE.Vector3(target.x,z+target.y,target.z);
			if (g_client.circleShape==null) {
				
//				var circleRadius = 50;
//				var circleShape = new THREE.Shape();
//				circleShape.moveTo( 0, circleRadius );
//				circleShape.quadraticCurveTo( circleRadius, circleRadius, circleRadius, 0 );
//				circleShape.quadraticCurveTo( circleRadius, -circleRadius, 0, -circleRadius );
//				circleShape.quadraticCurveTo( -circleRadius, -circleRadius, -circleRadius, 0 );
//				circleShape.quadraticCurveTo( -circleRadius, circleRadius, 0, circleRadius );
//				var shape = circleShape;				

				var arcShape = new THREE.Shape();
				arcShape.moveTo( 50, 10 );
				arcShape.absarc( 10, 10, 40, 0, Math.PI*2, false );
				var holePath = new THREE.Path();
				holePath.moveTo( 20, 10 );
				holePath.absarc( 10, 10, 10, 0, Math.PI*2, true );
				arcShape.holes.push( holePath );
				var shape = arcShape;


				var extrudeSettings = { amount: 2000 }; // bevelSegments: 2, steps: 2 , bevelSegments: 5, bevelSize: 8, bevelThickness:5
				extrudeSettings.bevelEnabled = true;
				extrudeSettings.bevelSegments = 10;
				extrudeSettings.steps = 2;

				var geometry = new THREE.ExtrudeGeometry( shape, extrudeSettings );
				var mesh = THREE.SceneUtils.createMultiMaterialObject( geometry, [ new THREE.MeshLambertMaterial( { color: 0x00ff11 } ), new THREE.MeshBasicMaterial( { color: 0x000000, wireframe: true, transparent: true } ) ] );

				g_client.scene.add(mesh);
				g_client.circleShape = mesh;
			}
			var v = new THREE.Vector3(-ownTarget.x+target.x,0,-ownTarget.z+target.z);
			v = v.multiplyScalar(scale);
			g_client.circleShape.position = v;
			g_client.circleShape.rotation = new THREE.Vector3(THREE.Math.degToRad(270),THREE.Math.degToRad(0),THREE.Math.degToRad(0));
			g_client.circleShape.scale = new THREE.Vector3(0.2*g_colladaUnit,0.2*g_colladaUnit,0.2*g_colladaUnit);
			g_client.circleShape.updateMatrixWorld();
		}
	}	
	
    doSetCamera(eye.multiplyScalar(scale),target.multiplyScalar(scale),g_angle,null,g_mapsteps,g_client);
    if (g_mapsteps==1)
    	updateClient(g_client);
    g_mapsteps = 1;

    myLog("eye="+g_camera.eye.x+" "+g_camera.eye.y+" "+g_camera.eye.z+" target="+g_camera.target.x+" "+g_camera.target.y+" "+g_camera.target.z);

}

function getPos(eye,target,px,py,g_client) {
	var s_camera = g_client.g_camera;
	setEyeAndTarget(eye,target,g_client);

	var mouse = new THREE.Vector2();
	mouse.x = ( px / g_client.parentNode.offsetWidth ) * 2 - 1;
	mouse.y = - ( py / g_client.parentNode.offsetHeight ) * 2 + 1;
	var raycaster = getRaycaster(mouse,g_client);
	
	var plane = g_client.plane;
	plane.position = target;
	plane.lookAt( plane.position.clone().add( up ) );	
	plane.updateMatrixWorld();
	
	var intersects = raycaster.intersectObject( plane );
	g_client.g_camera = g_client.controls.object = s_camera;
	if (intersects.length > 0) {
		var intersectPoint = intersects[ 0 ].point;		
		return new THREE.Vector3(-intersectPoint.x,intersectPoint.y,-intersectPoint.z);
	}
	return null;
}

function initializeMap() {
	
	var map_canvas = document.getElementById("map_canvas");
	var clients = document.getElementById("clients");
	
	if (!g_mapenabled) {
		
		if (g_map) {
			map_canvas.style.visibility='hidden';
			clients.style.left='0px';
			clients.style.right='0px';
			simulateResize();
			
			// look at the same position as before
			g_mapenabled = true;
			g_mapsteps = 1;
			updateWebGL();
			g_mapenabled = false;
		}

		return;
	}

	map_canvas.style.visibility='visible';
	clients.style.right='110px';   
	clients.style.left='80px';   
	simulateResize();

	if (g_map) {
		g_mapsteps = 20;
		g_map.setCenter(new google.maps.LatLng(g_mapcenter[0],g_mapcenter[1]));
		return;
	}

    require({
        waitSeconds : 120, //make sure it is enough to load all gmaps scripts
        paths : {
            async : g_dir+'../requirejs-plugins/src/async' //alias to plugin
        }
    });

  require(["async!http://maps.google.com/maps/api/js?key="+g_mapapikey+"&sensor=false&libraries=geometry"], function () {

  if (getParameterByName(document.URL,"unit")) g_colladaUnit = Number(getParameterByName(document.URL,"unit"));	
	
  WebGLOverlay.prototype = new google.maps.OverlayView();  

  WebGLOverlay.prototype.draw = function() {
	  updateWebGL();
  };

  var mapOptions = {
    center: new google.maps.LatLng(g_mapcenter[0],g_mapcenter[1]),
    zoom: getParameterByName(document.URL,"zoom") ? Number(getParameterByName(document.URL,"zoom")) : 19,
    mapTypeId: google.maps.MapTypeId.ROADMAP
  };
  
  g_map = new google.maps.Map(map_canvas, mapOptions);

  google.maps.event.addListener(g_map, 'center_changed', function() {
  	updateWebGL();
  });

  google.maps.event.addListener(g_map, 'tilt_changed', function() {
  	updateWebGL();
  });

  g_overlay = new WebGLOverlay(g_map);
  
  });
}

function WebGLOverlay(map) {
  this.setMap(map);
}

function OnGLCanvasCreated(canvasElement, elementId) {
}

function OnGLCanvasFailed(canvasElement, elementId) {
	myLog("Could not create WebGL IE plugin, defaulting to Canvas renderer!");
	g_renderer = "canvas";
}

function toggleVisibility(transform,materialName,hide) {
	transform.traverse(function (transform) {  
	    applyOnMaterials(transform.material, function (material) {	
			if (material.name && material.name.indexOf(materialName)>=0) {
				var factor = 0.1;
				if (!hide) factor = 1;
				transform.scale.z = factor;	
				transform.updateMatrix();
				transform.updateMatrixWorld();
				return;
			}
	    });
	});
}

function ensureLoop( animation ) {

	for ( var i = 0; i < animation.hierarchy.length; i ++ ) {

		var bone = animation.hierarchy[ i ];

		var first = bone.keys[ 0 ];
		var last = bone.keys[ bone.keys.length - 1 ];

		last.pos = first.pos;
		last.rot = first.rot;
		last.scl = first.scl;

	}

}

function updateGuiControl(c) {
	  if (c.updateDisplay) c.updateDisplay();
}

function updateGui(gui) {
	
	  if (!gui) return;

	  // Iterate over all controllers
	  for (var i in gui.__controllers) {
		  var c = gui.__controllers[i];
		  updateGuiControl(c);
	  }

	  for (var i in gui.__folders) {
		  updateGui(gui.__folders[i]);
	  }

}

function reduceGui(gui) {
	
	  if (!overrideSettings.opencontrols || !overrideSettings.opencontrols.length || overrideSettings.opencontrols.split(",").indexOf(gui.name)!=-1) return false;

	  var allControlsReduced=true;
	  for (var i in gui.__controllers) {
		  var c = gui.__controllers[i];
		  if (overrideSettings.opencontrols.split(",").indexOf(c.property)==-1 && !c.neverRemove) {
			  try {
				  c.remove(c); 
			  } catch (e) {
				  // maybe already be removed!
			  }
		  } else {
			  allControlsReduced = false;
		  }
	  } 

	  var allFoldersReduced=true;
	  for (var i in gui.__folders) {
		  var folder = gui.__folders[i];
		  if (reduceGui(folder)) {
			  gui.removeFolder(i);
		  } else {
			  allFoldersReduced = false;
		  }
	  }

	  return allFoldersReduced && allControlsReduced;

}

function printLines(lines, artifactId, prefix, message) {
    g_pickInfoElem.innerHTML = message;
	var g_client = resolveArtifact(artifactId);
	var scene = g_client.scene;
	
	updateSelectableObjects(g_client);
	
    for (var tt = 0; tt < g_pathTransforms.length; tt++) {
    	var transform = g_pathTransforms[tt];
    	scene.remove(transform);
    }

	g_pathTransforms = [];
	
	var points = [];	
    		
    var visited = [];
    var pred=null;
    var prune=false;
	var lastPoint = null;
	var count=0;
	var costInfo = "";
	var myPosition = null;
	var segments = 0;
	var totalCount = 0;
    for (var tt = 0; tt < lines.length; ) {
    	if (lines[tt]==null) 
    		totalCount++;    	
    	tt++;
    }
    for (var tt = 0; tt < lines.length; ) {
    	if (lines[tt]==null) {
        	lastPoint = null;    
        	tt++;
        	prune=false;

        	var useNurb = true;
        	var useTube = true && (totalCount<=1);

        	var curve;        	
        	if (useNurb) {
        		
				// NURBS curve
	
				var nurbsControlPoints = [];
				var nurbsKnots = [];
				var nurbsDegree = Math.min( Math.round( effectController.nurbs_degree ) , points.length-1);
	
				for ( var i = 0; i <= nurbsDegree; i ++ ) {
	
					nurbsKnots.push( 0 );
	
				}
	
				for ( var i = 0, j = points.length; i < j; i ++ ) {
	
					nurbsControlPoints.push(
						new THREE.Vector4(
								points[i].x,
								points[i].y,
								points[i].z	,
								1 // weight of control point: higher means stronger attraction
						)
					);
	
					var knot = ( i + 1 ) / ( j - nurbsDegree );
					nurbsKnots.push( THREE.Math.clamp( knot, 0, 1 ) );
	
				}
	
				curve = new THREE.NURBSCurve(nurbsDegree, nurbsKnots, nurbsControlPoints);

        	} else {

            	if (points.length>=2) {
            		// fix bug for getPointAt()
    	        	points.push(points[points.length-1].clone());
            	}
        		curve = new THREE.SplineCurve3(points);
        		
        	}

        	var geometry;
        	if (!useTube) {
        		
				geometry = new THREE.Geometry();
				geometry.vertices = curve.getPoints( points.length*5 );
				var nurbsMaterial = new THREE.LineBasicMaterial( { linewidth: 1000, color: 0x333333 } );
	
				var nurbsLine = new THREE.Line( geometry, nurbsMaterial );
				scene.add( nurbsLine );
				g_pathTransforms.push(nurbsLine);
	
	//			var nurbsControlPointsGeometry = new THREE.Geometry();
	//			nurbsControlPointsGeometry.vertices = curve.controlPoints;
	//			var nurbsControlPointsMaterial = new THREE.LineBasicMaterial( { linewidth: 20, color: 0x333333, opacity: 0.25 } );
	//
	//			var nurbsControlPointsLine = new THREE.Line( nurbsControlPointsGeometry, nurbsControlPointsMaterial );
	//			nurbsControlPointsLine.position.copy( nurbsLine.position );
	//			scene.add( nurbsControlPointsLine );
	//			g_pathTransforms.push(nurbsControlPointsLine);
				
				tubeMesh = nurbsLine;
				geometry.path = curve;

        	} else {			
			
				geometry = new THREE.TubeGeometry(curve, points.length*10, 0.2, 4, false, false);
				var color = segments==0 ? 0xff00ff : Math.random() * 0xffffff;
				
				var tubeMesh = THREE.SceneUtils.createMultiMaterialObject( geometry, [
					new THREE.MeshLambertMaterial({
						color: color,
						opacity: geometry.debug ? 0.2 : 0.8,
						transparent: true
					}),
					new THREE.MeshBasicMaterial({
						color: 0x000000,
						opacity: 0.5,
						wireframe: false
				})]);
						
				scene.add(tubeMesh);
	    		g_pathTransforms.push(tubeMesh);
	    		
	    		for (var i = 0; i < tubeMesh.children.length; ++i) {
	    			var mesh = tubeMesh.children[i];
	    			//g_client.objects.push(mesh);
//	    			if (!g_client.me)
//	    				g_client.additionalObjectsToSelect.push(mesh);
	    			mesh.costInfo = costInfo;
	    			mesh.pred = pred;
	    		}
	    		if (message.indexOf("Distance in meter")!=-1)
	    			g_pickInfoElem.innerHTML = "Distance in meter: " + curve.getLength();
	    		if (useTube) myLog("Distance in meter: " + curve.getLength());
        	}
    		for (var i = 0; i < points.length; ++i) {
    			visited[[points[i].x,points[i].y,points[i].z]] = tubeMesh;
    		}
    		if (myPosition==null)
    			myPosition = points[points.length-1];

    		tubeGeometry = geometry;
    		tubeGeometryPointAt = 0;			
    		points = [];
    		costInfo = "";
    		pred = null;
    		segments++;
    	} else {
	    	var nextPoint = asVector3M([lines[tt+0],lines[tt+1],lines[tt+2]]);
	    	points.push(nextPoint);
	    	if (lastPoint!=null && !prune) {
				  if (pred!=null)
					  pred.pred = start;
				  costInfo = prefix+lines[tt+3];
				  var v = visited[[nextPoint.x,nextPoint.y,nextPoint.z]];
				  if (v!=null) {
					  pred = v;
					  prune=true;
				  }
				  count++;
	    	}
	    	lastPoint = nextPoint;
	    	tt+=4;
    	}
    }

    if (myPosition!=null) {
	if (g_client.me==null) {

    	var requiredThreeJS = [];

    	requiredThreeJS.push(g_dir+"js/ShaderDeferred.js");
    	requiredThreeJS.push(g_dir+"js/shaders/CopyShader.js");
    	requiredThreeJS.push(g_dir+"js/shaders/FXAAShader.js");
    	requiredThreeJS.push(g_dir+"js/postprocessing/EffectComposer.js");    	
    	requiredThreeJS.push(g_dir+"js/postprocessing/RenderPass.js");
    	requiredThreeJS.push(g_dir+"js/postprocessing/ShaderPass.js");
    	requiredThreeJS.push(g_dir+"js/postprocessing/MaskPass.js");
    	
        require(requiredThreeJS, function () {

		var loader = new THREE.JSONLoader();
		
		loader.load( g_dir+"models/skinned/human_walk_0_female.js.json", function ( geometry, materials ) {

			geometry.computeVertexNormals();
			geometry.computeBoundingBox();

			ensureLoop( geometry.animation );
			THREE.AnimationHandler.add( geometry.animation );

			for ( var i = 0, il = materials.length; i < il; i ++ ) {

				var originalMaterial = materials[ i ];
				originalMaterial.skinning = true;

				originalMaterial.map = undefined;
				originalMaterial.shading = THREE.SmoothShading;
				originalMaterial.color.setHSL( 0.01, 0.3, 0.3 );
				originalMaterial.ambient.copy( originalMaterial.color );
				originalMaterial.specular.setHSL( 0, 0, 0.1 );
				originalMaterial.shininess = 75;

				originalMaterial.wrapAround = true;
				originalMaterial.wrapRGB.set( 1, 0.5, 0.5 );

			}


			var material = new THREE.MeshFaceMaterial( materials );
			var mesh = new THREE.SkinnedMesh( geometry, material, false );

			mesh.rotation.y = Math.PI/2;
			
			mesh.userData.delta = 25;

			scene.add( mesh );


			animation = new THREE.Animation( mesh, "ActionFemale" );
			animation.JITCompile = false;
			animation.interpolationType = THREE.AnimationHandler.LINEAR;

			animation.play( true );
			animation.update( 0 );
			
			mesh.scale = new THREE.Vector3(0.8,0.8,0.8);

			g_client.scene.add(mesh);
			g_client.me = mesh;
			g_client.me.shiftUp = 1.7;
//			addSelectableObjects(g_client,mesh);

			g_client.me.position = lastAnimationPos = myPosition;
			g_client.me.position.y = g_client.me.position.y + g_client.me.shiftUp;
			g_client.me.updateMatrixWorld();
		    
			updateClient(g_client);
			
		} );
		
        });
		return;
		
//		var arcShape = new THREE.Shape();
//		arcShape.moveTo( 50, 10 );
//		arcShape.absarc( 10, 10, 40, 0, Math.PI*2, false );
//		var holePath = new THREE.Path();
//		holePath.moveTo( 20, 10 );
//		holePath.absarc( 10, 10, 10, 0, Math.PI*2, true );
//		arcShape.holes.push( holePath );
//		var shape = arcShape;
//	
//	
//		var extrudeSettings = { amount: 200 }; // bevelSegments: 2, steps: 2 , bevelSegments: 5, bevelSize: 8, bevelThickness:5
//		extrudeSettings.bevelEnabled = true;
//		extrudeSettings.bevelSegments = 10;
//		extrudeSettings.steps = 2;
//	
//		var geometry = new THREE.ExtrudeGeometry( shape, extrudeSettings );
//		var mesh = THREE.SceneUtils.createMultiMaterialObject( geometry, [ new THREE.MeshLambertMaterial( { color: 0x00ff11 } ), new THREE.MeshBasicMaterial( { color: 0x000000, wireframe: false, transparent: true } ) ] );
//		mesh.scale = new THREE.Vector3(0.01,0.01,0.01);
//		mesh.rotation = new THREE.Vector3(THREE.Math.degToRad(270),THREE.Math.degToRad(0),THREE.Math.degToRad(0));
	
		g_client.scene.add(mesh);
		g_client.me = mesh;
		g_client.me.shiftUp = 0;
	}
	g_client.me.position = lastAnimationPos = myPosition;
	g_client.me.position.y = g_client.me.position.y + g_client.me.shiftUp;
	g_client.me.updateMatrixWorld();
    }
	
    updateClient(g_client);
}

var g_updateClientTime;
var g_updateMe;
var lastAnimationPos;

function motionByKeys(g_client) {
	var lazy=false;
	var g_camera = g_client.g_camera;	
	if (keyIsDown[key.PG_UP]) {
    	g_camera.eye = lerpVector(g_camera.target, g_camera.eye, 11 / 12);
	} else
	if (keyIsDown[key.PG_DN]) {
	    g_camera.eye = lerpVector(g_camera.target, g_camera.eye, 13 / 12);
	} else {
		var _deltaX=0;
		var deltaY=0;
		if (keyIsDown[key.LEFT]) _deltaX = -1;
		if (keyIsDown[key.RIGHT]) _deltaX = 1;
		if (keyIsDown[key.UP]) deltaY = 1;
		if (keyIsDown[key.DOWN]) deltaY = -1;	
		var anyDelta = _deltaX!=0 || deltaY!=0;
		if (anyDelta && g_mapenabled) {
			g_mapsteps = 0;
			g_map.panBy(_deltaX*10,deltaY*10);
		} else
		if (anyDelta && keyIsDown[key.CTRL] && g_client.me) {
			if (clock==null) 
				clock = new THREE.Clock();
			var delta = clock.getDelta();
			delta = delta *3;
			
			if (_deltaX!=0 && deltaY!=0) {
				_deltaX = _deltaX * 0.70710678;
				deltaY = deltaY * 0.70710678;
			}
			_deltaX = _deltaX * delta;
			deltaY = deltaY * delta;
			g_client.me.position.x = g_client.me.position.x + deltaY;
			g_client.me.position.z = g_client.me.position.z + _deltaX;

			THREE.AnimationHandler.update( 0.4 * delta );

			var rotX = _deltaX<0 ? -Math.PI : 0;
			var rotY = deltaY<0 ? -Math.PI/2 : Math.PI/2;
			if (!(_deltaX==0 && deltaY==0))
			if (_deltaX<0 && deltaY>0)
				g_client.me.rotation.y = 3*Math.PI/4; else
			if (_deltaX!=0 && deltaY!=0)
				g_client.me.rotation.y = (rotX + rotY) / 2; else
				g_client.me.rotation.y = _deltaX!=0 ? rotX : rotY;
			g_client.me.updateMatrixWorld();
			
			if (g_updateMe==null)
				g_updateMe = setTimeout(function(){try { theJavaFunction("","",g_client.id,g_client.me.position.x,-g_client.me.position.z,g_client.me.position.y-g_client.me.shiftUp,"StartPointMoved"); } catch (e2) {} g_updateMe = null; },1000);
			
			tubeGeometry = null;			
		} else
		if (anyDelta && isShift(keyIsDown[key.SHIFT])) {
			changePosition(-_deltaX,-deltaY,g_client);
			lazy=true;
		} else 
		if (anyDelta) {
			changeRotation(-_deltaX/20,deltaY/20,keyIsDown[key.CTRL],g_client);
			lazy=true;
		} else
		if (animateTube && tubeGeometry && g_client.me && tubeGeometry.path.getLength()>0) {
			if (clock==null) 
				clock = new THREE.Clock();
			var delta = clock.getDelta();
			delta = delta *10;
			
			tubeGeometryPointAt = tubeGeometryPointAt + delta;
			var ratio = tubeGeometryPointAt / tubeGeometry.path.getLength();
			if (ratio>=1) {
				ratio = 1;
			}
			var pos = tubeGeometry.path.getPointAt(1- ratio );
			pos.y = g_client.me.position.y;

			var alpha = Math.acos( (pos.x - g_client.me.position.x)/pos.distanceTo(g_client.me.position) );
			if (pos.z - g_client.me.position.z<0)
				g_client.me.rotation.y = alpha + Math.PI/2; else
				g_client.me.rotation.y = 2*Math.PI - alpha + Math.PI/2; 
			
			g_client.me.position.x = pos.x;
			g_client.me.position.z = pos.z;
			g_client.me.updateMatrixWorld();
			
			THREE.AnimationHandler.update( 0.4 * delta );
			
			var deltaVector = new THREE.Vector3( pos.x - lastAnimationPos.x,0,pos.z - lastAnimationPos.z);
			lastAnimationPos = pos;
			if (isShift(keyIsDown[key.SHIFT])) {
				g_camera.eye.add(deltaVector);
				pos = g_camera.target.add(deltaVector);
				if (g_worldPosition)
					g_worldPosition.add(deltaVector);
			}
			
			doSetCamera(g_camera.eye,pos,g_angle,null,1,g_client);

			if (ratio>=1) {
				tubeGeometry = null;
			}
		} else {
			if (g_client.me) {
				clock = null; 			
			}
			return; 
		}
	}
	updateProjection(g_client);   
	updateClient(g_client,lazy);
//	setTimeout(function(){updateClient(g_client,lazy);}, Math.max(1, 50 - g_updateClientTime));  
}

function motionByKeysAll() {
	for (var i = 0; i < g_clients.length; ++i) {
		motionByKeys(g_clients[i]);
	}
}

function changePosition(deltaX,deltaY,g_client) {
	if (deltaX==0 && deltaY==0) return;	
	var g_camera = g_client.g_camera;	
    var eye = g_camera.eye.clone().sub(g_camera.target);
    var axisX = eye.clone().cross(up);
    axisX = axisX.normalize();
    var axisY = eye;//eye.clone().cross(axisX);
    axisY.y = 0;
    axisY = axisY.normalize();
    axisX = axisX.multiplyScalar(deltaX);
    axisY = axisY.multiplyScalar(deltaY);
    var axis = axisY.add(axisX);
	g_camera.target = g_camera.target.add(axis);   
	g_camera.eye =  g_camera.eye.add(axis);
}

function changeRotation(deltaX,deltaY,freehand,g_client) {
	enableOrbit(true, g_client);
	g_client.controls.rotateLeft(-deltaX);
	g_client.controls.rotateUp(-deltaY);
	g_client.controls.update();
}

function updateProjection(g_client) {
	if (!g_client.g_camera) { myLog("g_client.g_camera not defined!"); return; }
	setEyeAndTarget(g_client.g_camera.eye,g_client.g_camera.target,g_client);
}


function loadTextureCube( urls )
{
	envCube = THREE.ImageUtils.loadTextureCube( urls, null, function () {
		
		envCube.format = THREE.RGBFormat;
		
		updateMaterials();
		
		updateClients();
		
	}, function () { alert("Error loading texture!"); }  );
}

function expect(controller, value) {
	if (value==undefined) value = false;
	if (controller.initialValue!=value) {
		controller.__onChange();
	}	
}

function getObjectsFromTreeIDs(selected) {
	return getObjectsWithIDs(selected.map(function (ti) { if (ti.indexOf("_")!=-1) return null; return parseInt(ti.substring(2)); }));
}

function getTreeID(object) {
	return "ti"+object.id;
}

function getIntermediateTreeID(object,parent) {
	if (parent && (getTruncatedIfcClass(parent)=="BuildingStorey" ||  getTruncatedIfcClass(parent)=="Space")) {
		return getTreeID(parent) + "_"+ getTruncatedIfcClass(object);
	}
	return null;
}

function getTreeLabel(node) {
//	var material = node.originalMaterial || node.material;
//	if (material && material.name) {
//		var materialName = material.name;
//		if (materialName.indexOf("Ifc") != 0)
//			materialName = "Ifc" + materialName;
//		return materialName+" "+ node.name;
//	}		
	if (node.name == "")
		return getTruncatedIfcClass(node);
	if (getTruncatedIfcClass(node)=="Space")
		return "Space " +node.name;
	return node.name;
}


function getTruncatedIfcClass(node) {
	if (node.storedMaterialName)
		return truncatedMaterialName(node.storedMaterialName);
	var material = node.originalMaterial || node.material;
	if (material && material.name)
		return truncatedMaterialName(material.name);
	return "Other";
}

function truncatedMaterialName(name) {
	if (name.indexOf("Ifc")==0) {
		return name.substring(3);
	}
	return name;
}

function getTreeNodeForThreejsNode(node) {
	return {"id": getTreeID(node),  "text": getTreeLabel(node), state : { loaded : node.children.length==0 }};
}

function openParentNodes(object) {
	if (!object.parent) return;
	openParentNodes(object.parent);
	jstree.jstree("open_node",'#'+ getTreeID(object.parent), null ,false);
	jstree.jstree("open_node",'#'+ getIntermediateTreeID(object,object.parent), null ,false);
}

function generateTree() {

	if (jstree!=null) return;

	jstree = $('#jstree').jstree({
	    'core' : {
	        'data' : function (obj, cb) {
	        	if (obj.id=="#") {
	        		var g_client = g_clients[0];
		            cb.call(this, [getTreeNodeForThreejsNode(effectController.quickmode ? g_client.originalRoot : g_client.root)]);		        		
	        	} else {
	        		var parentNode = getObjectsFromTreeIDs([obj.id])[0];
	        		if (getIntermediateTreeID(parentNode, parentNode)) {
	        			var childrenTree = [];
	        			var materialToTree = {};
	        			parentNode.children.forEach(
	        					function (child) {
	        						var childMaterial = getTruncatedIfcClass(child);
	        						var childTree=materialToTree[childMaterial];
	        						if (childTree==null) {
	        							childTree = {"id": getIntermediateTreeID(child, parentNode),  "text": childMaterial, state : { loaded : true }, "children": []};
	        							materialToTree[childMaterial] = childTree;
	        							childrenTree.push(childTree);
	        						}
	        						childTree.children.push(getTreeNodeForThreejsNode(child));
	        					}
	        			);
			            cb.call(this, childrenTree);	        	
			            return;
	        		}
		            cb.call(this, parentNode.children.map(getTreeNodeForThreejsNode));
	        	}
	        }
	    }
	});
	
	jstree.on("changed.jstree", function (e, data) {
		jstree = null;
		select(getObjectsFromTreeIDs(data.selected));
		updateClients();
		jstree = $('#jstree');
	});
	
	jstree.on("dblclick.jstree", function (event) {
		   var node = $(event.target).closest("li");
		   locate(getObjectsFromTreeIDs([node[0].id]), g_clients[0], 20);
	});
	
}

function updateComponentsCheckbox() {
	var oneVisible = false;
	var oneHidden = false;
	for (var m in g_visibility) { 
		oneVisible = oneVisible || g_visibility[m]; 
		oneHidden = oneHidden || ! g_visibility[m]; 
	} 
	if (oneVisible && oneHidden)
		effectController["Components"] = isIE11;
	else
		effectController["Components"] = oneVisible;
	updateGuiControl(componentsGui);
    $(componentsGui.__checkbox).prop("indeterminate", oneVisible && oneHidden); 
}

function generateGui() {	

	if (gui!=null) return;
	
	gui = new dat.GUI({ width: effectController.opencontrolsWidth, autoPlace: false});

	document.body.appendChild(gui.domElement);

	setClientSize(g_clients[0]);
	
	gui.close();
	gui.domElement.parentNode.style.zIndex = 5;
	var h;		
	var settingsChanged = function() {
		if (g_mapenabled)  {
			updateWebGL();
		}
		else
			onWindowResize();
	};

	var createHandler = function( id ) {

		return function() {
			
			var mat_old = materials[ current_material ];
			mat_old.h = m_h.getValue();
			mat_old.s = m_s.getValue();
			mat_old.l = m_l.getValue();

			var mat = materials[ id ];			

			current_material = null;
			
			if (mat.h==null) {
				mat.h = mat.color.getHSL().h;
				mat.s = mat.color.getHSL().s;
				mat.l = mat.color.getHSL().l;
			}
			
			m_h.setValue( mat.h );
			m_s.setValue( mat.s );
			m_l.setValue( mat.l );
			
			current_material = id;

			g_clients.forEach(function (g_client) {
				g_client.root.traverse(function (effect) {
					if (effect.material) {						
						effect.material = mat.m || mat;	
					}
				});
			});
			
			updateMaterials();

		    
		};

	};
	
	updateMaterials = function() {
		
		if (!current_material) return;		

		var refractionCube  = envCube && effectController.refraction ? new THREE.Texture( envCube.image, new THREE.CubeRefractionMapping() ) : null;

		g_clients.forEach(function (g_client) {
			g_client.root.traverse(function (effect) {
				
				if (!effect.material) return;
				
				effect.material.envMap = effectController.reflectOnMaterial ? refractionCube || envCube : null;
				effect.material.needsUpdate = true;
				
//	    		try {
//	    			if (effect.geometry) effect.geometry.computeTangents();
//	            } catch (e) {}
	
				if ( current_material === "textured" ) {

					effect.enableUvs = true;

				} else {

					effect.enableUvs = false;

				}

				if ( current_material === "colors" ) {

					effect.enableColors = true;

				} else {

					effect.enableColors = false;

				}

				// materials

				if ( effect.material instanceof THREE.ShaderMaterial ) {

					if ( current_material === "dotted2" ) {

						effect.material.uniforms.uLineColor1.value.setHSL( effectController.hue, effectController.saturation, effectController.lightness );

					} else if ( current_material === "hatching2" ) {

						var u = effect.material.uniforms;
						
						if (u.uLineColor2==null)
							u.uLineColor2=null;

						u.uLineColor1.value.setHSL( effectController.hue, effectController.saturation, effectController.lightness );
						u.uLineColor2.value.setHSL( effectController.hue, effectController.saturation, effectController.lightness );
						u.uLineColor3.value.setHSL( effectController.hue, effectController.saturation, effectController.lightness );
						u.uLineColor4.value.setHSL( ( effectController.hue + 0.2 % 1.0 ), effectController.saturation, effectController.lightness );

					} else {

						effect.material.uniforms.uBaseColor.value.setHSL( effectController.hue, effectController.saturation, effectController.lightness );

					}

				} else {

					effect.material.color.setHSL( effectController.hue, effectController.saturation, effectController.lightness );

				}
				


	
		    });

			if (envCube && effectController.surroundings)
			{				
				var shader = THREE.ShaderLib[ "cube" ];
				shader.uniforms[ "tCube" ].value = envCube;
	
				var material = new THREE.ShaderMaterial( {
	
					fragmentShader: shader.fragmentShader,
					vertexShader: shader.vertexShader,
					uniforms: shader.uniforms,
					depthWrite: false,
					side: THREE.BackSide
	
				} );
	
				sceneCube = new THREE.Scene();
				sceneCube.add(new THREE.Mesh( new THREE.CubeGeometry( 100, 100, 100 ), material ));
			} else {
				sceneCube = null;
			}
			
			updateClient(g_client);
		});
	};
	

	gui.add( effectController, "angle", 0.1, 180, 1 ).onChange(function() {
		g_angle = effectController.angle;			
		settingsChanged();
	});
	
	expect(gui.add( effectController, 'orthographic', false ).onChange( function() {
		g_ortho = effectController.orthographic;			
		settingsChanged();
	} ));

	gui.add( effectController, 'panning_mode', false ).onChange( function() {
		if (effectController.panning_mode)
		g_clients.forEach(function (g_client) {
			var camera = g_client.g_camera;
			doSetCamera(new THREE.Vector3(camera.target.x-0.001,camera.target.y+camera.target.distanceTo(camera.eye),camera.target.z),camera.target,g_angle,null,10,g_client);
		});
		settingsChanged();
	} );

	expect(gui.add( effectController, 'tree', false ).onChange( function() {
		$("#part_rightpane").toggleClass('pane_active',effectController.tree);
		generateTree();
	    onWindowResize();
	} ));

	h = gui.addFolder( "maps" );
	
	h.add( effectController, 'enable_maps' ).onChange( function() {
		g_mapenabled = effectController.enable_maps;	
		g_mapcenter = [effectController.latitude, effectController.longitude];
		g_mapapikey = effectController.apikey;
		initializeMap();
		settingsChanged();
	} );
	
	var centerChanged = function() {
		g_mapcenter = [effectController.latitude, effectController.longitude];
		if (g_map) {
			g_mapsteps = 1;
			g_map.setCenter(new google.maps.LatLng(g_mapcenter[0],g_mapcenter[1]));
		}
	};
	
	var latControler = h.add( effectController, "latitude").min(effectController.latitude-0.005).max(effectController.latitude+0.005).onChange(centerChanged).onFinishChange(
			function() {
				this.min(effectController.latitude-0.005).max(effectController.latitude+0.005);
				this.updateDisplay();
			}
	);
	latControler.__precision = 7;
	latControler.updateDisplay();

	var lngControler = h.add( effectController, "longitude").min(effectController.longitude-0.005).max(effectController.longitude+0.005).onChange(centerChanged).onFinishChange(
			function() {
				this.min(effectController.longitude-0.005).max(effectController.longitude+0.005);
				this.updateDisplay();
			}
	);
	lngControler.__precision = 7;
	lngControler.updateDisplay();
	
	h.add( effectController, "apikey");
	
	h.add( effectController, "geolocation" ).onChange(function() {

		if (navigator.geolocation && !effectController.geolocation) {
			navigator.geolocation.clearWatch(geoHandle);
			geoHandle = null;
			return;
		}
		
		
		function displayError(error) {
		  var errors = { 
		    1: 'Permission denied',
		    2: 'Position unavailable',
		    3: 'Request timeout'
		  };
		  alert("Error: " + errors[error.code]);
		}

		function displayPosition(position) {
			myLog("Latitude: " + position.coords.latitude + ", Longitude: " + position.coords.longitude + ", Altitude: " + position.coords.altitude + ", Accuracy: " + position.coords.accuracy);
			//g_mapcenter = [position.coords.latitude, position.coords.longitude];
			if (g_map) {
				g_map.panTo(g_map.ownPosition = new google.maps.LatLng(position.coords.latitude,position.coords.longitude));
			}
		}
		
		if (navigator.geolocation) {
		  var timeoutVal = 10 * 1000 * 1000;
		  geoHandle = navigator.geolocation.watchPosition(
		    displayPosition, 
		    displayError,
		    { enableHighAccuracy: true, timeout: timeoutVal, maximumAge: 0 }
		  );
		}
		else {
		  alert("Geolocation is not supported by this browser");
		}

	});
	

	misc = gui.addFolder( "misc" );

	var initialization = function () {
		
		if (materials) return;

    	var requiredThreeJS = [];

    	requiredThreeJS.push(g_dir+"js/shaders/CopyShader.js");
    	requiredThreeJS.push(g_dir+"js/shaders/FXAAShader.js");
    	requiredThreeJS.push(g_dir+"js/shaders/HorizontalTiltShiftShader.js");
    	requiredThreeJS.push(g_dir+"js/shaders/VerticalTiltShiftShader.js");    	

    	requiredThreeJS.push(g_dir+"js/MarchingCubes.js");
    	requiredThreeJS.push(g_dir+"js/ShaderToon.js");
    	
        require(requiredThreeJS, function () {
			materials = generateMaterials();
			current_material = "shiny";	

			// material (type)

			h = misc.addFolder( "Material type" );
			
			for ( var m in materials ) {
				
				effectController[ m ] = createHandler( m );
				h.add( effectController, m ).name( m );

			}

			// material (cube)

			h = misc.addFolder( "Environment" );
			
			m = "none";
			effectController[ m ] = function () {

				envCube = null;
				
				updateMaterials();
				
			};
			h.add( effectController,  m  ).name(  m  );

			m = "bridge";
			effectController[ m ] = function () {

				var r = t_dir+"textures/cube/Bridge2/";
				var urls = [ r + "posx.jpg", r + "negx.jpg",
							 r + "posy.jpg", r + "negy.jpg",
							 r + "posz.jpg", r + "negz.jpg" ];

				loadTextureCube(urls);
				
			};
			h.add( effectController, m );

			m = "castle";
			effectController[ m ] = function () {

				var path = t_dir+"textures/cube/SwedishRoyalCastle/";
				var format = '.jpg';
				var urls = [
					path + 'px' + format, path + 'nx' + format,
					path + 'py' + format, path + 'ny' + format,
					path + 'pz' + format, path + 'nz' + format
				];

				loadTextureCube(urls);
				
			};
			h.add( effectController, m );

			m = "park";
			effectController[ m ] = function () {
				
				var path = t_dir+"textures/cube/Park2/";
				var format = '.jpg';
				var urls = [
						path + 'posx' + format, path + 'negx' + format,
						path + 'posy' + format, path + 'negy' + format,
						path + 'posz' + format, path + 'negz' + format
					];  

				loadTextureCube(urls);
				
			};
			h.add( effectController, m );

			m = "park3med";
			effectController[ m ] = function () {
				
				var r = t_dir+"textures/cube/Park3Med/";

				var urls = [ r + "px.jpg", r + "nx.jpg",
							 r + "py.jpg", r + "ny.jpg",
							 r + "pz.jpg", r + "nz.jpg" ];

				loadTextureCube(urls);
				
			};
			h.add( effectController, m );

			m = "escher";
			effectController[ m ] = function () {
				
				var r = t_dir+"textures/cube/Escher/";

				var urls = [ r + "px.jpg", r + "nx.jpg",
							 r + "py.jpg", r + "ny.jpg",
							 r + "pz.jpg", r + "nz.jpg" ];  
  

				loadTextureCube(urls);
				
			};
			h.add( effectController, m );

			m = "sky";
			effectController[ m ] = function () {
				
				var path = t_dir+"textures/cube/skybox/";
				var format = '.jpg';
				var urls = [
					path + 'px' + format, path + 'nx' + format,
					path + 'py' + format, path + 'ny' + format,
					path + 'pz' + format, path + 'nz' + format
				];  

				loadTextureCube(urls);
				
			};
			h.add( effectController, m );

			m = "pisa";
			effectController[ m ] = function () {
				
				var path = t_dir+"textures/cube/pisa/";
				var format = '.png';
				var urls = [
					path + 'px' + format, path + 'nx' + format,
					path + 'py' + format, path + 'ny' + format,
					path + 'pz' + format, path + 'nz' + format
				];  
				
				loadTextureCube(urls);
				
			};
			h.add( effectController, m );

			h.add( effectController, "refraction" ).onChange(updateMaterials);
			h.add( effectController, "reflectOnMaterial" ).onChange(updateMaterials);
			h.add( effectController, "surroundings" ).onChange(updateMaterials);
			
        });
        
	};
	effectController[ "More.." ] = initialization;
	misc.add( effectController, "More.." );
	

	// building material (color)
	
	var updateCol = function () {	
		g_clients.forEach(function (g_client) {
			updateComponentsCheckbox();
			updateColors(g_client);
			updateClient(g_client);
		});
	};

	var inUpdateColScheme = false;
	var updateColScheme = function () {
		
		var selectedColorScheme = this.property;
		if (inUpdateColScheme) return;
		inUpdateColScheme = true;
		
		for (var m in g_colorSchemes) {
			if (m != selectedColorScheme)
				b_colorSchemes[m] = false;
		}

		if (!b_colorSchemes[selectedColorScheme])
			selectedColorScheme = defaultScheme;
		
		g_colors = g_colorSchemes[selectedColorScheme];

		g_clients.forEach(function (g_client) {
			setupColors(g_client);
			updateColors(g_client);
			updateClient(g_client);
		});
		materialCtls.forEach(updateGuiControl);
		inUpdateColScheme=false;
	};
//	h = misc.addFolder( "Building material color" );

//	for (var m in g_colors) {
//		if (g_visibility[m] && g_colors[m].length==4 && g_colors[m][3]==0) {
//			g_colors[m][3] = 1;			
//			g_visibility[m] = false;
//		}
//		h.addColor( g_colors, m,  g_colors[m]).onChange(updateCol);
//	}
	
	// building material (color enablement)

	materialVisibilityGui = gui.addFolder( "Material visibility" );

	
	if (effectController.flatten_materialvisibility) materialVisibilityGui = gui;

	effectController["Components"] = true;
	componentsGui = materialVisibilityGui.add( effectController, "Components", effectController["Components"] );
	componentsGui.onChange( function () {
		for (var m in g_visibility) { g_visibility[m] = effectController["Components"]; } 
		materialCtls.forEach(updateGuiControl); 
		updateCol(); 
	} );
	componentsGui.neverRemove = effectController.flatten_materialvisibility;
	updateComponentsCheckbox();
	componentsGui.domElement.parentNode.parentNode.style.backgroundColor = "#000000";

    var g_visibility_sorted = [];
    for(var key in g_visibility)
    	g_visibility_sorted.push(key);
    g_visibility_sorted.sort();
    for (var tt = 0; tt < g_visibility_sorted.length; tt++) {
    	var m = g_visibility_sorted[tt];
    	if (!g_colors[m].hideFromMaterialVisibility) {
		var materialCtl = materialVisibilityGui.add( g_visibility, m,  g_visibility[m]).onChange(updateCol);
    	materialCtls.push(materialCtl);
    	materialCtl.neverRemove = effectController.flatten_materialvisibility;
    	}
	}
    

	effectController["Transparency"] = true;
	var transparencyGui = materialVisibilityGui.add( effectController, "Transparency", effectController["Transparency"] );
	transparencyGui.domElement.parentNode.parentNode.style.backgroundColor = "#000000";
	transparencyGui.__checkbox.style.visibility = "hidden";
	transparencyGui.neverRemove = effectController.flatten_materialvisibility;
	
	for (var m in g_colorSchemes) {
			b_colorSchemes[m] = (m == defaultScheme);
			var mScheme = m;
			var colorScheme = materialVisibilityGui.add( b_colorSchemes, m,  b_colorSchemes[m]).onChange(updateColScheme);
	    	materialCtls.push(colorScheme);		
	    	colorScheme.neverRemove = effectController.flatten_materialvisibility;	
	    	colorScheme.__checkbox.type= "radio";
	}

	// selection info

	selectionInfoGui = gui.addFolder( "Selection info" );

	effectController.id = "";
	selectionInfoGui.add( effectController, "id");
	effectController.material = "";
	selectionInfoGui.add( effectController, "material");
	effectController.distance = 0.1;
	selectionInfoGui.add( effectController, "distance");
	selectionInfoGui.add( effectController, 'select_face' );	
	
	

	effectController[ "locate" ] = function () {
		if (g_selectedInfo.length==0) {
			alert("no object selected!");
			return;
		}
		locate(g_selectedInfo,g_clients[0],20);		
	};
	selectionInfoGui.add( effectController, "locate" );

	effectController[ "select parent object" ] = function () {
		if (g_selectedInfo.length==0) {
			alert("no object selected!");
			return;
		}
		var parent = g_selectedInfo[0].originalParent || g_selectedInfo[0].parent;
		if (parent==null) {
			alert("no parent object available!");
			return;
		}
		  select([parent],g_clients[0]);
		  updateClient(g_clients[0]);
		
	};
	selectionInfoGui.add( effectController, "select parent object" );

	effectController[ "show_bounding_box" ] = function () {
		if (g_selectedInfo.length==0 && !oldBBbox) {
			alert("no object selected!");
			return;
		}
		paintBoundingBox(getBoundingBoxOfTree(g_selectedInfo),g_clients[0]);
	};
	selectionInfoGui.add( effectController, "show_bounding_box" );


	effectController[ "show_bounding_sphere" ] = function () {
		if (g_selectedInfo.length==0 && !oldBBSphere) {
			alert("no object selected!");
			return;
		}
		paintBoundingSphere(g_selectedInfo.length>0 ? g_selectedInfo[0].geometry.boundingSphere.clone().applyMatrix4(g_selectedInfo[0].matrixWorld) : null,g_clients[0]);
	};
	selectionInfoGui.add( effectController, "show_bounding_sphere" );

	effectController[ "show_normals" ] = function () {
		if (g_selectedInfo.length==0 && !meshWithVisualizedNormals) {
			alert("no object selected!");
			return;
		}
		paintNormals(g_selectedInfo.length>0 ? g_selectedInfo[0] : null,g_clients[0]);
	};
	selectionInfoGui.add( effectController, "show_normals" );
	
	function readXYZFromArgs(array, index, target) {
		target.set(array[index],array[index+1],array[index+2]);
	}

	effectController[ "invert_vertex_order" ] = function () {
		if (g_selectedInfo.length==0) {
			alert("no object selected!");
			return;
		}
		var object = g_selectedInfo[0];
		var geometry = object.geometry;
		if (geometry instanceof THREE.BufferGeometry) {
			var array = geometry.attributes.position.array;
			for (var i = 0; i<array.length; i+=9) {
				ax = array[i+0];
				ay = array[i+1];
				az = array[i+2];
				cx = array[i+6+0];
				cy = array[i+6+1];
				cz = array[i+6+2];
				array[i+0] = cx;
				array[i+1] = cy;
				array[i+2] = cz;
				array[i+6+0] = ax;
				array[i+6+1] = ay;
				array[i+6+2] = az;
			}
			geometry.attributes.position.needsUpdate = true;
			var meltedGeometry = (object.originalMaterial || object.material).meltedGeometry;
			if (meltedGeometry) {
				meltedGeometry.attributes.position.needsUpdate = true;
			}
		}
		updateClient(g_clients[0]);
	};
	selectionInfoGui.add( effectController, "invert_vertex_order" );

	effectController[ "center_vertex_order" ] = function () {
		if (g_selectedInfo.length==0) {
			alert("no object selected!");
			return;
		}
		var object = g_selectedInfo[0];
		var geometry = object.geometry;
		if (geometry instanceof THREE.BufferGeometry) {
			var array = geometry.attributes.position.array;
			var vA = new THREE.Vector3();
			var vB = new THREE.Vector3();
			var vC = new THREE.Vector3();
			var cb = new THREE.Vector3();
			var ab = new THREE.Vector3();
			var center = geometry.boundingSphere.center;
			for (var i = 0; i<array.length; i+=9) {
				readXYZFromArgs(array,i,vA);
				readXYZFromArgs(array,i+3,vB);
				readXYZFromArgs(array,i+6,vC);				

				cb.subVectors( vC, vB );
				ab.subVectors( vA, vB );
				cb.cross( ab );

				vA.subVectors( center, vA );
				
				if (vA.dot(cb)>0) {
					ax = array[i+0];
					ay = array[i+1];
					az = array[i+2];
					cx = array[i+6+0];
					cy = array[i+6+1];
					cz = array[i+6+2];
					array[i+0] = cx;
					array[i+1] = cy;
					array[i+2] = cz;
					array[i+6+0] = ax;
					array[i+6+1] = ay;
					array[i+6+2] = az;
				}
			}
			geometry.attributes.position.needsUpdate = true;
			var meltedGeometry = (object.originalMaterial || object.material).meltedGeometry;
			if (meltedGeometry) {
				meltedGeometry.attributes.position.needsUpdate = true;
			}	
		}
		updateClient(g_clients[0]);
	};
	selectionInfoGui.add( effectController, "center_vertex_order" );

	// material (color)
/*
	h = misc.addFolder( "Material color" );

	m_h = h.add( effectController, "hue", 0.0, 1.0, 0.025 ).onChange(updateMaterials);
	m_s = h.add( effectController, "saturation", 0.0, 1.0, 0.025 ).onChange(updateMaterials);
	m_l = h.add( effectController, "lightness", 0.0, 1.0, 0.025 ).onChange(updateMaterials);

	// light (point)

	h = misc.addFolder( "Point light color" );
	
	var changeLightPoint = function() {	
		pointLight.color.setHSL( effectController.lhue, effectController.lsaturation, effectController.llightness );
		settingsChanged();
	};

	h.add( effectController, "lhue", 0.0, 1.0, 0.025 ).name("hue").onChange( changeLightPoint );
	h.add( effectController, "lsaturation", 0.0, 1.0, 0.025 ).name("saturation").onChange( changeLightPoint );
	h.add( effectController, "llightness", 0.0, 1.0, 0.025 ).name("lightness").onChange( changeLightPoint );
*/
	misc.add( effectController, "nurbs_degree", 1, 10, 1 ).step(1).onChange(function() {
		settingsChanged();
	});
	misc.add( effectController, 'select_by_dblclick', false );
	if (!effectController.vertexnormals && overrideSettings.vertexnormals!=false) {
		var g_client = g_clients[0];
		var geometryCount = 0;
		g_client.root.traverse(function (mesh) {
			if (mesh.geometry) {
				geometryCount++;
			}
		});		
		effectController.vertexnormals = geometryCount<50;
	}
	misc.add( effectController, 'quickmode' ).onChange( function() {
		g_clients.forEach( function(g_client) {
			unSelectAll(g_client);
			if (g_client.originalRoot) {
				var root = g_client.root;
				g_client.scene.remove(root);
				g_client.scene.add(g_client.originalRoot);
				g_client.root = g_client.originalRoot;
				g_client.originalRoot=root;
			} else if (effectController.quickmode) {
				melt(g_client);
			}
			settingsChanged();
		}); 
	});	
	misc.add( effectController, 'vertexnormals' ).onChange( function() {
		var g_client = g_clients[0];
		g_client.root.traverse(function (mesh) {
			var geometry = mesh.geometry;
			if (geometry) {
				if (geometry instanceof THREE.BufferGeometry) {
					geometry.computeVertexNormals();
					geometry.attributes.normal.needsUpdate = true;
					if (effectController.vertexnormals) {
						var faceGeometry = THREE.BufferGeometryUtils.assureNoBufferGeometry(geometry);
						faceGeometry.computeFaceNormals();
						faceGeometry.computeVertexNormals(true);	
						var bufferGeometry = THREE.BufferGeometryUtils.fromGeometry(faceGeometry);
						geometry.attributes.normal.array.set(bufferGeometry.attributes.normal.array);
						geometry.normalsNeedUpdate = true;
					}
				} else if (effectController.vertexnormals) {
					geometry.computeVertexNormals(true);	
					geometry.normalsNeedUpdate = true;
				} else {
					for ( f = 0, fl = geometry.faces.length; f < fl; f ++ ) {
						geometry.faces[ f ].vertexNormals = g_emptyArray;
					}					
					geometry.__tmpVertices = undefined;
					geometry.normalsNeedUpdate = true;		
				}
			}
		});		
		if (meshWithVisualizedNormals) {
			var _meshWithVisualizedNormals = meshWithVisualizedNormals;
			meshWithVisualizedNormals = null;
			paintNormals(_meshWithVisualizedNormals,g_client);			
		}
		settingsChanged();
	} );
	
	

	{	

		var extrusion = gui.addFolder( "extrusion" );

		effectController["extrusion_length"] = "0";
		extrusionLengthGui = extrusion.add( effectController, "extrusion_length");
		
		effectController["closing_angle"] = "0";
		closingAngleGui = extrusion.add( effectController, "closing_angle");

		effectController["bend radius"] = 1;
		extrusion.add( effectController, "bend radius", 0,3, 0.1 ).onChange(paintBendPoints);
		
		effectController["steps"] = 20;
		extrusion.add( effectController, "steps", 1,100, 1 ).step(1).onChange(paintBendPoints);

		effectController["suspension_distance"] = 0.5;
		extrusion.add( effectController, "suspension_distance", 0.1,3, 0.1 ).onChange(paintBendPoints);
		
		effectController["suspension_length"] = 1;
		extrusion.add( effectController, "suspension_length", 0.1,3, 0.1 ).onChange(paintBendPoints);
		
//		effectController[ "set profile" ] = function () {
//			g_profile = g_selectedInfo;
//		};
//		extrusion.add( effectController, "set profile" );

		effectController[ "add bend point" ] = function () {
						
			var i = effectController.bendPointCount = (effectController.bendPointCount||0)+1;

			var bend = "angle "+i;
			var line ="line "+i;
			effectController[bend] = 90;
			extrusion.add( effectController, bend, -90,90, 1 ).onChange(paintBendPoints);
			effectController[line] = 1;
			extrusion.add( effectController, line, 0,10, 0.1 ).onChange(paintBendPoints);

			paintBendPoints();
			
		};
		extrusion.add( effectController, "add bend point" );		

	}

	debugGui = gui.addFolder( "debug" );
	debugGui.add( effectController, 'log_on_screen' ).onChange( function() {
		settingsChanged();
	} );
	expect(fpsGui = debugGui.add( effectController, 'fps').onChange( function() {
		if (effectController.fps) {
			if (stats==null) {
				stats = new Stats();
				stats.domElement.style.position = 'absolute';
				stats.domElement.style.top = '0px';
				container.appendChild( stats.domElement );
			} else {
				stats.domElement.style.display = "block";
			}
		} else {
			if (stats!=null) {
				stats.domElement.style.display = "none";
			}
		}		
		settingsChanged();
	} ));
	expect(debugGui.add( effectController, 'wireframe' ).onChange( function() {
		g_clients.forEach(function updateFillMode(g_client) {
				for (var m in g_client.g_colors) {
					material = g_client.g_colors[m];
			    	material.wireframe = effectController.wireframe;
				    material.wireframeLinewidth = 1;
				    material.needsUpdate = true;
				}
		});
		settingsChanged();
	} ));
	expect(debugGui.add( effectController, 'double_side_material' ).onChange( function() {
		for (var m in g_colors) {
			var material = g_colors[m];
			material.side = effectController.double_side_material ? THREE.DoubleSide : THREE.FrontSide;				
			material.needsUpdate = true;
		}
		settingsChanged();
	} ));
	lazyRenderingGui = debugGui.add( effectController, 'lazy_rendering' ).onChange( function() {
		settingsChanged();
	} );

	
//	effectController[ "log_scene" ] = function () {
//		g_clients[0].scene.traverse(function (child) { 
//			var p = child;
//			var space = "";
//			while (p=p.parent) space += "	"; 
//			var material = child.baseMaterial || child.material;
//			myLog(space+getThreejsTypeName(child)+" id="+child.id+" name="+child.name+(material?" material="+(material.name || "unnamed"):""));
//		});
//	};
//	debugGui.add( effectController, "log_scene" );

	thirdParty = debugGui.addFolder( "3rd Party Remote Tools" );

	effectController[ "ThreeInspector" ] = function () {
		g_clients[0].scene.traverse(function (child) { 

	        require(['https://github.com/zz85/zz85-bookmarklets/raw/master/js/ThreeInspector.js'], function () {
	        	var g_client = g_clients[0];
	        	g_client.scene.traverse(function (child) { 
	        		if ( child.matrixAutoUpdate === false ) 
	        			child.matrixAutoUpdate = true;
	        	});
	        	g_client.scene.autoUpdate = true;
	        	effectController.lazy_rendering = false;
	        	updateGuiControl(lazyRenderingGui);
	    		settingsChanged();
	        });
	        
		});
	};
	thirdParty.add( effectController, "ThreeInspector" );

	effectController[ "threex.rendererstats" ] = function () {
		g_clients[0].scene.traverse(function (child) { 
	        require(['https://raw.githubusercontent.com/jeromeetienne/threex.rendererstats/master/threex.rendererstats.js'], function () {
				rendererStats   = new THREEx.RendererStats();
				rendererStats.domElement.style.zIndex = 4;
				rendererStats.domElement.style.position = 'absolute';
				rendererStats.domElement.style.left = '0px';
				rendererStats.domElement.style.bottom   = '0px';
				rendererStats.domElement.style.width   = 'auto';
				document.body.appendChild( rendererStats.domElement );
	        });
		});
	};
	thirdParty.add( effectController, "threex.rendererstats" );


	dat.gui.GUI.prototype.removeFolder =
		function(name) {
			var folder =this.__folders[name];
			if (!folder) return;
			folder.close();
			folder.__ul.parentNode.removeChild(folder.__ul);
//			dom.removeClass(this.__folders[name].li, 'folder');
			this.__folders[name] = undefined;
//			this.onResize();
		};

		
	reduceGui(gui);
	
}

function pausecomp(millis)
{
 var date = new Date();
 var curDate = null;
 do { curDate = new Date(); }
 while(curDate-date < millis);
}

var g_emptyArray = [];
var g_emptyDoubleArray = [[]];
var g_emptyColor;

function optArray(ar) {
	if (ar.length == 0)
		return g_emptyArray;
	return ar;
}

function optThree(obj, emptyObj) {
	if (obj.equals(emptyObj))
		return emptyObj;
	return obj;
}


function optimizeMem(g_client) {
	g_emptyColor = new THREE.Color();
	g_client.scene.traverse(function (mesh) { 
		var geometry = mesh.geometry;
		if (geometry) {
			if (geometry.faces)
			for ( f = 0, fl = geometry.faces.length; f < fl; f ++ ) {
				var face = geometry.faces[ f ];
				face.color = optThree(face.color, g_emptyColor);
				face.vertexColors = optArray(face.vertexColors);
				face.vertexNormals = optArray(face.vertexNormals);
				face.vertexTangents = optArray(face.vertexTangents);
			}
		}
    });
}

function resetLocalCoordinateSystems(SAVEMEM,g_client) {
	

	g_client.root.traverse(function (mesh) {
		if (mesh.position) {	
			if (SAVEMEM) {
				mesh.position = g_client.scene.position;
				mesh.rotation = g_client.scene.rotation;
				mesh.quaternion = g_client.scene.quaternion;
				mesh.scale = g_client.scene.scale;
				mesh.matrix = g_client.scene.matrix;
				mesh.matrixWorld = g_client.scene.matrixWorld;
				mesh.up = g_client.scene.up;
			} else {
				mesh.position.set(0,0,0);
				mesh.rotation.set(0,0,0) ;
				mesh.scale.set(1,1,1); 
				mesh.updateMatrix();				
			}
		}
	});
	g_client.scene.updateMatrixWorld();
	
}

function getCoordinateCount(geometry) {
	return geometry.vertices ? geometry.vertices.length*3 : geometry.attributes.position.array.length;
}

function melt(g_client) {	

			// Merge two geometries or geometry and geometry from object (using object's transform)

	THREE.GeometryUtils.merge= function ( geometry1, object2 /* mesh | geometry */, materialIndexOffset ) {

		var matrix = null, normalMatrix = null,
		vertexOffset = geometry1.vertices.length,
		uvPosition = geometry1.faceVertexUvs[ 0 ].length,
		geometry2 = object2 instanceof THREE.Mesh ? object2.geometry : object2,
		vertices1 = geometry1.vertices,
		vertices2 = geometry2.vertices,
		faces1 = geometry1.faces,
		faces2 = geometry2.faces,
		uvs1 = geometry1.faceVertexUvs[ 0 ],
		uvs2 = geometry2.faceVertexUvs[ 0 ];

		if ( materialIndexOffset === undefined ) materialIndexOffset = 0;

		if ( object2 instanceof THREE.Mesh ) {

			object2.matrixAutoUpdate && object2.updateMatrix();

			matrix = object2.matrixWorld;//!

			normalMatrix = new THREE.Matrix3().getNormalMatrix( matrix );

		}

		// vertices

		for ( var i = 0, il = vertices2.length; i < il; i ++ ) {

			var vertex = vertices2[ i ];

			var vertexCopy = vertex/*.clone()*/;

			if ( matrix ) vertexCopy.applyMatrix4( matrix );

			vertices1.push( vertexCopy );

		}

		// faces

		for ( i = 0, il = faces2.length; i < il; i ++ ) {

			var face = faces2[ i ], faceCopy, normal, color,
			faceVertexNormals = face.vertexNormals,
			faceVertexColors = face.vertexColors;
			
			face.geometry = geometry1;

//			faceCopy = new THREE.Face3( face.a + vertexOffset, face.b + vertexOffset, face.c + vertexOffset );
//			faceCopy.normal.copy( face.normal );
			faceCopy = face;
			faceCopy.a += vertexOffset;
			faceCopy.b += vertexOffset;
			faceCopy.c += vertexOffset;

//			if ( normalMatrix ) {
//
//				faceCopy.normal.applyMatrix3( normalMatrix ).normalize();
//
//			}

			for ( var j = 0, jl = faceVertexNormals.length; j < jl; j ++ ) {

				normal = faceVertexNormals[ j ]/*.clone()*/;

				if ( normalMatrix ) {

					normal.applyMatrix3( normalMatrix ).normalize();

				}

//				faceCopy.vertexNormals.push( normal );

			}

//			faceCopy.color.copy( face.color );
//
//			for ( var j = 0, jl = faceVertexColors.length; j < jl; j ++ ) {
//
//				color = faceVertexColors[ j ];
//				faceCopy.vertexColors.push( color.clone() );
//
//			}

			faceCopy.materialIndex = face.materialIndex + materialIndexOffset;

//			faceCopy.centroid.copy( face.centroid );

//			if ( matrix ) {
//
//				faceCopy.centroid.applyMatrix4( matrix );
//
//			}

			faces1.push( faceCopy );

		}

		// uvs

//		for ( i = 0, il = uvs2.length; i < il; i ++ ) {
//
//			var uv = uvs2[ i ], uvCopy = [];
//
//			for ( var j = 0, jl = uv.length; j < jl; j ++ ) {
//
//				uvCopy.push( new THREE.Vector2( uv[ j ].x, uv[ j ].y ) );
//
//			}
//
//			uvs1.push( uvCopy );
//
//		}

	};

	var meltStart = new Date().getTime();
	myLog("Melting...");
	
	g_client.scene.updateMatrixWorld();	

	var meltIntoBufferGeometry = false;
	g_client.root.traverse(function (mesh) {
		meltIntoBufferGeometry = meltIntoBufferGeometry || mesh.geometry instanceof THREE.BufferGeometry;
	});
	
	
	if (meltIntoBufferGeometry) {

	g_client.root.traverse(function (mesh) {
		if (mesh.geometry && mesh.material) {
			if (mesh.geometry.taken) {
				mesh.geometry = mesh.geometry.clone();
			} else {
				mesh.geometry.taken = true;
			}
		}
	});
	g_client.root.traverse(function (mesh) {
		if (mesh.geometry && mesh.material) {
			mesh.geometry.applyMatrix(mesh.matrixWorld);	
		}
	});
	resetLocalCoordinateSystems(true,g_client);
	
	var geometriesOfMaterial = {};

	g_client.root.traverse(function (mesh) {
		var mat;
		if (mesh.geometry && mesh.material && (mat=mesh.material.name)) {			
			var geometries = geometriesOfMaterial[mat];
			if (!geometries) {
				geometriesOfMaterial[mat] = geometries = [];
			}
			geometries.push(mesh.geometry);
		}
	});

	var cityMesh = new THREE.Object3D();
	cityMesh.name = "melted meshes";
	g_client.scene.add(cityMesh);
	
	for (var mat in geometriesOfMaterial) {
		var geometries = geometriesOfMaterial[mat];
		var tt = 0;
		var partition = 0;

		while (tt<geometries.length) {
		partition += 1; 
			
		var ttt = tt;
		var vertexCountOfMaterial = 0;
		while (ttt<geometries.length && vertexCountOfMaterial+getCoordinateCount(geometries[ttt])<1048576*9) {
			vertexCountOfMaterial+=getCoordinateCount(geometries[ttt]);
			ttt += 1;
		}

		var meltedGeometry = new THREE.BufferGeometry();

		var positionBuffer = new ArrayBuffer(vertexCountOfMaterial*4);
		var normalBuffer = new ArrayBuffer(vertexCountOfMaterial*4);
		meltedGeometry.attributes = {
			position: {
				itemSize: 3,
				array: new Float32Array( positionBuffer )
			},
			normal: {
				itemSize: 3,
				array: new Float32Array( normalBuffer )
			}
		};

		var g = 0;
		while (tt<ttt) {
			var geometry = geometries[tt];
			geometries[tt] = null;
			geometry = THREE.BufferGeometryUtils.fromGeometry( geometry );
			if (!hasVertexNormals(geometry)) geometry.computeVertexNormals();
			var position = geometry.attributes.position;
			var positions2 = position.array;
			position.array = new Float32Array( positionBuffer, g*4, positions2.length );
			position.array.set(positions2);
			var normal = geometry.attributes.normal;
			var normals2 = normal.array;
			normal.array = new Float32Array( normalBuffer, g*4, normals2.length );
			normal.array.set(normals2);
			g += positions2.length;
			tt += 1;
		}

		g_client.g_colors[mat].meltedGeometry = meltedGeometry;
		var materialMesh = new THREE.Mesh(meltedGeometry, g_client.g_colors[mat] );
	    setupUVs(materialMesh);
		cityMesh.add( materialMesh );
		materialMesh.name = "melted meshes for material "+mat+" partition "+partition;
		myLog(materialMesh.name); 
		if (mat=="Door" || mat=="Window")
			materialMesh.renderDepth = -2; 
		}
	}

	g_client.root.traverse(function (mesh) { 		
		var geometry = mesh.geometry;
		if (geometry) {		
			
			geometry.boundingSphere = null;
			geometry.computeBoundingSphere();

			// update flags

			geometry.verticesNeedUpdate = true;
			geometry.morphTargetsNeedUpdate = true;
			geometry.elementsNeedUpdate = true;
			geometry.uvsNeedUpdate = true;
			geometry.normalsNeedUpdate = true;
			geometry.colorsNeedUpdate = true;
			geometry.tangentsNeedUpdate = true;
			geometry.lineDistancesNeedUpdate = true;

			geometry.buffersNeedUpdate = true;
		}
	});	
	

	g_client.originalRoot = g_client.root;
	g_client.scene.remove(g_client.root);		
	
	g_client.root = cityMesh;
	g_client.scene.updateMatrixWorld();
	
	
	
	} else {
	
	var cityGeometry= new THREE.Geometry();
	var materials = [];
    for (var m in g_client.g_colors) {
    	var mat = g_client.g_colors[m];
    	materials.push(mat);
    }
    var meshIndex = 0;

    var meshCount = 0;
	g_client.root.traverse(function (mesh) {
		if (mesh.geometry && mesh.material) {
			meshCount++;			
		}
	});
	g_client.root.traverse(function (mesh) {
		if (mesh.geometry && mesh.material) {
			var materialIndex = materials.indexOf(mesh.baseMaterial || mesh.material);
			if (materialIndex<0)
				alert("Unknown material of "+mesh.name);
		    THREE.GeometryUtils.merge( cityGeometry, mesh, materialIndex );
		    meshIndex++;
		}
	});

	var SAVEMEM = false;
	resetLocalCoordinateSystems(SAVEMEM,g_client);
	

	g_client.root.traverse(function (mesh) { 		
		var geometry = mesh.geometry;
		if (geometry) {		
			
			if (SAVEMEM) {
				geometry.vertices = optArray(geometry.vertices);
				geometry.colors = optArray(geometry.colors);  // one-to-one vertex colors, used in ParticleSystem, Line and Ribbon
				geometry.normals = optArray(geometry.normals); // one-to-one vertex normals, used in Ribbon
	
				geometry.faces = optArray(geometry.faces);
	
				if (geometry.faceVertexUvs.length==1 && geometry.faceVertexUvs[0].length==0) 
					geometry.faceVertexUvs = g_emptyDoubleArray;
	
				geometry.morphTargets = optArray(geometry.morphTargets);
				geometry.morphColors = optArray(geometry.morphColors);
				geometry.morphNormals = optArray(geometry.morphNormals);
	
				geometry.skinWeights = optArray(geometry.skinWeights);
				geometry.skinIndices = optArray(geometry.skinIndices);
	
				geometry.lineDistances = optArray(geometry.lineDistances);
			}

			geometry.vertices = cityGeometry.vertices;
			geometry.boundingSphere = null;
			geometry.computeBoundingSphere();

			// update flags

			geometry.verticesNeedUpdate = true;
			geometry.morphTargetsNeedUpdate = true;
			geometry.elementsNeedUpdate = true;
			geometry.uvsNeedUpdate = true;
			geometry.normalsNeedUpdate = true;
			geometry.colorsNeedUpdate = true;
			geometry.tangentsNeedUpdate = true;
			geometry.lineDistancesNeedUpdate = true;

			geometry.buffersNeedUpdate = true;
		}
	});	
	
	g_client.originalRoot = g_client.root;
	g_client.scene.remove(g_client.root);		
	
	var material = new THREE.MeshFaceMaterial( materials );
	material.name = "melted material";	
	var cityMesh = new THREE.Mesh(cityGeometry, material );
	cityMesh.name = "melted meshes";
    setupUVs(cityMesh);
	g_client.scene.add(cityMesh);
	g_client.root = cityMesh;
	g_client.scene.updateMatrixWorld();
	
	}

	myLog("Melt time="+(new Date().getTime() - meltStart));
}


var g_profile = [];

function getVerticesOfFaces(geometry) {	
	if (geometry instanceof THREE.BufferGeometry) {
		return getOnlyUsedVertices(geometry);
	}
	var vertices = [];
	for ( var f = 0; f <geometry.faces.length; f ++ ) {
		var face = geometry.faces[f];
		vertices.push(geometry.vertices[face.a]);
		vertices.push(geometry.vertices[face.b]);
		vertices.push(geometry.vertices[face.c]);
	}
	return vertices;
}

function readPolygons() {

	var g_client = g_clients[0];
	
	var result = [];
	
	g_client.root.traverse(function (child) {
		var geometry = child.geometry;
	    if (child.visible && geometry && child.material && g_profile.indexOf(child)==-1) {
	    	var vectors = getVerticesOfFaces(geometry);
			for ( var v = 0, vlen = vectors.length; v < vlen; v ++ ) {
				var ar = vector3ToArray(child.localToWorld(vectors[v].clone()));
				for ( var i = 0; i<ar.length; i ++ )
					result.push(ar[i]);
			}
	    }
    });
	
	return result;
	
}

function paintBendPoints() {
	
	var g_client = g_clients[0];
	
	var initialExtrusion = g_profile.length==0;
	
	if (g_profile.length==0) {

		g_client.root.traverse(function (child) {
			var geometry = child.geometry;
		    if (geometry && child.material && g_profile.length==0) {
		    	g_profile = [child];
		    }
	    });
		
	}

	// NURBS curve

	var nurbsControlPoints = [];
	var nurbsKnots = [];
	var nurbsDegree = 2;

	var os=new THREE.Vector4(0,0,0,0);
	
	var ww = 10.0;
	var t = new THREE.Vector3(1,0,0);
	nurbsControlPoints.push(new THREE.Vector4(0,0,0,1).add(os));
	nurbsControlPoints.push(t.clone().divideScalar(200000).add(os));
	nurbsControlPoints.push(t.clone().divideScalar(100000).add(os));
	
	nurbsKnots.push(0);
	nurbsKnots.push(0);
	nurbsKnots.push(0);
	nurbsKnots.push(1);
	nurbsKnots.push(1);
	nurbsKnots.push(1);

	var sampleClosedSpline = new THREE.NURBSCurve(nurbsDegree, nurbsKnots, nurbsControlPoints);


	var addedAngles = 0;
	for ( var i = 0; i <effectController.bendPointCount; i ++ ) {	
		var bend = "angle "+(i+1);	
		var line ="line "+(i+1);
		t = sampleClosedSpline.addArcAndLine(t,effectController[bend]/90,effectController[line]/ww,effectController["bend radius"]/ww);	
		addedAngles+=effectController[bend];
	}
	
	effectController["extrusion_length"] = ""+(sampleClosedSpline.getLength()*ww);
	updateGuiControl(extrusionLengthGui);
	

	effectController["closing_angle"] = ""+(addedAngles % 360);
	updateGuiControl(closingAngleGui);

	var extrudeSettings = { bevelEnabled: false, steps: effectController["steps"], extrudePath: sampleClosedSpline }; // bevelSegments: 2, steps: 2 , bevelSegments: 5, bevelSize: 8, bevelThickness:5,

	var parent = new THREE.Object3D();
	g_client.scene.add(parent);
	
    for (var tt = 0; tt < g_profile.length; tt++) {
    	child = g_profile[tt];
    	
		var geometry = child.geometry;
	    if (geometry && child.material) {

			var shapes = [];

			var bbox = new THREE.Box3();
			bbox.setFromPoints( getOnlyUsedVertices(geometry) );			
			var offs = bbox.clone().min.add(bbox.max).divideScalar(2);
			var minToMax = bbox.clone().max.sub(bbox.min);
			var normal = new THREE.Vector3(1,0,0);
			if (minToMax.x<minToMax.y && minToMax.x<minToMax.z) {
				normal = new THREE.Vector3(1,0,0);
			} else
			if (minToMax.y<minToMax.x && minToMax.y<minToMax.z) {
				normal = new THREE.Vector3(0,1,0);
			} else
			if (minToMax.z<minToMax.x && minToMax.z<minToMax.y) {
				normal = new THREE.Vector3(0,0,1);
			}

	    	var vertices = getVerticesOfFaces(geometry);
	    	
			for ( var f = 0; f <vertices.length; f += 3 ) {
				var vectors = [vertices[f+0],vertices[f+1],vertices[f+2]];

				var inval = false;
				for ( var v = 0, vlen = vectors.length; v < vlen; v ++ ) {
					inval =  vectors[ v ].clone().sub(bbox.min).dot(normal)!=0;
					if (inval) break;
					var p = vectors[ v ].clone().sub(offs);
					if (normal.y==1)
						p = new THREE.Vector2(-p.x,p.z);
					if (normal.x==1)
						p = new THREE.Vector2(-p.y,-p.z);
					if (normal.z==1)
						p = new THREE.Vector2(-p.x,p.y);
					vectors[ v ] = p;

				};
				if (inval) continue;

				var shape = new THREE.Shape( );
				shape.moveTo( vectors[ 0 ].x, vectors[ 0 ].y );

				for ( var v = 1, vlen = vectors.length; v < vlen; v ++ ) {

					shape.lineTo( vectors[ v ].x, vectors[ v ].y );

				};
				
				shapes.push(shape);
			}				

			if (shapes.length>0) {
				var geometry = new THREE.ExtrudeGeometry(shapes, extrudeSettings);// this, options ) shape.extrude( extrudeSettings );	
				if (effectController.vertexnormals) geometry.computeVertexNormals(true);
				var mesh = new THREE.Mesh( geometry, child.material );				
//				mesh.position = child.position.clone();
//				mesh.rotation = child.rotation.clone();
//				mesh.quaternion = child.quaternion.clone();
//				mesh.scale = child.scale.clone();

				parent.add( mesh );
				g_client.objects.push(mesh);
				

				var suspensionCount = Math.ceil(sampleClosedSpline.getLength()*ww/effectController["suspension_distance"]);
				myLog("suspensionCount="+suspensionCount);
			    //var suspensionDistance = sampleClosedSpline.getLength()*ww/suspensionCount;
				bbox = getBoundingBoxOfTree(mesh);
			    for (var tt = 0; tt <= suspensionCount; tt++) {
			    	
			    	var delta = 0;
			    	if (tt==0) delta=1/suspensionCount/10;
			    	if (tt==suspensionCount) delta=-1/suspensionCount/10;
			    	var point = sampleClosedSpline.getPointAt(tt/suspensionCount+delta);			    	

					var rectLength = 0.004, rectWidth = 0.004;
					var rectShape = new THREE.Shape();
					rectShape.moveTo( -rectLength/2, -rectWidth/2 );
					rectShape.lineTo( -rectLength/2, rectWidth/2 );
					rectShape.lineTo( rectLength/2, rectWidth/2 );
					rectShape.lineTo( rectLength/2, -rectLength/2 );
					rectShape.lineTo( -rectLength/2, -rectLength/2 );
					
					geometry = rectShape.extrude( { amount: -effectController["suspension_length"]/ww,  bevelEnabled: false, bevelSegments: 2, steps: 1 } );	
					if (effectController.vertexnormals) geometry.computeVertexNormals(true);
					mesh = new THREE.Mesh( geometry, child.material );				
//					mesh.position = child.position.clone();
//					mesh.rotation = child.rotation.clone();
//					mesh.quaternion = child.quaternion.clone();
//					mesh.scale = child.scale.clone();
					mesh.rotation.x += THREE.Math.degToRad(90);
					mesh.position.y += bbox.max.y;
					mesh.position.add(point);
					parent.add( mesh );
					g_client.objects.push(mesh);
			    }
			}
			
		}
    }
    
    if (parent.children.length>0) {
    	g_client.scene.remove(g_client.root);
    	g_client.root=parent;
    	parent.updateMatrixWorld();
	    if (initialExtrusion) {
	    	locate(parent,g_client,10);
	    }
    } else 
    	g_client.scene.remove(parent);
    

	updateSelectableObjects(g_client);
	updateClient(g_client);
	
}

var regex = /[?&]([^=#]+)=([^&#]*)/g,
match;
while(match = regex.exec(document.URL)) {
	var val = match[2];
	overrideSettings[match[1]] = val;
}

function start() {
	
	if (getParameterByName(document.URL,"lat") && getParameterByName(document.URL,"lng") && getParameterByName(document.URL,"apikey")) {
		g_mapcenter = [Number(getParameterByName(document.URL,"lat")), Number(getParameterByName(document.URL,"lng"))];  
		g_mapapikey = getParameterByName(document.URL,"apikey");
		g_mapenabled = true;
	}
	
	
	effectController = {
			orthographic : g_ortho,
			wireframe : false,
			enable_maps : g_mapenabled,
			latitude : g_mapcenter ? g_mapcenter[0] : 0.0,
			longitude : g_mapcenter ? g_mapcenter[1] : 0.0,
			apikey : g_mapapikey || "enter a google maps api key here..",
			angle :   g_angle,
			geolocation :   false,
			fps : false,
			renderer_stats : false,
			
			// webgl_marching_cubes
			
			material: "shiny",

			hue: 0.0,
			saturation: 0.8,
			lightness: 0.1,

			lhue: 0.04,
			lsaturation: 0.0,
			llightness: 0.5,

			refraction: false,
			reflectOnMaterial: true,
			surroundings: true,
			
			nurbs_degree: 2,

			panning_mode: false,
			tree: false,
			log_on_screen: false,
			select_by_dblclick: false,
			select_by_mouseup: true,
			double_side_material: false,
			lazy_rendering: true,
			quickmode: true,
			antialias: true,
			vertexnormals: false,
			select_face: false,
			opencontrols: true,
			opencontrolsWidth:275,
			displaceGui:true,
			acceptablefps:2
		};

	for (var m in overrideSettings) {
		var val = overrideSettings[m];
		if (val=="true") val = true;
		if (val=="false") val = false;
		effectController[m]=overrideSettings[m]=val;
	}

	initializeMap();
	
	document.onkeydown = function(e) {
		if (e.target && e.target.tagName == "TEXTAREA") return;
		  var keyChar = e.keyCode;
		  if (!keyIsDown[keyChar]) {
			  keyIsDown[keyChar] = true;
			  motionByKeysAll();
			  if (!keyIsDown[key.SHIFT] && (keyChar==key.S || keyChar==key.W || keyChar==key.D || keyChar==key.A || keyChar==key.R)) {				  
				  	var g_client = g_clients[0];
				  	if (keyChar==key.S) toggleVisibility(g_client.root, "Space", g_client.hideSpaces = !g_client.hideSpaces);
				  	if (keyChar==key.W) toggleVisibility(g_client.root, "Wall", g_client.hideWalls = !g_client.hideWalls);
				  	if (keyChar==key.D) toggleVisibility(g_client.root, "Door", g_client.hideDoors = !g_client.hideDoors);
				  	if (keyChar==key.R) toggleVisibility(g_client.root, "", g_client.hideModel = !g_client.hideModel);
					updateClient(g_client);
			  }
			  if (keyIsDown[key.F] && keyIsDown[key.SHIFT]) {
				  fpsGui.setValue(!effectController.fps);
				  lazyRenderingGui.setValue(!effectController.fps);
			  }
			  if (keyIsDown[key.T] && keyIsDown[key.SHIFT]) {
				  effectController[ "ThreeInspector" ]();
			  }
			  if (keyIsDown[key.R] && keyIsDown[key.SHIFT]) {
				  effectController[ "threex.rendererstats" ]();
			  }
		  }
		  if (keyChar==key.PLUS) {		
			  if (g_mapenabled) {
				  g_map.setZoom(g_map.getZoom()+1);			  
			  }		  
		  }
		  if (keyChar==key.MINUS) {		
			  if (g_mapenabled) {
				  g_map.setZoom(g_map.getZoom()-1);			  
			  }		  
		  }
		  if (keyChar==key.I || keyChar==key.O) {		
			  	g_angle = g_angle + (keyChar==key.I ? 1 :-1);		  
			  	var g_client = g_clients[0];
				updateProjection(g_client);
				updateClient(g_client);
		  }
		  if (keyChar==key.B) {
			  var cam = g_cameraHistory.pop();
			  if (cam!=null) {
				  doSetCamera(cam[0],cam[1],cam[2],cam[3],cam[4],cam[5]);
				  g_cameraHistory.pop();
			  }
		  }
		  if (keyChar==key.ESCAPE && g_selectedInfo.length>=1 && (g_selectedInfo[0].originalParent || g_selectedInfo[0].parent)) {
			  select([g_selectedInfo[0].originalParent || g_selectedInfo[0].parent],g_clients[0]);
			  updateClient(g_clients[0]);
		  }
		};
		document.onkeyup = function(e) {
		  var keyChar = e.keyCode;
		  keyIsDown[keyChar] = false;
		};
	
	calcPaths();
	
	container = document.getElementById('clients');
	
	if ( ! Detector.webgl ) { Detector.addGetWebGLMessage(); return; }

    	projector = new THREE.Projector();    	
    	window.addEventListener( 'resize', onWindowResize, false );
    	mouse = new THREE.Vector2();
    	up = new THREE.Vector3( 0, 1, 0 );
		
    	var requiredThreeJS = doJsonLoader ? [] : doCollada ? [g_dir+"js/loaders/ColladaLoader.js"] : doGLTF ? [g_dir+"js/loaders/gltf/glTF-parser.js",g_dir+"js/loaders/gltf/glTFLoader.js",g_dir+"js/loaders/gltf/glTFLoaderUtils.js",g_dir+"js/loaders/gltf/glTFAnimation.js"] : [g_dir+"js/loaders/OBJLoader.js"];
//    	requiredThreeJS.push(g_dir+"js/controls/OrbitControls.js");
//    	requiredThreeJS.push(g_dir+"js/curves/NURBSUtils.js");
//    	requiredThreeJS.push(g_dir+"js/curves/NURBSCurve.js");
//    	requiredThreeJS.push(g_dir+"js/BufferGeometryUtils.js");
//    	if (g_renderer == "software") {
//        	requiredThreeJS.push(g_dir+"js/renderers/SoftwareRenderer.js");
//    	} else if (g_renderer == "svg") {
//        	requiredThreeJS.push(g_dir+"js/renderers/SVGRenderer.js");
//    	} else if (g_renderer == "css") {
//        	requiredThreeJS.push(g_dir+"js/renderers/CSS3DRenderer.js");
//    	} else if (g_renderer == "webgldeferred") {
//        	requiredThreeJS.push(g_dir+"js/renderers/WebGLDeferredRenderer.js");
//    	}
//    	
        require(requiredThreeJS, function () {
        	buildTable();
            for (var ii = 0; ii < g_num_clients; ++ii) {
            	load(ii);
            }
        });

}

var barLog="";
var barMilliseconds=0;
var barMillisecondsAt0Percent=0;

function drawBar(percent,message) {		
	document.getElementById('message').innerHTML = message;
	var bar = document.getElementById('bar');
	var x = Math.floor( 250 * percent );
	bar.style.width = x + "px";
	var p = Math.floor( 100 * percent );
	var s = message+" to "+p+"%";
	if (s!=barLog) {
		var m = new Date().getTime();
		if (p==0) {
			barMillisecondsAt0Percent = m;			
		}
		myLog((barLog=s)+(barMilliseconds?" "+(m-barMilliseconds)+"ms":""));
		barMilliseconds = m;
		if (p==100) {
			myLog(message+" took totally "+(m-barMillisecondsAt0Percent)+"ms");
		}
	}
//	var ctx=bar.getContext("2d");
//	ctx.fillStyle = 'yellow';
//	ctx.fillRect(0,0,bar.offsetWidth,50);
//	var w = Math.floor( bar.offsetWidth * percent );
//	ctx.fillStyle = 'red';
//	ctx.fillRect(0,0,w,50);
	
}

var startTime;
var allGeometries = 0;
var waitForBar = 1;

function hasVertexNormals(geometry) {
	if (geometry.attributes) {
		
		if (!geometry.attributes.normal) 
			return false;

		for ( i = 0, il = geometry.attributes[ "normal" ].array.length; i < il; i ++ ) {

			if (geometry.attributes[ "normal" ].array[ i ] != 0) return true;

		}

		return false;
	}
	return geometry.faces && geometry.faces.length>0 && geometry.faces[0].vertexNormals.length>0;
}

var initStatics = function() {

    if (effectController.quickmode) {
    	
    THREE.Geometry.prototype.computeCentroids = function () {

		var f, fl, face;

		for ( f = 0, fl = this.faces.length; f < fl; f ++ ) {

			face = this.faces[ f ];
			face.geometry = this;

		}

	};


	THREE.Geometry.prototype.computeFaceNormals = function () {
	};

	THREE.Geometry.prototype.computeBoundingSphere = function () {
		
		if (isInParse) return;

		if ( this.boundingSphere === null ) {

			this.boundingSphere = new THREE.Sphere();

		}

		this.boundingSphere.setFromPoints( getOnlyUsedVertices(this) );

	};

	Object.defineProperty(THREE.Face3.prototype, "centroid", {
	    get: function() {
	    	var centroid = new THREE.Vector3();
	    	if (this.geometry) {
				centroid.add( this.geometry.vertices[ this.a ] );
				centroid.add( this.geometry.vertices[ this.b ] );
				centroid.add( this.geometry.vertices[ this.c ] );
				centroid.divideScalar( 3 );
	    	}
			return centroid; 
	    },
	    set: function(y) {
	    }
	});

	// speed: dont store a name
	Object.defineProperty(THREE.BufferGeometry.prototype, "name", {
	    get: function() {
			return null; 
	    },
	    set: function(y) {
	    }
	});

	// speed: dont store a uuid
	Object.defineProperty(THREE.BufferGeometry.prototype, "uuid", {
	    get: function() {
			return null; 
	    },
	    set: function(y) {
	    }
	});	

	Object.defineProperty(THREE.Face3.prototype, "normal", {
	    get: function() {
	    	if (this.geometry) {

				var cb = new THREE.Vector3();
				var ab = new THREE.Vector3();

				var vA = this.geometry.vertices[ this.a ];
				var vB = this.geometry.vertices[ this.b ];
				var vC = this.geometry.vertices[ this.c ];

				cb.subVectors( vC, vB );
				ab.subVectors( vA, vB );
				cb.cross( ab );

				cb.normalize();

				return cb;
	    	}
			return new THREE.Vector3(); 
	    },
	    set: function(y) { 
	    }
	});
	
    }
    
	THREE.BufferGeometryUtils.assureMeshWithNoBufferGeometry = function ( mesh ) {

		if ( mesh.geometry instanceof THREE.Geometry ) {

			return mesh;

		}
		
		mesh = mesh.clone();
		mesh.matrix.copy(mesh.matrixWorld); // has no parents
		mesh.geometry = THREE.BufferGeometryUtils.assureNoBufferGeometry(mesh.geometry);
		
		return mesh;
	};
	
	function addVertex(vertices, vertex) {
		for (var  i=0; i<vertices.length; i++) {
			if (vertices[i].equals(vertex))
				return i;
		}
		vertices.push(vertex);
		return vertices.length-1;		
	}

	THREE.BufferGeometryUtils.assureNoBufferGeometry = function ( geometry ) {

		if ( geometry instanceof THREE.Geometry ) {

			return geometry;

		}

    	var faces = [];

		var vertices = getOnlyUsedVertices(geometry);
		var result = new THREE.Geometry();

		for ( var i = 0, il = vertices.length; i < il; i += 3 ) {	
			faces.push(new THREE.Face3(addVertex(result.vertices, vertices[i]), addVertex(result.vertices, vertices[i+1]), addVertex(result.vertices, vertices[i+2])));			
		}
		
		result.faces = faces;
		result.computeCentroids();
		result.computeFaceNormals();
		if (effectController.vertexnormals)
			result.computeVertexNormals(true);
		
		return result; 
		
	};

	
    THREE.SceneLoader.prototype.load2 = function ( url, onLoad, onProgress, onError ) {

    		var scope = this;

    		var loader = new THREE.XHRLoader( scope.manager );
    		loader.setCrossOrigin( this.crossOrigin );
    		loader.load( url, function ( text ) {
    			document.getElementById('progressbar').style.display = "none";
    			drawBar(0,"Parsing Json ...");
        		setTimeout(function(){
    			var json = JSON.parse( text );
    			if (json.errorMessage) {
    				$("#progress").html(json.errorMessage);
    				return;
    			}
    			drawBar(0,"Building Scene ...");
        		setTimeout(function(){
    			allGeometries = json.metadata.geometries;
    			scope.parse( json, onLoad, url );
        		},waitForBar);
        		},waitForBar);
    		}, onProgress/*!!*/, onError );

    };

    THREE.JSONLoader2 = function ( showStatus ) {

    	THREE.JSONLoader.call( this, showStatus );
    	
    	this.oldparse = this.parse;
    	
    	this.parse = function ( json, texturePath ) {
    		isInParse = true;
        	this.numGeometries = this.numGeometries || 0;
        	this.numGeometries = this.numGeometries + 1;

        	if (allGeometries)
        		drawBar (this.numGeometries/allGeometries,"Building geometry ...");
    		
        	var result = this.oldparse(json,texturePath);
        	if (effectController.vertexnormals)
        		result.geometry.computeVertexNormals(true);
        	if (USE_BUFFERGEOMETRY && g_renderer == "webgl") {
	        	var bufferGeometry = THREE.BufferGeometryUtils.fromGeometry( result.geometry );
	        	if (effectController.vertexnormals && !hasVertexNormals(result.geometry)) bufferGeometry.computeVertexNormals();
	        	result.geometry = bufferGeometry;
        	}
        	isInParse = false;
        	return result;
        };

    };

    THREE.JSONLoader2.prototype = Object.create( THREE.JSONLoader.prototype );
    
};

function prepareMisc(g_client) {
        	if (effectController.quickmode) melt(g_client);
    		if (effectController.selection) select(getObjectsWithSplittings(effectController.selection.split(",")),g_client);
    		if (effectController.locate) locate(g_selectedInfo,g_client,1);
}


function load(ii) {
    if (initStatics) {
    	initStatics();
	    initStatics = null;
	}
	load2(ii);
}

function afterLoad(root,g_client) {
	drawBar(0,"Customizing Scene ...");	
	setTimeout(function(){
	init(root,g_client);
	drawBar(0,"Preparing Geometry ...");	
	setTimeout(function(){
	generateGui();
	prepareMisc(g_client);
	drawBar(0,"Rendering WebGL ...");	
	setTimeout(function(){
	animate(g_client);		
	document.getElementById('progress').style.display = "none";
	drawBar(0,"Finished!");
    if (g_fullyLoaded) g_fullyLoaded();
    installRendererEvents(g_client);
	},waitForBar);
	},waitForBar);
	},waitForBar);	
}

function load2(ii) {
	g_clients[ii].invalidated = true;
	g_pickInfoElem = document.getElementById('pickInfo');
    console.log("Loading: " + g_paths[ii]);
    try {
    startTime = new Date().getTime(); 
    if (doJsonLoader) {
		document.getElementById('progress').style.display = "block";
		drawBar(0,"Start");	
    	var loader = new THREE.SceneLoader();
    	loader.addGeometryHandler( "ascii", THREE.JSONLoader2 );
    	loader.load2( g_paths[ii], function ( result ) {
    		afterLoad(result.scene,g_clients[ii]);
    	}, function ( event ) {
			drawBar(event.total ? event.loaded / event.total : 0, "Loading ..." );
    	}, function ( event ) { 
    		drawBar(0,"Error occured! "+event);    		
    	} );
    } else
	if (doCollada) {
    	var loader = new THREE.ColladaLoader();
    	loader.options.convertUpAxis = true;
    	loader.load( g_paths[ii], function ( result ) {
    		var root = result.scene.children[result.scene.children.length-1];
    		afterLoad(root,g_clients[ii]);
    	} );
	} else 
	if (doGLTF) {
    	var loader = new THREE.glTFLoader();
    	var index = g_paths[ii].lastIndexOf("scene.");
    	loader.load( g_paths[ii].substring(0,index)+"/"+g_paths[ii].substr(index), function ( result ) {
    		var root = result.scene.children[result.scene.children.length-1];
    	    root.rotation.x += -Math.PI/2 ;
    	    root.updateMatrix();
    		effectController.quickmode = false; // this mode not works
    	    afterLoad(root,g_clients[ii]);
    	} );
	} else {
		var loader = new THREE.OBJLoader();

    	loader.load( g_paths[ii], function ( object ) {	
	        var g_client = g_clients[ii];
    		init(object,g_client);
    		animate(g_client);		
    	} );
	}
    } catch (e) {
        console.log("loading failed : " + e);
    }
}

// follow up https://github.com/ironbane/IronbaneServer/issues/123
function automaticUnwrapping(geometry,deltaX,deltaY) {

    var uvA = new THREE.Vector2( 0, 0 );
    var uvB = new THREE.Vector2( 0, 0 );
    var uvC = new THREE.Vector2( 0, 0 );
    
	var vertices = getVerticesOfFaces(geometry);
	

	var uvs = null;
	if (geometry instanceof THREE.BufferGeometry) {
		geometry.attributes.uv = {
			itemSize: 2,
			array: new Float32Array( vertices.length * 2 )
		};
	
		uvs = geometry.attributes.uv.array;
	}
	
	for ( var f = 0; f <vertices.length; f += 3 ) {
		
	    var va = vertices[ f+0 ];
		var v1 = vertices[ f+1 ].clone().sub(va);
		var v2 = vertices[ f+2 ].clone().sub(va);
		var angle =v1.angleTo(v2);
			
	    var vtx = va;
	    uvA.set( vtx.x / deltaX , vtx.z / deltaY  );

	    vtx = vertices[ f+1 ];
	    var distance = vtx.distanceTo(va);
	    uvB.set( distance / deltaX, 0 ).add(uvA);

	    vtx = vertices[ f+2 ];
	    distance = vtx.distanceTo(va);
	    uvC.set( distance*Math.cos(angle) / deltaX, distance*Math.sin(angle) / deltaY ).add(uvA);

	    if (uvs) {
	    	uvs[f*2+0] = uvA.x;
	    	uvs[f*2+1] = uvA.y;
	    	uvs[f*2+2] = uvB.x;
	    	uvs[f*2+3] = uvB.y;
	    	uvs[f*2+4] = uvC.x;
	    	uvs[f*2+5] = uvC.y;
	    } else 
	    	geometry.faceVertexUvs[0].push( [ uvA.clone(), uvB.clone(), uvC.clone() ] );


	}
}

function updateColors (g_client) {

	for(var key in g_visibility) {
    	var material = g_client.g_colors[key];
    	material.visible = (g_visibility[key]==true) && (!material.baseMaterialName || g_visibility[material.baseMaterialName]!=false);
    }

	updateSelectableObjects(g_client);
}


function updateSelectableObjects (g_client) {
	if (effectController.quickmode && g_client.objects) return;
    g_client.objects = [];
    addSelectableObjects(g_client,g_client.root);
    for (var tt = 0; tt < g_client.additionalObjectsToSelect.length; tt++) {
        g_client.objects.push(g_client.additionalObjectsToSelect[tt]);
    }
    
    if (!useOctree) return;

	octree = new THREE.Octree( {
		// uncomment below to see the octree (may kill the fps)
		//scene: scene,
		// when undeferred = true, objects are inserted immediately
		// instead of being deferred until next octree.update() call
		// this may decrease performance as it forces a matrix update
		undeferred: false,
		// set the max depth of tree
		depthMax: Infinity,
		// max number of objects before nodes split or merge
		objectsThreshold: 8,
		// percent between 0 and 1 that nodes will overlap each other
		// helps insert objects that lie over more than one node
		overlapPct: 0.15
	} );
	
    g_client.objects.forEach( function (object) { octree.add(object, { useFaces: false }); } );
}

function addSelectableObjects (g_client,parent) {
	parent.traverse(function (child) {    			    
		if ( child.geometry && child.visible && !(effectController.inactive_spaces && child.material && child.material.name == "Space")) {   
			g_client.objects.push( child );
		}
    });
}

function init(root,g_client) {

	//http://www.cs.mtu.edu/~shene/COURSES/cs3621/NOTES/spline/NURBS/NURBS-knot-insert.html
	//http://www.cs.mtu.edu/~shene/COURSES/cs3621/NOTES/spline/NURBS-knot-insert.html


	THREE.NURBSCurve.prototype.addKnot = function ( t ) {

		var u = this.knots[0] + t * (this.knots[this.knots.length - 1] - this.knots[0]); // linear mapping t->u
		var k = THREE.NURBSUtils.findSpan(this.degree, u, this.knots);
		var newPoints = [];

		for (var i = k - this.degree + 1; i <= k; ++i) {
			var a =  (u - this.knots[i]) / (this.knots[i + this.degree] - this.knots[i]);
			var q = this.controlPoints[i-1].clone().projectTo4D().multiplyScalar(1-a).add(
				this.controlPoints[i  ].clone().projectTo4D().multiplyScalar(  a)).projectTo3D();
			newPoints.push(q);
		}

		this.controlPoints = this.controlPoints.slice(0,k - this.degree + 1).concat(newPoints).concat(this.controlPoints.slice(k));

		this.knots.splice(k+1, 0, u);
	};


	THREE.NURBSCurve.prototype.removeLastPoint = function ( ) {
		this.controlPoints = this.controlPoints.slice(0,this.controlPoints.length-1);
		this.knots = this.knots.slice(0,this.knots.length-3);
		var last = this.knots[this.knots.length-1];
		this.knots.push(last);
		this.knots.push(last);
	};


	THREE.NURBSCurve.prototype.getLastKnot = function ( ) {
		return this.knots[this.knots.length-1];
	};

	THREE.NURBSCurve.prototype.addPoint = function ( point, la ) {
		if (!point.w) point = new THREE.Vector4(point.x,point.y,point.z,1);
		this.controlPoints.push(point);
		// knot vector xyyy => xyzzz
		var last = la || (this.knots[this.knots.length-1]+1);
		this.knots = this.knots.slice(0,this.knots.length-2);
		this.knots.push(last);
		this.knots.push(last);
		this.knots.push(last);
	};

	THREE.NURBSCurve.prototype.addArcAndLine = function ( direction, percentageOfQuarter, lineLength, radius) {

		// build up quarter arc
		var point = this.controlPoints[this.controlPoints.length-1];
		if (point.w)
			point = point.clone().divideScalar(point.w);
		// y-z plane
//		var vertical1 = new THREE.Vector3(direction.x,direction.z,-direction.y);
//		var vertical2 = new THREE.Vector3(direction.x,-direction.z,direction.y);
		// x-y plane
//		var vertical1 = new THREE.Vector3(direction.y,-direction.x,direction.z);
//		var vertical2 = new THREE.Vector3(-direction.y,direction.x,direction.z);
		// x-z plane
		var vertical1 = new THREE.Vector3( direction.z, direction.y,-direction.x);
		var vertical2 = new THREE.Vector3(-direction.z, direction.y, direction.x);
		var p1 = point.clone().add(direction.clone().multiplyScalar(radius));
		var p2 = point.clone().add(direction.clone().multiplyScalar(radius).add((percentageOfQuarter>0?vertical2:vertical1).clone().multiplyScalar(radius)));		
		var lastKnot = this.getLastKnot();
		this.addPoint(new THREE.Vector4(p1.x,p1.y,p1.z,Math.sqrt(2)/2),lastKnot);
		this.addPoint(p2,lastKnot+1);

		// split quarter arc at percentageOfQuarter and draw a straight line from that point
		percentageOfQuarter = Math.max(percentageOfQuarter,-percentageOfQuarter);
		var quarterCurve;
		var t;
		var pc;
		var useExactParametrization = true;
		if (useExactParametrization) {
			quarterCurve = new THREE.NURBSCurve(2, [0,0,0,1,1,1], this.controlPoints.slice(this.controlPoints.length-3,this.controlPoints.length));
			t = quarterCurve.getUtoTmapping(percentageOfQuarter);
			pc = ((lastKnot+t) - this.knots[0])/(this.knots[this.knots.length - 1] - this.knots[0]);
		} else {
			quarterCurve = this;
			t = ((lastKnot+percentageOfQuarter) - this.knots[0])/(this.knots[this.knots.length - 1] - this.knots[0]);
			pc = t;
		}
		var tangent = quarterCurve.getTangent(t);
		var x = quarterCurve.getPoint(t);
		point = x.clone().add( tangent.clone().multiplyScalar(lineLength));
		if (percentageOfQuarter==1) {
			lastKnot = this.getLastKnot();
			this.addPoint(x,lastKnot);		
			lastKnot += 1;
		} else {
			this.addKnot(pc);
			lastKnot = this.getLastKnot();
			this.removeLastPoint();
		}
		this.addPoint(point,lastKnot);
		
		return tangent;
	};
	
	THREE.Vector4.prototype.projectTo4D = function (  ) {
		var scalar = this.w;
		this.x *= scalar;
		this.y *= scalar;
		this.z *= scalar;
		return this;
	};

	THREE.Vector4.prototype.projectTo3D = function (  ) {
		var invScalar = 1 / this.w;
		this.x *= invScalar;
		this.y *= invScalar;
		this.z *= invScalar;
		return this;
	};

	var loadingComplete = false;
	myLog("Model load time="+(new Date().getTime() - startTime));
	startTime = new Date().getTime();
	try{
    
	if (!g_client.controls) {
    g_client.controls = new THREE.OrbitControls( new THREE.PerspectiveCamera( 90, 1, 0.01, 2000000 ), g_client );
    g_client.controls.oriUpdate = g_client.controls.update;
    g_client.controls.update = function () {if (this.active) this.oriUpdate(); };
    g_client.controls.noPan = true;
    g_client.controls.active = true;
    g_client.additionalObjectsToSelect = [];
	}
    
    var scene;
    if (root instanceof THREE.Scene) {
    	if (g_client.scene) {
    		while (g_client.scene.children.length>0) {
    	    	g_client.scene.remove(g_client.scene.children[0]);
    	    }
    		g_client.scene.add(root = root.children[0]);
    		scene = g_client.scene;
    	} else {
	    	scene = g_client.scene = root;
	    	root = root.children[0];
    	}
//	    scene = g_client.scene = new THREE.Scene();
//	    scene.add( root );	
//	    root.rotation.x += -Math.PI / 2;
//	    root.quaternion.setFromEuler(root.rotation);
    } else {
	    scene = g_client.scene = new THREE.Scene();
	    scene.add( root );	
    }
	
    g_client.root = root;
    window["scene"] = scene;
	//scene.fog = new THREE.Fog( 0x000000, 1500, 2100 );

	
	if (getParameterByName(document.URL,"rotation")) g_client.root.rotation.y = THREE.Math.degToRad(Number(getParameterByName(document.URL,"rotation")));	
	if (getParameterByName(document.URL,"angle")) g_angle = Number(getParameterByName(document.URL,"angle"));	
	if (getParameterByName(document.URL,"orthographic")) g_ortho = "true"==getParameterByName(document.URL,"orthographic");	
	
	
	//	root.scale.x = root.scale.y = root.scale.z = 1/g_colladaUnit;
	scene.updateMatrixWorld();	
    for (var tt = 0; tt < g_client.scene.children.length; tt++) {
    	var child = g_client.scene.children[tt];
    	if (child.matrix) {
    		child.matrixWorld.decompose( child.position, child.quaternion, child.scale );
    		if (g_client.scene.children.length==1)
    			child.position.set(0,0,0); // fix for buildings who are 30km away from point zero!
    	}
    }
	g_client.scene.position.set(0,0,0);
	g_client.scene.rotation.set(0,0,0) ;
	g_client.scene.scale.set(1,1,1); 
	g_client.scene.updateMatrix();
	g_client.scene.updateMatrixWorld();
	g_client.scene.traverse(function (child) { 
		if ( child.matrixAutoUpdate === true ) 
			child.matrixAutoUpdate = false;
	});
	g_client.scene.autoUpdate = false;
	
	var hasSomething = locate(g_client.root,g_client,1);
	if (effectController.eye && effectController.target)
	    doSetCamera(asVector3M(StrToIntArray(effectController.eye.split(","))),asVector3M(StrToIntArray(effectController.target.split(","))),g_angle,null,1,g_client);

    var toDelete = [];
	scene.traverse(function (child) { 
		if (child instanceof THREE.Camera || child instanceof THREE.Light)
			toDelete.push(child);
	});
    for (var tt = 0; tt < toDelete.length; tt++) {
    	toDelete[tt].parent.remove(toDelete[tt]);
    }

	// Lights

	light = new THREE.DirectionalLight( 0xffffff );
	light.position.set( 0.5, 0.5, 1 );
	g_client.directionalLight = light;
	scene.add( light );			
	light.updateMatrixWorld();	

	ambientLight = new THREE.AmbientLight( 0x080808 );
	scene.add( ambientLight );
	
	setClientSize(g_client);

    g_finished = true;  // for selenium
	g_client.root.traverse(function (child) { 
    	var comps = child.name.split(",");
    	var hasMaximumNameLength = child.name.length == 63;
    	if (comps.length==3) {
    		child.uuid = comps[0];
    		if (comps[2].indexOf("Ifc")==0) {
    			// deprecated geometry file
        		child.storedMaterialName = truncatedMaterialName(comps[2]);
        		child.name = comps[1];
    		} else {
	    		child.storedMaterialName = truncatedMaterialName(comps[1]);
	    		child.name = comps[2];
    		}
    	} else
    	if (comps.length==2) {
    		child.uuid = comps[0];
    		child.name = comps[1];
    	}
    	if (hasMaximumNameLength)
    		child.name += "..";
    });
    if (g_customInit) g_customInit();
    defaultScheme = null;
	for (var m in g_colors) {
		if (g_colors[m].isDefaultColorScheme) {
			defaultScheme = m;
		}
	}
	if (defaultScheme) {
		g_colorSchemes = g_colors;
		g_colors = g_colors[defaultScheme];
	} else {
		defaultScheme = "default";
		g_colorSchemes = { };
		g_colorSchemes[defaultScheme] = g_colors;
	}
    setupColors(g_client,true);
	g_client.root.traverse(function (child) { 
    	child.visible = true; //non-meshes are not visible by default, but required to be visible for canvas renderer
    });
    updateColors(g_client);
    optimizeMem(g_client);
    initializeMap();

	var plane = g_client.plane = new THREE.Mesh( new THREE.PlaneGeometry( 1000000, 1000000, 1, 1 ), new THREE.MeshBasicMaterial( { color: 0x000000, opacity: 0.25, transparent: true, side: THREE.DoubleSide} ) );
	plane.name = "intersection plane";
	plane.visible = false;
	plane.lookAt( up );
	//scene.add( plane );
	
	if (!hasSomething)
		 console.log("Found no solid geometry");

    loadingComplete = true;
    //} catch (e) {
	} finally {
		if (!loadingComplete) myLog("loading failed after retrieving model successful");
		myLog("Model setup time="+(new Date().getTime() - startTime));
    //    throw e;
    }
}

function setupUVs(mesh) {
	var geometry = mesh.geometry;
	var material = mesh.material;
	if (material && geometry) {	
		var hasTexture = (material.map!=null);
		if (material instanceof THREE.MeshFaceMaterial) {
			for (var i=0; i<material.materials.length; i++) {
				if (material.materials[i].map) {
					hasTexture = true;
				}
			}
		}
		if (!hasTexture) return;
		if (!(geometry.faceVertexUvs && geometry.faceVertexUvs[0].length>0 || geometry.attributes && geometry.attributes.uv))
			automaticUnwrapping(geometry,0.1*1,0.1*1);
//							if (geometry.faceVertexUvs[0].length==0 && geometry.boundingBox && !geometry.boundingBox.empty() && materialColor.map.image.width!=null &&  materialColor.map.image.width>0 )
//								automaticUnwrapping(geometry,0.1*1,0.1*materialColor.map.image.height/materialColor.map.image.width);
		geometry.buffersNeedUpdate = true;
		geometry.uvsNeedUpdate = true;							
	}
}

function setupColors(g_client,updateVisibilityArray) {

	for (var m in g_colors) {
//			var color = g_colors[m];
//			if (color.length == 4) {
//			color[0] = color[0]*255;
//			color[1] = color[1]*255;
//			color[2] = color[2]*255;
//			}

		var materialColor = g_colors[m];
		if (!materialColor.uuid)
		if (materialColor instanceof Array) {
			materialColor = g_colors[m] = new THREE.MeshPhongMaterial({	
				color:new THREE.Color().setRGB(materialColor[0],materialColor[1],materialColor[2]), 
				opacity : materialColor[3],
				transparent : materialColor[3]!=1
			});
		} else if (!materialColor.map) {
			materialColor = g_colors[m] = new THREE.MeshPhongMaterial(materialColor);
		} else {
			if (materialColor.map.indexOf("http:")==-1)
				materialColor.map = g_path.substring(0,g_path.indexOf("&filename=")) + "&filename=" + materialColor.map;
    		var texture = THREE.ImageUtils.loadTexture( materialColor.map, function() {alert("Could not load texture of material!");}, updateClients );
    		texture.wrapS = texture.wrapT = THREE.RepeatWrapping;
    		materialColor = g_colors[m] = new THREE.MeshPhongMaterial({map: texture });
		}
		if (materialColor.side == THREE.DoubleSide && isIE11)
			materialColor.side = THREE.FrontSide;
		
		var opacity = effectController.opacity;
		if (materialColor.opacity!=0 && opacity) {
			materialColor.opacity = Number.parseFloat(opacity);
		}
		opacity = effectController["opacity."+m];
		if (opacity) {
			materialColor.opacity = Number.parseFloat(opacity);
		}
		materialColor.transparent = materialColor.opacity<1;

		if (materialColor.transparent) {
			materialColor.depthWrite = false;

			//http://www.openglsuperbible.com/2013/08/20/is-order-independent-transparency-really-necessary	
			
//			/* multiplicative blending */
//			materialColor.blending = THREE.CustomBlending;
//			materialColor.blendSrc = THREE.ZeroFactor;
//			materialColor.blendDst = THREE.SrcColorFactor;
//			materialColor.color.lerp(new THREE.Color().setRGB(1, 1, 1),1-materialColor.opacity);
//			materialColor.opacity = 1;
//			
//
//			/* additive blending */
//			materialColor.blending = THREE.CustomBlending;
//			materialColor.blendSrc = THREE.SrcAlphaFactor;
//			materialColor.blendDst = THREE.OneFactor;
//			materialColor.color.lerp(new THREE.Color().setRGB(0, 0, 0),1-materialColor.opacity);
//			materialColor.opacity = 1;
			
		}
		materialColor.shininess = 0;
		materialColor.name = m;
	}
	if (g_clients.length>=2) {
		g_client.g_colors = {};
		for (m in g_colors) {
			g_client.g_colors[m] = g_colors[m].clone();
		}
	} else {
		g_client.g_colors = g_colors;		
	}
	g_client.root.traverse(function (child) { 
		if (child.name && child.name.indexOf("__")!=-1)
			child.name = child.name.substring(0,child.name.indexOf("__")); // OBJLoader		
		var material = child.material;
	    if (material) {
	    	if (material.name) {
				var materialName = /*child.customMaterialName || */material.name;
				if (materialName && materialName.lastIndexOf("-material")!=-1)
					materialName = materialName.substring(0,materialName.lastIndexOf("-material"));
				material = g_client.g_colors[materialName];
		        if (!material && materialName.length>3) {
		        	var materialNameShortened = materialName.substring(3);
		        	if (material = g_client.g_colors[materialNameShortened])
		        		materialName = materialNameShortened;
		        }
		        if (!material) {
		        	child.material.name = materialName;	
		        	g_client.g_colors[materialName] = material = child.material;
		        }
		        if (material) {
					child.material = material;
			        if (child.uuid && child.uuid.indexOf("_",1)>=2) {
			        	var materialName2 = child.uuid.substring(child.uuid.indexOf("_",1));
			        	var material2 = g_client.g_colors[materialName2];
			        	if (material2 && material2!=material) {
			        		material2.baseMaterialName = child.material.name;
							child.material = material = material2;
							if (updateVisibilityArray) g_visibility[material2.baseMaterialName] = material2.visible;
			        	}
			        }					
			        setupUVs(child);
					if (updateVisibilityArray) g_visibility[material.name] = material.visible;
		        }
	    	}
		}; 
		
		
	});
	
}

function getThreejsTypeName(obj) {
	var toLog = null;
	for (var c in THREE) {
		try {
			if (obj instanceof THREE[c]) {
					toLog = c;				
			}
		} catch (e) {				
		}
	}
	return ""+toLog;
}

function updateClients() {
	g_clients.forEach(function (g_client) {
		updateClient(g_client);
	});
}

function updateClient(g_client, lazy) {
	if (!lazy) {
		g_client.renderer.sortObjects=  true;
		g_client.renderer.autoUpdateObjects=  true;
	}
	if (g_client.invalidated) return;
	g_client.invalidated = true;
	if (lazy) {
//		g_client.renderer.sortObjects=  false;
		g_client.renderer.autoUpdateObjects=  false;
	}
	if (disableRendering) return;
	requestAnimationFrame( function() { animate(g_client); } );
}

function animate(g_client) {
	render(g_client);
	if (stats) stats.update();
	if (rendererStats) rendererStats.update(g_client.renderer);
}

function render(g_client) {
	var updateClientStart=new Date().getTime();
	if (g_client.controls.active) g_client.controls.update();
	else {
		enableOrbit(true,g_client);
		enableOrbit(false,g_client);
	}
	updateProjection(g_client);
	if (g_client.scene2 || sceneCube) {
		g_client.renderer.autoClear = false;	
		g_client.renderer.clear();	
	}
	if (sceneCube) {
		var aspect = g_client.parentNode.offsetWidth / g_client.parentNode.offsetHeight;
		var cameraCube = new THREE.PerspectiveCamera( g_angle, aspect, 1, 100000 );
		cameraCube.rotation.copy( g_client.g_camera.rotation );
		g_client.renderer.render( sceneCube, cameraCube );
	}
	
	var lavaMaterial = incidentMaterials["fire"];
	if (lavaMaterial) {
		
		lavaMaterial.clock = lavaMaterial.clock || new THREE.Clock();		

		var delta = 4 * 5 * lavaMaterial.clock.getDelta();

		lavaMaterial.uniforms.time.value += 0.2 * delta;


	}
	
	var camera = g_client.g_camera;
	if (g_client.directionalLight) {
		g_client.directionalLight.position.copy(camera.eye.clone().sub(camera.target).normalize());
		g_client.directionalLight.updateMatrixWorld();	
	}
	g_client.renderer.render( g_client.scene, camera );
	
	if (g_client.scene2!=null) {
		g_client.renderer.clearDepth();
		g_client.renderer.render( g_client.scene2, camera );
	}
	
	if (g_client.additionalCamera) {
//		g_client.renderer.autoClear = false;
		var camera = g_client.additionalCamera;
		if (g_client.directionalLight) {
			g_client.directionalLight.position.copy(camera.eye.clone().sub(camera.target).normalize());
			g_client.directionalLight.updateMatrixWorld();	
		}
		var w = Math.min(g_client.parentNode.offsetWidth/4,g_client.parentNode.offsetHeight/4);
		camLeft = Math.round(w/2);
		camBottom = Math.round(w/2);
		if (camera.aspect<=1) {
			camWidth = Math.round(w*2*camera.aspect);
			camHeight = Math.round(w*2);
		} else {
			camWidth = Math.round(w*2);
			camHeight = Math.round(w*2/camera.aspect);
		}
		g_client.renderer.setViewport(camLeft, camBottom, camWidth, camHeight);	
		g_client.renderer.setScissor (camLeft, camBottom, camWidth, camHeight );	
		g_client.renderer.enableScissorTest ( true );
		g_client.renderer.render( g_client.scene, camera );	
		g_client.renderer.setViewport( undefined, undefined, undefined, undefined );	
		g_client.renderer.enableScissorTest ( false );
	}

	g_client.invalidated=false;
	g_client.renderer.sortObjects=  true;
	g_client.renderer.autoUpdateObjects=  true;

	motionByKeys(g_client);
	g_updateClientTime=new Date().getTime() - updateClientStart;

	framesCount+=1;
	var testFpsAt = 2;
	if (framesCount==testFpsAt) {
		startedTestFps = new Date().getTime();
	}
	var stoppedTestFps = new Date().getTime();
	
	if (startedTestFps!=null && (stoppedTestFps-startedTestFps)>=1000) {
		testFps = (framesCount-testFpsAt)*1000/(stoppedTestFps-startedTestFps);
		console.log("testFps="+testFps);
		startedTestFps = null;
		if (testFps<effectController.acceptablefps) {
			if (confirm("It seems you have a slow graphics card. Do you want to disable the graphical display of the model?")) {
				disableRendering = true;
				$(g_client).fadeOut(2500);
			}
		}
	}
	
	if (!effectController.lazy_rendering || testFps==null) {
		updateClient(g_client,true);
	}
	if (useOctree) octree.update();
}

function removeFromArray(array, object) {
  var i = array.indexOf(object);
  if (i >= 0) {
    array.splice(i, 1);
  }
}

function unSelectAll(g_client) {
    for (var tt = 0; tt < g_selectedInfo.length; tt++) {
    	unSelectRecursive(g_selectedInfo[tt]);
    	removeFromScene(g_selectedInfo[tt], g_client);
    }
	g_selectedInfo = [];
}

function unSelectRecursive(transform) {
    for (var tt = 0; tt < transform.children.length; tt++) {
    	unSelectRecursive(transform.children[tt]);
    }
    if (transform.originalMaterial)
    	transform.material = transform.originalMaterial;
    if (transform.pred!=null) {
    	unSelectRecursive(transform.pred);
    }
}

function getScene(scene) {
	
	while ( scene.parent !== undefined ) {

		scene = scene.parent;

	}

	if ( scene !== undefined && scene instanceof THREE.Scene )  {

		return scene;

	}
	
	return null;
	
}

function switchCustomMaterialForObject(enableCustomMaterial, object, g_client) {
	object.importedMaterial = object.importedMaterial || object.originalMaterial || object.material;
	var material = enableCustomMaterial ? g_client.g_colors[object.customMaterialName] : object.importedMaterial;
	if (object.material == g_client.g_colors["Selection"]) {
		object.originalMaterial = material;
	} else {
		object.material = material;
	}
	if (enableCustomMaterial) {
		bringIntoScene(object,g_client);
	} else {
		removeFromScene(object, g_client);
	}
	updateClient(g_client, false);
}

function switchCustomMaterial(enableCustomMaterial, g_client) {
	var objects = [];
	traverseAllObjects( function (object) {
			if (object.customMaterialName) {
				objects.push(object);
			}
	}, g_client);
	objects.forEach(function (object) {
		switchCustomMaterialForObject(enableCustomMaterial, object, g_client);
	});
	if (!enableCustomMaterial)
    for (var tt = 0; tt < g_selectedInfo.length; tt++) {
    	// if object.parent was removed from scene, bring object again into scene
    	bringIntoScene(g_selectedInfo[tt],g_client);
    }
	updateClient(g_client, false);
}

function bringIntoScene(object, g_client) {
	if (!getScene(object)) {
		object.renderDepth = 2; // fix for IE11
		object.originalParent = object.parent;
		g_client.scene.add(object);
	}
}

function removeFromScene(object, g_client) {
	if (object.originalParent) {
		if (!(object.importedMaterial && object.material!=object.importedMaterial)) {
			object.originalParent.add(object);
			object.originalParent = null;
		}
	} else
	if (!(object instanceof THREE.Sprite)){
		g_client.scene.remove(object);
	}
}

function select(newSelection,g_client) {
	g_client = g_client || g_clients[0];
	newSelection = reviseSelection(newSelection);
	g_clients.forEach(unSelectAll);
	g_selectedInfo = newSelection;
	if (jstree) {
		jstree.jstree("deselect_all",true);
		g_selectedInfo.forEach(function (object) {
			openParentNodes(object);
			jstree.jstree("select_node", '#'+getTreeID(object),true,false);
			$('#'+getTreeID(object))[0].scrollIntoView();
		});
	}
    for (var tt = 0; tt < g_selectedInfo.length; tt++) {
    	bringIntoScene(g_selectedInfo[tt],g_client);
    	selectRecursive(g_selectedInfo[tt],g_client);
    }
    if (g_selectedInfo.length>0) {
    	myLog("Selected "+g_selectedInfo[0].uuid);
	    effectController.id = g_selectedInfo[0].uuid;
	    var material = g_selectedInfo[0].originalMaterial || g_selectedInfo[0].material;
	    effectController.material = material ? material.name : "none";
	    if (g_oldWorldPosition!=null && g_worldPosition) {
	    	effectController.distance = g_oldWorldPosition.distanceTo(g_worldPosition);
	    }
	    updateGui(selectionInfoGui);
	    if (g_selectedInfo[0].costInfo!=null)
	    	g_pickInfoElem.innerHTML = g_selectedInfo[0].costInfo;
	} else {
	    if (g_pickInfoElem) g_pickInfoElem.innerHTML = '';
	}
}

function applyOnMaterials(material, func) {
	if (material) func(material);
    if (material && material.materials)
    for (var tt = 0; tt < material.materials.length; tt++) {
    	func(material.materials[tt]);
    }
}

function selectRecursive(transform,g_client) {
    for (var tt = 0; tt < transform.children.length; tt++) {
    	selectRecursive(transform.children[tt],g_client);
    }
    if (transform.material && !(transform instanceof THREE.Sprite)) {
	    transform.originalMaterial = transform.material;
		var g_selectionMaterial = g_client.g_colors["Selection"];
	    g_selectionMaterial.side = transform.material.side;
	    transform.material = g_selectionMaterial;
    }
	var geometry = transform.geometry;
	if (geometry) {	
		// required if original material has a texture
		geometry.buffersNeedUpdate = true;	
		geometry.normalsNeedUpdate = true;	
	}
    if (transform.pred!=null) {
        selectRecursive(transform.pred,g_client);
    }
}

function enableOrbit(enable,g_client) {
	if (!enable || g_mapenabled) {
		g_client.controls.active = false;
		return;
	}
	if (!g_client.controls.active) {
		var camera = g_client.g_camera;
		var _position = camera.position.clone();
		g_client.controls.active = true;
		g_client.controls.update();
		camera.position.copy(_position);
		camera.lookAt(g_client.controls.target);
	}
}

function isShift(shiftFlag) {
	return !shiftFlag != !effectController.panning_mode;
}

function onDocumentMouseMove( e ) {	

	e.preventDefault();
	
	var lazy = true;

	var g_client = e.target;
	mouse.x = ( (e.clientX - g_client.getBoundingClientRect().left) / g_client.parentNode.offsetWidth ) * 2 - 1;
	mouse.y = - ( (e.clientY - g_client.getBoundingClientRect().top) / g_client.parentNode.offsetHeight ) * 2 + 1;
	
	if (e.which!=1) g_dragging = false;
	
	if (!g_dragging) return;

	enableOrbit(!isShift(e.shiftKey),g_client);

	if (g_mapenabled) {
		if (g_lastPos==null) {
			g_lastPos = [e.x, e.y];
			return;
		}
	    var deltaX = -(e.x-g_lastPos[0]);
	    var deltaY = -(e.y-g_lastPos[1]);
	    g_map.panBy(deltaX,deltaY);
	    g_lastPos = [e.x, e.y];
	    return;
	} else	
	{

		var raycaster = getRaycaster(mouse,g_client);

		var plane = g_client.plane;
		plane.position = (g_worldPosition || g_client.g_camera.target).clone();
		plane.lookAt( plane.position.clone().add( up ) );	
		plane.updateMatrixWorld();
		
		var intersects = raycaster.intersectObject( plane );
		if (intersects.length > 0) {
			var intersectPoint = intersects[ 0 ].point;			
			g_worldPosition = g_worldPosition || intersectPoint;
			if (isShift(e.shiftKey)) {
			var offs = intersectPoint.clone().sub(g_worldPosition);
			if (e.altKey) {
		    	g_offs = (g_offs || new THREE.Vector3( )).add(offs);
			    for (var tt = 0; tt < g_selectedInfo.length; tt++) {
			    	var object = g_selectedInfo[tt];
					var localOffs = object.parent.worldToLocal(intersectPoint.clone()).sub(object.parent.worldToLocal(g_worldPosition.clone()));
					var meltedGeometry = (object.originalMaterial || object.material).meltedGeometry;
					if (object.geometry instanceof THREE.BufferGeometry && meltedGeometry) {
						var array = object.geometry.attributes.position.array;
						for (var i = 0; i<array.length; i+=3) {
							array[i+0] += localOffs.x;
							array[i+1] += localOffs.y;
							array[i+2] += localOffs.z;
						}
						object.geometry.boundingSphere.center.add(localOffs);
						object.geometry.attributes.position.needsUpdate = true;
						meltedGeometry.attributes.position.needsUpdate = true;
						lazy = false;
					} else {
						object.position.add(localOffs);
						object.updateMatrix();
						object.updateMatrixWorld();
					}
					if (object.cam) {
						var camera = g_client.additionalCamera = object.cam;
				    	camera.position = camera.eye.add(localOffs);	
				    	camera.lookAt(camera.target);	
				    	camera.updateProjectionMatrix();
				    	camera.updateMatrixWorld();
					}
			    }
				offs = new THREE.Vector3( );
			    if (g_offs) g_worldPosition = intersectPoint;
			}
			setEyeAndTarget(g_client.g_camera.eye.sub(offs),g_client.g_camera.target.sub(offs),g_client);
			}
			//g_worldPosition = intersectPoint;
//		    myLog("c="+g_client.controls.center.x+" "+g_client.controls.center.y+" "+g_client.controls.center.z+" o="+offs.x+" "+offs.y+" "+offs.z+" i="+intersectPoint.x+" "+intersectPoint.y+" "+intersectPoint.z+" "+" w="+g_worldPosition.x+" "+g_worldPosition.y+" "+g_worldPosition.z+" ");
		    //myLog("d="+dir.x+" "+dir.y+" "+dir.z);
		} else myLog("no plane intersection!");

	}
    g_lastPos = [e.x, e.y];
	
	updateClient(g_client,lazy);
}

function getRaycaster(mouse,g_client) {
	var camera = g_client.g_camera;
	var vector = new THREE.Vector3( mouse.x, mouse.y, 0.5 );
	var raycaster = projector.pickingRay( vector.clone(), camera );
	if (!g_ortho) {
		// TODO these two lines should not be necessary! threejs bug?
		projector.unprojectVector( vector, camera );
		raycaster = new THREE.Raycaster( camera.position, vector.sub( camera.position ).normalize() );
	}
	return raycaster;
}

var g_line;


var mousedownClientX = 0;
var mousedownClientY = 0;

function intersectParticleSystems(raycaster,g_client) {
	var intersects = null;
	var aspect = g_client.parentNode.offsetWidth / g_client.parentNode.offsetHeight;
	if (g_client.scene2) {
		    var minDistance=99999999;
		    g_client.scene2.children.forEach( function (object) {		   
		    		//see https://github.com/mrdoob/three.js/issues/3492
		    	
		    	 	var vertices = object.geometry.vertices;
		            var point, distance, intersect, threshold = 1;
		            var localMatrix = new THREE.Matrix4();
		            var localtempRay = raycaster.ray.clone();
		            var localOrigin = localtempRay.origin;
		            var localDirection = localtempRay.direction;

		            localMatrix.getInverse(object.matrixWorld);
		            //localMatrix.multiplyVector3(localOrigin);
		            localOrigin.applyMatrix4(localMatrix);
		            //localMatrix.rotateAxis(localDirection).normalize();
		            localDirection.transformDirection(localMatrix);

		            for ( var i = 0; i < vertices.length; i ++ ) {
		                point = vertices[ i ];
		                //distance = this.distanceFromIntersection( localOrigin, localDirection, point );
		                distance = localtempRay.distanceToPoint(point);
		                if (!object.sizeAttenuation) threshold = localtempRay.origin.distanceTo(point)*2/5*aspect*object.material.size/g_client.parentNode.offsetWidth;
//		                console.log("distance="+distance+" threshold="+threshold+" aspect="+aspect+" screenx="+g_client.parentNode.offsetWidth+" screeny="+g_client.parentNode.offsetHeight);
		                if ( distance > threshold ) {
		                    continue;
		                }
		                intersect = {
		                    distance: distance,
		                    point: point.clone(),
		                    face: null,
		                    object: object,
		                    vertex: i
		                };
//		                intersects.push(intersect);
		                
		                if (distance<minDistance) {
		                	minDistance = distance;
		                	intersects = [intersect];
		                    object.hitVertexIndex = i;
		                }
		            }
		    	
	        });
	}	
	return intersects;	
}

function onDocumentMouseDown(e) {

	var start = new Date().getTime();
	
	var calledFromOtherMouseEvent = (e.type == "dblclick") || (e.type == "mouseup");
	
	if (!calledFromOtherMouseEvent) {
		myLog("onDocumentMouseDown #selection="+g_selectedInfo.length+" which="+e.which);
		e.target.focus();
	}
    
	e.preventDefault();	

	mousedownClientX = e.clientX;
	mousedownClientY = e.clientY;
	
	var g_client = e.target;
	mouse.x = ( (e.clientX - g_client.getBoundingClientRect().left) / g_client.parentNode.offsetWidth ) * 2 - 1;
	mouse.y = - ( (e.clientY - g_client.getBoundingClientRect().top) / g_client.parentNode.offsetHeight ) * 2 + 1;

	enableOrbit(e.which!=3 && !isShift(e.shiftKey),g_client);
	
	var camX = e.clientX;
	var camY = g_client.parentNode.offsetHeight - e.clientY;
	if (g_client.additionalCamera && camX>camLeft && camX<camLeft+camWidth && camY>camBottom && camY<camBottom+camHeight) {
		g_client.additionalCamera = null;
		updateClient(g_client);
		return;
	}

	var canChangeSelection = !effectController.select_by_dblclick && !effectController.select_by_mouseup || calledFromOtherMouseEvent;
	
	var intersects = null;
    
    if (canChangeSelection || isShift(e.shiftKey)) {
    g_oldWorldPosition = g_worldPosition;
    g_worldPosition = null;

    var raycaster = getRaycaster(mouse,g_client);

	
	if (useOctree) {
		
		var octreeObjects = octree.search( raycaster.ray.origin, raycaster.ray.far, true, raycaster.ray.direction );
		
		intersects = raycaster.intersectOctreeObjects( octreeObjects );

		var descSort = function ( a, b ) {

			return a.distance - b.distance;

		};

		intersects.sort( descSort );
		
	} else {
		intersects = raycaster.intersectObjects( g_client.objects );
	}
	
	intersects = intersectParticleSystems(raycaster,g_client) || intersects;
    }
	

	var oldSelection = g_selectedInfo;
	if (canChangeSelection) unSelectAll(g_client);
	if (intersects) myLog("intersects.length = "+intersects.length);


	var SELECTED = null;
	
	if (intersects)
    for (var tt = 0; tt < intersects.length; tt++) {	
    	var object = intersects[ tt ].object;
    	if (isIntersectedObjectVisible(object, g_client)) {
    		SELECTED = object;
    		break;
    	}
    }	    
    
	if ( SELECTED ) {

		if (SELECTED.cam) {
	    	g_client.additionalCamera = SELECTED.cam;
		}

//	    if (g_line) g_client.scene.remove(g_line);
//		var geometry3 = new THREE.Geometry();
//		geometry3.vertices.push( intersects[ 0 ].point.clone().add(new THREE.Vector3( 0,-1,0 )) );
//		geometry3.vertices.push( intersects[ 0 ].point.clone() );
//		geometry3.vertices.push( intersects[ 0 ].point.clone().add(new THREE.Vector3( 0,1,0 )) );
//		var material = new THREE.LineBasicMaterial( { color: Math.random() * 0xffffff , opacity: 1, linewidth: 13 } );
//		g_line = new THREE.Line(geometry3, material );
//		g_line.position = new THREE.Vector3( 0,0,0 );
//		g_client.scene.add( g_line );
		
	    if (effectController.select_face) {
	        var mesh = THREE.BufferGeometryUtils.assureMeshWithNoBufferGeometry(SELECTED);
	    	intersects = raycaster.intersectObjects( [mesh] );
	        for (var tt = 0; tt < intersects.length; tt++) {
	        	var object = intersects[ tt ].object;
	        	if (intersects[ tt ].face) {
		        	SELECTED = object;
			    	var faceSingleton = SELECTED.clone();
			    	faceSingleton.matrix.copy(faceSingleton.matrixWorld);
			    	faceSingleton.geometry = new THREE.Geometry();
			    	faceSingleton.geometry.faces = [intersects[ tt ].face];
			    	faceSingleton.geometry.vertices = SELECTED.geometry.vertices;
			    	SELECTED = faceSingleton;
		    		break;    
	        	}
	    	}
	    }
	    
	    if (canChangeSelection)
		if (e.ctrlKey || (e.which==3 || effectController.invert_selection) && oldSelection.indexOf(SELECTED) != -1) {
		  if (e.ctrlKey || effectController.invert_selection)
		  if (oldSelection.indexOf(SELECTED) == -1)
			  oldSelection.push(SELECTED); else
		      removeFromArray(oldSelection,SELECTED);
		} else {
			oldSelection = [SELECTED];
		}

		g_worldPosition	= intersects[ 0 ].point.clone();	
	    myLog( 'worldIntersectionPosition = ' +vector3ToArray(g_worldPosition) );		

	} else {
		oldSelection = [];
		if (intersects) myLog("selected no elements");
	}
	
	enableOrbit(e.which!=3 && !isShift(e.shiftKey),g_client);
	
	if (canChangeSelection) select(oldSelection,g_client);

	if (canChangeSelection) generateEvent(e.type,e,g_client);
	
	
	if (canChangeSelection) g_clients.forEach(updateClient);
	
	if (e.which!=3 && !calledFromOtherMouseEvent) {
		g_lastPos = [e.x, e.y];
		g_offs = null;
		g_dragging = true;
	}

	if (!calledFromOtherMouseEvent) {
		var end = new Date().getTime();
		myLog("onDocumentMouseDown #selection="+g_selectedInfo.length+" which="+e.which+" finished in "+(end-start)+"ms");
	}

}			

var waitingCount = 0;

function getSelectedObjectIDs(objects) {
	return objects.map(function(object) {
		return object.uuid;
	});
}

function selectionAsString(delimiter) {
	return g_selectedInfo.map(function (object) {
		return object.uuid;
	}).join(delimiter || " ");
}

function generateEvent(eventType,e,g_client) {
	if (typeof(theJavaFunction) != "function") return;
	
	if (eventType=="mouseup") eventType="click";
	
    var type="";
	if (effectController.treeview==false && effectController.properties==false && e.which!=3) return;
    var mainParams = [selectionAsString(),type,g_client.id,e.clientX,e.clientY,e.which,eventType];
	if ( g_selectedInfo.length != 0 ) {
		if (g_worldPosition) {
			mainParams = mainParams.concat(vector3ToArray(g_worldPosition));
			if (animateTube)
				mainParams = mainParams.concat([g_client.me.position.x,-g_client.me.position.z,g_client.me.position.y-g_client.me.shiftUp]);
		}
		myLog("Processing "+eventType+"...");
		var milli = new Date();		
		var ellipsis = document.getElementById('ellipsis_menu');
		if (e.which==3 && eventType=="click") {
			if (effectController.nocontextmenu)	return;
			ellipsis.style.left = mousedownClientX+"px";
			ellipsis.style.top = mousedownClientY+"px";
			ellipsis.style.display = "block";
		} else {
			document.body.style.cursor = "progress";
			waitingCount++;
		}
		setTimeout(function(){
			try {
				theJavaFunction.apply(undefined,mainParams);
			} catch (e2) {	
				myLog("Exception in generateEvent: "+e2.message);
			}
			if (e.which==3 && eventType=="click") {
				ellipsis.style.display="none";				
			} else {
				waitingCount--;
				if (waitingCount==0)
					document.body.style.cursor = "";
			}
			var milli2 = new Date();
			myLog("Processed "+eventType+" in "+(milli2-milli)+"ms");
		},100);
	}
}

function onDocumentDblClick(e) {
	myLog("onDocumentDblClick #selection="+g_selectedInfo.length+" which="+e.which);
	var g_client = e.target;
	e.preventDefault();
	if (effectController.select_by_dblclick) {
		onDocumentMouseDown(e);
	} else
	if (g_selectedInfo.length > 0) {
		locate(g_selectedInfo,g_client,10);
	} 
	myLog("onDocumentDblClick finished");
}

function onDocumentMouseUp(e) {
	var start = new Date().getTime();
	myLog("onDocumentMouseUp #selection="+g_selectedInfo.length+" which="+e.which);
	var g_client = e.target;
	g_dragging = false;
	e.preventDefault();
	enableOrbit(true,g_client);
	g_client.plane.position.set( 0,0,0 );	
	g_client.plane.updateMatrixWorld();	
	if (g_selectedInfo.length > 0 && g_offs) {
		myLog("drop");
		var x = vector3ToArray(g_offs)[0];
		var y = vector3ToArray(g_offs)[1];
		setTimeout(function(){try { theJavaFunction(selectionAsString(),"",g_client.id,x,y,e.which,"drop");  } catch (e2) {}},100);
		myLog("dropped");
	} else {
		var dist = 5;
		if (e.clientX>=mousedownClientX-dist && e.clientX<=mousedownClientX+dist &&
		    e.clientY>=mousedownClientY-dist && e.clientY<=mousedownClientY+dist) {
			if (!effectController.select_by_dblclick || e.which==3)
				if (effectController.select_by_mouseup) {
					onDocumentMouseDown(e);
				} else if (g_selectedInfo.length > 0) {
					generateEvent("click",e,g_client);
				}
		}
	}
	updateClient(g_client);
	var end = new Date().getTime();
	myLog("onDocumentMouseUp #selection="+g_selectedInfo.length+" which="+e.which+" finished in "+(end-start)+"ms");

}

function onDocumentMouseWheel(e) {
	var delta = e.wheelDelta || - e.detail;
	if (delta) {
		if (g_mapenabled) {
			g_mapsteps = 3;
			g_map.setZoom(g_map.getZoom()+(delta > 0 ? 1 : -1));
			return;
		}
		var g_client = e.target;
		updateClient(g_client);
	}
}


function getOnlyUsedVertices(geometry) {
	if (geometry instanceof THREE.BufferGeometry) {
		var result = [];

		var positions = geometry.attributes[ "position" ].array;

		if ( positions ) {
			for ( var i = 0, il = positions.length; i < il; i += 3 ) {
	
				x = positions[ i ];
				y = positions[ i + 1 ];
				z = positions[ i + 2 ];
				
				result.push(new THREE.Vector3(x,y,z));
				
			}
		}
		return result;
	}
	var faces = geometry.faces;
	var vertices = geometry.vertices;
	if (faces && vertices && faces.length*3<vertices.length) {		
		var result = [];
		for ( i = 0, il = faces.length; i < il; i ++ ) {
			var face = faces[ i ];
			result.push(vertices[face.a]);
			result.push(vertices[face.b]);
			result.push(vertices[face.c]);		
		}
		return result;
	}
	return vertices;
}

function getBoundingBoxOfTree(object3Ds) {
    var box = new THREE.Box3();
    object3Ds = asArray(object3Ds);
    var v = new THREE.Vector3();
    for (var tt = 0; tt < object3Ds.length; tt++) {
	    var object3D = object3Ds[tt];
	    object3D.traverse(function (obj3D) {
	        if (!obj3D.geometry) return;        
	        var vertices = getOnlyUsedVertices(obj3D.geometry);
	        var matrix = obj3D.matrixWorld;
			vertices.forEach(function (vertex) {
				box.addPoint( v.copy(vertex).applyMatrix4( matrix ) );
			});
	    });
    }
    if (box.empty()) return null;
    return box;
}

function lerpVector(v1,v2,t) {
	return v1.clone().multiplyScalar(1-t).add(v2.clone().multiplyScalar(t));
}

function lerpScalar(v1,v2,t) {
	return v1*(1-t)+v2*t;
}

function setEyeAndTarget(eye,target,g_client,_up) {
	up = _up || up;
	var aspect = g_client.parentNode.offsetWidth / g_client.parentNode.offsetHeight;
	var camera;
	if (g_ortho) {
		var le = target.distanceTo(eye);
		camera = new THREE.OrthographicCamera( -le/2 * aspect, le/2 * aspect, le/2, -le/2, 0, 2000000 );
	} else {
		camera = new THREE.PerspectiveCamera( g_angle, aspect, 0.01, 2000000 );
	}
	g_client.g_camera = g_client.controls.object = camera;
	camera.position = camera.eye = eye;	
	camera.target = g_client.controls.target = target;	
	if (g_mapenabled)
		camera.up.set(0,0,1); else
		camera.up.copy(_up!=null?_up:up);
	camera.lookAt(target);	
	camera.updateProjectionMatrix();
	if (g_client.controls.active) {
		enableOrbit(false,g_client);
		enableOrbit(true,g_client);
	}
	camera.updateProjectionMatrix();
	camera.updateMatrixWorld();
}

function printCameras(lines, artifactId) {
	var g_client = resolveArtifact(artifactId);

    for (var tt = 0; tt < g_cameraTransforms.length; tt++) {
    	var transform = g_cameraTransforms[tt];
    	g_client.scene.remove(transform);
    	removeFromArray(g_client.additionalObjectsToSelect,transform);
    }

    g_cameraTransforms = [];

    		  
    for (var tt = 0; tt < lines.length; ) {
    		var lastPoint = asVector3([lines[tt+0],lines[tt+1],lines[tt+2]]);
	    	var nextPoint = asVector3([lines[tt+3],lines[tt+4],lines[tt+5]]);

		    var cameraBoxMaterial = new THREE.MeshLambertMaterial( { color: 0xc0a0a0, opacity: 0.75, transparent: true } );
		    var cameraHoleMaterial = new THREE.MeshLambertMaterial( { color: 0x010101, opacity: 0.75, transparent: true } );
    
	    	var aspect = lines[tt+7];// g_client.parentNode.offsetWidth / g_client.parentNode.offsetHeight;
	    	var camera = new THREE.PerspectiveCamera( lines[tt+6], aspect, 0.5, 1000 );
	    	camera.position = camera.eye = lastPoint;	
			camera.up = up;
	    	camera.lookAt(camera.target = nextPoint);	
	    	camera.updateProjectionMatrix();
	    	camera.updateMatrixWorld();

	    	var p = lastPoint;
	    	var projector = new THREE.Projector();
	    	var n1 = projector.unprojectVector( new THREE.Vector3(-1, -1,-1), camera );
	    	var n2 = projector.unprojectVector( new THREE.Vector3( 1, -1,-1), camera );
	    	var n3 = projector.unprojectVector( new THREE.Vector3( 1,  1,-1), camera );
	    	var n4 = projector.unprojectVector( new THREE.Vector3(-1,  1,-1), camera );


	    	var geometry = new THREE.Geometry();
	    	geometry.vertices = [p,n1,n2,n3,n4];
	    	geometry.faces = [ new THREE.Face3( 0, 1, 2 ),new THREE.Face3( 0, 2, 3 ) ,new THREE.Face3( 0, 3, 4 ),new THREE.Face3( 0, 4, 1 ) ];
	    	geometry.computeFaceNormals();
	    	var mesh = new THREE.Mesh( geometry, cameraBoxMaterial );
	    	g_client.scene.add( mesh );
	    	g_cameraTransforms.push(mesh);
	    	g_client.additionalObjectsToSelect.push(mesh);	    	
	    	mesh.draggable = true;
	    	mesh.name=lines[tt+8];
	    	mesh.cam = camera;

	    	geometry = new THREE.Geometry();
	    	geometry.vertices = [p,n1,n2,n3,n4];
	    	geometry.faces = [ new THREE.Face4(4,3,2,1 )  ];
	    	geometry.computeFaceNormals();
	    	mesh = new THREE.Mesh( geometry, cameraHoleMaterial );
	    	g_client.scene.add( mesh );
	    	g_cameraTransforms.push(mesh);
	    	g_client.additionalObjectsToSelect.push(mesh);
	    	
	    	tt+=9;
    }
    updateSelectableObjects(g_client);
    updateClient(g_client);
}

var incidentGeometries = {};
var incidentMaterials = {};


function loadLavaMaterial() {
	

	// Lava
	
	var vertexShader = "\
	uniform vec2 uvScale;\
	varying vec2 vUv;\
\
	void main()\
	{\
\
		vUv = uvScale * uv;\
		vec4 mvPosition = modelViewMatrix * vec4( position, 1.0 );\
		gl_Position = projectionMatrix * mvPosition;\
\
	}\
\
	";
	
	
	var fragmentShader ="\
	\
	uniform float time;\
	uniform vec2 resolution;\
\
	uniform float fogDensity;\
	uniform vec3 fogColor;\
\
	uniform sampler2D texture1;\
	uniform sampler2D texture2;\
\
	varying vec2 vUv;\
\
	void main( void ) {\
\
		vec2 position = -1.0 + 2.0 * vUv;\
\
		vec4 noise = texture2D( texture1, vUv );\
		vec2 T1 = vUv + vec2( 1.5, -1.5 ) * time  *0.02;\
		vec2 T2 = vUv + vec2( -0.5, 2.0 ) * time * 0.01;\
\
		T1.x += noise.x * 2.0;\
		T1.y += noise.y * 2.0;\
		T2.x -= noise.y * 0.2;\
		T2.y += noise.z * 0.2;\
\
		float p = texture2D( texture1, T1 * 2.0 ).a;\
\
		vec4 color = texture2D( texture2, T2 * 2.0 );\
		vec4 temp = color * ( vec4( p, p, p, p ) * 2.0 ) + ( color * color - 0.1 );\
\
		if( temp.r > 1.0 ){ temp.bg += clamp( temp.r - 2.0, 0.0, 100.0 ); }\
		if( temp.g > 1.0 ){ temp.rb += temp.g - 1.0; }\
		if( temp.b > 1.0 ){ temp.rg += temp.b - 1.0; }\
\
		gl_FragColor = temp;\
\
		float depth = gl_FragCoord.z / gl_FragCoord.w;\
		const float LOG2 = 1.442695;\
		float fogFactor = exp2( - fogDensity * fogDensity * depth * depth * LOG2 );\
		fogFactor = 1.0 - clamp( fogFactor, 0.0, 1.0 );\
\
		gl_FragColor = mix( gl_FragColor, vec4( fogColor, gl_FragColor.w ), fogFactor );\
\
	}\
\
	";
	
	var uniforms = {

		fogDensity: { type: "f", value: 0.45 },
		fogColor: { type: "v3", value: new THREE.Vector3( 0, 0, 0 ) },
		time: { type: "f", value: 1.0 },
		resolution: { type: "v2", value: new THREE.Vector2() },
		uvScale: { type: "v2", value: new THREE.Vector2( 3.0, 1.0 ) },
		texture1: { type: "t", value: THREE.ImageUtils.loadTexture( t_dir+"textures/lava/cloud.png", null, updateClients ) },
		texture2: { type: "t", value: THREE.ImageUtils.loadTexture( t_dir+"textures/lava/lavatile.jpg", null, updateClients ) }

	};

	uniforms.texture1.value.wrapS = uniforms.texture1.value.wrapT = THREE.RepeatWrapping;
	uniforms.texture2.value.wrapS = uniforms.texture2.value.wrapT = THREE.RepeatWrapping;

	return new THREE.ShaderMaterial( {

		uniforms: uniforms,
		vertexShader: vertexShader,
		fragmentShader: fragmentShader

	} );
	
}

function printIncidents(lines, artifactId) {

	var g_client = resolveArtifact(artifactId);

    for (var tt = 0; tt < g_incidentTransforms.length; tt++) {
//    	var psys = g_incidentTransforms[tt];
//    	psys.stop();
    	var transform = g_incidentTransforms[tt];
    	g_client.scene.remove(transform);
    	removeFromArray(g_client.additionalObjectsToSelect,transform);
//    	transform.parent = null;
//    	pack.removeObject(transform);
    }
    blinkingObjects = [];
	if (blinkJob) { window.clearInterval(blinkJob); blinkJob=null; }

    g_incidentTransforms = [];
    

	if (!hasFire) {
		var requiredThreeJS = [];
		requiredThreeJS.push(g_dir+"fonts/helvetiker_regular.typeface.js"); 
////		requiredThreeJS.push(g_dir+"fire/js/SpriteParticleSystem.js");  
////	
//////		requiredThreeJS.push(g_dir+"fire/signals.js");
//////		requiredThreeJS.push(g_dir+"fire/Library.js");
//////		requiredThreeJS.push(g_dir+"fire/Tween.js");
//////		requiredThreeJS.push(g_dir+"fire/RequestAnimationFrame.js");
//////		
////	//	requiredThreeJS.push(g_dir+"shaders/displacement_vertex.js");
////	//	requiredThreeJS.push(g_dir+"shaders/displacement_fragment.js");
////	//	requiredThreeJS.push(g_dir+"shaders/noise_vertex.js");
////	//	requiredThreeJS.push(g_dir+"shaders/noise_fragment.js");  
////	
	    require(requiredThreeJS, function () {
	    	hasFire = true;
	    	printIncidents(lines, artifactId);
////			  var scene = g_client.scene;
////
////			    for (var tt = 0; tt < lines.length; ) {
////				    	var lastPoint = [lines[tt+0],lines[tt+1],lines[tt+2]];
////
////						  if (!mapA)
////							  mapA = THREE.ImageUtils.loadTexture( g_dir+"fire/images/smoke.png" );
////				    	  var cloud = new THREE.Object3D();
////				    	  scene.add(cloud);
////				    	  var psys = new SpriteParticleSystem({
////				    	    particlesMoveWithEmitter:false,
////				    	    cloud:cloud,
////				    	    rate:5,
////				    	    num:2,
////				    	    texture:mapA,
////				    	    scaleR:[.001,0.004],
////				    	    speedR:[0,0.5],
////				    	    rspeedR:[-0.1,0.3],
////				    	    lifespanR:[3,4],
////				    	    terminalSpeed:20
////				    	  });
//////				    	  psys.addForce(new THREE.Vector3(0,50,10));
////				    	  psys.start();
////
////				    	  
////				    	  cloud.position = new THREE.Vector3(lastPoint[0],lastPoint[1],lastPoint[2]);
////				    	  g_incidentTransforms.push(psys);
////			
////				    	  hasFire = true;
////	    	  
////
////				    	tt+=4;
////			    }
//////			var requiredThreeJS = [];
//////			requiredThreeJS.push(g_dir+"fire.js");
//////			
//////		    require(requiredThreeJS, function () {
//////		//    	scene = g_client.scene;
//////		//    	camera = g_client.g_camera;
//////		    	viewportWidth  = g_client.parentNode.offsetWidth;
//////		    	viewportHeight = g_client.parentNode.offsetHeight;
//////		    	renderer = g_renderer;
//////		    	renderer.autoClear = false;
//////		    	hasFire = true;
//////		    	mainInit();
//////		    });
	    });
	    return;
	}
	myLog("called printIncidents");
    		  
    for (var tt = 0; tt < lines.length; ) {
	    	var lastPoint = asVector3([lines[tt+0],lines[tt+1],lines[tt+2]]);    	
	    	var material=null;
	    	var geometry=null;
	    	var desc = lines[tt+3].toLowerCase();

		    for (var key in incidentMaterials) {
		    	if (desc.indexOf(key)!=-1) {
		    		material = incidentMaterials[key];
		    		geometry = incidentGeometries[key];
		    	}
		    }
	    	var key = null;
	    	if (!(material && geometry))    	
	    	if (desc.indexOf(key="fire")!=-1) {
	    		geometry = new THREE.OctahedronGeometry( 0.5, 2 );
				material = loadLavaMaterial();
	    	} else 
	    	if (desc.indexOf(key="light")!=-1) {
	    		geometry = new THREE.PlaneGeometry( 1, 1, 1, 1 );
	    		var texture = THREE.ImageUtils.loadTexture( g_dir+"images/light_bulb.png", null, updateClients );
	    		texture.wrapS = texture.wrapT = THREE.RepeatWrapping;
	    		material = new THREE.MeshBasicMaterial({map: texture, alphaTest: 0.5, side: THREE.DoubleSide, transparent: true, opacity: 1 });
			} else 
	    	if (desc.indexOf(key="power")!=-1) {
	    		geometry = new THREE.PlaneGeometry( 1, 1, 1, 1 );
	    		var texture = THREE.ImageUtils.loadTexture( g_dir+"images/Electricity.png", null, updateClients );
	    		texture.wrapS = texture.wrapT = THREE.RepeatWrapping;
	    		material = new THREE.MeshBasicMaterial({map: texture, alphaTest: 0.5, side: THREE.DoubleSide, transparent: true, opacity: 1 });
			} else 
	    	if (desc.indexOf(key="smoke")!=-1) {
	    		geometry = new THREE.PlaneGeometry( 2, 2, 1, 1 );
	    		var texture = THREE.ImageUtils.loadTexture( g_dir+"images/smoke.png", null, updateClients );
	    		texture.wrapS = texture.wrapT = THREE.RepeatWrapping;
	    		material = new THREE.MeshBasicMaterial({map: texture, alphaTest: 0.5, side: THREE.DoubleSide, transparent: true, opacity: 1 });
			} else {
				key=null;
				// Random colors
	
				geometry = new THREE.CubeGeometry( 1,1,1 );
	
				for ( var i = 0; i < geometry.faces.length; i ++ ) {
	
					geometry.faces[ i ].color.setHex( Math.random() * 0xffffff );
	
				}
	
				material = new THREE.MeshBasicMaterial( { vertexColors: THREE.FaceColors } );
			
			}
	    	
	    	if (key) {
	    		incidentMaterials[key] = material;
	    		incidentGeometries[key] = geometry;
	    	}
			
	    	var cube = new THREE.Mesh( geometry, material );
			cube.position = lastPoint;
			cube.position.y = cube.position.y+0.5;
			cube.rotation.x = -Math.PI / 2;
			cube.rotation.z = -Math.PI / 2;
			g_client.scene.add( cube );
			cube.updateMatrixWorld();	
			g_client.additionalObjectsToSelect.push(cube);
			g_incidentTransforms.push(cube);
			cube.name = lines[tt+5];
	    	
	    	// Text

			var theText = "Hello three.js! :)";
			theText = lines[tt+3];

			var text3d = new THREE.TextGeometry( theText, {

				size: 8,
				height: 2,
				curveSegments: 2,
				font: "helvetiker"

			});

			text3d.computeBoundingBox();
			var centerOffset = -0.5 * ( text3d.boundingBox.max.x - text3d.boundingBox.min.x );

			var textMaterial = new THREE.MeshBasicMaterial( { color:  0x030303, overdraw: true } );
			var text = new THREE.Mesh( text3d, textMaterial );

			text.position.x = lastPoint.x;
			text.position.y = lastPoint.y+1;
			text.position.z = lastPoint.z;

			text.rotation.x = -Math.PI / 2;
			text.rotation.y = 0;
			text.rotation.z = -Math.PI / 2;
			text.scale.x = text.scale.y = text.scale.z = 0.04;

			parent = new THREE.Object3D();
			parent.add( text );

			g_client.scene.add( parent );
			parent.updateMatrixWorld();
			g_incidentTransforms.push(parent);
			
			if (lines[tt+4]=="blink") {
				blinkingObjects.push(cube);
				if (!blinkJob)
				blinkJob = window.setInterval(function() {		
				    for (var tt = 0; tt < blinkingObjects.length; tt++) {			
				    	blinkingObjects[tt].visible = !blinkingObjects[tt].visible;			    	
				    }
					updateClient(g_client);
				}, 300);
			}	    	
	    	
	    	tt+=6;
    }
    updateSelectableObjects(g_client);
    updateClient(g_client);
}

function generateMaterials() {

	// toons

	var toonMaterial1 = createShaderMaterial( "toon1", light, ambientLight ),
	toonMaterial2 = createShaderMaterial( "toon2", light, ambientLight ),
	hatchingMaterial = createShaderMaterial( "hatching", light, ambientLight ),
	hatchingMaterial2 = createShaderMaterial( "hatching", light, ambientLight ),
	dottedMaterial = createShaderMaterial( "dotted", light, ambientLight ),
	dottedMaterial2 = createShaderMaterial( "dotted", light, ambientLight );

	hatchingMaterial2.uniforms.uBaseColor.value.setRGB( 0, 0, 0 );
	hatchingMaterial2.uniforms.uLineColor1.value.setHSL( 0, 0.8, 0.5 );
	hatchingMaterial2.uniforms.uLineColor2.value.setHSL( 0, 0.8, 0.5 );
	hatchingMaterial2.uniforms.uLineColor3.value.setHSL( 0, 0.8, 0.5 );
	hatchingMaterial2.uniforms.uLineColor4.value.setHSL( 0.1, 0.8, 0.5 );

	dottedMaterial2.uniforms.uBaseColor.value.setRGB( 0, 0, 0 );
	dottedMaterial2.uniforms.uLineColor1.value.setHSL( 0.05, 1.0, 0.5 );

	var texture = THREE.ImageUtils.loadTexture( t_dir+"textures/ash_uvgrid01.jpg" );
	texture.wrapS = texture.wrapT = THREE.RepeatWrapping;
	
	var textureCube = null;
	var reflectionCube = null;
	var refractionCube = null;
	
	
	
	var materials = {

	"chrome" :
	{
		m: new THREE.MeshLambertMaterial( { color: 0xffffff, envMap: reflectionCube } ),
		h: 0, s: 0, l: 1
	},

	"liquid" :
	{
		m: new THREE.MeshLambertMaterial( { color: 0xffffff, envMap: refractionCube, refractionRatio: 0.85 } ),
		h: 0, s: 0, l: 1
	},

	"shiny"  :
	{
		m: new THREE.MeshPhongMaterial( { color: 0x550000, specular: 0x440000, envMap: reflectionCube, combine: THREE.MixOperation, reflectivity: 0.3, metal: true } ),
		h: 0, s: 0.8, l: 0.2
	},

	"matte" :
	{
		m: new THREE.MeshPhongMaterial( { color: 0x000000, specular: 0x111111, shininess: 1 } ),
		h: 0, s: 0, l: 1
	},

	"flat" :
	{
		m: new THREE.MeshPhongMaterial( { color: 0x000000, specular: 0x111111, shininess: 1, shading: THREE.FlatShading } ),
		h: 0, s: 0, l: 1
	},

	"textured" :
	{
		m: new THREE.MeshPhongMaterial( { color: 0xffffff, specular: 0x111111, shininess: 1, map: texture } ),
		h: 0, s: 0, l: 1
	},

	"colors" :
	{
		m: new THREE.MeshPhongMaterial( { color: 0xffffff, specular: 0xffffff, shininess: 2, vertexColors: THREE.VertexColors } ),
		h: 0, s: 0, l: 1
	},

	"plastic" :
	{
		m: new THREE.MeshPhongMaterial( { color: 0x000000, specular: 0x888888, ambient: 0x000000, shininess: 250 } ),
		h: 0.6, s: 0.8, l: 0.1
	},

	"toon1"  :
	{
		m: toonMaterial1,
		h: 0.2, s: 1, l: 0.75
	},

	"toon2" :
	{
		m: toonMaterial2,
		h: 0.4, s: 1, l: 0.75
	},

	"hatching" :
	{
		m: hatchingMaterial,
		h: 0.2, s: 1, l: 0.9
	},

	"hatching2" :
	{
		m: hatchingMaterial2,
		h: 0.0, s: 0.8, l: 0.5
	},

	"dotted" :
	{
		m: dottedMaterial,
		h: 0.2, s: 1, l: 0.9
	},

	"dotted2" :
	{
		m: dottedMaterial2,
		h: 0.1, s: 1, l: 0.5
	},
	

	"Gold": 	new THREE.MeshPhongMaterial( { color: 0xaa9944, specular:0xbbaa99, shininess:50, envMap: textureCube, combine: THREE.MultiplyOperation } ),
	"Bronze":	new THREE.MeshPhongMaterial( { color: 0x150505, specular:0xee6600, shininess:10, envMap: textureCube, combine: THREE.MixOperation, reflectivity: 0.25 } ),
	"Chrome": 	new THREE.MeshPhongMaterial( { color: 0xffffff, specular:0xffffff, envMap: textureCube, combine: THREE.Multiply } ),

	"Black glass": 	new THREE.MeshLambertMaterial( { color: 0x101016, envMap: textureCube, opacity: 0.975, transparent: true } ),
	"Dark glass":	new THREE.MeshLambertMaterial( { color: 0x101046, envMap: textureCube, opacity: 0.25, transparent: true } ),
	"Blue glass":	new THREE.MeshLambertMaterial( { color: 0x668899, envMap: textureCube, opacity: 0.75, transparent: true } ),
	"Light glass":	new THREE.MeshBasicMaterial( { color: 0x223344, envMap: textureCube, opacity: 0.25, transparent: true, combine: THREE.MixOperation, reflectivity: 0.25 } ),

	};

	return materials;

}

function createShaderMaterial( id, light, ambientLight ) {

	var shader = THREE.ShaderToon[ id ];

	var u = THREE.UniformsUtils.clone( shader.uniforms );

	var vs = shader.vertexShader;
	var fs = shader.fragmentShader;

	var material = new THREE.ShaderMaterial( { uniforms: u, vertexShader: vs, fragmentShader: fs } );

	material.uniforms.uDirLightPos.value = light.position;
	material.uniforms.uDirLightColor.value = light.color;

	material.uniforms.uAmbientLightColor.value = ambientLight.color;

	return material;

}
