/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcReinforcingMeshImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Reinforcing Mesh</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcReinforcingMesh#getMeshLength <em>Mesh Length</em>}</li>
 *   <li>{@link IFC2X3.IfcReinforcingMesh#getMeshWidth <em>Mesh Width</em>}</li>
 *   <li>{@link IFC2X3.IfcReinforcingMesh#getLongitudinalBarNominalDiameter <em>Longitudinal Bar Nominal Diameter</em>}</li>
 *   <li>{@link IFC2X3.IfcReinforcingMesh#getTransverseBarNominalDiameter <em>Transverse Bar Nominal Diameter</em>}</li>
 *   <li>{@link IFC2X3.IfcReinforcingMesh#getLongitudinalBarCrossSectionArea <em>Longitudinal Bar Cross Section Area</em>}</li>
 *   <li>{@link IFC2X3.IfcReinforcingMesh#getTransverseBarCrossSectionArea <em>Transverse Bar Cross Section Area</em>}</li>
 *   <li>{@link IFC2X3.IfcReinforcingMesh#getLongitudinalBarSpacing <em>Longitudinal Bar Spacing</em>}</li>
 *   <li>{@link IFC2X3.IfcReinforcingMesh#getTransverseBarSpacing <em>Transverse Bar Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcReinforcingMesh()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcReinforcingMeshImplAdapter.class)
public interface IfcReinforcingMesh extends IfcReinforcingElement {
	/**
	 * Returns the value of the '<em><b>Transverse Bar Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transverse Bar Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transverse Bar Spacing</em>' attribute.
	 * @see #isSetTransverseBarSpacing()
	 * @see #unsetTransverseBarSpacing()
	 * @see #setTransverseBarSpacing(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcReinforcingMesh_TransverseBarSpacing()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getTransverseBarSpacing();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcReinforcingMesh#getTransverseBarSpacing <em>Transverse Bar Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transverse Bar Spacing</em>' attribute.
	 * @see #isSetTransverseBarSpacing()
	 * @see #unsetTransverseBarSpacing()
	 * @see #getTransverseBarSpacing()
	 * @generated
	 */
	void setTransverseBarSpacing(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcReinforcingMesh#getTransverseBarSpacing <em>Transverse Bar Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransverseBarSpacing()
	 * @see #getTransverseBarSpacing()
	 * @see #setTransverseBarSpacing(Double)
	 * @generated
	 */
	void unsetTransverseBarSpacing();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcReinforcingMesh#getTransverseBarSpacing <em>Transverse Bar Spacing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transverse Bar Spacing</em>' attribute is set.
	 * @see #unsetTransverseBarSpacing()
	 * @see #getTransverseBarSpacing()
	 * @see #setTransverseBarSpacing(Double)
	 * @generated
	 */
	boolean isSetTransverseBarSpacing();

	/**
	 * Returns the value of the '<em><b>Longitudinal Bar Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitudinal Bar Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitudinal Bar Spacing</em>' attribute.
	 * @see #isSetLongitudinalBarSpacing()
	 * @see #unsetLongitudinalBarSpacing()
	 * @see #setLongitudinalBarSpacing(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcReinforcingMesh_LongitudinalBarSpacing()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getLongitudinalBarSpacing();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcReinforcingMesh#getLongitudinalBarSpacing <em>Longitudinal Bar Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitudinal Bar Spacing</em>' attribute.
	 * @see #isSetLongitudinalBarSpacing()
	 * @see #unsetLongitudinalBarSpacing()
	 * @see #getLongitudinalBarSpacing()
	 * @generated
	 */
	void setLongitudinalBarSpacing(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcReinforcingMesh#getLongitudinalBarSpacing <em>Longitudinal Bar Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLongitudinalBarSpacing()
	 * @see #getLongitudinalBarSpacing()
	 * @see #setLongitudinalBarSpacing(Double)
	 * @generated
	 */
	void unsetLongitudinalBarSpacing();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcReinforcingMesh#getLongitudinalBarSpacing <em>Longitudinal Bar Spacing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Longitudinal Bar Spacing</em>' attribute is set.
	 * @see #unsetLongitudinalBarSpacing()
	 * @see #getLongitudinalBarSpacing()
	 * @see #setLongitudinalBarSpacing(Double)
	 * @generated
	 */
	boolean isSetLongitudinalBarSpacing();

	/**
	 * Returns the value of the '<em><b>Transverse Bar Cross Section Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transverse Bar Cross Section Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transverse Bar Cross Section Area</em>' attribute.
	 * @see #isSetTransverseBarCrossSectionArea()
	 * @see #unsetTransverseBarCrossSectionArea()
	 * @see #setTransverseBarCrossSectionArea(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcReinforcingMesh_TransverseBarCrossSectionArea()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getTransverseBarCrossSectionArea();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcReinforcingMesh#getTransverseBarCrossSectionArea <em>Transverse Bar Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transverse Bar Cross Section Area</em>' attribute.
	 * @see #isSetTransverseBarCrossSectionArea()
	 * @see #unsetTransverseBarCrossSectionArea()
	 * @see #getTransverseBarCrossSectionArea()
	 * @generated
	 */
	void setTransverseBarCrossSectionArea(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcReinforcingMesh#getTransverseBarCrossSectionArea <em>Transverse Bar Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransverseBarCrossSectionArea()
	 * @see #getTransverseBarCrossSectionArea()
	 * @see #setTransverseBarCrossSectionArea(Double)
	 * @generated
	 */
	void unsetTransverseBarCrossSectionArea();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcReinforcingMesh#getTransverseBarCrossSectionArea <em>Transverse Bar Cross Section Area</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transverse Bar Cross Section Area</em>' attribute is set.
	 * @see #unsetTransverseBarCrossSectionArea()
	 * @see #getTransverseBarCrossSectionArea()
	 * @see #setTransverseBarCrossSectionArea(Double)
	 * @generated
	 */
	boolean isSetTransverseBarCrossSectionArea();

	/**
	 * Returns the value of the '<em><b>Longitudinal Bar Cross Section Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitudinal Bar Cross Section Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitudinal Bar Cross Section Area</em>' attribute.
	 * @see #isSetLongitudinalBarCrossSectionArea()
	 * @see #unsetLongitudinalBarCrossSectionArea()
	 * @see #setLongitudinalBarCrossSectionArea(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcReinforcingMesh_LongitudinalBarCrossSectionArea()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getLongitudinalBarCrossSectionArea();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcReinforcingMesh#getLongitudinalBarCrossSectionArea <em>Longitudinal Bar Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitudinal Bar Cross Section Area</em>' attribute.
	 * @see #isSetLongitudinalBarCrossSectionArea()
	 * @see #unsetLongitudinalBarCrossSectionArea()
	 * @see #getLongitudinalBarCrossSectionArea()
	 * @generated
	 */
	void setLongitudinalBarCrossSectionArea(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcReinforcingMesh#getLongitudinalBarCrossSectionArea <em>Longitudinal Bar Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLongitudinalBarCrossSectionArea()
	 * @see #getLongitudinalBarCrossSectionArea()
	 * @see #setLongitudinalBarCrossSectionArea(Double)
	 * @generated
	 */
	void unsetLongitudinalBarCrossSectionArea();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcReinforcingMesh#getLongitudinalBarCrossSectionArea <em>Longitudinal Bar Cross Section Area</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Longitudinal Bar Cross Section Area</em>' attribute is set.
	 * @see #unsetLongitudinalBarCrossSectionArea()
	 * @see #getLongitudinalBarCrossSectionArea()
	 * @see #setLongitudinalBarCrossSectionArea(Double)
	 * @generated
	 */
	boolean isSetLongitudinalBarCrossSectionArea();

	/**
	 * Returns the value of the '<em><b>Transverse Bar Nominal Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transverse Bar Nominal Diameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transverse Bar Nominal Diameter</em>' attribute.
	 * @see #isSetTransverseBarNominalDiameter()
	 * @see #unsetTransverseBarNominalDiameter()
	 * @see #setTransverseBarNominalDiameter(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcReinforcingMesh_TransverseBarNominalDiameter()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getTransverseBarNominalDiameter();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcReinforcingMesh#getTransverseBarNominalDiameter <em>Transverse Bar Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transverse Bar Nominal Diameter</em>' attribute.
	 * @see #isSetTransverseBarNominalDiameter()
	 * @see #unsetTransverseBarNominalDiameter()
	 * @see #getTransverseBarNominalDiameter()
	 * @generated
	 */
	void setTransverseBarNominalDiameter(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcReinforcingMesh#getTransverseBarNominalDiameter <em>Transverse Bar Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransverseBarNominalDiameter()
	 * @see #getTransverseBarNominalDiameter()
	 * @see #setTransverseBarNominalDiameter(Double)
	 * @generated
	 */
	void unsetTransverseBarNominalDiameter();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcReinforcingMesh#getTransverseBarNominalDiameter <em>Transverse Bar Nominal Diameter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transverse Bar Nominal Diameter</em>' attribute is set.
	 * @see #unsetTransverseBarNominalDiameter()
	 * @see #getTransverseBarNominalDiameter()
	 * @see #setTransverseBarNominalDiameter(Double)
	 * @generated
	 */
	boolean isSetTransverseBarNominalDiameter();

	/**
	 * Returns the value of the '<em><b>Longitudinal Bar Nominal Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitudinal Bar Nominal Diameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitudinal Bar Nominal Diameter</em>' attribute.
	 * @see #isSetLongitudinalBarNominalDiameter()
	 * @see #unsetLongitudinalBarNominalDiameter()
	 * @see #setLongitudinalBarNominalDiameter(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcReinforcingMesh_LongitudinalBarNominalDiameter()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getLongitudinalBarNominalDiameter();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcReinforcingMesh#getLongitudinalBarNominalDiameter <em>Longitudinal Bar Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitudinal Bar Nominal Diameter</em>' attribute.
	 * @see #isSetLongitudinalBarNominalDiameter()
	 * @see #unsetLongitudinalBarNominalDiameter()
	 * @see #getLongitudinalBarNominalDiameter()
	 * @generated
	 */
	void setLongitudinalBarNominalDiameter(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcReinforcingMesh#getLongitudinalBarNominalDiameter <em>Longitudinal Bar Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLongitudinalBarNominalDiameter()
	 * @see #getLongitudinalBarNominalDiameter()
	 * @see #setLongitudinalBarNominalDiameter(Double)
	 * @generated
	 */
	void unsetLongitudinalBarNominalDiameter();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcReinforcingMesh#getLongitudinalBarNominalDiameter <em>Longitudinal Bar Nominal Diameter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Longitudinal Bar Nominal Diameter</em>' attribute is set.
	 * @see #unsetLongitudinalBarNominalDiameter()
	 * @see #getLongitudinalBarNominalDiameter()
	 * @see #setLongitudinalBarNominalDiameter(Double)
	 * @generated
	 */
	boolean isSetLongitudinalBarNominalDiameter();

	/**
	 * Returns the value of the '<em><b>Mesh Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesh Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesh Width</em>' attribute.
	 * @see #isSetMeshWidth()
	 * @see #unsetMeshWidth()
	 * @see #setMeshWidth(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcReinforcingMesh_MeshWidth()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMeshWidth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcReinforcingMesh#getMeshWidth <em>Mesh Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesh Width</em>' attribute.
	 * @see #isSetMeshWidth()
	 * @see #unsetMeshWidth()
	 * @see #getMeshWidth()
	 * @generated
	 */
	void setMeshWidth(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcReinforcingMesh#getMeshWidth <em>Mesh Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMeshWidth()
	 * @see #getMeshWidth()
	 * @see #setMeshWidth(Double)
	 * @generated
	 */
	void unsetMeshWidth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcReinforcingMesh#getMeshWidth <em>Mesh Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mesh Width</em>' attribute is set.
	 * @see #unsetMeshWidth()
	 * @see #getMeshWidth()
	 * @see #setMeshWidth(Double)
	 * @generated
	 */
	boolean isSetMeshWidth();

	/**
	 * Returns the value of the '<em><b>Mesh Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesh Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesh Length</em>' attribute.
	 * @see #isSetMeshLength()
	 * @see #unsetMeshLength()
	 * @see #setMeshLength(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcReinforcingMesh_MeshLength()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMeshLength();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcReinforcingMesh#getMeshLength <em>Mesh Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesh Length</em>' attribute.
	 * @see #isSetMeshLength()
	 * @see #unsetMeshLength()
	 * @see #getMeshLength()
	 * @generated
	 */
	void setMeshLength(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcReinforcingMesh#getMeshLength <em>Mesh Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMeshLength()
	 * @see #getMeshLength()
	 * @see #setMeshLength(Double)
	 * @generated
	 */
	void unsetMeshLength();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcReinforcingMesh#getMeshLength <em>Mesh Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mesh Length</em>' attribute is set.
	 * @see #unsetMeshLength()
	 * @see #getMeshLength()
	 * @see #setMeshLength(Double)
	 * @generated
	 */
	boolean isSetMeshLength();

} // IfcReinforcingMesh
