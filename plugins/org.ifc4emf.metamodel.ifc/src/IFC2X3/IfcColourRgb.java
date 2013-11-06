/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcColourRgbImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Colour Rgb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcColourRgb#getRed <em>Red</em>}</li>
 *   <li>{@link IFC2X3.IfcColourRgb#getGreen <em>Green</em>}</li>
 *   <li>{@link IFC2X3.IfcColourRgb#getBlue <em>Blue</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcColourRgb()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcColourRgbImplAdapter.class)
public interface IfcColourRgb extends IfcColourSpecification {
	/**
	 * Returns the value of the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue</em>' attribute.
	 * @see #isSetBlue()
	 * @see #unsetBlue()
	 * @see #setBlue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcColourRgb_Blue()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getBlue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcColourRgb#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' attribute.
	 * @see #isSetBlue()
	 * @see #unsetBlue()
	 * @see #getBlue()
	 * @generated
	 */
	void setBlue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcColourRgb#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlue()
	 * @see #getBlue()
	 * @see #setBlue(Double)
	 * @generated
	 */
	void unsetBlue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcColourRgb#getBlue <em>Blue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Blue</em>' attribute is set.
	 * @see #unsetBlue()
	 * @see #getBlue()
	 * @see #setBlue(Double)
	 * @generated
	 */
	boolean isSetBlue();

	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Green</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see #isSetGreen()
	 * @see #unsetGreen()
	 * @see #setGreen(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcColourRgb_Green()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getGreen();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcColourRgb#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' attribute.
	 * @see #isSetGreen()
	 * @see #unsetGreen()
	 * @see #getGreen()
	 * @generated
	 */
	void setGreen(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcColourRgb#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGreen()
	 * @see #getGreen()
	 * @see #setGreen(Double)
	 * @generated
	 */
	void unsetGreen();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcColourRgb#getGreen <em>Green</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Green</em>' attribute is set.
	 * @see #unsetGreen()
	 * @see #getGreen()
	 * @see #setGreen(Double)
	 * @generated
	 */
	boolean isSetGreen();

	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see #isSetRed()
	 * @see #unsetRed()
	 * @see #setRed(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcColourRgb_Red()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getRed();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcColourRgb#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' attribute.
	 * @see #isSetRed()
	 * @see #unsetRed()
	 * @see #getRed()
	 * @generated
	 */
	void setRed(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcColourRgb#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRed()
	 * @see #getRed()
	 * @see #setRed(Double)
	 * @generated
	 */
	void unsetRed();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcColourRgb#getRed <em>Red</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Red</em>' attribute is set.
	 * @see #unsetRed()
	 * @see #getRed()
	 * @see #setRed(Double)
	 * @generated
	 */
	boolean isSetRed();

} // IfcColourRgb
