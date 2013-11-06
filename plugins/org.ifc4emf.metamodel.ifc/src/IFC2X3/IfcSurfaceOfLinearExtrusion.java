/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcSurfaceOfLinearExtrusionImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Surface Of Linear Extrusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSurfaceOfLinearExtrusion#getExtrudedDirection <em>Extruded Direction</em>}</li>
 *   <li>{@link IFC2X3.IfcSurfaceOfLinearExtrusion#getDepth <em>Depth</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSurfaceOfLinearExtrusion()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSurfaceOfLinearExtrusionImplAdapter.class)
public interface IfcSurfaceOfLinearExtrusion extends IfcSweptSurface {
	/**
	 * Returns the value of the '<em><b>Extruded Direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extruded Direction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extruded Direction</em>' reference.
	 * @see #setExtrudedDirection(IfcDirection)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceOfLinearExtrusion_ExtrudedDirection()
	 * @model required="true"
	 * @generated
	 */
	IfcDirection getExtrudedDirection();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceOfLinearExtrusion#getExtrudedDirection <em>Extruded Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extruded Direction</em>' reference.
	 * @see #getExtrudedDirection()
	 * @generated
	 */
	void setExtrudedDirection(IfcDirection value);

	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #isSetDepth()
	 * @see #unsetDepth()
	 * @see #setDepth(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceOfLinearExtrusion_Depth()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getDepth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceOfLinearExtrusion#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #isSetDepth()
	 * @see #unsetDepth()
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSurfaceOfLinearExtrusion#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDepth()
	 * @see #getDepth()
	 * @see #setDepth(Double)
	 * @generated
	 */
	void unsetDepth();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSurfaceOfLinearExtrusion#getDepth <em>Depth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Depth</em>' attribute is set.
	 * @see #unsetDepth()
	 * @see #getDepth()
	 * @see #setDepth(Double)
	 * @generated
	 */
	boolean isSetDepth();

} // IfcSurfaceOfLinearExtrusion
