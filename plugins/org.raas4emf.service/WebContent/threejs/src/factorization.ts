import {
    Object3D, BufferGeometry, Mesh, SkinnedMesh, Vector3, Vector2, Material, ShaderMaterial, Texture, Color, Camera,
    Scene, WebGLRenderer, DirectionalLight, PointLight, AmbientLight, Box3, Sphere, Clock, Intersection, Curve, MeshPhongMaterial
} from "three";

import * as THREE from "three";

export class Factory {
    static createObject3D(): Object3D {
        return new (THREE as any).Object3D();
    }
}