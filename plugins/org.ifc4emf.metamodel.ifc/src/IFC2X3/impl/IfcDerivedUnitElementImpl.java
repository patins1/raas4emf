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
import IFC2X3.IfcDerivedUnitElement;
import IFC2X3.IfcNamedUnit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Derived Unit Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcDerivedUnitElementImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedUnitElementImpl#getExponent <em>Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDerivedUnitElement")
@XmlRootElement(name = "IfcDerivedUnitElementElement")
public class IfcDerivedUnitElementImpl extends CDOObjectImpl implements IfcDerivedUnitElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDerivedUnitElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDerivedUnitElement();
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
	public IfcNamedUnit getUnit() {
		return (IfcNamedUnit)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedUnitElement_Unit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(IfcNamedUnit newUnit) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedUnitElement_Unit(), newUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getExponent() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedUnitElement_Exponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExponent(Integer newExponent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedUnitElement_Exponent(), newExponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExponent() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedUnitElement_Exponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExponent() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedUnitElement_Exponent());
	}

} //IfcDerivedUnitElementImpl
