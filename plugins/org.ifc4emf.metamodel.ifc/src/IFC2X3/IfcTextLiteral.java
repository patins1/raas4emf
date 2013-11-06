/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcTextLiteralImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Text Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTextLiteral#getLiteral <em>Literal</em>}</li>
 *   <li>{@link IFC2X3.IfcTextLiteral#getPlacement <em>Placement</em>}</li>
 *   <li>{@link IFC2X3.IfcTextLiteral#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTextLiteral()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcTextLiteralImplAdapter.class)
public interface IfcTextLiteral extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Placement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement</em>' reference.
	 * @see #setPlacement(IfcAxis2Placement)
	 * @see IFC2X3.IFC2X3Package#getIfcTextLiteral_Placement()
	 * @model required="true"
	 * @generated
	 */
	IfcAxis2Placement getPlacement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextLiteral#getPlacement <em>Placement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement</em>' reference.
	 * @see #getPlacement()
	 * @generated
	 */
	void setPlacement(IfcAxis2Placement value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcTextPath}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see IFC2X3.IfcTextPath
	 * @see #isSetPath()
	 * @see #unsetPath()
	 * @see #setPath(IfcTextPath)
	 * @see IFC2X3.IFC2X3Package#getIfcTextLiteral_Path()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcTextPath getPath();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextLiteral#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see IFC2X3.IfcTextPath
	 * @see #isSetPath()
	 * @see #unsetPath()
	 * @see #getPath()
	 * @generated
	 */
	void setPath(IfcTextPath value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTextLiteral#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPath()
	 * @see #getPath()
	 * @see #setPath(IfcTextPath)
	 * @generated
	 */
	void unsetPath();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTextLiteral#getPath <em>Path</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Path</em>' attribute is set.
	 * @see #unsetPath()
	 * @see #getPath()
	 * @see #setPath(IfcTextPath)
	 * @generated
	 */
	boolean isSetPath();

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see #isSetLiteral()
	 * @see #unsetLiteral()
	 * @see #setLiteral(String)
	 * @see IFC2X3.IFC2X3Package#getIfcTextLiteral_Literal()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getLiteral();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextLiteral#getLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see #isSetLiteral()
	 * @see #unsetLiteral()
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTextLiteral#getLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLiteral()
	 * @see #getLiteral()
	 * @see #setLiteral(String)
	 * @generated
	 */
	void unsetLiteral();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTextLiteral#getLiteral <em>Literal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Literal</em>' attribute is set.
	 * @see #unsetLiteral()
	 * @see #getLiteral()
	 * @see #setLiteral(String)
	 * @generated
	 */
	boolean isSetLiteral();

} // IfcTextLiteral
