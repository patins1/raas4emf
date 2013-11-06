/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcStructuralSurfaceMemberVaryingImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Surface Member Varying</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcStructuralSurfaceMemberVarying#getSubsequentThickness <em>Subsequent Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralSurfaceMemberVarying#getVaryingThicknessLocation <em>Varying Thickness Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcStructuralSurfaceMemberVarying()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcStructuralSurfaceMemberVaryingImplAdapter.class)
public interface IfcStructuralSurfaceMemberVarying extends IfcStructuralSurfaceMember {
	/**
	 * Returns the value of the '<em><b>Varying Thickness Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Varying Thickness Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varying Thickness Location</em>' reference.
	 * @see #setVaryingThicknessLocation(IfcShapeAspect)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralSurfaceMemberVarying_VaryingThicknessLocation()
	 * @model required="true"
	 * @generated
	 */
	IfcShapeAspect getVaryingThicknessLocation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralSurfaceMemberVarying#getVaryingThicknessLocation <em>Varying Thickness Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varying Thickness Location</em>' reference.
	 * @see #getVaryingThicknessLocation()
	 * @generated
	 */
	void setVaryingThicknessLocation(IfcShapeAspect value);

	/**
	 * Returns the value of the '<em><b>Subsequent Thickness</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsequent Thickness</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsequent Thickness</em>' attribute list.
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralSurfaceMemberVarying_SubsequentThickness()
	 * @model unique="false" dataType="IFC2X3.REAL" lower="2"
	 * @generated
	 */
	EList<Double> getSubsequentThickness();

} // IfcStructuralSurfaceMemberVarying
