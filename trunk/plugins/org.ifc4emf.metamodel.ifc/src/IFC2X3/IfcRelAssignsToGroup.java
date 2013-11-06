/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelAssignsToGroupImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Assigns To Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelAssignsToGroup#getRelatingGroup <em>Relating Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelAssignsToGroup()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelAssignsToGroupImplAdapter.class)
public interface IfcRelAssignsToGroup extends IfcRelAssigns {
	/**
	 * Returns the value of the '<em><b>Relating Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcGroup#getIsGroupedBy <em>Is Grouped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Group</em>' reference.
	 * @see #setRelatingGroup(IfcGroup)
	 * @see IFC2X3.IFC2X3Package#getIfcRelAssignsToGroup_RelatingGroup()
	 * @see IFC2X3.IfcGroup#getIsGroupedBy
	 * @model opposite="IsGroupedBy" required="true"
	 * @generated
	 */
	IfcGroup getRelatingGroup();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelAssignsToGroup#getRelatingGroup <em>Relating Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Group</em>' reference.
	 * @see #getRelatingGroup()
	 * @generated
	 */
	void setRelatingGroup(IfcGroup value);

} // IfcRelAssignsToGroup
