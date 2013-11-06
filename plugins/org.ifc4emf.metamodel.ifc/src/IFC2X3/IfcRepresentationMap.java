/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcRepresentationMapImplAdapter;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Ifc Representation Map</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRepresentationMap#getMappingOrigin <em>Mapping Origin</em>}</li>
 *   <li>{@link IFC2X3.IfcRepresentationMap#getMappedRepresentation <em>Mapped Representation</em>}</li>
 *   <li>{@link IFC2X3.IfcRepresentationMap#getMapUsage <em>Map Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRepresentationMap()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcRepresentationMapImplAdapter.class)
public interface IfcRepresentationMap extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Map Usage</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcMappedItem}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcMappedItem#getMappingSource <em>Mapping Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Usage</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Usage</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcRepresentationMap_MapUsage()
	 * @see IFC2X3.IfcMappedItem#getMappingSource
	 * @model opposite="MappingSource" ordered="false"
	 * @generated
	 */
	EList<IfcMappedItem> getMapUsage();

	/**
	 * Returns the value of the '<em><b>Mapping Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Origin</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Origin</em>' reference.
	 * @see #setMappingOrigin(IfcAxis2Placement)
	 * @see IFC2X3.IFC2X3Package#getIfcRepresentationMap_MappingOrigin()
	 * @model required="true"
	 * @generated
	 */
	IfcAxis2Placement getMappingOrigin();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRepresentationMap#getMappingOrigin <em>Mapping Origin</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Origin</em>' reference.
	 * @see #getMappingOrigin()
	 * @generated
	 */
	void setMappingOrigin(IfcAxis2Placement value);

	/**
	 * Returns the value of the '<em><b>Mapped Representation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRepresentation#getRepresentationMap <em>Representation Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapped Representation</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped Representation</em>' reference.
	 * @see #setMappedRepresentation(IfcRepresentation)
	 * @see IFC2X3.IFC2X3Package#getIfcRepresentationMap_MappedRepresentation()
	 * @see IFC2X3.IfcRepresentation#getRepresentationMap
	 * @model opposite="RepresentationMap" required="true"
	 * @generated
	 */
	IfcRepresentation getMappedRepresentation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRepresentationMap#getMappedRepresentation <em>Mapped Representation</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped Representation</em>' reference.
	 * @see #getMappedRepresentation()
	 * @generated
	 */
	void setMappedRepresentation(IfcRepresentation value);

} // IfcRepresentationMap
