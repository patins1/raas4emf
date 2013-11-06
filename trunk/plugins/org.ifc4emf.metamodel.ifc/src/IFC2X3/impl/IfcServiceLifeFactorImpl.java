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
import IFC2X3.IfcMeasureValue;
import IFC2X3.IfcServiceLifeFactor;
import IFC2X3.IfcServiceLifeFactorTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Service Life Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcServiceLifeFactorImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcServiceLifeFactorImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcServiceLifeFactorImpl#getMostUsedValue <em>Most Used Value</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcServiceLifeFactorImpl#getLowerValue <em>Lower Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcServiceLifeFactor")
@XmlRootElement(name = "IfcServiceLifeFactorElement")
public class IfcServiceLifeFactorImpl extends IfcPropertySetDefinitionImpl implements IfcServiceLifeFactor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcServiceLifeFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcServiceLifeFactor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureValue getUpperValue() {
		return (IfcMeasureValue)eGet(IFC2X3Package.eINSTANCE.getIfcServiceLifeFactor_UpperValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperValue(IfcMeasureValue newUpperValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcServiceLifeFactor_UpperValue(), newUpperValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureValue getMostUsedValue() {
		return (IfcMeasureValue)eGet(IFC2X3Package.eINSTANCE.getIfcServiceLifeFactor_MostUsedValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMostUsedValue(IfcMeasureValue newMostUsedValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcServiceLifeFactor_MostUsedValue(), newMostUsedValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureValue getLowerValue() {
		return (IfcMeasureValue)eGet(IFC2X3Package.eINSTANCE.getIfcServiceLifeFactor_LowerValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerValue(IfcMeasureValue newLowerValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcServiceLifeFactor_LowerValue(), newLowerValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcServiceLifeFactorTypeEnum getPredefinedType() {
		return (IfcServiceLifeFactorTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcServiceLifeFactor_PredefinedType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcServiceLifeFactorTypeEnum newPredefinedType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcServiceLifeFactor_PredefinedType(), newPredefinedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPredefinedType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcServiceLifeFactor_PredefinedType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredefinedType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcServiceLifeFactor_PredefinedType());
	}

} //IfcServiceLifeFactorImpl
