/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcReinforcementBarProperties;
import IFC2X3.IfcReinforcingBarRoleEnum;
import IFC2X3.IfcSectionProperties;
import IFC2X3.IfcSectionReinforcementProperties;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Section Reinforcement Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSectionReinforcementPropertiesImpl#getLongitudinalStartPosition <em>Longitudinal Start Position</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSectionReinforcementPropertiesImpl#getLongitudinalEndPosition <em>Longitudinal End Position</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSectionReinforcementPropertiesImpl#getTransversePosition <em>Transverse Position</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSectionReinforcementPropertiesImpl#getReinforcementRole <em>Reinforcement Role</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSectionReinforcementPropertiesImpl#getSectionDefinition <em>Section Definition</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSectionReinforcementPropertiesImpl#getCrossSectionReinforcementDefinitions <em>Cross Section Reinforcement Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSectionReinforcementProperties")
@XmlRootElement(name = "IfcSectionReinforcementPropertiesElement")
public class IfcSectionReinforcementPropertiesImpl extends CDOObjectImpl implements IfcSectionReinforcementProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSectionReinforcementPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSectionReinforcementProperties();
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSectionProperties getSectionDefinition() {
		return (IfcSectionProperties)eGet(IFC2X3Package.eINSTANCE.getIfcSectionReinforcementProperties_SectionDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionDefinition(IfcSectionProperties newSectionDefinition) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSectionReinforcementProperties_SectionDefinition(), newSectionDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcReinforcementBarProperties> getCrossSectionReinforcementDefinitions() {
		return (EList<IfcReinforcementBarProperties>)eGet(IFC2X3Package.eINSTANCE.getIfcSectionReinforcementProperties_CrossSectionReinforcementDefinitions(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingBarRoleEnum getReinforcementRole() {
		return (IfcReinforcingBarRoleEnum)eGet(IFC2X3Package.eINSTANCE.getIfcSectionReinforcementProperties_ReinforcementRole(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReinforcementRole(IfcReinforcingBarRoleEnum newReinforcementRole) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSectionReinforcementProperties_ReinforcementRole(), newReinforcementRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReinforcementRole() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSectionReinforcementProperties_ReinforcementRole());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReinforcementRole() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSectionReinforcementProperties_ReinforcementRole());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTransversePosition() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSectionReinforcementProperties_TransversePosition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransversePosition(Double newTransversePosition) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSectionReinforcementProperties_TransversePosition(), newTransversePosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransversePosition() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSectionReinforcementProperties_TransversePosition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransversePosition() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSectionReinforcementProperties_TransversePosition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLongitudinalEndPosition() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSectionReinforcementProperties_LongitudinalEndPosition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalEndPosition(Double newLongitudinalEndPosition) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSectionReinforcementProperties_LongitudinalEndPosition(), newLongitudinalEndPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLongitudinalEndPosition() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSectionReinforcementProperties_LongitudinalEndPosition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLongitudinalEndPosition() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSectionReinforcementProperties_LongitudinalEndPosition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLongitudinalStartPosition() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSectionReinforcementProperties_LongitudinalStartPosition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalStartPosition(Double newLongitudinalStartPosition) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSectionReinforcementProperties_LongitudinalStartPosition(), newLongitudinalStartPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLongitudinalStartPosition() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSectionReinforcementProperties_LongitudinalStartPosition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLongitudinalStartPosition() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSectionReinforcementProperties_LongitudinalStartPosition());
	}

} //IfcSectionReinforcementPropertiesImpl
