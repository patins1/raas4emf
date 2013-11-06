/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcReinforcementDefinitionProperties;
import IFC2X3.IfcSectionReinforcementProperties;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Reinforcement Definition Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcReinforcementDefinitionPropertiesImpl#getDefinitionType <em>Definition Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcReinforcementDefinitionPropertiesImpl#getReinforcementSectionDefinitions <em>Reinforcement Section Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcReinforcementDefinitionProperties")
@XmlRootElement(name = "IfcReinforcementDefinitionPropertiesElement")
public class IfcReinforcementDefinitionPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcReinforcementDefinitionProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcReinforcementDefinitionPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcReinforcementDefinitionProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcSectionReinforcementProperties> getReinforcementSectionDefinitions() {
		return (EList<IfcSectionReinforcementProperties>)eGet(IFC2X3Package.eINSTANCE.getIfcReinforcementDefinitionProperties_ReinforcementSectionDefinitions(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefinitionType() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcReinforcementDefinitionProperties_DefinitionType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionType(String newDefinitionType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcReinforcementDefinitionProperties_DefinitionType(), newDefinitionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefinitionType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcReinforcementDefinitionProperties_DefinitionType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefinitionType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcReinforcementDefinitionProperties_DefinitionType());
	}

} //IfcReinforcementDefinitionPropertiesImpl
