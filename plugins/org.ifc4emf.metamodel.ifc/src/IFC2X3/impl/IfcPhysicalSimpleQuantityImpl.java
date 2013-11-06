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
import IFC2X3.IfcNamedUnit;
import IFC2X3.IfcPhysicalSimpleQuantity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Physical Simple Quantity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcPhysicalSimpleQuantityImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPhysicalSimpleQuantity")
@XmlSeeAlso({ IfcQuantityAreaImpl.class, IfcQuantityLengthImpl.class, IfcQuantityVolumeImpl.class, IfcQuantityWeightImpl.class, IfcQuantityCountImpl.class, IfcQuantityTimeImpl.class })
@XmlRootElement(name = "IfcPhysicalSimpleQuantityElement")
public class IfcPhysicalSimpleQuantityImpl extends IfcPhysicalQuantityImpl implements IfcPhysicalSimpleQuantity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPhysicalSimpleQuantityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPhysicalSimpleQuantity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcNamedUnit getUnit() {
		return (IfcNamedUnit)eGet(IFC2X3Package.eINSTANCE.getIfcPhysicalSimpleQuantity_Unit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(IfcNamedUnit newUnit) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPhysicalSimpleQuantity_Unit(), newUnit);
	}

} //IfcPhysicalSimpleQuantityImpl
