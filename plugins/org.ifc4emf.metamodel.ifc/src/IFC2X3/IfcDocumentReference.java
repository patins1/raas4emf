/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcDocumentReferenceImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Document Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcDocumentReference#getReferenceToDocument <em>Reference To Document</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcDocumentReference()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcDocumentReferenceImplAdapter.class)
public interface IfcDocumentReference extends IfcDocumentSelect, IfcExternalReference {
	/**
	 * Returns the value of the '<em><b>Reference To Document</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcDocumentInformation#getDocumentReferences <em>Document References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference To Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference To Document</em>' reference.
	 * @see #setReferenceToDocument(IfcDocumentInformation)
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentReference_ReferenceToDocument()
	 * @see IFC2X3.IfcDocumentInformation#getDocumentReferences
	 * @model opposite="DocumentReferences" ordered="false"
	 * @generated
	 */
	IfcDocumentInformation getReferenceToDocument();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDocumentReference#getReferenceToDocument <em>Reference To Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference To Document</em>' reference.
	 * @see #getReferenceToDocument()
	 * @generated
	 */
	void setReferenceToDocument(IfcDocumentInformation value);

} // IfcDocumentReference
