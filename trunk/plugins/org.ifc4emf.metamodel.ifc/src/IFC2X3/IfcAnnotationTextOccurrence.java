/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcAnnotationTextOccurrenceImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Annotation Text Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcAnnotationTextOccurrence()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcAnnotationTextOccurrenceImplAdapter.class)
public interface IfcAnnotationTextOccurrence extends IfcDraughtingCalloutElement, IfcAnnotationOccurrence {
} // IfcAnnotationTextOccurrence
