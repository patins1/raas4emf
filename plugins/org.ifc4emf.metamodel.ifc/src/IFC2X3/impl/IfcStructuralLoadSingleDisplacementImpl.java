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
import IFC2X3.IfcStructuralLoadSingleDisplacement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Single Displacement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadSingleDisplacementImpl#getDisplacementX <em>Displacement X</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadSingleDisplacementImpl#getDisplacementY <em>Displacement Y</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadSingleDisplacementImpl#getDisplacementZ <em>Displacement Z</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadSingleDisplacementImpl#getRotationalDisplacementRX <em>Rotational Displacement RX</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadSingleDisplacementImpl#getRotationalDisplacementRY <em>Rotational Displacement RY</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLoadSingleDisplacementImpl#getRotationalDisplacementRZ <em>Rotational Displacement RZ</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStructuralLoadSingleDisplacement")
@XmlSeeAlso({ IfcStructuralLoadSingleDisplacementDistortionImpl.class })
@XmlRootElement(name = "IfcStructuralLoadSingleDisplacementElement")
public class IfcStructuralLoadSingleDisplacementImpl extends IfcStructuralLoadStaticImpl implements IfcStructuralLoadSingleDisplacement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadSingleDisplacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRotationalDisplacementRZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalDisplacementRZ(Double newRotationalDisplacementRZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRZ(), newRotationalDisplacementRZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalDisplacementRZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalDisplacementRZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRotationalDisplacementRY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalDisplacementRY(Double newRotationalDisplacementRY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRY(), newRotationalDisplacementRY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalDisplacementRY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalDisplacementRY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRotationalDisplacementRX() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalDisplacementRX(Double newRotationalDisplacementRX) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRX(), newRotationalDisplacementRX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalDisplacementRX() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalDisplacementRX() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDisplacementZ() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplacementZ(Double newDisplacementZ) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementZ(), newDisplacementZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplacementZ() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplacementZ() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDisplacementY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplacementY(Double newDisplacementY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementY(), newDisplacementY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplacementY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplacementY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDisplacementX() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplacementX(Double newDisplacementX) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementX(), newDisplacementX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplacementX() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplacementX() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementX());
	}

} //IfcStructuralLoadSingleDisplacementImpl
