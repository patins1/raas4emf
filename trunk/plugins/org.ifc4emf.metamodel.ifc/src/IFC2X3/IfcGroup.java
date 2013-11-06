/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcGroupImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcGroup#getIsGroupedBy <em>Is Grouped By</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcGroup()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcGroupImplAdapter.class)
public interface IfcGroup extends IfcObject {
	/**
	 * Returns the value of the '<em><b>Is Grouped By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelAssignsToGroup#getRelatingGroup <em>Relating Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Grouped By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Grouped By</em>' reference.
	 * @see #setIsGroupedBy(IfcRelAssignsToGroup)
	 * @see IFC2X3.IFC2X3Package#getIfcGroup_IsGroupedBy()
	 * @see IFC2X3.IfcRelAssignsToGroup#getRelatingGroup
	 * @model opposite="RelatingGroup" required="true"
	 * @generated
	 */
	IfcRelAssignsToGroup getIsGroupedBy();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGroup#getIsGroupedBy <em>Is Grouped By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Grouped By</em>' reference.
	 * @see #getIsGroupedBy()
	 * @generated
	 */
	void setIsGroupedBy(IfcRelAssignsToGroup value);

} // IfcGroup
