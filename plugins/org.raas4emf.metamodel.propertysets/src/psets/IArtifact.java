/**
 */
package psets;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IArtifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link psets.IArtifact#getPropertySets <em>Property Sets</em>}</li>
 *   <li>{@link psets.IArtifact#getTemplateType <em>Template Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see psets.PsetsPackage#getIArtifact()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface IArtifact extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Property Sets</b></em>' containment reference list.
	 * The list contents are of type {@link psets.IPropertySet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Sets</em>' containment reference list.
	 * @see psets.PsetsPackage#getIArtifact_PropertySets()
	 * @model containment="true"
	 * @generated
	 */
	EList<IPropertySet> getPropertySets();

	/**
	 * Returns the value of the '<em><b>Template Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Type</em>' attribute.
	 * @see #setTemplateType(String)
	 * @see psets.PsetsPackage#getIArtifact_TemplateType()
	 * @model
	 * @generated
	 */
	String getTemplateType();

	/**
	 * Sets the value of the '{@link psets.IArtifact#getTemplateType <em>Template Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Type</em>' attribute.
	 * @see #getTemplateType()
	 * @generated
	 */
	void setTemplateType(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IPropertySet createPropertySet(String psetName);

} // IArtifact
