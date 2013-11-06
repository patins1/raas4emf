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
import IFC2X3.IfcImageTexture;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Image Texture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcImageTextureImpl#getUrlReference <em>Url Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcImageTexture")
@XmlRootElement(name = "IfcImageTextureElement")
public class IfcImageTextureImpl extends IfcSurfaceTextureImpl implements IfcImageTexture {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcImageTextureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcImageTexture();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrlReference() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcImageTexture_UrlReference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlReference(String newUrlReference) {
		eSet(IFC2X3Package.eINSTANCE.getIfcImageTexture_UrlReference(), newUrlReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUrlReference() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcImageTexture_UrlReference());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUrlReference() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcImageTexture_UrlReference());
	}

} //IfcImageTextureImpl
