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
import IFC2X3.IfcRelaxation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Relaxation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelaxationImpl#getRelaxationValue <em>Relaxation Value</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelaxationImpl#getInitialStress <em>Initial Stress</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelaxation")
@XmlRootElement(name = "IfcRelaxationElement")
public class IfcRelaxationImpl extends CDOObjectImpl implements IfcRelaxation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelaxationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelaxation();
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
	public Double getInitialStress() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRelaxation_InitialStress(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialStress(Double newInitialStress) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelaxation_InitialStress(), newInitialStress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInitialStress() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRelaxation_InitialStress());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInitialStress() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRelaxation_InitialStress());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRelaxationValue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRelaxation_RelaxationValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelaxationValue(Double newRelaxationValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelaxation_RelaxationValue(), newRelaxationValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelaxationValue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRelaxation_RelaxationValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelaxationValue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRelaxation_RelaxationValue());
	}

} //IfcRelaxationImpl
