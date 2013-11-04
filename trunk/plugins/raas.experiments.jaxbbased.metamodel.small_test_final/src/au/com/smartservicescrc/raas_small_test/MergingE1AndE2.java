/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.com.smartservicescrc.raas_small_test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import au.com.smartservicescrc.raas_small_test.jaxb.MergingE1AndE2ImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merging E1 And E2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.MergingE1AndE2#getOptionalAttrString <em>Optional Attr String</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getMergingE1AndE2()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(MergingE1AndE2ImplAdapter.class)
public interface MergingE1AndE2 extends DerivedUnderClassE1, DerivedUnderClassE2 {

	/**
	 * Returns the value of the '<em><b>Optional Attr String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Attr String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Attr String</em>' attribute.
	 * @see #setOptionalAttrString(String)
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getMergingE1AndE2_OptionalAttrString()
	 * @model
	 * @generated
	 */
	String getOptionalAttrString();

	/**
	 * Sets the value of the '{@link au.com.smartservicescrc.raas_small_test.MergingE1AndE2#getOptionalAttrString <em>Optional Attr String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Attr String</em>' attribute.
	 * @see #getOptionalAttrString()
	 * @generated
	 */
	void setOptionalAttrString(String value);
} // MergingE1AndE2
