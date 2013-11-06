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
import IFC2X3.IfcElementCompositionEnum;
import IFC2X3.IfcRelContainedInSpatialStructure;
import IFC2X3.IfcRelReferencedInSpatialStructure;
import IFC2X3.IfcRelServicesBuildings;
import IFC2X3.IfcSpatialStructureElement;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Spatial Structure Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSpatialStructureElementImpl#getLongName <em>Long Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSpatialStructureElementImpl#getCompositionType <em>Composition Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSpatialStructureElementImpl#getReferencesElements <em>References Elements</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSpatialStructureElementImpl#getServicedBySystems <em>Serviced By Systems</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSpatialStructureElementImpl#getContainsElements <em>Contains Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSpatialStructureElement")
@XmlSeeAlso({ IfcSiteImpl.class, IfcSpaceImpl.class, IfcBuildingImpl.class, IfcBuildingStoreyImpl.class })
@XmlRootElement(name = "IfcSpatialStructureElementElement")
public class IfcSpatialStructureElementImpl extends IfcProductImpl implements IfcSpatialStructureElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSpatialStructureElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSpatialStructureElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelReferencedInSpatialStructure> getReferencesElements() {
		return (EList<IfcRelReferencedInSpatialStructure>)eGet(IFC2X3Package.eINSTANCE.getIfcSpatialStructureElement_ReferencesElements(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelServicesBuildings> getServicedBySystems() {
		return (EList<IfcRelServicesBuildings>)eGet(IFC2X3Package.eINSTANCE.getIfcSpatialStructureElement_ServicedBySystems(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelContainedInSpatialStructure> getContainsElements() {
		return (EList<IfcRelContainedInSpatialStructure>)eGet(IFC2X3Package.eINSTANCE.getIfcSpatialStructureElement_ContainsElements(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElementCompositionEnum getCompositionType() {
		return (IfcElementCompositionEnum)eGet(IFC2X3Package.eINSTANCE.getIfcSpatialStructureElement_CompositionType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositionType(IfcElementCompositionEnum newCompositionType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSpatialStructureElement_CompositionType(), newCompositionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompositionType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSpatialStructureElement_CompositionType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompositionType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSpatialStructureElement_CompositionType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcSpatialStructureElement_LongName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongName(String newLongName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSpatialStructureElement_LongName(), newLongName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLongName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSpatialStructureElement_LongName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLongName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSpatialStructureElement_LongName());
	}

} //IfcSpatialStructureElementImpl
