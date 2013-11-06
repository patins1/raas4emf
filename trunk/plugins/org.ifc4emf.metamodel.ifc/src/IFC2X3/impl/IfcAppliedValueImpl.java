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
import IFC2X3.IfcAppliedValue;
import IFC2X3.IfcAppliedValueRelationship;
import IFC2X3.IfcAppliedValueSelect;
import IFC2X3.IfcDateTimeSelect;
import IFC2X3.IfcMeasureWithUnit;
import IFC2X3.IfcReferencesValueDocument;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Applied Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcAppliedValueImpl#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAppliedValueImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAppliedValueImpl#getAppliedValue <em>Applied Value</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAppliedValueImpl#getUnitBasis <em>Unit Basis</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAppliedValueImpl#getApplicableDate <em>Applicable Date</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAppliedValueImpl#getFixedUntilDate <em>Fixed Until Date</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAppliedValueImpl#getValuesReferenced <em>Values Referenced</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAppliedValueImpl#getValueOfComponents <em>Value Of Components</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAppliedValueImpl#getIsComponentIn <em>Is Component In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcAppliedValue")
@XmlSeeAlso({ IfcCostValueImpl.class, IfcEnvironmentalImpactValueImpl.class })
@XmlRootElement(name = "IfcAppliedValueElement")
public class IfcAppliedValueImpl extends IfcObjectReferenceSelectImpl implements IfcAppliedValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcAppliedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcAppliedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAppliedValueSelect getAppliedValue() {
		return (IfcAppliedValueSelect)eGet(IFC2X3Package.eINSTANCE.getIfcAppliedValue_AppliedValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedValue(IfcAppliedValueSelect newAppliedValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAppliedValue_AppliedValue(), newAppliedValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcReferencesValueDocument> getValuesReferenced() {
		return (EList<IfcReferencesValueDocument>)eGet(IFC2X3Package.eINSTANCE.getIfcAppliedValue_ValuesReferenced(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcAppliedValueRelationship> getValueOfComponents() {
		return (EList<IfcAppliedValueRelationship>)eGet(IFC2X3Package.eINSTANCE.getIfcAppliedValue_ValueOfComponents(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcAppliedValueRelationship> getIsComponentIn() {
		return (EList<IfcAppliedValueRelationship>)eGet(IFC2X3Package.eINSTANCE.getIfcAppliedValue_IsComponentIn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getFixedUntilDate() {
		return (IfcDateTimeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcAppliedValue_FixedUntilDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedUntilDate(IfcDateTimeSelect newFixedUntilDate) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAppliedValue_FixedUntilDate(), newFixedUntilDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getApplicableDate() {
		return (IfcDateTimeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcAppliedValue_ApplicableDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableDate(IfcDateTimeSelect newApplicableDate) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAppliedValue_ApplicableDate(), newApplicableDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureWithUnit getUnitBasis() {
		return (IfcMeasureWithUnit)eGet(IFC2X3Package.eINSTANCE.getIfcAppliedValue_UnitBasis(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitBasis(IfcMeasureWithUnit newUnitBasis) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAppliedValue_UnitBasis(), newUnitBasis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcAppliedValue_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAppliedValue_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcAppliedValue_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcAppliedValue_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcAppliedValue_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAppliedValue_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcAppliedValue_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcAppliedValue_Name());
	}

} //IfcAppliedValueImpl
