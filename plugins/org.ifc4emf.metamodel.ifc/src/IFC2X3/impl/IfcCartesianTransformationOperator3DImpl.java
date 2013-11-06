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
import IFC2X3.IfcCartesianTransformationOperator3D;
import IFC2X3.IfcDirection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Cartesian Transformation Operator3 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcCartesianTransformationOperator3DImpl#getAxis3 <em>Axis3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCartesianTransformationOperator3D")
@XmlSeeAlso({ IfcCartesianTransformationOperator3DnonUniformImpl.class })
@XmlRootElement(name = "IfcCartesianTransformationOperator3DElement")
public class IfcCartesianTransformationOperator3DImpl extends IfcCartesianTransformationOperatorImpl implements IfcCartesianTransformationOperator3D {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCartesianTransformationOperator3DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCartesianTransformationOperator3D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getAxis3() {
		return (IfcDirection)eGet(IFC2X3Package.eINSTANCE.getIfcCartesianTransformationOperator3D_Axis3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis3(IfcDirection newAxis3) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCartesianTransformationOperator3D_Axis3(), newAxis3);
	}

} //IfcCartesianTransformationOperator3DImpl
