/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcTrapeziumProfileDefImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Trapezium Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTrapeziumProfileDef#getBottomXDim <em>Bottom XDim</em>}</li>
 *   <li>{@link IFC2X3.IfcTrapeziumProfileDef#getTopXDim <em>Top XDim</em>}</li>
 *   <li>{@link IFC2X3.IfcTrapeziumProfileDef#getYDim <em>YDim</em>}</li>
 *   <li>{@link IFC2X3.IfcTrapeziumProfileDef#getTopXOffset <em>Top XOffset</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTrapeziumProfileDef()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcTrapeziumProfileDefImplAdapter.class)
public interface IfcTrapeziumProfileDef extends IfcParameterizedProfileDef {
	/**
	 * Returns the value of the '<em><b>Top XOffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top XOffset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top XOffset</em>' attribute.
	 * @see #isSetTopXOffset()
	 * @see #unsetTopXOffset()
	 * @see #setTopXOffset(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcTrapeziumProfileDef_TopXOffset()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getTopXOffset();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTrapeziumProfileDef#getTopXOffset <em>Top XOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top XOffset</em>' attribute.
	 * @see #isSetTopXOffset()
	 * @see #unsetTopXOffset()
	 * @see #getTopXOffset()
	 * @generated
	 */
	void setTopXOffset(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTrapeziumProfileDef#getTopXOffset <em>Top XOffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTopXOffset()
	 * @see #getTopXOffset()
	 * @see #setTopXOffset(Double)
	 * @generated
	 */
	void unsetTopXOffset();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTrapeziumProfileDef#getTopXOffset <em>Top XOffset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Top XOffset</em>' attribute is set.
	 * @see #unsetTopXOffset()
	 * @see #getTopXOffset()
	 * @see #setTopXOffset(Double)
	 * @generated
	 */
	boolean isSetTopXOffset();

	/**
	 * Returns the value of the '<em><b>YDim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YDim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YDim</em>' attribute.
	 * @see #isSetYDim()
	 * @see #unsetYDim()
	 * @see #setYDim(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcTrapeziumProfileDef_YDim()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getYDim();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTrapeziumProfileDef#getYDim <em>YDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YDim</em>' attribute.
	 * @see #isSetYDim()
	 * @see #unsetYDim()
	 * @see #getYDim()
	 * @generated
	 */
	void setYDim(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTrapeziumProfileDef#getYDim <em>YDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetYDim()
	 * @see #getYDim()
	 * @see #setYDim(Double)
	 * @generated
	 */
	void unsetYDim();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTrapeziumProfileDef#getYDim <em>YDim</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>YDim</em>' attribute is set.
	 * @see #unsetYDim()
	 * @see #getYDim()
	 * @see #setYDim(Double)
	 * @generated
	 */
	boolean isSetYDim();

	/**
	 * Returns the value of the '<em><b>Top XDim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top XDim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top XDim</em>' attribute.
	 * @see #isSetTopXDim()
	 * @see #unsetTopXDim()
	 * @see #setTopXDim(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcTrapeziumProfileDef_TopXDim()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getTopXDim();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTrapeziumProfileDef#getTopXDim <em>Top XDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top XDim</em>' attribute.
	 * @see #isSetTopXDim()
	 * @see #unsetTopXDim()
	 * @see #getTopXDim()
	 * @generated
	 */
	void setTopXDim(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTrapeziumProfileDef#getTopXDim <em>Top XDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTopXDim()
	 * @see #getTopXDim()
	 * @see #setTopXDim(Double)
	 * @generated
	 */
	void unsetTopXDim();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTrapeziumProfileDef#getTopXDim <em>Top XDim</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Top XDim</em>' attribute is set.
	 * @see #unsetTopXDim()
	 * @see #getTopXDim()
	 * @see #setTopXDim(Double)
	 * @generated
	 */
	boolean isSetTopXDim();

	/**
	 * Returns the value of the '<em><b>Bottom XDim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom XDim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom XDim</em>' attribute.
	 * @see #isSetBottomXDim()
	 * @see #unsetBottomXDim()
	 * @see #setBottomXDim(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcTrapeziumProfileDef_BottomXDim()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getBottomXDim();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTrapeziumProfileDef#getBottomXDim <em>Bottom XDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom XDim</em>' attribute.
	 * @see #isSetBottomXDim()
	 * @see #unsetBottomXDim()
	 * @see #getBottomXDim()
	 * @generated
	 */
	void setBottomXDim(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTrapeziumProfileDef#getBottomXDim <em>Bottom XDim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBottomXDim()
	 * @see #getBottomXDim()
	 * @see #setBottomXDim(Double)
	 * @generated
	 */
	void unsetBottomXDim();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTrapeziumProfileDef#getBottomXDim <em>Bottom XDim</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bottom XDim</em>' attribute is set.
	 * @see #unsetBottomXDim()
	 * @see #getBottomXDim()
	 * @see #setBottomXDim(Double)
	 * @generated
	 */
	boolean isSetBottomXDim();

} // IfcTrapeziumProfileDef
