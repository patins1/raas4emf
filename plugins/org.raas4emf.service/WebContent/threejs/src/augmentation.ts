
import {
    BoxGeometry, Object3D, Clock, Intersection, Raycaster, BufferGeometry, Curve, Mesh, SkinnedMesh, Vector3,
    Vector2, Vector4, Color, Box3, Sphere, Camera, Scene, WebGLRenderer, Material, MeshPhongMaterial, ShaderMaterial,
    Texture, Light, AmbientLight, PointLight, DirectionalLight, BufferAttribute,
    DoubleSide, SmoothShading, RGBFormat, BackSide, FrontSide, RepeatWrapping, MixOperation, FlatShading, MultiplyOperation,
    SphereGeometry, ExtrudeGeometryOptions, ExtrudeGeometry, TubeGeometry, PlaneGeometry, OctahedronGeometry, TextGeometry, MathUtils, Shape,
    Path, LineBasicMaterial, Line, ImageUtils, ShaderLib, MeshBasicMaterial, Sprite, Matrix4,
    OrthographicCamera, PerspectiveCamera, UniformsUtils, Matrix3, MeshLambertMaterial
} from "three";

import { Face3 } from "three/examples/jsm/deprecated/Geometry";
import { Geometry } from "three/examples/jsm/deprecated/Geometry";
import { OrbitControls } from "three/examples/jsm/controls/OrbitControls";
import { GUIController } from "dat.gui";


declare module "three" {
    export interface Object3D {
        traverse(callback: (object: Mesh<BufferGeometry, Material>) => any): void;
        importedMaterial: Material;
        originalMaterial: Material;
        baseMaterial: Material;
        originalParent: Mesh<BufferGeometry, Material> | null;
        material: Material | Material[];
        pred: Mesh<BufferGeometry, Material>;
        costInfo: string;
        storedMaterialName: string;
        customMaterialName: string;
        cam: Camera;
        readonly isSprite: false;
        isMesh: boolean;
        isCamera: boolean;
        readonly isLight: false;
    //     readonly isScene: false;
    }
    // export interface Mesh {
    //     importedMaterial: Material;
    //     originalMaterial: Material;
    //     baseMaterial: Material;
    //     originalParent: Object3D | null;
    //     pred: Object3D;
    //     costInfo: string;
    //     storedMaterialName: string;
    //     readonly isSprite: false;
    //     readonly isCamera: false;
    //     readonly isLight: false;
    //     readonly isScene: false;
    // }
    // export interface Geometry {\
    //     taken: boolean;
    //     readonly isBufferGeometry: false;
    //     readonly isGeometry: true;
    //     readonly isMesh: false
    // }
    // export interface BufferGeometry {
    //         new(): BufferGeometry;
    //     taken: boolean;
    //     // readonly isBufferGeometry: true;
    // //     readonly isGeometry: false;
    // }
    export interface EventDispatcher {
        taken: boolean;
    }
    export interface Material {
        meltedGeometry: BufferGeometry;
        baseMaterialName: string;
        clock: Clock;
    //     map: Texture;
    }
    export interface Camera {
        eye: Vector3;
        target: Vector3;
        updateProjectionMatrix: ()=>void;
    }

    export interface OrbitControls {
        active: boolean;
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
