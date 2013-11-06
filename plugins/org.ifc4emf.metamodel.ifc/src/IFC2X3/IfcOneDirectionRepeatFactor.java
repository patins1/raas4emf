/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcOneDirectionRepeatFactorImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc One Direction Repeat Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcOneDirectionRepeatFactor#getRepeatFactor <em>Repeat Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcOneDirectionRepeatFactor()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcOneDirectionRepeatFactorImplAdapter.class)
public interface IfcOneDirectionRepeatFactor extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Repeat Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat Factor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat Factor</em>' reference.
	 * @see #setRepeatFactor(IfcVector)
	 * @see IFC2X3.IFC2X3Package#getIfcOneDirectionRepeatFactor_RepeatFactor()
	 * @model required="true"
	 * @generated
	 */
	IfcVector getRepeatFactor();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOneDirectionRepeatFactor#getRepeatFactor <em>Repeat Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Factor</em>' reference.
	 * @see #getRepeatFactor()
	 * @generated
	 */
	void setRepeatFactor(IfcVector value);

} // IfcOneDirectionRepeatFactor
