/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcSurfaceStyleRefractionImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Surface Style Refraction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSurfaceStyleRefraction#getRefractionIndex <em>Refraction Index</em>}</li>
 *   <li>{@link IFC2X3.IfcSurfaceStyleRefraction#getDispersionFactor <em>Dispersion Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyleRefraction()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSurfaceStyleRefractionImplAdapter.class)
public interface IfcSurfaceStyleRefraction extends IfcSurfaceStyleElementSelect {
	/**
	 * Returns the value of the '<em><b>Dispersion Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispersion Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispersion Factor</em>' attribute.
	 * @see #isSetDispersionFactor()
	 * @see #unsetDispersionFactor()
	 * @see #setDispersionFactor(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyleRefraction_DispersionFactor()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getDispersionFactor();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceStyleRefraction#getDispersionFactor <em>Dispersion Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispersion Factor</em>' attribute.
	 * @see #isSetDispersionFactor()
	 * @see #unsetDispersionFactor()
	 * @see #getDispersionFactor()
	 * @generated
	 */
	void setDispersionFactor(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSurfaceStyleRefraction#getDispersionFactor <em>Dispersion Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDispersionFactor()
	 * @see #getDispersionFactor()
	 * @see #setDispersionFactor(Double)
	 * @generated
	 */
	void unsetDispersionFactor();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSurfaceStyleRefraction#getDispersionFactor <em>Dispersion Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dispersion Factor</em>' attribute is set.
	 * @see #unsetDispersionFactor()
	 * @see #getDispersionFactor()
	 * @see #setDispersionFactor(Double)
	 * @generated
	 */
	boolean isSetDispersionFactor();

	/**
	 * Returns the value of the '<em><b>Refraction Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refraction Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refraction Index</em>' attribute.
	 * @see #isSetRefractionIndex()
	 * @see #unsetRefractionIndex()
	 * @see #setRefractionIndex(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyleRefraction_RefractionIndex()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getRefractionIndex();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceStyleRefraction#getRefractionIndex <em>Refraction Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refraction Index</em>' attribute.
	 * @see #isSetRefractionIndex()
	 * @see #unsetRefractionIndex()
	 * @see #getRefractionIndex()
	 * @generated
	 */
	void setRefractionIndex(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSurfaceStyleRefraction#getRefractionIndex <em>Refraction Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRefractionIndex()
	 * @see #getRefractionIndex()
	 * @see #setRefractionIndex(Double)
	 * @generated
	 */
	void unsetRefractionIndex();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSurfaceStyleRefraction#getRefractionIndex <em>Refraction Index</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Refraction Index</em>' attribute is set.
	 * @see #unsetRefractionIndex()
	 * @see #getRefractionIndex()
	 * @see #setRefractionIndex(Double)
	 * @generated
	 */
	boolean isSetRefractionIndex();

} // IfcSurfaceStyleRefraction
