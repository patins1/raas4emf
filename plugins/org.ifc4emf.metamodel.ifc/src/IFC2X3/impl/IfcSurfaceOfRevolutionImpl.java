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
import IFC2X3.IfcAxis1Placement;
import IFC2X3.IfcSurfaceOfRevolution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Of Revolution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSurfaceOfRevolutionImpl#getAxisPosition <em>Axis Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSurfaceOfRevolution")
@XmlRootElement(name = "IfcSurfaceOfRevolutionElement")
public class IfcSurfaceOfRevolutionImpl extends IfcSweptSurfaceImpl implements IfcSurfaceOfRevolution {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceOfRevolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSurfaceOfRevolution();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis1Placement getAxisPosition() {
		return (IfcAxis1Placement)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceOfRevolution_AxisPosition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisPosition(IfcAxis1Placement newAxisPosition) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceOfRevolution_AxisPosition(), newAxisPosition);
	}

} //IfcSurfaceOfRevolutionImpl
