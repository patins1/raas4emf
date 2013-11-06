/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcFeatureElementSubtractionImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Feature Element Subtraction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcFeatureElementSubtraction#getVoidsElements <em>Voids Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcFeatureElementSubtraction()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcFeatureElementSubtractionImplAdapter.class)
public interface IfcFeatureElementSubtraction extends IfcFeatureElement {
	/**
	 * Returns the value of the '<em><b>Voids Elements</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelVoidsElement#getRelatedOpeningElement <em>Related Opening Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voids Elements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voids Elements</em>' reference.
	 * @see #setVoidsElements(IfcRelVoidsElement)
	 * @see IFC2X3.IFC2X3Package#getIfcFeatureElementSubtraction_VoidsElements()
	 * @see IFC2X3.IfcRelVoidsElement#getRelatedOpeningElement
	 * @model opposite="RelatedOpeningElement" required="true"
	 * @generated
	 */
	IfcRelVoidsElement getVoidsElements();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFeatureElementSubtraction#getVoidsElements <em>Voids Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voids Elements</em>' reference.
	 * @see #getVoidsElements()
	 * @generated
	 */
	void setVoidsElements(IfcRelVoidsElement value);

} // IfcFeatureElementSubtraction
