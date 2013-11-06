/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcClassificationReferenceImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Classification Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcClassificationReference#getReferencedSource <em>Referenced Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcClassificationReference()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcClassificationReferenceImplAdapter.class)
public interface IfcClassificationReference extends IfcClassificationNotationSelect, IfcExternalReference {
	/**
	 * Returns the value of the '<em><b>Referenced Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Source</em>' reference.
	 * @see #setReferencedSource(IfcClassification)
	 * @see IFC2X3.IFC2X3Package#getIfcClassificationReference_ReferencedSource()
	 * @model
	 * @generated
	 */
	IfcClassification getReferencedSource();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcClassificationReference#getReferencedSource <em>Referenced Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Source</em>' reference.
	 * @see #getReferencedSource()
	 * @generated
	 */
	void setReferencedSource(IfcClassification value);

} // IfcClassificationReference
