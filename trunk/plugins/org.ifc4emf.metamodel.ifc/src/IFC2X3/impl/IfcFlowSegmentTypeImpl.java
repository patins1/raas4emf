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
import IFC2X3.IfcFlowSegmentType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Flow Segment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcFlowSegmentType")
@XmlSeeAlso({ IfcDuctSegmentTypeImpl.class, IfcCableSegmentTypeImpl.class, IfcCableCarrierSegmentTypeImpl.class, IfcPipeSegmentTypeImpl.class })
@XmlRootElement(name = "IfcFlowSegmentTypeElement")
public class IfcFlowSegmentTypeImpl extends IfcDistributionFlowElementTypeImpl implements IfcFlowSegmentType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFlowSegmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcFlowSegmentType();
	}

} //IfcFlowSegmentTypeImpl
