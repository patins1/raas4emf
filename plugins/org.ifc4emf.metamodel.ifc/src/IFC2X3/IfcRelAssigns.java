/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcRelAssignsImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Assigns</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelAssigns#getRelatedObjects <em>Related Objects</em>}</li>
 *   <li>{@link IFC2X3.IfcRelAssigns#getRelatedObjectsType <em>Related Objects Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelAssigns()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelAssignsImplAdapter.class)
public interface IfcRelAssigns extends IfcRelationship {
	/**
	 * Returns the value of the '<em><b>Related Objects</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcObjectDefinition}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcObjectDefinition#getHasAssignments <em>Has Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Objects</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcRelAssigns_RelatedObjects()
	 * @see IFC2X3.IfcObjectDefinition#getHasAssignments
	 * @model opposite="HasAssignments" required="true" ordered="false"
	 * @generated
	 */
	EList<IfcObjectDefinition> getRelatedObjects();

	/**
	 * Returns the value of the '<em><b>Related Objects Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcObjectTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Objects Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Objects Type</em>' attribute.
	 * @see IFC2X3.IfcObjectTypeEnum
	 * @see #isSetRelatedObjectsType()
	 * @see #unsetRelatedObjectsType()
	 * @see #setRelatedObjectsType(IfcObjectTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcRelAssigns_RelatedObjectsType()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcObjectTypeEnum getRelatedObjectsType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelAssigns#getRelatedObjectsType <em>Related Objects Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Objects Type</em>' attribute.
	 * @see IFC2X3.IfcObjectTypeEnum
	 * @see #isSetRelatedObjectsType()
	 * @see #unsetRelatedObjectsType()
	 * @see #getRelatedObjectsType()
	 * @generated
	 */
	void setRelatedObjectsType(IfcObjectTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRelAssigns#getRelatedObjectsType <em>Related Objects Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelatedObjectsType()
	 * @see #getRelatedObjectsType()
	 * @see #setRelatedObjectsType(IfcObjectTypeEnum)
	 * @generated
	 */
	void unsetRelatedObjectsType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRelAssigns#getRelatedObjectsType <em>Related Objects Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Related Objects Type</em>' attribute is set.
	 * @see #unsetRelatedObjectsType()
	 * @see #getRelatedObjectsType()
	 * @see #setRelatedObjectsType(IfcObjectTypeEnum)
	 * @generated
	 */
	boolean isSetRelatedObjectsType();

} // IfcRelAssigns
