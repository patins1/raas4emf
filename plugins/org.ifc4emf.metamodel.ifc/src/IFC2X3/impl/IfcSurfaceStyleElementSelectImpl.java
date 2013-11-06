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
import IFC2X3.IfcSurfaceStyleElementSelect;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Style Element Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSurfaceStyleElementSelect")
@XmlSeeAlso({ IfcSurfaceStyleLightingImpl.class, IfcSurfaceStyleRenderingImpl.class, IfcSurfaceStyleRefractionImpl.class, IfcExternallyDefinedSurfaceStyleImpl.class, IfcSurfaceStyleWithTexturesImpl.class, IfcSurfaceStyleShadingImpl.class })
@XmlRootElement(name = "IfcSurfaceStyleElementSelectElement")
public abstract class IfcSurfaceStyleElementSelectImpl extends CDOObjectImpl implements IfcSurfaceStyleElementSelect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceStyleElementSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSurfaceStyleElementSelect();
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

} //IfcSurfaceStyleElementSelectImpl
