/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcBlockImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcBlock#getXLength <em>XLength</em>}</li>
 *   <li>{@link IFC2X3.IfcBlock#getYLength <em>YLength</em>}</li>
 *   <li>{@link IFC2X3.IfcBlock#getZLength <em>ZLength</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcBlock()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcBlockImplAdapter.class)
public interface IfcBlock extends IfcCsgPrimitive3D {
	/**
	 * Returns the value of the '<em><b>ZLength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZLength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZLength</em>' attribute.
	 * @see #isSetZLength()
	 * @see #unsetZLength()
	 * @see #setZLength(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcBlock_ZLength()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getZLength();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBlock#getZLength <em>ZLength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZLength</em>' attribute.
	 * @see #isSetZLength()
	 * @see #unsetZLength()
	 * @see #getZLength()
	 * @generated
	 */
	void setZLength(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBlock#getZLength <em>ZLength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZLength()
	 * @see #getZLength()
	 * @see #setZLength(Double)
	 * @generated
	 */
	void unsetZLength();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBlock#getZLength <em>ZLength</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ZLength</em>' attribute is set.
	 * @see #unsetZLength()
	 * @see #getZLength()
	 * @see #setZLength(Double)
	 * @generated
	 */
	boolean isSetZLength();

	/**
	 * Returns the value of the '<em><b>YLength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YLength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YLength</em>' attribute.
	 * @see #isSetYLength()
	 * @see #unsetYLength()
	 * @see #setYLength(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcBlock_YLength()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getYLength();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBlock#getYLength <em>YLength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YLength</em>' attribute.
	 * @see #isSetYLength()
	 * @see #unsetYLength()
	 * @see #getYLength()
	 * @generated
	 */
	void setYLength(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBlock#getYLength <em>YLength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetYLength()
	 * @see #getYLength()
	 * @see #setYLength(Double)
	 * @generated
	 */
	void unsetYLength();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBlock#getYLength <em>YLength</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>YLength</em>' attribute is set.
	 * @see #unsetYLength()
	 * @see #getYLength()
	 * @see #setYLength(Double)
	 * @generated
	 */
	boolean isSetYLength();

	/**
	 * Returns the value of the '<em><b>XLength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XLength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XLength</em>' attribute.
	 * @see #isSetXLength()
	 * @see #unsetXLength()
	 * @see #setXLength(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcBlock_XLength()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getXLength();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBlock#getXLength <em>XLength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XLength</em>' attribute.
	 * @see #isSetXLength()
	 * @see #unsetXLength()
	 * @see #getXLength()
	 * @generated
	 */
	void setXLength(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcBlock#getXLength <em>XLength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXLength()
	 * @see #getXLength()
	 * @see #setXLength(Double)
	 * @generated
	 */
	void unsetXLength();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcBlock#getXLength <em>XLength</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>XLength</em>' attribute is set.
	 * @see #unsetXLength()
	 * @see #getXLength()
	 * @see #setXLength(Double)
	 * @generated
	 */
	boolean isSetXLength();

} // IfcBlock
