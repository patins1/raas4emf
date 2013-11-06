/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcElementQuantity;
import IFC2X3.IfcPhysicalQuantity;

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
 * An implementation of the model object '<em><b>Ifc Element Quantity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcElementQuantityImpl#getMethodOfMeasurement <em>Method Of Measurement</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcElementQuantityImpl#getQuantities <em>Quantities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcElementQuantity")
@XmlRootElement(name = "IfcElementQuantityElement")
public class IfcElementQuantityImpl extends IfcPropertySetDefinitionImpl implements IfcElementQuantity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcElementQuantityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcElementQuantity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcPhysicalQuantity> getQuantities() {
		return (EList<IfcPhysicalQuantity>)eGet(IFC2X3Package.eINSTANCE.getIfcElementQuantity_Quantities(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodOfMeasurement() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcElementQuantity_MethodOfMeasurement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodOfMeasurement(String newMethodOfMeasurement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcElementQuantity_MethodOfMeasurement(), newMethodOfMeasurement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMethodOfMeasurement() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcElementQuantity_MethodOfMeasurement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMethodOfMeasurement() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcElementQuantity_MethodOfMeasurement());
	}

} //IfcElementQuantityImpl
