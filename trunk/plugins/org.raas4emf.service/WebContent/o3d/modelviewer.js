var g_loadingElement;
var g_path;
var g_ids = [];
var zoomId;
var countProgress;
var g_colors;
if (g_colors == null) g_colors= 
{
		"Beam": [0,1,0,0.85],
		"Building": [0,0,1,0.5],
		"BuildingElementPro": [0.8,0.8,0.8,1],  //truncate xy
		"BuildingStorey": [0,0,1,0.75],
		"Column": [1,1,0,0.7],
		"Covering": [1,0,0.5019608,1],
		"CurtainWall": [0,0,1,0.35],
		"Door": [0.5019608,0.2509804,0,0.8],
		"Footing": [0,0.2509804,0.2509804,1],
		"FurnishingElement": [0,0,0.2509804,0.2],
		"OpeningElement": [0,0,1,0],
		"Pile": [0.5019608,0.5019608,0,1],
		"Project": [0,0,1,0.25],
		"Site": [0,0,1,0.3],
		"Slab": [0.7529412,0.7529412,0.7529412,0.5],
		"Space": [0,0.5019608,0.2509804,0.3],
		"Stair": [0.5019608,0,0.5019608,0.9],
		"Wall": [0,0,1,0.35],
		"WallStandardCase": [0,0,1,0.35],
		"Window": [0,1,1,0.4]
};

var g_ortho;
if (g_ortho == null) g_ortho = false;
var g_fillmode;
if (g_fillmode == null) g_fillmode = "Solid";
var g_angle = 45;
var g_cameraHistory = [];
var g_selectedInfo = null;
//multiple extension
var g_paths = [];
var g_num_clients;
var NUM_ACROSS = 2;
var NUM_DOWN;
var up = [0, 0, 1];
var g_dragging = false;
var g_worldPosition;
var g_selectedIDs;
var g_customInit;
var g_offs;
var g_finished = false;  // for selenium
var g_clients = [];
var g_lastPos;

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
key.SHIFT = 16;
key.CTRL = 17;
key.PG_UP = 33;
key.PG_DN = 34;
key.PLUS = 75;
key.MINUS = 77;

var keyIsDown = new Array();

//o3d specific global initializations
o3djs.base.o3d = o3d;
o3djs.require('o3djs.webgl');
o3djs.require('o3djs.util');
o3djs.require('o3djs.math');
o3djs.require('o3djs.rendergraph');
o3djs.require('o3djs.pack');
o3djs.require('o3djs.scene');

o3djs.require('o3djs.primitives');
o3djs.require('o3djs.material');

o3djs.require('o3djs.camera');
o3djs.require('o3djs.picking');
o3djs.require('o3djs.debug');
o3djs.require('o3djs.manipulators');

var g_o3d;
var g_math;
var g_lastEye;
var g_lastTarget;
var g_zoomed;
var g_zoomedTimer;
var g_pathTransforms = [];
var g_cameraTransforms = [];

//constants
var NORMAL_SCALE_FACTOR = 2.0;
var SHOW_NORMAL = false;

var HasWebGL=navigator.appName!="Microsoft Internet Explorer";
var g_enablePicking = true;
//var g_pickManager;  // information about the transform graph.
var g_pickInfoElem;
var g_debugHelper;
var g_debugLineGroup;
var g_debugLine;
var g_flashTimer = 0;
//var g_highlightMaterial;
//var g_highlightShape;

//multiple extension
var g_packs = [];
var g_animate_angle = [];

var g_selectedIDs;


function myLog(msg)
{
    // attempt to send a message to the console
    try
    {
        console.log(msg);
    }
    // fail gracefully if it does not exist
    catch(e){}
}

function locate(transforms,g_client,steps) {
	var bbox = null;
    for (var tt = 0; tt < transforms.length; tt++) {    	
	    var transform = transforms[tt];
	    var bbox1 = o3djs.util.getBoundingBoxOfTree(transform);
	    while (transform) {
	      bbox1 = bbox1.mul(transform.localMatrix);
	  	  transform = transform.parent;
	    }	
	    bbox = bbox ? bbox.add(bbox1) : bbox1;
    }
    var g_camera = g_client.g_camera;
    var target = g_math.lerpVector(bbox.minExtent, bbox.maxExtent, 0.5);   
    var diag = g_math.length(g_math.subVector(bbox.maxExtent,
                                              bbox.minExtent));
    var eye = g_math.addVector(target, [-0.65 * diag,-0.65 * diag,0.65 * diag]);
    g_camera.nearPlane = diag / 1000;
    g_camera.farPlane = diag * 100;
    doSetCamera(eye,target,g_angle,null,steps,g_client);
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
		var invisibleParent = getFirstInvisibleParent(transform[0]);
		if (invisibleParent) {
			hideSiblings([invisibleParent],g_client.root);	
		}
	    for (var tt = 0; tt < transform.length; tt++) {
	    	transform[tt].visible=true;
	    }
		var pickInfo = {shapeInfo:{/*shape:shape[0], */parent:{transform:transform}}};
		select(pickInfo,g_client);
	} else {
		unSelectAll();
		if (transform.length>0) hideSiblings(transform,g_client.root);
	}
    updateClient(g_client);
}

function isolateShape(id, artifactId) {
	var g_client = resolveArtifact(artifactId);
	var transform = getObjectsWithSplittings(id,g_client);
	if (transform.length>0) {
		unSelectAll();
		hideSiblings(transform,g_client.root);
	    updateClient(g_client);
	}
}

function readCamera(artifactId) {
	var g_client = resolveArtifact(artifactId);
	var g_camera = g_client.g_camera;	
	return [g_camera.eye[0],g_camera.eye[1],g_camera.eye[2],g_camera.target[0],g_camera.target[1],g_camera.target[2],g_angle,g_ortho];
}

function resolveArtifact(artifactId) {
	return document.getElementById('o3d'+artifactId).client;	
}

function setCamera(args,steps,artifactId) {
	var g_client = resolveArtifact(artifactId);
	doSetCamera([args[0],args[1],args[2]],[args[3],args[4],args[5]],args[6],args[7],steps,g_client);	  
}

function doSetCamera(eye,target,angle,ortho,steps,g_client) {
	var g_camera = g_client.g_camera;
	var oldOrtho = g_ortho;
	if (ortho!=null)
		g_ortho=ortho;
	countProgress=0;
	if (zoomId) window.clearInterval(zoomId);
	if (steps<=1) {
		g_angle=angle;
		g_camera.eye=eye;
		g_camera.target=target;
		updateCamera(g_client);
		updateProjection(g_client);
		return;
	}
	var oldEye = g_math.copyVector(g_camera.eye);
	var oldTarget = g_math.copyVector(g_camera.target);
	var oldUp = g_math.inverse( g_math.matrix4.lookAt(g_camera.eye, g_camera.target, up))[1];
	var newUp =  g_math.inverse( g_math.matrix4.lookAt(eye, target, up))[1];
	var oldAngle = g_angle;
	g_cameraHistory.push([oldEye,oldTarget,g_angle,oldOrtho,steps,g_client]);
	zoomId = window.setInterval(function() {
		countProgress++;
		var t=countProgress/steps;
		g_angle = g_math.lerpScalar(oldAngle, angle, t);
		g_camera.eye = g_math.lerpVector(oldEye, eye, t);
		g_camera.target = g_math.lerpVector(oldTarget, target, t);
		updateCamera(g_client, countProgress<steps ? g_math.lerpVector(oldUp, newUp, t) : up);
		updateProjection(g_client);
		updateClient(g_client);
		if (countProgress>=steps) 
			window.clearInterval(zoomId);
	}, 50);
	  
}

function hideShape(id, artifactId) {
	var g_client = resolveArtifact(artifactId);
	var transform = getObjectsWithSplittings(id,g_client);
	if (transform.length>0) {
		unSelectAll();
	    for (var tt = 0; tt < transform.length; tt++) {
	    	transform[tt].visible=false;
	    }
	    updateClient(g_client);
	}
}

function resetVisibility(transform) {
	transform.visible=true;
	var children = transform.children;
    for (var tt = 0; tt < children.length; tt++) {
    	resetVisibility(children[tt]);
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
		node.visible = false;
		return;
	}
	node.visible = true;
	var children = node.children;
    for (var tt = 0; tt < children.length; tt++) {
    	showOrHide(children[tt],visibleNodes,parentsOfVisibleNodes);
    }
}

function getFirstInvisibleParent(transform) {
	while (transform) {
		if (!transform.visible || (transform.parent!=null && !transform.parent.visible && transform.parent.hiddenByTransparency))
			return transform;
		transform=transform.parent;
	}
	return null;
}

function isFinallyVisible(transform) {
	while (transform) {
		if (!transform.visible)
			return false;
		transform=transform.parent;
	}
	return true;
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
    if (!g_path || g_path.lastIndexOf("o3d/modelviewer.html?artifact=")!=-1) {
    	if (!g_path) g_path = window.location.href;
	    var index = g_path.lastIndexOf('/o3d');
	    // Point at the parent directory's assets directory for the moment
        g_ids = getParameterByName(g_path,'artifact').split("-"); 
      	g_num_clients = g_ids.length;
      	NUM_DOWN = g_num_clients / NUM_ACROSS;
        for (var ii = 0; ii < g_num_clients; ii++) 
            g_paths[ii] = g_path.substring(0, index)+'/services/Artifact/GetArtifact/'+g_ids[ii]+'/scene.o3djson';
	    //if (index2==-1)
	  	//path = path.substring(0, index)+'/o3d/scene.json'; else
	   	//path = path.substring(0, index)+'/services/Artifact/GetArtifact/'+path.substring(index2+9)+'/scene.o3djson';
    } else {
        var index2 = g_path.lastIndexOf('artifact=');
        g_ids = getParameterByName(g_path,'artifact').split("-"); 
      	g_num_clients = g_ids.length;
      	NUM_DOWN = g_num_clients / NUM_ACROSS;
        for (var ii = 0; ii < g_num_clients; ii++) 
            g_paths[ii] = g_path.substring(0, index2+'artifact='.length)+g_ids[ii]+"&filename=scene.o3djson";
    }
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
	  for (var row = 0; row < NUM_DOWN; row++) {
	    var trElem = document.createElement('tr');
	    for (var column = 0; column < NUM_ACROSS; column++) {
			  var aElem = document.createElement('button');
			  aElem.style.display = 'block';
			  aElem.innerHTML = '+';
			  aElem.style.zIndex = '100';
			  aElem.type="button";
			  aElem.style.width = '100%';
			  var tdElem = document.createElement('td');
			  aElem.onclick=function(event) {
				  var td = this.parentNode;
				  if (!td.isZoomed) try {theJavaFunction("","",td.raasClient.id,0,0,0); } catch (e2) {}
				  return;
				  var asIcons = td.isZoomed;
				  var everything=document.all;
				  if (!everything) everything=document.getElementsByTagName("*");
				  for(var i=0; i<everything.length; i++) {
				  	var e=everything[i];
				  	var cl = e.raasClient;
				  	if (e.tagName=="td" || e.tagName=="TD") 
				  	if (asIcons) {
				  		e.style.display="";
				  		e.isZoomed = false;
				  		e.aElem.innerHTML = '+';
				  	} else
				  	if (e==td) {
				  		e.style.display="";
				  		e.isZoomed = true;
				  		e.aElem.innerHTML = '-';
				  		//g_zoomed = e.raasClient;
				  		//g_zoomedTimer=setTimeout("setClientSize(g_zoomed.raasClient.client);clearTimeout(g_zoomedTimer);g_zoomed.style.width = '500px",1000);
				  	} else {
				  		e.style.display="none";
				  	}
				  }			  
				  setClientSize(td.raasClient.client);
				  updateClient(td.raasClient.client);
			  };
			  if (g_num_clients>1)
			  tdElem.appendChild(aElem);
		      var objElem = createRenderer(tdElem,ii);
		      objElem.style.width = '100%';
		      objElem.style.height = g_num_clients==1 ? '100%' : 'auto';
		      tdElem.raasClient = objElem;
		      tdElem.aElem = aElem;
		      tdElem.style.width = '50%';
		      tdElem.style.height = 'auto';
		      trElem.appendChild(tdElem);
		      ii++;
			  if (g_num_clients == ii) break;
	    }
	    tbodyElem.appendChild(trElem);
		if (g_num_clients == ii) break;
	  }
	
}

function createRenderer(container,ii) {
	var objElem = HasWebGL ? o3djs.webgl.createClient(container) : createClientFallingBackToIEWebGL('o3d' + g_ids[ii],container);
    objElem.client.renderMode = objElem.o3d.Client.RENDERMODE_ON_DEMAND;
    objElem.id = 'o3d' + g_ids[ii];
    objElem.name = 'o3d' + g_ids[ii];
    return objElem;
}

function setClientSize(g_client) {
  var newWidth  = parseInt(g_client.width);
  var newHeight = parseInt(g_client.height);

  if (newWidth != g_client.g_o3dWidth || newHeight != g_client.g_o3dHeight) {
	g_client.g_o3dWidth = newWidth;
	g_client.g_o3dHeight = newHeight;
    updateProjection(g_client);
  }
}

function onWindowResize() {
	 for (var ii = 0; ii < g_num_clients; ++ii) {
		  setClientSize(g_clients[ii]);
		  updateClient(g_clients[ii]);
	 }
}

function getObjectsWithSplittings(name,g_client) {
	var pack = g_client.g_viewInfo.pack;
	var class_type_name='Transform';
	  
	class_type_name = o3d.filterTypeName_(class_type_name);
	
	name = asArray(name);
	var found = [];	
	for (var i = 0; i < pack.objects_.length; ++i) {
		var object = pack.objects_[i];
		if (object.isAClassName(class_type_name) ) {
			for (var j = 0; j < name.length; ++j) {
				if (object.name == name[j] || object.name.startsWith(name[j]+"_")) {
					found.push(object);
					break;
				}
			}
		}
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
		var southWest = g_map.getBounds().getSouthWest();
		var northEast = g_map.getBounds().getNorthEast();
		var northWest = new google.maps.LatLng(northEast.lat(),southWest.lng());
		var height = google.maps.geometry.spherical.computeDistanceBetween(northWest,southWest);
		var width = google.maps.geometry.spherical.computeDistanceBetween(northWest,northEast);
		var div = document.getElementById('clients');
		var map_canvas = g_map.getDiv();
		placeInto(sw.x+map_canvas.offsetLeft-div.offsetLeft, sw.y+map_canvas.offsetTop-div.offsetTop, width*div.offsetWidth/map_canvas.offsetWidth, height*div.offsetHeight/map_canvas.offsetHeight,g_map.getTilt()==45);
	}
}


function simulateResize() {
		for (var ii=0; ii<g_num_clients; ii++) {
			var canvas = document.getElementById('o3d' + g_ids[ii]);
			var client = g_clients[ii];
			client.g_viewInfo.clearBuffer.clearColor = g_mapenabled ? [0,0,0,0] : [1,1,1,1];
			client.normalizeClearColorAlpha = !g_mapenabled;
			// simulate the resize event			
		    var width = Math.max(1, canvas.clientWidth);
		    var height = Math.max(1, canvas.clientHeight);
		    canvas.width = width;
		    canvas.height = height;
		    canvas.sizeInitialized_ = true;
		    if (client.gl) {
		      client.gl.displayInfo = {width: canvas.width, height: canvas.height};
		    }
		 }
		onWindowResize();
}

function placeInto(px,py,width,height,tilt45) {
	if (!g_finished) return;
	
	var scale = 1/g_colladaUnit;
	var g_client = g_clients[0];
	var g_camera = g_client.g_camera;	

    var bbox = o3djs.util.getBoundingBoxOfTree(g_client.root);
    bbox = bbox.mul(g_client.root.localMatrix);
    var buildingY_in_meters = bbox.maxExtent[1] - bbox.minExtent[1];
    var buildingX_in_meters = bbox.maxExtent[0] - bbox.minExtent[0];

    myLog("Meters of building = (" + buildingX_in_meters+", "+buildingY_in_meters+") within total map space (" + width + ", " + height + ")");

    var buildingY_in_pixel = g_client.g_o3dHeight * buildingY_in_meters / height;
    
    myLog("Pixels y of building = " + buildingY_in_pixel);
    
    var eyey = (py-g_client.g_o3dHeight/2)*height/g_client.g_o3dHeight;
    var eyex = -(px-g_client.g_o3dWidth/2)*width/g_client.g_o3dWidth;
    
    myLog("Center of building in pixel = (" + px+", " + py + ") within total map space (" + g_client.g_o3dWidth+", " + g_client.g_o3dHeight + ")");
    myLog("eyex " + eyex +" eyey = " + eyey);
    
	var z  = height;
	var target = [eyex,eyey,bbox.minExtent[2]];
	var eye = [eyex,eyey-1,z+bbox.minExtent[2]];
	if (tilt45)
		eye[1] = eye[1] + height;
	
    doSetCamera(g_math.mulVectorScalar(eye,scale),g_math.mulVectorScalar(target,scale),g_angle,true,g_mapsteps,g_client);
    if (g_mapsteps==1)
    	updateClient(g_client);
    g_mapsteps = 1;

    myLog("eye="+g_camera.eye+" target="+g_camera.target);

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
            async : '../requirejs-plugins/src/async' //alias to plugin
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
    //alert("Your browser does support WebGL");
    //InitWebGLContext();
}

function OnGLCanvasFailed(canvasElement, elementId) {
    //alert("Your browser does not support WebGL");
}

function changeFillMode(mode_string, artifactId) {
	var g_client = resolveArtifact(artifactId);
	var pack = g_client.g_viewInfo.pack;
	g_fillmode = mode_string;
	updateFillMode(pack);
    updateClient(g_client);
}

function updateFillMode(pack) {
	var materials = pack.getObjectsByClassName('o3d.Material'); 
	for (var m = 0; m < materials.length; ++m) {
		var material = materials[m];
		if (material.state == null) {
			material.state = pack.createObject('State');
		}
		material.state.getStateParam('FillMode').value = getFillMode();
	}
}

function changeProjectionMode(ortho, artifactId) {
	var g_client = resolveArtifact(artifactId);
	g_ortho = ortho;
	updateProjection(g_client);
    updateClient(g_client);
}

function toggleVisibility(transform,materialName,hide) {
  var transforms = transform.children;
  for (var i = 0; i < transforms.length; ++i) {
	  toggleVisibility(transforms[i],materialName,hide);
  }
  var shapes = transform.shapes;
  for (var i = shapes.length-1;  i>=0; --i) {
	    var elements = shapes[i].elements;
	    for (var ee = 0; ee < elements.length; ee++) {
            var material=elements[ee].material;
			if (material.name.indexOf(materialName)>=0) {
				var factor = 0.1;
				if (!hide) factor = 1/factor;
				g_math.matrix4.scale(transform.localMatrix, [1,1,factor]);	
				return;
			}	
	    }
  }
}

function printLines(lines, artifactId, prefix, message) {
    g_pickInfoElem.innerHTML = message;
	var g_client = resolveArtifact(artifactId);
	var pack = g_client.g_viewInfo.pack;

    for (var tt = 0; tt < g_pathTransforms.length; tt++) {
    	var transform = g_pathTransforms[tt];
    	transform.parent = null;
    	pack.removeObject(transform);
    }

	g_pathTransforms = [];
	
	var mat = o3djs.material.createBasicMaterial(pack, g_client.g_viewInfo, [0,1,0,0.1]);
    var truncatedCone = o3djs.primitives.createTruncatedCone(
			  pack,
		      mat,
		      0.2,   // Bottom radius.
		      0.2,   // Top radius.
		      1,   // Height.
		      4,    // Number of radial subdivisions.
		      1);   // Number of vertical subdivisions.
    var startCone = o3djs.primitives.createTruncatedCone(
			  pack,
		      mat,
		      0.0,   // Bottom radius.
		      0.2,   // Top radius.
		      1,   // Height.
		      4,    // Number of radial subdivisions.
		      1);   // Number of vertical subdivisions.
    var endCone = o3djs.primitives.createTruncatedCone(
			  pack,
		      mat,
		      0.2,   // Bottom radius.
		      0.0,   // Top radius.
		      1,   // Height.
		      4,    // Number of radial subdivisions.
		      1);   // Number of vertical subdivisions.
    		
    var visited = [];
    var newSel = null;
    var pred=null;
    var prune=false;
	var lastPoint = null;
	var count=0;
    for (var tt = 0; tt < lines.length; ) {
    	if (lines[tt]==null) {
        	lastPoint = null;    
        	tt++;
        	pred=null;
        	prune=false;
    	} else {
	    	var nextPoint = [lines[tt+0]/1000,lines[tt+1]/1000,lines[tt+2]/1000];
	    	if (lastPoint!=null && !prune) {  
	  		  	  var vector = o3djs.math.subVector(nextPoint, lastPoint);
	    		  var narrowingOffs = o3djs.math.mulScalarVector(0.2, vector);
				  var _lastPointNarrowing = o3djs.math.addVector(lastPoint, narrowingOffs);
				  var _nextPointNarrowing = o3djs.math.subVector(nextPoint, narrowingOffs);
				  var start=addShape(pack,g_client,lastPoint,_lastPointNarrowing,startCone,g_pathTransforms);
				  var end=addShape(pack,g_client,_nextPointNarrowing,nextPoint,endCone,g_pathTransforms);
				  var middle=addShape(pack,g_client,_lastPointNarrowing,_nextPointNarrowing,truncatedCone,g_pathTransforms);
				  if (pred!=null)
					  pred.pred = start;
				  start.pred = middle;
				  middle.pred = pred = end;
				  middle.jumpIn = end.jumpIn =  start;
				  var costInfo = prefix+lines[tt+3];
				  middle.costInfo = end.costInfo =  start.costInfo = costInfo;
				  if (costInfo==message && (tt-5<0 || lines[tt-5]==null))
					  newSel = start;
				  if (visited[nextPoint]!=null) {
					  end.pred = visited[nextPoint];
					  prune=true;
				  }
	    		  visited[lastPoint] = start;
				  count++;
	    	}
	    	lastPoint = nextPoint;
	    	tt+=4;
    	}
    }
    if (newSel!=null) select({shapeInfo:{parent:{transform:newSel}}},g_client);
    updateClient(g_client);
}

var g_updateClientTime;

function motionByKeys(g_client) {
	var g_camera = g_client.g_camera;	
	if (keyIsDown[key.PG_UP]) {
    	g_camera.eye = g_math.lerpVector(g_camera.target, g_camera.eye, 11 / 12);
	} else
	if (keyIsDown[key.PG_DN]) {
	    g_camera.eye = g_math.lerpVector(g_camera.target, g_camera.eye, 13 / 12);
	} else {
		var deltaX=0;
		var deltaY=0;
		if (keyIsDown[key.LEFT]) deltaX = -1;
		if (keyIsDown[key.RIGHT]) deltaX = 1;
		if (keyIsDown[key.UP]) deltaY = 1;
		if (keyIsDown[key.DOWN]) deltaY = -1;	
		if (deltaX==0 && deltaY==0) return;		
		if (g_mapenabled) {
			g_mapsteps = 0;
			g_map.panBy(deltaX*10,deltaY*10);
		}
		if (keyIsDown[key.SHIFT]) {
			changePosition(-deltaX,-deltaY,g_client);
		} else {
		    g_lastEye = g_math.copyVector(g_camera.eye);
		    g_lastTarget = g_math.copyVector(g_camera.target);
			changeRotation(-deltaX/20,deltaY/20,keyIsDown[key.CTRL],g_client);
		}
	}
	updateCamera(g_client);   
	setTimeout(function(){updateClient(g_client);}, Math.max(1, 50 - g_updateClientTime));  
}

function motionByKeysAll() {
	for (var i = 0; i < g_clients.length; ++i) {
		motionByKeys(g_clients[i]);
	}
}

function changePosition(deltaX,deltaY,g_client) {
	if (deltaX==0 && deltaY==0) return;	
	var g_camera = g_client.g_camera;	
    var eye = g_math.subVector(g_camera.eye, g_camera.target);
    var axisX = g_math.cross(eye,up);
    axisX = g_math.normalize(axisX);
    var axisY = eye;//g_math.cross(eye,axisX);
    axisY[2] = 0;
    axisY = g_math.normalize(axisY);
    axisX = g_math.mulScalarVector(deltaX,axisX);
    axisY = g_math.mulScalarVector(deltaY,axisY);
    var axis = g_math.addVector(axisY, axisX);
	g_camera.target = g_math.addVector( g_camera.target, axis);   
	g_camera.eye =  g_math.addVector(g_camera.eye, axis);
}

function changeRotation(deltaX,deltaY,freehand,g_client) {

	var g_camera = g_client.g_camera;	
    var eye;

	if (freehand) {
        eye = g_math.subVector(g_lastTarget, g_camera.eye);
    } else {
        eye = g_math.subVector(g_lastEye, g_camera.target);
    }

    // rotate vertical
    var axis = g_math.cross(up, eye);
    var matrix = g_math.matrix4.axisRotation(axis, deltaY);
    var eye2 = g_math.columnMajor.mulMatrixVector(matrix, eye);  
    var axis2 = g_math.cross(up, eye2);
    if (g_math.distance(g_math.normalize(axis),g_math.normalize(axis2)) < 1) {
    	eye = eye2;
    }

    // rotate horizontal
    axis = up;
    if (freehand) deltaX = -deltaX;
    matrix = g_math.matrix4.axisRotation(axis, deltaX);
    eye = g_math.columnMajor.mulMatrixVector(matrix, eye);

    if (freehand) { 
        g_camera.target = g_math.addVector(g_camera.eye, eye);    
    } else {  
        g_camera.eye = g_math.addVector(g_camera.target, eye);
    }
}

function updateInfo(g_client) {
  var g_pickManager = g_client.g_pickManager;	
  if (!g_pickManager) {
    g_pickManager = o3djs.picking.createPickManager(g_client.root);
    g_client.g_pickManager = g_pickManager;
  }
  g_pickManager.update();
}

function unSelectAll() {
  if (g_selectedInfo) {
	var g_viewInfo = g_selectedInfo.g_client.g_viewInfo;
    var transform = asArray(g_selectedInfo.shapeInfo.parent.transform);
    for (var tt = 0; tt < transform.length; tt++) {
    	unSelectRecursive(transform[tt].jumpIn || transform[tt],g_viewInfo);
    }
    g_selectedInfo = null;
    // Turn off the debug line.
    if (!SHOW_NORMAL) return;
    g_debugLine.setVisible(false);
  }
}

function unHighlightShape(g_highlightShape,transform,g_viewInfo) {
	if (!g_highlightShape.highlightedTransform) return;
    // Remove it from the transform of the selected object.
    transform.removeShape(g_highlightShape);
    // Remove everything related to it.
    o3djs.shape.deleteDuplicateShape(g_highlightShape, g_viewInfo.pack);
    g_highlightShape = null;
    if (transform.pred!=null) 
        for (var ss = transform.pred.shapes.length-1; ss >= 0; ss--) {
        	unHighlightShape(transform.pred.shapes[ss],transform.pred,g_viewInfo);
        }
}

function unSelectRecursive(transform,g_viewInfo) {
    for (var tt = 0; tt < transform.children.length; tt++) {
    	unSelectRecursive(transform.children[tt],g_viewInfo);
      }
    for (var ss = transform.shapes.length-1; ss >= 0; ss--) {
    	unHighlightShape(transform.shapes[ss],transform,g_viewInfo);
      }
}

function select(pickInfo,g_client) {
  unSelectAll();
  if (pickInfo) {
    g_selectedInfo = pickInfo;
    g_selectedInfo.g_client = g_client;
    var g_viewInfo = g_client.g_viewInfo;
    var transform = asArray(g_selectedInfo.shapeInfo.parent.transform);

    for (var tt = 0; tt < transform.length; tt++) {
	    if (g_selectedInfo.shapeInfo.shape && !transform[tt].jumpIn) {
	    	highlightShape(g_selectedInfo.shapeInfo.shape,transform[tt],g_viewInfo);
	    } else {
	      	selectRecursive(transform[tt].jumpIn || transform[tt],g_viewInfo);
	    }
	    if (transform[tt].costInfo!=null)
	    	g_pickInfoElem.innerHTML = transform[tt].costInfo;
    }
    g_flashTimer = 0.0;  // make it change color immediately.
  }
}

function highlightShape(shape,transform,g_viewInfo) {
    // make a copy of the selected shape so we can use it to highlight.
    var g_highlightShape = o3djs.shape.duplicateShape(
    	g_viewInfo.pack,
        shape,
        'highlight_');
    // Set all of it's elements to use the highlight material.
    var elements = g_highlightShape.elements;
    for (var ee = 0; ee < elements.length; ee++) {
      elements[ee].material = g_viewInfo.g_highlightMaterial;
    }
    g_highlightShape.highlightedTransform = true;

    // Add it to the same transform
    transform.addShape(g_highlightShape);
    
    if (transform.pred!=null) 
        for (var ss = transform.pred.shapes.length-1; ss >= 0; ss--) {
        	highlightShape(transform.pred.shapes[ss],transform.pred,g_viewInfo);
          }
}

function selectRecursive(transform,g_viewInfo) {
    for (var tt = 0; tt < transform.children.length; tt++) {
    	selectRecursive(transform.children[tt],g_viewInfo);
      }
    for (var ss = transform.shapes.length-1; ss >= 0; ss--) {
    	highlightShape(transform.shapes[ss],transform,g_viewInfo);
      }
}

function onrender_picking(renderEvent) {
  g_flashTimer += renderEvent.elapsedTime;
  g_flashTimer = g_flashTimer % 0.5;
  if (g_selectedInfo) {
	var g_highlightMaterial = g_selectedInfo.g_client.g_viewInfo.g_highlightMaterial;
    if (g_flashTimer < 0.25) {
      //g_highlightMaterial.getParam('emissive').value = [1, 1, 1, 0.5];
    } else {
      //g_highlightMaterial.getParam('emissive').value = [0, 0, 0, 0];
    }
  }
}

function mouseIsOut(e) {
	g_lastPos = null;
}

function mouseIsIn(e) {
	if (e.which!=1) g_dragging = false;
	g_lastPos = null;
}

function onDocumentMouseMove(e) {
   if (e.which!=1) g_dragging = false;
  if (g_dragging) {  
	  if (g_lastPos==null) {
		  g_lastPos = [e.x, e.y];
		return;
	  }
	var g_client = e.currentTarget.client;
	var g_camera = g_client.g_camera;	

	if (g_mapenabled) {
	    var deltaX = -(e.x-g_lastPos[0]);
	    var deltaY = -(e.y-g_lastPos[1]);
	    g_map.panBy(deltaX,deltaY);
	    g_lastPos = [e.x, e.y];
	    return;
	} else
	if (e.shiftKey) {
		var g_viewInfo = g_client.g_viewInfo;	
		var worldRay = o3djs.picking.clientPositionToWorldRay(
		    e.x,
		    e.y,
		    g_viewInfo.drawContext,
		    g_client.width,
		    g_client.height);
		var dragPlane_ = new o3djs.manipulators.Plane_(up, g_worldPosition || g_camera.target);
		var intersectPoint = dragPlane_.intersectRay(worldRay.near,
		  o3djs.math.subVector(worldRay.far, worldRay.near));
		if (intersectPoint) {
			g_worldPosition = g_worldPosition || intersectPoint;
		 	var offs = o3djs.math.subVector(intersectPoint, g_worldPosition);
		 	if (g_selectedInfo) {
			    var transform = asArray(g_selectedInfo.shapeInfo.parent.transform);
			    for (var tt = 0; tt < transform.length; tt++) {
				    if (transform[tt].draggable || e.altKey) {
				    	  g_offs = g_math.addVector(g_offs || [0,0,0], offs);
				    	  var mInverse = o3djs.math.inverse4(transform[tt].getUpdatedWorldMatrix());
				    	  var localOffs = o3djs.math.subVector(o3d.Transform.transformPoint(mInverse, intersectPoint), o3d.Transform.transformPoint(mInverse, g_worldPosition));						  
						  transform[tt].translate(localOffs);
						  offs = [0,0,0];
				    }
			    }
			    if (g_offs) g_worldPosition = intersectPoint;
		    }
		 	g_camera.target = g_math.subVector(g_camera.target, offs);   
			g_camera.eye =  g_math.subVector(g_camera.eye, offs);
		}
	} else {		
	    var deltaX = -(e.x-g_lastPos[0]) / 200;
	    var deltaY = -(e.y-g_lastPos[1]) / 200;
	    changeRotation(deltaX, deltaY, e.ctrlKey, g_client);
	}
    g_lastEye = g_math.copyVector(g_camera.eye);
    g_lastTarget = g_math.copyVector(g_camera.target);
    g_lastPos = [e.x, e.y];
    
    updateCamera(g_client);
	setTimeout(function(){updateClient(g_client);}, Math.max(1, 50 - g_updateClientTime));  
  }
}

function onDocumentMouseDown(e) {
  //window.focus(); // enable keys in iframe
  var g_client = e.currentTarget.client;
  var g_viewInfo = g_client.g_viewInfo;	
  var g_pickManager = g_client.g_pickManager;	
  if (!g_pickManager) return;
  var worldRay = o3djs.picking.clientPositionToWorldRay(
      e.x,
      e.y,
      g_viewInfo.drawContext,
      g_client.width,
      g_client.height);
  var oldSelection = g_selectedInfo ? asArray(g_selectedInfo.shapeInfo.parent.transform) : [];
  unSelectAll();

  // Update the entire tree in case anything moved.
  // NOTE: This function is very SLOW!
  // If you really want to use picking you should manually update only those
  // transforms and shapes that moved, were added, or deleted by writing your
  // own picking library. You should also make sure that you are only
  // considering things that are pickable. By that I mean if you have a scene of
  // a meadow with trees, grass, bushes, and animals and the only thing the user
  // can pick is the animals then put the animals on their own sub branch of the
  // transform graph and only pick against that subgraph.
  // Even better, make a separate transform graph with only cubes on it to
  // represent the animals and use that instead of the actual animals.
  g_pickManager.update();

  var pickInfo = g_pickManager.pick(worldRay);
  if (pickInfo && (e.ctrlKey || e.which==3 && oldSelection.indexOf(pickInfo.shapeInfo.parent.transform) != -1)) {
	  if (e.ctrlKey)
	  if (oldSelection.indexOf(pickInfo.shapeInfo.parent.transform) == -1)
		  oldSelection.push(pickInfo.shapeInfo.parent.transform); else
	      o3d.removeFromArray(oldSelection,pickInfo.shapeInfo.parent.transform);
	  pickInfo = {worldIntersectionPosition:pickInfo.worldIntersectionPosition,shapeInfo:{parent:{transform:oldSelection}}};
  }  
  pickForInfo(pickInfo,g_client,e);
  updateClient(g_client);
  
  if (e.which!=3) {
	  var g_client = e.currentTarget.client;
	  var g_camera = g_client.g_camera;	
	  
	  g_lastEye = g_math.copyVector(g_camera.eye);
	  g_lastTarget = g_math.copyVector(g_camera.target);
	  g_lastPos = [e.x, e.y];
	  g_offs = null;
	
	  g_dragging = true;
  }

}

function pickForInfo(pickInfo,g_client,e) {
  if (pickInfo) {
    select(pickInfo,g_client);
    g_worldPosition = pickInfo.worldIntersectionPosition;
    g_selectedIDs = "";
    var elements = pickInfo.shapeInfo.shape ? pickInfo.shapeInfo.shape.elements : [];
    for (var ee = 0; ee < elements.length; ee++) {
    	type = elements[ee].material.name;
    }
    var transform=asArray(g_selectedInfo.shapeInfo.parent.transform);
    for (var ee = 0; ee < transform.length; ee++) {
    	g_selectedIDs += transform[ee].name + " ";
    }
    myLog( g_selectedIDs+' ' +type );
    myLog( 'worldIntersectionPosition = ' +g_worldPosition );
    setTimeout(function(){try { if (e) theJavaFunction(g_selectedIDs,type,e.currentTarget.id,e.clientX,e.clientY,e.which,e.type); } catch (e2) {}},100);
    if (!SHOW_NORMAL) return;

    // Display the normal
    // NOTE: Lookup the normal with this function is very SLOW!!
    // If you need performance, for a game or something, you should consider
    // other methods.
    var normal = o3djs.element.getNormalForTriangle(
        pickInfo.element,
        pickInfo.rayIntersectionInfo.primitiveIndex);

    // Convert the normal from local to world space.
    normal = g_math.matrix4.transformNormal(
        pickInfo.shapeInfo.parent.transform.worldMatrix,
        normal);

    // Remove the scale from the normal.
    normal = g_math.normalize(normal);

    // Get the world position of the collision.
    var worldPosition = pickInfo.worldIntersectionPosition;

    // Add the normal to it to get a point in space above it with some
    // multiplier to scale it.
    var normalSpot = g_math.addVector(
        worldPosition,
        g_math.mulVectorScalar(normal, NORMAL_SCALE_FACTOR));

    // Move our debug line to show the normal
    g_debugLine.setVisible(true);
    g_debugLine.setEndPoints(worldPosition, normalSpot);
  } else {
    setTimeout(function(){try { if (e) theJavaFunction("","","",e.clientX,e.clientY,e.which,e.type); } catch (e2) {}},100);
    g_pickInfoElem.innerHTML = '';
    g_worldPosition = null;
  }
}

function onDocumentMouseUp(e) {
  g_dragging = false;
  if (g_selectedInfo && g_offs) {
	  var x = g_offs[0];
	  var y = g_offs[1];
	  setTimeout(function(){try { if (e) theJavaFunction(g_selectedIDs,"",e.currentTarget.id,x,y,e.which,"drop"); } catch (e2) {}},100);
  }
}

function onDocumentMouseWheel(e) {
  if (e.deltaY) {
	  if (g_mapenabled) {
		  g_mapsteps = 3;
		  g_map.setZoom(g_map.getZoom()+(e.deltaY > 0 ? 1 : -1));
		  return;
	  }
	var g_client = e.currentTarget.client;
	var g_camera = g_client.g_camera;	
    var t = 1;
    if (e.deltaY > 0)
      t = 11 / 12;
    else
      t = 13 / 12;
    g_camera.eye = g_math.lerpVector(g_camera.target, g_camera.eye, t);

    updateCamera(g_client);
    updateClient(g_client);
  }
}


// invalidates defaulted boxes which otherwise would be returned by o3djs.util.getBoundingBoxOfTree
var fixBoundingBoxOfTree = function(treeRoot) {
  var box = treeRoot.boundingBox;
  if (box.valid && box.minExtent[0]==-1 && box.minExtent[1]==-1 && box.minExtent[2]==-1 && box.maxExtent[0]==1 && box.maxExtent[1]==1 && box.maxExtent[2]==1) {
	  box.valid = false;
  }
  var transforms = treeRoot.children;
  for (var i = 0; i < transforms.length; ++i) {
	fixBoundingBoxOfTree(transforms[i]);
  }
};

var hideInvisibleMaterials = function(transform) {
  var shapes = transform.shapes;
  for (var i = shapes.length-1;  i>=0; --i) {
	    var elements = shapes[i].elements;
	    for (var ee = 0; ee < elements.length; ee++) {
	    	if (!elements[ee].material.getParam('diffuse')) continue;
            var materialColor=elements[ee].material.getParam('diffuse').value;
            if (materialColor[3]==0 || materialColor[3]==0.0) {
        	    transform.removeShape(shapes[i]);
        	    transform.hiddenByTransparency=true;
            	break;
            }            
	    }
  }
  var transforms = transform.children;
  for (var i = 0; i < transforms.length; ++i) {
	  hideInvisibleMaterials(transforms[i]);
  }
};

function updateCamera(g_client,_up) {
  var g_viewInfo = g_client.g_viewInfo;	
  var g_camera = g_client.g_camera;	
  var g_lightPosParam = g_client.g_lightPosParam;	
  
  g_viewInfo.drawContext.view = g_math.matrix4.lookAt(g_camera.eye,
                                                      g_camera.target,
                                                      _up!=null?_up:up);
  g_lightPosParam.value = g_camera.eye;
  
  if (g_ortho) updateProjection(g_client);
}

function updateProjection(g_client) {
  var g_viewInfo = g_client.g_viewInfo;	
  var g_camera = g_client.g_camera;	
  
  var aspect = g_client.g_o3dWidth / g_client.g_o3dHeight;
  
  if (g_ortho) {
	  if (g_camera.target!=null && g_camera.eye!=null) {
		  var le = g_math.distance(g_camera.target, g_camera.eye);
		  g_viewInfo.drawContext.projection = g_math.matrix4.orthographic(
		      -le/2 * aspect, le/2 * aspect,
		      -le/2, le/2,
		      g_camera.nearPlane, g_camera.farPlane);
	  }
  } else
  // Create a perspective projection matrix.
  g_viewInfo.drawContext.projection = g_math.matrix4.perspective(
    g_math.degToRad(g_angle), aspect, g_camera.nearPlane,
    g_camera.farPlane);
}

function enableInput(enable) {
}

function loadFile(g_client, g_pack, context, g_viewInfo, path) {
  function callback(pack, g_root, exception) {
    enableInput(true);
    if (exception) {
      alert("Could not load: " + path + "\n" + exception);
      g_loadingElement.innerHTML = "loading failed.";
    } else {
      g_loadingElement.style.display = "none";
      // Assign custom colors to materials
      var materials = pack.getObjectsByClassName('o3d.Material'); 
      //var colors = custom_colors ? custom_colors : g_colors;
      for (var m = 0; m < materials.length; ++m) {
        var material = materials[m];
        var materialName = material.name;
        if (materialName.lastIndexOf("-material")!=-1)
        	materialName = materialName.substring(0,materialName.lastIndexOf("-material"));
        var materialColor = g_colors[materialName];
        if (!materialColor && materialName.length>3) {
        	materialName = materialName.substring(3);
        	materialColor = g_colors[materialName]
        }
        if (materialColor) {
        	material.getParam('specular').value = [.1, .1, .1, 1];  
            material.getParam('diffuse').value =materialColor;
            if (materialColor[3]!=1) {
                //material.createParam('collada.transparent', 'o3d.ParamBoolean').value = 1;
            	material.drawList = g_viewInfo.zOrderedDrawList; // see o3djs.material.prepareMaterial
            }
        }
      }
      if (getFillMode()!=o3d.State.SOLID) updateFillMode(pack);
      hideInvisibleMaterials(g_client.root);
      // Generate draw elements and setup material draw lists.
      o3djs.pack.preparePack(pack, g_viewInfo);
      fixBoundingBoxOfTree(g_client.root);
      locate([g_client.root],g_client,1);

      // Manually connect all the materials' lightWorldPos params to the context
      var materials = pack.getObjectsByClassName('o3d.Material');
      for (var m = 0; m < materials.length; ++m) {
        var material = materials[m];
        var param = material.getParam('lightWorldPos');
        if (param) {
          param.bind(g_client.g_lightPosParam);
        }
      }
      
      // return true by default only if bounding box is defined, to prevent NPEs
      o3djs.picking.ShapeInfo.prototype.isPickable = function() {
        return this.getBoundingBox();
      };
      // Update our info
      updateInfo(g_client);

      g_finished = true;  // for selenium

      // Comment out the next line to dump lots of info.
      if (false) {
        o3djs.dump.dump('---dumping context---\n');
        o3djs.dump.dumpParamObject(context);

        o3djs.dump.dump('---dumping root---\n');
        o3djs.dump.dumpTransformTree(g_client.root);

        o3djs.dump.dump('---dumping render root---\n');
        o3djs.dump.dumpRenderNodeTree(g_client.renderGraphRoot);

        o3djs.dump.dump('---dump g_pack shapes---\n');
        var shapes = pack.getObjectsByClassName('o3d.Shape');
        for (var t = 0; t < shapes.length; t++) {
          o3djs.dump.dumpShape(shapes[t]);
        }

        o3djs.dump.dump('---dump g_pack materials---\n');
        var materials = pack.getObjectsByClassName('o3d.Material');
        for (var t = 0; t < materials.length; t++) {
          o3djs.dump.dump (
              '  ' + t + ' : ' + materials[t].className +
              ' : "' + materials[t].name + '"\n');
          o3djs.dump.dumpParams(materials[t], '    ');
        }

        o3djs.dump.dump('---dump g_pack textures---\n');
        var textures = pack.getObjectsByClassName('o3d.Texture');
        for (var t = 0; t < textures.length; t++) {
          o3djs.dump.dumpTexture(textures[t]);
        }

        o3djs.dump.dump('---dump g_pack effects---\n');
        var effects = pack.getObjectsByClassName('o3d.Effect');
        for (var t = 0; t < effects.length; t++) {
          o3djs.dump.dump ('  ' + t + ' : ' + effects[t].className +
                  ' : "' + effects[t].name + '"\n');
          o3djs.dump.dumpParams(effects[t], '    ');
        }
      }
      if (g_customInit) g_customInit();
      initializeMap();
      if (g_mapenabled) {
    	  return;
      }
      updateClient(g_client);
      setTimeout(function() {updateClient(g_client);},10); //required by new version of IE renderer
    }
  }

  //!g_pack = g_client.createPack();

  // Create a new transform for the loaded file
  var parent = g_pack.createObject('Transform');
  parent.parent = g_client.root;
  if (path != null) {
    g_loadingElement.innerHTML = "Loading: " + path;
    enableInput(false);
    try {
      var secondCounter = g_pack.createObject('SecondCounter');
      secondCounter.countMode = o3d.Counter.CYCLE;
      secondCounter.start = 0;
      secondCounter.end = 1;
      o3djs.scene.loadScene(g_client, g_pack, parent, path, callback,
        {opt_animSource: secondCounter.getParam('count')});
    } catch (e) {
      enableInput(true);
      g_loadingElement.innerHTML = "loading failed : " + e;
    }
  }
  return parent;
}

/**
 *  Called every frame.
 */
function onRender(renderEvent) {
  // If we don't check the size of the client area every frame we don't get a
  // chance to adjust the perspective matrix fast enough to keep up with the
  // browser resizing us.
  setClientSize(this);
  if (g_enablePicking && g_selectedInfo && this==g_selectedInfo.g_client) onrender_picking(renderEvent);
  motionByKeys(this);
}

/**
 * Creates the client area.
 */
function start() {   

	if (getParameterByName(document.URL,"lat") && getParameterByName(document.URL,"lng") && getParameterByName(document.URL,"apikey")) {
		g_mapcenter = [Number(getParameterByName(document.URL,"lat")), Number(getParameterByName(document.URL,"lng"))];  
		g_mapapikey = getParameterByName(document.URL,"apikey");
		g_mapenabled = true;
	}
	initializeMap();
	
	document.onkeydown = function(e) {
	  var keyChar = o3djs.event.getEventKeyChar(e);
	  if (!keyIsDown[keyChar]) {
		  keyIsDown[keyChar] = true;
		  motionByKeysAll();
		  if (keyChar==key.S || keyChar==key.W || keyChar==key.D || keyChar==key.A || keyChar==key.R) {				  
			  	var g_client = g_clients[0];
			  	if (keyChar==key.S) toggleVisibility(g_client.root, "Space", g_client.hideSpaces = !g_client.hideSpaces);
			  	if (keyChar==key.W) toggleVisibility(g_client.root, "Wall", g_client.hideWalls = !g_client.hideWalls);
			  	if (keyChar==key.D) toggleVisibility(g_client.root, "Door", g_client.hideDoors = !g_client.hideDoors);
			  	if (keyChar==key.R) toggleVisibility(g_client.root, "", g_client.hideModel = !g_client.hideModel);
				updateClient(g_client);
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
	};
	document.onkeyup = function(e) {
	  var keyChar = o3djs.event.getEventKeyChar(e);
	  keyIsDown[keyChar] = false;
	};
	
	calcPaths();
 
	buildTable();
	
      window.onresize = onWindowResize;

	  // wait for the browser to settle down.
	  var clearId = window.setInterval(function() {
	    var lastClient = g_num_clients - 1;
	    var element = document.getElementById('o3d' + g_ids[lastClient]);
	    if (!element || element && !element.o3d) {
	      return;
	    }
	    window.clearInterval(clearId);
	    setup();
	  }, 10);
}


function setup() {
  // Lookup all the clients.
  for (var ii = 0; ii < g_num_clients; ++ii) {
    g_clients[ii] = document.getElementById('o3d' + g_ids[ii]).client;
  }

  // Get constants and math functions.
  g_o3d = document.getElementById('o3d'+g_ids[0]).o3d;
  g_math = o3djs.math;

  // For each client make a cube, context, effect,...
  for (ii = 0; ii < g_num_clients; ii++) {
    // Create a pack to manage our resources/assets
    g_packs[ii] = g_clients[ii].createPack();

    // Create the render graph for a view.
    g_clients[ii].g_viewInfo = o3djs.rendergraph.createBasicView(
        g_packs[ii],
        g_clients[ii].root,
        g_clients[ii].renderGraphRoot,  [1, 1, 1, 1]);
    g_clients[ii].normalizeClearColorAlpha = true;

    g_animate_angle[ii] = 0;

    // Create our projection matrix, with a vertical field of view of 45 degrees
    // a near clipping plane of 0.1 and far clipping plane of 100.
    g_clients[ii].g_viewInfo.drawContext.projection = g_math.matrix4.perspective(
        g_math.degToRad(g_angle),
        128 / 128,
        0.1,
        100);
    initStep2(document.getElementById('o3d' + g_ids[ii]),g_clients[ii],g_packs[ii],g_clients[ii].g_viewInfo,g_paths[ii]);
  }

  // Set our render callback for animation.
  // This sets a function to be executed every time a frame is rendered.
  //g_clients[0].setRenderCallback(onrender);
  g_setupDone = true;
}

/**
 * Initializes O3D and loads the scene into the transform graph.
 * @param {Array} clientElements Array of o3d object elements.
 */
function initStep2(g_o3dElement,g_client,g_mainPack,g_viewInfo,url) {
  g_loadingElement = document.getElementById('loading');

  g_math = o3djs.math;

  var g_camera = {
    farPlane: 5000,
    nearPlane:0.1
  };
  g_client.g_camera=g_camera;
  setClientSize(g_client);

  // Set the light at the same position as the camera to create a headlight
  // that illuminates the object straight on.
  var paramObject = g_mainPack.createObject('ParamObject');
  g_client.g_lightPosParam = paramObject.createParam('lightWorldPos', 'ParamFloat3');
  g_camera.target = [0, 0, 0];
  g_camera.eye = [0, 0, 5];
  updateCamera(g_client);

  doload(g_client,g_mainPack,g_viewInfo,url);

  if (g_enablePicking)
  {
  var g_pack = g_mainPack;
  g_pickInfoElem = document.getElementById('pickInfo');
	  
  // Use the debug library to create a line we can position to show
  // the normal.
  g_debugHelper = o3djs.debug.createDebugHelper(g_client.createPack(),
                                                g_viewInfo);
  g_debugLineGroup = g_debugHelper.createDebugLineGroup(g_client.root);
  g_debugLine = g_debugLineGroup.addLine();
  g_debugLine.setColor([0,1,0,1]);
  g_debugLine.setVisible(false);

  // Create a material for highlighting.
  g_viewInfo.g_highlightMaterial = o3djs.material.createBasicMaterial(
      g_pack,
      g_viewInfo,
      [1, 0, 0, 1], true);
  g_viewInfo.g_highlightMaterial.getParam('specular').value = [.1, .1, .1, 1];  
  // Setup a state to bring the lines forward.
  var state = g_pack.createObject('State');
  state.getStateParam('PolygonOffset2').value = -1.0;
  state.getStateParam('FillMode').value = g_o3d.State.SOLID;
  g_viewInfo.g_highlightMaterial.state = state;

  // Creates a transform to put our data on.
  var my_data_root = g_pack.createObject('Transform');

  // Connects our root to the client's root.
  my_data_root.parent = g_client.root;

  // Start picking; it won't do anything until the scene finishes loading.
  if (o3djs.event.addEventListener)
  o3djs.event.addEventListener(g_o3dElement, 'mousedown', onDocumentMouseDown);
  o3djs.event.addEventListener(g_o3dElement, 'dblclick', onDocumentMouseDown);
 }

  if (o3djs.event.addEventListener) {
  o3djs.event.addEventListener(g_o3dElement, 'mousemove', onDocumentMouseMove);
  o3djs.event.addEventListener(g_o3dElement, 'mouseout', mouseIsOut);
  o3djs.event.addEventListener(g_o3dElement, 'mousein', mouseIsIn);
  o3djs.event.addEventListener(g_o3dElement, 'mouseup', onDocumentMouseUp);
  if (g_num_clients == 1)
  o3djs.event.addEventListener(g_o3dElement, 'wheel', onDocumentMouseWheel);
  }

  g_client.setRenderCallback(onRender);
}

/**
 * Removes any callbacks so they don't get called after the page has unloaded.
 */
function uninit() {
  if (g_clients[0]) {
    g_clients[0].cleanup();
  }
}

function doload(g_client,g_pack,g_viewInfo,url) {
//  if (g_root) {
//    g_root.parent = null;
//    g_root = null;
//  }
//  if (g_pack) {
//    g_pack.destroy();
//    g_pack = null;
//  }
  loadFile(g_client,g_pack,g_viewInfo.drawContext, g_viewInfo, url);
}

if (typeof String.prototype.startsWith != 'function') {
	  String.prototype.startsWith = function (str){
	    return this.slice(0, str.length) == str;
	  };
}

/**
 * Updates the line with the current start and end settings.
 * @private
 */
/*o3djs.debug.DebugLine.prototype.update_*/function update_(transform_,start_,end_) {
  var math = o3djs.math;
  var vector = math.subVector(end_, start_);
  var offs = o3djs.math.mulScalarVector(0.5, vector);
  start_ = o3djs.math.addVector(start_, offs);
  end_ = o3djs.math.addVector(end_, offs);	
  var direction = math.normalize(vector);
  var dot = math.dot(direction, [0, 1, 0]);
  var perp1;
  var perp2;
  if (dot > 0.99) {
    perp2 = math.cross([1, 0, 0], direction);
    perp1 = math.cross(perp2, direction);
  } else {
    perp1 = math.cross([0, 1, 0], direction);
    perp2 = math.cross(perp1, direction);
  }
  transform_.localMatrix =
      [math.normalize(perp2).concat(0),
       math.normalize(direction).concat(0),
       math.normalize(perp1).concat(0),
       start_.concat(1)];
  transform_.scale(1, math.length(vector), 1);
  if (!(dot > 0.99))
	  transform_.scale(1, 1, -1);
};

function addShape(pack,g_client,_lastPoint,_nextPoint,shape,g_pathTransforms) {
	  var transform = pack.createObject('Transform');
	  transform.addShape(shape);
	  if (_nextPoint!=null)
		  update_(transform,_lastPoint,_nextPoint);
	  else
		  transform.translate(_lastPoint);
	  transform.parent = g_client.root;
	  g_pathTransforms.push(transform);    		
	  return transform;
};

function printCameras(lines, artifactId) {
	var g_client = resolveArtifact(artifactId);
	var pack = g_client.g_viewInfo.pack;

    for (var tt = 0; tt < g_cameraTransforms.length; tt++) {
    	var transform = g_cameraTransforms[tt];
    	transform.parent = null;
    	pack.removeObject(transform);
    }

    g_cameraTransforms = [];

	var mat = o3djs.material.createBasicMaterial(pack, g_client.g_viewInfo, [0,0,1,0.5],true);
	var mat2 = o3djs.material.createBasicMaterial(pack, g_client.g_viewInfo, [0,0,1,0.1]);
	mat.getParam('specular').value = [.1, .1, .1, 1];  
    var startCone = o3djs.primitives.createTruncatedCone(
			  pack,
		      mat,
		      0.0,   // Bottom radius.
		      0.2,   // Top radius.
		      1,   // Height.
		      8,    // Number of radial subdivisions.
		      1);   // Number of vertical subdivisions.  
//    var startCone = o3djs.primitives.createDisc(
//			  pack,
//		      mat,
//		      1,   // Radius.
//		      3);  // Stack Power (optional).
    var sphere = o3djs.primitives.createTorus(
    		  pack,
    	      mat2,
    	      0.2,0.15,   // Radius of the sphere.
    	      16,    // Number of meridians.
    	      8);   // Number of parallels.
//    var sphere = o3djs.primitives.createSphere(
//    		pack,
//    	      mat2,
//    	      0.2,   // Radius of the sphere.
//    	      30,    // Number of meridians.
//    	      20);   // Number of parallels.

    		  
    for (var tt = 0; tt < lines.length; ) {
	    	var lastPoint = [lines[tt+0],lines[tt+1],lines[tt+2]];
	    	var nextPoint = [lines[tt+3],lines[tt+4],lines[tt+5]];
			var vector = o3djs.math.subVector(nextPoint, lastPoint);
			var narrowingOffs = o3djs.math.mulScalarVector(0.5, vector);
			var _lastPointNarrowing = o3djs.math.addVector(lastPoint, narrowingOffs);
			var start = addShape(pack,g_client,lastPoint,_lastPointNarrowing,startCone,g_cameraTransforms);
			var torus = addShape(pack,g_client,[lastPoint[0],lastPoint[1],lastPoint[2]-0.5],[lastPoint[0],lastPoint[1],lastPoint[2]+0.5],sphere,g_cameraTransforms);
			torus.draggable = true;
			start.pred = torus;
			start.name=torus.name=lines[tt+8];
	    	tt+=9;
    }
    updateClient(g_client);
}

function printIncidents(lines, artifactId) {
	// todo
}

function getFillMode() {
	switch (g_fillmode) {
	case 'Point':
		return o3d.State.POINT;
	case 'Wireframe':
		return o3d.State.WIREFRAME;
	case 'Solid':
		return o3d.State.SOLID;
	}
	return o3d.State.SOLID;
}

function updateClient(g_client) {
  var updateClientStart=new Date().getTime();
  // If we are in RENDERMODE_ON_DEMAND mode then set the render mode again
  // which will cause the client re-render the display.
  if (g_client.renderMode == g_o3d.Client.RENDERMODE_ON_DEMAND) {
    g_client.render();
  }
  g_updateClientTime=new Date().getTime() - updateClientStart;
}

/**
 * Creates a canvas under the given parent element and an o3d.Client
 * under that.
 *
 * @param {!Element} element The element under which to insert the client.
 * @param {string} opt_features Features to turn on.
 * @param {boolean} opt_debug Whether gl debugging features should be
 *     enabled.
 * @return {HTMLCanvas} The canvas element, or null if initializaton failed.
 */
function createClientFallingBackToIEWebGL(id, element, opt_features, opt_debug) {
  opt_features = opt_features || '';
  opt_debug = opt_debug || false;

  // If we're creating a webgl client, the assumption is we're using webgl,
  // in which case the only acceptable shader language is glsl.  So, here
  // we set the shader language to glsl.
  o3djs.effect.setLanguage('glsl');

  // Make the canvas automatically resize to fill the containing
  // element (div), and initialize its size correctly.
  var canvas;
  canvas = WebGLHelper.CreateGLCanvas(element,
		  id, false, OnGLCanvasCreated, OnGLCanvasFailed);
  //canvas = document.createElement('canvas');

  if (!canvas || !canvas.getContext) {
    o3djs.webgl.webGlCanvasError(element, 'HTMLCanvas');
    return null;
  }

  canvas.style.width = "100%";
  canvas.style.height = "100%";

  var client = new o3d.Client;

  var resizeHandler = function() {
    var width = Math.max(1, canvas.clientWidth);
    var height = Math.max(1, canvas.clientHeight);
    canvas.width = width;
    canvas.height = height;
    canvas.sizeInitialized_ = true;
    if (client.gl) {
      client.gl.displayInfo = {width: canvas.width, height: canvas.height};
    }
  };
  if (window.addEventListener) {
  window.addEventListener('resize', resizeHandler, false);
  setTimeout(resizeHandler, 0);
  }
  
  if (!client.initWithCanvas(canvas)) {
    o3djs.webgl.webGlCanvasError(element, 'WebGL context');
    return null;
  }

  // This keeps the cursor from changing to an I-beam when the user clicks and
  // drags.  It's easier on the eyes.
  function returnFalse() {
    return false;
  }
  document.onselectstart = returnFalse;
  document.onmousedown = returnFalse;

  canvas.client = client;
  canvas.o3d = o3d;

  if (opt_debug) {
    client.gl = o3djs.webgl.addDebuggingWrapper(client.gl);
  }

  //element.appendChild(canvas);
  return canvas;
};
