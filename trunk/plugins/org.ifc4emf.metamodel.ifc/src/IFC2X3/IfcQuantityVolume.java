/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcQuantityVolumeImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Quantity Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcQuantityVolume#getVolumeValue <em>Volume Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcQuantityVolume()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcQuantityVolumeImplAdapter.class)
public interface IfcQuantityVolume extends IfcPhysicalSimpleQuantity {
	/**
	 * Returns the value of the '<em><b>Volume Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Value</em>' attribute.
	 * @see #isSetVolumeValue()
	 * @see #unsetVolumeValue()
	 * @see #setVolumeValue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcQuantityVolume_VolumeValue()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getVolumeValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcQuantityVolume#getVolumeValue <em>Volume Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Value</em>' attribute.
	 * @see #isSetVolumeValue()
	 * @see #unsetVolumeValue()
	 * @see #getVolumeValue()
	 * @generated
	 */
	void setVolumeValue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcQuantityVolume#getVolumeValue <em>Volume Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVolumeValue()
	 * @see #getVolumeValue()
	 * @see #setVolumeValue(Double)
	 * @generated
	 */
	void unsetVolumeValue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcQuantityVolume#getVolumeValue <em>Volume Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Volume Value</em>' attribute is set.
	 * @see #unsetVolumeValue()
	 * @see #getVolumeValue()
	 * @see #setVolumeValue(Double)
	 * @generated
	 */
	boolean isSetVolumeValue();

} // IfcQuantityVolume
