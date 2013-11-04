/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.com.smartservicescrc.raas_small_test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import au.com.smartservicescrc.raas_small_test.jaxb.DerivedUnderClassE1ImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Under Class E1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.DerivedUnderClassE1#getSingleRefClassD <em>Single Ref Class D</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getDerivedUnderClassE1()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(DerivedUnderClassE1ImplAdapter.class)
public interface DerivedUnderClassE1 extends UnderClassE {
	/**
	 * Returns the value of the '<em><b>Single Ref Class D</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Ref Class D</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Ref Class D</em>' reference.
	 * @see #setSingleRefClassD(TopClassD)
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getDerivedUnderClassE1_SingleRefClassD()
	 * @model required="true"
	 * @generated
	 */
	TopClassD getSingleRefClassD();

	/**
	 * Sets the value of the '{@link au.com.smartservicescrc.raas_small_test.DerivedUnderClassE1#getSingleRefClassD <em>Single Ref Class D</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Ref Class D</em>' reference.
	 * @see #getSingleRefClassD()
	 * @generated
	 */
	void setSingleRefClassD(TopClassD value);

} // DerivedUnderClassE1
