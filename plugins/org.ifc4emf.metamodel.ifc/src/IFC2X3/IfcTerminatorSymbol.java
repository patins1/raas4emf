/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcTerminatorSymbolImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Terminator Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTerminatorSymbol#getAnnotatedCurve <em>Annotated Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTerminatorSymbol()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcTerminatorSymbolImplAdapter.class)
public interface IfcTerminatorSymbol extends IfcAnnotationSymbolOccurrence {
	/**
	 * Returns the value of the '<em><b>Annotated Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcAnnotationCurveOccurrence#getAnnotatedBySymbols <em>Annotated By Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated Curve</em>' reference.
	 * @see #setAnnotatedCurve(IfcAnnotationCurveOccurrence)
	 * @see IFC2X3.IFC2X3Package#getIfcTerminatorSymbol_AnnotatedCurve()
	 * @see IFC2X3.IfcAnnotationCurveOccurrence#getAnnotatedBySymbols
	 * @model opposite="AnnotatedBySymbols" required="true"
	 * @generated
	 */
	IfcAnnotationCurveOccurrence getAnnotatedCurve();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTerminatorSymbol#getAnnotatedCurve <em>Annotated Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated Curve</em>' reference.
	 * @see #getAnnotatedCurve()
	 * @generated
	 */
	void setAnnotatedCurve(IfcAnnotationCurveOccurrence value);

} // IfcTerminatorSymbol
