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
import IFC2X3.IfcFlowTreatmentDeviceType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Flow Treatment Device Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcFlowTreatmentDeviceType")
@XmlSeeAlso({ IfcFilterTypeImpl.class, IfcDuctSilencerTypeImpl.class })
@XmlRootElement(name = "IfcFlowTreatmentDeviceTypeElement")
public class IfcFlowTreatmentDeviceTypeImpl extends IfcDistributionFlowElementTypeImpl implements IfcFlowTreatmentDeviceType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFlowTreatmentDeviceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcFlowTreatmentDeviceType();
	}

} //IfcFlowTreatmentDeviceTypeImpl
