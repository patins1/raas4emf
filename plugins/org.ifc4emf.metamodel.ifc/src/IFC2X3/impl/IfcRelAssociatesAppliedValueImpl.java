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
import IFC2X3.IfcAppliedValue;
import IFC2X3.IfcRelAssociatesAppliedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Associates Applied Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelAssociatesAppliedValueImpl#getRelatingAppliedValue <em>Relating Applied Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelAssociatesAppliedValue")
@XmlRootElement(name = "IfcRelAssociatesAppliedValueElement")
public class IfcRelAssociatesAppliedValueImpl extends IfcRelAssociatesImpl implements IfcRelAssociatesAppliedValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssociatesAppliedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelAssociatesAppliedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAppliedValue getRelatingAppliedValue() {
		return (IfcAppliedValue)eGet(IFC2X3Package.eINSTANCE.getIfcRelAssociatesAppliedValue_RelatingAppliedValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingAppliedValue(IfcAppliedValue newRelatingAppliedValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelAssociatesAppliedValue_RelatingAppliedValue(), newRelatingAppliedValue);
	}

} //IfcRelAssociatesAppliedValueImpl
