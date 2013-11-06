/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcPresentationStyleSelectImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Presentation Style Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPresentationStyleSelect#getIfcNullStylevalue <em>Ifc Null Stylevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcPresentationStyleSelect#getIfcSurfaceStylevalue <em>Ifc Surface Stylevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcPresentationStyleSelect#getIfcTextStylevalue <em>Ifc Text Stylevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcPresentationStyleSelect#getIfcFillAreaStylevalue <em>Ifc Fill Area Stylevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcPresentationStyleSelect#getIfcSymbolStylevalue <em>Ifc Symbol Stylevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcPresentationStyleSelect#getIfcCurveStylevalue <em>Ifc Curve Stylevalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPresentationStyleSelect()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcPresentationStyleSelectImplAdapter.class)
public interface IfcPresentationStyleSelect extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Ifc Null Stylevalue</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcNullStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Null Stylevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Null Stylevalue</em>' attribute.
	 * @see IFC2X3.IfcNullStyle
	 * @see #isSetIfcNullStylevalue()
	 * @see #unsetIfcNullStylevalue()
	 * @see #setIfcNullStylevalue(IfcNullStyle)
	 * @see IFC2X3.IFC2X3Package#getIfcPresentationStyleSelect_IfcNullStylevalue()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcNullStyle getIfcNullStylevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPresentationStyleSelect#getIfcNullStylevalue <em>Ifc Null Stylevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Null Stylevalue</em>' attribute.
	 * @see IFC2X3.IfcNullStyle
	 * @see #isSetIfcNullStylevalue()
	 * @see #unsetIfcNullStylevalue()
	 * @see #getIfcNullStylevalue()
	 * @generated
	 */
	void setIfcNullStylevalue(IfcNullStyle value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPresentationStyleSelect#getIfcNullStylevalue <em>Ifc Null Stylevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcNullStylevalue()
	 * @see #getIfcNullStylevalue()
	 * @see #setIfcNullStylevalue(IfcNullStyle)
	 * @generated
	 */
	void unsetIfcNullStylevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPresentationStyleSelect#getIfcNullStylevalue <em>Ifc Null Stylevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Null Stylevalue</em>' attribute is set.
	 * @see #unsetIfcNullStylevalue()
	 * @see #getIfcNullStylevalue()
	 * @see #setIfcNullStylevalue(IfcNullStyle)
	 * @generated
	 */
	boolean isSetIfcNullStylevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Text Stylevalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Text Stylevalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Text Stylevalue</em>' reference.
	 * @see #setIfcTextStylevalue(IfcTextStyle)
	 * @see IFC2X3.IFC2X3Package#getIfcPresentationStyleSelect_IfcTextStylevalue()
	 * @model
	 * @generated
	 */
	IfcTextStyle getIfcTextStylevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPresentationStyleSelect#getIfcTextStylevalue <em>Ifc Text Stylevalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Text Stylevalue</em>' reference.
	 * @see #getIfcTextStylevalue()
	 * @generated
	 */
	void setIfcTextStylevalue(IfcTextStyle value);

	/**
	 * Returns the value of the '<em><b>Ifc Surface Stylevalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Surface Stylevalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Surface Stylevalue</em>' reference.
	 * @see #setIfcSurfaceStylevalue(IfcSurfaceStyle)
	 * @see IFC2X3.IFC2X3Package#getIfcPresentationStyleSelect_IfcSurfaceStylevalue()
	 * @model
	 * @generated
	 */
	IfcSurfaceStyle getIfcSurfaceStylevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPresentationStyleSelect#getIfcSurfaceStylevalue <em>Ifc Surface Stylevalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Surface Stylevalue</em>' reference.
	 * @see #getIfcSurfaceStylevalue()
	 * @generated
	 */
	void setIfcSurfaceStylevalue(IfcSurfaceStyle value);

	/**
	 * Returns the value of the '<em><b>Ifc Curve Stylevalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Curve Stylevalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Curve Stylevalue</em>' reference.
	 * @see #setIfcCurveStylevalue(IfcCurveStyle)
	 * @see IFC2X3.IFC2X3Package#getIfcPresentationStyleSelect_IfcCurveStylevalue()
	 * @model
	 * @generated
	 */
	IfcCurveStyle getIfcCurveStylevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPresentationStyleSelect#getIfcCurveStylevalue <em>Ifc Curve Stylevalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Curve Stylevalue</em>' reference.
	 * @see #getIfcCurveStylevalue()
	 * @generated
	 */
	void setIfcCurveStylevalue(IfcCurveStyle value);

	/**
	 * Returns the value of the '<em><b>Ifc Symbol Stylevalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Symbol Stylevalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Symbol Stylevalue</em>' reference.
	 * @see #setIfcSymbolStylevalue(IfcSymbolStyle)
	 * @see IFC2X3.IFC2X3Package#getIfcPresentationStyleSelect_IfcSymbolStylevalue()
	 * @model
	 * @generated
	 */
	IfcSymbolStyle getIfcSymbolStylevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPresentationStyleSelect#getIfcSymbolStylevalue <em>Ifc Symbol Stylevalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Symbol Stylevalue</em>' reference.
	 * @see #getIfcSymbolStylevalue()
	 * @generated
	 */
	void setIfcSymbolStylevalue(IfcSymbolStyle value);

	/**
	 * Returns the value of the '<em><b>Ifc Fill Area Stylevalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Fill Area Stylevalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Fill Area Stylevalue</em>' reference.
	 * @see #setIfcFillAreaStylevalue(IfcFillAreaStyle)
	 * @see IFC2X3.IFC2X3Package#getIfcPresentationStyleSelect_IfcFillAreaStylevalue()
	 * @model
	 * @generated
	 */
	IfcFillAreaStyle getIfcFillAreaStylevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPresentationStyleSelect#getIfcFillAreaStylevalue <em>Ifc Fill Area Stylevalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Fill Area Stylevalue</em>' reference.
	 * @see #getIfcFillAreaStylevalue()
	 * @generated
	 */
	void setIfcFillAreaStylevalue(IfcFillAreaStyle value);

} // IfcPresentationStyleSelect
