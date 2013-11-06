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
import IFC2X3.IfcGeneralProfileProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc General Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcGeneralProfilePropertiesImpl#getPhysicalWeight <em>Physical Weight</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcGeneralProfilePropertiesImpl#getPerimeter <em>Perimeter</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcGeneralProfilePropertiesImpl#getMinimumPlateThickness <em>Minimum Plate Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcGeneralProfilePropertiesImpl#getMaximumPlateThickness <em>Maximum Plate Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcGeneralProfilePropertiesImpl#getCrossSectionArea <em>Cross Section Area</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcGeneralProfileProperties")
@XmlSeeAlso({ IfcStructuralSteelProfilePropertiesImpl.class, IfcStructuralProfilePropertiesImpl.class })
@XmlRootElement(name = "IfcGeneralProfilePropertiesElement")
public class IfcGeneralProfilePropertiesImpl extends IfcProfilePropertiesImpl implements IfcGeneralProfileProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGeneralProfilePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcGeneralProfileProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCrossSectionArea() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcGeneralProfileProperties_CrossSectionArea(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrossSectionArea(Double newCrossSectionArea) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGeneralProfileProperties_CrossSectionArea(), newCrossSectionArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCrossSectionArea() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcGeneralProfileProperties_CrossSectionArea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCrossSectionArea() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcGeneralProfileProperties_CrossSectionArea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMaximumPlateThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcGeneralProfileProperties_MaximumPlateThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumPlateThickness(Double newMaximumPlateThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGeneralProfileProperties_MaximumPlateThickness(), newMaximumPlateThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximumPlateThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcGeneralProfileProperties_MaximumPlateThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximumPlateThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcGeneralProfileProperties_MaximumPlateThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMinimumPlateThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcGeneralProfileProperties_MinimumPlateThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumPlateThickness(Double newMinimumPlateThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGeneralProfileProperties_MinimumPlateThickness(), newMinimumPlateThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumPlateThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcGeneralProfileProperties_MinimumPlateThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumPlateThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcGeneralProfileProperties_MinimumPlateThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPerimeter() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcGeneralProfileProperties_Perimeter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerimeter(Double newPerimeter) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGeneralProfileProperties_Perimeter(), newPerimeter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPerimeter() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcGeneralProfileProperties_Perimeter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPerimeter() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcGeneralProfileProperties_Perimeter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPhysicalWeight() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcGeneralProfileProperties_PhysicalWeight(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalWeight(Double newPhysicalWeight) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGeneralProfileProperties_PhysicalWeight(), newPhysicalWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPhysicalWeight() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcGeneralProfileProperties_PhysicalWeight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPhysicalWeight() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcGeneralProfileProperties_PhysicalWeight());
	}

} //IfcGeneralProfilePropertiesImpl
