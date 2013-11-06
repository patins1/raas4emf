/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelAssignsToResourceImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Assigns To Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelAssignsToResource#getRelatingResource <em>Relating Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelAssignsToResource()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelAssignsToResourceImplAdapter.class)
public interface IfcRelAssignsToResource extends IfcRelAssigns {
	/**
	 * Returns the value of the '<em><b>Relating Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcResource#getResourceOf <em>Resource Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Resource</em>' reference.
	 * @see #setRelatingResource(IfcResource)
	 * @see IFC2X3.IFC2X3Package#getIfcRelAssignsToResource_RelatingResource()
	 * @see IFC2X3.IfcResource#getResourceOf
	 * @model opposite="ResourceOf" required="true"
	 * @generated
	 */
	IfcResource getRelatingResource();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelAssignsToResource#getRelatingResource <em>Relating Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Resource</em>' reference.
	 * @see #getRelatingResource()
	 * @generated
	 */
	void setRelatingResource(IfcResource value);

} // IfcRelAssignsToResource
