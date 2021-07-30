
import {
	BoxGeometry, Object3D, Clock, Intersection, Raycaster, BufferGeometry, Curve, Mesh, SkinnedMesh, Vector3,
	Vector2, Vector4, Color, Box3, Sphere, Camera, Scene, WebGLRenderer, Material, MeshPhongMaterial, ShaderMaterial,
	Texture, Light, AmbientLight, PointLight, DirectionalLight, BufferAttribute,
	DoubleSide, SmoothShading, RGBFormat, BackSide, FrontSide, RepeatWrapping, MixOperation, FlatShading, MultiplyOperation,
	SphereGeometry, ExtrudeGeometryOptions, ExtrudeGeometry, TubeGeometry, PlaneGeometry, OctahedronGeometry, TextGeometry, MathUtils, Shape,
	Path, LineBasicMaterial, Line, ImageUtils, ShaderLib, MeshBasicMaterial, Sprite, Matrix4,
	OrthographicCamera, PerspectiveCamera, UniformsUtils, Matrix3, MeshLambertMaterial, Group, MeshPhongMaterialParameters, CubeRefractionMapping
} from "three";

import { Face3 } from "three/examples/jsm/deprecated/Geometry";
import { Geometry } from "three/examples/jsm/deprecated/Geometry";
import { GLTFLoader } from "three/examples/jsm/loaders/GLTFLoader";
import { ColladaLoader, Collada } from "three/examples/jsm/loaders/ColladaLoader";
import { VertexNormalsHelper } from "three/examples/jsm/helpers/VertexNormalsHelper";
import { OrbitControls } from "three/examples/jsm/controls/OrbitControls";
import { NURBSCurve } from "three/examples/jsm/curves/NURBSCurve";
import { NURBSUtils } from "three/examples/jsm/curves/NURBSUtils";
import { WEBGL } from "three/examples/jsm/WebGL";
import { BufferGeometryUtils } from "three/examples/jsm/utils/BufferGeometryUtils";
import { SceneUtils } from "three/examples/jsm/utils/SceneUtils";


import { GUIController, GUI } from "dat.gui";

interface TreeItem { id:string, text:string, state: { loaded: boolean }, children?: TreeItem[]};

//import "./augmentation";

class MyOrbitControls extends OrbitControls {
    active: boolean = false;
}

interface TClient extends HTMLCanvasElement {
	hideSpaces: boolean;
	g_colors: { [color: string]: Material };
	renderer: WebGLRenderer;
	name: string;
	scene: Scene;
	scene2: Scene;
	root: Object3D;
	originalRoot: Object3D;
	g_camera: Camera;
	plane: Mesh;
	object: Object3D[];
	additionalCamera: Camera;
	objects: Object3D[];
	additionalObjectsToSelect: Object3D[];
	parentNode: HTMLElement;
	circleShape: Object3D;
	controls: MyOrbitControls;
	invalidated: boolean;
	me: SkinnedMesh<BufferGeometry, Material[]>;
    me_shiftUp: number;
	hideModel: boolean;
	hideDoors: boolean;
	hideWalls: boolean;
	directionalLight: DirectionalLight;
}

interface TEffectController {
	displaceGui: boolean;
	quickmode: boolean;
	log_on_screen: boolean;
	orthographic: boolean;
	vertexnormals: boolean;
	enable_maps: boolean;
	latitude: number;
	longitude: number;
	colladaUnit: number;
	[materialName: string]: any;
}

interface TMat {
	[mat: string]: {
		m: Material,
		h: number, s: number, l: number
	} | Material & { color: Color }
}


var g_path: string;
var g_ids: string[] = [];
var zoomId: number;
var countProgress: number;
var g_colors: { [color: string]: (number[] | Material | MeshPhongMaterial) & { isDefaultColorScheme?: boolean} & { hideFromMaterialVisibility?: boolean }) } = {

	"Beam": [0, 1, 0, 0.85],
	"Building": [0, 0, 1, 0.5],
	// BuildingElementProxy: "xy" was truncated by Blender
	"BuildingElementPro": [0.8, 0.8, 0.8, 1],
	"BuildingStorey": [0, 0, 1, 0.75],
	"Column": [1, 1, 0, 0.7],
	"Covering": [1, 0, 0.5019608, 1],
	"CurtainWall": new MeshPhongMaterial({
		color: new Color().setRGB(0, 0, 1),
		opacity: 0.35,
		transparent: true,
		polygonOffset: true,
		polygonOffsetFactor: 1,
		polygonOffsetUnits: 1
	}),
	"Door": [0.5019608, 0.2509804, 0, 0.8],
	"FlowFitting": new MeshPhongMaterial({
		color: new Color().setRGB(0.8, 0.8, 0.8),
		opacity: 1,
		transparent: false,
		side: DoubleSide
	}),
	"Footing": [0, 0.2509804, 0.2509804, 1],
	"FurnishingElement": [0, 0, 0.2509804, 0.2],
	"OpeningElement": [0, 0, 1, 0],
	"Member": [0.5019608, 0, 0.5019608, 0.9],
	"Pile": [0.5019608, 0.5019608, 0, 1],
	"Plate": [0.5019608, 0.5019608, 0, 1],
	"Project": [0, 0, 1, 0.25],
	"Proxy": [0.8, 0.8, 0.8, 1],
	"Railing": [0.5019608, 0, 0.5019608, 0.9],
	"Roof": [1, 0, 0, 1],
	"Site": [0, 0, 1, 0.3],
	"Slab": [0.7529412, 0.7529412, 0.7529412, 0.5],
	"Space": [0, 0.5019608, 0.2509804, 0.3],
	"Stair": [0.5019608, 0, 0.5019608, 0.9],
	"StairFlight": [0.5019608, 0, 0.5019608, 0.9],
	"Wall": new MeshPhongMaterial({
		color: new Color().setRGB(0, 0, 1),
		opacity: 0.35,
		transparent: true,
		polygonOffset: true,
		polygonOffsetFactor: 1,
		polygonOffsetUnits: 1
	}),
	"WallStandardCase": new MeshPhongMaterial({
		color: new Color().setRGB(0, 0, 1),
		opacity: 0.35,
		transparent: true,
		polygonOffset: true,
		polygonOffsetFactor: 1,
		polygonOffsetUnits: 1
	}),
	"Window": [0, 1, 1, 0.4],
	"Selection": new MeshPhongMaterial({
		color: new Color().setRGB(1, 0, 0),
		opacity: 1,
		transparent: false,
		polygonOffset: true,
		polygonOffsetFactor: -1,
		polygonOffsetUnits: -1
	})
};
var reviseSelection = function (s: any) { return s; };
var g_colorSchemes: { [scheme: string]: { [color: string]: Material } };
var b_colorSchemes: { [scheme: string]: boolean } = {};
var materialCtls: GUIController[] = [];
var g_visibility: { [material: string]: boolean } = {};

var g_angle = 45;
var g_cameraHistory: any[5][] = [];
var g_selectedInfo: Mesh<BufferGeometry, Material>[] = [];
//multiple extension
var g_paths: string[] = [];
var g_num_clients: number;
var up: Vector3;
var g_dragging: boolean = false;
var g_worldPosition: Vector3 | null;
var g_fullyLoaded: () => void;
var g_offs: Vector3 | null;
var g_finished = false;  // for selenium
var g_clients: TClient[] = [];
var g_lastPos: number[];
var g_cameraTransforms: Mesh[] = [];
var g_incidentTransforms: Object3D[] = [];
var isInParse = false;
var defaultScheme: string;

var g_map: google.maps.Map<HTMLElement>;
var ownPosition: google.maps.LatLng;
var g_overlay: google.maps.OverlayView;
var g_mapsteps = 20;

var KEY = {
	LEFT: 37,
	UP: 38,
	RIGHT: 39,
	DOWN: 40,
	A: 65,
	S: 83,
	D: 68,
	W: 87,
	R: 82,
	I: 73,
	O: 79,
	B: 66,
	F: 70,
	T: 84,
	SHIFT: 16,
	CTRL: 17,
	PG_UP: 33,
	PG_DN: 34,
	PLUS: 75,
	MINUS: 77,
	ESCAPE: 27,
};

var keyIsDown = new Array();
var g_pickInfoElem: HTMLElement;
var g_pathTransforms: Object3D[] = [];
var distanceBetweenRemotePoints_times_distanceToScreen: number | null = null;
var distanceBetweenRemotePoints_times_distanceToScreen_eye: Vector3 | null = null;

//threejs specific global initializations
var g_oldWorldPosition: Vector3 | null;
var g_dir: string;
var g_renderer: string;
var doCollada = document.evaluate != undefined && g_renderer != "svg";
var doJsonLoader = true;
var doGLTF = false;
var doFBX = false;
var container: HTMLElement, stats: any, rendererStats: any;
var mouse: Vector2;

var gui: GUI, jstree: JSTree, misc: GUI, selectionInfoGui: GUI, debugGui: GUI, extrusionLengthGui: GUIController, closingAngleGui: GUIController, lazyRenderingGui: GUIController, materialVisibilityGui, fpsGui: GUIController, componentsGui: GUIController;
var effectController: TEffectController;
var geoHandle: number | null;
var materials: TMat;
var current_material: string | null;
var m_h: GUIController, m_s: GUIController, m_l: GUIController;
var light: DirectionalLight, pointLight: PointLight, ambientLight: AmbientLight;
var updateMaterials: () => void;
var sceneCube: Scene | null, envCube: Texture | null;
var clock: Clock | null;
var tubeGeometry: TubeGeometry | null;
var tubeGeometryPointAt: number;
var animateTube = false;
var hasFire = false;
var mapA = null;
var blinkJob: number | null;
var blinkingObjects: Mesh[];
var camLeft: number, camBottom: number, camWidth: number, camHeight: number;

var oldMsg: string | null = null;
var allMsg: string | null = null;
var occurences = 0;
var overrideSettings: any;
var USE_BUFFERGEOMETRY = true;
var inProcessMessage: boolean;
var t_dir = "https://raw.githubusercontent.com/timoxley/threejs/master/examples/";

var trident = !!navigator.userAgent.match(/Trident\/7.0/);
var net = !!navigator.userAgent.match(/.NET4.0E/);
var isIE11 = trident && net;

var framesCount = 0;
var startedTestFps: number | null = null;
var testFps: number | null = null;
var disableRendering = false;

var theJavaFunction: (guids: string, dummy1: string, client_id: string, x: number, y: number, which: number, eventType: string) => any = (window as any).theJavaFunction;

if (!(window as any).THREE) {
	(window as any).THREE = { "DoubleSide": DoubleSide, "MeshPhongMaterial": MeshPhongMaterial };
}

window.onerror = function myErrorHandler(errorMsg: string | Event, url?: string, lineNumber?: number) {
	$("#progress").html("Fatal error occured: " + errorMsg);//or any message
	myLog(errorMsg as string);
	myLog("Location: " + url + " (" + lineNumber + ")");
	return false;
};

function processMessage(event: MessageEvent): void {
	inProcessMessage = true;
	try {
		if (event.data.selectShape) {
			selectShape(event.data.selectShape, g_clients[0].id.substring("threejs".length));
			return;
		}
		if (event.data.locateShape) {
			locateShape(event.data.locateShape, g_clients[0].id.substring("threejs".length));
			return;
		}
		if (!event.data.g_path) { alert("Unknown message received! " + event.data); return; }
		g_path = event.data.g_path;
		if (g_clients.length > 0) {
			calcPaths();
			load2(0);
		} else {
			start({});
		}
	}
	finally {
		inProcessMessage = false;
	}
}

window.addEventListener("message", processMessage, false);

function myLogHTML(msg: string): void {

	if (msg != oldMsg) {
		allMsg = oldMsg + "<br>" + allMsg;
		g_pickInfoElem.innerHTML = msg + "<br>" + allMsg;
		occurences = 1;
	} else {
		occurences++;
		g_pickInfoElem.innerHTML = msg + "(" + occurences + ")<br>" + allMsg;
	}
	oldMsg = msg;

}

function myLog(msg: string): void {
	// attempt to send a message to the console
	try {
		if (effectController.log_on_screen)
			myLogHTML(msg);
		else
			console.log(msg);
	}
	// fail gracefully if it does not exist
	catch (e) { }
}

var bounding_sphere: Object3D;
var bounding_box: Object3D;
var oldBBbox: Box3 | null;
var oldBBSphere: Sphere | null;
function paintBoundingBox(bbox: Box3 | null, g_client: TClient): void {
	g_client.scene.remove(bounding_box);

	if (!bbox || oldBBbox && oldBBbox.equals(bbox)) {
		oldBBbox = null;
		updateClient(g_client);
		return;
	}
	oldBBbox = bbox;
	var min = bbox.min;
	var max = bbox.max;

	let geometry = new BoxGeometry(max.x - min.x, max.y - min.y, max.z - min.z);

	var material = new MeshLambertMaterial({
		color: Math.random() * 0xffffff,
		opacity: 1,
		transparent: false
	});

	var mesh = new Mesh(geometry, material);
	mesh.position.copy(lerpVector(min, max, 0.5));

	g_client.scene.add(mesh);
	mesh.updateMatrixWorld();
	bounding_box = mesh;

	updateClient(g_client);

}

function paintBoundingSphere(bsphere: Sphere | undefined, g_client: TClient): void {
	g_client.scene.remove(bounding_sphere);

	if (!bsphere || oldBBSphere && oldBBSphere.equals(bsphere)) {
		oldBBSphere = null;
		updateClient(g_client);
		return;
	}
	oldBBSphere = bsphere;

	let geometry = new SphereGeometry(bsphere.radius, 32, 32);

	var material = new MeshLambertMaterial({
		color: Math.random() * 0xffffff,
		opacity: 1,
		transparent: false
	});

	var mesh = new Mesh(geometry, material);
	mesh.position.copy(bsphere.center);

	g_client.scene.add(mesh);
	mesh.updateMatrixWorld();
	bounding_sphere = mesh;

	updateClient(g_client);

}

var oldVertexNormalsHelper: Object3D, meshWithVisualizedNormals: Mesh | null;

function paintNormals(mesh: Mesh | undefined, g_client: TClient): void {
	g_client.scene.remove(oldVertexNormalsHelper);

	if (!mesh || meshWithVisualizedNormals == mesh) {
		meshWithVisualizedNormals = null;
		updateClient(g_client);
		return;
	}
	meshWithVisualizedNormals = mesh;

	g_client.scene.add(oldVertexNormalsHelper = new VertexNormalsHelper(mesh!, 1));

	updateClient(g_client);

}

function printBoundingBox(lines: number[], artifactId: string): void {
	var g_client = resolveArtifact(artifactId);

	for (var tt = 0; tt < lines.length;) {

		//  var id = lines[tt+6];
		//	var transform = getObjectsWithSplittings(id,g_client);

		var min = asVector3M([lines[tt + 0], lines[tt + 1], lines[tt + 2]]);
		var max = asVector3M([lines[tt + 3], lines[tt + 4], lines[tt + 5]]);

		paintBoundingBox(new Box3(min, max), g_client);

		tt += 7;

	}

	updateClient(g_client);

}

function locate(transforms: Object3D[], g_client: TClient, steps: number): boolean {
	var bbox = getBoundingBoxOfTree(transforms);
	if (!bbox) return false;
	var target = lerpVector(bbox.min, bbox.max, 0.5);
	var diag = bbox.max.distanceTo(bbox.min);
	var eye = target.clone().add(new Vector3(-0.65 * diag, 0.65 * diag, 0.65 * diag));

	if (g_client.objects && !keyIsDown[KEY.SHIFT]) {
		var s_camera = g_client.g_camera;
		setEyeAndTarget(eye, target, g_client);
		var raycaster = getRaycaster(new Vector2(), g_client);
		var intersects = raycaster.intersectObjects(g_client.objects);
		g_client.g_camera = g_client.controls.object = s_camera;

		if (intersects)
			for (var tt = 0; tt < intersects.length; tt++) {
				var object = intersects[tt].object as Mesh<BufferGeometry, Material>;
				if (g_selectedInfo.length > 0 && object.uuid == g_selectedInfo[0].uuid) break;
				if (isIntersectedObjectVisible(object, g_client)) {
					eye = intersects[tt].point;
					myLog("In between: " + object.uuid);
				}
			}
	}

	doSetCamera(eye, target, g_angle, null, steps, g_client);
	return true;
}

function isIntersectedObjectVisible(object: Mesh<BufferGeometry, Material>, g_client: TClient): boolean {
	var material = g_client.g_colors[object.material.name];
	return (object.visible || g_client.additionalObjectsToSelect.indexOf(object) >= 0) && (material && material.opacity != 0 && material.visible || !!object.material);
}

function getParameterByName(url: string, name: string): string | null {
	if (!name) return null;
	name = name.replace(/[\[]/, "\\\[").replace(/[\]]/, "\\\]");
	var regexS = "[\\?&]" + name + "=([^&#]*)";
	var regex = new RegExp(regexS);
	var results = regex.exec(url);
	if (results == null)
		return null;
	else
		return decodeURIComponent(results[1].replace(/\+/g, " "));
}

function selectShape(id: string[], artifactId: string): void {
	var g_client = resolveArtifact(artifactId);
	var transform = getObjectsWithSplittings(id, g_client);
	if (transform.length > 0 && isFinallyVisible(transform[0])) {
		for (var tt = 0; tt < transform.length; tt++) {
			transform[tt].visible = true;
		}
		select(transform, g_client);
	} else {
		unSelectAll(g_client);
		if (transform.length > 0) hideSiblings(transform, effectController.quickmode ? g_client.originalRoot : g_client.root);
	}
	updateSelectableObjects(g_client);
	updateClient(g_client);
}

function isolateShape(id: string[], artifactId: string): void {
	var g_client = resolveArtifact(artifactId);
	var transform = getObjectsWithSplittings(id, g_client);
	if (transform.length > 0) {
		unSelectAll(g_client);
		hideSiblings(transform, effectController.quickmode ? g_client.originalRoot : g_client.root);
		updateSelectableObjects(g_client);
		updateClient(g_client);
	}
}

function readCamera(artifactId: string): any[] {
	var g_client = resolveArtifact(artifactId);
	var g_camera = g_client.g_camera;
	return (vector3ToArray(g_camera.eye) as any[]).concat(vector3ToArray(g_camera.target)).concat([g_angle, effectController.orthographic]);
}

function resolveArtifact(artifactId: string): TClient {
	return document.getElementById('threejs' + artifactId) as TClient;
}

function setCamera(args: any[], steps: number, artifactId: string): void {
	var g_client = resolveArtifact(artifactId);
	doSetCamera(asVector3([args[0], args[1], args[2]]), asVector3([args[3], args[4], args[5]]), args[6], args[7], steps, g_client);
}

function clickCamera(args: number[], steps: number, artifactId: string): void {
	var g_client = resolveArtifact(artifactId);
	var aspect = 1;
	var camera = new PerspectiveCamera(args[6], aspect, 0.5, 1000);
	camera.eye = camera.position.copy(asVector3([args[0], args[1], args[2]]));
	camera.up = up;
	camera.lookAt(camera.target = asVector3([args[3], args[4], args[5]]));
	camera.updateProjectionMatrix();
	camera.updateMatrixWorld();
	g_client.additionalCamera = camera;
	updateClient(g_client);
}

function StrToIntArray(a: string[]): number[] {
	return [parseInt(a[0]), parseInt(a[1]), parseInt(a[2])];
}

function asVector3(a: number[]): Vector3 {
	return new Vector3(a[0], a[2], -a[1]);
}

function asVector3M(a: number[]): Vector3 {
	var v = asVector3(a);
	return new Vector3(v.x / 1000, v.y / 1000, v.z / 1000);
}

function vector3ToArray(v: Vector3): number[] {
	return [v.x, -v.z, v.y];
}


function vector3ToArrayMM(v: Vector3): number[] {
	var a = vector3ToArray(v);
	return [Math.round(a[0] * 1000), Math.round(a[1] * 1000), Math.round(a[2] * 1000)];
}

function doSetCamera(eye: Vector3, target: Vector3, angle: number, ortho: boolean | null, steps: number, g_client: TClient): void {
	g_client = g_client || g_clients[0];
	var g_camera = g_client.g_camera;
	var oldOrtho = effectController.orthographic;
	if (ortho != null)
		effectController.orthographic = ortho;
	countProgress = 0;
	if (zoomId) window.clearInterval(zoomId);
	if (g_camera && eye.distanceTo(g_camera.eye) < 0.001 && target.distanceTo(g_camera.target) < 0.001) return;
	if (steps <= 1) {
		g_angle = angle;
		setEyeAndTarget(eye, target, g_client);
		return;
	}
	var oldEye = g_camera.eye.clone();
	var oldTarget = g_camera.target.clone();
	var oldUp = new Vector3().setFromMatrixColumn(new Matrix4().lookAt(g_camera.eye, g_camera.target, up).invert().transpose(), 1);
	var newUp = new Vector3().setFromMatrixColumn(new Matrix4().lookAt(eye, target, up).invert().transpose(), 1);
	var oriUp = up.clone();
	var oldAngle = g_angle;
	g_cameraHistory.push([oldEye, oldTarget, g_angle, oldOrtho, steps, g_client]);
	zoomId = window.setInterval(function () {
		countProgress++;
		var t = countProgress / steps;
		g_angle = lerpScalar(oldAngle, angle, t);
		setEyeAndTarget(lerpVector(oldEye, eye, t), lerpVector(oldTarget, target, t), g_client, /*countProgress<steps ? lerpVector(oldUp, newUp, t) :*/ oriUp);
		updateClient(g_client);
		if (countProgress >= steps)
			window.clearInterval(zoomId);
	}, 50);

}

function hideShape(id: string[], artifactId: string): void {
	var g_client = resolveArtifact(artifactId);
	var transform = getObjectsWithSplittings(id, g_client);
	if (transform.length > 0) {
		unSelectAll(g_client);
		for (var tt = 0; tt < transform.length; tt++) {
			transform[tt].visible = false;
		}
		updateClient(g_client);
	}
}

function resetVisibility(transform: Object3D): void {
	transform.visible = true;
	var children = transform.children;
	for (var tt = 0; tt < children.length; tt++) {
		resetVisibility(children[tt]);
	}
}

function resetVisibilityToFalse(transform: Object3D): void {
	transform.visible = false;
	var children = transform.children;
	for (var tt = 0; tt < children.length; tt++) {
		resetVisibilityToFalse(children[tt]);
	}
}

function hideSiblings(visibleNodes: Object3D[], root: Object3D): void {
	var parentsOfVisibleNodes: Object3D[] = [];
	for (var tt = 0; tt < visibleNodes.length; tt++) {
		var p = visibleNodes[tt].parent;
		while (p != null && parentsOfVisibleNodes.indexOf(p) == -1) {
			parentsOfVisibleNodes.push(p);
			p = p.parent;
		}
	}
	showOrHide(root, visibleNodes, parentsOfVisibleNodes);
}

function showOrHide(node: Object3D, visibleNodes: Object3D[], parentsOfVisibleNodes: Object3D[]): void {
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
		showOrHide(children[tt], visibleNodes, parentsOfVisibleNodes);
	}
}

function isFinallyVisible(transform: Object3D): boolean {
	return transform.visible;
}

function locateShape(id: string[], artifactId: string) {
	var g_client = resolveArtifact(artifactId);
	var transform = getObjectsWithSplittings(id, g_client);
	if (transform.length > 0) {
		locate(transform, g_client, 20);
		updateClient(g_client);
	}
}

function calcPaths(): void {
	var filename = getParameterByName(g_path, 'filename')!;
	if (!g_path || g_path.lastIndexOf("threejs/modelviewer.html?artifact=") != -1) {
		var index = g_path.lastIndexOf('/threejs');
		// Point at the parent directory's assets directory for the moment
		g_ids = getParameterByName(g_path, 'artifact')!.split(",");
		g_num_clients = g_ids.length;
		for (var ii = 0; ii < g_num_clients; ii++)
			g_paths[ii] = g_path.substring(0, index) + '/services/Artifact/GetArtifact/' + g_ids[ii] + '/' + filename;
	} else if (g_paths.length > 0) {
		filename = "scene.js";
		//do nothing
	} else if (!getParameterByName(g_path, 'artifact')) {
		g_ids = "1".split(",");
		let resturl = g_path.substring(0, g_path.indexOf('?'));
		g_num_clients = g_ids.length;
		for (var ii = 0; ii < g_num_clients; ii++)
			g_paths[ii] = resturl + (filename ? "?filename=" + filename : "");
		if (!filename)
			filename = resturl.substring(resturl.lastIndexOf('/') + 1);
	} else {
		var index2 = g_path.lastIndexOf('artifact=');
		g_ids = getParameterByName(g_path, 'artifact')!.split(",");
		g_num_clients = g_ids.length;
		for (var ii = 0; ii < g_num_clients; ii++)
			g_paths[ii] = g_path.substring(0, index2 + 'artifact='.length) + encodeURIComponent(g_ids[ii]) + "&filename=" + filename;
	}
	var ext = filename.substring(filename.lastIndexOf("."));
	doJsonLoader = (ext == ".js");
	doCollada = (ext == ".dae");
	doGLTF = (ext == ".gltf") || (ext == ".glb");
	doFBX = (ext == ".fbx");
	if (doCollada && overrideSettings.quickmode == null) effectController.quickmode = false;
	if (doCollada && overrideSettings.vertexnormals == null) effectController.vertexnormals = true;

}

function buildTable(): void {

	// Create a bunch of clients.
	var ii = 0;
	var tbodyElem = document.getElementById('clients')!;
	if (g_num_clients == 1) {
		var objElem = createRenderer(tbodyElem, ii);
		objElem.style.width = '100%';
		objElem.style.height = g_num_clients == 1 ? '100%' : 'auto';
	} else
		for (var ii = 0; ii < g_num_clients; ii++) {
			var tdElem = document.createElement('div');
			var objElem = createRenderer(tdElem, ii);
			objElem.style.width = '100%';
			objElem.style.height = g_num_clients == 1 ? '100%' : 'auto';
			tdElem.style.flex = '0 0 49.9%';
			tdElem.style.height = 'auto';
			tbodyElem.appendChild(tdElem);




		}

}

function createRenderer(container: HTMLElement, ii: number): TClient {
	var renderer: any;
	if (g_renderer == "webgl") {
		renderer = new WebGLRenderer({ 'antialias': effectController.antialias, alpha: true });
		container.appendChild(renderer.domElement);
	} else if (g_renderer == "canvas") {
		renderer = new CanvasRenderer();
		container.appendChild(renderer.domElement);
	} else if (g_renderer == "software") {
		renderer = new SoftwareRenderer();
		container.appendChild(renderer.domElement);
	} else if (g_renderer == "svg") {
		renderer = new SVGRenderer();
		container.appendChild(renderer.domElement);
		renderer.setQuality('low');
	} else if (g_renderer == "css") {
		renderer = new CSS3DObject(container);
		container.appendChild(renderer.domElement);
	} else if (g_renderer == "webgldeferred") {
		renderer = new WebGLDeferredRenderer();
		container.appendChild(renderer.domElement);
	} else {
		alert("Renderer " + g_renderer + " unknown!");
		return null!;
	}
	var g_client: TClient = renderer.domElement as TClient;
	g_client.setAttribute('tabindex', '0'); // make canvas focusable
	g_client.id = 'threejs' + g_ids[ii];
	g_client.name = 'threejs' + g_ids[ii];
	g_client.renderer = renderer;
	g_clients.push(g_client);
	var col = effectController.enable_maps ? { color: 0x000000, a: 0 }/* the default value */ : { r: 1, g: 1, b: 1, color: 0x0, a: 0 }/* prevents dark ragged outline of selection in IE / WebGL mode */;
	g_client.renderer.setClearColor(col.color, col.a);
	renderer.clear();
	return g_client;
}

function installRendererEvents(g_client: TClient): void {
	var renderer = g_client.renderer;
	renderer.domElement.addEventListener('pointermove', onDocumentMouseMove, false);
	renderer.domElement.addEventListener('pointerdown', onDocumentMouseDown, false);
	renderer.domElement.addEventListener('pointerup', onDocumentMouseUp, false);
	renderer.domElement.addEventListener('wheel', onDocumentMouseWheel, false);
	renderer.domElement.addEventListener('dblclick', onDocumentDblClick, false);
	renderer.domElement.addEventListener('touchmove', touchHandler, false);
	renderer.domElement.addEventListener('touchstart', touchHandler, false);
	renderer.domElement.addEventListener('touchend', touchHandler, false);
}

function touchHandler(event: TouchEvent): void {
	event.preventDefault();
	//	if (event.touches.length > 1 || (event.type == "touchend" && event.touches.length > 0))
	//		return;


	var newEvt = document.createEvent("MouseEvents");
	var type = null;
	var touch = event.touches.length > 0 ? event.touches[0] : event.changedTouches[0];
	var g_client = event.target as TClient;
	var detail = 1;
	var button = 0;
	switch (event.type) {
		case "touchstart":
			type = "pointerdown";
			distanceBetweenRemotePoints_times_distanceToScreen = null;
			if (event.touches.length > 1) return;
			break;
		case "touchmove":
			type = "pointermove";

			if (event.type == "touchmove" && event.touches.length > 1) {

				var distX = (event.touches[0].clientX - event.touches[1].clientX);
				var distY = (event.touches[0].clientY - event.touches[1].clientY);
				var distanceBetweenScreenPoints = Math.sqrt(distX * distX + distY * distY);

				var g_camera = g_client.g_camera;

				if (distanceBetweenRemotePoints_times_distanceToScreen == null && g_worldPosition != null) {
					// this equation always holds: distanceBetweenRemotePoints / distanceToRemote = distanceBetweenScreenPoints / distanceToScreen
					var distanceToRemote = g_worldPosition.distanceTo(g_camera.eye);
					distanceBetweenRemotePoints_times_distanceToScreen = distanceBetweenScreenPoints * distanceToRemote; // use equation to calculate distanceBetweenRemotePoints * distanceToScreen
					distanceBetweenRemotePoints_times_distanceToScreen_eye = g_camera.eye.clone();
					return;
				} else
					if (distanceBetweenRemotePoints_times_distanceToScreen != null && distanceBetweenRemotePoints_times_distanceToScreen != -1 && g_worldPosition != null) {
						var distanceToRemote = distanceBetweenRemotePoints_times_distanceToScreen / distanceBetweenScreenPoints; // use equation to calculate distanceToRemote
						//				var newEye = g_worldPosition.clone().add(distanceBetweenRemotePoints_times_distanceToScreen_eye.clone().sub(g_worldPosition).normalize().multiplyScalar(distanceToRemote));
						var t = distanceToRemote / g_worldPosition.distanceTo(g_camera.eye); // calculate factor how much the distance should be changed
						setEyeAndTarget(lerpVector(g_camera.target, g_camera.eye, t), g_camera.target, g_client); // change distance, but to the current target point
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
			type = "pointerup";
			if (event.changedTouches.length > 0 && event.changedTouches[0] == touch && event.touches.length >= 2) touch = event.touches[1];
			distanceBetweenRemotePoints_times_distanceToScreen = null;
			if (event.touches.length > 2) return;
			if (event.touches.length == 2) type = "pointerdown";
			break;
	}

	if (!touch) {
		return;
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
	newEvt.initMouseEvent(type!, true, true, (event.target as Element).ownerDocument.defaultView!, detail,
		touch.screenX, touch.screenY, touch.clientX, touch.clientY,
		false, false, /*event.touches.length > 1*/false, false, button, null);
	event.target!.dispatchEvent(newEvt);


}

function setClientSize(g_client: TClient): void {
	var newWidth = g_client.parentNode.offsetWidth;
	var newHeight = g_client.parentNode.offsetHeight;
	g_client.renderer.setSize(newWidth, newHeight);
	if (!effectController.enable_maps)
		updateProjection(g_client);
	var customContainer = document.getElementById('clients');
	if (gui && customContainer) {
		gui.domElement.style.top = (customContainer.offsetTop + 5) + "px";
		gui.domElement.style.right = effectController.displaceGui ? (document.body.offsetWidth - customContainer.offsetLeft - customContainer.offsetWidth + 5) + "px" : "5px";
	}
}

function onWindowResize(): void {
	g_clients.forEach(function (g_client: TClient) {
		setClientSize(g_client);
		if (!effectController.enable_maps)
			updateClient(g_client);
	});
}

function traverseAllObjects(f: (object: Object3D) => any, g_client: TClient): void {
	g_client.scene.traverse(f);
	if (g_client.originalRoot) g_client.originalRoot.traverse(f);

}

function getObjectsWithSplittings(name: string[], g_client?: TClient): Object3D[] {
	g_client = g_client || g_clients[0];
	name = asArray(name);
	var found: Object3D[] = [];
	for (var j = 0; j < name.length; ++j) {
		var n = name[j];
		var n_ = n + "_";
		var f = function (object: Object3D) {
			if (object.uuid && (object.uuid == n || object.uuid.indexOf(n_) == 0)) {
				found.push(object);
			}
		};
		traverseAllObjects(f, g_client);
	}
	return found;
}

function getObjectsWithIDs(name: number[], g_client?: TClient): Mesh<BufferGeometry, Material>[] {
	g_client = g_client || g_clients[0];
	name = asArray(name);
	var found: Object3D[] = [];
	for (var j = 0; j < name.length; ++j) {
		var n = name[j];
		var f = function (tree: Object3D) {
			if (tree.id == n) found.push(tree);
			var object = tree.getObjectById(n);
			if (object) found.push(object);
		};
		f(g_client.scene);
		if (g_client.originalRoot) f(g_client.originalRoot);
	}
	return found;
}

function asArray(x: any): any[] {
	if (!x)
		return []; else
		if (Array.isArray(x))
			return x; else
			return [x];
}

function updateWebGL() {
	if (effectController.enable_maps && placeInto && g_overlay && g_overlay.getProjection()) {
		var sw = g_overlay.getProjection().fromLatLngToContainerPixel(new google.maps.LatLng(effectController.latitude, effectController.longitude));
		var own;
		if (ownPosition) own = g_overlay.getProjection().fromLatLngToContainerPixel(ownPosition);
		else own = sw;
		var southWest = g_map.getBounds()!.getSouthWest();
		var northEast = g_map.getBounds()!.getNorthEast();
		var northWest = new google.maps.LatLng(northEast.lat(), southWest.lng());
		var height = google.maps.geometry.spherical.computeDistanceBetween(northWest, southWest);
		var width = google.maps.geometry.spherical.computeDistanceBetween(northWest, northEast);
		var div = document.getElementById('clients') as HTMLElement;
		var map_canvas = g_map.getDiv();
		placeInto(sw.x + map_canvas.offsetLeft - div.offsetLeft, sw.y + map_canvas.offsetTop - div.offsetTop, width * div.offsetWidth / map_canvas.offsetWidth, height * div.offsetHeight / map_canvas.offsetHeight, g_map.getTilt() == 45, own.x + map_canvas.offsetLeft - div.offsetLeft, own.y + map_canvas.offsetTop - div.offsetTop);
	}
}

function simulateResize() {

}

function placeInto(px: number, py: number, width: number, height: number, tilt45: boolean, ox: number, oy: number): void {
	if (!g_finished) return;

	//	width = width * effectController.colladaUnit;
	//	height = height * effectController.colladaUnit;
	var scale = 1;///effectController.colladaUnit;
	var g_client = g_clients[0];
	var g_camera = g_client.g_camera;

	var bbox = getBoundingBoxOfTree([g_client.root])!;
	var buildingY_in_meters = bbox.max.z - bbox.min.z;
	var buildingX_in_meters = bbox.max.x - bbox.min.x;

	myLog("Meters of building = (" + buildingX_in_meters + ", " + buildingY_in_meters + ") within total map space (" + width + ", " + height + ")");

	var buildingY_in_pixel = g_client.parentNode.offsetHeight * buildingY_in_meters / height;

	myLog("Pixels y of building = " + buildingY_in_pixel);

	var eyey = (py - g_client.parentNode.offsetHeight / 2) * height / g_client.parentNode.offsetHeight;
	var eyex = (px - g_client.parentNode.offsetWidth / 2) * width / g_client.parentNode.offsetWidth;

	myLog("Center of building in pixel = (" + px + ", " + py + ") within total map space (" + g_client.parentNode.offsetWidth + ", " + g_client.parentNode.offsetHeight + ")");
	myLog("eyex " + eyex + " eyey = " + eyey);

	var z = height * effectController.colladaUnit;
	if (!effectController.orthographic) {
		z = Math.pow(2, 19 - g_map.getZoom()) / 5.2493438317251968503937007874016 * 1000 * 2 * effectController.colladaUnit;
		g_angle = MathUtils.radToDeg(Math.asin(height * effectController.colladaUnit / 2 / z)) * 2;
		//		z = height*effectController.colladaUnit/2 / Math.sin(MathUtils.degToRad(g_angle/2));
		myLog("Angle = " + g_angle);
	}
	myLog("Distance above earth in meters = " + z);
	eyex = eyey = 0;

	var target = new Vector3(eyex, bbox.min.y, eyey);
	var eye = new Vector3(target.x, z + target.y, target.z);
	if (tilt45)
		eye.z = eye.z + height;

	if (!effectController.orthographic && false || true) {
		var newTarget = getPos(eye, target, px, py, g_client);
		if (newTarget) {
			var ownTarget = getPos(eye, target, ox, oy, g_client)!;
			target = newTarget;
			eye = new Vector3(target.x, z + target.y, target.z);
			if (g_client.circleShape == null) {

				//				var circleRadius = 50;
				//				var circleShape = new Shape();
				//				circleShape.moveTo( 0, circleRadius );
				//				circleShape.quadraticCurveTo( circleRadius, circleRadius, circleRadius, 0 );
				//				circleShape.quadraticCurveTo( circleRadius, -circleRadius, 0, -circleRadius );
				//				circleShape.quadraticCurveTo( -circleRadius, -circleRadius, -circleRadius, 0 );
				//				circleShape.quadraticCurveTo( -circleRadius, circleRadius, 0, circleRadius );
				//				var shape = circleShape;				

				var arcShape = new Shape();
				arcShape.moveTo(50, 10);
				arcShape.absarc(10, 10, 40, 0, Math.PI * 2, false);
				var holePath = new Path();
				holePath.moveTo(20, 10);
				holePath.absarc(10, 10, 10, 0, Math.PI * 2, true);
				arcShape.holes.push(holePath);
				var shape = arcShape;


				var extrudeSettings: ExtrudeGeometryOptions = { depth: 2000 }; // bevelSegments: 2, steps: 2 , bevelSegments: 5, bevelSize: 8, bevelThickness:5
				extrudeSettings.bevelEnabled = true;
				extrudeSettings.bevelSegments = 10;
				extrudeSettings.steps = 2;

				let geometry = new ExtrudeGeometry(shape, extrudeSettings);
				var mesh = SceneUtils.createMultiMaterialObject(geometry, [new MeshLambertMaterial({ color: 0x00ff11, transparent: true, opacity: 0.3 }), new MeshBasicMaterial({ color: 0x00000055, transparent: true, opacity: 0.3 })]);

				g_client.scene.add(mesh);
				g_client.circleShape = mesh;
			}
			var v = new Vector3(-ownTarget.x + target.x, 0, -ownTarget.z + target.z);
			v = v.multiplyScalar(scale);
			g_client.circleShape.position.copy(v);
			g_client.circleShape.rotation.set(MathUtils.degToRad(270), MathUtils.degToRad(0), MathUtils.degToRad(0));
			g_client.circleShape.scale.copy(new Vector3(0.2 * effectController.colladaUnit, 0.2 * effectController.colladaUnit, 0.2 * effectController.colladaUnit));
			g_client.circleShape.updateMatrixWorld();
		}
	}

	doSetCamera(eye.multiplyScalar(scale), target.multiplyScalar(scale), g_angle, null, g_mapsteps, g_client);
	if (g_mapsteps == 1)
		updateClient(g_client);
	g_mapsteps = 1;

	myLog("eye=" + g_camera.eye.x + " " + g_camera.eye.y + " " + g_camera.eye.z + " target=" + g_camera.target.x + " " + g_camera.target.y + " " + g_camera.target.z);

}

function getPos(eye: Vector3, target: Vector3, px: number, py: number, g_client: TClient): Vector3 | null {
	var s_camera = g_client.g_camera;
	setEyeAndTarget(eye, target, g_client);

	var mouse = new Vector2();
	mouse.x = (px / g_client.parentNode.offsetWidth) * 2 - 1;
	mouse.y = - (py / g_client.parentNode.offsetHeight) * 2 + 1;
	var raycaster = getRaycaster(mouse, g_client);

	var plane = g_client.plane;
	plane.position.copy(target);
	plane.lookAt(plane.position.clone().add(up));
	plane.updateMatrixWorld();

	var intersects = raycaster.intersectObject(plane);
	g_client.g_camera = g_client.controls.object = s_camera;
	if (intersects.length > 0) {
		var intersectPoint = intersects[0].point;
		return new Vector3(-intersectPoint.x, intersectPoint.y, -intersectPoint.z);
	}
	return null;
}

function initializeMap(): void {

	var map_canvas = document.getElementById("map_canvas")!;
	var clients = document.getElementById("clients")!;

	if (!effectController.enable_maps) {

		if (g_map) {
			map_canvas.style.visibility = 'hidden';
			clients.style.left = '0px';
			clients.style.right = '0px';
			simulateResize();

			// look at the same position as before
			effectController.enable_maps = true;
			g_mapsteps = 1;
			updateWebGL();
			effectController.enable_maps = false;
		}

		return;
	}

	map_canvas.style.visibility = 'visible';
	clients.style.right = '110px';
	clients.style.left = '80px';
	simulateResize();

	if (g_map) {
		g_mapsteps = 20;
		g_map.setCenter(new google.maps.LatLng(effectController.latitude, effectController.longitude));
		return;
	}

	requirejs.config({
		paths: {
			gmaps: '//maps.googleapis.com/maps/api/js?key=' + effectController.apikey + "&sensor=false&libraries=geometry" // question mark is appended to prevent require.js from adding a .js suffix
		},
		shim: {
			gmaps: {
				exports: 'google.maps'
			}
		}
	});

	requirejs(['gmaps'], function () {
		class WebGLOverlay extends google.maps.OverlayView {

			draw() {
				updateWebGL();
			}

		};

		var mapOptions = {
			center: new google.maps.LatLng(effectController.latitude, effectController.longitude),
			zoom: getParameterByName(document.URL, "zoom") ? Number(getParameterByName(document.URL, "zoom")) : 19,
			mapTypeId: google.maps.MapTypeId.ROADMAP
		};

		g_map = new google.maps.Map(map_canvas, mapOptions);

		google.maps.event.addListener(g_map, 'center_changed', function () {
			updateWebGL();
		});

		google.maps.event.addListener(g_map, 'tilt_changed', function () {
			updateWebGL();
		});

		g_overlay = new WebGLOverlay();
		g_overlay.setMap(g_map);

	});
}


function OnGLCanvasCreated(canvasElement: Element, elementId: string): void {
}

function OnGLCanvasFailed(canvasElement: Element, elementId: string): void {
	myLog("Could not create WebGL IE plugin, defaulting to Canvas renderer!");
	g_renderer = "canvas";
}

function toggleVisibility(transform: Object3D, materialName: string, hide: boolean): void {
	transform.traverse(function (transform) {
		applyOnMaterials(transform.material, function (material) {
			if (material.name && material.name.indexOf(materialName) >= 0) {
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

function ensureLoop(animation: any): void {

	for (var i = 0; i < animation.hierarchy.length; i++) {

		var bone = animation.hierarchy[i];

		var first = bone.keys[0];
		var last = bone.keys[bone.keys.length - 1];

		last.pos = first.pos;
		last.rot = first.rot;
		last.scl = first.scl;

	}

}

function updateGuiControl(c: GUIController): void {
	if (c.updateDisplay) c.updateDisplay();
}

function updateGui(gui: GUI): void {

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

function reduceGui(gui: GUI): boolean {

	if (!overrideSettings.opencontrols || !overrideSettings.opencontrols.length || overrideSettings.opencontrols.split(",").indexOf(gui.name) != -1) return false;

	var allControlsReduced = true;
	for (var i in gui.__controllers) {
		var c = gui.__controllers[i];
		if (overrideSettings.opencontrols.split(",").indexOf(c.property) == -1 && !c.neverRemove) {
			try {
				c.remove();
			} catch (e) {
				// maybe already be removed!
			}
		} else {
			allControlsReduced = false;
		}
	}

	var allFoldersReduced = true;
	for (var i in gui.__folders) {
		var folder = gui.__folders[i];
		if (reduceGui(folder)) {
			gui.removeFolder(folder);
		} else {
			allFoldersReduced = false;
		}
	}

	return allFoldersReduced && allControlsReduced;

}

function printLines(lines: number[], artifactId: string, prefix: string, message: string): void {
	g_pickInfoElem.innerHTML = message;
	var g_client = resolveArtifact(artifactId);
	var scene = g_client.scene;

	updateSelectableObjects(g_client);

	for (var tt = 0; tt < g_pathTransforms.length; tt++) {
		var transform = g_pathTransforms[tt];
		scene.remove(transform);
	}

	g_pathTransforms = [];

	var points: Vector3[] = [];
	var visited = new Map<number[], Object3D>();
	var pred: Object3D | null = null;
	var prune = false;
	var lastPoint = null;
	var count = 0;
	var costInfo = "";
	var myPosition: Vector3 | null = null;
	var segments = 0;
	var totalCount = 0;
	for (var tt = 0; tt < lines.length;) {
		if (lines[tt] == null)
			totalCount++;
		tt++;
	}
	for (var tt = 0; tt < lines.length;) {
		if (lines[tt] == null) {
			lastPoint = null;
			tt++;
			prune = false;

			var useNurb = true;
			var useTube = true && (totalCount <= 1);

			var curve: Curve<Vector3>;
			if (useNurb) {

				// NURBS curve

				var nurbsControlPoints = [];
				var nurbsKnots = [];
				var nurbsDegree = Math.min(Math.round(effectController.nurbs_degree), points.length - 1);

				for (var i = 0; i <= nurbsDegree; i++) {

					nurbsKnots.push(0);

				}

				for (var i = 0, j = points.length; i < j; i++) {

					nurbsControlPoints.push(
						new Vector4(
							points[i].x,
							points[i].y,
							points[i].z,
							1 // weight of control point: higher means stronger attraction
						)
					);

					var knot = (i + 1) / (j - nurbsDegree);
					nurbsKnots.push(MathUtils.clamp(knot, 0, 1));

				}

				curve = new NURBSCurve(nurbsDegree, nurbsKnots, nurbsControlPoints, null!, null!);

			} else {

				if (points.length >= 2) {
					// fix bug for getPointAt()
					points.push(points[points.length - 1].clone());
				}
				curve = new SplineCurve3(points);

			}

			let geometry: BufferGeometry;
            var tubeMesh: Group;
			if (!useTube) {

				geometry = new BufferGeometry();
				geometry.setFromPoints(curve.getPoints(points.length * 5));
				var nurbsMaterial = new LineBasicMaterial({ linewidth: 1000, color: 0x333333 });

				var nurbsLine = new Line(geometry, nurbsMaterial);
				scene.add(nurbsLine);
				g_pathTransforms.push(nurbsLine);

				//			var nurbsControlPointsGeometry = new Geometry();
				//			nurbsControlPointsGeometry.vertices = curve.controlPoints;
				//			var nurbsControlPointsMaterial = new LineBasicMaterial( { linewidth: 20, color: 0x333333, opacity: 0.25 } );
				//
				//			var nurbsControlPointsLine = new Line( nurbsControlPointsGeometry, nurbsControlPointsMaterial );
				//			nurbsControlPointsLine.position.copy( nurbsLine.position );
				//			scene.add( nurbsControlPointsLine );
				//			g_pathTransforms.push(nurbsControlPointsLine);

			    tubeMesh = nurbsLine as unknown as Group;
				(geometry as any).parameters = {path: curve};

			} else {

				geometry = new TubeGeometry(curve, points.length * 10, 0.2, 4, false);
				var color = segments == 0 ? 0xff00ff : Math.random() * 0xffffff;

				tubeMesh = SceneUtils.createMultiMaterialObject(geometry, [
					new MeshLambertMaterial({
						color: color,
						opacity: 0.8,
						transparent: true
					}),
					new MeshBasicMaterial({
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
					mesh.pred = pred!;
				}
				if (message.indexOf("Distance in meter") != -1)
					g_pickInfoElem.innerHTML = "Distance in meter: " + curve.getLength();
				if (useTube) myLog("Distance in meter: " + curve.getLength());
			}
			for (var i = 0; i < points.length; ++i) {
				visited.set([points[i].x, points[i].y, points[i].z], tubeMesh);
			}
			if (myPosition == null)
				myPosition = points[points.length - 1];

			tubeGeometry = geometry as TubeGeometry;
			tubeGeometryPointAt = 0;
			points = [];
			costInfo = "";
			pred = null;
			segments++;
		} else {
			var nextPoint = asVector3M([lines[tt + 0], lines[tt + 1], lines[tt + 2]]);
			points.push(nextPoint);
			if (lastPoint != null && !prune) {
				if (pred != null)
					pred.pred = start;
				costInfo = prefix + lines[tt + 3];
				var v = visited.get([nextPoint.x, nextPoint.y, nextPoint.z]);
				if (v != null) {
					pred = v;
					prune = true;
				}
				count++;
			}
			lastPoint = nextPoint;
			tt += 4;
		}
	}

	if (myPosition != null) {
		if (g_client.me == null) {

			var requiredThreeJS = [];

			requiredThreeJS.push(g_dir + "js/ShaderDeferred.js");
			requiredThreeJS.push(g_dir + "js/shaders/CopyShader.js");
			requiredThreeJS.push(g_dir + "js/shaders/FXAAShader.js");
			requiredThreeJS.push(g_dir + "js/postprocessing/EffectComposer.js");
			requiredThreeJS.push(g_dir + "js/postprocessing/RenderPass.js");
			requiredThreeJS.push(g_dir + "js/postprocessing/ShaderPass.js");
			requiredThreeJS.push(g_dir + "js/postprocessing/MaskPass.js");

			requirejs(requiredThreeJS, function () {

				var loader = new JSONLoader();

				loader.load(g_dir + "models/skinned/human_walk_0_female.js.json", function (geometry: Geometry, materials: Material[]) {

					geometry.computeVertexNormals();
					geometry.computeBoundingBox();

					ensureLoop(geometry.animation);
					AnimationHandler.add(geometry.animation);

					for (var i = 0, il = materials.length; i < il; i++) {

						var originalMaterial = materials[i] as MeshPhongMaterial;

						originalMaterial.map = null;
						originalMaterial.flatShading = false;
						originalMaterial.color.setHSL(0.01, 0.3, 0.3);
						originalMaterial.specular.setHSL(0, 0, 0.1);
						originalMaterial.shininess = 75;

					}


					var mesh = new SkinnedMesh(geometry, materials, false);

					mesh.rotation.y = Math.PI / 2;

					mesh.userData.delta = 25;

					scene.add(mesh);


					var animation = new Animation(mesh, "ActionFemale");
					animation.JITCompile = false;
					animation.interpolationType = AnimationHandler.LINEAR;

					animation.play();

					mesh.scale.copy(new Vector3(0.8, 0.8, 0.8));

					g_client.scene.add(mesh);
					g_client.me = mesh;
					g_client.me_shiftUp = 1.7;
					//			addSelectableObjects(g_client,mesh);

					g_client.me.position.copy(lastAnimationPos = myPosition!);
					g_client.me.position.y = g_client.me.position.y + g_client.me_shiftUp;
					g_client.me.updateMatrixWorld();

					updateClient(g_client);

				});

			});
			return;

			//		var arcShape = new Shape();
			//		arcShape.moveTo( 50, 10 );
			//		arcShape.absarc( 10, 10, 40, 0, Math.PI*2, false );
			//		var holePath = new Path();
			//		holePath.moveTo( 20, 10 );
			//		holePath.absarc( 10, 10, 10, 0, Math.PI*2, true );
			//		arcShape.holes.push( holePath );
			//		var shape = arcShape;
			//	
			//	
			//		var extrudeSettings = { depth: 200 }; // bevelSegments: 2, steps: 2 , bevelSegments: 5, bevelSize: 8, bevelThickness:5
			//		extrudeSettings.bevelEnabled = true;
			//		extrudeSettings.bevelSegments = 10;
			//		extrudeSettings.steps = 2;
			//	
			//		let geometry = new ExtrudeGeometry( shape, extrudeSettings );
			//		var mesh = SceneUtils.createMultiMaterialObject( geometry, [ new MeshLambertMaterial( { color: 0x00ff11 } ), new MeshBasicMaterial( { color: 0x000000, wireframe: false, transparent: true } ) ] );
			//		mesh.scale = new Vector3(0.01,0.01,0.01);
			//		mesh.rotation = new Vector3(MathUtils.degToRad(270),MathUtils.degToRad(0),MathUtils.degToRad(0));

			// g_client.scene.add(mesh);
			// g_client.me = mesh;
			// g_client.me_shiftUp = 0;
		}
		g_client.me.position.copy(lastAnimationPos = myPosition);
		g_client.me.position.y = g_client.me.position.y + g_client.me_shiftUp;
		g_client.me.updateMatrixWorld();
	}

	updateClient(g_client);
}

var g_updateClientTime;
var g_updateMe: number | null;
var lastAnimationPos: Vector3;

function motionByKeys(g_client: TClient): void {
	var lazy = false;
	var g_camera = g_client.g_camera;
	if (keyIsDown[KEY.PG_UP]) {
		g_camera.eye = lerpVector(g_camera.target, g_camera.eye, 11 / 12);
	} else
		if (keyIsDown[KEY.PG_DN]) {
			g_camera.eye = lerpVector(g_camera.target, g_camera.eye, 13 / 12);
		} else {
			var _deltaX = 0;
			var deltaY = 0;
			if (keyIsDown[KEY.LEFT]) _deltaX = -1;
			if (keyIsDown[KEY.RIGHT]) _deltaX = 1;
			if (keyIsDown[KEY.UP]) deltaY = 1;
			if (keyIsDown[KEY.DOWN]) deltaY = -1;
			var anyDelta = _deltaX != 0 || deltaY != 0;
			if (anyDelta && effectController.enable_maps) {
				g_mapsteps = 0;
				g_map.panBy(_deltaX * 10, deltaY * 10);
			} else
				if (anyDelta && keyIsDown[KEY.CTRL] && g_client.me) {
					if (clock == null)
						clock = new Clock();
					var delta = clock.getDelta();
					delta = delta * 3;

					if (_deltaX != 0 && deltaY != 0) {
						_deltaX = _deltaX * 0.70710678;
						deltaY = deltaY * 0.70710678;
					}
					_deltaX = _deltaX * delta;
					deltaY = deltaY * delta;
					g_client.me.position.x = g_client.me.position.x + deltaY;
					g_client.me.position.z = g_client.me.position.z + _deltaX;

					AnimationHandler.update(0.4 * delta);

					var rotX = _deltaX < 0 ? -Math.PI : 0;
					var rotY = deltaY < 0 ? -Math.PI / 2 : Math.PI / 2;
					if (!(_deltaX == 0 && deltaY == 0))
						if (_deltaX < 0 && deltaY > 0)
							g_client.me.rotation.y = 3 * Math.PI / 4; else
							if (_deltaX != 0 && deltaY != 0)
								g_client.me.rotation.y = (rotX + rotY) / 2; else
								g_client.me.rotation.y = _deltaX != 0 ? rotX : rotY;
					g_client.me.updateMatrixWorld();

					if (g_updateMe == null)
						g_updateMe = setTimeout(function () { try { theJavaFunction("", "", g_client.id, g_client.me.position.x, -g_client.me.position.z, g_client.me.position.y - g_client.me_shiftUp, "StartPointMoved"); } catch (e2) { } g_updateMe = null; }, 1000);

					tubeGeometry = null;
				} else
					if (anyDelta && isShift(keyIsDown[KEY.SHIFT])) {
						changePosition(-_deltaX, -deltaY, g_client);
						lazy = true;
					} else
						if (anyDelta) {
							changeRotation(-_deltaX / 20, deltaY / 20, keyIsDown[KEY.CTRL], g_client);
							lazy = true;
						} else
							if (animateTube && tubeGeometry && g_client.me && tubeGeometry.parameters.path.getLength() > 0) {
								if (clock == null)
									clock = new Clock();
								var delta = clock.getDelta();
								delta = delta * 10;

								tubeGeometryPointAt = tubeGeometryPointAt + delta;
								var ratio = tubeGeometryPointAt / tubeGeometry.parameters.path.getLength();
								if (ratio >= 1) {
									ratio = 1;
								}
								var pos = tubeGeometry.parameters.path.getPointAt(1 - ratio);
								pos.y = g_client.me.position.y;

								var alpha = Math.acos((pos.x - g_client.me.position.x) / pos.distanceTo(g_client.me.position));
								if (pos.z - g_client.me.position.z < 0)
									g_client.me.rotation.y = alpha + Math.PI / 2; else
									g_client.me.rotation.y = 2 * Math.PI - alpha + Math.PI / 2;

								g_client.me.position.x = pos.x;
								g_client.me.position.z = pos.z;
								g_client.me.updateMatrixWorld();

								AnimationHandler.update(0.4 * delta);

								var deltaVector = new Vector3(pos.x - lastAnimationPos.x, 0, pos.z - lastAnimationPos.z);
								lastAnimationPos = pos;
								if (isShift(keyIsDown[KEY.SHIFT])) {
									g_camera.eye.add(deltaVector);
									pos = g_camera.target.add(deltaVector);
									if (g_worldPosition)
										g_worldPosition.add(deltaVector);
								}

								doSetCamera(g_camera.eye, pos, g_angle, null, 1, g_client);

								if (ratio >= 1) {
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
	updateClient(g_client, lazy);
	//	setTimeout(function(){updateClient(g_client,lazy);}, Math.max(1, 50 - g_updateClientTime));  
}

function motionByKeysAll(): void {
	for (var i = 0; i < g_clients.length; ++i) {
		motionByKeys(g_clients[i]);
	}
}

function changePosition(deltaX: number, deltaY: number, g_client: TClient): void {
	if (deltaX == 0 && deltaY == 0) return;
	var g_camera = g_client.g_camera;
	var eye = g_camera.eye.clone().sub(g_camera.target);
	var axisX = eye.clone().cross(up);
	axisX = axisX.normalize();
	var axisY = eye;//eye.clone().cross(axisX);
	axisY.y = 0;
	axisY = axisY.normalize();
	axisX = axisX.multiplyScalar(deltaX / 10);
	axisY = axisY.multiplyScalar(deltaY / 10);
	var axis = axisY.add(axisX);
	g_camera.target = g_camera.target.add(axis);
	g_camera.eye = g_camera.eye.add(axis);
}

function changeRotation(deltaX: number, deltaY: number, freehand: boolean, g_client: TClient): void {
	enableOrbit(true, g_client);
	g_client.controls.rotateLeft(-deltaX);
	g_client.controls.rotateUp(-deltaY);
	g_client.controls.update();
}

function updateProjection(g_client: TClient) {
	if (!g_client.g_camera) { myLog("g_client.g_camera not defined!"); return; }
	setEyeAndTarget(g_client.g_camera.eye, g_client.g_camera.target, g_client);
}


function loadTextureCube(urls: string[]): void {
	envCube = ImageUtils.loadTextureCube(urls, undefined, function () {

		envCube!.format = RGBFormat;

		updateMaterials();

		updateClients();

	}, function () { alert("Error loading texture!"); });
}

function expect(controller: GUIController, value?: boolean): void {
	if (value == undefined) value = false;
	if (controller.initialValue != value) {
		controller.__onChange();
	}
}

function getObjectsFromTreeIDs(selected: string[]): Mesh<BufferGeometry, Material>[] {
	return getObjectsWithIDs(selected.map(function (ti) { if (ti.indexOf("_") != -1) return -1; return parseInt(ti.substring(2)); }));
}

function getTreeID(object: Object3D): string {
	return "ti" + object.id;
}

function getIntermediateTreeID(object: Object3D, parent: Object3D): string | null {
	if (parent && (getTruncatedIfcClass(parent) == "BuildingStorey" || getTruncatedIfcClass(parent) == "Space")) {
		return getTreeID(parent) + "_" + getTruncatedIfcClass(object);
	}
	return null;
}

function getTreeLabel(node: Object3D): string {
	//	var material = node.originalMaterial || node.material;
	//	if (material && material.name) {
	//		var materialName = material.name;
	//		if (materialName.indexOf("Ifc") != 0)
	//			materialName = "Ifc" + materialName;
	//		return materialName+" "+ node.name;
	//	}		
	if (node.name == "")
		return getTruncatedIfcClass(node);
	if (getTruncatedIfcClass(node) == "Space")
		return "Space " + node.name;
	return node.name;
}


function getTruncatedIfcClass(node: Object3D): string {
	if (node.storedMaterialName)
		return truncatedMaterialName(node.storedMaterialName);
	var material = node.originalMaterial || node.material;
	if (material && material.name)
		return truncatedMaterialName(material.name);
	return "Other";
}

function truncatedMaterialName(name: string): string {
	name = name.replace("-fx", "")
	if (name.indexOf("Ifc") == 0) {
		return name.substring(3);
	}
	return name;
}

function getTreeNodeForThreejsNode(node: Object3D): TreeItem {
	return { "id": getTreeID(node), "text": getTreeLabel(node), state: { loaded: node.children.length == 0 } };
}

function openParentNodes(object: Object3D): void {
	if (!object.parent) return;
	openParentNodes(object.parent as Object3D);
	jstree.jstree("open_node", '#' + getTreeID(object.parent), null, false);
	jstree.jstree("open_node", '#' + getIntermediateTreeID(object, object.parent as Object3D), null, false);
}

function generateTree(): void {

	if (jstree != null) return;

	jstree = $('#jstree').jstree({
		'core': {
			'data': function (obj:TreeItem, cb: (items:TreeItem[])=> void) {
				if (obj.id == "#") {
					var g_client = g_clients[0];
					cb.call(this, [getTreeNodeForThreejsNode(effectController.quickmode ? g_client.originalRoot : g_client.root)]);
				} else {
					var parentNode = getObjectsFromTreeIDs([obj.id])[0];
					if (getIntermediateTreeID(parentNode, parentNode)) {
						var childrenTree : TreeItem[] = [];
						var materialToTree : { [id:string]: TreeItem } = {};
						parentNode.children.forEach(
							function (child) {
								var childMaterial = getTruncatedIfcClass(child);
								var childTree: TreeItem = materialToTree[childMaterial];
								if (childTree == null) {
									childTree = { "id": getIntermediateTreeID(child, parentNode)!, "text": childMaterial, state: { loaded: true }, "children": [] };
									materialToTree[childMaterial] = childTree;
									childrenTree.push(childTree);
								}
								childTree.children!.push(getTreeNodeForThreejsNode(child));
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
		jstree = null!;
		select(getObjectsFromTreeIDs(data.selected));
		updateClients();
		jstree = $('#jstree') as JSTree;
	});

	jstree.on("dblclick.jstree", function (event) {
		var node = $(event.target).closest("li");
		locate(getObjectsFromTreeIDs([node[0].id]), g_clients[0], 20);
	});

}

function updateComponentsCheckbox(): void {
	var oneVisible = false;
	var oneHidden = false;
	for (var m in g_visibility) {
		oneVisible = oneVisible || g_visibility[m];
		oneHidden = oneHidden || !g_visibility[m];
	}
	if (oneVisible && oneHidden)
		effectController["Components"] = isIE11;
	else
		effectController["Components"] = oneVisible;
	updateGuiControl(componentsGui);
	$(componentsGui.__checkbox).prop("indeterminate", oneVisible && oneHidden);
}

function generateGui(): void {

	if (gui != null) return;

	gui = new GUI({ width: effectController.opencontrolsWidth, autoPlace: false });

	document.body.appendChild(gui.domElement);

	setClientSize(g_clients[0]);

	gui.close();
	gui.domElement.parentElement!.style.zIndex = "5";
	var h;
	var settingsChanged = function () {
		if (effectController.enable_maps) {
			updateWebGL();
		}
		else
			onWindowResize();
	};

	var createHandler = function (id: string) {

		return function () {

			var mat_old = materials[current_material!];
			mat_old.h = m_h.getValue();
			mat_old.s = m_s.getValue();
			mat_old.l = m_l.getValue();

			var mat = materials[id] as MeshPhongMaterial;

			current_material = null;

			if (mat.h == null) {
				mat.h = mat.color.getHSL({ h: 0, s: 0, l: 0 }).h;
				mat.s = mat.color.getHSL({ h: 0, s: 0, l: 0 }).s;
				mat.l = mat.color.getHSL({ h: 0, s: 0, l: 0 }).l;
			}

			m_h.setValue(mat.h);
			m_s.setValue(mat.s);
			m_l.setValue(mat.l);

			current_material = id;

			g_clients.forEach(function (g_client: TClient) {
				g_client.root.traverse(function (effect) {
					if (effect.material) {
						effect.material = mat.m || mat;
					}
				});
			});

			updateMaterials();


		};

	};

	updateMaterials = function () {

		if (!current_material) return;

		var refractionCube = envCube && effectController.refraction ? new Texture(envCube.image, CubeRefractionMapping) : null;

		g_clients.forEach(function (g_client: TClient) {
			g_client.root.traverse(function (effect) {

				if (!effect.material) return;

				effect.material.envMap = effectController.reflectOnMaterial ? refractionCube || envCube : null;
				effect.material.needsUpdate = true;

				//	    		try {
				//	    			if (effect.geometry) effect.geometry.computeTangents();
				//	            } catch (e) {}

				if (current_material === "textured") {

					effect.enableUvs = true;

				} else {

					effect.enableUvs = false;

				}

				if (current_material === "colors") {

					effect.enableColors = true;

				} else {

					effect.enableColors = false;

				}

				// materials

				if (effect.material.type == 'ShaderMaterial') {

					if (current_material === "dotted2") {

						effect.material.uniforms.uLineColor1.value.setHSL(effectController.hue, effectController.saturation, effectController.lightness);

					} else if (current_material === "hatching2") {

						var u = effect.material.uniforms;

						if (u.uLineColor2 == null)
							u.uLineColor2 = null;

						u.uLineColor1.value.setHSL(effectController.hue, effectController.saturation, effectController.lightness);
						u.uLineColor2.value.setHSL(effectController.hue, effectController.saturation, effectController.lightness);
						u.uLineColor3.value.setHSL(effectController.hue, effectController.saturation, effectController.lightness);
						u.uLineColor4.value.setHSL((effectController.hue + 0.2 % 1.0), effectController.saturation, effectController.lightness);

					} else {

						effect.material.uniforms.uBaseColor.value.setHSL(effectController.hue, effectController.saturation, effectController.lightness);

					}

				} else {

					effect.material.color.setHSL(effectController.hue, effectController.saturation, effectController.lightness);

				}




			});

			if (envCube && effectController.surroundings) {
				var shader = ShaderLib["cube"];
				shader.uniforms["tCube"].value = envCube;

				var material = new ShaderMaterial({

					fragmentShader: shader.fragmentShader,
					vertexShader: shader.vertexShader,
					uniforms: shader.uniforms,
					depthWrite: false,
					side: BackSide

				});

				sceneCube = new Scene();
				sceneCube.add(new Mesh(new BoxGeometry(100, 100, 100), material));
			} else {
				sceneCube = null;
			}

			updateClient(g_client);
		});
	};


	gui.add(effectController, "angle", 0.1, 180, 1).onChange(function () {
		g_angle = effectController.angle;
		settingsChanged();
	});

	expect(gui.add(effectController, 'orthographic', false).onChange(function () {
		settingsChanged();
	}));

	gui.add(effectController, 'panning_mode', false).onChange(function () {
		if (effectController.panning_mode)
			g_clients.forEach(function (g_client: TClient) {
				var camera = g_client.g_camera;
				doSetCamera(new Vector3(camera.target.x - 0.001, camera.target.y + camera.target.distanceTo(camera.eye), camera.target.z), camera.target, g_angle, null, 10, g_client);
			});
		settingsChanged();
	});

	expect(gui.add(effectController, 'tree', false).onChange(function () {
		$("#part_rightpane").toggleClass('pane_active', effectController.tree);
		generateTree();
		onWindowResize();
	}));

	h = gui.addFolder("maps");

	h.add(effectController, 'enable_maps').onChange(function () {
		initializeMap();
		settingsChanged();
	});

	var centerChanged = function () {
		if (g_map) {
			g_mapsteps = 1;
			g_map.setCenter(new google.maps.LatLng(effectController.latitude, effectController.longitude));
		}
	};

	var latControler = h.add(effectController, "latitude").min(effectController.latitude - 0.005).max(effectController.latitude + 0.005).onChange(centerChanged).onFinishChange(
		function () {
			this.min(effectController.latitude - 0.005).max(effectController.latitude + 0.005);
			this.updateDisplay();
		}
	);
	latControler.__precision = 7;
	latControler.updateDisplay();

	var lngControler = h.add(effectController, "longitude").min(effectController.longitude - 0.005).max(effectController.longitude + 0.005).onChange(centerChanged).onFinishChange(
		function () {
			this.min(effectController.longitude - 0.005).max(effectController.longitude + 0.005);
			this.updateDisplay();
		}
	);
	lngControler.__precision = 7;
	lngControler.updateDisplay();

	h.add(effectController, "apikey");

	h.add(effectController, "geolocation").onChange(function () {

		if (navigator.geolocation && !effectController.geolocation) {
			navigator.geolocation.clearWatch(geoHandle!);
			geoHandle = null;
			return;
		}


		function displayError(error: GeolocationPositionError) {
			if (error.code == error.PERMISSION_DENIED) {
				alert("Error: Permission denied");
			}
			if (error.code == error.POSITION_UNAVAILABLE) {
				alert("Error: Position unavailable");
			}
			if (error.code == error.TIMEOUT) {
				alert("Error: Request timeout");
			}
		}

		function displayPosition(position: GeolocationPosition) {
			myLog("Latitude: " + position.coords.latitude + ", Longitude: " + position.coords.longitude + ", Altitude: " + position.coords.altitude + ", Accuracy: " + position.coords.accuracy);
			//[effectController.latitude, effectController.longitude] = [position.coords.latitude, position.coords.longitude];
			if (g_map) {
				g_map.panTo(ownPosition = new google.maps.LatLng(position.coords.latitude, position.coords.longitude));
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


	misc = gui.addFolder("misc");

	var initialization = function () {

		if (materials) return;

		var requiredThreeJS = [];

		requiredThreeJS.push(g_dir + "js/shaders/CopyShader.js");
		requiredThreeJS.push(g_dir + "js/shaders/FXAAShader.js");
		requiredThreeJS.push(g_dir + "js/shaders/HorizontalTiltShiftShader.js");
		requiredThreeJS.push(g_dir + "js/shaders/VerticalTiltShiftShader.js");

		requiredThreeJS.push(g_dir + "js/MarchingCubes.js");
		requiredThreeJS.push(g_dir + "js/ShaderToon.js");

		requirejs(requiredThreeJS, function () {
			materials = generateMaterials();
			current_material = "shiny";

			// material (type)

			h = misc.addFolder("Material type");

			for (var m in materials) {

				effectController[m] = createHandler(m);
				h.add(effectController, m).name(m);

			}

			// material (cube)

			h = misc.addFolder("Environment");

			m = "none";
			effectController[m] = function () {

				envCube = null;

				updateMaterials();

			};
			h.add(effectController, m).name(m);

			m = "bridge";
			effectController[m] = function () {

				var r = t_dir + "textures/cube/Bridge2/";
				var urls = [r + "posx.jpg", r + "negx.jpg",
				r + "posy.jpg", r + "negy.jpg",
				r + "posz.jpg", r + "negz.jpg"];

				loadTextureCube(urls);

			};
			h.add(effectController, m);

			m = "castle";
			effectController[m] = function () {

				var path = t_dir + "textures/cube/SwedishRoyalCastle/";
				var format = '.jpg';
				var urls = [
					path + 'px' + format, path + 'nx' + format,
					path + 'py' + format, path + 'ny' + format,
					path + 'pz' + format, path + 'nz' + format
				];

				loadTextureCube(urls);

			};
			h.add(effectController, m);

			m = "park";
			effectController[m] = function () {

				var path = t_dir + "textures/cube/Park2/";
				var format = '.jpg';
				var urls = [
					path + 'posx' + format, path + 'negx' + format,
					path + 'posy' + format, path + 'negy' + format,
					path + 'posz' + format, path + 'negz' + format
				];

				loadTextureCube(urls);

			};
			h.add(effectController, m);

			m = "park3med";
			effectController[m] = function () {

				var r = t_dir + "textures/cube/Park3Med/";

				var urls = [r + "px.jpg", r + "nx.jpg",
				r + "py.jpg", r + "ny.jpg",
				r + "pz.jpg", r + "nz.jpg"];

				loadTextureCube(urls);

			};
			h.add(effectController, m);

			m = "escher";
			effectController[m] = function () {

				var r = t_dir + "textures/cube/Escher/";

				var urls = [r + "px.jpg", r + "nx.jpg",
				r + "py.jpg", r + "ny.jpg",
				r + "pz.jpg", r + "nz.jpg"];


				loadTextureCube(urls);

			};
			h.add(effectController, m);

			m = "sky";
			effectController[m] = function () {

				var path = t_dir + "textures/cube/skybox/";
				var format = '.jpg';
				var urls = [
					path + 'px' + format, path + 'nx' + format,
					path + 'py' + format, path + 'ny' + format,
					path + 'pz' + format, path + 'nz' + format
				];

				loadTextureCube(urls);

			};
			h.add(effectController, m);

			m = "pisa";
			effectController[m] = function () {

				var path = t_dir + "textures/cube/pisa/";
				var format = '.png';
				var urls = [
					path + 'px' + format, path + 'nx' + format,
					path + 'py' + format, path + 'ny' + format,
					path + 'pz' + format, path + 'nz' + format
				];

				loadTextureCube(urls);

			};
			h.add(effectController, m);

			h.add(effectController, "refraction").onChange(updateMaterials);
			h.add(effectController, "reflectOnMaterial").onChange(updateMaterials);
			h.add(effectController, "surroundings").onChange(updateMaterials);

		});

	};
	effectController["More.."] = initialization;
	misc.add(effectController, "More..");


	// building material (color)

	var updateCol = function () {
		g_clients.forEach(function (g_client: TClient) {
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

		g_clients.forEach(function (g_client: TClient) {
			setupColors(g_client);
			updateColors(g_client);
			updateClient(g_client);
		});
		materialCtls.forEach(updateGuiControl);
		inUpdateColScheme = false;
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

	materialVisibilityGui = gui.addFolder("Material visibility");


	if (effectController.flatten_materialvisibility) materialVisibilityGui = gui;

	effectController["Components"] = true;
	componentsGui = materialVisibilityGui.add(effectController, "Components", effectController["Components"]);
	componentsGui.onChange(function () {
		for (var m in g_visibility) { g_visibility[m] = effectController["Components"]; }
		materialCtls.forEach(updateGuiControl);
		updateCol();
	});
	componentsGui.neverRemove = effectController.flatten_materialvisibility;
	updateComponentsCheckbox();
	componentsGui.domElement!.parentNode!.parentElement!.style.backgroundColor = "#000000";

	var g_visibility_sorted = [];
	for (var key in g_visibility)
		g_visibility_sorted.push(key);
	g_visibility_sorted.sort();
	for (var tt = 0; tt < g_visibility_sorted.length; tt++) {
		var m = g_visibility_sorted[tt];
		if (!(g_colors[m] && g_colors[m].hideFromMaterialVisibility)) {
			var materialCtl = materialVisibilityGui.add(g_visibility, m, g_visibility[m]).onChange(updateCol);
			materialCtls.push(materialCtl);
			materialCtl.neverRemove = effectController.flatten_materialvisibility;
		}
	}


	effectController["Transparency"] = true;
	var transparencyGui = materialVisibilityGui.add(effectController, "Transparency", effectController["Transparency"]);
	transparencyGui.domElement!.parentNode!.parentElement!.style.backgroundColor = "#000000";
	transparencyGui.__checkbox.style.visibility = "hidden";
	transparencyGui.neverRemove = effectController.flatten_materialvisibility;

	for (var m in g_colorSchemes) {
		b_colorSchemes[m] = (m == defaultScheme);
		var mScheme = m;
		var colorScheme = materialVisibilityGui.add(b_colorSchemes, m, b_colorSchemes[m]).onChange(updateColScheme);
		materialCtls.push(colorScheme);
		colorScheme.neverRemove = effectController.flatten_materialvisibility;
		colorScheme.__checkbox.type = "radio";
	}

	// selection info

	selectionInfoGui = gui.addFolder("Selection info");

	effectController.id = "";
	selectionInfoGui.add(effectController, "id");
	effectController.material = "";
	selectionInfoGui.add(effectController, "material");
	effectController.geometry = "";
	selectionInfoGui.add(effectController, "geometry");
	effectController.distance = 0.1;
	selectionInfoGui.add(effectController, "distance");
	selectionInfoGui.add(effectController, 'select_face');



	effectController["locate"] = function () {
		if (g_selectedInfo.length == 0) {
			alert("no object selected!");
			return;
		}
		locate(g_selectedInfo, g_clients[0], 20);
	};
	selectionInfoGui.add(effectController, "locate");

	effectController["select parent object"] = function () {
		if (g_selectedInfo.length == 0) {
			alert("no object selected!");
			return;
		}
		var parent = g_selectedInfo[0].originalParent || g_selectedInfo[0].parent;
		if (parent == null) {
			alert("no parent object available!");
			return;
		}
		select([parent as Mesh<BufferGeometry, Material>], g_clients[0]);
		updateClient(g_clients[0]);

	};
	selectionInfoGui.add(effectController, "select parent object");


	effectController["use identiy matrix"] = function () {
		resetLocalCoordinateSystems(g_clients[0], g_selectedInfo[0]);
		updateClient(g_clients[0]);
	};
	selectionInfoGui.add(effectController, "use identiy matrix");

	effectController["show_bounding_box"] = function () {
		if (g_selectedInfo.length == 0 && !oldBBbox) {
			alert("no object selected!");
			return;
		}
		paintBoundingBox(getBoundingBoxOfTree(g_selectedInfo), g_clients[0]);
	};
	selectionInfoGui.add(effectController, "show_bounding_box");


	effectController["show_bounding_sphere"] = function () {
		if (g_selectedInfo.length == 0 && !oldBBSphere) {
			alert("no object selected!");
			return;
		}
		paintBoundingSphere(g_selectedInfo.length > 0 ? g_selectedInfo[0].geometry!.boundingSphere!.clone().applyMatrix4(g_selectedInfo[0].matrixWorld) : undefined, g_clients[0]);
	};
	selectionInfoGui.add(effectController, "show_bounding_sphere");

	effectController["show_normals"] = function () {
		if (g_selectedInfo.length == 0 && !meshWithVisualizedNormals) {
			alert("no object selected!");
			return;
		}
		paintNormals(g_selectedInfo.length > 0 ? g_selectedInfo[0] : undefined, g_clients[0]);
	};
	selectionInfoGui.add(effectController, "show_normals");

	function readXYZFromArgs(array: ArrayLike<number>, index: number, target: Vector3) {
		target.set(array[index], array[index + 1], array[index + 2]);
	}

	effectController["invert_vertex_order"] = function () {
		if (g_selectedInfo.length == 0) {
			alert("no object selected!");
			return;
		}
		var object = g_selectedInfo[0];
		let geometry = object.geometry;
		if (geometry.isBufferGeometry) {
			var array = geometry.attributes.position.array;
            var _array = new Float32Array(array);
			for (var i = 0; i < array.length; i += 9) {
				var ax = array[i + 0];
				var ay = array[i + 1];
				var az = array[i + 2];
				var cx = array[i + 6 + 0];
				var cy = array[i + 6 + 1];
				var cz = array[i + 6 + 2];
				_array[i + 0] = cx;
				_array[i + 1] = cy;
				_array[i + 2] = cz;
				_array[i + 6 + 0] = ax;
				_array[i + 6 + 1] = ay;
				_array[i + 6 + 2] = az;
			}
            geometry.setAttribute('position', new BufferAttribute(_array, 3));
			geometry.attributes.position.needsUpdate = true;
			var meltedGeometry = (object.originalMaterial || object.material).meltedGeometry;
			if (meltedGeometry) {
				meltedGeometry.attributes.position.needsUpdate = true;
			}
		}
		updateClient(g_clients[0]);
	};
	selectionInfoGui.add(effectController, "invert_vertex_order");

	effectController["center_vertex_order"] = function () {
		if (g_selectedInfo.length == 0) {
			alert("no object selected!");
			return;
		}
		var object = g_selectedInfo[0];
		let geometry = object.geometry;
		if (geometry.isBufferGeometry && geometry.attributes.position) {
			var array = geometry.attributes.position.array;
			var vA = new Vector3();
			var vB = new Vector3();
			var vC = new Vector3();
			var cb = new Vector3();
			var ab = new Vector3();
			var center = geometry.boundingSphere!.center;
            var _array = new Float32Array(array);
			for (var i = 0; i < array.length; i += 9) {
				readXYZFromArgs(array, i, vA);
				readXYZFromArgs(array, i + 3, vB);
				readXYZFromArgs(array, i + 6, vC);

				cb.subVectors(vC, vB);
				ab.subVectors(vA, vB);
				cb.cross(ab);

				vA.subVectors(center, vA);

				if (vA.dot(cb) > 0) {
					var ax = array[i + 0];
					var ay = array[i + 1];
					var az = array[i + 2];
					var cx = array[i + 6 + 0];
					var cy = array[i + 6 + 1];
					var cz = array[i + 6 + 2];
					_array[i + 0] = cx;
					_array[i + 1] = cy;
					_array[i + 2] = cz;
					_array[i + 6 + 0] = ax;
					_array[i + 6 + 1] = ay;
					_array[i + 6 + 2] = az;
				}
			}
            geometry.setAttribute('position', new BufferAttribute(_array, 3));
			geometry.attributes.position.needsUpdate = true;
			var meltedGeometry = (object.originalMaterial || object.material).meltedGeometry;
			if (meltedGeometry) {
				meltedGeometry.attributes.position.needsUpdate = true;
			}
		}
		updateClient(g_clients[0]);
	};
	selectionInfoGui.add(effectController, "center_vertex_order");

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
	misc.add(effectController, "nurbs_degree", 1, 10, 1).step(1).onChange(function () {
		settingsChanged();
	});
	misc.add(effectController, 'select_by_dblclick', false);
	if (false && !effectController.vertexnormals && overrideSettings.vertexnormals != false) {
		var g_client = g_clients[0];
		var geometryCount = 0;
		g_client.root.traverse(function (mesh) {
			if (mesh.geometry) {
				geometryCount++;
			}
		});
		effectController.vertexnormals = geometryCount < 50;
	}
	misc.add(effectController, 'quickmode').onChange(function () {
		g_clients.forEach(function (g_client: TClient) {
			unSelectAll(g_client);
			if (g_client.originalRoot) {
				var root = g_client.root;
				g_client.scene.remove(root);
				g_client.scene.add(g_client.originalRoot);
				g_client.root = g_client.originalRoot;
				g_client.originalRoot = root;
			} else if (effectController.quickmode) {
				melt(g_client);
			}
			settingsChanged();
		});
	});
	var vertexnormalsChanged;
	misc.add(effectController, 'vertexnormals').onChange(vertexnormalsChanged = function () {
		var g_client = g_clients[0];
		g_client.root.traverse(function (mesh) {
			let geometry = mesh.geometry;
			if (geometry) {
                geometry.computeVertexNormals();
                geometry.attributes.normal.needsUpdate = true;
                if (effectController.vertexnormals) {
                    var faceGeometry = assureNoBufferGeometry(geometry);
                    faceGeometry.computeFaceNormals();
                    faceGeometry.computeVertexNormals(true);
                    mesh.geometry = assureBufferGeometry(faceGeometry);
                    geometry.attributes.normal.needsUpdate = true;
                }
			}
		});
		if (meshWithVisualizedNormals) {
			var _meshWithVisualizedNormals = meshWithVisualizedNormals;
			meshWithVisualizedNormals = null;
			paintNormals(_meshWithVisualizedNormals, g_client);
		}
		settingsChanged();
	});



	{

		var extrusion = gui.addFolder("extrusion");

		effectController["extrusion_length"] = "0";
		extrusionLengthGui = extrusion.add(effectController, "extrusion_length");

		effectController["closing_angle"] = "0";
		closingAngleGui = extrusion.add(effectController, "closing_angle");

		effectController["bend radius"] = 1;
		extrusion.add(effectController, "bend radius", 0, 3, 0.1).onChange(paintBendPoints);

		effectController["steps"] = 20;
		extrusion.add(effectController, "steps", 1, 100, 1).step(1).onChange(paintBendPoints);

		effectController["suspension_distance"] = 0.5;
		extrusion.add(effectController, "suspension_distance", 0.1, 3, 0.1).onChange(paintBendPoints);

		effectController["suspension_length"] = 1;
		extrusion.add(effectController, "suspension_length", 0.1, 3, 0.1).onChange(paintBendPoints);

		//		effectController[ "set profile" ] = function () {
		//			g_profile = g_selectedInfo;
		//		};
		//		extrusion.add( effectController, "set profile" );

		effectController["add bend point"] = function () {

			var i = effectController.bendPointCount = (effectController.bendPointCount || 0) + 1;

			var bend = "angle " + i;
			var line = "line " + i;
			effectController[bend] = 90;
			extrusion.add(effectController, bend, -90, 90, 1).onChange(paintBendPoints);
			effectController[line] = 1;
			extrusion.add(effectController, line, 0, 10, 0.1).onChange(paintBendPoints);

			paintBendPoints();

		};
		extrusion.add(effectController, "add bend point");

	}

	debugGui = gui.addFolder("debug");
	debugGui.add(effectController, 'log_on_screen').onChange(function () {
		settingsChanged();
	});
	expect(fpsGui = debugGui.add(effectController, 'fps', false).onChange(function () {
		if (effectController.fps) {
			if (stats == null) {
				stats = new Stats();
				stats.domElement.style.position = 'absolute';
				stats.domElement.style.top = '0px';
				container.appendChild(stats.domElement);
			} else {
				stats.domElement.style.display = "block";
			}
		} else {
			if (stats != null) {
				stats.domElement.style.display = "none";
			}
		}
		settingsChanged();
	}));
	expect(debugGui.add(effectController, 'wireframe').onChange(function () {
		g_clients.forEach(function updateFillMode(g_client: TClient) {
			for (var m in g_client.g_colors) {
				const material = g_client.g_colors[m] as MeshPhongMaterial;
				material.wireframe = effectController.wireframe;
				material.wireframeLinewidth = 1;
				material.needsUpdate = true;
			}
		});
		settingsChanged();
	}));
	expect(debugGui.add(effectController, 'double_side_material').onChange(function () {
		for (var m in g_colors) {
			var material = g_colors[m] as MeshPhongMaterial;
			material.side = effectController.double_side_material ? DoubleSide : FrontSide;
			material.needsUpdate = true;
		}
		settingsChanged();
	}));
	lazyRenderingGui = debugGui.add(effectController, 'lazy_rendering').onChange(function () {
		settingsChanged();
	});


	//	effectController[ "log_scene" ] = function () {
	//		g_clients[0].scene.traverse(function (child) { 
	//			var p = child;
	//			var space = "";
	//			while (p=p.parent) space += "	"; 
	//			var material = child.baseMaterial || child.material;
	//			myLog(space+child.type+" id="+child.id+" name="+child.name+(material?" material="+(material.name || "unnamed"):""));
	//		});
	//	};
	//	debugGui.add( effectController, "log_scene" );

	const thirdParty = debugGui.addFolder("3rd Party Remote Tools");

	effectController["ThreeInspector"] = function () {
		g_clients[0].scene.traverse(function (child) {

			requirejs(['https://github.com/zz85/zz85-bookmarklets/raw/master/js/ThreeInspector.js'], function () {
				var g_client = g_clients[0];
				g_client.scene.traverse(function (child) {
					if (child.matrixAutoUpdate === false)
						child.matrixAutoUpdate = true;
				});
				g_client.scene.autoUpdate = true;
				effectController.lazy_rendering = false;
				updateGuiControl(lazyRenderingGui);
				settingsChanged();
			});

		});
	};
	thirdParty.add(effectController, "ThreeInspector");

	effectController["threex.rendererstats"] = function () {
		g_clients[0].scene.traverse(function (child) {
			requirejs(['https://raw.githubusercontent.com/jeromeetienne/threex.rendererstats/master/threex.rendererstats.js'], function () {
				rendererStats = new THREEx.RendererStats();
				rendererStats.domElement.style.zIndex = 4;
				rendererStats.domElement.style.position = 'absolute';
				rendererStats.domElement.style.left = '0px';
				rendererStats.domElement.style.bottom = '0px';
				rendererStats.domElement.style.width = 'auto';
				document.body.appendChild(rendererStats.domElement);
			});
		});
	};
	thirdParty.add(effectController, "threex.rendererstats");


	GUI.prototype.removeFolder =
		function (name: string) {
			var folder = this.__folders[name];
			if (!folder) return;
			folder.close();
			folder.__ul.parentNode.removeChild(folder.__ul);
			//			dom.removeClass(this.__folders[name].li, 'folder');
			this.__folders[name] = undefined;
			//			this.onResize();
		};


	reduceGui(gui);

}

var g_emptyArray: Vector3[] = [];
var g_emptyDoubleArray = [[]];
var g_emptyColor: Color;

function optArray(ar: any): any {
	if (!ar)
		return ar;
	if (ar.length == 0)
		return g_emptyArray;
	return ar;
}

function optThree(obj: Color, emptyObj: Color): Color {
	if (obj.equals(emptyObj))
		return emptyObj;
	return obj;
}

function resetLocalCoordinateSystems(g_client: TClient, root?: Object3D): void {
	var alwaysClone = root;
	var makeAbsolute = !root;
	root = root || g_client.root;
	root.traverse(function (mesh) {
		if (mesh.geometry && mesh.material) {
			if (mesh.geometry.taken || alwaysClone) {
				mesh.geometry = mesh.geometry.clone();
			} else {
				mesh.geometry.taken = true;
			}
		}
	});
	root.traverse(function (mesh) {
		if (mesh.geometry && mesh.material) {
			mesh.geometry.taken = false;
			mesh.geometry.applyMatrix4(makeAbsolute ? mesh.matrixWorld : mesh.matrix);
		}
	});

	root.traverse(function (mesh) {
		if (mesh.position) {
            mesh.position.set(0, 0, 0);
            mesh.rotation.set(0, 0, 0);
            mesh.scale.set(1, 1, 1);
            mesh.updateMatrix();
		}
	});
	g_client.scene.updateMatrixWorld();

}

function getCoordinateCount(geometry: Geometry & BufferGeometry): number {
	return geometry.vertices ? geometry.vertices.length * 3 : geometry.attributes.position.array.length;
}

function melt(g_client: TClient): void {

	// Merge two geometries or geometry and geometry from object (using object's transform)

	var meltStart = new Date().getTime();
	myLog("Melting...");

	g_client.scene.updateMatrixWorld();

    resetLocalCoordinateSystems(g_client);

    var geometriesOfMaterial: { [mat: string]: BufferGeometry[] } = {};

    g_client.root.traverse(function (mesh) {
        var mat: string;
        if (mesh.geometry && mesh.material && (mat = mesh.material.name)) {
            var geometries = geometriesOfMaterial[mat];
            if (!geometries) {
                geometriesOfMaterial[mat] = geometries = [];
            }
            geometries.push(mesh.geometry);
        }
    });

    var cityMesh = new Object3D();
    cityMesh.name = "melted meshes";
    g_client.scene.add(cityMesh);

    for (let mat in geometriesOfMaterial) {
        var geometries = geometriesOfMaterial[mat];
        var meltedGeometry = BufferGeometryUtils.mergeBufferGeometries(geometries, true);

        g_client.g_colors[mat].meltedGeometry = meltedGeometry;
        var materialMesh = new Mesh(meltedGeometry, g_client.g_colors[mat]);
        setupUVs(materialMesh);
        cityMesh.add(materialMesh);
        materialMesh.name = "melted meshes for material " + mat;
        myLog(materialMesh.name);
        if (mat == "Door" || mat == "Window")
            materialMesh.renderOrder = -2;
    }

    g_client.root.traverse(function (mesh) {
        let geometry = mesh.geometry;
        if (geometry) {

            geometry.boundingSphere = null;
            geometry.computeBoundingSphere();

            // update flags

            for (let attribute in geometry.attributes)
                geometry.attributes[attribute].needsUpdate = true;
        }
    });


    g_client.originalRoot = g_client.root;
    g_client.scene.remove(g_client.root);

    g_client.root = cityMesh as Object3D;
    g_client.scene.updateMatrixWorld();

	myLog("Melt time=" + (new Date().getTime() - meltStart));
}


var g_profile: Mesh[] = [];

function getVerticesOfFaces(geometry: Geometry| BufferGeometry): Vector3[] {
    if (isBufferGeometry(geometry)) {
		return getOnlyUsedVertices(geometry);
	}
	var vertices: Vector3[] = [];
	for (var f = 0; f < geometry.faces.length; f++) {
		var face = geometry.faces[f];
		if (geometry.vertices[face.a]) vertices.push(geometry.vertices[face.a]);
		if (geometry.vertices[face.b]) vertices.push(geometry.vertices[face.b]);
		if (geometry.vertices[face.c]) vertices.push(geometry.vertices[face.c]);
	}
	return vertices;
}

function readPolygons(): number[] {

	var g_client = g_clients[0];

	var result: number[] = [];

	g_client.root.traverse(function (child) {
		let geometry = child.geometry;
		if (child.visible && geometry && child.material && g_profile.indexOf(child) == -1) {
			var vectors = getVerticesOfFaces(geometry);
			for (var v = 0, vlen = vectors.length; v < vlen; v++) {
				var ar = vector3ToArray(child.localToWorld(vectors[v].clone()));
				for (var i = 0; i < ar.length; i++)
					result.push(ar[i]);
			}
		}
	});

	return result;

}

function paintBendPoints(): void {

	var g_client = g_clients[0];

	var initialExtrusion = g_profile.length == 0;

	if (g_profile.length == 0) {

		g_client.root.traverse(function (child) {
			let geometry = child.geometry;
			if (geometry && child.material && g_profile.length == 0) {
				g_profile = [assureMeshWithNoBufferGeometry(child)];
			}
		});

	}

	// NURBS curve

	var nurbsControlPoints: Vector4[] = [];
	var nurbsKnots = [];
	var nurbsDegree = 2;

	var os = new Vector4(0, 0, 0, 0);

	var ww = 10.0;
	//var t = new Vector4(1, 0, 0, undefined);
	var t = new Vector3(1, 0, 0);
	nurbsControlPoints.push(new Vector4(0, 0, 0, 1).add(os));
	nurbsControlPoints.push(t.clone().divideScalar(200000).add(os));
	nurbsControlPoints.push(t.clone().divideScalar(100000).add(os));

	nurbsKnots.push(0);
	nurbsKnots.push(0);
	nurbsKnots.push(0);
	nurbsKnots.push(1);
	nurbsKnots.push(1);
	nurbsKnots.push(1);

	var sampleClosedSpline = new NURBSCurve(nurbsDegree, nurbsKnots, nurbsControlPoints, null!, null!);

	var point = sampleClosedSpline.controlPoints[sampleClosedSpline.controlPoints.length - 1];
	var points = [new Vector3(point.x, point.y, point.z)];
	var addedAngles = 0;
	for (var i = 0; i < effectController.bendPointCount; i++) {
		var bend = "angle " + (i + 1);
		var line = "line " + (i + 1);
		var lineLength = effectController[line] / ww;
		t = sampleClosedSpline.addArcAndLine(t, effectController[bend] / 90, lineLength, effectController["bend radius"] / ww);
		addedAngles += effectController[bend];
		point = point.clone().add(t.clone().multiplyScalar(lineLength));
		points.push(new Vector3(point.x, point.y, point.z));
	}

	if (points.length >= 2) {
		// fix bug for getPointAt()
		points.push(points[points.length - 1].clone());
	}
	//sampleClosedSpline = new SplineCurve3(points);
	//sampleClosedSpline = new NURBSCurve(nurbsDegree, sampleClosedSpline.knots, sampleClosedSpline.controlPoints, null!, null!);
	sampleClosedSpline.endKnot = sampleClosedSpline.knots.length - 1;

	effectController["extrusion_length"] = "" + (sampleClosedSpline.getLength() * ww);
	updateGuiControl(extrusionLengthGui);


	effectController["closing_angle"] = "" + (addedAngles % 360);
	updateGuiControl(closingAngleGui);

	var extrudeSettings = { bevelEnabled: false, steps: effectController["steps"], extrudePath: sampleClosedSpline }; // bevelSegments: 2, steps: 2 , bevelSegments: 5, bevelSize: 8, bevelThickness:5,

	var parent = new Mesh();
	g_client.scene.add(parent);

	for (var tt = 0; tt < g_profile.length; tt++) {
		const child = g_profile[tt];

		let geometry = child.geometry;
		if (geometry && child.material) {

			var shapes = [];

			var bbox = new Box3();
			bbox.setFromPoints(getOnlyUsedVertices(geometry));
			var offs = bbox.clone().min.add(bbox.max).divideScalar(2);
			var minToMax = bbox.clone().max.sub(bbox.min);
			var normal = new Vector3(1, 0, 0);
			if (minToMax.x < minToMax.y && minToMax.x < minToMax.z) {
				normal = new Vector3(1, 0, 0);
			} else
				if (minToMax.y < minToMax.x && minToMax.y < minToMax.z) {
					normal = new Vector3(0, 1, 0);
				} else
					if (minToMax.z < minToMax.x && minToMax.z < minToMax.y) {
						normal = new Vector3(0, 0, 1);
					}

			var vertices = getVerticesOfFaces(geometry);

			for (var f = 0; f < vertices.length; f += 3) {
				var vectors = [vertices[f + 0], vertices[f + 1], vertices[f + 2]];

				var inval = false;
				for (var v = 0, vlen = vectors.length; v < vlen; v++) {
					inval = parseFloat(vectors[v].clone().sub(bbox.min).dot(normal).toFixed(6)) != 0;
					if (inval) break;
					var p = vectors[v].clone().sub(offs);
					if (normal.y == 1)
						p = new Vector2(-p.x, p.z);
					if (normal.x == 1)
						p = new Vector2(-p.y, -p.z);
					if (normal.z == 1)
						p = new Vector2(-p.x, p.y);
					vectors[v] = p;

				};
				if (inval) continue;

				var shape = new Shape();
				shape.moveTo(vectors[0].x, vectors[0].y);

				for (var v = 1, vlen = vectors.length; v < vlen; v++) {

					shape.lineTo(vectors[v].x, vectors[v].y);

				};

				shapes.push(shape);
			}

			if (shapes.length > 0) {
				geometry = new ExtrudeGeometry(shapes, extrudeSettings);
				if (effectController.vertexnormals) geometry.computeVertexNormals();
				var mesh = new Mesh(geometry, child.material);
				//				mesh.position = child.position.clone();
				//				mesh.rotation = child.rotation.clone();
				//				mesh.quaternion = child.quaternion.clone();
				//				mesh.scale = child.scale.clone();

				parent.add(mesh);
				g_client.objects.push(mesh);


				var suspensionCount = Math.ceil(sampleClosedSpline.getLength() * ww / effectController["suspension_distance"]);
				myLog("suspensionCount=" + suspensionCount);
				//var suspensionDistance = sampleClosedSpline.getLength()*ww/suspensionCount;
				bbox = getBoundingBoxOfTree([mesh as Object3D])!;
				for (var tt = 0; tt <= suspensionCount; tt++) {

					var delta = 0;
					if (tt == 0) delta = 1 / suspensionCount / 10;
					if (tt == suspensionCount) delta = -1 / suspensionCount / 10;
					let point = sampleClosedSpline.getPointAt(tt / suspensionCount + delta);

					var rectLength = 0.004, rectWidth = 0.004;
					var rectShape = new Shape();
					rectShape.moveTo(-rectLength / 2, -rectWidth / 2);
					rectShape.lineTo(-rectLength / 2, rectWidth / 2);
					rectShape.lineTo(rectLength / 2, rectWidth / 2);
					rectShape.lineTo(rectLength / 2, -rectLength / 2);
					rectShape.lineTo(-rectLength / 2, -rectLength / 2);

					geometry = new ExtrudeGeometry(rectShape, { depth: -effectController["suspension_length"] / ww, bevelEnabled: false, bevelSegments: 2, steps: 1 });
					if (effectController.vertexnormals) geometry.computeVertexNormals();
					mesh = new Mesh(geometry, child.material);
					//					mesh.position = child.position.clone();
					//					mesh.rotation = child.rotation.clone();
					//					mesh.quaternion = child.quaternion.clone();
					//					mesh.scale = child.scale.clone();
					mesh.rotation.x += MathUtils.degToRad(90);
					mesh.position.y += bbox ? bbox.max.y : 0;
					mesh.position.add(point);
					parent.add(mesh);
					g_client.objects.push(mesh);
				}
			}

		}
	}

	if (parent.children.length > 0) {
		g_client.scene.remove(g_client.root);
		g_client.root = parent as Object3D;
		parent.updateMatrixWorld();
		if (effectController.bendPointCount == 1) {
			locate([parent as Object3D], g_client, 10);
		}
	} else
		g_client.scene.remove(parent);


	updateSelectableObjects(g_client);
	updateClient(g_client);

}

function start(_overrideSettings: any): void {

	overrideSettings = _overrideSettings;

	var regex = /[?&]([^=#]+)=([^&#]*)/g,
		match;
	while (match = regex.exec(document.URL)) {
		var val = match[2];
		overrideSettings[match[1]] = val;
	}

	for (let m in overrideSettings) {
		let val = overrideSettings[m];
		if (val == "true") val = true;
		if (val == "false") val = false;
		if (!isNaN(parseFloat(val))) val = parseFloat(val);
		overrideSettings[m] = val;
	}

	g_dir = overrideSettings.g_dir || "ui/WebContent/threejs/";
	g_path = overrideSettings.g_path || window.location.href;
	g_renderer = overrideSettings.g_renderer || "webgl";

	if (overrideSettings.g_colors)
		for (var m in overrideSettings.g_colors)
			g_colors[m] = overrideSettings.g_colors[m];

	effectController = {
		orthographic: false,
		wireframe: false,
		enable_maps: false,
		latitude: 0.0,
		longitude: 0.0,
		colladaUnit: 1.0,
		apikey: "enter a google maps api key here..",
		angle: g_angle,
		geolocation: false,
		fps: false,
		renderer_stats: false,

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
		opencontrolsWidth: 275,
		displaceGui: true,
		acceptablefps: 2
	};

	for (let m in overrideSettings) {
		let val = overrideSettings[m];
		effectController[m] = val;
	}

	document.onkeydown = function (e) {
		if (e.target && (e.target as HTMLElement).tagName == "TEXTAREA") return;
		var keyChar = e.keyCode;
		if (!keyIsDown[keyChar]) {
			keyIsDown[keyChar] = true;
			motionByKeysAll();
			if (!keyIsDown[KEY.SHIFT] && (keyChar == KEY.S || keyChar == KEY.W || keyChar == KEY.D || keyChar == KEY.A || keyChar == KEY.R)) {
				var g_client = g_clients[0];
				if (keyChar == KEY.S) toggleVisibility(g_client.root, "Space", g_client.hideSpaces = !g_client.hideSpaces);
				if (keyChar == KEY.W) toggleVisibility(g_client.root, "Wall", g_client.hideWalls = !g_client.hideWalls);
				if (keyChar == KEY.D) toggleVisibility(g_client.root, "Door", g_client.hideDoors = !g_client.hideDoors);
				if (keyChar == KEY.R) toggleVisibility(g_client.root, "", g_client.hideModel = !g_client.hideModel);
				updateClient(g_client);
			}
			if (keyIsDown[KEY.F] && keyIsDown[KEY.SHIFT]) {
				fpsGui.setValue(!effectController.fps);
				lazyRenderingGui.setValue(!effectController.fps);
			}
			if (keyIsDown[KEY.T] && keyIsDown[KEY.SHIFT]) {
				effectController["ThreeInspector"]();
			}
			if (keyIsDown[KEY.R] && keyIsDown[KEY.SHIFT]) {
				effectController["threex.rendererstats"]();
			}
		}
		if (keyChar == KEY.PLUS) {
			if (effectController.enable_maps) {
				g_map.setZoom(g_map.getZoom() + 1);
			}
		}
		if (keyChar == KEY.MINUS) {
			if (effectController.enable_maps) {
				g_map.setZoom(g_map.getZoom() - 1);
			}
		}
		if (keyChar == KEY.I || keyChar == KEY.O) {
			g_angle = g_angle + (keyChar == KEY.I ? 1 : -1);
			var g_client = g_clients[0];
			updateProjection(g_client);
			updateClient(g_client);
		}
		if (keyChar == KEY.B) {
			var cam = g_cameraHistory.pop();
			if (cam != null) {
				doSetCamera(cam[0], cam[1], cam[2], cam[3], cam[4], cam[5]);
				g_cameraHistory.pop();
			}
		}
		if (keyChar == KEY.ESCAPE && g_selectedInfo.length >= 1 && (g_selectedInfo[0].originalParent || g_selectedInfo[0].parent)) {
			select([g_selectedInfo[0].originalParent! || g_selectedInfo[0].parent!], g_clients[0]);
			updateClient(g_clients[0]);
		}
	};
	document.onkeyup = function (e) {
		var keyChar = e.keyCode;
		keyIsDown[keyChar] = false;
	};

	calcPaths();

	container = document.getElementById('clients')!;

	if (!WEBGL.isWebGLAvailable()) { document.body.appendChild(WEBGL.getWebGLErrorMessage()); return; }

	window.addEventListener('resize', onWindowResize, false);
	mouse = new Vector2();
	up = new Vector3(0, 1, 0);

	var requiredThreeJS = doFBX ? [g_dir + "js/loaders/FBXLoader2.js"] : doJsonLoader ? [] : doCollada ? [] : doGLTF ? [] : [g_dir + "js/loaders/OBJLoader.js"];
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
	requirejs(requiredThreeJS, function () {
		buildTable();
		for (var ii = 0; ii < g_num_clients; ++ii) {
			load(ii);
		}
	});

}

(window as any).startModelViewer = start;

var barLog = "";
var barMilliseconds = 0;
var barMillisecondsAt0Percent = 0;

function drawBar(percent: number, message: string): void {
	document.getElementById('message')!.innerHTML = message;
	var bar = document.getElementById('bar')!;
	var x = Math.floor(250 * percent);
	bar.style.width = x + "px";
	var p = Math.floor(100 * percent);
	var s = message + " to " + p + "%";
	if (s != barLog) {
		var m = new Date().getTime();
		if (p == 0) {
			barMillisecondsAt0Percent = m;
		}
		myLog((barLog = s) + (barMilliseconds ? " " + (m - barMilliseconds) + "ms" : ""));
		barMilliseconds = m;
		if (p == 100) {
			myLog(message + " took totally " + (m - barMillisecondsAt0Percent) + "ms");
		}
	}
	//	var ctx=bar.getContext("2d");
	//	ctx.fillStyle = 'yellow';
	//	ctx.fillRect(0,0,bar.offsetWidth,50);
	//	var w = Math.floor( bar.offsetWidth * percent );
	//	ctx.fillStyle = 'red';
	//	ctx.fillRect(0,0,w,50);

}

var startTime: number;
var allGeometries = 0;
var waitForBar = 1;

function hasVertexNormals(geometry: Geometry & BufferGeometry): boolean {
	if (geometry.attributes) {

		if (!geometry.attributes.normal)
			return false;

		for (var i = 0, il = geometry.attributes["normal"].array.length; i < il; i++) {

			if (geometry.attributes["normal"].array[i] != 0) return true;

		}

		return false;
	}
	return geometry.faces && geometry.faces.length > 0 && geometry.faces[0].vertexNormals.length > 0;
}

function assureMeshWithNoBufferGeometry(mesh: Mesh<BufferGeometry>): Mesh {

	if (!mesh.geometry.isBufferGeometry) {

		return mesh;

	}

	var mesh2 = new Mesh(new Geometry().fromBufferGeometry(mesh.geometry) as unknown as BufferGeometry, mesh.material);
	mesh2.matrix.copy(mesh.matrixWorld); // has no parents
	mesh2.matrixAutoUpdate = false;
	mesh2.matrixWorldNeedsUpdate = true;
	return mesh2;
}

function addVertex(vertices: Vector3[], vertex: Vector3): number {
	for (var i = 0; i < vertices.length; i++) {
		if (vertices[i].equals(vertex))
			return i;
	}
	vertices.push(vertex);
	return vertices.length - 1;
}

function assureBufferGeometry(geometry: Geometry) : BufferGeometry {

	if (!geometry.isGeometry) {
		return geometry as unknown as BufferGeometry;

	}
	return geometry.toBufferGeometry();

}

function assureNoBufferGeometry(geometry: BufferGeometry): Geometry {
	return new Geometry().fromBufferGeometry(geometry);
}

function prepareMisc(g_client: TClient) {
	if (effectController.quickmode) melt(g_client);
	if (effectController.selection) select(getObjectsWithSplittings(effectController.selection.split(",")), g_client);
	if (effectController.locate) locate(g_selectedInfo, g_client, 1);
}


function load(ii: number): void {
	load2(ii);
}

function afterLoad(root: Object3D, g_client: TClient): void {
	drawBar(0, "Customizing Scene ...");
	setTimeout(function () {
		init(root, g_client);
		drawBar(0, "Preparing Geometry ...");
		setTimeout(function () {
			generateGui();
			prepareMisc(g_client);
			drawBar(0, "Rendering WebGL ...");
			setTimeout(function () {
				animate(g_client);
				document.getElementById('progress')!.style.display = "none";
				drawBar(0, "Finished!");
				if (g_fullyLoaded) g_fullyLoaded();
				installRendererEvents(g_client);
			}, waitForBar);
		}, waitForBar);
	}, waitForBar);
}

function load2(ii: number): void {
	g_clients[ii].invalidated = true;
	g_pickInfoElem = document.getElementById('pickInfo')!;
	console.log("Loading: " + g_paths[ii]);
	try {
		startTime = new Date().getTime();
		if (doJsonLoader) {
			document.getElementById('progress')!.style.display = "block";
			drawBar(0, "Start");
			let loader = new JSONLoader();
			//loader.addGeometryHandler( "ascii", JSONLoader2 );
			loader.load(g_paths[ii], function (result: Object3D) {
				afterLoad(result, g_clients[ii]);
			}, function (event: any) {
				drawBar(event.total ? event.loaded / event.total : 0, "Loading ...");
			}, function (event: any) {
				drawBar(0, "Error occured! " + event);
			});
		} else
			if (doCollada) {
				let loader = new ColladaLoader();
				loader.load(g_paths[ii], function (result: Collada) {
					var root = result.scene;
					if (effectController.vertexnormals)
						root.traverse(function (mesh) {
							let geometry = mesh.geometry as unknown as Geometry;
							if (geometry) {
								geometry.computeFaceNormals();
								geometry.computeVertexNormals();
							}
						});
					afterLoad(root, g_clients[ii]);
				});
			} else
				if (doFBX) {
					let loader = new FBXLoader();
					loader.load(g_paths[ii], function (root: Object3D) {
						var g_client = g_clients[ii];
						effectController.quickmode = false; // this mode not works
						afterLoad(root, g_clients[ii]);
					});
				} else
					if (doGLTF) {
						let loader = new GLTFLoader();
						var path = g_paths[ii]
						var index = path.lastIndexOf("scene.");
						if (index != -1) path = path.substring(0, index) + "/" + path.substr(index);
						loader.load(path, function (result) {
							var root = result.scene.children[result.scene.children.length - 1] as Object3D;
							effectController.quickmode = false; // this mode not works
							root.traverse(function (mesh) {
								let geometry = mesh.geometry;
								if (geometry && !hasVertexNormals(geometry as any)) {
									geometry.computeVertexNormals();
								}
							});
							afterLoad(root, g_clients[ii]);
						});
					} else {
						let loader = new OBJLoader();

						loader.load(g_paths[ii], function (object: Object3D) {
							var g_client = g_clients[ii];
							init(object, g_client);
							animate(g_client);
						});
					}
	} catch (e) {
		console.log("loading failed : " + e);
	}
}

// follow up https://github.com/ironbane/IronbaneServer/issues/123
function automaticUnwrapping(geometry: BufferGeometry, deltaX: number, deltaY: number): void {

	var uvA = new Vector2(0, 0);
	var uvB = new Vector2(0, 0);
	var uvC = new Vector2(0, 0);

	var vertices = getVerticesOfFaces(geometry as unknown as Geometry);


	var uvs = new Float32Array(vertices.length * 2);
	geometry.setAttribute('uv', new BufferAttribute(uvs, 2));

	for (var f = 0; f < vertices.length; f += 3) {

		var va = vertices[f + 0];
		var v1 = vertices[f + 1].clone().sub(va);
		var v2 = vertices[f + 2].clone().sub(va);
		var angle = v1.angleTo(v2);

		var vtx = va;
		uvA.set(vtx.x / deltaX, vtx.z / deltaY);

		vtx = vertices[f + 1];
		var distance = vtx.distanceTo(va);
		uvB.set(distance / deltaX, 0).add(uvA);

		vtx = vertices[f + 2];
		distance = vtx.distanceTo(va);
		uvC.set(distance * Math.cos(angle) / deltaX, distance * Math.sin(angle) / deltaY).add(uvA);

        uvs[f * 2 + 0] = uvA.x;
        uvs[f * 2 + 1] = uvA.y;
        uvs[f * 2 + 2] = uvB.x;
        uvs[f * 2 + 3] = uvB.y;
        uvs[f * 2 + 4] = uvC.x;
        uvs[f * 2 + 5] = uvC.y;


	}
}

function updateColors(g_client: TClient) {

	for (var key in g_visibility) {
		var material = g_client.g_colors[key];
		if (material)
			material.visible = (g_visibility[key] == true) && (!material.baseMaterialName || g_visibility[material.baseMaterialName] != false);
	}

	updateSelectableObjects(g_client);
}


function updateSelectableObjects(g_client: TClient) {
	if (effectController.quickmode && g_client.objects) return;
	g_client.objects = [];
	addSelectableObjects(g_client, g_client.root);
	for (var tt = 0; tt < g_client.additionalObjectsToSelect.length; tt++) {
		g_client.objects.push(g_client.additionalObjectsToSelect[tt]);
	}
}

function addSelectableObjects(g_client: TClient, parent: Object3D) {
	parent.traverse(function (child) {
		if (child.geometry && child.visible && !(effectController.inactive_spaces && child.material && child.material.name == "Space")) {
			g_client.objects.push(child);
		}
	});
}

function init(root: Object3D, g_client: TClient) {

	//http://www.cs.mtu.edu/~shene/COURSES/cs3621/NOTES/spline/NURBS/NURBS-knot-insert.html
	//http://www.cs.mtu.edu/~shene/COURSES/cs3621/NOTES/spline/NURBS-knot-insert.html

	if (NURBSCurve) {

		NURBSCurve.prototype.addKnot = function (t) {

			var u = this.knots[0] + t * (this.knots[this.knots.length - 1] - this.knots[0]); // linear mapping t->u
			var k = NURBSUtils.findSpan(this.degree, u, this.knots);
			var newPoints = [];

			for (var i = k - this.degree + 1; i <= k; ++i) {
				var a = (u - this.knots[i]) / (this.knots[i + this.degree] - this.knots[i]);
				var q = projectTo3D(projectTo4D(this.controlPoints[i - 1].clone()).multiplyScalar(1 - a).add(
					projectTo4D(this.controlPoints[i].clone()).multiplyScalar(a)));
				newPoints.push(q);
			}

			this.controlPoints = this.controlPoints.slice(0, k - this.degree + 1).concat(newPoints).concat(this.controlPoints.slice(k));

			this.knots.splice(k + 1, 0, u);
		};


		NURBSCurve.prototype.removeLastPoint = function () {
			this.controlPoints = this.controlPoints.slice(0, this.controlPoints.length - 1);
			this.knots = this.knots.slice(0, this.knots.length - 3);
			var last = this.knots[this.knots.length - 1];
			this.knots.push(last);
			this.knots.push(last);
		};


		NURBSCurve.prototype.getLastKnot = function () {
			return this.knots[this.knots.length - 1];
		};

		NURBSCurve.prototype.addPoint = function (point, la) {
			if (!point.w) point = new Vector4(point.x, point.y, point.z, 1);
			this.controlPoints.push(point);
			// knot vector xyyy => xyzzz
			var last = la || (this.knots[this.knots.length - 1] + 1);
			this.knots = this.knots.slice(0, this.knots.length - 2);
			this.knots.push(last);
			this.knots.push(last);
			this.knots.push(last);
		};

		NURBSCurve.prototype.addArcAndLine = function (direction: Vector3, percentageOfQuarter: number, lineLength: number, radius: number) {

			// build up quarter arc
			var point4 = this.controlPoints[this.controlPoints.length - 1];
            var point = new Vector3(point4.x, point4.y, point4.z).divideScalar(point4.w ? point4.w : 1);
			// y-z plane
			//		var vertical1 = new Vector3(direction.x,direction.z,-direction.y);
			//		var vertical2 = new Vector3(direction.x,-direction.z,direction.y);
			// x-y plane
			//		var vertical1 = new Vector3(direction.y,-direction.x,direction.z);
			//		var vertical2 = new Vector3(-direction.y,direction.x,direction.z);
			// x-z plane
			var vertical1 = new Vector3(direction.z, direction.y, -direction.x);
			var vertical2 = new Vector3(-direction.z, direction.y, direction.x);
			var p1 = point.clone().add(direction.clone().multiplyScalar(radius));
			var p2 = point.clone().add(direction.clone().multiplyScalar(radius).add((percentageOfQuarter > 0 ? vertical2 : vertical1).clone().multiplyScalar(radius)));
			var lastKnot = this.getLastKnot();
			this.addPoint(new Vector4(p1.x, p1.y, p1.z, Math.sqrt(2) / 2), lastKnot);
			this.addPoint(p2, lastKnot + 1);

			// split quarter arc at percentageOfQuarter and draw a straight line from that point
			percentageOfQuarter = Math.max(percentageOfQuarter, -percentageOfQuarter);
			var quarterCurve: NURBSCurve;
			var t;
			var pc;
			var useExactParametrization = true;
			if (useExactParametrization) {
				quarterCurve = new NURBSCurve(2, [0, 0, 0, 1, 1, 1], this.controlPoints.slice(this.controlPoints.length - 3, this.controlPoints.length), null!, null!);
				t = quarterCurve.getUtoTmapping(percentageOfQuarter, null!);
				pc = ((lastKnot + t) - this.knots[0]) / (this.knots[this.knots.length - 1] - this.knots[0]);
			} else {
				quarterCurve = this;
				t = ((lastKnot + percentageOfQuarter) - this.knots[0]) / (this.knots[this.knots.length - 1] - this.knots[0]);
				pc = t;
			}
			var tangent = quarterCurve.getTangent(t);
			var x = quarterCurve.getPoint(t);
			point = x.clone().add(tangent.clone().multiplyScalar(lineLength));
			if (percentageOfQuarter == 1) {
				lastKnot = this.getLastKnot();
				this.addPoint(x, lastKnot);
				lastKnot += 1;
			} else {
				this.addKnot(pc);
				lastKnot = this.getLastKnot();
				this.removeLastPoint();
			}
			this.addPoint(point, lastKnot);

			return tangent;
		};

		function projectTo4D(v: Vector4): Vector4 {
			var scalar = v.w;
			v.x *= scalar;
			v.y *= scalar;
			v.z *= scalar;
			return v;
		};

		function projectTo3D(v: Vector4): Vector4 {
			var invScalar = 1 / v.w;
			v.x *= invScalar;
			v.y *= invScalar;
			v.z *= invScalar;
			return v;
		};

	}

	var loadingComplete = false;
	myLog("Model load time=" + (new Date().getTime() - startTime));
	startTime = new Date().getTime();
	try {

		if (!g_client.controls) {
			g_client.controls = new MyOrbitControls(new PerspectiveCamera(90, 1, 0.01, 2000000), g_client);
			g_client.controls.oriUpdate = g_client.controls.update;
			g_client.controls.update = function () { if (this.active) this.oriUpdate(); };
			g_client.controls.enablePan = false;
			g_client.controls.enableZoom = false;
			g_client.controls.active = true;
			g_client.additionalObjectsToSelect = [];
		}

		var scene;
		if (root.isScene) {
			if (g_client.scene) {
				while (g_client.scene.children.length > 0) {
					g_client.scene.remove(g_client.scene.children[0]);
				}
				g_client.scene.add(root = root.children[0] as Object3D);
				scene = g_client.scene;
			} else {
				scene = g_client.scene = root as Scene;
				root = root.children[0] as Object3D;
			}
			//	    scene = g_client.scene = new Scene();
			//	    scene.add( root );	
			//	    root.rotation.x += -Math.PI / 2;
			//	    root.quaternion.setFromEuler(root.rotation);
		} else {
			scene = g_client.scene = new Scene();
			scene.add(root);
		}

		g_client.root = root;
		window["scene"] = scene;
		//scene.fog = new Fog( 0x000000, 1500, 2100 );


		if (getParameterByName(document.URL, "rotation")) g_client.root.rotation.y = MathUtils.degToRad(Number(getParameterByName(document.URL, "rotation")));
		if (getParameterByName(document.URL, "angle")) g_angle = Number(getParameterByName(document.URL, "angle"));


		//	root.scale.x = root.scale.y = root.scale.z = 1/effectController.colladaUnit;
		scene.updateMatrixWorld();
		for (var tt = 0; tt < g_client.scene.children.length; tt++) {
			var child = g_client.scene.children[tt];
			if (child.matrix) {
				child.matrixWorld.decompose(child.position, child.quaternion, child.scale);
				if (g_client.scene.children.length == 1)
					child.position.set(0, 0, 0); // fix for buildings who are 30km away from point zero!
			}
		}
		g_client.scene.position.set(0, 0, 0);
		g_client.scene.rotation.set(0, 0, 0);
		g_client.scene.scale.set(1, 1, 1);
		g_client.scene.updateMatrix();
		g_client.scene.updateMatrixWorld();
		g_client.scene.traverse(function (child) {
			if (child.matrixAutoUpdate === true)
				child.matrixAutoUpdate = false;
		});
		g_client.scene.autoUpdate = false;

		var hasSomething = locate([g_client.root], g_client, 1);
		if (effectController.eye && effectController.target)
			doSetCamera(asVector3M(StrToIntArray(effectController.eye.split(","))), asVector3M(StrToIntArray(effectController.target.split(","))), g_angle, null, 1, g_client);

		var toDelete: Object3D[] = [];
		scene.traverse(function (child) {
			if (child.isCamera || child.isLight)
				toDelete.push(child);
		});
		for (var tt = 0; tt < toDelete.length; tt++) {
			toDelete[tt].parent!.remove(toDelete[tt]);
		}

		// Lights

		light = new DirectionalLight(0xffffff);
		light.position.set(0.5, 0.5, 1);
		g_client.directionalLight = light;
		scene.add(light);
		light.updateMatrixWorld();

		ambientLight = new AmbientLight(0x080808);
		scene.add(ambientLight);

		setClientSize(g_client);

		g_finished = true;  // for selenium
		g_client.root.traverse(function (child) {
			if (!child.name) return;
			var comps = child.name.split(",");
			var hasMaximumNameLength = child.name.length == 63;
			if (comps.length == 3) {
				child.uuid = comps[0];
				if (comps[2].indexOf("Ifc") == 0) {
					// deprecated geometry file
					(child as any).storedMaterialName = truncatedMaterialName(comps[2]);
					child.name = comps[1];
				} else {
					(child as any).storedMaterialName = truncatedMaterialName(comps[1]);
					child.name = comps[2];
				}
			} else
				if (comps.length == 2) {
					child.uuid = comps[0];
					child.name = comps[1];
				}
			if (hasMaximumNameLength)
				child.name += "..";
		});
		defaultScheme = null!;
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
			g_colorSchemes = {};
			g_colorSchemes[defaultScheme] = g_colors;
		}
		if ((window as any).g_customInit) (window as any).g_customInit();
		setupColors(g_client, true);
		g_client.root.traverse(function (child) {
			child.visible = true; //non-meshes are not visible by default, but required to be visible for canvas renderer
		});
		updateColors(g_client);

		var plane = g_client.plane = new Mesh(new PlaneGeometry(1000000, 1000000, 1, 1), new MeshBasicMaterial({ color: 0x000000, opacity: 0.25, transparent: true, side: DoubleSide }));
		plane.name = "intersection plane";
		plane.lookAt(up);

		if (!hasSomething)
			console.log("Found no solid geometry");

		initializeMap();

		loadingComplete = true;
		//} catch (e) {
	} finally {
		if (!loadingComplete) myLog("loading failed after retrieving model successful");
		myLog("Model setup time=" + (new Date().getTime() - startTime));
		//    throw e;
	}
}

function setupUVs(mesh: Mesh<BufferGeometry, Material>): void {
	let geometry = mesh.geometry;
	var material = mesh.material as MeshPhongMaterial;
	if (material && geometry) {
		var hasTexture = (material.map != null);
		if (Array.isArray(material)) {
			const materials = material as MeshPhongMaterial[];
			for (var i = 0; i < materials.length; i++) {
				if (materials[i].map) {
					hasTexture = true;
				}
			}
		}
		if (!hasTexture) return;
		if (!(geometry.attributes && geometry.attributes.uv))
			automaticUnwrapping(geometry, 0.1 * 1, 0.1 * 1);
		//							if (geometry.faceVertexUvs[0].length==0 && geometry.boundingBox && !geometry.boundingBox.isEmpty() && materialColor.map.image.width!=null &&  materialColor.map.image.width>0 )
		//								automaticUnwrapping(geometry,0.1*1,0.1*materialColor.map.image.height/materialColor.map.image.width);
		geometry.attributes.uv.needsUpdate = true;
	}
}

function setupColors(g_client: TClient, updateVisibilityArray?: boolean): void {

	for (var m in g_colors) {
		//			var color = g_colors[m];
		//			if (color.length == 4) {
		//			color[0] = color[0]*255;
		//			color[1] = color[1]*255;
		//			color[2] = color[2]*255;
		//			}

		var materialColor = g_colors[m] as MeshPhongMaterial;
		if (!materialColor.uuid)
			if (Array.isArray(materialColor)) {
				materialColor = g_colors[m] = new MeshPhongMaterial({
					color: new Color().setRGB(materialColor[0], materialColor[1], materialColor[2]),
					opacity: materialColor[3],
					transparent: materialColor[3] != 1
				});
			} else if (!materialColor.map) {
				materialColor = g_colors[m] = new MeshPhongMaterial(materialColor as unknown as MeshPhongMaterialParameters);
			} else {
                let url = materialColor.map as unknown as string;
				if (url.indexOf("http:") == -1)
                    url = g_path.substring(0, g_path.indexOf("&filename=")) + "&filename=" + url;
				var texture = ImageUtils.loadTexture(url, undefined, updateClients, function () { alert("Could not load texture of material!"); });
				texture.wrapS = texture.wrapT = RepeatWrapping;
				materialColor = g_colors[m] = new MeshPhongMaterial({ map: texture });
			}
		if (materialColor.side == DoubleSide && isIE11)
			materialColor.side = FrontSide;

		var opacity = effectController.opacity;
		if (materialColor.opacity != 0 && opacity) {
			materialColor.opacity = Number.parseFloat(opacity);
		}
		opacity = effectController["opacity." + m];
		if (opacity) {
			materialColor.opacity = Number.parseFloat(opacity);
		}
		materialColor.transparent = materialColor.opacity < 1;

		if (materialColor.transparent) {
			materialColor.depthWrite = false;

			//http://www.openglsuperbible.com/2013/08/20/is-order-independent-transparency-really-necessary	

			//			/* multiplicative blending */
			//			materialColor.blending = CustomBlending;
			//			materialColor.blendSrc = ZeroFactor;
			//			materialColor.blendDst = SrcColorFactor;
			//			materialColor.color.lerp(new Color().setRGB(1, 1, 1),1-materialColor.opacity);
			//			materialColor.opacity = 1;
			//			
			//
			//			/* additive blending */
			//			materialColor.blending = CustomBlending;
			//			materialColor.blendSrc = SrcAlphaFactor;
			//			materialColor.blendDst = OneFactor;
			//			materialColor.color.lerp(new Color().setRGB(0, 0, 0),1-materialColor.opacity);
			//			materialColor.opacity = 1;

		}
		materialColor.shininess = 0;
		materialColor.name = m;
	}
	if (g_clients.length >= 2) {
		g_client.g_colors = {};
		for (m in g_colors) {
			g_client.g_colors[m] = g_colors[m].clone();
		}
	} else {
		g_client.g_colors = g_colors;
	}
	g_client.root.traverse(function (child) {
		if (child.name && child.name.indexOf("__") != -1)
			child.name = child.name.substring(0, child.name.indexOf("__")); // OBJLoader		
		var material = child.material as Material;
		if (material) {
			if (material.name) {
				var materialName = /*child.customMaterialName || */material.name;
				if (materialName && materialName.lastIndexOf("-material") != -1)
					materialName = materialName.substring(0, materialName.lastIndexOf("-material"));
				material = g_client.g_colors[materialName];
				if (!material && materialName.length > 3) {
					var materialNameShortened = materialName.substring(3);
					if (material = g_client.g_colors[materialNameShortened])
						materialName = materialNameShortened;
				}
				if (!material) {
					child.material.name = materialName;
					g_client.g_colors[materialName] = material = child.material as Material;
				}
				if (material) {
					child.material = material;
					if (child.uuid && child.uuid.indexOf("_", 22) != -1) {
						var materialName2 = child.uuid.substring(child.uuid.indexOf("_", 22));
						var material2 = g_client.g_colors[materialName2];
						if (material2 && material2 != material) {
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

function updateClients(): void {
	g_clients.forEach(function (g_client: TClient) {
		updateClient(g_client);
	});
}

function updateClient(g_client: TClient, lazy?: boolean): void {
	if (!lazy) {
		g_client.renderer.sortObjects = true;
	}
	if (g_client.invalidated) return;
	g_client.invalidated = true;
	if (disableRendering) return;
	requestAnimationFrame(function () { animate(g_client); });
}

function animate(g_client: TClient): void {
	render(g_client);
	if (stats) stats.update();
	if (rendererStats) rendererStats.update(g_client.renderer);
}

function render(g_client: TClient): void {
	var updateClientStart = new Date().getTime();
	if (g_client.controls.active) g_client.controls.update();
	else {
		enableOrbit(true, g_client);
		enableOrbit(false, g_client);
	}
	updateProjection(g_client);
	if (g_client.scene2 || sceneCube) {
		g_client.renderer.autoClear = false;
		g_client.renderer.clear();
	}
	if (sceneCube) {
		var aspect = g_client.parentNode.offsetWidth / g_client.parentNode.offsetHeight;
		var cameraCube = new PerspectiveCamera(g_angle, aspect, 1, 100000);
		cameraCube.rotation.copy(g_client.g_camera.rotation);
		g_client.renderer.render(sceneCube, cameraCube);
	}

	var lavaMaterial = incidentMaterials["fire"] as ShaderMaterial;
	if (lavaMaterial) {

		lavaMaterial.clock = lavaMaterial.clock || new Clock();

		var delta = 4 * 5 * lavaMaterial.clock.getDelta();

		lavaMaterial.uniforms.time.value += 0.2 * delta;


	}

	var camera = g_client.g_camera;
	if (g_client.directionalLight) {
		g_client.directionalLight.position.copy(camera.eye.clone().sub(camera.target).normalize());
		g_client.directionalLight.updateMatrixWorld();
	}
	g_client.renderer.render(g_client.scene, camera);

	if (g_client.scene2 != null) {
		g_client.renderer.clearDepth();
		g_client.renderer.render(g_client.scene2, camera);
	}

	if (g_client.additionalCamera) {
		//		g_client.renderer.autoClear = false;
		camera = g_client.additionalCamera;
		if (g_client.directionalLight) {
			g_client.directionalLight.position.copy(camera.eye.clone().sub(camera.target).normalize());
			g_client.directionalLight.updateMatrixWorld();
		}
		var w = Math.min(g_client.parentNode.offsetWidth / 4, g_client.parentNode.offsetHeight / 4);
		camLeft = Math.round(w / 2);
		camBottom = Math.round(w / 2);
		if (camera.aspect <= 1) {
			camWidth = Math.round(w * 2 * camera.aspect);
			camHeight = Math.round(w * 2);
		} else {
			camWidth = Math.round(w * 2);
			camHeight = Math.round(w * 2 / camera.aspect);
		}
		g_client.renderer.setViewport(camLeft, camBottom, camWidth, camHeight);
		g_client.renderer.setScissor(camLeft, camBottom, camWidth, camHeight);
		g_client.renderer.enableScissorTest(true);
		g_client.renderer.render(g_client.scene, camera);
		g_client.renderer.setViewport(undefined!, undefined, undefined, undefined);
		g_client.renderer.enableScissorTest(false);
	}

	g_client.invalidated = false;
	g_client.renderer.sortObjects = true;

	motionByKeys(g_client);
	g_updateClientTime = new Date().getTime() - updateClientStart;

	framesCount += 1;
	var testFpsAt = 2;
	if (framesCount == testFpsAt) {
		startedTestFps = new Date().getTime();
	}
	var stoppedTestFps = new Date().getTime();

	if (startedTestFps != null && (stoppedTestFps - startedTestFps) >= 1000) {
		testFps = (framesCount - testFpsAt) * 1000 / (stoppedTestFps - startedTestFps);
		console.log("testFps=" + testFps);
		startedTestFps = null;
		if (testFps < effectController.acceptablefps) {
			if (confirm("It seems you have a slow graphics card. Do you want to disable the graphical display of the model?")) {
				disableRendering = true;
				$(g_client).fadeOut(2500);
			}
		}
	}

	if (!effectController.lazy_rendering || testFps == null) {
		updateClient(g_client, true);
	}
}

function removeFromArray(array: any[], object: any): void {
	var i = array.indexOf(object);
	if (i >= 0) {
		array.splice(i, 1);
	}
}

function unSelectAll(g_client: TClient): void {
	for (var tt = 0; tt < g_selectedInfo.length; tt++) {
		unSelectRecursive(g_selectedInfo[tt]);
		removeFromScene(g_selectedInfo[tt], g_client);
	}
	g_selectedInfo = [];
}

function unSelectRecursive(transform: Object3D): void {
	for (var tt = 0; tt < transform.children.length; tt++) {
		unSelectRecursive(transform.children[tt] as Object3D);
	}
	if (transform.originalMaterial)
		transform.material = transform.originalMaterial;
	if (transform.pred != null) {
		unSelectRecursive(transform.pred);
	}
}

function getScene(scene: Object3D): Scene | null {

	while (scene.parent) {

		scene = scene.parent;

	}

	if (scene.isScene) {

		return scene as Scene;

	}

	return null;

}

function switchCustomMaterialForObject(enableCustomMaterial: boolean, object: Object3D, g_client: TClient): void {
	object.importedMaterial = object.importedMaterial || object.originalMaterial || object.material;
	var material = enableCustomMaterial ? g_client.g_colors[object.customMaterialName] : object.importedMaterial;
	if (object.material == g_client.g_colors["Selection"]) {
		object.originalMaterial = material;
	} else {
		object.material = material;
	}
	if (enableCustomMaterial) {
		bringIntoScene(object, g_client);
	} else {
		removeFromScene(object, g_client);
	}
	updateClient(g_client, false);
}

function switchCustomMaterial(enableCustomMaterial: boolean, g_client: TClient): void {
	var objects: Object3D[] = [];
	traverseAllObjects(function (object) {
		if (object.customMaterialName) {
			objects.push(object);
		}
	}, g_client);
	objects.forEach(function (object) {
		switchCustomMaterialForObject(enableCustomMaterial, object as Object3D, g_client);
	});
	if (!enableCustomMaterial)
		for (var tt = 0; tt < g_selectedInfo.length; tt++) {
			// if object.parent was removed from scene, bring object again into scene
			bringIntoScene(g_selectedInfo[tt], g_client);
		}
	updateClient(g_client, false);
}

function bringIntoScene(object: Object3D, g_client: TClient): void {
	if (!getScene(object)) {
		object.renderOrder = 2; // fix for IE11
		object.originalParent = object.parent;
		g_client.scene.add(object);
	}
}

function removeFromScene(object: Object3D, g_client: TClient): void {
	if (object.originalParent) {
		if (!(object.importedMaterial && object.material != object.importedMaterial)) {
			object.originalParent.add(object);
			object.originalParent = null;
		}
	} else
		if (!(object.isSprite)) {
			g_client.scene.remove(object);
		}
}

function select(newSelection: Mesh<BufferGeometry, Material>[], g_client?: TClient): void {
	g_client = g_client || g_clients[0];
	newSelection = reviseSelection(newSelection);
	g_clients.forEach(unSelectAll);
	g_selectedInfo = newSelection;
	if (jstree) {
		jstree.jstree("deselect_all", true);
		g_selectedInfo.forEach(function (object) {
			openParentNodes(object);
			jstree.jstree("select_node", '#' + getTreeID(object), true, false);
			$('#' + getTreeID(object))[0].scrollIntoView();
		});
	}
	for (var tt = 0; tt < g_selectedInfo.length; tt++) {
		bringIntoScene(g_selectedInfo[tt], g_client);
		selectRecursive(g_selectedInfo[tt], g_client);
	}
	if (g_selectedInfo.length > 0) {
		myLog("Selected " + g_selectedInfo[0].uuid);
		effectController.id = g_selectedInfo[0].uuid;
		var material = g_selectedInfo[0].originalMaterial || g_selectedInfo[0].material;
		effectController.material = material ? material.name : "none";
		effectController.geometry = g_selectedInfo[0].geometry ? g_selectedInfo[0].geometry.id : "none";
		if (g_oldWorldPosition != null && g_worldPosition) {
			effectController.distance = g_oldWorldPosition.distanceTo(g_worldPosition);
		}
		updateGui(selectionInfoGui);
		if (g_selectedInfo[0].costInfo != null)
			g_pickInfoElem.innerHTML = g_selectedInfo[0].costInfo;
	} else {
		if (g_pickInfoElem) g_pickInfoElem.innerHTML = '';
	}
	if (window.parent != window)
		window.parent.postMessage({ 'selectionChanged': { "guids": getSelectedObjectIDs(g_selectedInfo) } }, '*');
}

function applyOnMaterials(material: Material, func: (mat: Material) => void): void {
	if (material) func(material);
	if (Array.isArray(material)) {
		const materials = material as Material[];
		for (var tt = 0; tt < materials.length; tt++) {
			func(materials[tt]);
		}
	}
}

function selectRecursive(transform: Mesh<BufferGeometry, Material>, g_client: TClient): void {
	for (var tt = 0; tt < transform.children.length; tt++) {
		selectRecursive(transform.children[tt] as Mesh<BufferGeometry, Material>, g_client);
	}
	if (transform.material && !(transform.isSprite)) {
		transform.originalMaterial = transform.material as Material;
		var g_selectionMaterial = g_client.g_colors["Selection"];
		g_selectionMaterial.side = transform.material.side;
		transform.material = g_selectionMaterial;
	}
	let geometry = transform.geometry;
	if (geometry) {
		// required if original material has a texture
        for (let attribute in geometry.attributes)
            geometry.attributes[attribute].needsUpdate = true;
	}
	if (transform.pred != null) {
		selectRecursive(transform.pred, g_client); 
	}
}

function enableOrbit(enable: boolean, g_client: TClient): void {
	if (!enable || effectController.enable_maps) {
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

function isShift(shiftFlag: boolean): boolean {
	return !shiftFlag != !effectController.panning_mode;
}

function onDocumentMouseMove(e: PointerEvent): void {

	e.preventDefault();

	var lazy = true;

	var g_client = e.target as TClient;
	mouse.x = ((e.clientX - g_client.getBoundingClientRect().left) / g_client.parentElement!.offsetWidth) * 2 - 1;
	mouse.y = - ((e.clientY - g_client.getBoundingClientRect().top) / g_client.parentElement!.offsetHeight) * 2 + 1;

	if (e.buttons != 1) g_dragging = false;

	if (!g_dragging) return;

	enableOrbit(!isShift(e.shiftKey), g_client);

	if (effectController.enable_maps) {
		if (g_lastPos == null) {
			g_lastPos = [e.x, e.y];
			return;
		}
		var deltaX = -(e.x - g_lastPos[0]);
		var deltaY = -(e.y - g_lastPos[1]);
		g_map.panBy(deltaX, deltaY);
		g_lastPos = [e.x, e.y];
		return;
	} else {

		var raycaster = getRaycaster(mouse, g_client);

		var plane = g_client.plane;
		plane.position.copy(g_worldPosition || g_client.g_camera.target);
		plane.lookAt(plane.position.clone().add(up));
		plane.updateMatrixWorld();

		var intersects = raycaster.intersectObject(plane);
		if (intersects.length > 0) {
			var intersectPoint = intersects[0].point;
			g_worldPosition = g_worldPosition || intersectPoint;
			if (isShift(e.shiftKey)) {
				var offs = intersectPoint.clone().sub(g_worldPosition);
				if (e.altKey) {
					g_offs = (g_offs || new Vector3()).add(offs);
					for (var tt = 0; tt < g_selectedInfo.length; tt++) {
						var object = g_selectedInfo[tt];
						var localOffs = object.parent!.worldToLocal(intersectPoint.clone()).sub(object.parent!.worldToLocal(g_worldPosition.clone()));
						var meltedGeometry = (object.originalMaterial || object.material).meltedGeometry;
						if (object.geometry.isBufferGeometry && meltedGeometry) {
							var array = object.geometry.attributes.position.array;
                            var _array = new Float32Array(array);
							for (var i = 0; i < array.length; i += 3) {
								_array[i + 0] += localOffs.x;
								_array[i + 1] += localOffs.y;
								_array[i + 2] += localOffs.z;
							}
                            object.geometry.setAttribute('position', new BufferAttribute(_array, 3));
							object.geometry.boundingSphere!.center.add(localOffs);
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
							camera.position.copy(camera.eye.add(localOffs));
							camera.lookAt(camera.target);
							camera.updateProjectionMatrix();
							camera.updateMatrixWorld();
						}
					}
					offs = new Vector3();
					if (g_offs) g_worldPosition = intersectPoint;
				}
				setEyeAndTarget(g_client.g_camera.eye.sub(offs), g_client.g_camera.target.sub(offs), g_client);
			}
			//g_worldPosition = intersectPoint;
			//		    myLog("c="+g_client.controls.center.x+" "+g_client.controls.center.y+" "+g_client.controls.center.z+" o="+offs.x+" "+offs.y+" "+offs.z+" i="+intersectPoint.x+" "+intersectPoint.y+" "+intersectPoint.z+" "+" w="+g_worldPosition.x+" "+g_worldPosition.y+" "+g_worldPosition.z+" ");
			//myLog("d="+dir.x+" "+dir.y+" "+dir.z);
		} else myLog("no plane intersection!");

	}
	g_lastPos = [e.x, e.y];

	updateClient(g_client, lazy);
}

function pickingRay(vector: Vector3, camera: Camera) {

	// set two vectors with opposing z values
	vector.z = -1.0;
	var end = new Vector3(vector.x, vector.y, 1.0);

	vector.unproject(camera);
	end.unproject(camera);

	// find direction from vector to end
	end.sub(vector).normalize();

	return new Raycaster(vector, end);

};

function getRaycaster(mouse: Vector2, g_client: TClient): Raycaster {
	var camera = g_client.g_camera;
	var vector = new Vector3(mouse.x, mouse.y, 0.5);
	var raycaster = pickingRay(vector.clone(), camera);
	if (!effectController.orthographic) {
		// TODO these two lines should not be necessary! threejs bug?
		vector.unproject(camera);
		raycaster = new Raycaster(camera.position, vector.sub(camera.position).normalize());
	}
	return raycaster;
}
var g_line;


var mousedownClientX = 0;
var mousedownClientY = 0;

function intersectParticleSystems(raycaster: Raycaster, g_client: TClient): Intersection[] | null {
	var intersects: Intersection[] | null = null;
	var aspect = g_client.parentNode.offsetWidth / g_client.parentNode.offsetHeight;
	if (g_client.scene2) {
		var minDistance = 99999999;
		g_client.scene2.children.forEach(function (object) {
			//see https://github.com/mrdoob/three.js/issues/3492

			var vertices = getOnlyUsedVertices(object.geometry);
			var point, distance, intersect, threshold = 1;
			var localtempRay = raycaster.ray.clone();
			var localOrigin = localtempRay.origin;
			var localDirection = localtempRay.direction;

			var localMatrix = object.matrixWorld.clone().invert();
			//localMatrix.multiplyVector3(localOrigin);
			localOrigin.applyMatrix4(localMatrix);
			//localMatrix.rotateAxis(localDirection).normalize();
			localDirection.transformDirection(localMatrix);

			for (var i = 0; i < vertices.length; i++) {
				point = vertices[i];
				//distance = this.distanceFromIntersection( localOrigin, localDirection, point );
				distance = localtempRay.distanceToPoint(point);
				if (!object.sizeAttenuation) threshold = localtempRay.origin.distanceTo(point) * 2 / 5 * aspect * object.material.size / g_client.parentNode.offsetWidth;
				//		                console.log("distance="+distance+" threshold="+threshold+" aspect="+aspect+" screenx="+g_client.parentNode.offsetWidth+" screeny="+g_client.parentNode.offsetHeight);
				if (distance > threshold) {
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

				if (distance < minDistance) {
					minDistance = distance;
					intersects = [intersect];
					object.hitVertexIndex = i;
				}
			}

		});
	}
	return intersects;
}

function onDocumentMouseDown(e: PointerEvent): void {

	var start = new Date().getTime();

	var calledFromOtherMouseEvent = (e.type == "dblclick") || (e.type == "pointerup");

	if (!calledFromOtherMouseEvent) {
		myLog("onDocumentMouseDown #selection=" + g_selectedInfo.length + " buttons=" + e.buttons);
		(e.target as HTMLElement).focus();
	}

	e.preventDefault();

	mousedownClientX = e.clientX;
	mousedownClientY = e.clientY;

	var g_client = e.target as TClient;
	mouse.x = ((e.clientX - g_client.getBoundingClientRect().left) / g_client.parentNode.offsetWidth) * 2 - 1;
	mouse.y = - ((e.clientY - g_client.getBoundingClientRect().top) / g_client.parentNode.offsetHeight) * 2 + 1;

	enableOrbit(e.buttons != 2 && !isShift(e.shiftKey), g_client);

	var camX = e.clientX;
	var camY = g_client.parentNode.offsetHeight - e.clientY;
	if (g_client.additionalCamera && camX > camLeft && camX < camLeft + camWidth && camY > camBottom && camY < camBottom + camHeight) {
		g_client.additionalCamera = null!;
		updateClient(g_client);
		return;
	}

	var canChangeSelection = !effectController.select_by_dblclick && !effectController.select_by_mouseup || calledFromOtherMouseEvent;

	let intersects: Intersection[] | null = null;

	if (canChangeSelection || isShift(e.shiftKey)) {
		g_oldWorldPosition = g_worldPosition;
		g_worldPosition = null;

		let raycaster = getRaycaster(mouse, g_client);

		intersects = raycaster.intersectObjects(g_client.objects);

		intersects = intersectParticleSystems(raycaster, g_client) || intersects;
	}


	var oldSelection = g_selectedInfo;
	if (canChangeSelection) unSelectAll(g_client);
	if (intersects) myLog("intersects.length = " + intersects.length);


	var SELECTED: Mesh<BufferGeometry, Material> | null = null;

	if (intersects)
		for (var tt = 0; tt < intersects.length; tt++) {
			let object = intersects[tt].object as Mesh<BufferGeometry, Material>;
			if (isIntersectedObjectVisible(object, g_client)) {
				SELECTED = object;
				if (effectController.select_face && intersects[tt].face) {
                    var face = intersects[tt].face!;
                    let vA=new Vector3().fromBufferAttribute(object.geometry.attributes.position, face.a);
                    let vB=new Vector3().fromBufferAttribute(object.geometry.attributes.position, face.b);
                    let vC=new Vector3().fromBufferAttribute(object.geometry.attributes.position, face.c);
					var faceSingleton = object.clone();
                    faceSingleton.geometry = new BufferGeometry().setFromPoints([vA,vB,vC]);
                    faceSingleton.geometry.computeVertexNormals();
					SELECTED = faceSingleton;
				}
				break;
			}
		}

	if (SELECTED) {

		if (SELECTED.cam) {
			g_client.additionalCamera = SELECTED.cam;
		}

		if (canChangeSelection)
			if (e.ctrlKey || (e.buttons == 2 || effectController.invert_selection) && oldSelection.indexOf(SELECTED) != -1) {
				if (e.ctrlKey || effectController.invert_selection)
					if (oldSelection.indexOf(SELECTED) == -1)
						oldSelection.push(SELECTED); else
						removeFromArray(oldSelection, SELECTED);
			} else {
				oldSelection = [SELECTED];
			}

		g_worldPosition = intersects![0].point.clone();
		myLog('worldIntersectionPosition = ' + vector3ToArray(g_worldPosition!));

	} else {
		oldSelection = [];
		if (intersects) myLog("selected no elements");
	}

	enableOrbit(e.buttons != 2 && !isShift(e.shiftKey), g_client);

	if (canChangeSelection) select(oldSelection, g_client);

	if (canChangeSelection) generateEvent(e.type, e, g_client);


	if (canChangeSelection) g_clients.forEach(updateClient);

	if (e.buttons != 2 && !calledFromOtherMouseEvent) {
		g_lastPos = [e.x, e.y];
		g_offs = null;
		g_dragging = true;
	}

	if (!calledFromOtherMouseEvent) {
		var end = new Date().getTime();
		myLog("onDocumentMouseDown #selection=" + g_selectedInfo.length + " buttons=" + e.buttons + " finished in " + (end - start) + "ms");
	}

}

var waitingCount = 0;

function getSelectedObjectIDs(objects: Object3D[]): string[] {
	return objects.map(function (object) {
		return object.uuid;
	});
}

function selectionAsString(delimiter?: string): string {
	return g_selectedInfo.map(function (object) {
		return object.uuid;
	}).join(delimiter || " ");
}

function generateEvent(eventType: string, e: MouseEvent, g_client: TClient): void {
	if (typeof (theJavaFunction) != "function") return;

	if (eventType == "pointerup") eventType = "click";

	var type = "";
	if (effectController.treeview == false && effectController.properties == false && e.buttons != 2) return;
	var mainParams = [selectionAsString(), type, g_client.id, e.clientX, e.clientY, e.buttons, eventType];
	if (g_selectedInfo.length != 0) {
		if (g_worldPosition) {
			mainParams = mainParams.concat(vector3ToArray(g_worldPosition));
			if (animateTube)
				mainParams = mainParams.concat([g_client.me.position.x, -g_client.me.position.z, g_client.me.position.y - g_client.me_shiftUp]);
		}
		myLog("Processing " + eventType + "...");
		var milli = new Date().getMilliseconds();
		var ellipsis = document.getElementById('ellipsis_menu')!;
		if (e.buttons == 2 && eventType == "click") {
			if (effectController.nocontextmenu) return;
			ellipsis.style.left = mousedownClientX + "px";
			ellipsis.style.top = mousedownClientY + "px";
			ellipsis.style.display = "block";
		} else {
			document.body.style.cursor = "progress";
			waitingCount++;
		}
		setTimeout(function () {
			try {
				theJavaFunction.apply(undefined, mainParams);
			} catch (e2) {
				myLog("Exception in generateEvent: " + e2.message);
			}
			if (e.buttons == 2 && eventType == "click") {
				ellipsis.style.display = "none";
			} else {
				waitingCount--;
				if (waitingCount == 0)
					document.body.style.cursor = "";
			}
			var milli2 = new Date().getMilliseconds();
			myLog("Processed " + eventType + " in " + (milli2 - milli) + "ms");
		}, 100);
	}
}

function onDocumentDblClick(e: MouseEvent): void {
	myLog("onDocumentDblClick #selection=" + g_selectedInfo.length + " buttons=" + e.buttons);
	var g_client = e.target as TClient;
	e.preventDefault();
	if (effectController.select_by_dblclick) {
		onDocumentMouseDown(e as PointerEvent);
	} else
		if (g_selectedInfo.length > 0) {
			locate(g_selectedInfo, g_client, 10);
		}
	myLog("onDocumentDblClick finished");
}

function onDocumentMouseUp(e: PointerEvent): void {
	var start = new Date().getTime();
	myLog("onDocumentMouseUp #selection=" + g_selectedInfo.length + " button=" + e.buttons);
	var g_client = e.target as TClient;
	g_dragging = false;
	e.preventDefault();
	enableOrbit(true, g_client);
	g_client.plane.position.set(0, 0, 0);
	g_client.plane.updateMatrixWorld();
	if (g_selectedInfo.length > 0 && g_offs) {
		myLog("drop");
		var x = vector3ToArray(g_offs)[0];
		var y = vector3ToArray(g_offs)[1];
		setTimeout(function () { try { theJavaFunction(selectionAsString(), "", g_client.id, x, y, e.buttons, "drop"); } catch (e2) { } }, 100);
		myLog("dropped");
	} else {
		var dist = 5;
		if (e.clientX >= mousedownClientX - dist && e.clientX <= mousedownClientX + dist &&
			e.clientY >= mousedownClientY - dist && e.clientY <= mousedownClientY + dist) {
			if (!effectController.select_by_dblclick || e.buttons == 2)
				if (effectController.select_by_mouseup) {
					onDocumentMouseDown(e);
				} else if (g_selectedInfo.length > 0) {
					generateEvent("click", e, g_client);
				}
		}
	}
	updateClient(g_client);
	var end = new Date().getTime();
	myLog("onDocumentMouseUp #selection=" + g_selectedInfo.length + " which=" + e.buttons + " finished in " + (end - start) + "ms");

}

function onDocumentMouseWheel(e: WheelEvent): void {
	var delta = e.wheelDelta || - e.detail || -e.deltaY;
	if (delta) {
		if (effectController.enable_maps) {
			g_mapsteps = 3;
			g_map.setZoom(g_map.getZoom() + (delta > 0 ? 1 : -1));
			return;
		}
		var g_client = e.target as TClient;
		var raycaster = getRaycaster(mouse, g_client);
		var vector = raycaster.ray.direction.normalize();
		var oldLength = g_client.g_camera.position.distanceTo(g_client.g_camera.target);
		var factor = oldLength / 20 * (delta > 0 ? 1 : -1);
		var newPosition = g_client.g_camera.position.clone().add(vector.setLength(factor));
		var positionOffset = newPosition.clone().sub(g_client.g_camera.position);
		var oldDirection = g_client.g_camera.target.clone().sub(g_client.g_camera.position).normalize();
		var proj = positionOffset.dot(oldDirection);
		setEyeAndTarget(newPosition, newPosition.clone().add(oldDirection.setLength(oldLength - proj)), g_client);

		updateClient(g_client);
		e.preventDefault();
	}
}

function isBufferGeometry(geometry: Geometry | BufferGeometry): geometry is BufferGeometry {
    return (geometry as BufferGeometry).isBufferGeometry;
  } 

function getOnlyUsedVertices(geometry: Geometry | BufferGeometry): Vector3[] {
	if (isBufferGeometry(geometry)) {
		let result: Vector3[] = [];

		var positions = geometry.attributes.position?.array;

		if (positions) {
			for (var i = 0, il = positions.length; i < il; i += 3) {

				const x = positions[i];
				const y = positions[i + 1];
				const z = positions[i + 2];

				result.push(new Vector3(x, y, z));

			}
		}
		return result;
	}
	var faces = geometry.faces;
	var vertices = geometry.vertices;
	if (faces && vertices) {
		let result: Vector3[] = [];
		for (var i = 0, il = faces.length; i < il; i++) {
			var face = faces[i];
			if (vertices[face.a]) result.push(vertices[face.a]); else return vertices;
			if (vertices[face.b]) result.push(vertices[face.b]); else return vertices;
			if (vertices[face.c]) result.push(vertices[face.c]); else return vertices;
		}
		return result;
	}
	return vertices;
}

function getBoundingBoxOfTree(object3Ds: Object3D[]): Box3 | null {
	var box = new Box3();
	var v = new Vector3();
	for (var tt = 0; tt < object3Ds.length; tt++) {
		var object3D = object3Ds[tt];
		object3D.traverse(function (obj3D) {
			if (!obj3D.geometry) return;
			var vertices = getOnlyUsedVertices(obj3D.geometry);
			var matrix = obj3D.matrixWorld;
			vertices.forEach(function (vertex) {
				box.expandByPoint(v.copy(vertex).applyMatrix4(matrix));
			});
		});
	}
	if (box.isEmpty()) return null;
	return box;
}

function lerpVector(v1: Vector3, v2: Vector3, t: number): Vector3 {
	return v1.clone().multiplyScalar(1 - t).add(v2.clone().multiplyScalar(t));
}

function lerpScalar(v1: number, v2: number, t: number): number {
	return v1 * (1 - t) + v2 * t;
}

function setEyeAndTarget(eye: Vector3, target: Vector3, g_client: TClient, _up?: Vector3): void {
	up = _up || up;
	var aspect = g_client.parentNode.offsetWidth / g_client.parentNode.offsetHeight;
	var camera: Camera;
	if (effectController.orthographic) {
		var le = target.distanceTo(eye);
		camera = new OrthographicCamera(-le / 2 * aspect, le / 2 * aspect, le / 2, -le / 2, 0, 2000000);
	} else {
		camera = new PerspectiveCamera(g_angle, aspect, 0.01, 2000000);
	}
	g_client.g_camera = g_client.controls.object = camera;
	camera.eye = camera.position.copy(eye);
	g_client.controls.target.copy(target);
	camera.target = target;
	if (effectController.enable_maps)
		camera.up.set(0, 0, 1); else
		camera.up.copy(_up != null ? _up : up);
	camera.lookAt(target);
	camera.updateProjectionMatrix();
	if (g_client.controls.active) {
		enableOrbit(false, g_client);
		enableOrbit(true, g_client);
	}
	camera.updateProjectionMatrix();
	camera.updateMatrixWorld();
}

function printCameras(lines: number[], artifactId: string): void {
	var g_client = resolveArtifact(artifactId);

	for (var tt = 0; tt < g_cameraTransforms.length; tt++) {
		var transform = g_cameraTransforms[tt];
		g_client.scene.remove(transform);
		removeFromArray(g_client.additionalObjectsToSelect, transform);
	}

	g_cameraTransforms = [];


	for (var tt = 0; tt < lines.length;) {
		var lastPoint = asVector3([lines[tt + 0], lines[tt + 1], lines[tt + 2]]);
		var nextPoint = asVector3([lines[tt + 3], lines[tt + 4], lines[tt + 5]]);

		var cameraBoxMaterial = new MeshLambertMaterial({ color: 0xc0a0a0, opacity: 0.75, transparent: true });
		var cameraHoleMaterial = new MeshLambertMaterial({ color: 0x010101, opacity: 0.75, transparent: true });

		var aspect = lines[tt + 7];// g_client.parentNode.offsetWidth / g_client.parentNode.offsetHeight;
		var camera = new PerspectiveCamera(lines[tt + 6], aspect, 0.5, 1000);
		camera.eye = camera.position.copy(lastPoint);
		camera.up = up;
		camera.lookAt(camera.target = nextPoint);
		camera.updateProjectionMatrix();
		camera.updateMatrixWorld();

		var p = lastPoint;
		var n1 = new Vector3(-1, -1, -1).unproject(camera);
		var n2 = new Vector3(1, -1, -1).unproject(camera);
		var n3 = new Vector3(1, 1, -1).unproject(camera);
		var n4 = new Vector3(-1, 1, -1).unproject(camera);


		let geometry = new Geometry();
		geometry.vertices = [p, n1, n2, n3, n4];
		geometry.faces = [new Face3(0, 1, 2), new Face3(0, 2, 3), new Face3(0, 3, 4), new Face3(0, 4, 1)];
		geometry.computeFaceNormals();
		var mesh = new Mesh(geometry as unknown as BufferGeometry, cameraBoxMaterial);
		g_client.scene.add(mesh);
		g_cameraTransforms.push(mesh);
		g_client.additionalObjectsToSelect.push(mesh);
		mesh.name = ""+lines[tt + 8];
		mesh.cam = camera;

		geometry = new Geometry();
		geometry.vertices = [p, n1, n2, n3, n4];
		geometry.faces = [new Face3(4, 3, 2)];
		geometry.computeFaceNormals();
		mesh = new Mesh(geometry as unknown as BufferGeometry, cameraHoleMaterial);
		g_client.scene.add(mesh);
		g_cameraTransforms.push(mesh);
		g_client.additionalObjectsToSelect.push(mesh);

		tt += 9;
	}
	updateSelectableObjects(g_client);
	updateClient(g_client);
}

var incidentGeometries: { [n: string]: BufferGeometry } = {};
var incidentMaterials: { [n: string]: Material } = {};


function loadLavaMaterial(): ShaderMaterial {


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


	var fragmentShader = "\
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
		fogColor: { type: "v3", value: new Vector3(0, 0, 0) },
		time: { type: "f", value: 1.0 },
		resolution: { type: "v2", value: new Vector2() },
		uvScale: { type: "v2", value: new Vector2(3.0, 1.0) },
		texture1: { type: "t", value: ImageUtils.loadTexture(t_dir + "textures/lava/cloud.png", undefined, updateClients) },
		texture2: { type: "t", value: ImageUtils.loadTexture(t_dir + "textures/lava/lavatile.jpg", undefined, updateClients) }

	};

	uniforms.texture1.value.wrapS = uniforms.texture1.value.wrapT = RepeatWrapping;
	uniforms.texture2.value.wrapS = uniforms.texture2.value.wrapT = RepeatWrapping;

	return new ShaderMaterial({

		uniforms: uniforms,
		vertexShader: vertexShader,
		fragmentShader: fragmentShader

	});

}

function printIncidents(lines: string[], artifactId: string): void {

	var g_client = resolveArtifact(artifactId);

	for (var tt = 0; tt < g_incidentTransforms.length; tt++) {
		//    	var psys = g_incidentTransforms[tt];
		//    	psys.stop();
		var transform = g_incidentTransforms[tt];
		g_client.scene.remove(transform);
		removeFromArray(g_client.additionalObjectsToSelect, transform);
		//    	transform.parent = null;
		//    	pack.removeObject(transform);
	}
	blinkingObjects = [];
	if (blinkJob) { window.clearInterval(blinkJob); blinkJob = null; }

	g_incidentTransforms = [];


	if (!hasFire) {
		var requiredThreeJS: string[] = [];
		requiredThreeJS.push(g_dir + "fonts/helvetiker_regular.typeface.json");
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
		requirejs(requiredThreeJS, function () {
			hasFire = true;
			printIncidents(lines, artifactId);
			////			  var scene = g_client.scene;
			////
			////			    for (var tt = 0; tt < lines.length; ) {
			////				    	var lastPoint = [lines[tt+0],lines[tt+1],lines[tt+2]];
			////
			////						  if (!mapA)
			////							  mapA = ImageUtils.loadTexture( g_dir+"fire/images/smoke.png" );
			////				    	  var cloud = new Object3D();
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
			//////				    	  psys.addForce(new Vector3(0,50,10));
			////				    	  psys.start();
			////
			////				    	  
			////				    	  cloud.position = new Vector3(lastPoint[0],lastPoint[1],lastPoint[2]);
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
			//////		    requirejs(requiredThreeJS, function () {
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

	for (var tt = 0; tt < lines.length;) {
		var lastPoint = asVector3([parseFloat(lines[tt + 0]), parseFloat(lines[tt + 1]), parseFloat(lines[tt + 2])]);
		var material = null;
		let geometry : BufferGeometry | null = null ;
		var desc = lines[tt + 3].toLowerCase();

		for (let _key in incidentMaterials) {
			if (desc.indexOf(_key) != -1) {
				material = incidentMaterials[_key];
				geometry = incidentGeometries[_key];
			}
		}
		let key: string | null = null;
		if (!(material && geometry))
			if (desc.indexOf(key = "fire") != -1) {
				geometry = new OctahedronGeometry(0.5, 2);
				material = loadLavaMaterial();
			} else
				if (desc.indexOf(key = "light") != -1) {
					geometry = new PlaneGeometry(1, 1, 1, 1);
					var texture = ImageUtils.loadTexture(g_dir + "images/light_bulb.png", undefined, updateClients);
					texture.wrapS = texture.wrapT = RepeatWrapping;
					material = new MeshBasicMaterial({ map: texture, alphaTest: 0.5, side: DoubleSide, transparent: true, opacity: 1 });
				} else
					if (desc.indexOf(key = "power") != -1) {
						geometry = new PlaneGeometry(1, 1, 1, 1);
						var texture = ImageUtils.loadTexture(g_dir + "images/Electricity.png", undefined, updateClients);
						texture.wrapS = texture.wrapT = RepeatWrapping;
						material = new MeshBasicMaterial({ map: texture, alphaTest: 0.5, side: DoubleSide, transparent: true, opacity: 1 });
					} else
						if (desc.indexOf(key = "smoke") != -1) {
							geometry = new PlaneGeometry(2, 2, 1, 1);
							var texture = ImageUtils.loadTexture(g_dir + "images/smoke.png", undefined, updateClients);
							texture.wrapS = texture.wrapT = RepeatWrapping;
							material = new MeshBasicMaterial({ map: texture, alphaTest: 0.5, side: DoubleSide, transparent: true, opacity: 1 });
						} else {
							key = null;
							// Random colors

							geometry = new BoxGeometry(1, 1, 1);

                            const colors = [];
							for (var i = 0; i < geometry.attributes.position.array.length / 3; i++) {
                                colors.push(Math.random(), Math.random(), Math.random());
							}
                            geometry.setAttribute('color', new BufferAttribute(colors, 1));

							material = new MeshBasicMaterial({ vertexColors: true });

						}

		if (key) {
			incidentMaterials[key] = material;
			incidentGeometries[key] = geometry;
		}

		var cube = new Mesh(geometry, material);
		cube.position.copy(lastPoint);
		cube.position.y = cube.position.y + 0.5;
		cube.rotation.x = -Math.PI / 2;
		cube.rotation.z = -Math.PI / 2;
		g_client.scene.add(cube);
		cube.updateMatrixWorld();
		g_client.additionalObjectsToSelect.push(cube);
		g_incidentTransforms.push(cube);
		cube.name = lines[tt + 5];

		// Text

		var theText = "Hello three.js! :)";
		theText = lines[tt + 3];

		var text3d = new TextGeometry(theText, {

			size: 8,
			height: 2,
			curveSegments: 2,
			font: "helvetiker"

		});

		text3d.computeBoundingBox();
		var centerOffset = -0.5 * (text3d.boundingBox!.max.x - text3d.boundingBox!.min.x);

		var textMaterial = new MeshBasicMaterial({ color: 0x030303 });
		var text = new Mesh(text3d, textMaterial);

		text.position.x = lastPoint.x;
		text.position.y = lastPoint.y + 1;
		text.position.z = lastPoint.z;

		text.rotation.x = -Math.PI / 2;
		text.rotation.y = 0;
		text.rotation.z = -Math.PI / 2;
		text.scale.x = text.scale.y = text.scale.z = 0.04;

		var parent =  new Mesh();
		parent.add(text);

		g_client.scene.add(parent);
		parent.updateMatrixWorld();
		g_incidentTransforms.push(parent);

		if (lines[tt + 4] == "blink") {
			blinkingObjects.push(cube);
			if (!blinkJob)
				blinkJob = window.setInterval(function () {
					for (var tt = 0; tt < blinkingObjects.length; tt++) {
						blinkingObjects[tt].visible = !blinkingObjects[tt].visible;
					}
					updateClient(g_client);
				}, 300);
		}

		tt += 6;
	}
	updateSelectableObjects(g_client);
	updateClient(g_client);
}

function generateMaterials(): TMat {

	// toons

	var toonMaterial1 = createShaderMaterial("toon1", light, ambientLight),
		toonMaterial2 = createShaderMaterial("toon2", light, ambientLight),
		hatchingMaterial = createShaderMaterial("hatching", light, ambientLight),
		hatchingMaterial2 = createShaderMaterial("hatching", light, ambientLight),
		dottedMaterial = createShaderMaterial("dotted", light, ambientLight),
		dottedMaterial2 = createShaderMaterial("dotted", light, ambientLight);

	hatchingMaterial2.uniforms.uBaseColor.value.setRGB(0, 0, 0);
	hatchingMaterial2.uniforms.uLineColor1.value.setHSL(0, 0.8, 0.5);
	hatchingMaterial2.uniforms.uLineColor2.value.setHSL(0, 0.8, 0.5);
	hatchingMaterial2.uniforms.uLineColor3.value.setHSL(0, 0.8, 0.5);
	hatchingMaterial2.uniforms.uLineColor4.value.setHSL(0.1, 0.8, 0.5);

	dottedMaterial2.uniforms.uBaseColor.value.setRGB(0, 0, 0);
	dottedMaterial2.uniforms.uLineColor1.value.setHSL(0.05, 1.0, 0.5);

	var texture = ImageUtils.loadTexture(t_dir + "textures/ash_uvgrid01.jpg");
	texture.wrapS = texture.wrapT = RepeatWrapping;

	var textureCube = null;
	var reflectionCube = null;
	var refractionCube = null;



	var materials: TMat = {

		"chrome":
		{
			m: new MeshLambertMaterial({ color: 0xffffff, envMap: reflectionCube }),
			h: 0, s: 0, l: 1
		},

		"liquid":
		{
			m: new MeshLambertMaterial({ color: 0xffffff, envMap: refractionCube, refractionRatio: 0.85 }),
			h: 0, s: 0, l: 1
		},

		"shiny":
		{
			m: new MeshPhongMaterial({ color: 0x550000, specular: 0x440000, envMap: reflectionCube, combine: MixOperation, reflectivity: 0.3 }),
			h: 0, s: 0.8, l: 0.2
		},

		"matte":
		{
			m: new MeshPhongMaterial({ color: 0x000000, specular: 0x111111, shininess: 1 }),
			h: 0, s: 0, l: 1
		},

		"flat":
		{
			m: new MeshPhongMaterial({ color: 0x000000, specular: 0x111111, shininess: 1, flatShading: true }),
			h: 0, s: 0, l: 1
		},

		"textured":
		{
			m: new MeshPhongMaterial({ color: 0xffffff, specular: 0x111111, shininess: 1, map: texture }),
			h: 0, s: 0, l: 1
		},

		"colors":
		{
			m: new MeshPhongMaterial({ color: 0xffffff, specular: 0xffffff, shininess: 2, vertexColors: true }),
			h: 0, s: 0, l: 1
		},

		"plastic":
		{
			m: new MeshPhongMaterial({ color: 0x000000, specular: 0x888888, shininess: 250 }),
			h: 0.6, s: 0.8, l: 0.1
		},

		"toon1":
		{
			m: toonMaterial1,
			h: 0.2, s: 1, l: 0.75
		},

		"toon2":
		{
			m: toonMaterial2,
			h: 0.4, s: 1, l: 0.75
		},

		"hatching":
		{
			m: hatchingMaterial,
			h: 0.2, s: 1, l: 0.9
		},

		"hatching2":
		{
			m: hatchingMaterial2,
			h: 0.0, s: 0.8, l: 0.5
		},

		"dotted":
		{
			m: dottedMaterial,
			h: 0.2, s: 1, l: 0.9
		},

		"dotted2":
		{
			m: dottedMaterial2,
			h: 0.1, s: 1, l: 0.5
		},


		"Gold": new MeshPhongMaterial({ color: 0xaa9944, specular: 0xbbaa99, shininess: 50, envMap: textureCube, combine: MultiplyOperation }),
		"Bronze": new MeshPhongMaterial({ color: 0x150505, specular: 0xee6600, shininess: 10, envMap: textureCube, combine: MixOperation, reflectivity: 0.25 }),
		"Chrome": new MeshPhongMaterial({ color: 0xffffff, specular: 0xffffff, envMap: textureCube, combine: MultiplyOperation }),

		"Black glass": new MeshLambertMaterial({ color: 0x101016, envMap: textureCube, opacity: 0.975, transparent: true }),
		"Dark glass": new MeshLambertMaterial({ color: 0x101046, envMap: textureCube, opacity: 0.25, transparent: true }),
		"Blue glass": new MeshLambertMaterial({ color: 0x668899, envMap: textureCube, opacity: 0.75, transparent: true }),
		"Light glass": new MeshBasicMaterial({ color: 0x223344, envMap: textureCube, opacity: 0.25, transparent: true, combine: MixOperation, reflectivity: 0.25 }),

	};

	return materials;

}

function createShaderMaterial(id: string, light: Light, ambientLight: AmbientLight): ShaderMaterial {

	var shader = ShaderToon[id];

	var u = UniformsUtils.clone(shader.uniforms);

	var vs = shader.vertexShader;
	var fs = shader.fragmentShader;

	var material = new ShaderMaterial({ uniforms: u, vertexShader: vs, fragmentShader: fs });

	material.uniforms.uDirLightPos.value = light.position;
	material.uniforms.uDirLightColor.value = light.color;

	material.uniforms.uAmbientLightColor.value = ambientLight.color;

	return material;

}
