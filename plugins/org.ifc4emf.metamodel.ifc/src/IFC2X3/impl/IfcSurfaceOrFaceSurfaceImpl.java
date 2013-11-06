/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcSurfaceOrFaceSurface;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Or Face Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSurfaceOrFaceSurface")
@XmlSeeAlso({ IfcBoundedSurfaceImpl.class, IfcElementarySurfaceImpl.class, IfcFaceSurfaceImpl.class, IfcSurfaceOfRevolutionImpl.class, IfcFaceBasedSurfaceModelImpl.class, IfcSurfaceImpl.class, IfcCurveBoundedPlaneImpl.class, IfcSurfaceOfLinearExtrusionImpl.class,
		IfcRectangularTrimmedSurfaceImpl.class, IfcPlaneImpl.class, IfcSweptSurfaceImpl.class })
@XmlRootElement(name = "IfcSurfaceOrFaceSurfaceElement")
public abstract class IfcSurfaceOrFaceSurfaceImpl extends CDOObjectImpl implements IfcSurfaceOrFaceSurface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceOrFaceSurfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSurfaceOrFaceSurface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

} //IfcSurfaceOrFaceSurfaceImpl
