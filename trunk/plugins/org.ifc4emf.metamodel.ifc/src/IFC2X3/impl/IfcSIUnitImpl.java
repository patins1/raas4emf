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
import IFC2X3.IfcSIPrefix;
import IFC2X3.IfcSIUnit;
import IFC2X3.IfcSIUnitName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc SI Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSIUnitImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSIUnitImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSIUnit")
@XmlRootElement(name = "IfcSIUnitElement")
public class IfcSIUnitImpl extends IfcNamedUnitImpl implements IfcSIUnit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSIUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSIUnit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSIUnitName getName() {
		return (IfcSIUnitName)eGet(IFC2X3Package.eINSTANCE.getIfcSIUnit_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(IfcSIUnitName newName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSIUnit_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSIUnit_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSIUnit_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSIPrefix getPrefix() {
		return (IfcSIPrefix)eGet(IFC2X3Package.eINSTANCE.getIfcSIUnit_Prefix(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(IfcSIPrefix newPrefix) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSIUnit_Prefix(), newPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrefix() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSIUnit_Prefix());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrefix() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSIUnit_Prefix());
	}

} //IfcSIUnitImpl
