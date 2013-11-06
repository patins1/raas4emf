/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcFailureConnectionConditionImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Failure Connection Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcFailureConnectionCondition#getTensionFailureX <em>Tension Failure X</em>}</li>
 *   <li>{@link IFC2X3.IfcFailureConnectionCondition#getTensionFailureY <em>Tension Failure Y</em>}</li>
 *   <li>{@link IFC2X3.IfcFailureConnectionCondition#getTensionFailureZ <em>Tension Failure Z</em>}</li>
 *   <li>{@link IFC2X3.IfcFailureConnectionCondition#getCompressionFailureX <em>Compression Failure X</em>}</li>
 *   <li>{@link IFC2X3.IfcFailureConnectionCondition#getCompressionFailureY <em>Compression Failure Y</em>}</li>
 *   <li>{@link IFC2X3.IfcFailureConnectionCondition#getCompressionFailureZ <em>Compression Failure Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcFailureConnectionCondition()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcFailureConnectionConditionImplAdapter.class)
public interface IfcFailureConnectionCondition extends IfcStructuralConnectionCondition {
	/**
	 * Returns the value of the '<em><b>Compression Failure Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compression Failure Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compression Failure Z</em>' attribute.
	 * @see #isSetCompressionFailureZ()
	 * @see #unsetCompressionFailureZ()
	 * @see #setCompressionFailureZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcFailureConnectionCondition_CompressionFailureZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getCompressionFailureZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFailureConnectionCondition#getCompressionFailureZ <em>Compression Failure Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Failure Z</em>' attribute.
	 * @see #isSetCompressionFailureZ()
	 * @see #unsetCompressionFailureZ()
	 * @see #getCompressionFailureZ()
	 * @generated
	 */
	void setCompressionFailureZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcFailureConnectionCondition#getCompressionFailureZ <em>Compression Failure Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompressionFailureZ()
	 * @see #getCompressionFailureZ()
	 * @see #setCompressionFailureZ(Double)
	 * @generated
	 */
	void unsetCompressionFailureZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcFailureConnectionCondition#getCompressionFailureZ <em>Compression Failure Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compression Failure Z</em>' attribute is set.
	 * @see #unsetCompressionFailureZ()
	 * @see #getCompressionFailureZ()
	 * @see #setCompressionFailureZ(Double)
	 * @generated
	 */
	boolean isSetCompressionFailureZ();

	/**
	 * Returns the value of the '<em><b>Compression Failure Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compression Failure Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compression Failure Y</em>' attribute.
	 * @see #isSetCompressionFailureY()
	 * @see #unsetCompressionFailureY()
	 * @see #setCompressionFailureY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcFailureConnectionCondition_CompressionFailureY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getCompressionFailureY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFailureConnectionCondition#getCompressionFailureY <em>Compression Failure Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Failure Y</em>' attribute.
	 * @see #isSetCompressionFailureY()
	 * @see #unsetCompressionFailureY()
	 * @see #getCompressionFailureY()
	 * @generated
	 */
	void setCompressionFailureY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcFailureConnectionCondition#getCompressionFailureY <em>Compression Failure Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompressionFailureY()
	 * @see #getCompressionFailureY()
	 * @see #setCompressionFailureY(Double)
	 * @generated
	 */
	void unsetCompressionFailureY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcFailureConnectionCondition#getCompressionFailureY <em>Compression Failure Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compression Failure Y</em>' attribute is set.
	 * @see #unsetCompressionFailureY()
	 * @see #getCompressionFailureY()
	 * @see #setCompressionFailureY(Double)
	 * @generated
	 */
	boolean isSetCompressionFailureY();

	/**
	 * Returns the value of the '<em><b>Compression Failure X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compression Failure X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compression Failure X</em>' attribute.
	 * @see #isSetCompressionFailureX()
	 * @see #unsetCompressionFailureX()
	 * @see #setCompressionFailureX(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcFailureConnectionCondition_CompressionFailureX()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getCompressionFailureX();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFailureConnectionCondition#getCompressionFailureX <em>Compression Failure X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Failure X</em>' attribute.
	 * @see #isSetCompressionFailureX()
	 * @see #unsetCompressionFailureX()
	 * @see #getCompressionFailureX()
	 * @generated
	 */
	void setCompressionFailureX(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcFailureConnectionCondition#getCompressionFailureX <em>Compression Failure X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompressionFailureX()
	 * @see #getCompressionFailureX()
	 * @see #setCompressionFailureX(Double)
	 * @generated
	 */
	void unsetCompressionFailureX();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcFailureConnectionCondition#getCompressionFailureX <em>Compression Failure X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compression Failure X</em>' attribute is set.
	 * @see #unsetCompressionFailureX()
	 * @see #getCompressionFailureX()
	 * @see #setCompressionFailureX(Double)
	 * @generated
	 */
	boolean isSetCompressionFailureX();

	/**
	 * Returns the value of the '<em><b>Tension Failure Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tension Failure Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tension Failure Z</em>' attribute.
	 * @see #isSetTensionFailureZ()
	 * @see #unsetTensionFailureZ()
	 * @see #setTensionFailureZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcFailureConnectionCondition_TensionFailureZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getTensionFailureZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFailureConnectionCondition#getTensionFailureZ <em>Tension Failure Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tension Failure Z</em>' attribute.
	 * @see #isSetTensionFailureZ()
	 * @see #unsetTensionFailureZ()
	 * @see #getTensionFailureZ()
	 * @generated
	 */
	void setTensionFailureZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcFailureConnectionCondition#getTensionFailureZ <em>Tension Failure Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTensionFailureZ()
	 * @see #getTensionFailureZ()
	 * @see #setTensionFailureZ(Double)
	 * @generated
	 */
	void unsetTensionFailureZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcFailureConnectionCondition#getTensionFailureZ <em>Tension Failure Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tension Failure Z</em>' attribute is set.
	 * @see #unsetTensionFailureZ()
	 * @see #getTensionFailureZ()
	 * @see #setTensionFailureZ(Double)
	 * @generated
	 */
	boolean isSetTensionFailureZ();

	/**
	 * Returns the value of the '<em><b>Tension Failure Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tension Failure Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tension Failure Y</em>' attribute.
	 * @see #isSetTensionFailureY()
	 * @see #unsetTensionFailureY()
	 * @see #setTensionFailureY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcFailureConnectionCondition_TensionFailureY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getTensionFailureY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFailureConnectionCondition#getTensionFailureY <em>Tension Failure Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tension Failure Y</em>' attribute.
	 * @see #isSetTensionFailureY()
	 * @see #unsetTensionFailureY()
	 * @see #getTensionFailureY()
	 * @generated
	 */
	void setTensionFailureY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcFailureConnectionCondition#getTensionFailureY <em>Tension Failure Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTensionFailureY()
	 * @see #getTensionFailureY()
	 * @see #setTensionFailureY(Double)
	 * @generated
	 */
	void unsetTensionFailureY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcFailureConnectionCondition#getTensionFailureY <em>Tension Failure Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tension Failure Y</em>' attribute is set.
	 * @see #unsetTensionFailureY()
	 * @see #getTensionFailureY()
	 * @see #setTensionFailureY(Double)
	 * @generated
	 */
	boolean isSetTensionFailureY();

	/**
	 * Returns the value of the '<em><b>Tension Failure X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tension Failure X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tension Failure X</em>' attribute.
	 * @see #isSetTensionFailureX()
	 * @see #unsetTensionFailureX()
	 * @see #setTensionFailureX(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcFailureConnectionCondition_TensionFailureX()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getTensionFailureX();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFailureConnectionCondition#getTensionFailureX <em>Tension Failure X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tension Failure X</em>' attribute.
	 * @see #isSetTensionFailureX()
	 * @see #unsetTensionFailureX()
	 * @see #getTensionFailureX()
	 * @generated
	 */
	void setTensionFailureX(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcFailureConnectionCondition#getTensionFailureX <em>Tension Failure X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTensionFailureX()
	 * @see #getTensionFailureX()
	 * @see #setTensionFailureX(Double)
	 * @generated
	 */
	void unsetTensionFailureX();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcFailureConnectionCondition#getTensionFailureX <em>Tension Failure X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tension Failure X</em>' attribute is set.
	 * @see #unsetTensionFailureX()
	 * @see #getTensionFailureX()
	 * @see #setTensionFailureX(Double)
	 * @generated
	 */
	boolean isSetTensionFailureX();

} // IfcFailureConnectionCondition
