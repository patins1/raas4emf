/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcProfileDef;
import IFC2X3.IfcSectionProperties;
import IFC2X3.IfcSectionTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Section Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSectionPropertiesImpl#getSectionType <em>Section Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSectionPropertiesImpl#getStartProfile <em>Start Profile</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSectionPropertiesImpl#getEndProfile <em>End Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSectionProperties")
@XmlRootElement(name = "IfcSectionPropertiesElement")
public class IfcSectionPropertiesImpl extends CDOObjectImpl implements IfcSectionProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSectionPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSectionProperties();
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
	public IfcProfileDef getEndProfile() {
		return (IfcProfileDef)eGet(IFC2X3Package.eINSTANCE.getIfcSectionProperties_EndProfile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndProfile(IfcProfileDef newEndProfile) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSectionProperties_EndProfile(), newEndProfile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileDef getStartProfile() {
		return (IfcProfileDef)eGet(IFC2X3Package.eINSTANCE.getIfcSectionProperties_StartProfile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartProfile(IfcProfileDef newStartProfile) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSectionProperties_StartProfile(), newStartProfile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSectionTypeEnum getSectionType() {
		return (IfcSectionTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcSectionProperties_SectionType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionType(IfcSectionTypeEnum newSectionType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSectionProperties_SectionType(), newSectionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSectionType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSectionProperties_SectionType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSectionType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSectionProperties_SectionType());
	}

} //IfcSectionPropertiesImpl
