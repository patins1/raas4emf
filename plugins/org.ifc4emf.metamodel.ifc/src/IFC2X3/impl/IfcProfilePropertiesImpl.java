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
import IFC2X3.IfcProfileDef;
import IFC2X3.IfcProfileProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcProfilePropertiesImpl#getProfileName <em>Profile Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcProfilePropertiesImpl#getProfileDefinition <em>Profile Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcProfileProperties")
@XmlSeeAlso({ IfcStructuralSteelProfilePropertiesImpl.class, IfcRibPlateProfilePropertiesImpl.class, IfcGeneralProfilePropertiesImpl.class, IfcStructuralProfilePropertiesImpl.class })
@XmlRootElement(name = "IfcProfilePropertiesElement")
public class IfcProfilePropertiesImpl extends CDOObjectImpl implements IfcProfileProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcProfilePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcProfileProperties();
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
	public IfcProfileDef getProfileDefinition() {
		return (IfcProfileDef)eGet(IFC2X3Package.eINSTANCE.getIfcProfileProperties_ProfileDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileDefinition(IfcProfileDef newProfileDefinition) {
		eSet(IFC2X3Package.eINSTANCE.getIfcProfileProperties_ProfileDefinition(), newProfileDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProfileName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcProfileProperties_ProfileName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileName(String newProfileName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcProfileProperties_ProfileName(), newProfileName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProfileName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcProfileProperties_ProfileName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProfileName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcProfileProperties_ProfileName());
	}

} //IfcProfilePropertiesImpl
