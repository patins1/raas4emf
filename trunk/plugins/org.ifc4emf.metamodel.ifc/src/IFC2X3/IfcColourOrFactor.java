/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcColourOrFactorImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Colour Or Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcColourOrFactor#getIfcNormalisedRatioMeasurevalue <em>Ifc Normalised Ratio Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcColourOrFactor#getIfcColourRgbvalue <em>Ifc Colour Rgbvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcColourOrFactor()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcColourOrFactorImplAdapter.class)
public interface IfcColourOrFactor extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Ifc Normalised Ratio Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Normalised Ratio Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Normalised Ratio Measurevalue</em>' attribute.
	 * @see #isSetIfcNormalisedRatioMeasurevalue()
	 * @see #unsetIfcNormalisedRatioMeasurevalue()
	 * @see #setIfcNormalisedRatioMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcColourOrFactor_IfcNormalisedRatioMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcNormalisedRatioMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcColourOrFactor#getIfcNormalisedRatioMeasurevalue <em>Ifc Normalised Ratio Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Normalised Ratio Measurevalue</em>' attribute.
	 * @see #isSetIfcNormalisedRatioMeasurevalue()
	 * @see #unsetIfcNormalisedRatioMeasurevalue()
	 * @see #getIfcNormalisedRatioMeasurevalue()
	 * @generated
	 */
	void setIfcNormalisedRatioMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcColourOrFactor#getIfcNormalisedRatioMeasurevalue <em>Ifc Normalised Ratio Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcNormalisedRatioMeasurevalue()
	 * @see #getIfcNormalisedRatioMeasurevalue()
	 * @see #setIfcNormalisedRatioMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcNormalisedRatioMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcColourOrFactor#getIfcNormalisedRatioMeasurevalue <em>Ifc Normalised Ratio Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Normalised Ratio Measurevalue</em>' attribute is set.
	 * @see #unsetIfcNormalisedRatioMeasurevalue()
	 * @see #getIfcNormalisedRatioMeasurevalue()
	 * @see #setIfcNormalisedRatioMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcNormalisedRatioMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Colour Rgbvalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Colour Rgbvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Colour Rgbvalue</em>' reference.
	 * @see #setIfcColourRgbvalue(IfcColourRgb)
	 * @see IFC2X3.IFC2X3Package#getIfcColourOrFactor_IfcColourRgbvalue()
	 * @model
	 * @generated
	 */
	IfcColourRgb getIfcColourRgbvalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcColourOrFactor#getIfcColourRgbvalue <em>Ifc Colour Rgbvalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Colour Rgbvalue</em>' reference.
	 * @see #getIfcColourRgbvalue()
	 * @generated
	 */
	void setIfcColourRgbvalue(IfcColourRgb value);

} // IfcColourOrFactor
