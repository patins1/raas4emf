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
import IFC2X3.IfcFlowTerminalType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Flow Terminal Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcFlowTerminalType")
@XmlSeeAlso({ IfcLightFixtureTypeImpl.class, IfcElectricHeaterTypeImpl.class, IfcOutletTypeImpl.class, IfcAirTerminalTypeImpl.class, IfcWasteTerminalTypeImpl.class, IfcLampTypeImpl.class, IfcStackTerminalTypeImpl.class, IfcElectricApplianceTypeImpl.class,
		IfcGasTerminalTypeImpl.class, IfcFireSuppressionTerminalTypeImpl.class, IfcSanitaryTerminalTypeImpl.class })
@XmlRootElement(name = "IfcFlowTerminalTypeElement")
public class IfcFlowTerminalTypeImpl extends IfcDistributionFlowElementTypeImpl implements IfcFlowTerminalType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFlowTerminalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcFlowTerminalType();
	}

} //IfcFlowTerminalTypeImpl
