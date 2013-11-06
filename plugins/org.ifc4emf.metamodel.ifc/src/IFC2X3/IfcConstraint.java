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

import IFC2X3.jaxb.IfcConstraintImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcConstraint#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.IfcConstraint#getDescription <em>Description</em>}</li>
 *   <li>{@link IFC2X3.IfcConstraint#getConstraintGrade <em>Constraint Grade</em>}</li>
 *   <li>{@link IFC2X3.IfcConstraint#getConstraintSource <em>Constraint Source</em>}</li>
 *   <li>{@link IFC2X3.IfcConstraint#getCreatingActor <em>Creating Actor</em>}</li>
 *   <li>{@link IFC2X3.IfcConstraint#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link IFC2X3.IfcConstraint#getUserDefinedGrade <em>User Defined Grade</em>}</li>
 *   <li>{@link IFC2X3.IfcConstraint#getClassifiedAs <em>Classified As</em>}</li>
 *   <li>{@link IFC2X3.IfcConstraint#getRelatesConstraints <em>Relates Constraints</em>}</li>
 *   <li>{@link IFC2X3.IfcConstraint#getIsRelatedWith <em>Is Related With</em>}</li>
 *   <li>{@link IFC2X3.IfcConstraint#getPropertiesForConstraint <em>Properties For Constraint</em>}</li>
 *   <li>{@link IFC2X3.IfcConstraint#getAggregates <em>Aggregates</em>}</li>
 *   <li>{@link IFC2X3.IfcConstraint#getIsAggregatedIn <em>Is Aggregated In</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcConstraint()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcConstraintImplAdapter.class)
public interface IfcConstraint extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Classified As</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcConstraintClassificationRelationship}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcConstraintClassificationRelationship#getClassifiedConstraint <em>Classified Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classified As</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classified As</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcConstraint_ClassifiedAs()
	 * @see IFC2X3.IfcConstraintClassificationRelationship#getClassifiedConstraint
	 * @model opposite="ClassifiedConstraint" ordered="false"
	 * @generated
	 */
	EList<IfcConstraintClassificationRelationship> getClassifiedAs();

	/**
	 * Returns the value of the '<em><b>Relates Constraints</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcConstraintRelationship}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcConstraintRelationship#getRelatingConstraint <em>Relating Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relates Constraints</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relates Constraints</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcConstraint_RelatesConstraints()
	 * @see IFC2X3.IfcConstraintRelationship#getRelatingConstraint
	 * @model opposite="RelatingConstraint" ordered="false"
	 * @generated
	 */
	EList<IfcConstraintRelationship> getRelatesConstraints();

	/**
	 * Returns the value of the '<em><b>Is Related With</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcConstraintRelationship}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcConstraintRelationship#getRelatedConstraints <em>Related Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Related With</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Related With</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcConstraint_IsRelatedWith()
	 * @see IFC2X3.IfcConstraintRelationship#getRelatedConstraints
	 * @model opposite="RelatedConstraints" ordered="false"
	 * @generated
	 */
	EList<IfcConstraintRelationship> getIsRelatedWith();

	/**
	 * Returns the value of the '<em><b>Properties For Constraint</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcPropertyConstraintRelationship}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcPropertyConstraintRelationship#getRelatingConstraint <em>Relating Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties For Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties For Constraint</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcConstraint_PropertiesForConstraint()
	 * @see IFC2X3.IfcPropertyConstraintRelationship#getRelatingConstraint
	 * @model opposite="RelatingConstraint" ordered="false"
	 * @generated
	 */
	EList<IfcPropertyConstraintRelationship> getPropertiesForConstraint();

	/**
	 * Returns the value of the '<em><b>Aggregates</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcConstraintAggregationRelationship}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcConstraintAggregationRelationship#getRelatingConstraint <em>Relating Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregates</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcConstraint_Aggregates()
	 * @see IFC2X3.IfcConstraintAggregationRelationship#getRelatingConstraint
	 * @model opposite="RelatingConstraint" ordered="false"
	 * @generated
	 */
	EList<IfcConstraintAggregationRelationship> getAggregates();

	/**
	 * Returns the value of the '<em><b>Is Aggregated In</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcConstraintAggregationRelationship}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcConstraintAggregationRelationship#getRelatedConstraints <em>Related Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Aggregated In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Aggregated In</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcConstraint_IsAggregatedIn()
	 * @see IFC2X3.IfcConstraintAggregationRelationship#getRelatedConstraints
	 * @model opposite="RelatedConstraints" ordered="false"
	 * @generated
	 */
	EList<IfcConstraintAggregationRelationship> getIsAggregatedIn();

	/**
	 * Returns the value of the '<em><b>Creation Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Time</em>' reference.
	 * @see #setCreationTime(IfcDateTimeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcConstraint_CreationTime()
	 * @model
	 * @generated
	 */
	IfcDateTimeSelect getCreationTime();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConstraint#getCreationTime <em>Creation Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Time</em>' reference.
	 * @see #getCreationTime()
	 * @generated
	 */
	void setCreationTime(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>Creating Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creating Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creating Actor</em>' reference.
	 * @see #setCreatingActor(IfcActorSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcConstraint_CreatingActor()
	 * @model
	 * @generated
	 */
	IfcActorSelect getCreatingActor();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConstraint#getCreatingActor <em>Creating Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creating Actor</em>' reference.
	 * @see #getCreatingActor()
	 * @generated
	 */
	void setCreatingActor(IfcActorSelect value);

	/**
	 * Returns the value of the '<em><b>User Defined Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Grade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Grade</em>' attribute.
	 * @see #isSetUserDefinedGrade()
	 * @see #unsetUserDefinedGrade()
	 * @see #setUserDefinedGrade(String)
	 * @see IFC2X3.IFC2X3Package#getIfcConstraint_UserDefinedGrade()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getUserDefinedGrade();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConstraint#getUserDefinedGrade <em>User Defined Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Grade</em>' attribute.
	 * @see #isSetUserDefinedGrade()
	 * @see #unsetUserDefinedGrade()
	 * @see #getUserDefinedGrade()
	 * @generated
	 */
	void setUserDefinedGrade(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcConstraint#getUserDefinedGrade <em>User Defined Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedGrade()
	 * @see #getUserDefinedGrade()
	 * @see #setUserDefinedGrade(String)
	 * @generated
	 */
	void unsetUserDefinedGrade();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcConstraint#getUserDefinedGrade <em>User Defined Grade</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Grade</em>' attribute is set.
	 * @see #unsetUserDefinedGrade()
	 * @see #getUserDefinedGrade()
	 * @see #setUserDefinedGrade(String)
	 * @generated
	 */
	boolean isSetUserDefinedGrade();

	/**
	 * Returns the value of the '<em><b>Constraint Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Source</em>' attribute.
	 * @see #isSetConstraintSource()
	 * @see #unsetConstraintSource()
	 * @see #setConstraintSource(String)
	 * @see IFC2X3.IFC2X3Package#getIfcConstraint_ConstraintSource()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getConstraintSource();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConstraint#getConstraintSource <em>Constraint Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Source</em>' attribute.
	 * @see #isSetConstraintSource()
	 * @see #unsetConstraintSource()
	 * @see #getConstraintSource()
	 * @generated
	 */
	void setConstraintSource(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcConstraint#getConstraintSource <em>Constraint Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConstraintSource()
	 * @see #getConstraintSource()
	 * @see #setConstraintSource(String)
	 * @generated
	 */
	void unsetConstraintSource();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcConstraint#getConstraintSource <em>Constraint Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Constraint Source</em>' attribute is set.
	 * @see #unsetConstraintSource()
	 * @see #getConstraintSource()
	 * @see #setConstraintSource(String)
	 * @generated
	 */
	boolean isSetConstraintSource();

	/**
	 * Returns the value of the '<em><b>Constraint Grade</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcConstraintEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Grade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Grade</em>' attribute.
	 * @see IFC2X3.IfcConstraintEnum
	 * @see #isSetConstraintGrade()
	 * @see #unsetConstraintGrade()
	 * @see #setConstraintGrade(IfcConstraintEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcConstraint_ConstraintGrade()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcConstraintEnum getConstraintGrade();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConstraint#getConstraintGrade <em>Constraint Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Grade</em>' attribute.
	 * @see IFC2X3.IfcConstraintEnum
	 * @see #isSetConstraintGrade()
	 * @see #unsetConstraintGrade()
	 * @see #getConstraintGrade()
	 * @generated
	 */
	void setConstraintGrade(IfcConstraintEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcConstraint#getConstraintGrade <em>Constraint Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConstraintGrade()
	 * @see #getConstraintGrade()
	 * @see #setConstraintGrade(IfcConstraintEnum)
	 * @generated
	 */
	void unsetConstraintGrade();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcConstraint#getConstraintGrade <em>Constraint Grade</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Constraint Grade</em>' attribute is set.
	 * @see #unsetConstraintGrade()
	 * @see #getConstraintGrade()
	 * @see #setConstraintGrade(IfcConstraintEnum)
	 * @generated
	 */
	boolean isSetConstraintGrade();

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
	 * @see IFC2X3.IFC2X3Package#getIfcConstraint_Description()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConstraint#getDescription <em>Description</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcConstraint#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcConstraint#getDescription <em>Description</em>}' attribute is set.
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
	 * @see IFC2X3.IFC2X3Package#getIfcConstraint_Name()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConstraint#getName <em>Name</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcConstraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcConstraint#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

} // IfcConstraint
