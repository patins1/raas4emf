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
import IFC2X3.IfcActorSelect;
import IFC2X3.IfcConstraint;
import IFC2X3.IfcConstraintAggregationRelationship;
import IFC2X3.IfcConstraintClassificationRelationship;
import IFC2X3.IfcConstraintEnum;
import IFC2X3.IfcConstraintRelationship;
import IFC2X3.IfcDateTimeSelect;
import IFC2X3.IfcPropertyConstraintRelationship;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConstraintImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConstraintImpl#getConstraintGrade <em>Constraint Grade</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConstraintImpl#getConstraintSource <em>Constraint Source</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConstraintImpl#getCreatingActor <em>Creating Actor</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConstraintImpl#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConstraintImpl#getUserDefinedGrade <em>User Defined Grade</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConstraintImpl#getClassifiedAs <em>Classified As</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConstraintImpl#getRelatesConstraints <em>Relates Constraints</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConstraintImpl#getIsRelatedWith <em>Is Related With</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConstraintImpl#getPropertiesForConstraint <em>Properties For Constraint</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConstraintImpl#getAggregates <em>Aggregates</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConstraintImpl#getIsAggregatedIn <em>Is Aggregated In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcConstraint")
@XmlSeeAlso({ IfcObjectiveImpl.class, IfcMetricImpl.class })
@XmlRootElement(name = "IfcConstraintElement")
public class IfcConstraintImpl extends CDOObjectImpl implements IfcConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcConstraint();
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
	@SuppressWarnings("unchecked")
	public EList<IfcConstraintClassificationRelationship> getClassifiedAs() {
		return (EList<IfcConstraintClassificationRelationship>)eGet(IFC2X3Package.eINSTANCE.getIfcConstraint_ClassifiedAs(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcConstraintRelationship> getRelatesConstraints() {
		return (EList<IfcConstraintRelationship>)eGet(IFC2X3Package.eINSTANCE.getIfcConstraint_RelatesConstraints(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcConstraintRelationship> getIsRelatedWith() {
		return (EList<IfcConstraintRelationship>)eGet(IFC2X3Package.eINSTANCE.getIfcConstraint_IsRelatedWith(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcPropertyConstraintRelationship> getPropertiesForConstraint() {
		return (EList<IfcPropertyConstraintRelationship>)eGet(IFC2X3Package.eINSTANCE.getIfcConstraint_PropertiesForConstraint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcConstraintAggregationRelationship> getAggregates() {
		return (EList<IfcConstraintAggregationRelationship>)eGet(IFC2X3Package.eINSTANCE.getIfcConstraint_Aggregates(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcConstraintAggregationRelationship> getIsAggregatedIn() {
		return (EList<IfcConstraintAggregationRelationship>)eGet(IFC2X3Package.eINSTANCE.getIfcConstraint_IsAggregatedIn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getCreationTime() {
		return (IfcDateTimeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcConstraint_CreationTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationTime(IfcDateTimeSelect newCreationTime) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConstraint_CreationTime(), newCreationTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect getCreatingActor() {
		return (IfcActorSelect)eGet(IFC2X3Package.eINSTANCE.getIfcConstraint_CreatingActor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatingActor(IfcActorSelect newCreatingActor) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConstraint_CreatingActor(), newCreatingActor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedGrade() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcConstraint_UserDefinedGrade(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedGrade(String newUserDefinedGrade) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConstraint_UserDefinedGrade(), newUserDefinedGrade);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedGrade() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcConstraint_UserDefinedGrade());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedGrade() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcConstraint_UserDefinedGrade());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraintSource() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcConstraint_ConstraintSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintSource(String newConstraintSource) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConstraint_ConstraintSource(), newConstraintSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConstraintSource() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcConstraint_ConstraintSource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstraintSource() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcConstraint_ConstraintSource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConstraintEnum getConstraintGrade() {
		return (IfcConstraintEnum)eGet(IFC2X3Package.eINSTANCE.getIfcConstraint_ConstraintGrade(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintGrade(IfcConstraintEnum newConstraintGrade) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConstraint_ConstraintGrade(), newConstraintGrade);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConstraintGrade() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcConstraint_ConstraintGrade());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstraintGrade() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcConstraint_ConstraintGrade());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcConstraint_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConstraint_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcConstraint_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcConstraint_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcConstraint_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConstraint_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcConstraint_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcConstraint_Name());
	}

} //IfcConstraintImpl
