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

import IFC2X3.jaxb.IfcCoordinatedUniversalTimeOffsetImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Coordinated Universal Time Offset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCoordinatedUniversalTimeOffset#getHourOffset <em>Hour Offset</em>}</li>
 *   <li>{@link IFC2X3.IfcCoordinatedUniversalTimeOffset#getMinuteOffset <em>Minute Offset</em>}</li>
 *   <li>{@link IFC2X3.IfcCoordinatedUniversalTimeOffset#getSense <em>Sense</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCoordinatedUniversalTimeOffset()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcCoordinatedUniversalTimeOffsetImplAdapter.class)
public interface IfcCoordinatedUniversalTimeOffset extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Sense</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcAheadOrBehind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sense</em>' attribute.
	 * @see IFC2X3.IfcAheadOrBehind
	 * @see #isSetSense()
	 * @see #unsetSense()
	 * @see #setSense(IfcAheadOrBehind)
	 * @see IFC2X3.IFC2X3Package#getIfcCoordinatedUniversalTimeOffset_Sense()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcAheadOrBehind getSense();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCoordinatedUniversalTimeOffset#getSense <em>Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sense</em>' attribute.
	 * @see IFC2X3.IfcAheadOrBehind
	 * @see #isSetSense()
	 * @see #unsetSense()
	 * @see #getSense()
	 * @generated
	 */
	void setSense(IfcAheadOrBehind value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCoordinatedUniversalTimeOffset#getSense <em>Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSense()
	 * @see #getSense()
	 * @see #setSense(IfcAheadOrBehind)
	 * @generated
	 */
	void unsetSense();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCoordinatedUniversalTimeOffset#getSense <em>Sense</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sense</em>' attribute is set.
	 * @see #unsetSense()
	 * @see #getSense()
	 * @see #setSense(IfcAheadOrBehind)
	 * @generated
	 */
	boolean isSetSense();

	/**
	 * Returns the value of the '<em><b>Minute Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minute Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute Offset</em>' attribute.
	 * @see #isSetMinuteOffset()
	 * @see #unsetMinuteOffset()
	 * @see #setMinuteOffset(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcCoordinatedUniversalTimeOffset_MinuteOffset()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER"
	 * @generated
	 */
	Integer getMinuteOffset();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCoordinatedUniversalTimeOffset#getMinuteOffset <em>Minute Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute Offset</em>' attribute.
	 * @see #isSetMinuteOffset()
	 * @see #unsetMinuteOffset()
	 * @see #getMinuteOffset()
	 * @generated
	 */
	void setMinuteOffset(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCoordinatedUniversalTimeOffset#getMinuteOffset <em>Minute Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinuteOffset()
	 * @see #getMinuteOffset()
	 * @see #setMinuteOffset(Integer)
	 * @generated
	 */
	void unsetMinuteOffset();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCoordinatedUniversalTimeOffset#getMinuteOffset <em>Minute Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minute Offset</em>' attribute is set.
	 * @see #unsetMinuteOffset()
	 * @see #getMinuteOffset()
	 * @see #setMinuteOffset(Integer)
	 * @generated
	 */
	boolean isSetMinuteOffset();

	/**
	 * Returns the value of the '<em><b>Hour Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hour Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour Offset</em>' attribute.
	 * @see #isSetHourOffset()
	 * @see #unsetHourOffset()
	 * @see #setHourOffset(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcCoordinatedUniversalTimeOffset_HourOffset()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER" required="true"
	 * @generated
	 */
	Integer getHourOffset();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCoordinatedUniversalTimeOffset#getHourOffset <em>Hour Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour Offset</em>' attribute.
	 * @see #isSetHourOffset()
	 * @see #unsetHourOffset()
	 * @see #getHourOffset()
	 * @generated
	 */
	void setHourOffset(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCoordinatedUniversalTimeOffset#getHourOffset <em>Hour Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHourOffset()
	 * @see #getHourOffset()
	 * @see #setHourOffset(Integer)
	 * @generated
	 */
	void unsetHourOffset();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCoordinatedUniversalTimeOffset#getHourOffset <em>Hour Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hour Offset</em>' attribute is set.
	 * @see #unsetHourOffset()
	 * @see #getHourOffset()
	 * @see #setHourOffset(Integer)
	 * @generated
	 */
	boolean isSetHourOffset();

} // IfcCoordinatedUniversalTimeOffset
