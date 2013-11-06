/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcGridAxisImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Grid Axis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcGridAxis#getAxisTag <em>Axis Tag</em>}</li>
 *   <li>{@link IFC2X3.IfcGridAxis#getAxisCurve <em>Axis Curve</em>}</li>
 *   <li>{@link IFC2X3.IfcGridAxis#getSameSense <em>Same Sense</em>}</li>
 *   <li>{@link IFC2X3.IfcGridAxis#getPartOfW <em>Part Of W</em>}</li>
 *   <li>{@link IFC2X3.IfcGridAxis#getPartOfV <em>Part Of V</em>}</li>
 *   <li>{@link IFC2X3.IfcGridAxis#getPartOfU <em>Part Of U</em>}</li>
 *   <li>{@link IFC2X3.IfcGridAxis#getHasIntersections <em>Has Intersections</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcGridAxis()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcGridAxisImplAdapter.class)
public interface IfcGridAxis extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Part Of W</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcGrid#getWAxes <em>WAxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of W</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of W</em>' reference.
	 * @see #setPartOfW(IfcGrid)
	 * @see IFC2X3.IFC2X3Package#getIfcGridAxis_PartOfW()
	 * @see IFC2X3.IfcGrid#getWAxes
	 * @model opposite="WAxes" ordered="false"
	 * @generated
	 */
	IfcGrid getPartOfW();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGridAxis#getPartOfW <em>Part Of W</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of W</em>' reference.
	 * @see #getPartOfW()
	 * @generated
	 */
	void setPartOfW(IfcGrid value);

	/**
	 * Returns the value of the '<em><b>Part Of V</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcGrid#getVAxes <em>VAxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of V</em>' reference.
	 * @see #setPartOfV(IfcGrid)
	 * @see IFC2X3.IFC2X3Package#getIfcGridAxis_PartOfV()
	 * @see IFC2X3.IfcGrid#getVAxes
	 * @model opposite="VAxes" ordered="false"
	 * @generated
	 */
	IfcGrid getPartOfV();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGridAxis#getPartOfV <em>Part Of V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of V</em>' reference.
	 * @see #getPartOfV()
	 * @generated
	 */
	void setPartOfV(IfcGrid value);

	/**
	 * Returns the value of the '<em><b>Part Of U</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcGrid#getUAxes <em>UAxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of U</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of U</em>' reference.
	 * @see #setPartOfU(IfcGrid)
	 * @see IFC2X3.IFC2X3Package#getIfcGridAxis_PartOfU()
	 * @see IFC2X3.IfcGrid#getUAxes
	 * @model opposite="UAxes" ordered="false"
	 * @generated
	 */
	IfcGrid getPartOfU();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGridAxis#getPartOfU <em>Part Of U</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of U</em>' reference.
	 * @see #getPartOfU()
	 * @generated
	 */
	void setPartOfU(IfcGrid value);

	/**
	 * Returns the value of the '<em><b>Has Intersections</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcVirtualGridIntersection}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcVirtualGridIntersection#getIntersectingAxes <em>Intersecting Axes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Intersections</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Intersections</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcGridAxis_HasIntersections()
	 * @see IFC2X3.IfcVirtualGridIntersection#getIntersectingAxes
	 * @model opposite="IntersectingAxes" ordered="false"
	 * @generated
	 */
	EList<IfcVirtualGridIntersection> getHasIntersections();

	/**
	 * Returns the value of the '<em><b>Axis Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Curve</em>' reference.
	 * @see #setAxisCurve(IfcCurve)
	 * @see IFC2X3.IFC2X3Package#getIfcGridAxis_AxisCurve()
	 * @model required="true"
	 * @generated
	 */
	IfcCurve getAxisCurve();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGridAxis#getAxisCurve <em>Axis Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Curve</em>' reference.
	 * @see #getAxisCurve()
	 * @generated
	 */
	void setAxisCurve(IfcCurve value);

	/**
	 * Returns the value of the '<em><b>Same Sense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Same Sense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Same Sense</em>' attribute.
	 * @see #isSetSameSense()
	 * @see #unsetSameSense()
	 * @see #setSameSense(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcGridAxis_SameSense()
	 * @model unsettable="true" dataType="IFC2X3.BOOLEAN" required="true"
	 * @generated
	 */
	Boolean getSameSense();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGridAxis#getSameSense <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Same Sense</em>' attribute.
	 * @see #isSetSameSense()
	 * @see #unsetSameSense()
	 * @see #getSameSense()
	 * @generated
	 */
	void setSameSense(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcGridAxis#getSameSense <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSameSense()
	 * @see #getSameSense()
	 * @see #setSameSense(Boolean)
	 * @generated
	 */
	void unsetSameSense();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcGridAxis#getSameSense <em>Same Sense</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Same Sense</em>' attribute is set.
	 * @see #unsetSameSense()
	 * @see #getSameSense()
	 * @see #setSameSense(Boolean)
	 * @generated
	 */
	boolean isSetSameSense();

	/**
	 * Returns the value of the '<em><b>Axis Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Tag</em>' attribute.
	 * @see #isSetAxisTag()
	 * @see #unsetAxisTag()
	 * @see #setAxisTag(String)
	 * @see IFC2X3.IFC2X3Package#getIfcGridAxis_AxisTag()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getAxisTag();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGridAxis#getAxisTag <em>Axis Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Tag</em>' attribute.
	 * @see #isSetAxisTag()
	 * @see #unsetAxisTag()
	 * @see #getAxisTag()
	 * @generated
	 */
	void setAxisTag(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcGridAxis#getAxisTag <em>Axis Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAxisTag()
	 * @see #getAxisTag()
	 * @see #setAxisTag(String)
	 * @generated
	 */
	void unsetAxisTag();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcGridAxis#getAxisTag <em>Axis Tag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Axis Tag</em>' attribute is set.
	 * @see #unsetAxisTag()
	 * @see #getAxisTag()
	 * @see #setAxisTag(String)
	 * @generated
	 */
	boolean isSetAxisTag();

} // IfcGridAxis
