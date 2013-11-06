/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelVoidsElementImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Voids Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelVoidsElement#getRelatingBuildingElement <em>Relating Building Element</em>}</li>
 *   <li>{@link IFC2X3.IfcRelVoidsElement#getRelatedOpeningElement <em>Related Opening Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelVoidsElement()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelVoidsElementImplAdapter.class)
public interface IfcRelVoidsElement extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Building Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcElement#getHasOpenings <em>Has Openings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Building Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Building Element</em>' reference.
	 * @see #setRelatingBuildingElement(IfcElement)
	 * @see IFC2X3.IFC2X3Package#getIfcRelVoidsElement_RelatingBuildingElement()
	 * @see IFC2X3.IfcElement#getHasOpenings
	 * @model opposite="HasOpenings" required="true"
	 * @generated
	 */
	IfcElement getRelatingBuildingElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelVoidsElement#getRelatingBuildingElement <em>Relating Building Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Building Element</em>' reference.
	 * @see #getRelatingBuildingElement()
	 * @generated
	 */
	void setRelatingBuildingElement(IfcElement value);

	/**
	 * Returns the value of the '<em><b>Related Opening Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcFeatureElementSubtraction#getVoidsElements <em>Voids Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Opening Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Opening Element</em>' reference.
	 * @see #setRelatedOpeningElement(IfcFeatureElementSubtraction)
	 * @see IFC2X3.IFC2X3Package#getIfcRelVoidsElement_RelatedOpeningElement()
	 * @see IFC2X3.IfcFeatureElementSubtraction#getVoidsElements
	 * @model opposite="VoidsElements" required="true"
	 * @generated
	 */
	IfcFeatureElementSubtraction getRelatedOpeningElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelVoidsElement#getRelatedOpeningElement <em>Related Opening Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Opening Element</em>' reference.
	 * @see #getRelatedOpeningElement()
	 * @generated
	 */
	void setRelatedOpeningElement(IfcFeatureElementSubtraction value);

} // IfcRelVoidsElement
