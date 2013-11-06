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
import IFC2X3.IfcCurrencyRelationship;
import IFC2X3.IfcDateAndTime;
import IFC2X3.IfcLibraryInformation;
import IFC2X3.IfcMonetaryUnit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Currency Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcCurrencyRelationshipImpl#getRelatingMonetaryUnit <em>Relating Monetary Unit</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCurrencyRelationshipImpl#getRelatedMonetaryUnit <em>Related Monetary Unit</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCurrencyRelationshipImpl#getExchangeRate <em>Exchange Rate</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCurrencyRelationshipImpl#getRateDateTime <em>Rate Date Time</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCurrencyRelationshipImpl#getRateSource <em>Rate Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCurrencyRelationship")
@XmlRootElement(name = "IfcCurrencyRelationshipElement")
public class IfcCurrencyRelationshipImpl extends CDOObjectImpl implements IfcCurrencyRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCurrencyRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCurrencyRelationship();
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
	public IfcLibraryInformation getRateSource() {
		return (IfcLibraryInformation)eGet(IFC2X3Package.eINSTANCE.getIfcCurrencyRelationship_RateSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateSource(IfcLibraryInformation newRateSource) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCurrencyRelationship_RateSource(), newRateSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMonetaryUnit getRelatedMonetaryUnit() {
		return (IfcMonetaryUnit)eGet(IFC2X3Package.eINSTANCE.getIfcCurrencyRelationship_RelatedMonetaryUnit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedMonetaryUnit(IfcMonetaryUnit newRelatedMonetaryUnit) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCurrencyRelationship_RelatedMonetaryUnit(), newRelatedMonetaryUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMonetaryUnit getRelatingMonetaryUnit() {
		return (IfcMonetaryUnit)eGet(IFC2X3Package.eINSTANCE.getIfcCurrencyRelationship_RelatingMonetaryUnit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingMonetaryUnit(IfcMonetaryUnit newRelatingMonetaryUnit) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCurrencyRelationship_RelatingMonetaryUnit(), newRelatingMonetaryUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateAndTime getRateDateTime() {
		return (IfcDateAndTime)eGet(IFC2X3Package.eINSTANCE.getIfcCurrencyRelationship_RateDateTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateDateTime(IfcDateAndTime newRateDateTime) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCurrencyRelationship_RateDateTime(), newRateDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getExchangeRate() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCurrencyRelationship_ExchangeRate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangeRate(Double newExchangeRate) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCurrencyRelationship_ExchangeRate(), newExchangeRate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExchangeRate() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCurrencyRelationship_ExchangeRate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExchangeRate() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCurrencyRelationship_ExchangeRate());
	}

} //IfcCurrencyRelationshipImpl
