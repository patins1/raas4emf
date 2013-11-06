/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcLibraryInformationImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Library Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcLibraryInformation#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.IfcLibraryInformation#getVersion <em>Version</em>}</li>
 *   <li>{@link IFC2X3.IfcLibraryInformation#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link IFC2X3.IfcLibraryInformation#getVersionDate <em>Version Date</em>}</li>
 *   <li>{@link IFC2X3.IfcLibraryInformation#getLibraryReference <em>Library Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcLibraryInformation()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcLibraryInformationImplAdapter.class)
public interface IfcLibraryInformation extends IfcLibrarySelect {
	/**
	 * Returns the value of the '<em><b>Library Reference</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcLibraryReference}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcLibraryReference#getReferenceIntoLibrary <em>Reference Into Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Reference</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcLibraryInformation_LibraryReference()
	 * @see IFC2X3.IfcLibraryReference#getReferenceIntoLibrary
	 * @model opposite="ReferenceIntoLibrary" ordered="false"
	 * @generated
	 */
	EList<IfcLibraryReference> getLibraryReference();

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' reference.
	 * @see #setPublisher(IfcOrganization)
	 * @see IFC2X3.IFC2X3Package#getIfcLibraryInformation_Publisher()
	 * @model
	 * @generated
	 */
	IfcOrganization getPublisher();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLibraryInformation#getPublisher <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(IfcOrganization value);

	/**
	 * Returns the value of the '<em><b>Version Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Date</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Date</em>' reference.
	 * @see #setVersionDate(IfcCalendarDate)
	 * @see IFC2X3.IFC2X3Package#getIfcLibraryInformation_VersionDate()
	 * @model
	 * @generated
	 */
	IfcCalendarDate getVersionDate();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLibraryInformation#getVersionDate <em>Version Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Date</em>' reference.
	 * @see #getVersionDate()
	 * @generated
	 */
	void setVersionDate(IfcCalendarDate value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(String)
	 * @see IFC2X3.IFC2X3Package#getIfcLibraryInformation_Version()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLibraryInformation#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcLibraryInformation#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLibraryInformation#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	boolean isSetVersion();

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
	 * @see IFC2X3.IFC2X3Package#getIfcLibraryInformation_Name()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLibraryInformation#getName <em>Name</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcLibraryInformation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLibraryInformation#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

} // IfcLibraryInformation
