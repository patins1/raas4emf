/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcPostalAddress;
import IFC2X3.IfcSite;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSiteImpl#getRefLatitude <em>Ref Latitude</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSiteImpl#getRefLongitude <em>Ref Longitude</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSiteImpl#getRefElevation <em>Ref Elevation</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSiteImpl#getLandTitleNumber <em>Land Title Number</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSiteImpl#getSiteAddress <em>Site Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSite")
@XmlRootElement(name = "IfcSiteElement")
public class IfcSiteImpl extends IfcSpatialStructureElementImpl implements IfcSite {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPostalAddress getSiteAddress() {
		return (IfcPostalAddress)eGet(IFC2X3Package.eINSTANCE.getIfcSite_SiteAddress(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteAddress(IfcPostalAddress newSiteAddress) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSite_SiteAddress(), newSiteAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLandTitleNumber() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcSite_LandTitleNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLandTitleNumber(String newLandTitleNumber) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSite_LandTitleNumber(), newLandTitleNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLandTitleNumber() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSite_LandTitleNumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLandTitleNumber() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSite_LandTitleNumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRefElevation() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSite_RefElevation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefElevation(Double newRefElevation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSite_RefElevation(), newRefElevation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRefElevation() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSite_RefElevation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRefElevation() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSite_RefElevation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Integer> getRefLongitude() {
		return (EList<Integer>)eGet(IFC2X3Package.eINSTANCE.getIfcSite_RefLongitude(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Integer> getRefLatitude() {
		return (EList<Integer>)eGet(IFC2X3Package.eINSTANCE.getIfcSite_RefLatitude(), true);
	}

} //IfcSiteImpl
