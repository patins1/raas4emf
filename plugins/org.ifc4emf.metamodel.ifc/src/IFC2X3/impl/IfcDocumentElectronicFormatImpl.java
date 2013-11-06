/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcDocumentElectronicFormat;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Document Electronic Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcDocumentElectronicFormatImpl#getFileExtension <em>File Extension</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDocumentElectronicFormatImpl#getMimeContentType <em>Mime Content Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDocumentElectronicFormatImpl#getMimeSubtype <em>Mime Subtype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDocumentElectronicFormat")
@XmlRootElement(name = "IfcDocumentElectronicFormatElement")
public class IfcDocumentElectronicFormatImpl extends CDOObjectImpl implements IfcDocumentElectronicFormat {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDocumentElectronicFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDocumentElectronicFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimeSubtype() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeSubtype(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeSubtype(String newMimeSubtype) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeSubtype(), newMimeSubtype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMimeSubtype() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeSubtype());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMimeSubtype() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeSubtype());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimeContentType() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeContentType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeContentType(String newMimeContentType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeContentType(), newMimeContentType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMimeContentType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeContentType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMimeContentType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDocumentElectronicFormat_MimeContentType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileExtension() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcDocumentElectronicFormat_FileExtension(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileExtension(String newFileExtension) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDocumentElectronicFormat_FileExtension(), newFileExtension);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFileExtension() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDocumentElectronicFormat_FileExtension());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFileExtension() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDocumentElectronicFormat_FileExtension());
	}

} //IfcDocumentElectronicFormatImpl
