/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcStructuralPlanarActionImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Planar Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcStructuralPlanarAction#getProjectedOrTrue <em>Projected Or True</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcStructuralPlanarAction()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcStructuralPlanarActionImplAdapter.class)
public interface IfcStructuralPlanarAction extends IfcStructuralAction {
	/**
	 * Returns the value of the '<em><b>Projected Or True</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcProjectedOrTrueLengthEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projected Or True</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projected Or True</em>' attribute.
	 * @see IFC2X3.IfcProjectedOrTrueLengthEnum
	 * @see #isSetProjectedOrTrue()
	 * @see #unsetProjectedOrTrue()
	 * @see #setProjectedOrTrue(IfcProjectedOrTrueLengthEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralPlanarAction_ProjectedOrTrue()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcProjectedOrTrueLengthEnum getProjectedOrTrue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralPlanarAction#getProjectedOrTrue <em>Projected Or True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projected Or True</em>' attribute.
	 * @see IFC2X3.IfcProjectedOrTrueLengthEnum
	 * @see #isSetProjectedOrTrue()
	 * @see #unsetProjectedOrTrue()
	 * @see #getProjectedOrTrue()
	 * @generated
	 */
	void setProjectedOrTrue(IfcProjectedOrTrueLengthEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralPlanarAction#getProjectedOrTrue <em>Projected Or True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProjectedOrTrue()
	 * @see #getProjectedOrTrue()
	 * @see #setProjectedOrTrue(IfcProjectedOrTrueLengthEnum)
	 * @generated
	 */
	void unsetProjectedOrTrue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralPlanarAction#getProjectedOrTrue <em>Projected Or True</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Projected Or True</em>' attribute is set.
	 * @see #unsetProjectedOrTrue()
	 * @see #getProjectedOrTrue()
	 * @see #setProjectedOrTrue(IfcProjectedOrTrueLengthEnum)
	 * @generated
	 */
	boolean isSetProjectedOrTrue();

} // IfcStructuralPlanarAction
