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
import IFC2X3.IfcSlabType;
import IFC2X3.IfcSlabTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Slab Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSlabTypeImpl#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSlabType")
@XmlRootElement(name = "IfcSlabTypeElement")
public class IfcSlabTypeImpl extends IfcBuildingElementTypeImpl implements IfcSlabType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSlabTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSlabType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSlabTypeEnum getPredefinedType() {
		return (IfcSlabTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcSlabType_PredefinedType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcSlabTypeEnum newPredefinedType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSlabType_PredefinedType(), newPredefinedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPredefinedType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSlabType_PredefinedType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredefinedType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSlabType_PredefinedType());
	}

} //IfcSlabTypeImpl
