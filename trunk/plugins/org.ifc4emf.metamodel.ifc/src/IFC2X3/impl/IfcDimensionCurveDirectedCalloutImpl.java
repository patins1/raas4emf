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
import IFC2X3.IfcDimensionCurveDirectedCallout;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Dimension Curve Directed Callout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDimensionCurveDirectedCallout")
@XmlSeeAlso({ IfcAngularDimensionImpl.class, IfcDiameterDimensionImpl.class, IfcRadiusDimensionImpl.class, IfcLinearDimensionImpl.class })
@XmlRootElement(name = "IfcDimensionCurveDirectedCalloutElement")
public class IfcDimensionCurveDirectedCalloutImpl extends IfcDraughtingCalloutImpl implements IfcDimensionCurveDirectedCallout {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDimensionCurveDirectedCalloutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDimensionCurveDirectedCallout();
	}

} //IfcDimensionCurveDirectedCalloutImpl
