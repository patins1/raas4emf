/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcTextureCoordinateGeneratorImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Texture Coordinate Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTextureCoordinateGenerator#getMode <em>Mode</em>}</li>
 *   <li>{@link IFC2X3.IfcTextureCoordinateGenerator#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTextureCoordinateGenerator()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcTextureCoordinateGeneratorImplAdapter.class)
public interface IfcTextureCoordinateGenerator extends IfcTextureCoordinate {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link IFC2X3.IfcSimpleValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcTextureCoordinateGenerator_Parameter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IfcSimpleValue> getParameter();

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #setMode(String)
	 * @see IFC2X3.IFC2X3Package#getIfcTextureCoordinateGenerator_Mode()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getMode();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextureCoordinateGenerator#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #getMode()
	 * @generated
	 */
	void setMode(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTextureCoordinateGenerator#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMode()
	 * @see #getMode()
	 * @see #setMode(String)
	 * @generated
	 */
	void unsetMode();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTextureCoordinateGenerator#getMode <em>Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode</em>' attribute is set.
	 * @see #unsetMode()
	 * @see #getMode()
	 * @see #setMode(String)
	 * @generated
	 */
	boolean isSetMode();

} // IfcTextureCoordinateGenerator
