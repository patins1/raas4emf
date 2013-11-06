/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcStructuralSurfaceMemberImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Surface Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcStructuralSurfaceMember#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralSurfaceMember#getThickness <em>Thickness</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcStructuralSurfaceMember()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcStructuralSurfaceMemberImplAdapter.class)
public interface IfcStructuralSurfaceMember extends IfcStructuralMember {
	/**
	 * Returns the value of the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thickness</em>' attribute.
	 * @see #isSetThickness()
	 * @see #unsetThickness()
	 * @see #setThickness(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralSurfaceMember_Thickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralSurfaceMember#getThickness <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thickness</em>' attribute.
	 * @see #isSetThickness()
	 * @see #unsetThickness()
	 * @see #getThickness()
	 * @generated
	 */
	void setThickness(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralSurfaceMember#getThickness <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThickness()
	 * @see #getThickness()
	 * @see #setThickness(Double)
	 * @generated
	 */
	void unsetThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralSurfaceMember#getThickness <em>Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thickness</em>' attribute is set.
	 * @see #unsetThickness()
	 * @see #getThickness()
	 * @see #setThickness(Double)
	 * @generated
	 */
	boolean isSetThickness();

	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcStructuralSurfaceTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcStructuralSurfaceTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #setPredefinedType(IfcStructuralSurfaceTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralSurfaceMember_PredefinedType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcStructuralSurfaceTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralSurfaceMember#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcStructuralSurfaceTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcStructuralSurfaceTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralSurfaceMember#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcStructuralSurfaceTypeEnum)
	 * @generated
	 */
	void unsetPredefinedType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralSurfaceMember#getPredefinedType <em>Predefined Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Predefined Type</em>' attribute is set.
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcStructuralSurfaceTypeEnum)
	 * @generated
	 */
	boolean isSetPredefinedType();

} // IfcStructuralSurfaceMember
