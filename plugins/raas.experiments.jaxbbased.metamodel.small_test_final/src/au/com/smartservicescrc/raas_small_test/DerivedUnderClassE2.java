/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.com.smartservicescrc.raas_small_test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import au.com.smartservicescrc.raas_small_test.jaxb.DerivedUnderClassE2ImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Under Class E2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link au.com.smartservicescrc.raas_small_test.DerivedUnderClassE2#getMultiContainClassJ <em>Multi Contain Class J</em>}</li>
 * </ul>
 * </p>
 *
 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getDerivedUnderClassE2()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(DerivedUnderClassE2ImplAdapter.class)
public interface DerivedUnderClassE2 extends UnderClassE {
	/**
	 * Returns the value of the '<em><b>Multi Contain Class J</b></em>' containment reference list.
	 * The list contents are of type {@link au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Contain Class J</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Contain Class J</em>' containment reference list.
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#getDerivedUnderClassE2_MultiContainClassJ()
	 * @model containment="true"
	 *        annotation="RaaS AssertContainment='Yes'"
	 * @generated
	 */
	EList<ThirdLevelClassJ> getMultiContainClassJ();

} // DerivedUnderClassE2
