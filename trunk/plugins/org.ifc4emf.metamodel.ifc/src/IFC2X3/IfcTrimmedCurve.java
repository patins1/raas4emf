/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcTrimmedCurveImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Trimmed Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTrimmedCurve#getBasisCurve <em>Basis Curve</em>}</li>
 *   <li>{@link IFC2X3.IfcTrimmedCurve#getTrim1 <em>Trim1</em>}</li>
 *   <li>{@link IFC2X3.IfcTrimmedCurve#getTrim2 <em>Trim2</em>}</li>
 *   <li>{@link IFC2X3.IfcTrimmedCurve#getSenseAgreement <em>Sense Agreement</em>}</li>
 *   <li>{@link IFC2X3.IfcTrimmedCurve#getMasterRepresentation <em>Master Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTrimmedCurve()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcTrimmedCurveImplAdapter.class)
public interface IfcTrimmedCurve extends IfcBoundedCurve {
	/**
	 * Returns the value of the '<em><b>Trim1</b></em>' containment reference list.
	 * The list contents are of type {@link IFC2X3.IfcTrimmingSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trim1</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trim1</em>' containment reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcTrimmedCurve_Trim1()
	 * @model containment="true" required="true" upper="2" ordered="false"
	 * @generated
	 */
	EList<IfcTrimmingSelect> getTrim1();

	/**
	 * Returns the value of the '<em><b>Trim2</b></em>' containment reference list.
	 * The list contents are of type {@link IFC2X3.IfcTrimmingSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trim2</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trim2</em>' containment reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcTrimmedCurve_Trim2()
	 * @model containment="true" required="true" upper="2" ordered="false"
	 * @generated
	 */
	EList<IfcTrimmingSelect> getTrim2();

	/**
	 * Returns the value of the '<em><b>Basis Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Curve</em>' reference.
	 * @see #setBasisCurve(IfcCurve)
	 * @see IFC2X3.IFC2X3Package#getIfcTrimmedCurve_BasisCurve()
	 * @model required="true"
	 * @generated
	 */
	IfcCurve getBasisCurve();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTrimmedCurve#getBasisCurve <em>Basis Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis Curve</em>' reference.
	 * @see #getBasisCurve()
	 * @generated
	 */
	void setBasisCurve(IfcCurve value);

	/**
	 * Returns the value of the '<em><b>Master Representation</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcTrimmingPreference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Representation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Representation</em>' attribute.
	 * @see IFC2X3.IfcTrimmingPreference
	 * @see #isSetMasterRepresentation()
	 * @see #unsetMasterRepresentation()
	 * @see #setMasterRepresentation(IfcTrimmingPreference)
	 * @see IFC2X3.IFC2X3Package#getIfcTrimmedCurve_MasterRepresentation()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcTrimmingPreference getMasterRepresentation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTrimmedCurve#getMasterRepresentation <em>Master Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Representation</em>' attribute.
	 * @see IFC2X3.IfcTrimmingPreference
	 * @see #isSetMasterRepresentation()
	 * @see #unsetMasterRepresentation()
	 * @see #getMasterRepresentation()
	 * @generated
	 */
	void setMasterRepresentation(IfcTrimmingPreference value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTrimmedCurve#getMasterRepresentation <em>Master Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMasterRepresentation()
	 * @see #getMasterRepresentation()
	 * @see #setMasterRepresentation(IfcTrimmingPreference)
	 * @generated
	 */
	void unsetMasterRepresentation();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTrimmedCurve#getMasterRepresentation <em>Master Representation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Master Representation</em>' attribute is set.
	 * @see #unsetMasterRepresentation()
	 * @see #getMasterRepresentation()
	 * @see #setMasterRepresentation(IfcTrimmingPreference)
	 * @generated
	 */
	boolean isSetMasterRepresentation();

	/**
	 * Returns the value of the '<em><b>Sense Agreement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sense Agreement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sense Agreement</em>' attribute.
	 * @see #isSetSenseAgreement()
	 * @see #unsetSenseAgreement()
	 * @see #setSenseAgreement(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcTrimmedCurve_SenseAgreement()
	 * @model unsettable="true" dataType="IFC2X3.BOOLEAN" required="true"
	 * @generated
	 */
	Boolean getSenseAgreement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTrimmedCurve#getSenseAgreement <em>Sense Agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sense Agreement</em>' attribute.
	 * @see #isSetSenseAgreement()
	 * @see #unsetSenseAgreement()
	 * @see #getSenseAgreement()
	 * @generated
	 */
	void setSenseAgreement(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTrimmedCurve#getSenseAgreement <em>Sense Agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSenseAgreement()
	 * @see #getSenseAgreement()
	 * @see #setSenseAgreement(Boolean)
	 * @generated
	 */
	void unsetSenseAgreement();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTrimmedCurve#getSenseAgreement <em>Sense Agreement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sense Agreement</em>' attribute is set.
	 * @see #unsetSenseAgreement()
	 * @see #getSenseAgreement()
	 * @see #setSenseAgreement(Boolean)
	 * @generated
	 */
	boolean isSetSenseAgreement();

} // IfcTrimmedCurve
