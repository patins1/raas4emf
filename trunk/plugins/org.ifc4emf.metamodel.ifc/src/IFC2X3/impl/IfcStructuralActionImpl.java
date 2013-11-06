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
import IFC2X3.IfcStructuralAction;
import IFC2X3.IfcStructuralReaction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStructuralActionImpl#getDestabilizingLoad <em>Destabilizing Load</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralActionImpl#getCausedBy <em>Caused By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStructuralAction")
@XmlSeeAlso({ IfcStructuralLinearActionImpl.class, IfcStructuralPlanarActionVaryingImpl.class, IfcStructuralPointActionImpl.class, IfcStructuralLinearActionVaryingImpl.class, IfcStructuralPlanarActionImpl.class })
@XmlRootElement(name = "IfcStructuralActionElement")
public class IfcStructuralActionImpl extends IfcStructuralActivityImpl implements IfcStructuralAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralReaction getCausedBy() {
		return (IfcStructuralReaction)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralAction_CausedBy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCausedBy(IfcStructuralReaction newCausedBy) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralAction_CausedBy(), newCausedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getDestabilizingLoad() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralAction_DestabilizingLoad(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestabilizingLoad(Boolean newDestabilizingLoad) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralAction_DestabilizingLoad(), newDestabilizingLoad);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDestabilizingLoad() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralAction_DestabilizingLoad());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDestabilizingLoad() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralAction_DestabilizingLoad());
	}

} //IfcStructuralActionImpl
