/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcWindowPanelPropertiesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Window Panel Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcWindowPanelProperties#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link IFC2X3.IfcWindowPanelProperties#getPanelPosition <em>Panel Position</em>}</li>
 *   <li>{@link IFC2X3.IfcWindowPanelProperties#getFrameDepth <em>Frame Depth</em>}</li>
 *   <li>{@link IFC2X3.IfcWindowPanelProperties#getFrameThickness <em>Frame Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcWindowPanelProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcWindowPanelProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcWindowPanelPropertiesImplAdapter.class)
public interface IfcWindowPanelProperties extends IfcPropertySetDefinition {
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
	 * @see IFC2X3.IFC2X3Package#getIfcWindowPanelProperties_ShapeAspectStyle()
	 * @model
	 * @generated
	 */
	IfcShapeAspect getShapeAspectStyle();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWindowPanelProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Aspect Style</em>' reference.
	 * @see #getShapeAspectStyle()
	 * @generated
	 */
	void setShapeAspectStyle(IfcShapeAspect value);

	/**
	 * Returns the value of the '<em><b>Frame Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Thickness</em>' attribute.
	 * @see #isSetFrameThickness()
	 * @see #unsetFrameThickness()
	 * @see #setFrameThickness(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcWindowPanelProperties_FrameThickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getFrameThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWindowPanelProperties#getFrameThickness <em>Frame Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Thickness</em>' attribute.
	 * @see #isSetFrameThickness()
	 * @see #unsetFrameThickness()
	 * @see #getFrameThickness()
	 * @generated
	 */
	void setFrameThickness(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcWindowPanelProperties#getFrameThickness <em>Frame Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrameThickness()
	 * @see #getFrameThickness()
	 * @see #setFrameThickness(Double)
	 * @generated
	 */
	void unsetFrameThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWindowPanelProperties#getFrameThickness <em>Frame Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frame Thickness</em>' attribute is set.
	 * @see #unsetFrameThickness()
	 * @see #getFrameThickness()
	 * @see #setFrameThickness(Double)
	 * @generated
	 */
	boolean isSetFrameThickness();

	/**
	 * Returns the value of the '<em><b>Frame Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Depth</em>' attribute.
	 * @see #isSetFrameDepth()
	 * @see #unsetFrameDepth()
	 * @see #setFrameDepth(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcWindowPanelProperties_FrameDepth()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getFrameDepth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWindowPanelProperties#getFrameDepth <em>Frame Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Depth</em>' attribute.
	 * @see #isSetFrameDepth()
	 * @see #unsetFrameDepth()
	 * @see #getFrameDepth()
	 * @generated
	 */
	void setFrameDepth(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcWindowPanelProperties#getFrameDepth <em>Frame Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrameDepth()
	 * @see #getFrameDepth()
	 * @see #setFrameDepth(Double)
	 * @generated
	 */
	void unsetFrameDepth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWindowPanelProperties#getFrameDepth <em>Frame Depth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frame Depth</em>' attribute is set.
	 * @see #unsetFrameDepth()
	 * @see #getFrameDepth()
	 * @see #setFrameDepth(Double)
	 * @generated
	 */
	boolean isSetFrameDepth();

	/**
	 * Returns the value of the '<em><b>Panel Position</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcWindowPanelPositionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel Position</em>' attribute.
	 * @see IFC2X3.IfcWindowPanelPositionEnum
	 * @see #isSetPanelPosition()
	 * @see #unsetPanelPosition()
	 * @see #setPanelPosition(IfcWindowPanelPositionEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcWindowPanelProperties_PanelPosition()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcWindowPanelPositionEnum getPanelPosition();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWindowPanelProperties#getPanelPosition <em>Panel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel Position</em>' attribute.
	 * @see IFC2X3.IfcWindowPanelPositionEnum
	 * @see #isSetPanelPosition()
	 * @see #unsetPanelPosition()
	 * @see #getPanelPosition()
	 * @generated
	 */
	void setPanelPosition(IfcWindowPanelPositionEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcWindowPanelProperties#getPanelPosition <em>Panel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPanelPosition()
	 * @see #getPanelPosition()
	 * @see #setPanelPosition(IfcWindowPanelPositionEnum)
	 * @generated
	 */
	void unsetPanelPosition();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWindowPanelProperties#getPanelPosition <em>Panel Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Panel Position</em>' attribute is set.
	 * @see #unsetPanelPosition()
	 * @see #getPanelPosition()
	 * @see #setPanelPosition(IfcWindowPanelPositionEnum)
	 * @generated
	 */
	boolean isSetPanelPosition();

	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcWindowPanelOperationEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Type</em>' attribute.
	 * @see IFC2X3.IfcWindowPanelOperationEnum
	 * @see #isSetOperationType()
	 * @see #unsetOperationType()
	 * @see #setOperationType(IfcWindowPanelOperationEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcWindowPanelProperties_OperationType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcWindowPanelOperationEnum getOperationType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWindowPanelProperties#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' attribute.
	 * @see IFC2X3.IfcWindowPanelOperationEnum
	 * @see #isSetOperationType()
	 * @see #unsetOperationType()
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(IfcWindowPanelOperationEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcWindowPanelProperties#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperationType()
	 * @see #getOperationType()
	 * @see #setOperationType(IfcWindowPanelOperationEnum)
	 * @generated
	 */
	void unsetOperationType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWindowPanelProperties#getOperationType <em>Operation Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operation Type</em>' attribute is set.
	 * @see #unsetOperationType()
	 * @see #getOperationType()
	 * @see #setOperationType(IfcWindowPanelOperationEnum)
	 * @generated
	 */
	boolean isSetOperationType();

} // IfcWindowPanelProperties
