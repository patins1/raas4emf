//		  Format: "material name": [red,green,blue,alpha-transparency] OR a full-fledged self-provisioned threejs material
//		
//		  Selected objects have the "Selection" material.

g_colors = {

	"Beam" : [ 0, 1, 0, 0.85 ],
	"Building" : [ 0, 0, 1, 0.5 ],
	// BuildingElementProxy: "xy" was truncated by Blender
	"BuildingElementPro" : [ 0.8, 0.8, 0.8, 1 ],
	"BuildingStorey" : [ 0, 0, 1, 0.75 ],
	"Column" : [ 1, 1, 0, 0.7 ],
	"Covering" : [ 1, 0, 0.5019608, 1 ],
	"CurtainWall" : new THREE.MeshPhongMaterial({
		color : new THREE.Color().setRGB(0, 0, 1),
		opacity : 0.35,
		transparent : true,
		polygonOffset : true,
		polygonOffsetFactor : 1,
		polygonOffsetUnits : 1
	}),
	"Door" : [ 0.5019608, 0.2509804, 0, 0.8 ],
	"FlowFitting" : new THREE.MeshPhongMaterial({
		color : new THREE.Color().setRGB(0.8, 0.8, 0.8),
		opacity : 1,
		transparent : false,
		side : THREE.DoubleSide
	}),
	"Footing" : [ 0, 0.2509804, 0.2509804, 1 ],
	"FurnishingElement" : [ 0, 0, 0.2509804, 0.2 ],
	"OpeningElement" : [ 0, 0, 1, 0 ],
	"Member" : [ 0.5019608, 0, 0.5019608, 0.9 ],
	"Pile" : [ 0.5019608, 0.5019608, 0, 1 ],
	"Plate" : [ 0.5019608, 0.5019608, 0, 1 ],
	"Project" : [ 0, 0, 1, 0.25 ],
	"Proxy" : [ 0.8, 0.8, 0.8, 1 ],
	"Railing" : [ 0.5019608, 0, 0.5019608, 0.9 ],
	"Roof" : [ 1, 0, 0, 1 ],
	"Site" : [ 0, 0, 1, 0.3 ],
	"Slab" : [ 0.7529412, 0.7529412, 0.7529412, 0.5 ],
	"Space" : [ 0, 0.5019608, 0.2509804, 0.3 ],
	"Stair" : [ 0.5019608, 0, 0.5019608, 0.9 ],
	"StairFlight" : [ 0.5019608, 0, 0.5019608, 0.9 ],
	"Wall" : new THREE.MeshPhongMaterial({
		color : new THREE.Color().setRGB(0, 0, 1),
		opacity : 0.35,
		transparent : true,
		polygonOffset : true,
		polygonOffsetFactor : 1,
		polygonOffsetUnits : 1
	}),
	"WallStandardCase" : new THREE.MeshPhongMaterial({
		color : new THREE.Color().setRGB(0, 0, 1),
		opacity : 0.35,
		transparent : true,
		polygonOffset : true,
		polygonOffsetFactor : 1,
		polygonOffsetUnits : 1
	}),
	"Window" : [ 0, 1, 1, 0.4 ],
	"Selection" : new THREE.MeshPhongMaterial({
		color : new THREE.Color().setRGB(1, 0, 0),
		opacity : 1,
		transparent : false,
		polygonOffset : true,
		polygonOffsetFactor : -1,
		polygonOffsetUnits : -1
	})
};