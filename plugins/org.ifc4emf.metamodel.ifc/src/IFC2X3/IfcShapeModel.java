/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcShapeModelImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Shape Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcShapeModel#getOfShapeAspect <em>Of Shape Aspect</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcShapeModel()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcShapeModelImplAdapter.class)
public interface IfcShapeModel extends IfcRepresentation {
	/**
	 * Returns the value of the '<em><b>Of Shape Aspect</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcShapeAspect#getShapeRepresentations <em>Shape Representations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Of Shape Aspect</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Of Shape Aspect</em>' reference.
	 * @see #setOfShapeAspect(IfcShapeAspect)
	 * @see IFC2X3.IFC2X3Package#getIfcShapeModel_OfShapeAspect()
	 * @see IFC2X3.IfcShapeAspect#getShapeRepresentations
	 * @model opposite="ShapeRepresentations" ordered="false"
	 * @generated
	 */
	IfcShapeAspect getOfShapeAspect();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcShapeModel#getOfShapeAspect <em>Of Shape Aspect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Of Shape Aspect</em>' reference.
	 * @see #getOfShapeAspect()
	 * @generated
	 */
	void setOfShapeAspect(IfcShapeAspect value);

} // IfcShapeModel
