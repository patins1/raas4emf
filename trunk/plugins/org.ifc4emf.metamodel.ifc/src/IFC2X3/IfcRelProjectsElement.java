/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelProjectsElementImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Projects Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelProjectsElement#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link IFC2X3.IfcRelProjectsElement#getRelatedFeatureElement <em>Related Feature Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelProjectsElement()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelProjectsElementImplAdapter.class)
public interface IfcRelProjectsElement extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Related Feature Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcFeatureElementAddition#getProjectsElements <em>Projects Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Feature Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Feature Element</em>' reference.
	 * @see #setRelatedFeatureElement(IfcFeatureElementAddition)
	 * @see IFC2X3.IFC2X3Package#getIfcRelProjectsElement_RelatedFeatureElement()
	 * @see IFC2X3.IfcFeatureElementAddition#getProjectsElements
	 * @model opposite="ProjectsElements" required="true"
	 * @generated
	 */
	IfcFeatureElementAddition getRelatedFeatureElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelProjectsElement#getRelatedFeatureElement <em>Related Feature Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Feature Element</em>' reference.
	 * @see #getRelatedFeatureElement()
	 * @generated
	 */
	void setRelatedFeatureElement(IfcFeatureElementAddition value);

	/**
	 * Returns the value of the '<em><b>Relating Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcElement#getHasProjections <em>Has Projections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Element</em>' reference.
	 * @see #setRelatingElement(IfcElement)
	 * @see IFC2X3.IFC2X3Package#getIfcRelProjectsElement_RelatingElement()
	 * @see IFC2X3.IfcElement#getHasProjections
	 * @model opposite="HasProjections" required="true"
	 * @generated
	 */
	IfcElement getRelatingElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelProjectsElement#getRelatingElement <em>Relating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Element</em>' reference.
	 * @see #getRelatingElement()
	 * @generated
	 */
	void setRelatingElement(IfcElement value);

} // IfcRelProjectsElement
