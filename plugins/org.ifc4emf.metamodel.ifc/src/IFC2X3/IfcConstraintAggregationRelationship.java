/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcConstraintAggregationRelationshipImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Constraint Aggregation Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcConstraintAggregationRelationship#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.IfcConstraintAggregationRelationship#getDescription <em>Description</em>}</li>
 *   <li>{@link IFC2X3.IfcConstraintAggregationRelationship#getRelatingConstraint <em>Relating Constraint</em>}</li>
 *   <li>{@link IFC2X3.IfcConstraintAggregationRelationship#getRelatedConstraints <em>Related Constraints</em>}</li>
 *   <li>{@link IFC2X3.IfcConstraintAggregationRelationship#getLogicalAggregator <em>Logical Aggregator</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcConstraintAggregationRelationship()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcConstraintAggregationRelationshipImplAdapter.class)
public interface IfcConstraintAggregationRelationship extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Related Constraints</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcConstraint}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcConstraint#getIsAggregatedIn <em>Is Aggregated In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Constraints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Constraints</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcConstraintAggregationRelationship_RelatedConstraints()
	 * @see IFC2X3.IfcConstraint#getIsAggregatedIn
	 * @model opposite="IsAggregatedIn" required="true"
	 * @generated
	 */
	EList<IfcConstraint> getRelatedConstraints();

	/**
	 * Returns the value of the '<em><b>Relating Constraint</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcConstraint#getAggregates <em>Aggregates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Constraint</em>' reference.
	 * @see #setRelatingConstraint(IfcConstraint)
	 * @see IFC2X3.IFC2X3Package#getIfcConstraintAggregationRelationship_RelatingConstraint()
	 * @see IFC2X3.IfcConstraint#getAggregates
	 * @model opposite="Aggregates" required="true"
	 * @generated
	 */
	IfcConstraint getRelatingConstraint();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConstraintAggregationRelationship#getRelatingConstraint <em>Relating Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Constraint</em>' reference.
	 * @see #getRelatingConstraint()
	 * @generated
	 */
	void setRelatingConstraint(IfcConstraint value);

	/**
	 * Returns the value of the '<em><b>Logical Aggregator</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcLogicalOperatorEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Aggregator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Aggregator</em>' attribute.
	 * @see IFC2X3.IfcLogicalOperatorEnum
	 * @see #isSetLogicalAggregator()
	 * @see #unsetLogicalAggregator()
	 * @see #setLogicalAggregator(IfcLogicalOperatorEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcConstraintAggregationRelationship_LogicalAggregator()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcLogicalOperatorEnum getLogicalAggregator();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConstraintAggregationRelationship#getLogicalAggregator <em>Logical Aggregator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Aggregator</em>' attribute.
	 * @see IFC2X3.IfcLogicalOperatorEnum
	 * @see #isSetLogicalAggregator()
	 * @see #unsetLogicalAggregator()
	 * @see #getLogicalAggregator()
	 * @generated
	 */
	void setLogicalAggregator(IfcLogicalOperatorEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcConstraintAggregationRelationship#getLogicalAggregator <em>Logical Aggregator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLogicalAggregator()
	 * @see #getLogicalAggregator()
	 * @see #setLogicalAggregator(IfcLogicalOperatorEnum)
	 * @generated
	 */
	void unsetLogicalAggregator();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcConstraintAggregationRelationship#getLogicalAggregator <em>Logical Aggregator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Logical Aggregator</em>' attribute is set.
	 * @see #unsetLogicalAggregator()
	 * @see #getLogicalAggregator()
	 * @see #setLogicalAggregator(IfcLogicalOperatorEnum)
	 * @generated
	 */
	boolean isSetLogicalAggregator();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(String)
	 * @see IFC2X3.IFC2X3Package#getIfcConstraintAggregationRelationship_Description()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConstraintAggregationRelationship#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcConstraintAggregationRelationship#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcConstraintAggregationRelationship#getDescription <em>Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' attribute is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	boolean isSetDescription();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see IFC2X3.IFC2X3Package#getIfcConstraintAggregationRelationship_Name()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConstraintAggregationRelationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcConstraintAggregationRelationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcConstraintAggregationRelationship#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

} // IfcConstraintAggregationRelationship
