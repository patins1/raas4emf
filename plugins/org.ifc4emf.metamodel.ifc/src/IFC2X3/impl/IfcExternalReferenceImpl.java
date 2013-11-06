/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcExternalReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc External Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcExternalReferenceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcExternalReferenceImpl#getItemReference <em>Item Reference</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcExternalReferenceImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcExternalReference")
@XmlSeeAlso({ IfcExternallyDefinedSymbolImpl.class, IfcDocumentReferenceImpl.class, IfcLibraryReferenceImpl.class, IfcClassificationReferenceImpl.class, IfcExternallyDefinedHatchStyleImpl.class, IfcExternallyDefinedSurfaceStyleImpl.class, IfcExternallyDefinedTextFontImpl.class })
@XmlRootElement(name = "IfcExternalReferenceElement")
public class IfcExternalReferenceImpl extends IfcLightDistributionDataSourceSelectImpl implements IfcExternalReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcExternalReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcExternalReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcExternalReference_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcExternalReference_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcExternalReference_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcExternalReference_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItemReference() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcExternalReference_ItemReference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemReference(String newItemReference) {
		eSet(IFC2X3Package.eINSTANCE.getIfcExternalReference_ItemReference(), newItemReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetItemReference() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcExternalReference_ItemReference());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetItemReference() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcExternalReference_ItemReference());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcExternalReference_Location(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcExternalReference_Location(), newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLocation() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcExternalReference_Location());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLocation() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcExternalReference_Location());
	}

} //IfcExternalReferenceImpl
