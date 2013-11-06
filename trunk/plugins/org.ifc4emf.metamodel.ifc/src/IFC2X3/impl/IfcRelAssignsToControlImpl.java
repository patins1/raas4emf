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
import IFC2X3.IfcControl;
import IFC2X3.IfcRelAssignsToControl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Assigns To Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelAssignsToControlImpl#getRelatingControl <em>Relating Control</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelAssignsToControl")
@XmlSeeAlso({ IfcRelSchedulesCostItemsImpl.class, IfcRelAssignsTasksImpl.class, IfcRelAssignsToProjectOrderImpl.class })
@XmlRootElement(name = "IfcRelAssignsToControlElement")
public class IfcRelAssignsToControlImpl extends IfcRelAssignsImpl implements IfcRelAssignsToControl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssignsToControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelAssignsToControl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcControl getRelatingControl() {
		return (IfcControl)eGet(IFC2X3Package.eINSTANCE.getIfcRelAssignsToControl_RelatingControl(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingControl(IfcControl newRelatingControl) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelAssignsToControl_RelatingControl(), newRelatingControl);
	}

} //IfcRelAssignsToControlImpl
