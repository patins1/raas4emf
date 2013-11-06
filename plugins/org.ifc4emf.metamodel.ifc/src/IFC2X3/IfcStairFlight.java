/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcStairFlightImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Stair Flight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcStairFlight#getNumberOfRiser <em>Number Of Riser</em>}</li>
 *   <li>{@link IFC2X3.IfcStairFlight#getNumberOfTreads <em>Number Of Treads</em>}</li>
 *   <li>{@link IFC2X3.IfcStairFlight#getRiserHeight <em>Riser Height</em>}</li>
 *   <li>{@link IFC2X3.IfcStairFlight#getTreadLength <em>Tread Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcStairFlight()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcStairFlightImplAdapter.class)
public interface IfcStairFlight extends IfcBuildingElement {
	/**
	 * Returns the value of the '<em><b>Tread Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tread Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tread Length</em>' attribute.
	 * @see #isSetTreadLength()
	 * @see #unsetTreadLength()
	 * @see #setTreadLength(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStairFlight_TreadLength()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getTreadLength();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStairFlight#getTreadLength <em>Tread Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tread Length</em>' attribute.
	 * @see #isSetTreadLength()
	 * @see #unsetTreadLength()
	 * @see #getTreadLength()
	 * @generated
	 */
	void setTreadLength(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStairFlight#getTreadLength <em>Tread Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTreadLength()
	 * @see #getTreadLength()
	 * @see #setTreadLength(Double)
	 * @generated
	 */
	void unsetTreadLength();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStairFlight#getTreadLength <em>Tread Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tread Length</em>' attribute is set.
	 * @see #unsetTreadLength()
	 * @see #getTreadLength()
	 * @see #setTreadLength(Double)
	 * @generated
	 */
	boolean isSetTreadLength();

	/**
	 * Returns the value of the '<em><b>Riser Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Riser Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Riser Height</em>' attribute.
	 * @see #isSetRiserHeight()
	 * @see #unsetRiserHeight()
	 * @see #setRiserHeight(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStairFlight_RiserHeight()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getRiserHeight();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStairFlight#getRiserHeight <em>Riser Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Riser Height</em>' attribute.
	 * @see #isSetRiserHeight()
	 * @see #unsetRiserHeight()
	 * @see #getRiserHeight()
	 * @generated
	 */
	void setRiserHeight(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStairFlight#getRiserHeight <em>Riser Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRiserHeight()
	 * @see #getRiserHeight()
	 * @see #setRiserHeight(Double)
	 * @generated
	 */
	void unsetRiserHeight();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStairFlight#getRiserHeight <em>Riser Height</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Riser Height</em>' attribute is set.
	 * @see #unsetRiserHeight()
	 * @see #getRiserHeight()
	 * @see #setRiserHeight(Double)
	 * @generated
	 */
	boolean isSetRiserHeight();

	/**
	 * Returns the value of the '<em><b>Number Of Treads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Treads</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Treads</em>' attribute.
	 * @see #isSetNumberOfTreads()
	 * @see #unsetNumberOfTreads()
	 * @see #setNumberOfTreads(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcStairFlight_NumberOfTreads()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER"
	 * @generated
	 */
	Integer getNumberOfTreads();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStairFlight#getNumberOfTreads <em>Number Of Treads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Treads</em>' attribute.
	 * @see #isSetNumberOfTreads()
	 * @see #unsetNumberOfTreads()
	 * @see #getNumberOfTreads()
	 * @generated
	 */
	void setNumberOfTreads(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStairFlight#getNumberOfTreads <em>Number Of Treads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberOfTreads()
	 * @see #getNumberOfTreads()
	 * @see #setNumberOfTreads(Integer)
	 * @generated
	 */
	void unsetNumberOfTreads();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStairFlight#getNumberOfTreads <em>Number Of Treads</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Of Treads</em>' attribute is set.
	 * @see #unsetNumberOfTreads()
	 * @see #getNumberOfTreads()
	 * @see #setNumberOfTreads(Integer)
	 * @generated
	 */
	boolean isSetNumberOfTreads();

	/**
	 * Returns the value of the '<em><b>Number Of Riser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Riser</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Riser</em>' attribute.
	 * @see #isSetNumberOfRiser()
	 * @see #unsetNumberOfRiser()
	 * @see #setNumberOfRiser(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcStairFlight_NumberOfRiser()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER"
	 * @generated
	 */
	Integer getNumberOfRiser();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStairFlight#getNumberOfRiser <em>Number Of Riser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Riser</em>' attribute.
	 * @see #isSetNumberOfRiser()
	 * @see #unsetNumberOfRiser()
	 * @see #getNumberOfRiser()
	 * @generated
	 */
	void setNumberOfRiser(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStairFlight#getNumberOfRiser <em>Number Of Riser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberOfRiser()
	 * @see #getNumberOfRiser()
	 * @see #setNumberOfRiser(Integer)
	 * @generated
	 */
	void unsetNumberOfRiser();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStairFlight#getNumberOfRiser <em>Number Of Riser</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Of Riser</em>' attribute is set.
	 * @see #unsetNumberOfRiser()
	 * @see #getNumberOfRiser()
	 * @see #setNumberOfRiser(Integer)
	 * @generated
	 */
	boolean isSetNumberOfRiser();

} // IfcStairFlight
