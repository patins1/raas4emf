/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcCurveBoundedPlaneImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Curve Bounded Plane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCurveBoundedPlane#getBasisSurface <em>Basis Surface</em>}</li>
 *   <li>{@link IFC2X3.IfcCurveBoundedPlane#getOuterBoundary <em>Outer Boundary</em>}</li>
 *   <li>{@link IFC2X3.IfcCurveBoundedPlane#getInnerBoundaries <em>Inner Boundaries</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCurveBoundedPlane()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcCurveBoundedPlaneImplAdapter.class)
public interface IfcCurveBoundedPlane extends IfcBoundedSurface {
	/**
	 * Returns the value of the '<em><b>Outer Boundary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Boundary</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Boundary</em>' reference.
	 * @see #setOuterBoundary(IfcCurve)
	 * @see IFC2X3.IFC2X3Package#getIfcCurveBoundedPlane_OuterBoundary()
	 * @model required="true"
	 * @generated
	 */
	IfcCurve getOuterBoundary();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCurveBoundedPlane#getOuterBoundary <em>Outer Boundary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Boundary</em>' reference.
	 * @see #getOuterBoundary()
	 * @generated
	 */
	void setOuterBoundary(IfcCurve value);

	/**
	 * Returns the value of the '<em><b>Inner Boundaries</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcCurve}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Boundaries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Boundaries</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcCurveBoundedPlane_InnerBoundaries()
	 * @model ordered="false"
	 * @generated
	 */
	EList<IfcCurve> getInnerBoundaries();

	/**
	 * Returns the value of the '<em><b>Basis Surface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Surface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Surface</em>' reference.
	 * @see #setBasisSurface(IfcPlane)
	 * @see IFC2X3.IFC2X3Package#getIfcCurveBoundedPlane_BasisSurface()
	 * @model required="true"
	 * @generated
	 */
	IfcPlane getBasisSurface();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCurveBoundedPlane#getBasisSurface <em>Basis Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis Surface</em>' reference.
	 * @see #getBasisSurface()
	 * @generated
	 */
	void setBasisSurface(IfcPlane value);

} // IfcCurveBoundedPlane
