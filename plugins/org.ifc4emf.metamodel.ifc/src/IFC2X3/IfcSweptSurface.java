/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcSweptSurfaceImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Swept Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSweptSurface#getSweptCurve <em>Swept Curve</em>}</li>
 *   <li>{@link IFC2X3.IfcSweptSurface#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSweptSurface()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSweptSurfaceImplAdapter.class)
public interface IfcSweptSurface extends IfcSurface {
	/**
	 * Returns the value of the '<em><b>Swept Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swept Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swept Curve</em>' reference.
	 * @see #setSweptCurve(IfcProfileDef)
	 * @see IFC2X3.IFC2X3Package#getIfcSweptSurface_SweptCurve()
	 * @model required="true"
	 * @generated
	 */
	IfcProfileDef getSweptCurve();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSweptSurface#getSweptCurve <em>Swept Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swept Curve</em>' reference.
	 * @see #getSweptCurve()
	 * @generated
	 */
	void setSweptCurve(IfcProfileDef value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(IfcAxis2Placement3D)
	 * @see IFC2X3.IFC2X3Package#getIfcSweptSurface_Position()
	 * @model required="true"
	 * @generated
	 */
	IfcAxis2Placement3D getPosition();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSweptSurface#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(IfcAxis2Placement3D value);

} // IfcSweptSurface
