/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcIShapeProfileDefImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc IShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcIShapeProfileDef#getOverallWidth <em>Overall Width</em>}</li>
 *   <li>{@link IFC2X3.IfcIShapeProfileDef#getOverallDepth <em>Overall Depth</em>}</li>
 *   <li>{@link IFC2X3.IfcIShapeProfileDef#getWebThickness <em>Web Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcIShapeProfileDef#getFlangeThickness <em>Flange Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcIShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcIShapeProfileDef()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcIShapeProfileDefImplAdapter.class)
public interface IfcIShapeProfileDef extends IfcParameterizedProfileDef {
	/**
	 * Returns the value of the '<em><b>Fillet Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fillet Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fillet Radius</em>' attribute.
	 * @see #isSetFilletRadius()
	 * @see #unsetFilletRadius()
	 * @see #setFilletRadius(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcIShapeProfileDef_FilletRadius()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getFilletRadius();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcIShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fillet Radius</em>' attribute.
	 * @see #isSetFilletRadius()
	 * @see #unsetFilletRadius()
	 * @see #getFilletRadius()
	 * @generated
	 */
	void setFilletRadius(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcIShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilletRadius()
	 * @see #getFilletRadius()
	 * @see #setFilletRadius(Double)
	 * @generated
	 */
	void unsetFilletRadius();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcIShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fillet Radius</em>' attribute is set.
	 * @see #unsetFilletRadius()
	 * @see #getFilletRadius()
	 * @see #setFilletRadius(Double)
	 * @generated
	 */
	boolean isSetFilletRadius();

	/**
	 * Returns the value of the '<em><b>Flange Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flange Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flange Thickness</em>' attribute.
	 * @see #isSetFlangeThickness()
	 * @see #unsetFlangeThickness()
	 * @see #setFlangeThickness(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcIShapeProfileDef_FlangeThickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getFlangeThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcIShapeProfileDef#getFlangeThickness <em>Flange Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flange Thickness</em>' attribute.
	 * @see #isSetFlangeThickness()
	 * @see #unsetFlangeThickness()
	 * @see #getFlangeThickness()
	 * @generated
	 */
	void setFlangeThickness(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcIShapeProfileDef#getFlangeThickness <em>Flange Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlangeThickness()
	 * @see #getFlangeThickness()
	 * @see #setFlangeThickness(Double)
	 * @generated
	 */
	void unsetFlangeThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcIShapeProfileDef#getFlangeThickness <em>Flange Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flange Thickness</em>' attribute is set.
	 * @see #unsetFlangeThickness()
	 * @see #getFlangeThickness()
	 * @see #setFlangeThickness(Double)
	 * @generated
	 */
	boolean isSetFlangeThickness();

	/**
	 * Returns the value of the '<em><b>Web Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Thickness</em>' attribute.
	 * @see #isSetWebThickness()
	 * @see #unsetWebThickness()
	 * @see #setWebThickness(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcIShapeProfileDef_WebThickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getWebThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcIShapeProfileDef#getWebThickness <em>Web Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Thickness</em>' attribute.
	 * @see #isSetWebThickness()
	 * @see #unsetWebThickness()
	 * @see #getWebThickness()
	 * @generated
	 */
	void setWebThickness(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcIShapeProfileDef#getWebThickness <em>Web Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWebThickness()
	 * @see #getWebThickness()
	 * @see #setWebThickness(Double)
	 * @generated
	 */
	void unsetWebThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcIShapeProfileDef#getWebThickness <em>Web Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Web Thickness</em>' attribute is set.
	 * @see #unsetWebThickness()
	 * @see #getWebThickness()
	 * @see #setWebThickness(Double)
	 * @generated
	 */
	boolean isSetWebThickness();

	/**
	 * Returns the value of the '<em><b>Overall Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overall Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overall Depth</em>' attribute.
	 * @see #isSetOverallDepth()
	 * @see #unsetOverallDepth()
	 * @see #setOverallDepth(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcIShapeProfileDef_OverallDepth()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getOverallDepth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcIShapeProfileDef#getOverallDepth <em>Overall Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overall Depth</em>' attribute.
	 * @see #isSetOverallDepth()
	 * @see #unsetOverallDepth()
	 * @see #getOverallDepth()
	 * @generated
	 */
	void setOverallDepth(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcIShapeProfileDef#getOverallDepth <em>Overall Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOverallDepth()
	 * @see #getOverallDepth()
	 * @see #setOverallDepth(Double)
	 * @generated
	 */
	void unsetOverallDepth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcIShapeProfileDef#getOverallDepth <em>Overall Depth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Overall Depth</em>' attribute is set.
	 * @see #unsetOverallDepth()
	 * @see #getOverallDepth()
	 * @see #setOverallDepth(Double)
	 * @generated
	 */
	boolean isSetOverallDepth();

	/**
	 * Returns the value of the '<em><b>Overall Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overall Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overall Width</em>' attribute.
	 * @see #isSetOverallWidth()
	 * @see #unsetOverallWidth()
	 * @see #setOverallWidth(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcIShapeProfileDef_OverallWidth()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getOverallWidth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcIShapeProfileDef#getOverallWidth <em>Overall Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overall Width</em>' attribute.
	 * @see #isSetOverallWidth()
	 * @see #unsetOverallWidth()
	 * @see #getOverallWidth()
	 * @generated
	 */
	void setOverallWidth(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcIShapeProfileDef#getOverallWidth <em>Overall Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOverallWidth()
	 * @see #getOverallWidth()
	 * @see #setOverallWidth(Double)
	 * @generated
	 */
	void unsetOverallWidth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcIShapeProfileDef#getOverallWidth <em>Overall Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Overall Width</em>' attribute is set.
	 * @see #unsetOverallWidth()
	 * @see #getOverallWidth()
	 * @see #setOverallWidth(Double)
	 * @generated
	 */
	boolean isSetOverallWidth();

} // IfcIShapeProfileDef
