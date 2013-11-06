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
import IFC2X3.IfcColour;
import IFC2X3.IfcTextStyleForDefinedFont;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Text Style For Defined Font</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTextStyleForDefinedFontImpl#getColour <em>Colour</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTextStyleForDefinedFontImpl#getBackgroundColour <em>Background Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTextStyleForDefinedFont")
@XmlRootElement(name = "IfcTextStyleForDefinedFontElement")
public class IfcTextStyleForDefinedFontImpl extends IfcCharacterStyleSelectImpl implements IfcTextStyleForDefinedFont {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTextStyleForDefinedFontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTextStyleForDefinedFont();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColour getColour() {
		return (IfcColour)eGet(IFC2X3Package.eINSTANCE.getIfcTextStyleForDefinedFont_Colour(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColour(IfcColour newColour) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextStyleForDefinedFont_Colour(), newColour);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColour getBackgroundColour() {
		return (IfcColour)eGet(IFC2X3Package.eINSTANCE.getIfcTextStyleForDefinedFont_BackgroundColour(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColour(IfcColour newBackgroundColour) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextStyleForDefinedFont_BackgroundColour(), newBackgroundColour);
	}

} //IfcTextStyleForDefinedFontImpl
