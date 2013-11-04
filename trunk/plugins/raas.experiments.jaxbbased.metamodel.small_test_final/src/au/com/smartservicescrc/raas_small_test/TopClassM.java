/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.com.smartservicescrc.raas_small_test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.ecore.EObject;

import au.com.smartservicescrc.raas_small_test.jaxb.TopClassMImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Class M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.TopClassM#getSingleAttrInt <em>Single Attr Int</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getTopClassM()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(TopClassMImplAdapter.class)
public interface TopClassM extends UnderClassE {
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
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getTopClassM_SingleAttrInt()
	 * @model required="true"
	 * @generated
	 */
	int getSingleAttrInt();

	/**
	 * Sets the value of the '{@link au.com.smartservicescrc.raas_small_test.TopClassM#getSingleAttrInt <em>Single Attr Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Attr Int</em>' attribute.
	 * @see #getSingleAttrInt()
	 * @generated
	 */
	void setSingleAttrInt(int value);

} // TopClassM
