/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcProductDefinitionShapeImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Product Definition Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcProductDefinitionShape#getHasShapeAspects <em>Has Shape Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcProductDefinitionShape()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcProductDefinitionShapeImplAdapter.class)
public interface IfcProductDefinitionShape extends IfcProductRepresentation {
	/**
	 * Returns the value of the '<em><b>Has Shape Aspects</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcShapeAspect}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcShapeAspect#getPartOfProductDefinitionShape <em>Part Of Product Definition Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Shape Aspects</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Shape Aspects</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcProductDefinitionShape_HasShapeAspects()
	 * @see IFC2X3.IfcShapeAspect#getPartOfProductDefinitionShape
	 * @model opposite="PartOfProductDefinitionShape" ordered="false"
	 * @generated
	 */
	EList<IfcShapeAspect> getHasShapeAspects();

} // IfcProductDefinitionShape
