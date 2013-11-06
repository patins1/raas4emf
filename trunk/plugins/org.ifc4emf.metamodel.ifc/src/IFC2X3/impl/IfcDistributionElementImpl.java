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
import IFC2X3.IfcDistributionElement;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Distribution Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDistributionElement")
@XmlSeeAlso({ IfcFlowControllerImpl.class, IfcDistributionControlElementImpl.class, IfcFlowMovingDeviceImpl.class, IfcFlowStorageDeviceImpl.class, IfcFlowFittingImpl.class, IfcFlowSegmentImpl.class, IfcEnergyConversionDeviceImpl.class, IfcFlowTreatmentDeviceImpl.class,
		IfcDistributionChamberElementImpl.class, IfcElectricDistributionPointImpl.class, IfcFlowTerminalImpl.class, IfcDistributionFlowElementImpl.class })
@XmlRootElement(name = "IfcDistributionElementElement")
public class IfcDistributionElementImpl extends IfcElementImpl implements IfcDistributionElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDistributionElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDistributionElement();
	}

} //IfcDistributionElementImpl
