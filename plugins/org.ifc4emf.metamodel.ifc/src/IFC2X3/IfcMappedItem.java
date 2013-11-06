/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcMappedItemImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Mapped Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcMappedItem#getMappingSource <em>Mapping Source</em>}</li>
 *   <li>{@link IFC2X3.IfcMappedItem#getMappingTarget <em>Mapping Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcMappedItem()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcMappedItemImplAdapter.class)
public interface IfcMappedItem extends IfcRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Mapping Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Target</em>' reference.
	 * @see #setMappingTarget(IfcCartesianTransformationOperator)
	 * @see IFC2X3.IFC2X3Package#getIfcMappedItem_MappingTarget()
	 * @model required="true"
	 * @generated
	 */
	IfcCartesianTransformationOperator getMappingTarget();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMappedItem#getMappingTarget <em>Mapping Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Target</em>' reference.
	 * @see #getMappingTarget()
	 * @generated
	 */
	void setMappingTarget(IfcCartesianTransformationOperator value);

	/**
	 * Returns the value of the '<em><b>Mapping Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRepresentationMap#getMapUsage <em>Map Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Source</em>' reference.
	 * @see #setMappingSource(IfcRepresentationMap)
	 * @see IFC2X3.IFC2X3Package#getIfcMappedItem_MappingSource()
	 * @see IFC2X3.IfcRepresentationMap#getMapUsage
	 * @model opposite="MapUsage" required="true"
	 * @generated
	 */
	IfcRepresentationMap getMappingSource();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMappedItem#getMappingSource <em>Mapping Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Source</em>' reference.
	 * @see #getMappingSource()
	 * @generated
	 */
	void setMappingSource(IfcRepresentationMap value);

} // IfcMappedItem
