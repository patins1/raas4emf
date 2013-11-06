/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcLocalTimeImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Local Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcLocalTime#getHourComponent <em>Hour Component</em>}</li>
 *   <li>{@link IFC2X3.IfcLocalTime#getMinuteComponent <em>Minute Component</em>}</li>
 *   <li>{@link IFC2X3.IfcLocalTime#getSecondComponent <em>Second Component</em>}</li>
 *   <li>{@link IFC2X3.IfcLocalTime#getZone <em>Zone</em>}</li>
 *   <li>{@link IFC2X3.IfcLocalTime#getDaylightSavingOffset <em>Daylight Saving Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcLocalTime()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcLocalTimeImplAdapter.class)
public interface IfcLocalTime extends IfcDateTimeSelect, IfcObjectReferenceSelect {
	/**
	 * Returns the value of the '<em><b>Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' reference.
	 * @see #setZone(IfcCoordinatedUniversalTimeOffset)
	 * @see IFC2X3.IFC2X3Package#getIfcLocalTime_Zone()
	 * @model
	 * @generated
	 */
	IfcCoordinatedUniversalTimeOffset getZone();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLocalTime#getZone <em>Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' reference.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(IfcCoordinatedUniversalTimeOffset value);

	/**
	 * Returns the value of the '<em><b>Daylight Saving Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daylight Saving Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daylight Saving Offset</em>' attribute.
	 * @see #isSetDaylightSavingOffset()
	 * @see #unsetDaylightSavingOffset()
	 * @see #setDaylightSavingOffset(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcLocalTime_DaylightSavingOffset()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER"
	 * @generated
	 */
	Integer getDaylightSavingOffset();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLocalTime#getDaylightSavingOffset <em>Daylight Saving Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daylight Saving Offset</em>' attribute.
	 * @see #isSetDaylightSavingOffset()
	 * @see #unsetDaylightSavingOffset()
	 * @see #getDaylightSavingOffset()
	 * @generated
	 */
	void setDaylightSavingOffset(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcLocalTime#getDaylightSavingOffset <em>Daylight Saving Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDaylightSavingOffset()
	 * @see #getDaylightSavingOffset()
	 * @see #setDaylightSavingOffset(Integer)
	 * @generated
	 */
	void unsetDaylightSavingOffset();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLocalTime#getDaylightSavingOffset <em>Daylight Saving Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Daylight Saving Offset</em>' attribute is set.
	 * @see #unsetDaylightSavingOffset()
	 * @see #getDaylightSavingOffset()
	 * @see #setDaylightSavingOffset(Integer)
	 * @generated
	 */
	boolean isSetDaylightSavingOffset();

	/**
	 * Returns the value of the '<em><b>Second Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Component</em>' attribute.
	 * @see #isSetSecondComponent()
	 * @see #unsetSecondComponent()
	 * @see #setSecondComponent(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcLocalTime_SecondComponent()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getSecondComponent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLocalTime#getSecondComponent <em>Second Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Component</em>' attribute.
	 * @see #isSetSecondComponent()
	 * @see #unsetSecondComponent()
	 * @see #getSecondComponent()
	 * @generated
	 */
	void setSecondComponent(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcLocalTime#getSecondComponent <em>Second Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecondComponent()
	 * @see #getSecondComponent()
	 * @see #setSecondComponent(Double)
	 * @generated
	 */
	void unsetSecondComponent();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLocalTime#getSecondComponent <em>Second Component</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Second Component</em>' attribute is set.
	 * @see #unsetSecondComponent()
	 * @see #getSecondComponent()
	 * @see #setSecondComponent(Double)
	 * @generated
	 */
	boolean isSetSecondComponent();

	/**
	 * Returns the value of the '<em><b>Minute Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minute Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute Component</em>' attribute.
	 * @see #isSetMinuteComponent()
	 * @see #unsetMinuteComponent()
	 * @see #setMinuteComponent(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcLocalTime_MinuteComponent()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER"
	 * @generated
	 */
	Integer getMinuteComponent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLocalTime#getMinuteComponent <em>Minute Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute Component</em>' attribute.
	 * @see #isSetMinuteComponent()
	 * @see #unsetMinuteComponent()
	 * @see #getMinuteComponent()
	 * @generated
	 */
	void setMinuteComponent(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcLocalTime#getMinuteComponent <em>Minute Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinuteComponent()
	 * @see #getMinuteComponent()
	 * @see #setMinuteComponent(Integer)
	 * @generated
	 */
	void unsetMinuteComponent();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLocalTime#getMinuteComponent <em>Minute Component</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minute Component</em>' attribute is set.
	 * @see #unsetMinuteComponent()
	 * @see #getMinuteComponent()
	 * @see #setMinuteComponent(Integer)
	 * @generated
	 */
	boolean isSetMinuteComponent();

	/**
	 * Returns the value of the '<em><b>Hour Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hour Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour Component</em>' attribute.
	 * @see #isSetHourComponent()
	 * @see #unsetHourComponent()
	 * @see #setHourComponent(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcLocalTime_HourComponent()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER" required="true"
	 * @generated
	 */
	Integer getHourComponent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLocalTime#getHourComponent <em>Hour Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour Component</em>' attribute.
	 * @see #isSetHourComponent()
	 * @see #unsetHourComponent()
	 * @see #getHourComponent()
	 * @generated
	 */
	void setHourComponent(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcLocalTime#getHourComponent <em>Hour Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHourComponent()
	 * @see #getHourComponent()
	 * @see #setHourComponent(Integer)
	 * @generated
	 */
	void unsetHourComponent();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcLocalTime#getHourComponent <em>Hour Component</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hour Component</em>' attribute is set.
	 * @see #unsetHourComponent()
	 * @see #getHourComponent()
	 * @see #setHourComponent(Integer)
	 * @generated
	 */
	boolean isSetHourComponent();

} // IfcLocalTime
