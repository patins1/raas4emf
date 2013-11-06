/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcAnnotationImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcAnnotation()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcAnnotationImplAdapter.class)
public interface IfcAnnotation extends IfcProduct {
} // IfcAnnotation
