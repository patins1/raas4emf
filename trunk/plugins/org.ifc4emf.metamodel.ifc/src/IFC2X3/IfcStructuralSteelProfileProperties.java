/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcStructuralSteelProfilePropertiesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Steel Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcStructuralSteelProfileProperties#getShearAreaZ <em>Shear Area Z</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralSteelProfileProperties#getShearAreaY <em>Shear Area Y</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralSteelProfileProperties#getPlasticShapeFactorY <em>Plastic Shape Factor Y</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralSteelProfileProperties#getPlasticShapeFactorZ <em>Plastic Shape Factor Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcStructuralSteelProfileProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcStructuralSteelProfilePropertiesImplAdapter.class)
public interface IfcStructuralSteelProfileProperties extends IfcStructuralProfileProperties {
	/**
	 * Returns the value of the '<em><b>Plastic Shape Factor Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plastic Shape Factor Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plastic Shape Factor Z</em>' attribute.
	 * @see #isSetPlasticShapeFactorZ()
	 * @see #unsetPlasticShapeFactorZ()
	 * @see #setPlasticShapeFactorZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralSteelProfileProperties_PlasticShapeFactorZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getPlasticShapeFactorZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralSteelProfileProperties#getPlasticShapeFactorZ <em>Plastic Shape Factor Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plastic Shape Factor Z</em>' attribute.
	 * @see #isSetPlasticShapeFactorZ()
	 * @see #unsetPlasticShapeFactorZ()
	 * @see #getPlasticShapeFactorZ()
	 * @generated
	 */
	void setPlasticShapeFactorZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralSteelProfileProperties#getPlasticShapeFactorZ <em>Plastic Shape Factor Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlasticShapeFactorZ()
	 * @see #getPlasticShapeFactorZ()
	 * @see #setPlasticShapeFactorZ(Double)
	 * @generated
	 */
	void unsetPlasticShapeFactorZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralSteelProfileProperties#getPlasticShapeFactorZ <em>Plastic Shape Factor Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Plastic Shape Factor Z</em>' attribute is set.
	 * @see #unsetPlasticShapeFactorZ()
	 * @see #getPlasticShapeFactorZ()
	 * @see #setPlasticShapeFactorZ(Double)
	 * @generated
	 */
	boolean isSetPlasticShapeFactorZ();

	/**
	 * Returns the value of the '<em><b>Plastic Shape Factor Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plastic Shape Factor Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plastic Shape Factor Y</em>' attribute.
	 * @see #isSetPlasticShapeFactorY()
	 * @see #unsetPlasticShapeFactorY()
	 * @see #setPlasticShapeFactorY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralSteelProfileProperties_PlasticShapeFactorY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getPlasticShapeFactorY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralSteelProfileProperties#getPlasticShapeFactorY <em>Plastic Shape Factor Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plastic Shape Factor Y</em>' attribute.
	 * @see #isSetPlasticShapeFactorY()
	 * @see #unsetPlasticShapeFactorY()
	 * @see #getPlasticShapeFactorY()
	 * @generated
	 */
	void setPlasticShapeFactorY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralSteelProfileProperties#getPlasticShapeFactorY <em>Plastic Shape Factor Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlasticShapeFactorY()
	 * @see #getPlasticShapeFactorY()
	 * @see #setPlasticShapeFactorY(Double)
	 * @generated
	 */
	void unsetPlasticShapeFactorY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralSteelProfileProperties#getPlasticShapeFactorY <em>Plastic Shape Factor Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Plastic Shape Factor Y</em>' attribute is set.
	 * @see #unsetPlasticShapeFactorY()
	 * @see #getPlasticShapeFactorY()
	 * @see #setPlasticShapeFactorY(Double)
	 * @generated
	 */
	boolean isSetPlasticShapeFactorY();

	/**
	 * Returns the value of the '<em><b>Shear Area Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Area Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Area Y</em>' attribute.
	 * @see #isSetShearAreaY()
	 * @see #unsetShearAreaY()
	 * @see #setShearAreaY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralSteelProfileProperties_ShearAreaY()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getShearAreaY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralSteelProfileProperties#getShearAreaY <em>Shear Area Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Area Y</em>' attribute.
	 * @see #isSetShearAreaY()
	 * @see #unsetShearAreaY()
	 * @see #getShearAreaY()
	 * @generated
	 */
	void setShearAreaY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralSteelProfileProperties#getShearAreaY <em>Shear Area Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShearAreaY()
	 * @see #getShearAreaY()
	 * @see #setShearAreaY(Double)
	 * @generated
	 */
	void unsetShearAreaY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralSteelProfileProperties#getShearAreaY <em>Shear Area Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shear Area Y</em>' attribute is set.
	 * @see #unsetShearAreaY()
	 * @see #getShearAreaY()
	 * @see #setShearAreaY(Double)
	 * @generated
	 */
	boolean isSetShearAreaY();

	/**
	 * Returns the value of the '<em><b>Shear Area Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Area Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Area Z</em>' attribute.
	 * @see #isSetShearAreaZ()
	 * @see #unsetShearAreaZ()
	 * @see #setShearAreaZ(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralSteelProfileProperties_ShearAreaZ()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getShearAreaZ();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralSteelProfileProperties#getShearAreaZ <em>Shear Area Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Area Z</em>' attribute.
	 * @see #isSetShearAreaZ()
	 * @see #unsetShearAreaZ()
	 * @see #getShearAreaZ()
	 * @generated
	 */
	void setShearAreaZ(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralSteelProfileProperties#getShearAreaZ <em>Shear Area Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShearAreaZ()
	 * @see #getShearAreaZ()
	 * @see #setShearAreaZ(Double)
	 * @generated
	 */
	void unsetShearAreaZ();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralSteelProfileProperties#getShearAreaZ <em>Shear Area Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shear Area Z</em>' attribute is set.
	 * @see #unsetShearAreaZ()
	 * @see #getShearAreaZ()
	 * @see #setShearAreaZ(Double)
	 * @generated
	 */
	boolean isSetShearAreaZ();

} // IfcStructuralSteelProfileProperties
