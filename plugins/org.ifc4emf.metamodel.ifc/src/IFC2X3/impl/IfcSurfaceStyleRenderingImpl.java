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
import IFC2X3.IfcColourOrFactor;
import IFC2X3.IfcReflectanceMethodEnum;
import IFC2X3.IfcSpecularHighlightSelect;
import IFC2X3.IfcSurfaceStyleRendering;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Style Rendering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSurfaceStyleRenderingImpl#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSurfaceStyleRenderingImpl#getDiffuseColour <em>Diffuse Colour</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSurfaceStyleRenderingImpl#getTransmissionColour <em>Transmission Colour</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSurfaceStyleRenderingImpl#getDiffuseTransmissionColour <em>Diffuse Transmission Colour</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSurfaceStyleRenderingImpl#getReflectionColour <em>Reflection Colour</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSurfaceStyleRenderingImpl#getSpecularColour <em>Specular Colour</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSurfaceStyleRenderingImpl#getSpecularHighlight <em>Specular Highlight</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSurfaceStyleRenderingImpl#getReflectanceMethod <em>Reflectance Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSurfaceStyleRendering")
@XmlRootElement(name = "IfcSurfaceStyleRenderingElement")
public class IfcSurfaceStyleRenderingImpl extends IfcSurfaceStyleShadingImpl implements IfcSurfaceStyleRendering {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceStyleRenderingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRendering();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourOrFactor getDiffuseColour() {
		return (IfcColourOrFactor)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRendering_DiffuseColour(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiffuseColour(IfcColourOrFactor newDiffuseColour) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRendering_DiffuseColour(), newDiffuseColour);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourOrFactor getTransmissionColour() {
		return (IfcColourOrFactor)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRendering_TransmissionColour(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionColour(IfcColourOrFactor newTransmissionColour) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRendering_TransmissionColour(), newTransmissionColour);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourOrFactor getDiffuseTransmissionColour() {
		return (IfcColourOrFactor)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRendering_DiffuseTransmissionColour(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiffuseTransmissionColour(IfcColourOrFactor newDiffuseTransmissionColour) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRendering_DiffuseTransmissionColour(), newDiffuseTransmissionColour);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourOrFactor getReflectionColour() {
		return (IfcColourOrFactor)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRendering_ReflectionColour(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReflectionColour(IfcColourOrFactor newReflectionColour) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRendering_ReflectionColour(), newReflectionColour);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourOrFactor getSpecularColour() {
		return (IfcColourOrFactor)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRendering_SpecularColour(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecularColour(IfcColourOrFactor newSpecularColour) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRendering_SpecularColour(), newSpecularColour);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpecularHighlightSelect getSpecularHighlight() {
		return (IfcSpecularHighlightSelect)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRendering_SpecularHighlight(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecularHighlight(IfcSpecularHighlightSelect newSpecularHighlight) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRendering_SpecularHighlight(), newSpecularHighlight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReflectanceMethodEnum getReflectanceMethod() {
		return (IfcReflectanceMethodEnum)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRendering_ReflectanceMethod(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReflectanceMethod(IfcReflectanceMethodEnum newReflectanceMethod) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRendering_ReflectanceMethod(), newReflectanceMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReflectanceMethod() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRendering_ReflectanceMethod());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReflectanceMethod() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRendering_ReflectanceMethod());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTransparency() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRendering_Transparency(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransparency(Double newTransparency) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRendering_Transparency(), newTransparency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransparency() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRendering_Transparency());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransparency() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleRendering_Transparency());
	}

} //IfcSurfaceStyleRenderingImpl
