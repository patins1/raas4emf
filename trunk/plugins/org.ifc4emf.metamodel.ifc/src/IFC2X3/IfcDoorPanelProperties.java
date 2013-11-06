/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcDoorPanelPropertiesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Door Panel Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcDoorPanelProperties#getPanelDepth <em>Panel Depth</em>}</li>
 *   <li>{@link IFC2X3.IfcDoorPanelProperties#getPanelOperation <em>Panel Operation</em>}</li>
 *   <li>{@link IFC2X3.IfcDoorPanelProperties#getPanelWidth <em>Panel Width</em>}</li>
 *   <li>{@link IFC2X3.IfcDoorPanelProperties#getPanelPosition <em>Panel Position</em>}</li>
 *   <li>{@link IFC2X3.IfcDoorPanelProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcDoorPanelProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcDoorPanelPropertiesImplAdapter.class)
public interface IfcDoorPanelProperties extends IfcPropertySetDefinition {
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
	 * @see IFC2X3.IFC2X3Package#getIfcDoorPanelProperties_ShapeAspectStyle()
	 * @model
	 * @generated
	 */
	IfcShapeAspect getShapeAspectStyle();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDoorPanelProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Aspect Style</em>' reference.
	 * @see #getShapeAspectStyle()
	 * @generated
	 */
	void setShapeAspectStyle(IfcShapeAspect value);

	/**
	 * Returns the value of the '<em><b>Panel Position</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcDoorPanelPositionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel Position</em>' attribute.
	 * @see IFC2X3.IfcDoorPanelPositionEnum
	 * @see #isSetPanelPosition()
	 * @see #unsetPanelPosition()
	 * @see #setPanelPosition(IfcDoorPanelPositionEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcDoorPanelProperties_PanelPosition()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcDoorPanelPositionEnum getPanelPosition();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDoorPanelProperties#getPanelPosition <em>Panel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel Position</em>' attribute.
	 * @see IFC2X3.IfcDoorPanelPositionEnum
	 * @see #isSetPanelPosition()
	 * @see #unsetPanelPosition()
	 * @see #getPanelPosition()
	 * @generated
	 */
	void setPanelPosition(IfcDoorPanelPositionEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDoorPanelProperties#getPanelPosition <em>Panel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPanelPosition()
	 * @see #getPanelPosition()
	 * @see #setPanelPosition(IfcDoorPanelPositionEnum)
	 * @generated
	 */
	void unsetPanelPosition();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDoorPanelProperties#getPanelPosition <em>Panel Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Panel Position</em>' attribute is set.
	 * @see #unsetPanelPosition()
	 * @see #getPanelPosition()
	 * @see #setPanelPosition(IfcDoorPanelPositionEnum)
	 * @generated
	 */
	boolean isSetPanelPosition();

	/**
	 * Returns the value of the '<em><b>Panel Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel Width</em>' attribute.
	 * @see #isSetPanelWidth()
	 * @see #unsetPanelWidth()
	 * @see #setPanelWidth(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDoorPanelProperties_PanelWidth()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getPanelWidth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDoorPanelProperties#getPanelWidth <em>Panel Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel Width</em>' attribute.
	 * @see #isSetPanelWidth()
	 * @see #unsetPanelWidth()
	 * @see #getPanelWidth()
	 * @generated
	 */
	void setPanelWidth(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDoorPanelProperties#getPanelWidth <em>Panel Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPanelWidth()
	 * @see #getPanelWidth()
	 * @see #setPanelWidth(Double)
	 * @generated
	 */
	void unsetPanelWidth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDoorPanelProperties#getPanelWidth <em>Panel Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Panel Width</em>' attribute is set.
	 * @see #unsetPanelWidth()
	 * @see #getPanelWidth()
	 * @see #setPanelWidth(Double)
	 * @generated
	 */
	boolean isSetPanelWidth();

	/**
	 * Returns the value of the '<em><b>Panel Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcDoorPanelOperationEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel Operation</em>' attribute.
	 * @see IFC2X3.IfcDoorPanelOperationEnum
	 * @see #isSetPanelOperation()
	 * @see #unsetPanelOperation()
	 * @see #setPanelOperation(IfcDoorPanelOperationEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcDoorPanelProperties_PanelOperation()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcDoorPanelOperationEnum getPanelOperation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDoorPanelProperties#getPanelOperation <em>Panel Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel Operation</em>' attribute.
	 * @see IFC2X3.IfcDoorPanelOperationEnum
	 * @see #isSetPanelOperation()
	 * @see #unsetPanelOperation()
	 * @see #getPanelOperation()
	 * @generated
	 */
	void setPanelOperation(IfcDoorPanelOperationEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDoorPanelProperties#getPanelOperation <em>Panel Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPanelOperation()
	 * @see #getPanelOperation()
	 * @see #setPanelOperation(IfcDoorPanelOperationEnum)
	 * @generated
	 */
	void unsetPanelOperation();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDoorPanelProperties#getPanelOperation <em>Panel Operation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Panel Operation</em>' attribute is set.
	 * @see #unsetPanelOperation()
	 * @see #getPanelOperation()
	 * @see #setPanelOperation(IfcDoorPanelOperationEnum)
	 * @generated
	 */
	boolean isSetPanelOperation();

	/**
	 * Returns the value of the '<em><b>Panel Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel Depth</em>' attribute.
	 * @see #isSetPanelDepth()
	 * @see #unsetPanelDepth()
	 * @see #setPanelDepth(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcDoorPanelProperties_PanelDepth()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getPanelDepth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDoorPanelProperties#getPanelDepth <em>Panel Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel Depth</em>' attribute.
	 * @see #isSetPanelDepth()
	 * @see #unsetPanelDepth()
	 * @see #getPanelDepth()
	 * @generated
	 */
	void setPanelDepth(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDoorPanelProperties#getPanelDepth <em>Panel Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPanelDepth()
	 * @see #getPanelDepth()
	 * @see #setPanelDepth(Double)
	 * @generated
	 */
	void unsetPanelDepth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDoorPanelProperties#getPanelDepth <em>Panel Depth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Panel Depth</em>' attribute is set.
	 * @see #unsetPanelDepth()
	 * @see #getPanelDepth()
	 * @see #setPanelDepth(Double)
	 * @generated
	 */
	boolean isSetPanelDepth();

} // IfcDoorPanelProperties
