/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcApplicationImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcApplication#getApplicationDeveloper <em>Application Developer</em>}</li>
 *   <li>{@link IFC2X3.IfcApplication#getVersion <em>Version</em>}</li>
 *   <li>{@link IFC2X3.IfcApplication#getApplicationFullName <em>Application Full Name</em>}</li>
 *   <li>{@link IFC2X3.IfcApplication#getApplicationIdentifier <em>Application Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcApplication()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcApplicationImplAdapter.class)
public interface IfcApplication extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Application Developer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Developer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Developer</em>' reference.
	 * @see #setApplicationDeveloper(IfcOrganization)
	 * @see IFC2X3.IFC2X3Package#getIfcApplication_ApplicationDeveloper()
	 * @model required="true"
	 * @generated
	 */
	IfcOrganization getApplicationDeveloper();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcApplication#getApplicationDeveloper <em>Application Developer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Developer</em>' reference.
	 * @see #getApplicationDeveloper()
	 * @generated
	 */
	void setApplicationDeveloper(IfcOrganization value);

	/**
	 * Returns the value of the '<em><b>Application Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Identifier</em>' attribute.
	 * @see #isSetApplicationIdentifier()
	 * @see #unsetApplicationIdentifier()
	 * @see #setApplicationIdentifier(String)
	 * @see IFC2X3.IFC2X3Package#getIfcApplication_ApplicationIdentifier()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getApplicationIdentifier();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcApplication#getApplicationIdentifier <em>Application Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Identifier</em>' attribute.
	 * @see #isSetApplicationIdentifier()
	 * @see #unsetApplicationIdentifier()
	 * @see #getApplicationIdentifier()
	 * @generated
	 */
	void setApplicationIdentifier(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcApplication#getApplicationIdentifier <em>Application Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplicationIdentifier()
	 * @see #getApplicationIdentifier()
	 * @see #setApplicationIdentifier(String)
	 * @generated
	 */
	void unsetApplicationIdentifier();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcApplication#getApplicationIdentifier <em>Application Identifier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Application Identifier</em>' attribute is set.
	 * @see #unsetApplicationIdentifier()
	 * @see #getApplicationIdentifier()
	 * @see #setApplicationIdentifier(String)
	 * @generated
	 */
	boolean isSetApplicationIdentifier();

	/**
	 * Returns the value of the '<em><b>Application Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Full Name</em>' attribute.
	 * @see #isSetApplicationFullName()
	 * @see #unsetApplicationFullName()
	 * @see #setApplicationFullName(String)
	 * @see IFC2X3.IFC2X3Package#getIfcApplication_ApplicationFullName()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getApplicationFullName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcApplication#getApplicationFullName <em>Application Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Full Name</em>' attribute.
	 * @see #isSetApplicationFullName()
	 * @see #unsetApplicationFullName()
	 * @see #getApplicationFullName()
	 * @generated
	 */
	void setApplicationFullName(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcApplication#getApplicationFullName <em>Application Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplicationFullName()
	 * @see #getApplicationFullName()
	 * @see #setApplicationFullName(String)
	 * @generated
	 */
	void unsetApplicationFullName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcApplication#getApplicationFullName <em>Application Full Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Application Full Name</em>' attribute is set.
	 * @see #unsetApplicationFullName()
	 * @see #getApplicationFullName()
	 * @see #setApplicationFullName(String)
	 * @generated
	 */
	boolean isSetApplicationFullName();

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
	 * @see IFC2X3.IFC2X3Package#getIfcApplication_Version()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcApplication#getVersion <em>Version</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcApplication#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcApplication#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	boolean isSetVersion();

} // IfcApplication
