/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcConnectionPortGeometryImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Connection Port Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcConnectionPortGeometry#getLocationAtRelatingElement <em>Location At Relating Element</em>}</li>
 *   <li>{@link IFC2X3.IfcConnectionPortGeometry#getLocationAtRelatedElement <em>Location At Related Element</em>}</li>
 *   <li>{@link IFC2X3.IfcConnectionPortGeometry#getProfileOfPort <em>Profile Of Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcConnectionPortGeometry()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcConnectionPortGeometryImplAdapter.class)
public interface IfcConnectionPortGeometry extends IfcConnectionGeometry {
	/**
	 * Returns the value of the '<em><b>Location At Relating Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location At Relating Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location At Relating Element</em>' reference.
	 * @see #setLocationAtRelatingElement(IfcAxis2Placement)
	 * @see IFC2X3.IFC2X3Package#getIfcConnectionPortGeometry_LocationAtRelatingElement()
	 * @model required="true"
	 * @generated
	 */
	IfcAxis2Placement getLocationAtRelatingElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConnectionPortGeometry#getLocationAtRelatingElement <em>Location At Relating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location At Relating Element</em>' reference.
	 * @see #getLocationAtRelatingElement()
	 * @generated
	 */
	void setLocationAtRelatingElement(IfcAxis2Placement value);

	/**
	 * Returns the value of the '<em><b>Profile Of Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Of Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Of Port</em>' reference.
	 * @see #setProfileOfPort(IfcProfileDef)
	 * @see IFC2X3.IFC2X3Package#getIfcConnectionPortGeometry_ProfileOfPort()
	 * @model required="true"
	 * @generated
	 */
	IfcProfileDef getProfileOfPort();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConnectionPortGeometry#getProfileOfPort <em>Profile Of Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Of Port</em>' reference.
	 * @see #getProfileOfPort()
	 * @generated
	 */
	void setProfileOfPort(IfcProfileDef value);

	/**
	 * Returns the value of the '<em><b>Location At Related Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location At Related Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location At Related Element</em>' reference.
	 * @see #setLocationAtRelatedElement(IfcAxis2Placement)
	 * @see IFC2X3.IFC2X3Package#getIfcConnectionPortGeometry_LocationAtRelatedElement()
	 * @model
	 * @generated
	 */
	IfcAxis2Placement getLocationAtRelatedElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConnectionPortGeometry#getLocationAtRelatedElement <em>Location At Related Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location At Related Element</em>' reference.
	 * @see #getLocationAtRelatedElement()
	 * @generated
	 */
	void setLocationAtRelatedElement(IfcAxis2Placement value);

} // IfcConnectionPortGeometry
