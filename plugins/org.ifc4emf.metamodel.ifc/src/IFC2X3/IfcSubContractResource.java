/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcSubContractResourceImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Sub Contract Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSubContractResource#getSubContractor <em>Sub Contractor</em>}</li>
 *   <li>{@link IFC2X3.IfcSubContractResource#getJobDescription <em>Job Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSubContractResource()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSubContractResourceImplAdapter.class)
public interface IfcSubContractResource extends IfcConstructionResource {
	/**
	 * Returns the value of the '<em><b>Sub Contractor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Contractor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Contractor</em>' reference.
	 * @see #setSubContractor(IfcActorSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcSubContractResource_SubContractor()
	 * @model
	 * @generated
	 */
	IfcActorSelect getSubContractor();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSubContractResource#getSubContractor <em>Sub Contractor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Contractor</em>' reference.
	 * @see #getSubContractor()
	 * @generated
	 */
	void setSubContractor(IfcActorSelect value);

	/**
	 * Returns the value of the '<em><b>Job Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Description</em>' attribute.
	 * @see #isSetJobDescription()
	 * @see #unsetJobDescription()
	 * @see #setJobDescription(String)
	 * @see IFC2X3.IFC2X3Package#getIfcSubContractResource_JobDescription()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getJobDescription();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSubContractResource#getJobDescription <em>Job Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Description</em>' attribute.
	 * @see #isSetJobDescription()
	 * @see #unsetJobDescription()
	 * @see #getJobDescription()
	 * @generated
	 */
	void setJobDescription(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSubContractResource#getJobDescription <em>Job Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetJobDescription()
	 * @see #getJobDescription()
	 * @see #setJobDescription(String)
	 * @generated
	 */
	void unsetJobDescription();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSubContractResource#getJobDescription <em>Job Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Job Description</em>' attribute is set.
	 * @see #unsetJobDescription()
	 * @see #getJobDescription()
	 * @see #setJobDescription(String)
	 * @generated
	 */
	boolean isSetJobDescription();

} // IfcSubContractResource
