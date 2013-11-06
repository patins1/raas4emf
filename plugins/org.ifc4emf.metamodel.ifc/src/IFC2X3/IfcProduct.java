/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcProductImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcProduct#getObjectPlacement <em>Object Placement</em>}</li>
 *   <li>{@link IFC2X3.IfcProduct#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link IFC2X3.IfcProduct#getReferencedBy <em>Referenced By</em>}</li>
 *   <li>{@link IFC2X3.IfcProduct#getReferencedInStructures <em>Referenced In Structures</em>}</li>
 *   <li>{@link IFC2X3.IfcProduct#getContainedInStructure <em>Contained In Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcProduct()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcProductImplAdapter.class)
public interface IfcProduct extends IfcObject {
	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelAssignsToProduct}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelAssignsToProduct#getRelatingProduct <em>Relating Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcProduct_ReferencedBy()
	 * @see IFC2X3.IfcRelAssignsToProduct#getRelatingProduct
	 * @model opposite="RelatingProduct" ordered="false"
	 * @generated
	 */
	EList<IfcRelAssignsToProduct> getReferencedBy();

	/**
	 * Returns the value of the '<em><b>Referenced In Structures</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelReferencedInSpatialStructure}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelReferencedInSpatialStructure#getRelatedElements <em>Related Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced In Structures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced In Structures</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcProduct_ReferencedInStructures()
	 * @see IFC2X3.IfcRelReferencedInSpatialStructure#getRelatedElements
	 * @model opposite="RelatedElements" ordered="false"
	 * @generated
	 */
	EList<IfcRelReferencedInSpatialStructure> getReferencedInStructures();

	/**
	 * Returns the value of the '<em><b>Contained In Structure</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelContainedInSpatialStructure#getRelatedElements <em>Related Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained In Structure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained In Structure</em>' reference.
	 * @see #setContainedInStructure(IfcRelContainedInSpatialStructure)
	 * @see IFC2X3.IFC2X3Package#getIfcProduct_ContainedInStructure()
	 * @see IFC2X3.IfcRelContainedInSpatialStructure#getRelatedElements
	 * @model opposite="RelatedElements" ordered="false"
	 * @generated
	 */
	IfcRelContainedInSpatialStructure getContainedInStructure();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcProduct#getContainedInStructure <em>Contained In Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained In Structure</em>' reference.
	 * @see #getContainedInStructure()
	 * @generated
	 */
	void setContainedInStructure(IfcRelContainedInSpatialStructure value);

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcProductRepresentation#getShapeOfProduct <em>Shape Of Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' reference.
	 * @see #setRepresentation(IfcProductRepresentation)
	 * @see IFC2X3.IFC2X3Package#getIfcProduct_Representation()
	 * @see IFC2X3.IfcProductRepresentation#getShapeOfProduct
	 * @model opposite="ShapeOfProduct"
	 * @generated
	 */
	IfcProductRepresentation getRepresentation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcProduct#getRepresentation <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(IfcProductRepresentation value);

	/**
	 * Returns the value of the '<em><b>Object Placement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcObjectPlacement#getPlacesObject <em>Places Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Placement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Placement</em>' reference.
	 * @see #setObjectPlacement(IfcObjectPlacement)
	 * @see IFC2X3.IFC2X3Package#getIfcProduct_ObjectPlacement()
	 * @see IFC2X3.IfcObjectPlacement#getPlacesObject
	 * @model opposite="PlacesObject"
	 * @generated
	 */
	IfcObjectPlacement getObjectPlacement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcProduct#getObjectPlacement <em>Object Placement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Placement</em>' reference.
	 * @see #getObjectPlacement()
	 * @generated
	 */
	void setObjectPlacement(IfcObjectPlacement value);

} // IfcProduct
