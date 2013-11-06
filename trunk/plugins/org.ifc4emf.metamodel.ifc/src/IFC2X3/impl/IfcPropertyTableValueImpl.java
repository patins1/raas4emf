/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcPropertyTableValue;
import IFC2X3.IfcUnit;
import IFC2X3.IfcValue;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Table Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcPropertyTableValueImpl#getDefiningValues <em>Defining Values</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPropertyTableValueImpl#getDefinedValues <em>Defined Values</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPropertyTableValueImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPropertyTableValueImpl#getDefiningUnit <em>Defining Unit</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPropertyTableValueImpl#getDefinedUnit <em>Defined Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPropertyTableValue")
@XmlRootElement(name = "IfcPropertyTableValueElement")
public class IfcPropertyTableValueImpl extends IfcSimplePropertyImpl implements IfcPropertyTableValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPropertyTableValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPropertyTableValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcValue> getDefiningValues() {
		return (EList<IfcValue>)eGet(IFC2X3Package.eINSTANCE.getIfcPropertyTableValue_DefiningValues(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcValue> getDefinedValues() {
		return (EList<IfcValue>)eGet(IFC2X3Package.eINSTANCE.getIfcPropertyTableValue_DefinedValues(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnit getDefinedUnit() {
		return (IfcUnit)eGet(IFC2X3Package.eINSTANCE.getIfcPropertyTableValue_DefinedUnit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedUnit(IfcUnit newDefinedUnit) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPropertyTableValue_DefinedUnit(), newDefinedUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnit getDefiningUnit() {
		return (IfcUnit)eGet(IFC2X3Package.eINSTANCE.getIfcPropertyTableValue_DefiningUnit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefiningUnit(IfcUnit newDefiningUnit) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPropertyTableValue_DefiningUnit(), newDefiningUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcPropertyTableValue_Expression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPropertyTableValue_Expression(), newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExpression() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPropertyTableValue_Expression());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExpression() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPropertyTableValue_Expression());
	}

} //IfcPropertyTableValueImpl
