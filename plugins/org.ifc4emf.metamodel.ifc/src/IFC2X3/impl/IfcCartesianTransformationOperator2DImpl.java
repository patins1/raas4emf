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
import IFC2X3.IfcCartesianTransformationOperator2D;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Cartesian Transformation Operator2 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCartesianTransformationOperator2D")
@XmlSeeAlso({ IfcCartesianTransformationOperator2DnonUniformImpl.class })
@XmlRootElement(name = "IfcCartesianTransformationOperator2DElement")
public class IfcCartesianTransformationOperator2DImpl extends IfcCartesianTransformationOperatorImpl implements IfcCartesianTransformationOperator2D {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCartesianTransformationOperator2DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCartesianTransformationOperator2D();
	}

} //IfcCartesianTransformationOperator2DImpl
