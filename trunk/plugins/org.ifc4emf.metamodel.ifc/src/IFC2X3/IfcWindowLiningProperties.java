/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcWindowLiningPropertiesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Window Lining Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcWindowLiningProperties#getLiningDepth <em>Lining Depth</em>}</li>
 *   <li>{@link IFC2X3.IfcWindowLiningProperties#getLiningThickness <em>Lining Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcWindowLiningProperties#getTransomThickness <em>Transom Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcWindowLiningProperties#getMullionThickness <em>Mullion Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcWindowLiningProperties#getFirstTransomOffset <em>First Transom Offset</em>}</li>
 *   <li>{@link IFC2X3.IfcWindowLiningProperties#getSecondTransomOffset <em>Second Transom Offset</em>}</li>
 *   <li>{@link IFC2X3.IfcWindowLiningProperties#getFirstMullionOffset <em>First Mullion Offset</em>}</li>
 *   <li>{@link IFC2X3.IfcWindowLiningProperties#getSecondMullionOffset <em>Second Mullion Offset</em>}</li>
 *   <li>{@link IFC2X3.IfcWindowLiningProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcWindowLiningProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcWindowLiningPropertiesImplAdapter.class)
public interface IfcWindowLiningProperties extends IfcPropertySetDefinition {
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
	 * @see IFC2X3.IFC2X3Package#getIfcWindowLiningProperties_ShapeAspectStyle()
	 * @model
	 * @generated
	 */
	IfcShapeAspect getShapeAspectStyle();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWindowLiningProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Aspect Style</em>' reference.
	 * @see #getShapeAspectStyle()
	 * @generated
	 */
	void setShapeAspectStyle(IfcShapeAspect value);

	/**
	 * Returns the value of the '<em><b>Second Mullion Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Mullion Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Mullion Offset</em>' attribute.
	 * @see #isSetSecondMullionOffset()
	 * @see #unsetSecondMullionOffset()
	 * @see #setSecondMullionOffset(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcWindowLiningProperties_SecondMullionOffset()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getSecondMullionOffset();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWindowLiningProperties#getSecondMullionOffset <em>Second Mullion Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Mullion Offset</em>' attribute.
	 * @see #isSetSecondMullionOffset()
	 * @see #unsetSecondMullionOffset()
	 * @see #getSecondMullionOffset()
	 * @generated
	 */
	void setSecondMullionOffset(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcWindowLiningProperties#getSecondMullionOffset <em>Second Mullion Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecondMullionOffset()
	 * @see #getSecondMullionOffset()
	 * @see #setSecondMullionOffset(Double)
	 * @generated
	 */
	void unsetSecondMullionOffset();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWindowLiningProperties#getSecondMullionOffset <em>Second Mullion Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Second Mullion Offset</em>' attribute is set.
	 * @see #unsetSecondMullionOffset()
	 * @see #getSecondMullionOffset()
	 * @see #setSecondMullionOffset(Double)
	 * @generated
	 */
	boolean isSetSecondMullionOffset();

	/**
	 * Returns the value of the '<em><b>First Mullion Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Mullion Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Mullion Offset</em>' attribute.
	 * @see #isSetFirstMullionOffset()
	 * @see #unsetFirstMullionOffset()
	 * @see #setFirstMullionOffset(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcWindowLiningProperties_FirstMullionOffset()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getFirstMullionOffset();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWindowLiningProperties#getFirstMullionOffset <em>First Mullion Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Mullion Offset</em>' attribute.
	 * @see #isSetFirstMullionOffset()
	 * @see #unsetFirstMullionOffset()
	 * @see #getFirstMullionOffset()
	 * @generated
	 */
	void setFirstMullionOffset(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcWindowLiningProperties#getFirstMullionOffset <em>First Mullion Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstMullionOffset()
	 * @see #getFirstMullionOffset()
	 * @see #setFirstMullionOffset(Double)
	 * @generated
	 */
	void unsetFirstMullionOffset();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWindowLiningProperties#getFirstMullionOffset <em>First Mullion Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First Mullion Offset</em>' attribute is set.
	 * @see #unsetFirstMullionOffset()
	 * @see #getFirstMullionOffset()
	 * @see #setFirstMullionOffset(Double)
	 * @generated
	 */
	boolean isSetFirstMullionOffset();

	/**
	 * Returns the value of the '<em><b>Second Transom Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Transom Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Transom Offset</em>' attribute.
	 * @see #isSetSecondTransomOffset()
	 * @see #unsetSecondTransomOffset()
	 * @see #setSecondTransomOffset(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcWindowLiningProperties_SecondTransomOffset()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getSecondTransomOffset();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWindowLiningProperties#getSecondTransomOffset <em>Second Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Transom Offset</em>' attribute.
	 * @see #isSetSecondTransomOffset()
	 * @see #unsetSecondTransomOffset()
	 * @see #getSecondTransomOffset()
	 * @generated
	 */
	void setSecondTransomOffset(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcWindowLiningProperties#getSecondTransomOffset <em>Second Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecondTransomOffset()
	 * @see #getSecondTransomOffset()
	 * @see #setSecondTransomOffset(Double)
	 * @generated
	 */
	void unsetSecondTransomOffset();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWindowLiningProperties#getSecondTransomOffset <em>Second Transom Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Second Transom Offset</em>' attribute is set.
	 * @see #unsetSecondTransomOffset()
	 * @see #getSecondTransomOffset()
	 * @see #setSecondTransomOffset(Double)
	 * @generated
	 */
	boolean isSetSecondTransomOffset();

	/**
	 * Returns the value of the '<em><b>First Transom Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Transom Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Transom Offset</em>' attribute.
	 * @see #isSetFirstTransomOffset()
	 * @see #unsetFirstTransomOffset()
	 * @see #setFirstTransomOffset(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcWindowLiningProperties_FirstTransomOffset()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getFirstTransomOffset();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWindowLiningProperties#getFirstTransomOffset <em>First Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Transom Offset</em>' attribute.
	 * @see #isSetFirstTransomOffset()
	 * @see #unsetFirstTransomOffset()
	 * @see #getFirstTransomOffset()
	 * @generated
	 */
	void setFirstTransomOffset(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcWindowLiningProperties#getFirstTransomOffset <em>First Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstTransomOffset()
	 * @see #getFirstTransomOffset()
	 * @see #setFirstTransomOffset(Double)
	 * @generated
	 */
	void unsetFirstTransomOffset();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWindowLiningProperties#getFirstTransomOffset <em>First Transom Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First Transom Offset</em>' attribute is set.
	 * @see #unsetFirstTransomOffset()
	 * @see #getFirstTransomOffset()
	 * @see #setFirstTransomOffset(Double)
	 * @generated
	 */
	boolean isSetFirstTransomOffset();

	/**
	 * Returns the value of the '<em><b>Mullion Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mullion Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mullion Thickness</em>' attribute.
	 * @see #isSetMullionThickness()
	 * @see #unsetMullionThickness()
	 * @see #setMullionThickness(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcWindowLiningProperties_MullionThickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMullionThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWindowLiningProperties#getMullionThickness <em>Mullion Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mullion Thickness</em>' attribute.
	 * @see #isSetMullionThickness()
	 * @see #unsetMullionThickness()
	 * @see #getMullionThickness()
	 * @generated
	 */
	void setMullionThickness(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcWindowLiningProperties#getMullionThickness <em>Mullion Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMullionThickness()
	 * @see #getMullionThickness()
	 * @see #setMullionThickness(Double)
	 * @generated
	 */
	void unsetMullionThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWindowLiningProperties#getMullionThickness <em>Mullion Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mullion Thickness</em>' attribute is set.
	 * @see #unsetMullionThickness()
	 * @see #getMullionThickness()
	 * @see #setMullionThickness(Double)
	 * @generated
	 */
	boolean isSetMullionThickness();

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
	 * @see IFC2X3.IFC2X3Package#getIfcWindowLiningProperties_TransomThickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getTransomThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWindowLiningProperties#getTransomThickness <em>Transom Thickness</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcWindowLiningProperties#getTransomThickness <em>Transom Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransomThickness()
	 * @see #getTransomThickness()
	 * @see #setTransomThickness(Double)
	 * @generated
	 */
	void unsetTransomThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWindowLiningProperties#getTransomThickness <em>Transom Thickness</em>}' attribute is set.
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
	 * @see IFC2X3.IFC2X3Package#getIfcWindowLiningProperties_LiningThickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getLiningThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWindowLiningProperties#getLiningThickness <em>Lining Thickness</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcWindowLiningProperties#getLiningThickness <em>Lining Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLiningThickness()
	 * @see #getLiningThickness()
	 * @see #setLiningThickness(Double)
	 * @generated
	 */
	void unsetLiningThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWindowLiningProperties#getLiningThickness <em>Lining Thickness</em>}' attribute is set.
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
	 * @see IFC2X3.IFC2X3Package#getIfcWindowLiningProperties_LiningDepth()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getLiningDepth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcWindowLiningProperties#getLiningDepth <em>Lining Depth</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcWindowLiningProperties#getLiningDepth <em>Lining Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLiningDepth()
	 * @see #getLiningDepth()
	 * @see #setLiningDepth(Double)
	 * @generated
	 */
	void unsetLiningDepth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcWindowLiningProperties#getLiningDepth <em>Lining Depth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lining Depth</em>' attribute is set.
	 * @see #unsetLiningDepth()
	 * @see #getLiningDepth()
	 * @see #setLiningDepth(Double)
	 * @generated
	 */
	boolean isSetLiningDepth();

} // IfcWindowLiningProperties
