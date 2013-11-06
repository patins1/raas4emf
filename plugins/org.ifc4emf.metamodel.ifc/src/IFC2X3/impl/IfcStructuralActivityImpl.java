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
import IFC2X3.IfcGlobalOrLocalEnum;
import IFC2X3.IfcRelConnectsStructuralActivity;
import IFC2X3.IfcStructuralActivity;
import IFC2X3.IfcStructuralLoad;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStructuralActivityImpl#getAppliedLoad <em>Applied Load</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralActivityImpl#getGlobalOrLocal <em>Global Or Local</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralActivityImpl#getAssignedToStructuralItem <em>Assigned To Structural Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStructuralActivity")
@XmlSeeAlso({ IfcStructuralLinearActionImpl.class, IfcStructuralPointReactionImpl.class, IfcStructuralPlanarActionVaryingImpl.class, IfcStructuralActionImpl.class, IfcStructuralPointActionImpl.class, IfcStructuralLinearActionVaryingImpl.class, IfcStructuralReactionImpl.class,
		IfcStructuralPlanarActionImpl.class })
@XmlRootElement(name = "IfcStructuralActivityElement")
public class IfcStructuralActivityImpl extends IfcProductImpl implements IfcStructuralActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelConnectsStructuralActivity getAssignedToStructuralItem() {
		return (IfcRelConnectsStructuralActivity)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralActivity_AssignedToStructuralItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedToStructuralItem(IfcRelConnectsStructuralActivity newAssignedToStructuralItem) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralActivity_AssignedToStructuralItem(), newAssignedToStructuralItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLoad getAppliedLoad() {
		return (IfcStructuralLoad)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralActivity_AppliedLoad(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedLoad(IfcStructuralLoad newAppliedLoad) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralActivity_AppliedLoad(), newAppliedLoad);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGlobalOrLocalEnum getGlobalOrLocal() {
		return (IfcGlobalOrLocalEnum)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralActivity_GlobalOrLocal(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalOrLocal(IfcGlobalOrLocalEnum newGlobalOrLocal) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralActivity_GlobalOrLocal(), newGlobalOrLocal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGlobalOrLocal() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralActivity_GlobalOrLocal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGlobalOrLocal() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralActivity_GlobalOrLocal());
	}

} //IfcStructuralActivityImpl
