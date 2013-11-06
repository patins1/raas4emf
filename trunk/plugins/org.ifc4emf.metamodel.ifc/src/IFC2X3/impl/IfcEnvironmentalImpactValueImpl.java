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
import IFC2X3.IfcEnvironmentalImpactCategoryEnum;
import IFC2X3.IfcEnvironmentalImpactValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Environmental Impact Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcEnvironmentalImpactValueImpl#getImpactType <em>Impact Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcEnvironmentalImpactValueImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcEnvironmentalImpactValueImpl#getUserDefinedCategory <em>User Defined Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcEnvironmentalImpactValue")
@XmlRootElement(name = "IfcEnvironmentalImpactValueElement")
public class IfcEnvironmentalImpactValueImpl extends IfcAppliedValueImpl implements IfcEnvironmentalImpactValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcEnvironmentalImpactValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcEnvironmentalImpactValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedCategory() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcEnvironmentalImpactValue_UserDefinedCategory(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedCategory(String newUserDefinedCategory) {
		eSet(IFC2X3Package.eINSTANCE.getIfcEnvironmentalImpactValue_UserDefinedCategory(), newUserDefinedCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedCategory() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcEnvironmentalImpactValue_UserDefinedCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedCategory() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcEnvironmentalImpactValue_UserDefinedCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEnvironmentalImpactCategoryEnum getCategory() {
		return (IfcEnvironmentalImpactCategoryEnum)eGet(IFC2X3Package.eINSTANCE.getIfcEnvironmentalImpactValue_Category(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(IfcEnvironmentalImpactCategoryEnum newCategory) {
		eSet(IFC2X3Package.eINSTANCE.getIfcEnvironmentalImpactValue_Category(), newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategory() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcEnvironmentalImpactValue_Category());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategory() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcEnvironmentalImpactValue_Category());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpactType() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcEnvironmentalImpactValue_ImpactType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpactType(String newImpactType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcEnvironmentalImpactValue_ImpactType(), newImpactType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImpactType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcEnvironmentalImpactValue_ImpactType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImpactType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcEnvironmentalImpactValue_ImpactType());
	}

} //IfcEnvironmentalImpactValueImpl
