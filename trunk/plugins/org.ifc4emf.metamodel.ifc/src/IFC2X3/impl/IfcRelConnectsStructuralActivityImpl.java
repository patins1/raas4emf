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
import IFC2X3.IfcRelConnectsStructuralActivity;
import IFC2X3.IfcStructuralActivity;
import IFC2X3.IfcStructuralActivityAssignmentSelect;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Structural Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsStructuralActivityImpl#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsStructuralActivityImpl#getRelatedStructuralActivity <em>Related Structural Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelConnectsStructuralActivity")
@XmlRootElement(name = "IfcRelConnectsStructuralActivityElement")
public class IfcRelConnectsStructuralActivityImpl extends IfcRelConnectsImpl implements IfcRelConnectsStructuralActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsStructuralActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralActivity getRelatedStructuralActivity() {
		return (IfcStructuralActivity)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralActivity_RelatedStructuralActivity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedStructuralActivity(IfcStructuralActivity newRelatedStructuralActivity) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralActivity_RelatedStructuralActivity(), newRelatedStructuralActivity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralActivityAssignmentSelect getRelatingElement() {
		return (IfcStructuralActivityAssignmentSelect)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralActivity_RelatingElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingElement(IfcStructuralActivityAssignmentSelect newRelatingElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsStructuralActivity_RelatingElement(), newRelatingElement);
	}

} //IfcRelConnectsStructuralActivityImpl
