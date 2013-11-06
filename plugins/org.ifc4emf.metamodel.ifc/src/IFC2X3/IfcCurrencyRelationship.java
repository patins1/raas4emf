/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcCurrencyRelationshipImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Currency Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCurrencyRelationship#getRelatingMonetaryUnit <em>Relating Monetary Unit</em>}</li>
 *   <li>{@link IFC2X3.IfcCurrencyRelationship#getRelatedMonetaryUnit <em>Related Monetary Unit</em>}</li>
 *   <li>{@link IFC2X3.IfcCurrencyRelationship#getExchangeRate <em>Exchange Rate</em>}</li>
 *   <li>{@link IFC2X3.IfcCurrencyRelationship#getRateDateTime <em>Rate Date Time</em>}</li>
 *   <li>{@link IFC2X3.IfcCurrencyRelationship#getRateSource <em>Rate Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCurrencyRelationship()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcCurrencyRelationshipImplAdapter.class)
public interface IfcCurrencyRelationship extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Rate Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Source</em>' reference.
	 * @see #setRateSource(IfcLibraryInformation)
	 * @see IFC2X3.IFC2X3Package#getIfcCurrencyRelationship_RateSource()
	 * @model
	 * @generated
	 */
	IfcLibraryInformation getRateSource();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCurrencyRelationship#getRateSource <em>Rate Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Source</em>' reference.
	 * @see #getRateSource()
	 * @generated
	 */
	void setRateSource(IfcLibraryInformation value);

	/**
	 * Returns the value of the '<em><b>Related Monetary Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Monetary Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Monetary Unit</em>' reference.
	 * @see #setRelatedMonetaryUnit(IfcMonetaryUnit)
	 * @see IFC2X3.IFC2X3Package#getIfcCurrencyRelationship_RelatedMonetaryUnit()
	 * @model required="true"
	 * @generated
	 */
	IfcMonetaryUnit getRelatedMonetaryUnit();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCurrencyRelationship#getRelatedMonetaryUnit <em>Related Monetary Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Monetary Unit</em>' reference.
	 * @see #getRelatedMonetaryUnit()
	 * @generated
	 */
	void setRelatedMonetaryUnit(IfcMonetaryUnit value);

	/**
	 * Returns the value of the '<em><b>Relating Monetary Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Monetary Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Monetary Unit</em>' reference.
	 * @see #setRelatingMonetaryUnit(IfcMonetaryUnit)
	 * @see IFC2X3.IFC2X3Package#getIfcCurrencyRelationship_RelatingMonetaryUnit()
	 * @model required="true"
	 * @generated
	 */
	IfcMonetaryUnit getRelatingMonetaryUnit();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCurrencyRelationship#getRelatingMonetaryUnit <em>Relating Monetary Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Monetary Unit</em>' reference.
	 * @see #getRelatingMonetaryUnit()
	 * @generated
	 */
	void setRelatingMonetaryUnit(IfcMonetaryUnit value);

	/**
	 * Returns the value of the '<em><b>Rate Date Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Date Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Date Time</em>' reference.
	 * @see #setRateDateTime(IfcDateAndTime)
	 * @see IFC2X3.IFC2X3Package#getIfcCurrencyRelationship_RateDateTime()
	 * @model required="true"
	 * @generated
	 */
	IfcDateAndTime getRateDateTime();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCurrencyRelationship#getRateDateTime <em>Rate Date Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Date Time</em>' reference.
	 * @see #getRateDateTime()
	 * @generated
	 */
	void setRateDateTime(IfcDateAndTime value);

	/**
	 * Returns the value of the '<em><b>Exchange Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Rate</em>' attribute.
	 * @see #isSetExchangeRate()
	 * @see #unsetExchangeRate()
	 * @see #setExchangeRate(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcCurrencyRelationship_ExchangeRate()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getExchangeRate();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCurrencyRelationship#getExchangeRate <em>Exchange Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Rate</em>' attribute.
	 * @see #isSetExchangeRate()
	 * @see #unsetExchangeRate()
	 * @see #getExchangeRate()
	 * @generated
	 */
	void setExchangeRate(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCurrencyRelationship#getExchangeRate <em>Exchange Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExchangeRate()
	 * @see #getExchangeRate()
	 * @see #setExchangeRate(Double)
	 * @generated
	 */
	void unsetExchangeRate();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCurrencyRelationship#getExchangeRate <em>Exchange Rate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Exchange Rate</em>' attribute is set.
	 * @see #unsetExchangeRate()
	 * @see #getExchangeRate()
	 * @see #setExchangeRate(Double)
	 * @generated
	 */
	boolean isSetExchangeRate();

} // IfcCurrencyRelationship
