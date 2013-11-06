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
import IFC2X3.IfcSizeSelect;
import IFC2X3.IfcTextStyleWithBoxCharacteristics;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Text Style With Box Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxHeight <em>Box Height</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxWidth <em>Box Width</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxSlantAngle <em>Box Slant Angle</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTextStyleWithBoxCharacteristicsImpl#getBoxRotateAngle <em>Box Rotate Angle</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTextStyleWithBoxCharacteristicsImpl#getCharacterSpacing <em>Character Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTextStyleWithBoxCharacteristics")
@XmlRootElement(name = "IfcTextStyleWithBoxCharacteristicsElement")
public class IfcTextStyleWithBoxCharacteristicsImpl extends IfcTextStyleSelectImpl implements IfcTextStyleWithBoxCharacteristics {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTextStyleWithBoxCharacteristicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect getCharacterSpacing() {
		return (IfcSizeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_CharacterSpacing(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacterSpacing(IfcSizeSelect newCharacterSpacing) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_CharacterSpacing(), newCharacterSpacing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBoxRotateAngle() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxRotateAngle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoxRotateAngle(Double newBoxRotateAngle) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxRotateAngle(), newBoxRotateAngle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoxRotateAngle() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxRotateAngle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBoxRotateAngle() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxRotateAngle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBoxSlantAngle() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxSlantAngle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoxSlantAngle(Double newBoxSlantAngle) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxSlantAngle(), newBoxSlantAngle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoxSlantAngle() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxSlantAngle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBoxSlantAngle() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxSlantAngle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBoxWidth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxWidth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoxWidth(Double newBoxWidth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxWidth(), newBoxWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoxWidth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBoxWidth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBoxHeight() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxHeight(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoxHeight(Double newBoxHeight) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxHeight(), newBoxHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoxHeight() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxHeight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBoxHeight() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTextStyleWithBoxCharacteristics_BoxHeight());
	}

} //IfcTextStyleWithBoxCharacteristicsImpl
