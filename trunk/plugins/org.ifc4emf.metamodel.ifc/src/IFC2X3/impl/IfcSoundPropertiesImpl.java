/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcSoundProperties;
import IFC2X3.IfcSoundScaleEnum;
import IFC2X3.IfcSoundValue;

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
 * An implementation of the model object '<em><b>Ifc Sound Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSoundPropertiesImpl#getIsAttenuating <em>Is Attenuating</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSoundPropertiesImpl#getSoundScale <em>Sound Scale</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSoundPropertiesImpl#getSoundValues <em>Sound Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSoundProperties")
@XmlRootElement(name = "IfcSoundPropertiesElement")
public class IfcSoundPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcSoundProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSoundPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSoundProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcSoundValue> getSoundValues() {
		return (EList<IfcSoundValue>)eGet(IFC2X3Package.eINSTANCE.getIfcSoundProperties_SoundValues(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSoundScaleEnum getSoundScale() {
		return (IfcSoundScaleEnum)eGet(IFC2X3Package.eINSTANCE.getIfcSoundProperties_SoundScale(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoundScale(IfcSoundScaleEnum newSoundScale) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSoundProperties_SoundScale(), newSoundScale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSoundScale() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSoundProperties_SoundScale());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSoundScale() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSoundProperties_SoundScale());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAttenuating() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcSoundProperties_IsAttenuating(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAttenuating(Boolean newIsAttenuating) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSoundProperties_IsAttenuating(), newIsAttenuating);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsAttenuating() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSoundProperties_IsAttenuating());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsAttenuating() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSoundProperties_IsAttenuating());
	}

} //IfcSoundPropertiesImpl
