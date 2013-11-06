/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcDoorLiningPropertiesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Door Lining Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcDoorLiningProperties#getLiningDepth <em>Lining Depth</em>}</li>
 *   <li>{@link IFC2X3.IfcDoorLiningProperties#getLiningThickness <em>Lining Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcDoorLiningProperties#getThresholdDepth <em>Threshold Depth</em>}</li>
 *   <li>{@link IFC2X3.IfcDoorLiningProperties#getThresholdThickness <em>Threshold Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcDoorLiningProperties#getTransomThickness <em>Transom Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcDoorLiningProperties#getTransomOffset <em>Transom Offset</em>}</li>
 *   <li>{@link IFC2X3.IfcDoorLiningProperties#getLiningOffset <em>Lining Offset</em>}</li>
 *   <li>{@link IFC2X3.IfcDoorLiningProperties#getThresholdOffset <em>Threshold Offset</em>}</li>
 *   <li>{@link IFC2X3.IfcDoorLiningProperties#getCasingThickness <em>Casing Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcDoorLiningProperties#getCasingDepth <em>Casing Depth</em>}</li>
 *   <li>{@link IFC2X3.IfcDoorLiningProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcDoorLiningProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcDoorLiningPropertiesImplAdapter.class)
public interface IfcDoorLiningProperties extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Shape Aspect Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape Aspect Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Aspect Style</em>' reference.
	 * @see #setShapeAspectStyle(IfcShapeAspect)
	 * @see IFC2X3.IFC2X3Package#getIfcDoorLiningProperties_ShapeAspectStyle()
	 * @model
	 * @generated
	 */
	IfcShapeAspect getShapeAspectStyle();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDoorLiningProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Aspect Style</em>' reference.
	 * @see #getShapeAspectStyle()
	 * @generated
	 */
	void setShapeAspectStyle(IfcShapeAspect value);

	/**
	 * Returns the value of the '<em><b>Casing Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Casing Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Casing Depth</em>' attribute.
	 * @see #isSetCasingDepth()
	 * @see #unsetCasingDepth()
	 * @see #setCasingDepth(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDoorLiningProperties_CasingDepth()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getCasingDepth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDoorLiningProperties#getCasingDepth <em>Casing Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Casing Depth</em>' attribute.
	 * @see #isSetCasingDepth()
	 * @see #unsetCasingDepth()
	 * @see #getCasingDepth()
	 * @generated
	 */
	void setCasingDepth(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDoorLiningProperties#getCasingDepth <em>Casing Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCasingDepth()
	 * @see #getCasingDepth()
	 * @see #setCasingDepth(Double)
	 * @generated
	 */
	void unsetCasingDepth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDoorLiningProperties#getCasingDepth <em>Casing Depth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Casing Depth</em>' attribute is set.
	 * @see #unsetCasingDepth()
	 * @see #getCasingDepth()
	 * @see #setCasingDepth(Double)
	 * @generated
	 */
	boolean isSetCasingDepth();

	/**
	 * Returns the value of the '<em><b>Casing Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Casing Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Casing Thickness</em>' attribute.
	 * @see #isSetCasingThickness()
	 * @see #unsetCasingThickness()
	 * @see #setCasingThickness(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDoorLiningProperties_CasingThickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getCasingThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDoorLiningProperties#getCasingThickness <em>Casing Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Casing Thickness</em>' attribute.
	 * @see #isSetCasingThickness()
	 * @see #unsetCasingThickness()
	 * @see #getCasingThickness()
	 * @generated
	 */
	void setCasingThickness(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDoorLiningProperties#getCasingThickness <em>Casing Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCasingThickness()
	 * @see #getCasingThickness()
	 * @see #setCasingThickness(Double)
	 * @generated
	 */
	void unsetCasingThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDoorLiningProperties#getCasingThickness <em>Casing Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Casing Thickness</em>' attribute is set.
	 * @see #unsetCasingThickness()
	 * @see #getCasingThickness()
	 * @see #setCasingThickness(Double)
	 * @generated
	 */
	boolean isSetCasingThickness();

	/**
	 * Returns the value of the '<em><b>Threshold Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold Offset</em>' attribute.
	 * @see #isSetThresholdOffset()
	 * @see #unsetThresholdOffset()
	 * @see #setThresholdOffset(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDoorLiningProperties_ThresholdOffset()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getThresholdOffset();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDoorLiningProperties#getThresholdOffset <em>Threshold Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold Offset</em>' attribute.
	 * @see #isSetThresholdOffset()
	 * @see #unsetThresholdOffset()
	 * @see #getThresholdOffset()
	 * @generated
	 */
	void setThresholdOffset(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDoorLiningProperties#getThresholdOffset <em>Threshold Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThresholdOffset()
	 * @see #getThresholdOffset()
	 * @see #setThresholdOffset(Double)
	 * @generated
	 */
	void unsetThresholdOffset();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDoorLiningProperties#getThresholdOffset <em>Threshold Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Threshold Offset</em>' attribute is set.
	 * @see #unsetThresholdOffset()
	 * @see #getThresholdOffset()
	 * @see #setThresholdOffset(Double)
	 * @generated
	 */
	boolean isSetThresholdOffset();

	/**
	 * Returns the value of the '<em><b>Lining Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lining Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lining Offset</em>' attribute.
	 * @see #isSetLiningOffset()
	 * @see #unsetLiningOffset()
	 * @see #setLiningOffset(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDoorLiningProperties_LiningOffset()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getLiningOffset();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDoorLiningProperties#getLiningOffset <em>Lining Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lining Offset</em>' attribute.
	 * @see #isSetLiningOffset()
	 * @see #unsetLiningOffset()
	 * @see #getLiningOffset()
	 * @generated
	 */
	void setLiningOffset(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDoorLiningProperties#getLiningOffset <em>Lining Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLiningOffset()
	 * @see #getLiningOffset()
	 * @see #setLiningOffset(Double)
	 * @generated
	 */
	void unsetLiningOffset();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDoorLiningProperties#getLiningOffset <em>Lining Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lining Offset</em>' attribute is set.
	 * @see #unsetLiningOffset()
	 * @see #getLiningOffset()
	 * @see #setLiningOffset(Double)
	 * @generated
	 */
	boolean isSetLiningOffset();

	/**
	 * Returns the value of the '<em><b>Transom Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transom Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transom Offset</em>' attribute.
	 * @see #isSetTransomOffset()
	 * @see #unsetTransomOffset()
	 * @see #setTransomOffset(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDoorLiningProperties_TransomOffset()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getTransomOffset();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDoorLiningProperties#getTransomOffset <em>Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transom Offset</em>' attribute.
	 * @see #isSetTransomOffset()
	 * @see #unsetTransomOffset()
	 * @see #getTransomOffset()
	 * @generated
	 */
	void setTransomOffset(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDoorLiningProperties#getTransomOffset <em>Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransomOffset()
	 * @see #getTransomOffset()
	 * @see #setTransomOffset(Double)
	 * @generated
	 */
	void unsetTransomOffset();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDoorLiningProperties#getTransomOffset <em>Transom Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transom Offset</em>' attribute is set.
	 * @see #unsetTransomOffset()
	 * @see #getTransomOffset()
	 * @see #setTransomOffset(Double)
	 * @generated
	 */
	boolean isSetTransomOffset();

	/**
	 * Returns the value of the '<em><b>Transom Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transom Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transom Thickness</em>' attribute.
	 * @see #isSetTransomThickness()
	 * @see #unsetTransomThickness()
	 * @see #setTransomThickness(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDoorLiningProperties_TransomThickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getTransomThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDoorLiningProperties#getTransomThickness <em>Transom Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transom Thickness</em>' attribute.
	 * @see #isSetTransomThickness()
	 * @see #unsetTransomThickness()
	 * @see #getTransomThickness()
	 * @generated
	 */
	void setTransomThickness(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDoorLiningProperties#getTransomThickness <em>Transom Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransomThickness()
	 * @see #getTransomThickness()
	 * @see #setTransomThickness(Double)
	 * @generated
	 */
	void unsetTransomThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDoorLiningProperties#getTransomThickness <em>Transom Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transom Thickness</em>' attribute is set.
	 * @see #unsetTransomThickness()
	 * @see #getTransomThickness()
	 * @see #setTransomThickness(Double)
	 * @generated
	 */
	boolean isSetTransomThickness();

	/**
	 * Returns the value of the '<em><b>Threshold Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold Thickness</em>' attribute.
	 * @see #isSetThresholdThickness()
	 * @see #unsetThresholdThickness()
	 * @see #setThresholdThickness(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDoorLiningProperties_ThresholdThickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getThresholdThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDoorLiningProperties#getThresholdThickness <em>Threshold Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold Thickness</em>' attribute.
	 * @see #isSetThresholdThickness()
	 * @see #unsetThresholdThickness()
	 * @see #getThresholdThickness()
	 * @generated
	 */
	void setThresholdThickness(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDoorLiningProperties#getThresholdThickness <em>Threshold Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThresholdThickness()
	 * @see #getThresholdThickness()
	 * @see #setThresholdThickness(Double)
	 * @generated
	 */
	void unsetThresholdThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDoorLiningProperties#getThresholdThickness <em>Threshold Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Threshold Thickness</em>' attribute is set.
	 * @see #unsetThresholdThickness()
	 * @see #getThresholdThickness()
	 * @see #setThresholdThickness(Double)
	 * @generated
	 */
	boolean isSetThresholdThickness();

	/**
	 * Returns the value of the '<em><b>Threshold Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold Depth</em>' attribute.
	 * @see #isSetThresholdDepth()
	 * @see #unsetThresholdDepth()
	 * @see #setThresholdDepth(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDoorLiningProperties_ThresholdDepth()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getThresholdDepth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDoorLiningProperties#getThresholdDepth <em>Threshold Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold Depth</em>' attribute.
	 * @see #isSetThresholdDepth()
	 * @see #unsetThresholdDepth()
	 * @see #getThresholdDepth()
	 * @generated
	 */
	void setThresholdDepth(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDoorLiningProperties#getThresholdDepth <em>Threshold Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThresholdDepth()
	 * @see #getThresholdDepth()
	 * @see #setThresholdDepth(Double)
	 * @generated
	 */
	void unsetThresholdDepth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDoorLiningProperties#getThresholdDepth <em>Threshold Depth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Threshold Depth</em>' attribute is set.
	 * @see #unsetThresholdDepth()
	 * @see #getThresholdDepth()
	 * @see #setThresholdDepth(Double)
	 * @generated
	 */
	boolean isSetThresholdDepth();

	/**
	 * Returns the value of the '<em><b>Lining Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lining Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lining Thickness</em>' attribute.
	 * @see #isSetLiningThickness()
	 * @see #unsetLiningThickness()
	 * @see #setLiningThickness(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDoorLiningProperties_LiningThickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getLiningThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDoorLiningProperties#getLiningThickness <em>Lining Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lining Thickness</em>' attribute.
	 * @see #isSetLiningThickness()
	 * @see #unsetLiningThickness()
	 * @see #getLiningThickness()
	 * @generated
	 */
	void setLiningThickness(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDoorLiningProperties#getLiningThickness <em>Lining Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLiningThickness()
	 * @see #getLiningThickness()
	 * @see #setLiningThickness(Double)
	 * @generated
	 */
	void unsetLiningThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDoorLiningProperties#getLiningThickness <em>Lining Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lining Thickness</em>' attribute is set.
	 * @see #unsetLiningThickness()
	 * @see #getLiningThickness()
	 * @see #setLiningThickness(Double)
	 * @generated
	 */
	boolean isSetLiningThickness();

	/**
	 * Returns the value of the '<em><b>Lining Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lining Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lining Depth</em>' attribute.
	 * @see #isSetLiningDepth()
	 * @see #unsetLiningDepth()
	 * @see #setLiningDepth(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDoorLiningProperties_LiningDepth()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getLiningDepth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDoorLiningProperties#getLiningDepth <em>Lining Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lining Depth</em>' attribute.
	 * @see #isSetLiningDepth()
	 * @see #unsetLiningDepth()
	 * @see #getLiningDepth()
	 * @generated
	 */
	void setLiningDepth(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDoorLiningProperties#getLiningDepth <em>Lining Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLiningDepth()
	 * @see #getLiningDepth()
	 * @see #setLiningDepth(Double)
	 * @generated
	 */
	void unsetLiningDepth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDoorLiningProperties#getLiningDepth <em>Lining Depth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lining Depth</em>' attribute is set.
	 * @see #unsetLiningDepth()
	 * @see #getLiningDepth()
	 * @see #setLiningDepth(Double)
	 * @generated
	 */
	boolean isSetLiningDepth();

} // IfcDoorLiningProperties
