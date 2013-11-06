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
import IFC2X3.IfcDimensionalExponents;
import IFC2X3.IfcNamedUnit;
import IFC2X3.IfcUnitEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Named Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcNamedUnitImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcNamedUnitImpl#getUnitType <em>Unit Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcNamedUnit")
@XmlSeeAlso({ IfcConversionBasedUnitImpl.class, IfcSIUnitImpl.class, IfcContextDependentUnitImpl.class })
@XmlRootElement(name = "IfcNamedUnitElement")
public class IfcNamedUnitImpl extends IfcUnitImpl implements IfcNamedUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcNamedUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcNamedUnit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDimensionalExponents getDimensions() {
		return (IfcDimensionalExponents)eGet(IFC2X3Package.eINSTANCE.getIfcNamedUnit_Dimensions(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensions(IfcDimensionalExponents newDimensions) {
		eSet(IFC2X3Package.eINSTANCE.getIfcNamedUnit_Dimensions(), newDimensions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnitEnum getUnitType() {
		return (IfcUnitEnum)eGet(IFC2X3Package.eINSTANCE.getIfcNamedUnit_UnitType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitType(IfcUnitEnum newUnitType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcNamedUnit_UnitType(), newUnitType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnitType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcNamedUnit_UnitType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnitType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcNamedUnit_UnitType());
	}

} //IfcNamedUnitImpl
