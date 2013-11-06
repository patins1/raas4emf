/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcStructuralLoadSingleDisplacementImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Load Single Displacement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getDisplacementX <em>Displacement X</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getDisplacementY <em>Displacement Y</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getDisplacementZ <em>Displacement Z</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRX <em>Rotational Displacement RX</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRY <em>Rotational Displacement RY</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRZ <em>Rotational Displacement RZ</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadSingleDisplacement()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcStructuralLoadSingleDisplacementImplAdapter.class)
public interface IfcStructuralLoadSingleDisplacement extends IfcStructuralLoadStatic {
	/**
	 * Returns the value of the '<em><b>Rotational Displacement RZ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotational Displacement RZ</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotational Displacement RZ</em>' attribute.
	 * @see #isSetRotationalDisplacementRZ()
	 * @see #unsetRotationalDisplacementRZ()
	 * @see #setRotationalDisplacementRZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getRotationalDisplacementRZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRZ <em>Rotational Displacement RZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotational Displacement RZ</em>' attribute.
	 * @see #isSetRotationalDisplacementRZ()
	 * @see #unsetRotationalDisplacementRZ()
	 * @see #getRotationalDisplacementRZ()
	 * @generated
	 */
	void setRotationalDisplacementRZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRZ <em>Rotational Displacement RZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotationalDisplacementRZ()
	 * @see #getRotationalDisplacementRZ()
	 * @see #setRotationalDisplacementRZ(Double)
	 * @generated
	 */
	void unsetRotationalDisplacementRZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRZ <em>Rotational Displacement RZ</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotational Displacement RZ</em>' attribute is set.
	 * @see #unsetRotationalDisplacementRZ()
	 * @see #getRotationalDisplacementRZ()
	 * @see #setRotationalDisplacementRZ(Double)
	 * @generated
	 */
	boolean isSetRotationalDisplacementRZ();

	/**
	 * Returns the value of the '<em><b>Rotational Displacement RY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotational Displacement RY</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotational Displacement RY</em>' attribute.
	 * @see #isSetRotationalDisplacementRY()
	 * @see #unsetRotationalDisplacementRY()
	 * @see #setRotationalDisplacementRY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getRotationalDisplacementRY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRY <em>Rotational Displacement RY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotational Displacement RY</em>' attribute.
	 * @see #isSetRotationalDisplacementRY()
	 * @see #unsetRotationalDisplacementRY()
	 * @see #getRotationalDisplacementRY()
	 * @generated
	 */
	void setRotationalDisplacementRY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRY <em>Rotational Displacement RY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotationalDisplacementRY()
	 * @see #getRotationalDisplacementRY()
	 * @see #setRotationalDisplacementRY(Double)
	 * @generated
	 */
	void unsetRotationalDisplacementRY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRY <em>Rotational Displacement RY</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotational Displacement RY</em>' attribute is set.
	 * @see #unsetRotationalDisplacementRY()
	 * @see #getRotationalDisplacementRY()
	 * @see #setRotationalDisplacementRY(Double)
	 * @generated
	 */
	boolean isSetRotationalDisplacementRY();

	/**
	 * Returns the value of the '<em><b>Rotational Displacement RX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotational Displacement RX</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotational Displacement RX</em>' attribute.
	 * @see #isSetRotationalDisplacementRX()
	 * @see #unsetRotationalDisplacementRX()
	 * @see #setRotationalDisplacementRX(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRX()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getRotationalDisplacementRX();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRX <em>Rotational Displacement RX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotational Displacement RX</em>' attribute.
	 * @see #isSetRotationalDisplacementRX()
	 * @see #unsetRotationalDisplacementRX()
	 * @see #getRotationalDisplacementRX()
	 * @generated
	 */
	void setRotationalDisplacementRX(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRX <em>Rotational Displacement RX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotationalDisplacementRX()
	 * @see #getRotationalDisplacementRX()
	 * @see #setRotationalDisplacementRX(Double)
	 * @generated
	 */
	void unsetRotationalDisplacementRX();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRX <em>Rotational Displacement RX</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotational Displacement RX</em>' attribute is set.
	 * @see #unsetRotationalDisplacementRX()
	 * @see #getRotationalDisplacementRX()
	 * @see #setRotationalDisplacementRX(Double)
	 * @generated
	 */
	boolean isSetRotationalDisplacementRX();

	/**
	 * Returns the value of the '<em><b>Displacement Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displacement Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displacement Z</em>' attribute.
	 * @see #isSetDisplacementZ()
	 * @see #unsetDisplacementZ()
	 * @see #setDisplacementZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadSingleDisplacement_DisplacementZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getDisplacementZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getDisplacementZ <em>Displacement Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displacement Z</em>' attribute.
	 * @see #isSetDisplacementZ()
	 * @see #unsetDisplacementZ()
	 * @see #getDisplacementZ()
	 * @generated
	 */
	void setDisplacementZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getDisplacementZ <em>Displacement Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplacementZ()
	 * @see #getDisplacementZ()
	 * @see #setDisplacementZ(Double)
	 * @generated
	 */
	void unsetDisplacementZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getDisplacementZ <em>Displacement Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Displacement Z</em>' attribute is set.
	 * @see #unsetDisplacementZ()
	 * @see #getDisplacementZ()
	 * @see #setDisplacementZ(Double)
	 * @generated
	 */
	boolean isSetDisplacementZ();

	/**
	 * Returns the value of the '<em><b>Displacement Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displacement Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displacement Y</em>' attribute.
	 * @see #isSetDisplacementY()
	 * @see #unsetDisplacementY()
	 * @see #setDisplacementY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadSingleDisplacement_DisplacementY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getDisplacementY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getDisplacementY <em>Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displacement Y</em>' attribute.
	 * @see #isSetDisplacementY()
	 * @see #unsetDisplacementY()
	 * @see #getDisplacementY()
	 * @generated
	 */
	void setDisplacementY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getDisplacementY <em>Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplacementY()
	 * @see #getDisplacementY()
	 * @see #setDisplacementY(Double)
	 * @generated
	 */
	void unsetDisplacementY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getDisplacementY <em>Displacement Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Displacement Y</em>' attribute is set.
	 * @see #unsetDisplacementY()
	 * @see #getDisplacementY()
	 * @see #setDisplacementY(Double)
	 * @generated
	 */
	boolean isSetDisplacementY();

	/**
	 * Returns the value of the '<em><b>Displacement X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displacement X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displacement X</em>' attribute.
	 * @see #isSetDisplacementX()
	 * @see #unsetDisplacementX()
	 * @see #setDisplacementX(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadSingleDisplacement_DisplacementX()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getDisplacementX();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getDisplacementX <em>Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displacement X</em>' attribute.
	 * @see #isSetDisplacementX()
	 * @see #unsetDisplacementX()
	 * @see #getDisplacementX()
	 * @generated
	 */
	void setDisplacementX(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getDisplacementX <em>Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplacementX()
	 * @see #getDisplacementX()
	 * @see #setDisplacementX(Double)
	 * @generated
	 */
	void unsetDisplacementX();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadSingleDisplacement#getDisplacementX <em>Displacement X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Displacement X</em>' attribute is set.
	 * @see #unsetDisplacementX()
	 * @see #getDisplacementX()
	 * @see #setDisplacementX(Double)
	 * @generated
	 */
	boolean isSetDisplacementX();

} // IfcStructuralLoadSingleDisplacement
