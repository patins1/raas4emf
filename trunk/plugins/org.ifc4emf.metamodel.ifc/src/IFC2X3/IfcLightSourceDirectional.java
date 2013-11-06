/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcLightSourceDirectionalImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Light Source Directional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcLightSourceDirectional#getOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcLightSourceDirectional()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcLightSourceDirectionalImplAdapter.class)
public interface IfcLightSourceDirectional extends IfcLightSource {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' reference.
	 * @see #setOrientation(IfcDirection)
	 * @see IFC2X3.IFC2X3Package#getIfcLightSourceDirectional_Orientation()
	 * @model required="true"
	 * @generated
	 */
	IfcDirection getOrientation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLightSourceDirectional#getOrientation <em>Orientation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(IfcDirection value);

} // IfcLightSourceDirectional
