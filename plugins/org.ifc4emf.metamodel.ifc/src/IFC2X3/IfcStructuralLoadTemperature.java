/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcStructuralLoadTemperatureImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Load Temperature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcStructuralLoadTemperature#getDeltaT_Constant <em>Delta TConstant</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadTemperature#getDeltaT_Y <em>Delta TY</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadTemperature#getDeltaT_Z <em>Delta TZ</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadTemperature()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcStructuralLoadTemperatureImplAdapter.class)
public interface IfcStructuralLoadTemperature extends IfcStructuralLoadStatic {
	/**
	 * Returns the value of the '<em><b>Delta TZ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta TZ</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta TZ</em>' attribute.
	 * @see #isSetDeltaT_Z()
	 * @see #unsetDeltaT_Z()
	 * @see #setDeltaT_Z(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadTemperature_DeltaT_Z()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getDeltaT_Z();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadTemperature#getDeltaT_Z <em>Delta TZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta TZ</em>' attribute.
	 * @see #isSetDeltaT_Z()
	 * @see #unsetDeltaT_Z()
	 * @see #getDeltaT_Z()
	 * @generated
	 */
	void setDeltaT_Z(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadTemperature#getDeltaT_Z <em>Delta TZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeltaT_Z()
	 * @see #getDeltaT_Z()
	 * @see #setDeltaT_Z(Double)
	 * @generated
	 */
	void unsetDeltaT_Z();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadTemperature#getDeltaT_Z <em>Delta TZ</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delta TZ</em>' attribute is set.
	 * @see #unsetDeltaT_Z()
	 * @see #getDeltaT_Z()
	 * @see #setDeltaT_Z(Double)
	 * @generated
	 */
	boolean isSetDeltaT_Z();

	/**
	 * Returns the value of the '<em><b>Delta TY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta TY</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta TY</em>' attribute.
	 * @see #isSetDeltaT_Y()
	 * @see #unsetDeltaT_Y()
	 * @see #setDeltaT_Y(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadTemperature_DeltaT_Y()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getDeltaT_Y();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadTemperature#getDeltaT_Y <em>Delta TY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta TY</em>' attribute.
	 * @see #isSetDeltaT_Y()
	 * @see #unsetDeltaT_Y()
	 * @see #getDeltaT_Y()
	 * @generated
	 */
	void setDeltaT_Y(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadTemperature#getDeltaT_Y <em>Delta TY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeltaT_Y()
	 * @see #getDeltaT_Y()
	 * @see #setDeltaT_Y(Double)
	 * @generated
	 */
	void unsetDeltaT_Y();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadTemperature#getDeltaT_Y <em>Delta TY</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delta TY</em>' attribute is set.
	 * @see #unsetDeltaT_Y()
	 * @see #getDeltaT_Y()
	 * @see #setDeltaT_Y(Double)
	 * @generated
	 */
	boolean isSetDeltaT_Y();

	/**
	 * Returns the value of the '<em><b>Delta TConstant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta TConstant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta TConstant</em>' attribute.
	 * @see #isSetDeltaT_Constant()
	 * @see #unsetDeltaT_Constant()
	 * @see #setDeltaT_Constant(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadTemperature_DeltaT_Constant()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getDeltaT_Constant();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadTemperature#getDeltaT_Constant <em>Delta TConstant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta TConstant</em>' attribute.
	 * @see #isSetDeltaT_Constant()
	 * @see #unsetDeltaT_Constant()
	 * @see #getDeltaT_Constant()
	 * @generated
	 */
	void setDeltaT_Constant(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadTemperature#getDeltaT_Constant <em>Delta TConstant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeltaT_Constant()
	 * @see #getDeltaT_Constant()
	 * @see #setDeltaT_Constant(Double)
	 * @generated
	 */
	void unsetDeltaT_Constant();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadTemperature#getDeltaT_Constant <em>Delta TConstant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delta TConstant</em>' attribute is set.
	 * @see #unsetDeltaT_Constant()
	 * @see #getDeltaT_Constant()
	 * @see #setDeltaT_Constant(Double)
	 * @generated
	 */
	boolean isSetDeltaT_Constant();

} // IfcStructuralLoadTemperature
