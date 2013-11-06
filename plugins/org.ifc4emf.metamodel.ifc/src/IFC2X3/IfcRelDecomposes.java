/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcRelDecomposesImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Decomposes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelDecomposes#getRelatingObject <em>Relating Object</em>}</li>
 *   <li>{@link IFC2X3.IfcRelDecomposes#getRelatedObjects <em>Related Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelDecomposes()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelDecomposesImplAdapter.class)
public interface IfcRelDecomposes extends IfcRelationship {
	/**
	 * Returns the value of the '<em><b>Relating Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcObjectDefinition#getIsDecomposedBy <em>Is Decomposed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Object</em>' reference.
	 * @see #setRelatingObject(IfcObjectDefinition)
	 * @see IFC2X3.IFC2X3Package#getIfcRelDecomposes_RelatingObject()
	 * @see IFC2X3.IfcObjectDefinition#getIsDecomposedBy
	 * @model opposite="IsDecomposedBy" required="true"
	 * @generated
	 */
	IfcObjectDefinition getRelatingObject();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelDecomposes#getRelatingObject <em>Relating Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Object</em>' reference.
	 * @see #getRelatingObject()
	 * @generated
	 */
	void setRelatingObject(IfcObjectDefinition value);

	/**
	 * Returns the value of the '<em><b>Related Objects</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcObjectDefinition}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcObjectDefinition#getDecomposes <em>Decomposes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Objects</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcRelDecomposes_RelatedObjects()
	 * @see IFC2X3.IfcObjectDefinition#getDecomposes
	 * @model opposite="Decomposes" required="true" ordered="false"
	 * @generated
	 */
	EList<IfcObjectDefinition> getRelatedObjects();

} // IfcRelDecomposes
