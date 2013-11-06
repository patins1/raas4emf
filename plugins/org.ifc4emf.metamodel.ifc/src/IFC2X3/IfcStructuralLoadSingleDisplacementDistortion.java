/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcStructuralLoadSingleDisplacementDistortionImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Load Single Displacement Distortion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcStructuralLoadSingleDisplacementDistortion#getDistortion <em>Distortion</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadSingleDisplacementDistortion()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcStructuralLoadSingleDisplacementDistortionImplAdapter.class)
public interface IfcStructuralLoadSingleDisplacementDistortion extends IfcStructuralLoadSingleDisplacement {
	/**
	 * Returns the value of the '<em><b>Distortion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distortion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distortion</em>' attribute.
	 * @see #isSetDistortion()
	 * @see #unsetDistortion()
	 * @see #setDistortion(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadSingleDisplacementDistortion_Distortion()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getDistortion();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadSingleDisplacementDistortion#getDistortion <em>Distortion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distortion</em>' attribute.
	 * @see #isSetDistortion()
	 * @see #unsetDistortion()
	 * @see #getDistortion()
	 * @generated
	 */
	void setDistortion(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadSingleDisplacementDistortion#getDistortion <em>Distortion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDistortion()
	 * @see #getDistortion()
	 * @see #setDistortion(Double)
	 * @generated
	 */
	void unsetDistortion();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadSingleDisplacementDistortion#getDistortion <em>Distortion</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Distortion</em>' attribute is set.
	 * @see #unsetDistortion()
	 * @see #getDistortion()
	 * @see #setDistortion(Double)
	 * @generated
	 */
	boolean isSetDistortion();

} // IfcStructuralLoadSingleDisplacementDistortion
