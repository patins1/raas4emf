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
import IFC2X3.IfcCartesianTransformationOperator2D;
import IFC2X3.IfcSurfaceTexture;
import IFC2X3.IfcSurfaceTextureEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Texture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSurfaceTextureImpl#getRepeatS <em>Repeat S</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSurfaceTextureImpl#getRepeatT <em>Repeat T</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSurfaceTextureImpl#getTextureType <em>Texture Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSurfaceTextureImpl#getTextureTransform <em>Texture Transform</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSurfaceTexture")
@XmlSeeAlso({ IfcPixelTextureImpl.class, IfcImageTextureImpl.class, IfcBlobTextureImpl.class })
@XmlRootElement(name = "IfcSurfaceTextureElement")
public class IfcSurfaceTextureImpl extends CDOObjectImpl implements IfcSurfaceTexture {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceTextureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSurfaceTexture();
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianTransformationOperator2D getTextureTransform() {
		return (IfcCartesianTransformationOperator2D)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceTexture_TextureTransform(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextureTransform(IfcCartesianTransformationOperator2D newTextureTransform) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceTexture_TextureTransform(), newTextureTransform);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceTextureEnum getTextureType() {
		return (IfcSurfaceTextureEnum)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceTexture_TextureType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextureType(IfcSurfaceTextureEnum newTextureType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceTexture_TextureType(), newTextureType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextureType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSurfaceTexture_TextureType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextureType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSurfaceTexture_TextureType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRepeatT() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceTexture_RepeatT(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatT(Boolean newRepeatT) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceTexture_RepeatT(), newRepeatT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepeatT() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSurfaceTexture_RepeatT());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepeatT() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSurfaceTexture_RepeatT());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRepeatS() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceTexture_RepeatS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatS(Boolean newRepeatS) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceTexture_RepeatS(), newRepeatS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepeatS() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSurfaceTexture_RepeatS());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepeatS() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSurfaceTexture_RepeatS());
	}

} //IfcSurfaceTextureImpl
