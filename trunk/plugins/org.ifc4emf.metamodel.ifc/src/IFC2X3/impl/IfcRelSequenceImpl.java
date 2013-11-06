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
import IFC2X3.IfcProcess;
import IFC2X3.IfcRelSequence;
import IFC2X3.IfcSequenceEnum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelSequenceImpl#getRelatingProcess <em>Relating Process</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelSequenceImpl#getRelatedProcess <em>Related Process</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelSequenceImpl#getTimeLag <em>Time Lag</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelSequenceImpl#getSequenceType <em>Sequence Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelSequence")
@XmlRootElement(name = "IfcRelSequenceElement")
public class IfcRelSequenceImpl extends IfcRelConnectsImpl implements IfcRelSequence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelSequence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProcess getRelatedProcess() {
		return (IfcProcess)eGet(IFC2X3Package.eINSTANCE.getIfcRelSequence_RelatedProcess(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedProcess(IfcProcess newRelatedProcess) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelSequence_RelatedProcess(), newRelatedProcess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProcess getRelatingProcess() {
		return (IfcProcess)eGet(IFC2X3Package.eINSTANCE.getIfcRelSequence_RelatingProcess(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingProcess(IfcProcess newRelatingProcess) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelSequence_RelatingProcess(), newRelatingProcess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSequenceEnum getSequenceType() {
		return (IfcSequenceEnum)eGet(IFC2X3Package.eINSTANCE.getIfcRelSequence_SequenceType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceType(IfcSequenceEnum newSequenceType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelSequence_SequenceType(), newSequenceType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSequenceType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRelSequence_SequenceType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSequenceType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRelSequence_SequenceType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTimeLag() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRelSequence_TimeLag(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeLag(Double newTimeLag) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelSequence_TimeLag(), newTimeLag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimeLag() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRelSequence_TimeLag());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimeLag() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRelSequence_TimeLag());
	}

} //IfcRelSequenceImpl
