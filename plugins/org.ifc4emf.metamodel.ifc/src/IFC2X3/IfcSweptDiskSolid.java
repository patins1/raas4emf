/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcSweptDiskSolidImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Swept Disk Solid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSweptDiskSolid#getDirectrix <em>Directrix</em>}</li>
 *   <li>{@link IFC2X3.IfcSweptDiskSolid#getRadius <em>Radius</em>}</li>
 *   <li>{@link IFC2X3.IfcSweptDiskSolid#getInnerRadius <em>Inner Radius</em>}</li>
 *   <li>{@link IFC2X3.IfcSweptDiskSolid#getStartParam <em>Start Param</em>}</li>
 *   <li>{@link IFC2X3.IfcSweptDiskSolid#getEndParam <em>End Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSweptDiskSolid()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSweptDiskSolidImplAdapter.class)
public interface IfcSweptDiskSolid extends IfcSolidModel {
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
	 * @see IFC2X3.IFC2X3Package#getIfcSweptDiskSolid_Directrix()
	 * @model required="true"
	 * @generated
	 */
	IfcCurve getDirectrix();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSweptDiskSolid#getDirectrix <em>Directrix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directrix</em>' reference.
	 * @see #getDirectrix()
	 * @generated
	 */
	void setDirectrix(IfcCurve value);

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
	 * @see IFC2X3.IFC2X3Package#getIfcSweptDiskSolid_EndParam()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getEndParam();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSweptDiskSolid#getEndParam <em>End Param</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcSweptDiskSolid#getEndParam <em>End Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndParam()
	 * @see #getEndParam()
	 * @see #setEndParam(Double)
	 * @generated
	 */
	void unsetEndParam();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSweptDiskSolid#getEndParam <em>End Param</em>}' attribute is set.
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
	 * @see IFC2X3.IFC2X3Package#getIfcSweptDiskSolid_StartParam()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getStartParam();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSweptDiskSolid#getStartParam <em>Start Param</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcSweptDiskSolid#getStartParam <em>Start Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartParam()
	 * @see #getStartParam()
	 * @see #setStartParam(Double)
	 * @generated
	 */
	void unsetStartParam();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSweptDiskSolid#getStartParam <em>Start Param</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Param</em>' attribute is set.
	 * @see #unsetStartParam()
	 * @see #getStartParam()
	 * @see #setStartParam(Double)
	 * @generated
	 */
	boolean isSetStartParam();

	/**
	 * Returns the value of the '<em><b>Inner Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Radius</em>' attribute.
	 * @see #isSetInnerRadius()
	 * @see #unsetInnerRadius()
	 * @see #setInnerRadius(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSweptDiskSolid_InnerRadius()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getInnerRadius();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSweptDiskSolid#getInnerRadius <em>Inner Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Radius</em>' attribute.
	 * @see #isSetInnerRadius()
	 * @see #unsetInnerRadius()
	 * @see #getInnerRadius()
	 * @generated
	 */
	void setInnerRadius(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSweptDiskSolid#getInnerRadius <em>Inner Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInnerRadius()
	 * @see #getInnerRadius()
	 * @see #setInnerRadius(Double)
	 * @generated
	 */
	void unsetInnerRadius();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSweptDiskSolid#getInnerRadius <em>Inner Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inner Radius</em>' attribute is set.
	 * @see #unsetInnerRadius()
	 * @see #getInnerRadius()
	 * @see #setInnerRadius(Double)
	 * @generated
	 */
	boolean isSetInnerRadius();

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #isSetRadius()
	 * @see #unsetRadius()
	 * @see #setRadius(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSweptDiskSolid_Radius()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getRadius();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSweptDiskSolid#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #isSetRadius()
	 * @see #unsetRadius()
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSweptDiskSolid#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRadius()
	 * @see #getRadius()
	 * @see #setRadius(Double)
	 * @generated
	 */
	void unsetRadius();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSweptDiskSolid#getRadius <em>Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Radius</em>' attribute is set.
	 * @see #unsetRadius()
	 * @see #getRadius()
	 * @see #setRadius(Double)
	 * @generated
	 */
	boolean isSetRadius();

} // IfcSweptDiskSolid
