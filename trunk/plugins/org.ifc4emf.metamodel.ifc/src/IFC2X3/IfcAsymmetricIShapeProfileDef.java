/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcAsymmetricIShapeProfileDefImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Asymmetric IShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcAsymmetricIShapeProfileDef#getTopFlangeWidth <em>Top Flange Width</em>}</li>
 *   <li>{@link IFC2X3.IfcAsymmetricIShapeProfileDef#getTopFlangeThickness <em>Top Flange Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcAsymmetricIShapeProfileDef#getTopFlangeFilletRadius <em>Top Flange Fillet Radius</em>}</li>
 *   <li>{@link IFC2X3.IfcAsymmetricIShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcAsymmetricIShapeProfileDef()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcAsymmetricIShapeProfileDefImplAdapter.class)
public interface IfcAsymmetricIShapeProfileDef extends IfcIShapeProfileDef {
	/**
	 * Returns the value of the '<em><b>Centre Of Gravity In Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centre Of Gravity In Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centre Of Gravity In Y</em>' attribute.
	 * @see #isSetCentreOfGravityInY()
	 * @see #unsetCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcAsymmetricIShapeProfileDef_CentreOfGravityInY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getCentreOfGravityInY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAsymmetricIShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centre Of Gravity In Y</em>' attribute.
	 * @see #isSetCentreOfGravityInY()
	 * @see #unsetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @generated
	 */
	void setCentreOfGravityInY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcAsymmetricIShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(Double)
	 * @generated
	 */
	void unsetCentreOfGravityInY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcAsymmetricIShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Centre Of Gravity In Y</em>' attribute is set.
	 * @see #unsetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(Double)
	 * @generated
	 */
	boolean isSetCentreOfGravityInY();

	/**
	 * Returns the value of the '<em><b>Top Flange Fillet Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Flange Fillet Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Flange Fillet Radius</em>' attribute.
	 * @see #isSetTopFlangeFilletRadius()
	 * @see #unsetTopFlangeFilletRadius()
	 * @see #setTopFlangeFilletRadius(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcAsymmetricIShapeProfileDef_TopFlangeFilletRadius()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getTopFlangeFilletRadius();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAsymmetricIShapeProfileDef#getTopFlangeFilletRadius <em>Top Flange Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Flange Fillet Radius</em>' attribute.
	 * @see #isSetTopFlangeFilletRadius()
	 * @see #unsetTopFlangeFilletRadius()
	 * @see #getTopFlangeFilletRadius()
	 * @generated
	 */
	void setTopFlangeFilletRadius(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcAsymmetricIShapeProfileDef#getTopFlangeFilletRadius <em>Top Flange Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTopFlangeFilletRadius()
	 * @see #getTopFlangeFilletRadius()
	 * @see #setTopFlangeFilletRadius(Double)
	 * @generated
	 */
	void unsetTopFlangeFilletRadius();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcAsymmetricIShapeProfileDef#getTopFlangeFilletRadius <em>Top Flange Fillet Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Top Flange Fillet Radius</em>' attribute is set.
	 * @see #unsetTopFlangeFilletRadius()
	 * @see #getTopFlangeFilletRadius()
	 * @see #setTopFlangeFilletRadius(Double)
	 * @generated
	 */
	boolean isSetTopFlangeFilletRadius();

	/**
	 * Returns the value of the '<em><b>Top Flange Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Flange Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Flange Thickness</em>' attribute.
	 * @see #isSetTopFlangeThickness()
	 * @see #unsetTopFlangeThickness()
	 * @see #setTopFlangeThickness(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcAsymmetricIShapeProfileDef_TopFlangeThickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getTopFlangeThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAsymmetricIShapeProfileDef#getTopFlangeThickness <em>Top Flange Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Flange Thickness</em>' attribute.
	 * @see #isSetTopFlangeThickness()
	 * @see #unsetTopFlangeThickness()
	 * @see #getTopFlangeThickness()
	 * @generated
	 */
	void setTopFlangeThickness(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcAsymmetricIShapeProfileDef#getTopFlangeThickness <em>Top Flange Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTopFlangeThickness()
	 * @see #getTopFlangeThickness()
	 * @see #setTopFlangeThickness(Double)
	 * @generated
	 */
	void unsetTopFlangeThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcAsymmetricIShapeProfileDef#getTopFlangeThickness <em>Top Flange Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Top Flange Thickness</em>' attribute is set.
	 * @see #unsetTopFlangeThickness()
	 * @see #getTopFlangeThickness()
	 * @see #setTopFlangeThickness(Double)
	 * @generated
	 */
	boolean isSetTopFlangeThickness();

	/**
	 * Returns the value of the '<em><b>Top Flange Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Flange Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Flange Width</em>' attribute.
	 * @see #isSetTopFlangeWidth()
	 * @see #unsetTopFlangeWidth()
	 * @see #setTopFlangeWidth(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcAsymmetricIShapeProfileDef_TopFlangeWidth()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getTopFlangeWidth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAsymmetricIShapeProfileDef#getTopFlangeWidth <em>Top Flange Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Flange Width</em>' attribute.
	 * @see #isSetTopFlangeWidth()
	 * @see #unsetTopFlangeWidth()
	 * @see #getTopFlangeWidth()
	 * @generated
	 */
	void setTopFlangeWidth(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcAsymmetricIShapeProfileDef#getTopFlangeWidth <em>Top Flange Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTopFlangeWidth()
	 * @see #getTopFlangeWidth()
	 * @see #setTopFlangeWidth(Double)
	 * @generated
	 */
	void unsetTopFlangeWidth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcAsymmetricIShapeProfileDef#getTopFlangeWidth <em>Top Flange Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Top Flange Width</em>' attribute is set.
	 * @see #unsetTopFlangeWidth()
	 * @see #getTopFlangeWidth()
	 * @see #setTopFlangeWidth(Double)
	 * @generated
	 */
	boolean isSetTopFlangeWidth();

} // IfcAsymmetricIShapeProfileDef
