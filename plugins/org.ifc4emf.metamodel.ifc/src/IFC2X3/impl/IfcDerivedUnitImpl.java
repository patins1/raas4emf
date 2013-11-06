/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcDerivedUnit;
import IFC2X3.IfcDerivedUnitElement;
import IFC2X3.IfcDerivedUnitEnum;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Derived Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcDerivedUnitImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedUnitImpl#getUnitType <em>Unit Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedUnitImpl#getUserDefinedType <em>User Defined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDerivedUnit")
@XmlRootElement(name = "IfcDerivedUnitElement")
public class IfcDerivedUnitImpl extends IfcUnitImpl implements IfcDerivedUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDerivedUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDerivedUnit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcDerivedUnitElement> getElements() {
		return (EList<IfcDerivedUnitElement>)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedUnit_Elements(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedType() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedUnit_UserDefinedType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedType(String newUserDefinedType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedUnit_UserDefinedType(), newUserDefinedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedUnit_UserDefinedType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedUnit_UserDefinedType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDerivedUnitEnum getUnitType() {
		return (IfcDerivedUnitEnum)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedUnit_UnitType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitType(IfcDerivedUnitEnum newUnitType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedUnit_UnitType(), newUnitType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnitType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedUnit_UnitType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnitType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedUnit_UnitType());
	}

} //IfcDerivedUnitImpl
