/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcProjectOrderRecord;
import IFC2X3.IfcProjectOrderRecordTypeEnum;
import IFC2X3.IfcRelAssignsToProjectOrder;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Project Order Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcProjectOrderRecordImpl#getRecords <em>Records</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcProjectOrderRecordImpl#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcProjectOrderRecord")
@XmlRootElement(name = "IfcProjectOrderRecordElement")
public class IfcProjectOrderRecordImpl extends IfcControlImpl implements IfcProjectOrderRecord {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcProjectOrderRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcProjectOrderRecord();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelAssignsToProjectOrder> getRecords() {
		return (EList<IfcRelAssignsToProjectOrder>)eGet(IFC2X3Package.eINSTANCE.getIfcProjectOrderRecord_Records(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProjectOrderRecordTypeEnum getPredefinedType() {
		return (IfcProjectOrderRecordTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcProjectOrderRecord_PredefinedType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcProjectOrderRecordTypeEnum newPredefinedType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcProjectOrderRecord_PredefinedType(), newPredefinedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPredefinedType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcProjectOrderRecord_PredefinedType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredefinedType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcProjectOrderRecord_PredefinedType());
	}

} //IfcProjectOrderRecordImpl
