/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcInternalOrExternalEnum;
import IFC2X3.IfcRelCoversSpaces;
import IFC2X3.IfcRelSpaceBoundary;
import IFC2X3.IfcSpace;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSpaceImpl#getInteriorOrExteriorSpace <em>Interior Or Exterior Space</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSpaceImpl#getElevationWithFlooring <em>Elevation With Flooring</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSpaceImpl#getHasCoverings <em>Has Coverings</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSpaceImpl#getBoundedBy <em>Bounded By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSpace")
@XmlRootElement(name = "IfcSpaceElement")
public class IfcSpaceImpl extends IfcSpatialStructureElementImpl implements IfcSpace {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSpace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelCoversSpaces> getHasCoverings() {
		return (EList<IfcRelCoversSpaces>)eGet(IFC2X3Package.eINSTANCE.getIfcSpace_HasCoverings(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelSpaceBoundary> getBoundedBy() {
		return (EList<IfcRelSpaceBoundary>)eGet(IFC2X3Package.eINSTANCE.getIfcSpace_BoundedBy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getElevationWithFlooring() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSpace_ElevationWithFlooring(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevationWithFlooring(Double newElevationWithFlooring) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSpace_ElevationWithFlooring(), newElevationWithFlooring);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElevationWithFlooring() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSpace_ElevationWithFlooring());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElevationWithFlooring() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSpace_ElevationWithFlooring());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInternalOrExternalEnum getInteriorOrExteriorSpace() {
		return (IfcInternalOrExternalEnum)eGet(IFC2X3Package.eINSTANCE.getIfcSpace_InteriorOrExteriorSpace(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteriorOrExteriorSpace(IfcInternalOrExternalEnum newInteriorOrExteriorSpace) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSpace_InteriorOrExteriorSpace(), newInteriorOrExteriorSpace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInteriorOrExteriorSpace() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSpace_InteriorOrExteriorSpace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInteriorOrExteriorSpace() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSpace_InteriorOrExteriorSpace());
	}

} //IfcSpaceImpl
