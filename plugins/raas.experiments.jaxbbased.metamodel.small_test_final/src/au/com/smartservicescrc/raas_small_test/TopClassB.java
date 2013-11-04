/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.com.smartservicescrc.raas_small_test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import au.com.smartservicescrc.raas_small_test.jaxb.TopClassBImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Class B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.TopClassB#getRaasRef <em>Raas Ref</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.TopClassB#getMulti2lowerAttrInt <em>Multi2lower Attr Int</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.TopClassB#getSingleAttrInt <em>Single Attr Int</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.TopClassB#getOptionalAttrInt <em>Optional Attr Int</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.TopClassB#getMultiRefClassE <em>Multi Ref Class E</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getTopClassB()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(TopClassBImplAdapter.class)
public interface TopClassB extends EObject {
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
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getTopClassB_RaasRef()
	 * @model id="true"
	 * @generated
	 */
	String getRaasRef();

	/**
	 * Sets the value of the '{@link au.com.smartservicescrc.raas_small_test.TopClassB#getRaasRef <em>Raas Ref</em>}' attribute.
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
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getTopClassB_Multi2lowerAttrInt()
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
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getTopClassB_SingleAttrInt()
	 * @model required="true"
	 * @generated
	 */
	int getSingleAttrInt();

	/**
	 * Sets the value of the '{@link au.com.smartservicescrc.raas_small_test.TopClassB#getSingleAttrInt <em>Single Attr Int</em>}' attribute.
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
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getTopClassB_OptionalAttrInt()
	 * @model
	 * @generated
	 */
	int getOptionalAttrInt();

	/**
	 * Sets the value of the '{@link au.com.smartservicescrc.raas_small_test.TopClassB#getOptionalAttrInt <em>Optional Attr Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Attr Int</em>' attribute.
	 * @see #getOptionalAttrInt()
	 * @generated
	 */
	void setOptionalAttrInt(int value);

	/**
	 * Returns the value of the '<em><b>Multi Ref Class E</b></em>' reference list.
	 * The list contents are of type {@link au.com.smartservicescrc.raas_small_test.UnderClassE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Ref Class E</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Ref Class E</em>' reference list.
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getTopClassB_MultiRefClassE()
	 * @model
	 * @generated
	 */
	EList<UnderClassE> getMultiRefClassE();

} // TopClassB
