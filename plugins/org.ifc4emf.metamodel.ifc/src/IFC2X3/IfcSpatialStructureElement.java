/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcSpatialStructureElementImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Spatial Structure Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSpatialStructureElement#getLongName <em>Long Name</em>}</li>
 *   <li>{@link IFC2X3.IfcSpatialStructureElement#getCompositionType <em>Composition Type</em>}</li>
 *   <li>{@link IFC2X3.IfcSpatialStructureElement#getReferencesElements <em>References Elements</em>}</li>
 *   <li>{@link IFC2X3.IfcSpatialStructureElement#getServicedBySystems <em>Serviced By Systems</em>}</li>
 *   <li>{@link IFC2X3.IfcSpatialStructureElement#getContainsElements <em>Contains Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSpatialStructureElement()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSpatialStructureElementImplAdapter.class)
public interface IfcSpatialStructureElement extends IfcProduct {
	/**
	 * Returns the value of the '<em><b>References Elements</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelReferencedInSpatialStructure}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelReferencedInSpatialStructure#getRelatingStructure <em>Relating Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References Elements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References Elements</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcSpatialStructureElement_ReferencesElements()
	 * @see IFC2X3.IfcRelReferencedInSpatialStructure#getRelatingStructure
	 * @model opposite="RelatingStructure" ordered="false"
	 * @generated
	 */
	EList<IfcRelReferencedInSpatialStructure> getReferencesElements();

	/**
	 * Returns the value of the '<em><b>Serviced By Systems</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelServicesBuildings}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelServicesBuildings#getRelatedBuildings <em>Related Buildings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serviced By Systems</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviced By Systems</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcSpatialStructureElement_ServicedBySystems()
	 * @see IFC2X3.IfcRelServicesBuildings#getRelatedBuildings
	 * @model opposite="RelatedBuildings" ordered="false"
	 * @generated
	 */
	EList<IfcRelServicesBuildings> getServicedBySystems();

	/**
	 * Returns the value of the '<em><b>Contains Elements</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelContainedInSpatialStructure}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelContainedInSpatialStructure#getRelatingStructure <em>Relating Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Elements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Elements</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcSpatialStructureElement_ContainsElements()
	 * @see IFC2X3.IfcRelContainedInSpatialStructure#getRelatingStructure
	 * @model opposite="RelatingStructure" ordered="false"
	 * @generated
	 */
	EList<IfcRelContainedInSpatialStructure> getContainsElements();

	/**
	 * Returns the value of the '<em><b>Composition Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcElementCompositionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition Type</em>' attribute.
	 * @see IFC2X3.IfcElementCompositionEnum
	 * @see #isSetCompositionType()
	 * @see #unsetCompositionType()
	 * @see #setCompositionType(IfcElementCompositionEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcSpatialStructureElement_CompositionType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcElementCompositionEnum getCompositionType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSpatialStructureElement#getCompositionType <em>Composition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composition Type</em>' attribute.
	 * @see IFC2X3.IfcElementCompositionEnum
	 * @see #isSetCompositionType()
	 * @see #unsetCompositionType()
	 * @see #getCompositionType()
	 * @generated
	 */
	void setCompositionType(IfcElementCompositionEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSpatialStructureElement#getCompositionType <em>Composition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompositionType()
	 * @see #getCompositionType()
	 * @see #setCompositionType(IfcElementCompositionEnum)
	 * @generated
	 */
	void unsetCompositionType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSpatialStructureElement#getCompositionType <em>Composition Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Composition Type</em>' attribute is set.
	 * @see #unsetCompositionType()
	 * @see #getCompositionType()
	 * @see #setCompositionType(IfcElementCompositionEnum)
	 * @generated
	 */
	boolean isSetCompositionType();

	/**
	 * Returns the value of the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Name</em>' attribute.
	 * @see #isSetLongName()
	 * @see #unsetLongName()
	 * @see #setLongName(String)
	 * @see IFC2X3.IFC2X3Package#getIfcSpatialStructureElement_LongName()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getLongName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSpatialStructureElement#getLongName <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Name</em>' attribute.
	 * @see #isSetLongName()
	 * @see #unsetLongName()
	 * @see #getLongName()
	 * @generated
	 */
	void setLongName(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSpatialStructureElement#getLongName <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLongName()
	 * @see #getLongName()
	 * @see #setLongName(String)
	 * @generated
	 */
	void unsetLongName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSpatialStructureElement#getLongName <em>Long Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Long Name</em>' attribute is set.
	 * @see #unsetLongName()
	 * @see #getLongName()
	 * @see #setLongName(String)
	 * @generated
	 */
	boolean isSetLongName();

} // IfcSpatialStructureElement
