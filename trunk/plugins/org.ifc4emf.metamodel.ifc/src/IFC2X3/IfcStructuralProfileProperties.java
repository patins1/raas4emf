/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcStructuralProfilePropertiesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcStructuralProfileProperties#getTorsionalConstantX <em>Torsional Constant X</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralProfileProperties#getMomentOfInertiaYZ <em>Moment Of Inertia YZ</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralProfileProperties#getMomentOfInertiaY <em>Moment Of Inertia Y</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralProfileProperties#getMomentOfInertiaZ <em>Moment Of Inertia Z</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralProfileProperties#getWarpingConstant <em>Warping Constant</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralProfileProperties#getShearCentreZ <em>Shear Centre Z</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralProfileProperties#getShearCentreY <em>Shear Centre Y</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralProfileProperties#getShearDeformationAreaZ <em>Shear Deformation Area Z</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralProfileProperties#getShearDeformationAreaY <em>Shear Deformation Area Y</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralProfileProperties#getMaximumSectionModulusY <em>Maximum Section Modulus Y</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralProfileProperties#getMinimumSectionModulusY <em>Minimum Section Modulus Y</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralProfileProperties#getMaximumSectionModulusZ <em>Maximum Section Modulus Z</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralProfileProperties#getMinimumSectionModulusZ <em>Minimum Section Modulus Z</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralProfileProperties#getTorsionalSectionModulus <em>Torsional Section Modulus</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralProfileProperties#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralProfileProperties#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcStructuralProfileProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcStructuralProfilePropertiesImplAdapter.class)
public interface IfcStructuralProfileProperties extends IfcGeneralProfileProperties {
	/**
	 * Returns the value of the '<em><b>Centre Of Gravity In Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centre Of Gravity In Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centre Of Gravity In Y</em>' attribute.
	 * @see #isSetCentreOfGravityInY()
	 * @see #unsetCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralProfileProperties_CentreOfGravityInY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getCentreOfGravityInY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centre Of Gravity In Y</em>' attribute.
	 * @see #isSetCentreOfGravityInY()
	 * @see #unsetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @generated
	 */
	void setCentreOfGravityInY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(Double)
	 * @generated
	 */
	void unsetCentreOfGravityInY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Centre Of Gravity In Y</em>' attribute is set.
	 * @see #unsetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(Double)
	 * @generated
	 */
	boolean isSetCentreOfGravityInY();

	/**
	 * Returns the value of the '<em><b>Centre Of Gravity In X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centre Of Gravity In X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centre Of Gravity In X</em>' attribute.
	 * @see #isSetCentreOfGravityInX()
	 * @see #unsetCentreOfGravityInX()
	 * @see #setCentreOfGravityInX(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralProfileProperties_CentreOfGravityInX()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getCentreOfGravityInX();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centre Of Gravity In X</em>' attribute.
	 * @see #isSetCentreOfGravityInX()
	 * @see #unsetCentreOfGravityInX()
	 * @see #getCentreOfGravityInX()
	 * @generated
	 */
	void setCentreOfGravityInX(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCentreOfGravityInX()
	 * @see #getCentreOfGravityInX()
	 * @see #setCentreOfGravityInX(Double)
	 * @generated
	 */
	void unsetCentreOfGravityInX();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Centre Of Gravity In X</em>' attribute is set.
	 * @see #unsetCentreOfGravityInX()
	 * @see #getCentreOfGravityInX()
	 * @see #setCentreOfGravityInX(Double)
	 * @generated
	 */
	boolean isSetCentreOfGravityInX();

	/**
	 * Returns the value of the '<em><b>Torsional Section Modulus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Torsional Section Modulus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Torsional Section Modulus</em>' attribute.
	 * @see #isSetTorsionalSectionModulus()
	 * @see #unsetTorsionalSectionModulus()
	 * @see #setTorsionalSectionModulus(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralProfileProperties_TorsionalSectionModulus()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getTorsionalSectionModulus();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getTorsionalSectionModulus <em>Torsional Section Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Torsional Section Modulus</em>' attribute.
	 * @see #isSetTorsionalSectionModulus()
	 * @see #unsetTorsionalSectionModulus()
	 * @see #getTorsionalSectionModulus()
	 * @generated
	 */
	void setTorsionalSectionModulus(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getTorsionalSectionModulus <em>Torsional Section Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTorsionalSectionModulus()
	 * @see #getTorsionalSectionModulus()
	 * @see #setTorsionalSectionModulus(Double)
	 * @generated
	 */
	void unsetTorsionalSectionModulus();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getTorsionalSectionModulus <em>Torsional Section Modulus</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Torsional Section Modulus</em>' attribute is set.
	 * @see #unsetTorsionalSectionModulus()
	 * @see #getTorsionalSectionModulus()
	 * @see #setTorsionalSectionModulus(Double)
	 * @generated
	 */
	boolean isSetTorsionalSectionModulus();

	/**
	 * Returns the value of the '<em><b>Minimum Section Modulus Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Section Modulus Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Section Modulus Z</em>' attribute.
	 * @see #isSetMinimumSectionModulusZ()
	 * @see #unsetMinimumSectionModulusZ()
	 * @see #setMinimumSectionModulusZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralProfileProperties_MinimumSectionModulusZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMinimumSectionModulusZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getMinimumSectionModulusZ <em>Minimum Section Modulus Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Section Modulus Z</em>' attribute.
	 * @see #isSetMinimumSectionModulusZ()
	 * @see #unsetMinimumSectionModulusZ()
	 * @see #getMinimumSectionModulusZ()
	 * @generated
	 */
	void setMinimumSectionModulusZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getMinimumSectionModulusZ <em>Minimum Section Modulus Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumSectionModulusZ()
	 * @see #getMinimumSectionModulusZ()
	 * @see #setMinimumSectionModulusZ(Double)
	 * @generated
	 */
	void unsetMinimumSectionModulusZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getMinimumSectionModulusZ <em>Minimum Section Modulus Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Section Modulus Z</em>' attribute is set.
	 * @see #unsetMinimumSectionModulusZ()
	 * @see #getMinimumSectionModulusZ()
	 * @see #setMinimumSectionModulusZ(Double)
	 * @generated
	 */
	boolean isSetMinimumSectionModulusZ();

	/**
	 * Returns the value of the '<em><b>Maximum Section Modulus Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Section Modulus Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Section Modulus Z</em>' attribute.
	 * @see #isSetMaximumSectionModulusZ()
	 * @see #unsetMaximumSectionModulusZ()
	 * @see #setMaximumSectionModulusZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralProfileProperties_MaximumSectionModulusZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMaximumSectionModulusZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getMaximumSectionModulusZ <em>Maximum Section Modulus Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Section Modulus Z</em>' attribute.
	 * @see #isSetMaximumSectionModulusZ()
	 * @see #unsetMaximumSectionModulusZ()
	 * @see #getMaximumSectionModulusZ()
	 * @generated
	 */
	void setMaximumSectionModulusZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getMaximumSectionModulusZ <em>Maximum Section Modulus Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumSectionModulusZ()
	 * @see #getMaximumSectionModulusZ()
	 * @see #setMaximumSectionModulusZ(Double)
	 * @generated
	 */
	void unsetMaximumSectionModulusZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getMaximumSectionModulusZ <em>Maximum Section Modulus Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Section Modulus Z</em>' attribute is set.
	 * @see #unsetMaximumSectionModulusZ()
	 * @see #getMaximumSectionModulusZ()
	 * @see #setMaximumSectionModulusZ(Double)
	 * @generated
	 */
	boolean isSetMaximumSectionModulusZ();

	/**
	 * Returns the value of the '<em><b>Minimum Section Modulus Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Section Modulus Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Section Modulus Y</em>' attribute.
	 * @see #isSetMinimumSectionModulusY()
	 * @see #unsetMinimumSectionModulusY()
	 * @see #setMinimumSectionModulusY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralProfileProperties_MinimumSectionModulusY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMinimumSectionModulusY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getMinimumSectionModulusY <em>Minimum Section Modulus Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Section Modulus Y</em>' attribute.
	 * @see #isSetMinimumSectionModulusY()
	 * @see #unsetMinimumSectionModulusY()
	 * @see #getMinimumSectionModulusY()
	 * @generated
	 */
	void setMinimumSectionModulusY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getMinimumSectionModulusY <em>Minimum Section Modulus Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumSectionModulusY()
	 * @see #getMinimumSectionModulusY()
	 * @see #setMinimumSectionModulusY(Double)
	 * @generated
	 */
	void unsetMinimumSectionModulusY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getMinimumSectionModulusY <em>Minimum Section Modulus Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Section Modulus Y</em>' attribute is set.
	 * @see #unsetMinimumSectionModulusY()
	 * @see #getMinimumSectionModulusY()
	 * @see #setMinimumSectionModulusY(Double)
	 * @generated
	 */
	boolean isSetMinimumSectionModulusY();

	/**
	 * Returns the value of the '<em><b>Maximum Section Modulus Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Section Modulus Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Section Modulus Y</em>' attribute.
	 * @see #isSetMaximumSectionModulusY()
	 * @see #unsetMaximumSectionModulusY()
	 * @see #setMaximumSectionModulusY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralProfileProperties_MaximumSectionModulusY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMaximumSectionModulusY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getMaximumSectionModulusY <em>Maximum Section Modulus Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Section Modulus Y</em>' attribute.
	 * @see #isSetMaximumSectionModulusY()
	 * @see #unsetMaximumSectionModulusY()
	 * @see #getMaximumSectionModulusY()
	 * @generated
	 */
	void setMaximumSectionModulusY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getMaximumSectionModulusY <em>Maximum Section Modulus Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumSectionModulusY()
	 * @see #getMaximumSectionModulusY()
	 * @see #setMaximumSectionModulusY(Double)
	 * @generated
	 */
	void unsetMaximumSectionModulusY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getMaximumSectionModulusY <em>Maximum Section Modulus Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Section Modulus Y</em>' attribute is set.
	 * @see #unsetMaximumSectionModulusY()
	 * @see #getMaximumSectionModulusY()
	 * @see #setMaximumSectionModulusY(Double)
	 * @generated
	 */
	boolean isSetMaximumSectionModulusY();

	/**
	 * Returns the value of the '<em><b>Shear Deformation Area Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Deformation Area Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Deformation Area Y</em>' attribute.
	 * @see #isSetShearDeformationAreaY()
	 * @see #unsetShearDeformationAreaY()
	 * @see #setShearDeformationAreaY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralProfileProperties_ShearDeformationAreaY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getShearDeformationAreaY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getShearDeformationAreaY <em>Shear Deformation Area Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Deformation Area Y</em>' attribute.
	 * @see #isSetShearDeformationAreaY()
	 * @see #unsetShearDeformationAreaY()
	 * @see #getShearDeformationAreaY()
	 * @generated
	 */
	void setShearDeformationAreaY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getShearDeformationAreaY <em>Shear Deformation Area Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShearDeformationAreaY()
	 * @see #getShearDeformationAreaY()
	 * @see #setShearDeformationAreaY(Double)
	 * @generated
	 */
	void unsetShearDeformationAreaY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getShearDeformationAreaY <em>Shear Deformation Area Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shear Deformation Area Y</em>' attribute is set.
	 * @see #unsetShearDeformationAreaY()
	 * @see #getShearDeformationAreaY()
	 * @see #setShearDeformationAreaY(Double)
	 * @generated
	 */
	boolean isSetShearDeformationAreaY();

	/**
	 * Returns the value of the '<em><b>Shear Deformation Area Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Deformation Area Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Deformation Area Z</em>' attribute.
	 * @see #isSetShearDeformationAreaZ()
	 * @see #unsetShearDeformationAreaZ()
	 * @see #setShearDeformationAreaZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralProfileProperties_ShearDeformationAreaZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getShearDeformationAreaZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getShearDeformationAreaZ <em>Shear Deformation Area Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Deformation Area Z</em>' attribute.
	 * @see #isSetShearDeformationAreaZ()
	 * @see #unsetShearDeformationAreaZ()
	 * @see #getShearDeformationAreaZ()
	 * @generated
	 */
	void setShearDeformationAreaZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getShearDeformationAreaZ <em>Shear Deformation Area Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShearDeformationAreaZ()
	 * @see #getShearDeformationAreaZ()
	 * @see #setShearDeformationAreaZ(Double)
	 * @generated
	 */
	void unsetShearDeformationAreaZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getShearDeformationAreaZ <em>Shear Deformation Area Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shear Deformation Area Z</em>' attribute is set.
	 * @see #unsetShearDeformationAreaZ()
	 * @see #getShearDeformationAreaZ()
	 * @see #setShearDeformationAreaZ(Double)
	 * @generated
	 */
	boolean isSetShearDeformationAreaZ();

	/**
	 * Returns the value of the '<em><b>Shear Centre Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Centre Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Centre Y</em>' attribute.
	 * @see #isSetShearCentreY()
	 * @see #unsetShearCentreY()
	 * @see #setShearCentreY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralProfileProperties_ShearCentreY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getShearCentreY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getShearCentreY <em>Shear Centre Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Centre Y</em>' attribute.
	 * @see #isSetShearCentreY()
	 * @see #unsetShearCentreY()
	 * @see #getShearCentreY()
	 * @generated
	 */
	void setShearCentreY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getShearCentreY <em>Shear Centre Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShearCentreY()
	 * @see #getShearCentreY()
	 * @see #setShearCentreY(Double)
	 * @generated
	 */
	void unsetShearCentreY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getShearCentreY <em>Shear Centre Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shear Centre Y</em>' attribute is set.
	 * @see #unsetShearCentreY()
	 * @see #getShearCentreY()
	 * @see #setShearCentreY(Double)
	 * @generated
	 */
	boolean isSetShearCentreY();

	/**
	 * Returns the value of the '<em><b>Shear Centre Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Centre Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Centre Z</em>' attribute.
	 * @see #isSetShearCentreZ()
	 * @see #unsetShearCentreZ()
	 * @see #setShearCentreZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralProfileProperties_ShearCentreZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getShearCentreZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getShearCentreZ <em>Shear Centre Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Centre Z</em>' attribute.
	 * @see #isSetShearCentreZ()
	 * @see #unsetShearCentreZ()
	 * @see #getShearCentreZ()
	 * @generated
	 */
	void setShearCentreZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getShearCentreZ <em>Shear Centre Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShearCentreZ()
	 * @see #getShearCentreZ()
	 * @see #setShearCentreZ(Double)
	 * @generated
	 */
	void unsetShearCentreZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getShearCentreZ <em>Shear Centre Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shear Centre Z</em>' attribute is set.
	 * @see #unsetShearCentreZ()
	 * @see #getShearCentreZ()
	 * @see #setShearCentreZ(Double)
	 * @generated
	 */
	boolean isSetShearCentreZ();

	/**
	 * Returns the value of the '<em><b>Warping Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warping Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warping Constant</em>' attribute.
	 * @see #isSetWarpingConstant()
	 * @see #unsetWarpingConstant()
	 * @see #setWarpingConstant(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralProfileProperties_WarpingConstant()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getWarpingConstant();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getWarpingConstant <em>Warping Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warping Constant</em>' attribute.
	 * @see #isSetWarpingConstant()
	 * @see #unsetWarpingConstant()
	 * @see #getWarpingConstant()
	 * @generated
	 */
	void setWarpingConstant(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getWarpingConstant <em>Warping Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWarpingConstant()
	 * @see #getWarpingConstant()
	 * @see #setWarpingConstant(Double)
	 * @generated
	 */
	void unsetWarpingConstant();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getWarpingConstant <em>Warping Constant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Warping Constant</em>' attribute is set.
	 * @see #unsetWarpingConstant()
	 * @see #getWarpingConstant()
	 * @see #setWarpingConstant(Double)
	 * @generated
	 */
	boolean isSetWarpingConstant();

	/**
	 * Returns the value of the '<em><b>Moment Of Inertia Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment Of Inertia Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment Of Inertia Z</em>' attribute.
	 * @see #isSetMomentOfInertiaZ()
	 * @see #unsetMomentOfInertiaZ()
	 * @see #setMomentOfInertiaZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralProfileProperties_MomentOfInertiaZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMomentOfInertiaZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getMomentOfInertiaZ <em>Moment Of Inertia Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment Of Inertia Z</em>' attribute.
	 * @see #isSetMomentOfInertiaZ()
	 * @see #unsetMomentOfInertiaZ()
	 * @see #getMomentOfInertiaZ()
	 * @generated
	 */
	void setMomentOfInertiaZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getMomentOfInertiaZ <em>Moment Of Inertia Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMomentOfInertiaZ()
	 * @see #getMomentOfInertiaZ()
	 * @see #setMomentOfInertiaZ(Double)
	 * @generated
	 */
	void unsetMomentOfInertiaZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getMomentOfInertiaZ <em>Moment Of Inertia Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moment Of Inertia Z</em>' attribute is set.
	 * @see #unsetMomentOfInertiaZ()
	 * @see #getMomentOfInertiaZ()
	 * @see #setMomentOfInertiaZ(Double)
	 * @generated
	 */
	boolean isSetMomentOfInertiaZ();

	/**
	 * Returns the value of the '<em><b>Moment Of Inertia Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment Of Inertia Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment Of Inertia Y</em>' attribute.
	 * @see #isSetMomentOfInertiaY()
	 * @see #unsetMomentOfInertiaY()
	 * @see #setMomentOfInertiaY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralProfileProperties_MomentOfInertiaY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMomentOfInertiaY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getMomentOfInertiaY <em>Moment Of Inertia Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment Of Inertia Y</em>' attribute.
	 * @see #isSetMomentOfInertiaY()
	 * @see #unsetMomentOfInertiaY()
	 * @see #getMomentOfInertiaY()
	 * @generated
	 */
	void setMomentOfInertiaY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getMomentOfInertiaY <em>Moment Of Inertia Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMomentOfInertiaY()
	 * @see #getMomentOfInertiaY()
	 * @see #setMomentOfInertiaY(Double)
	 * @generated
	 */
	void unsetMomentOfInertiaY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getMomentOfInertiaY <em>Moment Of Inertia Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moment Of Inertia Y</em>' attribute is set.
	 * @see #unsetMomentOfInertiaY()
	 * @see #getMomentOfInertiaY()
	 * @see #setMomentOfInertiaY(Double)
	 * @generated
	 */
	boolean isSetMomentOfInertiaY();

	/**
	 * Returns the value of the '<em><b>Moment Of Inertia YZ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment Of Inertia YZ</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment Of Inertia YZ</em>' attribute.
	 * @see #isSetMomentOfInertiaYZ()
	 * @see #unsetMomentOfInertiaYZ()
	 * @see #setMomentOfInertiaYZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralProfileProperties_MomentOfInertiaYZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMomentOfInertiaYZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getMomentOfInertiaYZ <em>Moment Of Inertia YZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment Of Inertia YZ</em>' attribute.
	 * @see #isSetMomentOfInertiaYZ()
	 * @see #unsetMomentOfInertiaYZ()
	 * @see #getMomentOfInertiaYZ()
	 * @generated
	 */
	void setMomentOfInertiaYZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getMomentOfInertiaYZ <em>Moment Of Inertia YZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMomentOfInertiaYZ()
	 * @see #getMomentOfInertiaYZ()
	 * @see #setMomentOfInertiaYZ(Double)
	 * @generated
	 */
	void unsetMomentOfInertiaYZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getMomentOfInertiaYZ <em>Moment Of Inertia YZ</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moment Of Inertia YZ</em>' attribute is set.
	 * @see #unsetMomentOfInertiaYZ()
	 * @see #getMomentOfInertiaYZ()
	 * @see #setMomentOfInertiaYZ(Double)
	 * @generated
	 */
	boolean isSetMomentOfInertiaYZ();

	/**
	 * Returns the value of the '<em><b>Torsional Constant X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Torsional Constant X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Torsional Constant X</em>' attribute.
	 * @see #isSetTorsionalConstantX()
	 * @see #unsetTorsionalConstantX()
	 * @see #setTorsionalConstantX(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralProfileProperties_TorsionalConstantX()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getTorsionalConstantX();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getTorsionalConstantX <em>Torsional Constant X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Torsional Constant X</em>' attribute.
	 * @see #isSetTorsionalConstantX()
	 * @see #unsetTorsionalConstantX()
	 * @see #getTorsionalConstantX()
	 * @generated
	 */
	void setTorsionalConstantX(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getTorsionalConstantX <em>Torsional Constant X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTorsionalConstantX()
	 * @see #getTorsionalConstantX()
	 * @see #setTorsionalConstantX(Double)
	 * @generated
	 */
	void unsetTorsionalConstantX();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralProfileProperties#getTorsionalConstantX <em>Torsional Constant X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Torsional Constant X</em>' attribute is set.
	 * @see #unsetTorsionalConstantX()
	 * @see #getTorsionalConstantX()
	 * @see #setTorsionalConstantX(Double)
	 * @generated
	 */
	boolean isSetTorsionalConstantX();

} // IfcStructuralProfileProperties
