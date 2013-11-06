/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelAssociatesDocumentImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Associates Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelAssociatesDocument#getRelatingDocument <em>Relating Document</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelAssociatesDocument()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelAssociatesDocumentImplAdapter.class)
public interface IfcRelAssociatesDocument extends IfcRelAssociates {
	/**
	 * Returns the value of the '<em><b>Relating Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Document</em>' reference.
	 * @see #setRelatingDocument(IfcDocumentSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcRelAssociatesDocument_RelatingDocument()
	 * @model required="true"
	 * @generated
	 */
	IfcDocumentSelect getRelatingDocument();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelAssociatesDocument#getRelatingDocument <em>Relating Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Document</em>' reference.
	 * @see #getRelatingDocument()
	 * @generated
	 */
	void setRelatingDocument(IfcDocumentSelect value);

} // IfcRelAssociatesDocument
