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
import IFC2X3.IfcPreDefinedItem;
import IFC2X3.IfcPreDefinedTextFont;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Pre Defined Text Font</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcPreDefinedTextFontImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPreDefinedTextFont")
@XmlSeeAlso({ IfcDraughtingPreDefinedTextFontImpl.class, IfcTextStyleFontModelImpl.class })
@XmlRootElement(name = "IfcPreDefinedTextFontElement")
public class IfcPreDefinedTextFontImpl extends IfcTextFontSelectImpl implements IfcPreDefinedTextFont {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPreDefinedTextFontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPreDefinedTextFont();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcPreDefinedItem_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPreDefinedItem_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPreDefinedItem_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPreDefinedItem_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IfcPreDefinedItem.class) {
			switch (derivedFeatureID) {
				case IFC2X3Package.IFC_PRE_DEFINED_TEXT_FONT__NAME: return IFC2X3Package.IFC_PRE_DEFINED_ITEM__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IfcPreDefinedItem.class) {
			switch (baseFeatureID) {
				case IFC2X3Package.IFC_PRE_DEFINED_ITEM__NAME: return IFC2X3Package.IFC_PRE_DEFINED_TEXT_FONT__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IfcPreDefinedTextFontImpl
