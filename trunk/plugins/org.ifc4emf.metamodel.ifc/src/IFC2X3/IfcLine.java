/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcLineImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcLine#getPnt <em>Pnt</em>}</li>
 *   <li>{@link IFC2X3.IfcLine#getDir <em>Dir</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcLine()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcLineImplAdapter.class)
public interface IfcLine extends IfcCurve {
	/**
	 * Returns the value of the '<em><b>Pnt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pnt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pnt</em>' reference.
	 * @see #setPnt(IfcCartesianPoint)
	 * @see IFC2X3.IFC2X3Package#getIfcLine_Pnt()
	 * @model required="true"
	 * @generated
	 */
	IfcCartesianPoint getPnt();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLine#getPnt <em>Pnt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pnt</em>' reference.
	 * @see #getPnt()
	 * @generated
	 */
	void setPnt(IfcCartesianPoint value);

	/**
	 * Returns the value of the '<em><b>Dir</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir</em>' reference.
	 * @see #setDir(IfcVector)
	 * @see IFC2X3.IFC2X3Package#getIfcLine_Dir()
	 * @model required="true"
	 * @generated
	 */
	IfcVector getDir();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLine#getDir <em>Dir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' reference.
	 * @see #getDir()
	 * @generated
	 */
	void setDir(IfcVector value);

} // IfcLine
