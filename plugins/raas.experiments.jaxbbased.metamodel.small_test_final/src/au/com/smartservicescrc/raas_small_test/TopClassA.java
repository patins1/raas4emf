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

import au.com.smartservicescrc.raas_small_test.jaxb.TopClassAImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Class A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.TopClassA#getRaasRef <em>Raas Ref</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.TopClassA#getMultiContainClassE <em>Multi Contain Class E</em>}</li>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.TopClassA#getSingleContainClassF <em>Single Contain Class F</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getTopClassA()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(TopClassAImplAdapter.class)
public interface TopClassA extends EObject {
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
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getTopClassA_RaasRef()
	 * @model id="true"
	 * @generated
	 */
	String getRaasRef();

	/**
	 * Sets the value of the '{@link au.com.smartservicescrc.raas_small_test.TopClassA#getRaasRef <em>Raas Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raas Ref</em>' attribute.
	 * @see #getRaasRef()
	 * @generated
	 */
	void setRaasRef(String value);

	/**
	 * Returns the value of the '<em><b>Multi Contain Class E</b></em>' containment reference list.
	 * The list contents are of type {@link au.com.smartservicescrc.raas_small_test.UnderClassE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Contain Class E</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Contain Class E</em>' containment reference list.
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getTopClassA_MultiContainClassE()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnderClassE> getMultiContainClassE();

	/**
	 * Returns the value of the '<em><b>Single Contain Class F</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Contain Class F</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Contain Class F</em>' containment reference.
	 * @see #setSingleContainClassF(UnderClassF)
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getTopClassA_SingleContainClassF()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UnderClassF getSingleContainClassF();

	/**
	 * Sets the value of the '{@link au.com.smartservicescrc.raas_small_test.TopClassA#getSingleContainClassF <em>Single Contain Class F</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Contain Class F</em>' containment reference.
	 * @see #getSingleContainClassF()
	 * @generated
	 */
	void setSingleContainClassF(UnderClassF value);

} // TopClassA
