/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcTwoDirectionRepeatFactorImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Two Direction Repeat Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTwoDirectionRepeatFactor#getSecondRepeatFactor <em>Second Repeat Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTwoDirectionRepeatFactor()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcTwoDirectionRepeatFactorImplAdapter.class)
public interface IfcTwoDirectionRepeatFactor extends IfcOneDirectionRepeatFactor {
	/**
	 * Returns the value of the '<em><b>Second Repeat Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Repeat Factor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Repeat Factor</em>' reference.
	 * @see #setSecondRepeatFactor(IfcVector)
	 * @see IFC2X3.IFC2X3Package#getIfcTwoDirectionRepeatFactor_SecondRepeatFactor()
	 * @model required="true"
	 * @generated
	 */
	IfcVector getSecondRepeatFactor();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTwoDirectionRepeatFactor#getSecondRepeatFactor <em>Second Repeat Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Repeat Factor</em>' reference.
	 * @see #getSecondRepeatFactor()
	 * @generated
	 */
	void setSecondRepeatFactor(IfcVector value);

} // IfcTwoDirectionRepeatFactor
