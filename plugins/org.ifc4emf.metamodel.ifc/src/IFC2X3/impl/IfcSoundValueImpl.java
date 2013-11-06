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
import IFC2X3.IfcDerivedMeasureValue;
import IFC2X3.IfcSoundValue;
import IFC2X3.IfcTimeSeries;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Sound Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSoundValueImpl#getSoundLevelTimeSeries <em>Sound Level Time Series</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSoundValueImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSoundValueImpl#getSoundLevelSingleValue <em>Sound Level Single Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSoundValue")
@XmlRootElement(name = "IfcSoundValueElement")
public class IfcSoundValueImpl extends IfcPropertySetDefinitionImpl implements IfcSoundValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSoundValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSoundValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDerivedMeasureValue getSoundLevelSingleValue() {
		return (IfcDerivedMeasureValue)eGet(IFC2X3Package.eINSTANCE.getIfcSoundValue_SoundLevelSingleValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoundLevelSingleValue(IfcDerivedMeasureValue newSoundLevelSingleValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSoundValue_SoundLevelSingleValue(), newSoundLevelSingleValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getSoundLevelTimeSeries() {
		return (IfcTimeSeries)eGet(IFC2X3Package.eINSTANCE.getIfcSoundValue_SoundLevelTimeSeries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoundLevelTimeSeries(IfcTimeSeries newSoundLevelTimeSeries) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSoundValue_SoundLevelTimeSeries(), newSoundLevelTimeSeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFrequency() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSoundValue_Frequency(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(Double newFrequency) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSoundValue_Frequency(), newFrequency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFrequency() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSoundValue_Frequency());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrequency() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSoundValue_Frequency());
	}

} //IfcSoundValueImpl
