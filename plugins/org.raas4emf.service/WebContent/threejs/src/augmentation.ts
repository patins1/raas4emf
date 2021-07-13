
import {
    Geometry, BoxGeometry, Object3D, Clock, Face3, Intersection, Raycaster, BufferGeometry, Curve, Mesh, SkinnedMesh, Vector3,
    Vector2, Vector4, Color, Box3, Sphere, Camera, Scene, WebGLRenderer, Material, MeshPhongMaterial, ShaderMaterial,
    Texture, Light, AmbientLight, PointLight, DirectionalLight, BufferAttribute,
    DoubleSide, SmoothShading, RGBFormat, BackSide, FrontSide, RepeatWrapping, MixOperation, FlatShading, MultiplyOperation,
    SphereGeometry, ExtrudeGeometryOptions, ExtrudeGeometry, TubeGeometry, PlaneGeometry, OctahedronGeometry, TextGeometry, MathUtils, Shape,
    Path, FaceColors, VertexColors, LineBasicMaterial, Line, ImageUtils, ShaderLib, MeshBasicMaterial, Sprite, Matrix4,
    OrthographicCamera, PerspectiveCamera, UniformsUtils, Matrix3, MeshLambertMaterial
} from "three";

import { GUIController } from "dat.gui";


declare module "three" {
    export interface Object3D {
        //new(): Object3D;
        //(): Object3D;
        geometry: Geometry | BufferGeometry;
        importedMaterial: Material;
        originalMaterial: Material;
        baseMaterial: Material;
        originalParent: Object3D | null;
        material: Material | Material[];
        pred: Object3D;
        costInfo: string;
        storedMaterialName: string;
        readonly isSprite: false;
        isMesh: boolean;
        isCamera: boolean;
        readonly isLight: false;
        readonly isScene: false;
    }
    export interface Mesh {
        importedMaterial: Material;
        originalMaterial: Material;
        baseMaterial: Material;
        originalParent: Object3D | null;
        pred: Object3D;
        costInfo: string;
        storedMaterialName: string;
        readonly isSprite: false;
        readonly isCamera: false;
        readonly isLight: false;
        readonly isScene: false;
    }
    export interface Geometry {
        path: Curve<Vector3>;
        taken: boolean;
        readonly isBufferGeometry: false;
        readonly isGeometry: true;
        readonly isMesh: false
    }
    export interface BufferGeometry {
        path: Curve<Vector3>;
        taken: boolean;
        readonly isBufferGeometry: true;
        readonly isGeometry: false;
    }
    export interface Material {
        meltedGeometry: BufferGeometry;
        map: Texture;
    }
    export interface Camera {
        eye: Vector3;
        target: Vector3;
    }
}
declare module "three/examples/jsm/curves/NURBSCurve" {
    interface NURBSCurve {
        addKnot(t: number): void;
        addPoint(p: Vector4, knot: number): void;
        getLastKnot(): number;
        removeLastPoint(): void;
        addArcAndLine(direction: Vector4, percentageOfQuarter: number, lineLength: number, radius: number): void;
        endKnot: number;
        controlPoints: Vector4[];
        knots: number[];
        degree: number;
    }
}
declare module "dat.gui" {
    interface GUIController {
        neverRemove: boolean;
        __checkbox: HTMLFormElement;
        initialValue: any;
        __precision: number;
        __onChange(): void;
    }
}
