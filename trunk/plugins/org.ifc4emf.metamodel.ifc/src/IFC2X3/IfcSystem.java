/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcSystemImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSystem#getServicesBuildings <em>Services Buildings</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSystem()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSystemImplAdapter.class)
public interface IfcSystem extends IfcGroup {
	/**
	 * Returns the value of the '<em><b>Services Buildings</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelServicesBuildings#getRelatingSystem <em>Relating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services Buildings</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services Buildings</em>' reference.
	 * @see #setServicesBuildings(IfcRelServicesBuildings)
	 * @see IFC2X3.IFC2X3Package#getIfcSystem_ServicesBuildings()
	 * @see IFC2X3.IfcRelServicesBuildings#getRelatingSystem
	 * @model opposite="RelatingSystem" ordered="false"
	 * @generated
	 */
	IfcRelServicesBuildings getServicesBuildings();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSystem#getServicesBuildings <em>Services Buildings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services Buildings</em>' reference.
	 * @see #getServicesBuildings()
	 * @generated
	 */
	void setServicesBuildings(IfcRelServicesBuildings value);

} // IfcSystem
