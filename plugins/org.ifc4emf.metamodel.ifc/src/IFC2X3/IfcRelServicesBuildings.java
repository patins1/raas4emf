/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcRelServicesBuildingsImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Services Buildings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelServicesBuildings#getRelatingSystem <em>Relating System</em>}</li>
 *   <li>{@link IFC2X3.IfcRelServicesBuildings#getRelatedBuildings <em>Related Buildings</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelServicesBuildings()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelServicesBuildingsImplAdapter.class)
public interface IfcRelServicesBuildings extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating System</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcSystem#getServicesBuildings <em>Services Buildings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating System</em>' reference.
	 * @see #setRelatingSystem(IfcSystem)
	 * @see IFC2X3.IFC2X3Package#getIfcRelServicesBuildings_RelatingSystem()
	 * @see IFC2X3.IfcSystem#getServicesBuildings
	 * @model opposite="ServicesBuildings" required="true"
	 * @generated
	 */
	IfcSystem getRelatingSystem();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelServicesBuildings#getRelatingSystem <em>Relating System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating System</em>' reference.
	 * @see #getRelatingSystem()
	 * @generated
	 */
	void setRelatingSystem(IfcSystem value);

	/**
	 * Returns the value of the '<em><b>Related Buildings</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcSpatialStructureElement}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcSpatialStructureElement#getServicedBySystems <em>Serviced By Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Buildings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Buildings</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcRelServicesBuildings_RelatedBuildings()
	 * @see IFC2X3.IfcSpatialStructureElement#getServicedBySystems
	 * @model opposite="ServicedBySystems" required="true" ordered="false"
	 * @generated
	 */
	EList<IfcSpatialStructureElement> getRelatedBuildings();

} // IfcRelServicesBuildings
