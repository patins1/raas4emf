/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcMove;
import IFC2X3.IfcSpatialStructureElement;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Move</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcMoveImpl#getMoveFrom <em>Move From</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMoveImpl#getMoveTo <em>Move To</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMoveImpl#getPunchList <em>Punch List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcMove")
@XmlRootElement(name = "IfcMoveElement")
public class IfcMoveImpl extends IfcTaskImpl implements IfcMove {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMoveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcMove();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpatialStructureElement getMoveTo() {
		return (IfcSpatialStructureElement)eGet(IFC2X3Package.eINSTANCE.getIfcMove_MoveTo(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoveTo(IfcSpatialStructureElement newMoveTo) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMove_MoveTo(), newMoveTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpatialStructureElement getMoveFrom() {
		return (IfcSpatialStructureElement)eGet(IFC2X3Package.eINSTANCE.getIfcMove_MoveFrom(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoveFrom(IfcSpatialStructureElement newMoveFrom) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMove_MoveFrom(), newMoveFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getPunchList() {
		return (EList<String>)eGet(IFC2X3Package.eINSTANCE.getIfcMove_PunchList(), true);
	}

} //IfcMoveImpl
