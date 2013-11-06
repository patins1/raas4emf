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
import IFC2X3.IfcConditionCriterion;
import IFC2X3.IfcConditionCriterionSelect;
import IFC2X3.IfcDateTimeSelect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Condition Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcConditionCriterionImpl#getCriterion <em>Criterion</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConditionCriterionImpl#getCriterionDateTime <em>Criterion Date Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcConditionCriterion")
@XmlRootElement(name = "IfcConditionCriterionElement")
public class IfcConditionCriterionImpl extends IfcControlImpl implements IfcConditionCriterion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConditionCriterionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcConditionCriterion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConditionCriterionSelect getCriterion() {
		return (IfcConditionCriterionSelect)eGet(IFC2X3Package.eINSTANCE.getIfcConditionCriterion_Criterion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriterion(IfcConditionCriterionSelect newCriterion) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConditionCriterion_Criterion(), newCriterion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getCriterionDateTime() {
		return (IfcDateTimeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcConditionCriterion_CriterionDateTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriterionDateTime(IfcDateTimeSelect newCriterionDateTime) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConditionCriterion_CriterionDateTime(), newCriterionDateTime);
	}

} //IfcConditionCriterionImpl
