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
import IFC2X3.IfcCharacterStyleSelect;
import IFC2X3.IfcTextFontSelect;
import IFC2X3.IfcTextStyle;
import IFC2X3.IfcTextStyleSelect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Text Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTextStyleImpl#getTextCharacterAppearance <em>Text Character Appearance</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTextStyleImpl#getTextStyle <em>Text Style</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTextStyleImpl#getTextFontStyle <em>Text Font Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTextStyle")
@XmlRootElement(name = "IfcTextStyleElement")
public class IfcTextStyleImpl extends IfcPresentationStyleImpl implements IfcTextStyle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTextStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTextStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextStyleSelect getTextStyle() {
		return (IfcTextStyleSelect)eGet(IFC2X3Package.eINSTANCE.getIfcTextStyle_TextStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextStyle(IfcTextStyleSelect newTextStyle) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextStyle_TextStyle(), newTextStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextFontSelect getTextFontStyle() {
		return (IfcTextFontSelect)eGet(IFC2X3Package.eINSTANCE.getIfcTextStyle_TextFontStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextFontStyle(IfcTextFontSelect newTextFontStyle) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextStyle_TextFontStyle(), newTextFontStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCharacterStyleSelect getTextCharacterAppearance() {
		return (IfcCharacterStyleSelect)eGet(IFC2X3Package.eINSTANCE.getIfcTextStyle_TextCharacterAppearance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextCharacterAppearance(IfcCharacterStyleSelect newTextCharacterAppearance) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextStyle_TextCharacterAppearance(), newTextCharacterAppearance);
	}

} //IfcTextStyleImpl
