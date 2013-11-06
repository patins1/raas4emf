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

import IFC2X3.jaxb.IfcConstraintClassificationRelationshipImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Constraint Classification Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcConstraintClassificationRelationship#getClassifiedConstraint <em>Classified Constraint</em>}</li>
 *   <li>{@link IFC2X3.IfcConstraintClassificationRelationship#getRelatedClassifications <em>Related Classifications</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcConstraintClassificationRelationship()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcConstraintClassificationRelationshipImplAdapter.class)
public interface IfcConstraintClassificationRelationship extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Related Classifications</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcClassificationNotationSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Classifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Classifications</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcConstraintClassificationRelationship_RelatedClassifications()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcClassificationNotationSelect> getRelatedClassifications();

	/**
	 * Returns the value of the '<em><b>Classified Constraint</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcConstraint#getClassifiedAs <em>Classified As</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classified Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classified Constraint</em>' reference.
	 * @see #setClassifiedConstraint(IfcConstraint)
	 * @see IFC2X3.IFC2X3Package#getIfcConstraintClassificationRelationship_ClassifiedConstraint()
	 * @see IFC2X3.IfcConstraint#getClassifiedAs
	 * @model opposite="ClassifiedAs" required="true"
	 * @generated
	 */
	IfcConstraint getClassifiedConstraint();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConstraintClassificationRelationship#getClassifiedConstraint <em>Classified Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classified Constraint</em>' reference.
	 * @see #getClassifiedConstraint()
	 * @generated
	 */
	void setClassifiedConstraint(IfcConstraint value);

} // IfcConstraintClassificationRelationship
