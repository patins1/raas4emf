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
import IFC2X3.IfcExternalReference;
import IFC2X3.IfcExternallyDefinedTextFont;
import IFC2X3.IfcLightDistributionDataSourceSelect;
import IFC2X3.IfcObjectReferenceSelect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Externally Defined Text Font</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcExternallyDefinedTextFontImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcExternallyDefinedTextFontImpl#getItemReference <em>Item Reference</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcExternallyDefinedTextFontImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcExternallyDefinedTextFont")
@XmlRootElement(name = "IfcExternallyDefinedTextFontElement")
public class IfcExternallyDefinedTextFontImpl extends IfcTextFontSelectImpl implements IfcExternallyDefinedTextFont {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcExternallyDefinedTextFontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcExternallyDefinedTextFont();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcExternalReference_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcExternalReference_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcExternalReference_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcExternalReference_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItemReference() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcExternalReference_ItemReference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemReference(String newItemReference) {
		eSet(IFC2X3Package.eINSTANCE.getIfcExternalReference_ItemReference(), newItemReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetItemReference() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcExternalReference_ItemReference());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetItemReference() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcExternalReference_ItemReference());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcExternalReference_Location(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcExternalReference_Location(), newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLocation() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcExternalReference_Location());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLocation() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcExternalReference_Location());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IfcLightDistributionDataSourceSelect.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IfcObjectReferenceSelect.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IfcExternalReference.class) {
			switch (derivedFeatureID) {
				case IFC2X3Package.IFC_EXTERNALLY_DEFINED_TEXT_FONT__LOCATION: return IFC2X3Package.IFC_EXTERNAL_REFERENCE__LOCATION;
				case IFC2X3Package.IFC_EXTERNALLY_DEFINED_TEXT_FONT__ITEM_REFERENCE: return IFC2X3Package.IFC_EXTERNAL_REFERENCE__ITEM_REFERENCE;
				case IFC2X3Package.IFC_EXTERNALLY_DEFINED_TEXT_FONT__NAME: return IFC2X3Package.IFC_EXTERNAL_REFERENCE__NAME;
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
		if (baseClass == IfcLightDistributionDataSourceSelect.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IfcObjectReferenceSelect.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IfcExternalReference.class) {
			switch (baseFeatureID) {
				case IFC2X3Package.IFC_EXTERNAL_REFERENCE__LOCATION: return IFC2X3Package.IFC_EXTERNALLY_DEFINED_TEXT_FONT__LOCATION;
				case IFC2X3Package.IFC_EXTERNAL_REFERENCE__ITEM_REFERENCE: return IFC2X3Package.IFC_EXTERNALLY_DEFINED_TEXT_FONT__ITEM_REFERENCE;
				case IFC2X3Package.IFC_EXTERNAL_REFERENCE__NAME: return IFC2X3Package.IFC_EXTERNALLY_DEFINED_TEXT_FONT__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IfcExternallyDefinedTextFontImpl
