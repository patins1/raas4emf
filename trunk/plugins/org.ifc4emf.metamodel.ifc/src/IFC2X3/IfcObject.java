/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcObjectImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcObject#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link IFC2X3.IfcObject#getIsDefinedBy <em>Is Defined By</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcObject()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcObjectImplAdapter.class)
public interface IfcObject extends IfcObjectDefinition {
	/**
	 * Returns the value of the '<em><b>Is Defined By</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelDefines}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelDefines#getRelatedObjects <em>Related Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Defined By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Defined By</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcObject_IsDefinedBy()
	 * @see IFC2X3.IfcRelDefines#getRelatedObjects
	 * @model opposite="RelatedObjects" ordered="false"
	 * @generated
	 */
	EList<IfcRelDefines> getIsDefinedBy();

	/**
	 * Returns the value of the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type</em>' attribute.
	 * @see #isSetObjectType()
	 * @see #unsetObjectType()
	 * @see #setObjectType(String)
	 * @see IFC2X3.IFC2X3Package#getIfcObject_ObjectType()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getObjectType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcObject#getObjectType <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type</em>' attribute.
	 * @see #isSetObjectType()
	 * @see #unsetObjectType()
	 * @see #getObjectType()
	 * @generated
	 */
	void setObjectType(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcObject#getObjectType <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObjectType()
	 * @see #getObjectType()
	 * @see #setObjectType(String)
	 * @generated
	 */
	void unsetObjectType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcObject#getObjectType <em>Object Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Object Type</em>' attribute is set.
	 * @see #unsetObjectType()
	 * @see #getObjectType()
	 * @see #setObjectType(String)
	 * @generated
	 */
	boolean isSetObjectType();

} // IfcObject
