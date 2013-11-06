/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcAnnotationSymbolOccurrenceImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Annotation Symbol Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcAnnotationSymbolOccurrence()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcAnnotationSymbolOccurrenceImplAdapter.class)
public interface IfcAnnotationSymbolOccurrence extends IfcDraughtingCalloutElement, IfcAnnotationOccurrence {
} // IfcAnnotationSymbolOccurrence
