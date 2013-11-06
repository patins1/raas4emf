/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRibPlateProfilePropertiesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rib Plate Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRibPlateProfileProperties#getThickness <em>Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcRibPlateProfileProperties#getRibHeight <em>Rib Height</em>}</li>
 *   <li>{@link IFC2X3.IfcRibPlateProfileProperties#getRibWidth <em>Rib Width</em>}</li>
 *   <li>{@link IFC2X3.IfcRibPlateProfileProperties#getRibSpacing <em>Rib Spacing</em>}</li>
 *   <li>{@link IFC2X3.IfcRibPlateProfileProperties#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRibPlateProfileProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRibPlateProfilePropertiesImplAdapter.class)
public interface IfcRibPlateProfileProperties extends IfcProfileProperties {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcRibPlateDirectionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see IFC2X3.IfcRibPlateDirectionEnum
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(IfcRibPlateDirectionEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcRibPlateProfileProperties_Direction()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcRibPlateDirectionEnum getDirection();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRibPlateProfileProperties#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see IFC2X3.IfcRibPlateDirectionEnum
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(IfcRibPlateDirectionEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRibPlateProfileProperties#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(IfcRibPlateDirectionEnum)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRibPlateProfileProperties#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(IfcRibPlateDirectionEnum)
	 * @generated
	 */
	boolean isSetDirection();

	/**
	 * Returns the value of the '<em><b>Rib Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rib Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rib Spacing</em>' attribute.
	 * @see #isSetRibSpacing()
	 * @see #unsetRibSpacing()
	 * @see #setRibSpacing(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRibPlateProfileProperties_RibSpacing()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getRibSpacing();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRibPlateProfileProperties#getRibSpacing <em>Rib Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Spacing</em>' attribute.
	 * @see #isSetRibSpacing()
	 * @see #unsetRibSpacing()
	 * @see #getRibSpacing()
	 * @generated
	 */
	void setRibSpacing(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRibPlateProfileProperties#getRibSpacing <em>Rib Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRibSpacing()
	 * @see #getRibSpacing()
	 * @see #setRibSpacing(Double)
	 * @generated
	 */
	void unsetRibSpacing();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRibPlateProfileProperties#getRibSpacing <em>Rib Spacing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rib Spacing</em>' attribute is set.
	 * @see #unsetRibSpacing()
	 * @see #getRibSpacing()
	 * @see #setRibSpacing(Double)
	 * @generated
	 */
	boolean isSetRibSpacing();

	/**
	 * Returns the value of the '<em><b>Rib Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rib Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rib Width</em>' attribute.
	 * @see #isSetRibWidth()
	 * @see #unsetRibWidth()
	 * @see #setRibWidth(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRibPlateProfileProperties_RibWidth()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getRibWidth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRibPlateProfileProperties#getRibWidth <em>Rib Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Width</em>' attribute.
	 * @see #isSetRibWidth()
	 * @see #unsetRibWidth()
	 * @see #getRibWidth()
	 * @generated
	 */
	void setRibWidth(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRibPlateProfileProperties#getRibWidth <em>Rib Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRibWidth()
	 * @see #getRibWidth()
	 * @see #setRibWidth(Double)
	 * @generated
	 */
	void unsetRibWidth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRibPlateProfileProperties#getRibWidth <em>Rib Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rib Width</em>' attribute is set.
	 * @see #unsetRibWidth()
	 * @see #getRibWidth()
	 * @see #setRibWidth(Double)
	 * @generated
	 */
	boolean isSetRibWidth();

	/**
	 * Returns the value of the '<em><b>Rib Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rib Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rib Height</em>' attribute.
	 * @see #isSetRibHeight()
	 * @see #unsetRibHeight()
	 * @see #setRibHeight(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRibPlateProfileProperties_RibHeight()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getRibHeight();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRibPlateProfileProperties#getRibHeight <em>Rib Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Height</em>' attribute.
	 * @see #isSetRibHeight()
	 * @see #unsetRibHeight()
	 * @see #getRibHeight()
	 * @generated
	 */
	void setRibHeight(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRibPlateProfileProperties#getRibHeight <em>Rib Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRibHeight()
	 * @see #getRibHeight()
	 * @see #setRibHeight(Double)
	 * @generated
	 */
	void unsetRibHeight();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRibPlateProfileProperties#getRibHeight <em>Rib Height</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rib Height</em>' attribute is set.
	 * @see #unsetRibHeight()
	 * @see #getRibHeight()
	 * @see #setRibHeight(Double)
	 * @generated
	 */
	boolean isSetRibHeight();

	/**
	 * Returns the value of the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thickness</em>' attribute.
	 * @see #isSetThickness()
	 * @see #unsetThickness()
	 * @see #setThickness(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRibPlateProfileProperties_Thickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRibPlateProfileProperties#getThickness <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thickness</em>' attribute.
	 * @see #isSetThickness()
	 * @see #unsetThickness()
	 * @see #getThickness()
	 * @generated
	 */
	void setThickness(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRibPlateProfileProperties#getThickness <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThickness()
	 * @see #getThickness()
	 * @see #setThickness(Double)
	 * @generated
	 */
	void unsetThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRibPlateProfileProperties#getThickness <em>Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thickness</em>' attribute is set.
	 * @see #unsetThickness()
	 * @see #getThickness()
	 * @see #setThickness(Double)
	 * @generated
	 */
	boolean isSetThickness();

} // IfcRibPlateProfileProperties
