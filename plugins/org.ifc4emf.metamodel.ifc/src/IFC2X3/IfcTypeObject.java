/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcTypeObjectImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTypeObject#getApplicableOccurrence <em>Applicable Occurrence</em>}</li>
 *   <li>{@link IFC2X3.IfcTypeObject#getHasPropertySets <em>Has Property Sets</em>}</li>
 *   <li>{@link IFC2X3.IfcTypeObject#getObjectTypeOf <em>Object Type Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTypeObject()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcTypeObjectImplAdapter.class)
public interface IfcTypeObject extends IfcObjectDefinition {
	/**
	 * Returns the value of the '<em><b>Object Type Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelDefinesByType#getRelatingType <em>Relating Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Type Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type Of</em>' reference.
	 * @see #setObjectTypeOf(IfcRelDefinesByType)
	 * @see IFC2X3.IFC2X3Package#getIfcTypeObject_ObjectTypeOf()
	 * @see IFC2X3.IfcRelDefinesByType#getRelatingType
	 * @model opposite="RelatingType" ordered="false"
	 * @generated
	 */
	IfcRelDefinesByType getObjectTypeOf();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTypeObject#getObjectTypeOf <em>Object Type Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type Of</em>' reference.
	 * @see #getObjectTypeOf()
	 * @generated
	 */
	void setObjectTypeOf(IfcRelDefinesByType value);

	/**
	 * Returns the value of the '<em><b>Has Property Sets</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcPropertySetDefinition}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcPropertySetDefinition#getDefinesType <em>Defines Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Property Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Property Sets</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcTypeObject_HasPropertySets()
	 * @see IFC2X3.IfcPropertySetDefinition#getDefinesType
	 * @model opposite="DefinesType" ordered="false"
	 * @generated
	 */
	EList<IfcPropertySetDefinition> getHasPropertySets();

	/**
	 * Returns the value of the '<em><b>Applicable Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicable Occurrence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicable Occurrence</em>' attribute.
	 * @see #isSetApplicableOccurrence()
	 * @see #unsetApplicableOccurrence()
	 * @see #setApplicableOccurrence(String)
	 * @see IFC2X3.IFC2X3Package#getIfcTypeObject_ApplicableOccurrence()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getApplicableOccurrence();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTypeObject#getApplicableOccurrence <em>Applicable Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Occurrence</em>' attribute.
	 * @see #isSetApplicableOccurrence()
	 * @see #unsetApplicableOccurrence()
	 * @see #getApplicableOccurrence()
	 * @generated
	 */
	void setApplicableOccurrence(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTypeObject#getApplicableOccurrence <em>Applicable Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplicableOccurrence()
	 * @see #getApplicableOccurrence()
	 * @see #setApplicableOccurrence(String)
	 * @generated
	 */
	void unsetApplicableOccurrence();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTypeObject#getApplicableOccurrence <em>Applicable Occurrence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Applicable Occurrence</em>' attribute is set.
	 * @see #unsetApplicableOccurrence()
	 * @see #getApplicableOccurrence()
	 * @see #setApplicableOccurrence(String)
	 * @generated
	 */
	boolean isSetApplicableOccurrence();

} // IfcTypeObject
