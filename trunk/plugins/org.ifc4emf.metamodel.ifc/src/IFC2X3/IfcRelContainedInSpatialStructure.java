/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcRelContainedInSpatialStructureImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Contained In Spatial Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelContainedInSpatialStructure#getRelatedElements <em>Related Elements</em>}</li>
 *   <li>{@link IFC2X3.IfcRelContainedInSpatialStructure#getRelatingStructure <em>Relating Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelContainedInSpatialStructure()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelContainedInSpatialStructureImplAdapter.class)
public interface IfcRelContainedInSpatialStructure extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Structure</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcSpatialStructureElement#getContainsElements <em>Contains Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Structure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Structure</em>' reference.
	 * @see #setRelatingStructure(IfcSpatialStructureElement)
	 * @see IFC2X3.IFC2X3Package#getIfcRelContainedInSpatialStructure_RelatingStructure()
	 * @see IFC2X3.IfcSpatialStructureElement#getContainsElements
	 * @model opposite="ContainsElements" required="true"
	 * @generated
	 */
	IfcSpatialStructureElement getRelatingStructure();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelContainedInSpatialStructure#getRelatingStructure <em>Relating Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Structure</em>' reference.
	 * @see #getRelatingStructure()
	 * @generated
	 */
	void setRelatingStructure(IfcSpatialStructureElement value);

	/**
	 * Returns the value of the '<em><b>Related Elements</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcProduct}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcProduct#getContainedInStructure <em>Contained In Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Elements</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcRelContainedInSpatialStructure_RelatedElements()
	 * @see IFC2X3.IfcProduct#getContainedInStructure
	 * @model opposite="ContainedInStructure" required="true" ordered="false"
	 * @generated
	 */
	EList<IfcProduct> getRelatedElements();

} // IfcRelContainedInSpatialStructure
