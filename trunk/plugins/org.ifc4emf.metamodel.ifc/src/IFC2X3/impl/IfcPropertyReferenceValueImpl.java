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
import IFC2X3.IfcObjectReferenceSelect;
import IFC2X3.IfcPropertyReferenceValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Reference Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcPropertyReferenceValueImpl#getUsageName <em>Usage Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPropertyReferenceValueImpl#getPropertyReference <em>Property Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPropertyReferenceValue")
@XmlRootElement(name = "IfcPropertyReferenceValueElement")
public class IfcPropertyReferenceValueImpl extends IfcSimplePropertyImpl implements IfcPropertyReferenceValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPropertyReferenceValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPropertyReferenceValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectReferenceSelect getPropertyReference() {
		return (IfcObjectReferenceSelect)eGet(IFC2X3Package.eINSTANCE.getIfcPropertyReferenceValue_PropertyReference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyReference(IfcObjectReferenceSelect newPropertyReference) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPropertyReferenceValue_PropertyReference(), newPropertyReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsageName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcPropertyReferenceValue_UsageName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageName(String newUsageName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPropertyReferenceValue_UsageName(), newUsageName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUsageName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPropertyReferenceValue_UsageName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUsageName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPropertyReferenceValue_UsageName());
	}

} //IfcPropertyReferenceValueImpl
