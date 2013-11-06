/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcAnnotationCurveOccurrenceImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Annotation Curve Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcAnnotationCurveOccurrence#getAnnotatedBySymbols <em>Annotated By Symbols</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcAnnotationCurveOccurrence()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcAnnotationCurveOccurrenceImplAdapter.class)
public interface IfcAnnotationCurveOccurrence extends IfcDraughtingCalloutElement, IfcAnnotationOccurrence {
	/**
	 * Returns the value of the '<em><b>Annotated By Symbols</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcTerminatorSymbol}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcTerminatorSymbol#getAnnotatedCurve <em>Annotated Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated By Symbols</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated By Symbols</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcAnnotationCurveOccurrence_AnnotatedBySymbols()
	 * @see IFC2X3.IfcTerminatorSymbol#getAnnotatedCurve
	 * @model opposite="AnnotatedCurve" upper="2" ordered="false"
	 * @generated
	 */
	EList<IfcTerminatorSymbol> getAnnotatedBySymbols();

} // IfcAnnotationCurveOccurrence
