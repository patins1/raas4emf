/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcSurfaceCurveSweptAreaSolidImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Surface Curve Swept Area Solid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSurfaceCurveSweptAreaSolid#getDirectrix <em>Directrix</em>}</li>
 *   <li>{@link IFC2X3.IfcSurfaceCurveSweptAreaSolid#getStartParam <em>Start Param</em>}</li>
 *   <li>{@link IFC2X3.IfcSurfaceCurveSweptAreaSolid#getEndParam <em>End Param</em>}</li>
 *   <li>{@link IFC2X3.IfcSurfaceCurveSweptAreaSolid#getReferenceSurface <em>Reference Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSurfaceCurveSweptAreaSolid()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSurfaceCurveSweptAreaSolidImplAdapter.class)
public interface IfcSurfaceCurveSweptAreaSolid extends IfcSweptAreaSolid {
	/**
	 * Returns the value of the '<em><b>Directrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directrix</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directrix</em>' reference.
	 * @see #setDirectrix(IfcCurve)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceCurveSweptAreaSolid_Directrix()
	 * @model required="true"
	 * @generated
	 */
	IfcCurve getDirectrix();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceCurveSweptAreaSolid#getDirectrix <em>Directrix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directrix</em>' reference.
	 * @see #getDirectrix()
	 * @generated
	 */
	void setDirectrix(IfcCurve value);

	/**
	 * Returns the value of the '<em><b>Reference Surface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Surface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Surface</em>' reference.
	 * @see #setReferenceSurface(IfcSurface)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceCurveSweptAreaSolid_ReferenceSurface()
	 * @model required="true"
	 * @generated
	 */
	IfcSurface getReferenceSurface();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceCurveSweptAreaSolid#getReferenceSurface <em>Reference Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Surface</em>' reference.
	 * @see #getReferenceSurface()
	 * @generated
	 */
	void setReferenceSurface(IfcSurface value);

	/**
	 * Returns the value of the '<em><b>End Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Param</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Param</em>' attribute.
	 * @see #isSetEndParam()
	 * @see #unsetEndParam()
	 * @see #setEndParam(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceCurveSweptAreaSolid_EndParam()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getEndParam();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceCurveSweptAreaSolid#getEndParam <em>End Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Param</em>' attribute.
	 * @see #isSetEndParam()
	 * @see #unsetEndParam()
	 * @see #getEndParam()
	 * @generated
	 */
	void setEndParam(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSurfaceCurveSweptAreaSolid#getEndParam <em>End Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndParam()
	 * @see #getEndParam()
	 * @see #setEndParam(Double)
	 * @generated
	 */
	void unsetEndParam();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSurfaceCurveSweptAreaSolid#getEndParam <em>End Param</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>End Param</em>' attribute is set.
	 * @see #unsetEndParam()
	 * @see #getEndParam()
	 * @see #setEndParam(Double)
	 * @generated
	 */
	boolean isSetEndParam();

	/**
	 * Returns the value of the '<em><b>Start Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Param</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Param</em>' attribute.
	 * @see #isSetStartParam()
	 * @see #unsetStartParam()
	 * @see #setStartParam(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceCurveSweptAreaSolid_StartParam()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getStartParam();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceCurveSweptAreaSolid#getStartParam <em>Start Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Param</em>' attribute.
	 * @see #isSetStartParam()
	 * @see #unsetStartParam()
	 * @see #getStartParam()
	 * @generated
	 */
	void setStartParam(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSurfaceCurveSweptAreaSolid#getStartParam <em>Start Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartParam()
	 * @see #getStartParam()
	 * @see #setStartParam(Double)
	 * @generated
	 */
	void unsetStartParam();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSurfaceCurveSweptAreaSolid#getStartParam <em>Start Param</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Param</em>' attribute is set.
	 * @see #unsetStartParam()
	 * @see #getStartParam()
	 * @see #setStartParam(Double)
	 * @generated
	 */
	boolean isSetStartParam();

} // IfcSurfaceCurveSweptAreaSolid
