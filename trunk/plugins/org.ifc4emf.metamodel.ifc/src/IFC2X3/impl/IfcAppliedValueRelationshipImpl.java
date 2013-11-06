/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcAppliedValue;
import IFC2X3.IfcAppliedValueRelationship;
import IFC2X3.IfcArithmeticOperatorEnum;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Applied Value Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcAppliedValueRelationshipImpl#getComponentOfTotal <em>Component Of Total</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAppliedValueRelationshipImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAppliedValueRelationshipImpl#getArithmeticOperator <em>Arithmetic Operator</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAppliedValueRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAppliedValueRelationshipImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcAppliedValueRelationship")
@XmlRootElement(name = "IfcAppliedValueRelationshipElement")
public class IfcAppliedValueRelationshipImpl extends CDOObjectImpl implements IfcAppliedValueRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcAppliedValueRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcAppliedValueRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcAppliedValue> getComponents() {
		return (EList<IfcAppliedValue>)eGet(IFC2X3Package.eINSTANCE.getIfcAppliedValueRelationship_Components(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAppliedValue getComponentOfTotal() {
		return (IfcAppliedValue)eGet(IFC2X3Package.eINSTANCE.getIfcAppliedValueRelationship_ComponentOfTotal(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentOfTotal(IfcAppliedValue newComponentOfTotal) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAppliedValueRelationship_ComponentOfTotal(), newComponentOfTotal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcAppliedValueRelationship_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAppliedValueRelationship_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcAppliedValueRelationship_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcAppliedValueRelationship_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcAppliedValueRelationship_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAppliedValueRelationship_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcAppliedValueRelationship_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcAppliedValueRelationship_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcArithmeticOperatorEnum getArithmeticOperator() {
		return (IfcArithmeticOperatorEnum)eGet(IFC2X3Package.eINSTANCE.getIfcAppliedValueRelationship_ArithmeticOperator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArithmeticOperator(IfcArithmeticOperatorEnum newArithmeticOperator) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAppliedValueRelationship_ArithmeticOperator(), newArithmeticOperator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArithmeticOperator() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcAppliedValueRelationship_ArithmeticOperator());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArithmeticOperator() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcAppliedValueRelationship_ArithmeticOperator());
	}

} //IfcAppliedValueRelationshipImpl
