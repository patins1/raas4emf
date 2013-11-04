/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.com.smartservicescrc.raas_small_test;

import java.util.TimeZone;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import au.com.smartservicescrc.raas_small_test.jaxb.TopClassDImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Class D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.TopClassD#getRaasRef <em>Raas Ref</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.TopClassD#getMulti2lowerAttrInt <em>Multi2lower Attr Int</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.TopClassD#getSingleAttrInt <em>Single Attr Int</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.TopClassD#getOptionalAttrInt <em>Optional Attr Int</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.TopClassD#getOptionalTimeZone <em>Optional Time Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getTopClassD()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(TopClassDImplAdapter.class)
public interface TopClassD extends EObject {
	/**
	 * Returns the value of the '<em><b>Raas Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raas Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raas Ref</em>' attribute.
	 * @see #setRaasRef(String)
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getTopClassD_RaasRef()
	 * @model id="true"
	 * @generated
	 */
	String getRaasRef();

	/**
	 * Sets the value of the '{@link au.com.smartservicescrc.raas_small_test.TopClassD#getRaasRef <em>Raas Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raas Ref</em>' attribute.
	 * @see #getRaasRef()
	 * @generated
	 */
	void setRaasRef(String value);

	/**
	 * Returns the value of the '<em><b>Multi2lower Attr Int</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi2lower Attr Int</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi2lower Attr Int</em>' attribute list.
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getTopClassD_Multi2lowerAttrInt()
	 * @model lower="2"
	 * @generated
	 */
	EList<Integer> getMulti2lowerAttrInt();

	/**
	 * Returns the value of the '<em><b>Single Attr Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Attr Int</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Attr Int</em>' attribute.
	 * @see #setSingleAttrInt(int)
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getTopClassD_SingleAttrInt()
	 * @model required="true"
	 * @generated
	 */
	int getSingleAttrInt();

	/**
	 * Sets the value of the '{@link au.com.smartservicescrc.raas_small_test.TopClassD#getSingleAttrInt <em>Single Attr Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Attr Int</em>' attribute.
	 * @see #getSingleAttrInt()
	 * @generated
	 */
	void setSingleAttrInt(int value);

	/**
	 * Returns the value of the '<em><b>Optional Attr Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Attr Int</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Attr Int</em>' attribute.
	 * @see #setOptionalAttrInt(int)
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getTopClassD_OptionalAttrInt()
	 * @model
	 * @generated
	 */
	int getOptionalAttrInt();

	/**
	 * Sets the value of the '{@link au.com.smartservicescrc.raas_small_test.TopClassD#getOptionalAttrInt <em>Optional Attr Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Attr Int</em>' attribute.
	 * @see #getOptionalAttrInt()
	 * @generated
	 */
	void setOptionalAttrInt(int value);

	/**
	 * Returns the value of the '<em><b>Optional Time Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Time Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Time Zone</em>' attribute.
	 * @see #setOptionalTimeZone(TimeZone)
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getTopClassD_OptionalTimeZone()
	 * @model dataType="au.com.smartservicescrc.raas_small_test.TimeZone"
	 * @generated
	 */
	TimeZone getOptionalTimeZone();

	/**
	 * Sets the value of the '{@link au.com.smartservicescrc.raas_small_test.TopClassD#getOptionalTimeZone <em>Optional Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Time Zone</em>' attribute.
	 * @see #getOptionalTimeZone()
	 * @generated
	 */
	void setOptionalTimeZone(TimeZone value);

} // TopClassD
