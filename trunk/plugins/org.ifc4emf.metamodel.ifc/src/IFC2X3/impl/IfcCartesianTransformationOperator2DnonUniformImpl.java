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
import IFC2X3.IfcCartesianTransformationOperator2DnonUniform;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Cartesian Transformation Operator2 Dnon Uniform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcCartesianTransformationOperator2DnonUniformImpl#getScale2 <em>Scale2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCartesianTransformationOperator2DnonUniform")
@XmlRootElement(name = "IfcCartesianTransformationOperator2DnonUniformElement")
public class IfcCartesianTransformationOperator2DnonUniformImpl extends IfcCartesianTransformationOperator2DImpl implements IfcCartesianTransformationOperator2DnonUniform {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCartesianTransformationOperator2DnonUniformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCartesianTransformationOperator2DnonUniform();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getScale2() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCartesianTransformationOperator2DnonUniform_Scale2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale2(Double newScale2) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCartesianTransformationOperator2DnonUniform_Scale2(), newScale2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScale2() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCartesianTransformationOperator2DnonUniform_Scale2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScale2() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCartesianTransformationOperator2DnonUniform_Scale2());
	}

} //IfcCartesianTransformationOperator2DnonUniformImpl
