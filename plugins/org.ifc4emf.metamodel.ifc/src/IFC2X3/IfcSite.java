/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcSiteImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSite#getRefLatitude <em>Ref Latitude</em>}</li>
 *   <li>{@link IFC2X3.IfcSite#getRefLongitude <em>Ref Longitude</em>}</li>
 *   <li>{@link IFC2X3.IfcSite#getRefElevation <em>Ref Elevation</em>}</li>
 *   <li>{@link IFC2X3.IfcSite#getLandTitleNumber <em>Land Title Number</em>}</li>
 *   <li>{@link IFC2X3.IfcSite#getSiteAddress <em>Site Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSite()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSiteImplAdapter.class)
public interface IfcSite extends IfcSpatialStructureElement {
	/**
	 * Returns the value of the '<em><b>Site Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Address</em>' reference.
	 * @see #setSiteAddress(IfcPostalAddress)
	 * @see IFC2X3.IFC2X3Package#getIfcSite_SiteAddress()
	 * @model
	 * @generated
	 */
	IfcPostalAddress getSiteAddress();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSite#getSiteAddress <em>Site Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Address</em>' reference.
	 * @see #getSiteAddress()
	 * @generated
	 */
	void setSiteAddress(IfcPostalAddress value);

	/**
	 * Returns the value of the '<em><b>Land Title Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Land Title Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land Title Number</em>' attribute.
	 * @see #isSetLandTitleNumber()
	 * @see #unsetLandTitleNumber()
	 * @see #setLandTitleNumber(String)
	 * @see IFC2X3.IFC2X3Package#getIfcSite_LandTitleNumber()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getLandTitleNumber();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSite#getLandTitleNumber <em>Land Title Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Land Title Number</em>' attribute.
	 * @see #isSetLandTitleNumber()
	 * @see #unsetLandTitleNumber()
	 * @see #getLandTitleNumber()
	 * @generated
	 */
	void setLandTitleNumber(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSite#getLandTitleNumber <em>Land Title Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLandTitleNumber()
	 * @see #getLandTitleNumber()
	 * @see #setLandTitleNumber(String)
	 * @generated
	 */
	void unsetLandTitleNumber();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSite#getLandTitleNumber <em>Land Title Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Land Title Number</em>' attribute is set.
	 * @see #unsetLandTitleNumber()
	 * @see #getLandTitleNumber()
	 * @see #setLandTitleNumber(String)
	 * @generated
	 */
	boolean isSetLandTitleNumber();

	/**
	 * Returns the value of the '<em><b>Ref Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Elevation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Elevation</em>' attribute.
	 * @see #isSetRefElevation()
	 * @see #unsetRefElevation()
	 * @see #setRefElevation(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSite_RefElevation()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getRefElevation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSite#getRefElevation <em>Ref Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Elevation</em>' attribute.
	 * @see #isSetRefElevation()
	 * @see #unsetRefElevation()
	 * @see #getRefElevation()
	 * @generated
	 */
	void setRefElevation(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSite#getRefElevation <em>Ref Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRefElevation()
	 * @see #getRefElevation()
	 * @see #setRefElevation(Double)
	 * @generated
	 */
	void unsetRefElevation();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSite#getRefElevation <em>Ref Elevation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ref Elevation</em>' attribute is set.
	 * @see #unsetRefElevation()
	 * @see #getRefElevation()
	 * @see #setRefElevation(Double)
	 * @generated
	 */
	boolean isSetRefElevation();

	/**
	 * Returns the value of the '<em><b>Ref Longitude</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Longitude</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Longitude</em>' attribute list.
	 * @see IFC2X3.IFC2X3Package#getIfcSite_RefLongitude()
	 * @model unique="false" dataType="IFC2X3.INTEGER" upper="3"
	 * @generated
	 */
	EList<Integer> getRefLongitude();

	/**
	 * Returns the value of the '<em><b>Ref Latitude</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Latitude</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Latitude</em>' attribute list.
	 * @see IFC2X3.IFC2X3Package#getIfcSite_RefLatitude()
	 * @model unique="false" dataType="IFC2X3.INTEGER" upper="3"
	 * @generated
	 */
	EList<Integer> getRefLatitude();

} // IfcSite
