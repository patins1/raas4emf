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
import IFC2X3.IfcPropertySetDefinition;
import IFC2X3.IfcRelDefinesByProperties;
import IFC2X3.IfcTypeObject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Set Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcPropertySetDefinitionImpl#getPropertyDefinitionOf <em>Property Definition Of</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPropertySetDefinitionImpl#getDefinesType <em>Defines Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPropertySetDefinition")
@XmlSeeAlso({ IfcWindowPanelPropertiesImpl.class, IfcElectricalBasePropertiesImpl.class, IfcElementQuantityImpl.class, IfcEnergyPropertiesImpl.class, IfcSoundValueImpl.class, IfcPermeableCoveringPropertiesImpl.class, IfcServiceLifeFactorImpl.class, IfcSoundPropertiesImpl.class,
		IfcWindowLiningPropertiesImpl.class, IfcSpaceThermalLoadPropertiesImpl.class, IfcReinforcementDefinitionPropertiesImpl.class, IfcDoorPanelPropertiesImpl.class, IfcDoorLiningPropertiesImpl.class, IfcFluidFlowPropertiesImpl.class, IfcPropertySetImpl.class })
@XmlRootElement(name = "IfcPropertySetDefinitionElement")
public class IfcPropertySetDefinitionImpl extends IfcPropertyDefinitionImpl implements IfcPropertySetDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPropertySetDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPropertySetDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelDefinesByProperties> getPropertyDefinitionOf() {
		return (EList<IfcRelDefinesByProperties>)eGet(IFC2X3Package.eINSTANCE.getIfcPropertySetDefinition_PropertyDefinitionOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTypeObject getDefinesType() {
		return (IfcTypeObject)eGet(IFC2X3Package.eINSTANCE.getIfcPropertySetDefinition_DefinesType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinesType(IfcTypeObject newDefinesType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPropertySetDefinition_DefinesType(), newDefinesType);
	}

} //IfcPropertySetDefinitionImpl
