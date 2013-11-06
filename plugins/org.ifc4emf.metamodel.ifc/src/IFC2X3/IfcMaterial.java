/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcMaterialImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcMaterial#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.IfcMaterial#getHasRepresentation <em>Has Representation</em>}</li>
 *   <li>{@link IFC2X3.IfcMaterial#getClassifiedAs <em>Classified As</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcMaterial()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcMaterialImplAdapter.class)
public interface IfcMaterial extends IfcMaterialSelect, IfcObjectReferenceSelect {
	/**
	 * Returns the value of the '<em><b>Has Representation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcMaterialDefinitionRepresentation#getRepresentedMaterial <em>Represented Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Representation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Representation</em>' reference.
	 * @see #setHasRepresentation(IfcMaterialDefinitionRepresentation)
	 * @see IFC2X3.IFC2X3Package#getIfcMaterial_HasRepresentation()
	 * @see IFC2X3.IfcMaterialDefinitionRepresentation#getRepresentedMaterial
	 * @model opposite="RepresentedMaterial" ordered="false"
	 * @generated
	 */
	IfcMaterialDefinitionRepresentation getHasRepresentation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMaterial#getHasRepresentation <em>Has Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Representation</em>' reference.
	 * @see #getHasRepresentation()
	 * @generated
	 */
	void setHasRepresentation(IfcMaterialDefinitionRepresentation value);

	/**
	 * Returns the value of the '<em><b>Classified As</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcMaterialClassificationRelationship#getClassifiedMaterial <em>Classified Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classified As</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classified As</em>' reference.
	 * @see #setClassifiedAs(IfcMaterialClassificationRelationship)
	 * @see IFC2X3.IFC2X3Package#getIfcMaterial_ClassifiedAs()
	 * @see IFC2X3.IfcMaterialClassificationRelationship#getClassifiedMaterial
	 * @model opposite="ClassifiedMaterial" ordered="false"
	 * @generated
	 */
	IfcMaterialClassificationRelationship getClassifiedAs();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMaterial#getClassifiedAs <em>Classified As</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classified As</em>' reference.
	 * @see #getClassifiedAs()
	 * @generated
	 */
	void setClassifiedAs(IfcMaterialClassificationRelationship value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see IFC2X3.IFC2X3Package#getIfcMaterial_Name()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMaterial#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMaterial#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMaterial#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

} // IfcMaterial
