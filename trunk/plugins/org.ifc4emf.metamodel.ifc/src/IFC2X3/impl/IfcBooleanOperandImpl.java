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
import IFC2X3.IfcBooleanOperand;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boolean Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcBooleanOperand")
@XmlSeeAlso({ IfcSweptDiskSolidImpl.class, IfcSweptAreaSolidImpl.class, IfcBoxedHalfSpaceImpl.class, IfcRightCircularCylinderImpl.class, IfcRightCircularConeImpl.class, IfcExtrudedAreaSolidImpl.class, IfcBooleanClippingResultImpl.class, IfcBooleanResultImpl.class,
		IfcBlockImpl.class, IfcCsgSolidImpl.class, IfcCsgPrimitive3DImpl.class, IfcRectangularPyramidImpl.class, IfcHalfSpaceSolidImpl.class, IfcSphereImpl.class, IfcPolygonalBoundedHalfSpaceImpl.class, IfcRevolvedAreaSolidImpl.class, IfcSurfaceCurveSweptAreaSolidImpl.class,
		IfcSolidModelImpl.class, IfcFacetedBrepWithVoidsImpl.class, IfcManifoldSolidBrepImpl.class, IfcFacetedBrepImpl.class })
@XmlRootElement(name = "IfcBooleanOperandElement")
public abstract class IfcBooleanOperandImpl extends CDOObjectImpl implements IfcBooleanOperand {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBooleanOperandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcBooleanOperand();
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

} //IfcBooleanOperandImpl
