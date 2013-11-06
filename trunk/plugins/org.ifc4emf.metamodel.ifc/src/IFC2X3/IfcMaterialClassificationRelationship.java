/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcMaterialClassificationRelationshipImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Material Classification Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcMaterialClassificationRelationship#getMaterialClassifications <em>Material Classifications</em>}</li>
 *   <li>{@link IFC2X3.IfcMaterialClassificationRelationship#getClassifiedMaterial <em>Classified Material</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcMaterialClassificationRelationship()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcMaterialClassificationRelationshipImplAdapter.class)
public interface IfcMaterialClassificationRelationship extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Material Classifications</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcClassificationNotationSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Classifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Classifications</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcMaterialClassificationRelationship_MaterialClassifications()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcClassificationNotationSelect> getMaterialClassifications();

	/**
	 * Returns the value of the '<em><b>Classified Material</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcMaterial#getClassifiedAs <em>Classified As</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classified Material</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classified Material</em>' reference.
	 * @see #setClassifiedMaterial(IfcMaterial)
	 * @see IFC2X3.IFC2X3Package#getIfcMaterialClassificationRelationship_ClassifiedMaterial()
	 * @see IFC2X3.IfcMaterial#getClassifiedAs
	 * @model opposite="ClassifiedAs" required="true"
	 * @generated
	 */
	IfcMaterial getClassifiedMaterial();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMaterialClassificationRelationship#getClassifiedMaterial <em>Classified Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classified Material</em>' reference.
	 * @see #getClassifiedMaterial()
	 * @generated
	 */
	void setClassifiedMaterial(IfcMaterial value);

} // IfcMaterialClassificationRelationship
