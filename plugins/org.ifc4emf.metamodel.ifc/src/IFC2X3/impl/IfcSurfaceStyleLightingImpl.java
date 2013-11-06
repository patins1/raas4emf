/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcColourRgb;
import IFC2X3.IfcSurfaceStyleLighting;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Style Lighting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSurfaceStyleLightingImpl#getDiffuseTransmissionColour <em>Diffuse Transmission Colour</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSurfaceStyleLightingImpl#getDiffuseReflectionColour <em>Diffuse Reflection Colour</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSurfaceStyleLightingImpl#getTransmissionColour <em>Transmission Colour</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSurfaceStyleLightingImpl#getReflectanceColour <em>Reflectance Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSurfaceStyleLighting")
@XmlRootElement(name = "IfcSurfaceStyleLightingElement")
public class IfcSurfaceStyleLightingImpl extends IfcSurfaceStyleElementSelectImpl implements IfcSurfaceStyleLighting {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceStyleLightingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSurfaceStyleLighting();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgb getReflectanceColour() {
		return (IfcColourRgb)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleLighting_ReflectanceColour(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReflectanceColour(IfcColourRgb newReflectanceColour) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleLighting_ReflectanceColour(), newReflectanceColour);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgb getDiffuseTransmissionColour() {
		return (IfcColourRgb)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleLighting_DiffuseTransmissionColour(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiffuseTransmissionColour(IfcColourRgb newDiffuseTransmissionColour) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleLighting_DiffuseTransmissionColour(), newDiffuseTransmissionColour);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgb getTransmissionColour() {
		return (IfcColourRgb)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleLighting_TransmissionColour(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionColour(IfcColourRgb newTransmissionColour) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleLighting_TransmissionColour(), newTransmissionColour);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgb getDiffuseReflectionColour() {
		return (IfcColourRgb)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleLighting_DiffuseReflectionColour(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiffuseReflectionColour(IfcColourRgb newDiffuseReflectionColour) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleLighting_DiffuseReflectionColour(), newDiffuseReflectionColour);
	}

} //IfcSurfaceStyleLightingImpl
