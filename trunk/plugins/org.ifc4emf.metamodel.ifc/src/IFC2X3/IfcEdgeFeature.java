/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcEdgeFeatureImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Edge Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcEdgeFeature#getFeatureLength <em>Feature Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcEdgeFeature()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcEdgeFeatureImplAdapter.class)
public interface IfcEdgeFeature extends IfcFeatureElementSubtraction {
	/**
	 * Returns the value of the '<em><b>Feature Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Length</em>' attribute.
	 * @see #isSetFeatureLength()
	 * @see #unsetFeatureLength()
	 * @see #setFeatureLength(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcEdgeFeature_FeatureLength()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getFeatureLength();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcEdgeFeature#getFeatureLength <em>Feature Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Length</em>' attribute.
	 * @see #isSetFeatureLength()
	 * @see #unsetFeatureLength()
	 * @see #getFeatureLength()
	 * @generated
	 */
	void setFeatureLength(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcEdgeFeature#getFeatureLength <em>Feature Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFeatureLength()
	 * @see #getFeatureLength()
	 * @see #setFeatureLength(Double)
	 * @generated
	 */
	void unsetFeatureLength();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcEdgeFeature#getFeatureLength <em>Feature Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Feature Length</em>' attribute is set.
	 * @see #unsetFeatureLength()
	 * @see #getFeatureLength()
	 * @see #setFeatureLength(Double)
	 * @generated
	 */
	boolean isSetFeatureLength();

} // IfcEdgeFeature
