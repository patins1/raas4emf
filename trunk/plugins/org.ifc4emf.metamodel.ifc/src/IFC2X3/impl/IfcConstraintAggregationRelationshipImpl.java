/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcConstraint;
import IFC2X3.IfcConstraintAggregationRelationship;
import IFC2X3.IfcLogicalOperatorEnum;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Constraint Aggregation Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcConstraintAggregationRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConstraintAggregationRelationshipImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConstraintAggregationRelationshipImpl#getRelatingConstraint <em>Relating Constraint</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConstraintAggregationRelationshipImpl#getRelatedConstraints <em>Related Constraints</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConstraintAggregationRelationshipImpl#getLogicalAggregator <em>Logical Aggregator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcConstraintAggregationRelationship")
@XmlRootElement(name = "IfcConstraintAggregationRelationshipElement")
public class IfcConstraintAggregationRelationshipImpl extends CDOObjectImpl implements IfcConstraintAggregationRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConstraintAggregationRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcConstraintAggregationRelationship();
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
	public EList<IfcConstraint> getRelatedConstraints() {
		return (EList<IfcConstraint>)eGet(IFC2X3Package.eINSTANCE.getIfcConstraintAggregationRelationship_RelatedConstraints(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConstraint getRelatingConstraint() {
		return (IfcConstraint)eGet(IFC2X3Package.eINSTANCE.getIfcConstraintAggregationRelationship_RelatingConstraint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingConstraint(IfcConstraint newRelatingConstraint) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConstraintAggregationRelationship_RelatingConstraint(), newRelatingConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLogicalOperatorEnum getLogicalAggregator() {
		return (IfcLogicalOperatorEnum)eGet(IFC2X3Package.eINSTANCE.getIfcConstraintAggregationRelationship_LogicalAggregator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalAggregator(IfcLogicalOperatorEnum newLogicalAggregator) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConstraintAggregationRelationship_LogicalAggregator(), newLogicalAggregator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLogicalAggregator() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcConstraintAggregationRelationship_LogicalAggregator());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLogicalAggregator() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcConstraintAggregationRelationship_LogicalAggregator());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcConstraintAggregationRelationship_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConstraintAggregationRelationship_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcConstraintAggregationRelationship_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcConstraintAggregationRelationship_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcConstraintAggregationRelationship_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConstraintAggregationRelationship_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcConstraintAggregationRelationship_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcConstraintAggregationRelationship_Name());
	}

} //IfcConstraintAggregationRelationshipImpl
