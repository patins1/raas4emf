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

import IFC2X3.jaxb.IfcDocumentElectronicFormatImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Document Electronic Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcDocumentElectronicFormat#getFileExtension <em>File Extension</em>}</li>
 *   <li>{@link IFC2X3.IfcDocumentElectronicFormat#getMimeContentType <em>Mime Content Type</em>}</li>
 *   <li>{@link IFC2X3.IfcDocumentElectronicFormat#getMimeSubtype <em>Mime Subtype</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcDocumentElectronicFormat()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcDocumentElectronicFormatImplAdapter.class)
public interface IfcDocumentElectronicFormat extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Mime Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Subtype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Subtype</em>' attribute.
	 * @see #isSetMimeSubtype()
	 * @see #unsetMimeSubtype()
	 * @see #setMimeSubtype(String)
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentElectronicFormat_MimeSubtype()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getMimeSubtype();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDocumentElectronicFormat#getMimeSubtype <em>Mime Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Subtype</em>' attribute.
	 * @see #isSetMimeSubtype()
	 * @see #unsetMimeSubtype()
	 * @see #getMimeSubtype()
	 * @generated
	 */
	void setMimeSubtype(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDocumentElectronicFormat#getMimeSubtype <em>Mime Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMimeSubtype()
	 * @see #getMimeSubtype()
	 * @see #setMimeSubtype(String)
	 * @generated
	 */
	void unsetMimeSubtype();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDocumentElectronicFormat#getMimeSubtype <em>Mime Subtype</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mime Subtype</em>' attribute is set.
	 * @see #unsetMimeSubtype()
	 * @see #getMimeSubtype()
	 * @see #setMimeSubtype(String)
	 * @generated
	 */
	boolean isSetMimeSubtype();

	/**
	 * Returns the value of the '<em><b>Mime Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Content Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Content Type</em>' attribute.
	 * @see #isSetMimeContentType()
	 * @see #unsetMimeContentType()
	 * @see #setMimeContentType(String)
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentElectronicFormat_MimeContentType()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getMimeContentType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDocumentElectronicFormat#getMimeContentType <em>Mime Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Content Type</em>' attribute.
	 * @see #isSetMimeContentType()
	 * @see #unsetMimeContentType()
	 * @see #getMimeContentType()
	 * @generated
	 */
	void setMimeContentType(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDocumentElectronicFormat#getMimeContentType <em>Mime Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMimeContentType()
	 * @see #getMimeContentType()
	 * @see #setMimeContentType(String)
	 * @generated
	 */
	void unsetMimeContentType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDocumentElectronicFormat#getMimeContentType <em>Mime Content Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mime Content Type</em>' attribute is set.
	 * @see #unsetMimeContentType()
	 * @see #getMimeContentType()
	 * @see #setMimeContentType(String)
	 * @generated
	 */
	boolean isSetMimeContentType();

	/**
	 * Returns the value of the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Extension</em>' attribute.
	 * @see #isSetFileExtension()
	 * @see #unsetFileExtension()
	 * @see #setFileExtension(String)
	 * @see IFC2X3.IFC2X3Package#getIfcDocumentElectronicFormat_FileExtension()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getFileExtension();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDocumentElectronicFormat#getFileExtension <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Extension</em>' attribute.
	 * @see #isSetFileExtension()
	 * @see #unsetFileExtension()
	 * @see #getFileExtension()
	 * @generated
	 */
	void setFileExtension(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDocumentElectronicFormat#getFileExtension <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFileExtension()
	 * @see #getFileExtension()
	 * @see #setFileExtension(String)
	 * @generated
	 */
	void unsetFileExtension();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDocumentElectronicFormat#getFileExtension <em>File Extension</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>File Extension</em>' attribute is set.
	 * @see #unsetFileExtension()
	 * @see #getFileExtension()
	 * @see #setFileExtension(String)
	 * @generated
	 */
	boolean isSetFileExtension();

} // IfcDocumentElectronicFormat
