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
import IFC2X3.IfcPropertyDefinition;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPropertyDefinition")
@XmlSeeAlso({ IfcWindowPanelPropertiesImpl.class, IfcElectricalBasePropertiesImpl.class, IfcElementQuantityImpl.class, IfcEnergyPropertiesImpl.class, IfcSoundValueImpl.class, IfcPermeableCoveringPropertiesImpl.class, IfcServiceLifeFactorImpl.class, IfcSoundPropertiesImpl.class,
		IfcWindowLiningPropertiesImpl.class, IfcSpaceThermalLoadPropertiesImpl.class, IfcReinforcementDefinitionPropertiesImpl.class, IfcDoorPanelPropertiesImpl.class, IfcDoorLiningPropertiesImpl.class, IfcFluidFlowPropertiesImpl.class, IfcPropertySetImpl.class,
		IfcPropertySetDefinitionImpl.class })
@XmlRootElement(name = "IfcPropertyDefinitionElement")
public class IfcPropertyDefinitionImpl extends IfcRootImpl implements IfcPropertyDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPropertyDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPropertyDefinition();
	}

} //IfcPropertyDefinitionImpl
