/**
 */
package psets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IMin Max Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link psets.IMinMaxValue#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link psets.IMinMaxValue#getMaxValue <em>Max Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see psets.PsetsPackage#getIMinMaxValue()
 * @model
 * @generated
 */
public interface IMinMaxValue extends IPropertyValue {

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(String)
	 * @see psets.PsetsPackage#getIMinMaxValue_MinValue()
	 * @model
	 * @generated
	 */
	String getMinValue();

	/**
	 * Sets the value of the '{@link psets.IMinMaxValue#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(String value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(String)
	 * @see psets.PsetsPackage#getIMinMaxValue_MaxValue()
	 * @model
	 * @generated
	 */
	String getMaxValue();

	/**
	 * Sets the value of the '{@link psets.IMinMaxValue#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Double getMinNumber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Double getMaxNumber();
} // IMinMaxValue
