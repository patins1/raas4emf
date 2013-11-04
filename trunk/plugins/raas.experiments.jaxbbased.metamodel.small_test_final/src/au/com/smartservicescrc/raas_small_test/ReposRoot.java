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

import au.com.smartservicescrc.raas_small_test.jaxb.ReposRootImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repos Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.ReposRoot#getRaasRef <em>Raas Ref</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.ReposRoot#getSingleAttrString <em>Single Attr String</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.ReposRoot#getMultiContainClassA <em>Multi Contain Class A</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.ReposRoot#getOptionalContainClassB <em>Optional Contain Class B</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.ReposRoot#getSingleContainClassC <em>Single Contain Class C</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.ReposRoot#getMultiRefClassD <em>Multi Ref Class D</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.ReposRoot#getMultiAttrString <em>Multi Attr String</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.ReposRoot#getSingleNonContainClassM <em>Single Non Contain Class M</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getReposRoot()
 * @model annotation="RaaS RepositoryRoot='Yes'"
 * @generated
 */
@XmlJavaTypeAdapter(ReposRootImplAdapter.class)
public interface ReposRoot extends EObject {
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
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getReposRoot_RaasRef()
	 * @model id="true"
	 * @generated
	 */
	String getRaasRef();

	/**
	 * Sets the value of the '{@link au.com.smartservicescrc.raas_small_test.ReposRoot#getRaasRef <em>Raas Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raas Ref</em>' attribute.
	 * @see #getRaasRef()
	 * @generated
	 */
	void setRaasRef(String value);

	/**
	 * Returns the value of the '<em><b>Single Attr String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Attr String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Attr String</em>' attribute.
	 * @see #setSingleAttrString(String)
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getReposRoot_SingleAttrString()
	 * @model required="true"
	 * @generated
	 */
	String getSingleAttrString();

	/**
	 * Sets the value of the '{@link au.com.smartservicescrc.raas_small_test.ReposRoot#getSingleAttrString <em>Single Attr String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Attr String</em>' attribute.
	 * @see #getSingleAttrString()
	 * @generated
	 */
	void setSingleAttrString(String value);

	/**
	 * Returns the value of the '<em><b>Multi Contain Class A</b></em>' containment reference list.
	 * The list contents are of type {@link au.com.smartservicescrc.raas_small_test.TopClassA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Contain Class A</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Contain Class A</em>' containment reference list.
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getReposRoot_MultiContainClassA()
	 * @model containment="true"
	 * @generated
	 */
	EList<TopClassA> getMultiContainClassA();

	/**
	 * Returns the value of the '<em><b>Optional Contain Class B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Contain Class B</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Contain Class B</em>' containment reference.
	 * @see #setOptionalContainClassB(TopClassB)
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getReposRoot_OptionalContainClassB()
	 * @model containment="true"
	 * @generated
	 */
	TopClassB getOptionalContainClassB();

	/**
	 * Sets the value of the '{@link au.com.smartservicescrc.raas_small_test.ReposRoot#getOptionalContainClassB <em>Optional Contain Class B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Contain Class B</em>' containment reference.
	 * @see #getOptionalContainClassB()
	 * @generated
	 */
	void setOptionalContainClassB(TopClassB value);

	/**
	 * Returns the value of the '<em><b>Single Contain Class C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Contain Class C</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Contain Class C</em>' containment reference.
	 * @see #setSingleContainClassC(TopClassC)
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getReposRoot_SingleContainClassC()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TopClassC getSingleContainClassC();

	/**
	 * Sets the value of the '{@link au.com.smartservicescrc.raas_small_test.ReposRoot#getSingleContainClassC <em>Single Contain Class C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Contain Class C</em>' containment reference.
	 * @see #getSingleContainClassC()
	 * @generated
	 */
	void setSingleContainClassC(TopClassC value);

	/**
	 * Returns the value of the '<em><b>Multi Ref Class D</b></em>' reference list.
	 * The list contents are of type {@link au.com.smartservicescrc.raas_small_test.TopClassD}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Ref Class D</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Ref Class D</em>' reference list.
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getReposRoot_MultiRefClassD()
	 * @model
	 * @generated
	 */
	EList<TopClassD> getMultiRefClassD();

	/**
	 * Returns the value of the '<em><b>Multi Attr String</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Attr String</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Attr String</em>' attribute list.
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getReposRoot_MultiAttrString()
	 * @model
	 * @generated
	 */
	EList<String> getMultiAttrString();

	/**
	 * Returns the value of the '<em><b>Single Non Contain Class M</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Non Contain Class M</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Non Contain Class M</em>' reference.
	 * @see #setSingleNonContainClassM(TopClassM)
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getReposRoot_SingleNonContainClassM()
	 * @model required="true"
	 * @generated
	 */
	TopClassM getSingleNonContainClassM();

	/**
	 * Sets the value of the '{@link au.com.smartservicescrc.raas_small_test.ReposRoot#getSingleNonContainClassM <em>Single Non Contain Class M</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Non Contain Class M</em>' reference.
	 * @see #getSingleNonContainClassM()
	 * @generated
	 */
	void setSingleNonContainClassM(TopClassM value);


} // ReposRoot
