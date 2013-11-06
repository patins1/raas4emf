/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcObjectDefinitionImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Object Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcObjectDefinition#getHasAssignments <em>Has Assignments</em>}</li>
 *   <li>{@link IFC2X3.IfcObjectDefinition#getIsDecomposedBy <em>Is Decomposed By</em>}</li>
 *   <li>{@link IFC2X3.IfcObjectDefinition#getDecomposes <em>Decomposes</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcObjectDefinition()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcObjectDefinitionImplAdapter.class)
public interface IfcObjectDefinition extends IfcRoot {
	/**
	 * Returns the value of the '<em><b>Has Assignments</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelAssigns}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelAssigns#getRelatedObjects <em>Related Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Assignments</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Assignments</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcObjectDefinition_HasAssignments()
	 * @see IFC2X3.IfcRelAssigns#getRelatedObjects
	 * @model opposite="RelatedObjects" ordered="false"
	 * @generated
	 */
	EList<IfcRelAssigns> getHasAssignments();

	/**
	 * Returns the value of the '<em><b>Is Decomposed By</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelDecomposes}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelDecomposes#getRelatingObject <em>Relating Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Decomposed By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Decomposed By</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcObjectDefinition_IsDecomposedBy()
	 * @see IFC2X3.IfcRelDecomposes#getRelatingObject
	 * @model opposite="RelatingObject" ordered="false"
	 * @generated
	 */
	EList<IfcRelDecomposes> getIsDecomposedBy();

	/**
	 * Returns the value of the '<em><b>Decomposes</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelDecomposes#getRelatedObjects <em>Related Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposes</em>' reference.
	 * @see #setDecomposes(IfcRelDecomposes)
	 * @see IFC2X3.IFC2X3Package#getIfcObjectDefinition_Decomposes()
	 * @see IFC2X3.IfcRelDecomposes#getRelatedObjects
	 * @model opposite="RelatedObjects" ordered="false"
	 * @generated
	 */
	IfcRelDecomposes getDecomposes();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcObjectDefinition#getDecomposes <em>Decomposes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposes</em>' reference.
	 * @see #getDecomposes()
	 * @generated
	 */
	void setDecomposes(IfcRelDecomposes value);

} // IfcObjectDefinition
