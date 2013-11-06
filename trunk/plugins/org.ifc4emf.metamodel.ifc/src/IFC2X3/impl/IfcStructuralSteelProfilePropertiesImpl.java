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
import IFC2X3.IfcStructuralSteelProfileProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Steel Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStructuralSteelProfilePropertiesImpl#getShearAreaZ <em>Shear Area Z</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralSteelProfilePropertiesImpl#getShearAreaY <em>Shear Area Y</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralSteelProfilePropertiesImpl#getPlasticShapeFactorY <em>Plastic Shape Factor Y</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralSteelProfilePropertiesImpl#getPlasticShapeFactorZ <em>Plastic Shape Factor Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStructuralSteelProfileProperties")
@XmlRootElement(name = "IfcStructuralSteelProfilePropertiesElement")
public class IfcStructuralSteelProfilePropertiesImpl extends IfcStructuralProfilePropertiesImpl implements IfcStructuralSteelProfileProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralSteelProfilePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralSteelProfileProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPlasticShapeFactorZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralSteelProfileProperties_PlasticShapeFactorZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlasticShapeFactorZ(Double newPlasticShapeFactorZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralSteelProfileProperties_PlasticShapeFactorZ(), newPlasticShapeFactorZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlasticShapeFactorZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralSteelProfileProperties_PlasticShapeFactorZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlasticShapeFactorZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralSteelProfileProperties_PlasticShapeFactorZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPlasticShapeFactorY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralSteelProfileProperties_PlasticShapeFactorY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlasticShapeFactorY(Double newPlasticShapeFactorY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralSteelProfileProperties_PlasticShapeFactorY(), newPlasticShapeFactorY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlasticShapeFactorY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralSteelProfileProperties_PlasticShapeFactorY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlasticShapeFactorY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralSteelProfileProperties_PlasticShapeFactorY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getShearAreaY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralSteelProfileProperties_ShearAreaY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearAreaY(Double newShearAreaY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralSteelProfileProperties_ShearAreaY(), newShearAreaY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearAreaY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralSteelProfileProperties_ShearAreaY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearAreaY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralSteelProfileProperties_ShearAreaY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getShearAreaZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralSteelProfileProperties_ShearAreaZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearAreaZ(Double newShearAreaZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralSteelProfileProperties_ShearAreaZ(), newShearAreaZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearAreaZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralSteelProfileProperties_ShearAreaZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearAreaZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralSteelProfileProperties_ShearAreaZ());
	}

} //IfcStructuralSteelProfilePropertiesImpl
