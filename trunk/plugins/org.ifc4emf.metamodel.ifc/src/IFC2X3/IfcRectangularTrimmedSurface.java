/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRectangularTrimmedSurfaceImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rectangular Trimmed Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRectangularTrimmedSurface#getBasisSurface <em>Basis Surface</em>}</li>
 *   <li>{@link IFC2X3.IfcRectangularTrimmedSurface#getU1 <em>U1</em>}</li>
 *   <li>{@link IFC2X3.IfcRectangularTrimmedSurface#getV1 <em>V1</em>}</li>
 *   <li>{@link IFC2X3.IfcRectangularTrimmedSurface#getU2 <em>U2</em>}</li>
 *   <li>{@link IFC2X3.IfcRectangularTrimmedSurface#getV2 <em>V2</em>}</li>
 *   <li>{@link IFC2X3.IfcRectangularTrimmedSurface#getUsense <em>Usense</em>}</li>
 *   <li>{@link IFC2X3.IfcRectangularTrimmedSurface#getVsense <em>Vsense</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRectangularTrimmedSurface()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRectangularTrimmedSurfaceImplAdapter.class)
public interface IfcRectangularTrimmedSurface extends IfcBoundedSurface {
	/**
	 * Returns the value of the '<em><b>Basis Surface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Surface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Surface</em>' reference.
	 * @see #setBasisSurface(IfcSurface)
	 * @see IFC2X3.IFC2X3Package#getIfcRectangularTrimmedSurface_BasisSurface()
	 * @model required="true"
	 * @generated
	 */
	IfcSurface getBasisSurface();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRectangularTrimmedSurface#getBasisSurface <em>Basis Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis Surface</em>' reference.
	 * @see #getBasisSurface()
	 * @generated
	 */
	void setBasisSurface(IfcSurface value);

	/**
	 * Returns the value of the '<em><b>Vsense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vsense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vsense</em>' attribute.
	 * @see #isSetVsense()
	 * @see #unsetVsense()
	 * @see #setVsense(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcRectangularTrimmedSurface_Vsense()
	 * @model unsettable="true" dataType="IFC2X3.BOOLEAN" required="true"
	 * @generated
	 */
	Boolean getVsense();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRectangularTrimmedSurface#getVsense <em>Vsense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vsense</em>' attribute.
	 * @see #isSetVsense()
	 * @see #unsetVsense()
	 * @see #getVsense()
	 * @generated
	 */
	void setVsense(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRectangularTrimmedSurface#getVsense <em>Vsense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVsense()
	 * @see #getVsense()
	 * @see #setVsense(Boolean)
	 * @generated
	 */
	void unsetVsense();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRectangularTrimmedSurface#getVsense <em>Vsense</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vsense</em>' attribute is set.
	 * @see #unsetVsense()
	 * @see #getVsense()
	 * @see #setVsense(Boolean)
	 * @generated
	 */
	boolean isSetVsense();

	/**
	 * Returns the value of the '<em><b>Usense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usense</em>' attribute.
	 * @see #isSetUsense()
	 * @see #unsetUsense()
	 * @see #setUsense(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcRectangularTrimmedSurface_Usense()
	 * @model unsettable="true" dataType="IFC2X3.BOOLEAN" required="true"
	 * @generated
	 */
	Boolean getUsense();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRectangularTrimmedSurface#getUsense <em>Usense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usense</em>' attribute.
	 * @see #isSetUsense()
	 * @see #unsetUsense()
	 * @see #getUsense()
	 * @generated
	 */
	void setUsense(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRectangularTrimmedSurface#getUsense <em>Usense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsense()
	 * @see #getUsense()
	 * @see #setUsense(Boolean)
	 * @generated
	 */
	void unsetUsense();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRectangularTrimmedSurface#getUsense <em>Usense</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usense</em>' attribute is set.
	 * @see #unsetUsense()
	 * @see #getUsense()
	 * @see #setUsense(Boolean)
	 * @generated
	 */
	boolean isSetUsense();

	/**
	 * Returns the value of the '<em><b>V2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V2</em>' attribute.
	 * @see #isSetV2()
	 * @see #unsetV2()
	 * @see #setV2(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRectangularTrimmedSurface_V2()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getV2();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRectangularTrimmedSurface#getV2 <em>V2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V2</em>' attribute.
	 * @see #isSetV2()
	 * @see #unsetV2()
	 * @see #getV2()
	 * @generated
	 */
	void setV2(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRectangularTrimmedSurface#getV2 <em>V2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetV2()
	 * @see #getV2()
	 * @see #setV2(Double)
	 * @generated
	 */
	void unsetV2();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRectangularTrimmedSurface#getV2 <em>V2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>V2</em>' attribute is set.
	 * @see #unsetV2()
	 * @see #getV2()
	 * @see #setV2(Double)
	 * @generated
	 */
	boolean isSetV2();

	/**
	 * Returns the value of the '<em><b>U2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>U2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>U2</em>' attribute.
	 * @see #isSetU2()
	 * @see #unsetU2()
	 * @see #setU2(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRectangularTrimmedSurface_U2()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getU2();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRectangularTrimmedSurface#getU2 <em>U2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>U2</em>' attribute.
	 * @see #isSetU2()
	 * @see #unsetU2()
	 * @see #getU2()
	 * @generated
	 */
	void setU2(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRectangularTrimmedSurface#getU2 <em>U2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetU2()
	 * @see #getU2()
	 * @see #setU2(Double)
	 * @generated
	 */
	void unsetU2();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRectangularTrimmedSurface#getU2 <em>U2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>U2</em>' attribute is set.
	 * @see #unsetU2()
	 * @see #getU2()
	 * @see #setU2(Double)
	 * @generated
	 */
	boolean isSetU2();

	/**
	 * Returns the value of the '<em><b>V1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V1</em>' attribute.
	 * @see #isSetV1()
	 * @see #unsetV1()
	 * @see #setV1(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRectangularTrimmedSurface_V1()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getV1();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRectangularTrimmedSurface#getV1 <em>V1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V1</em>' attribute.
	 * @see #isSetV1()
	 * @see #unsetV1()
	 * @see #getV1()
	 * @generated
	 */
	void setV1(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRectangularTrimmedSurface#getV1 <em>V1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetV1()
	 * @see #getV1()
	 * @see #setV1(Double)
	 * @generated
	 */
	void unsetV1();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRectangularTrimmedSurface#getV1 <em>V1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>V1</em>' attribute is set.
	 * @see #unsetV1()
	 * @see #getV1()
	 * @see #setV1(Double)
	 * @generated
	 */
	boolean isSetV1();

	/**
	 * Returns the value of the '<em><b>U1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>U1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>U1</em>' attribute.
	 * @see #isSetU1()
	 * @see #unsetU1()
	 * @see #setU1(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRectangularTrimmedSurface_U1()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getU1();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRectangularTrimmedSurface#getU1 <em>U1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>U1</em>' attribute.
	 * @see #isSetU1()
	 * @see #unsetU1()
	 * @see #getU1()
	 * @generated
	 */
	void setU1(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRectangularTrimmedSurface#getU1 <em>U1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetU1()
	 * @see #getU1()
	 * @see #setU1(Double)
	 * @generated
	 */
	void unsetU1();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRectangularTrimmedSurface#getU1 <em>U1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>U1</em>' attribute is set.
	 * @see #unsetU1()
	 * @see #getU1()
	 * @see #setU1(Double)
	 * @generated
	 */
	boolean isSetU1();

} // IfcRectangularTrimmedSurface
