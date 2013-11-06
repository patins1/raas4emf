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
import IFC2X3.IfcAxis2Placement;
import IFC2X3.IfcPlanarBox;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Planar Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcPlanarBoxImpl#getPlacement <em>Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPlanarBox")
@XmlRootElement(name = "IfcPlanarBoxElement")
public class IfcPlanarBoxImpl extends IfcPlanarExtentImpl implements IfcPlanarBox {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPlanarBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPlanarBox();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement getPlacement() {
		return (IfcAxis2Placement)eGet(IFC2X3Package.eINSTANCE.getIfcPlanarBox_Placement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacement(IfcAxis2Placement newPlacement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPlanarBox_Placement(), newPlacement);
	}

} //IfcPlanarBoxImpl
