/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelDefinesByTypeImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Defines By Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelDefinesByType#getRelatingType <em>Relating Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelDefinesByType()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelDefinesByTypeImplAdapter.class)
public interface IfcRelDefinesByType extends IfcRelDefines {
	/**
	 * Returns the value of the '<em><b>Relating Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcTypeObject#getObjectTypeOf <em>Object Type Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Type</em>' reference.
	 * @see #setRelatingType(IfcTypeObject)
	 * @see IFC2X3.IFC2X3Package#getIfcRelDefinesByType_RelatingType()
	 * @see IFC2X3.IfcTypeObject#getObjectTypeOf
	 * @model opposite="ObjectTypeOf" required="true"
	 * @generated
	 */
	IfcTypeObject getRelatingType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelDefinesByType#getRelatingType <em>Relating Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Type</em>' reference.
	 * @see #getRelatingType()
	 * @generated
	 */
	void setRelatingType(IfcTypeObject value);

} // IfcRelDefinesByType
