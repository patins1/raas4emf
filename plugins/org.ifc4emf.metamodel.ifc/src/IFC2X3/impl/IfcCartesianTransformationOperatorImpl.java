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
import IFC2X3.IfcCartesianPoint;
import IFC2X3.IfcCartesianTransformationOperator;
import IFC2X3.IfcDirection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Cartesian Transformation Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcCartesianTransformationOperatorImpl#getAxis1 <em>Axis1</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCartesianTransformationOperatorImpl#getAxis2 <em>Axis2</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCartesianTransformationOperatorImpl#getLocalOrigin <em>Local Origin</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCartesianTransformationOperatorImpl#getScale <em>Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCartesianTransformationOperator")
@XmlSeeAlso({ IfcCartesianTransformationOperator3DnonUniformImpl.class, IfcCartesianTransformationOperator3DImpl.class, IfcCartesianTransformationOperator2DImpl.class, IfcCartesianTransformationOperator2DnonUniformImpl.class })
@XmlRootElement(name = "IfcCartesianTransformationOperatorElement")
public class IfcCartesianTransformationOperatorImpl extends IfcGeometricRepresentationItemImpl implements IfcCartesianTransformationOperator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCartesianTransformationOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCartesianTransformationOperator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getAxis1() {
		return (IfcDirection)eGet(IFC2X3Package.eINSTANCE.getIfcCartesianTransformationOperator_Axis1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis1(IfcDirection newAxis1) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCartesianTransformationOperator_Axis1(), newAxis1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getAxis2() {
		return (IfcDirection)eGet(IFC2X3Package.eINSTANCE.getIfcCartesianTransformationOperator_Axis2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis2(IfcDirection newAxis2) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCartesianTransformationOperator_Axis2(), newAxis2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianPoint getLocalOrigin() {
		return (IfcCartesianPoint)eGet(IFC2X3Package.eINSTANCE.getIfcCartesianTransformationOperator_LocalOrigin(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalOrigin(IfcCartesianPoint newLocalOrigin) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCartesianTransformationOperator_LocalOrigin(), newLocalOrigin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getScale() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCartesianTransformationOperator_Scale(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(Double newScale) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCartesianTransformationOperator_Scale(), newScale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScale() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCartesianTransformationOperator_Scale());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScale() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCartesianTransformationOperator_Scale());
	}

} //IfcCartesianTransformationOperatorImpl
