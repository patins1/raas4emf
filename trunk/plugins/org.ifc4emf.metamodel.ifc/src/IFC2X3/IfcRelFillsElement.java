/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelFillsElementImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Fills Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelFillsElement#getRelatingOpeningElement <em>Relating Opening Element</em>}</li>
 *   <li>{@link IFC2X3.IfcRelFillsElement#getRelatedBuildingElement <em>Related Building Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelFillsElement()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelFillsElementImplAdapter.class)
public interface IfcRelFillsElement extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Opening Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcOpeningElement#getHasFillings <em>Has Fillings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Opening Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Opening Element</em>' reference.
	 * @see #setRelatingOpeningElement(IfcOpeningElement)
	 * @see IFC2X3.IFC2X3Package#getIfcRelFillsElement_RelatingOpeningElement()
	 * @see IFC2X3.IfcOpeningElement#getHasFillings
	 * @model opposite="HasFillings" required="true"
	 * @generated
	 */
	IfcOpeningElement getRelatingOpeningElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelFillsElement#getRelatingOpeningElement <em>Relating Opening Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Opening Element</em>' reference.
	 * @see #getRelatingOpeningElement()
	 * @generated
	 */
	void setRelatingOpeningElement(IfcOpeningElement value);

	/**
	 * Returns the value of the '<em><b>Related Building Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcElement#getFillsVoids <em>Fills Voids</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Building Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Building Element</em>' reference.
	 * @see #setRelatedBuildingElement(IfcElement)
	 * @see IFC2X3.IFC2X3Package#getIfcRelFillsElement_RelatedBuildingElement()
	 * @see IFC2X3.IfcElement#getFillsVoids
	 * @model opposite="FillsVoids" required="true"
	 * @generated
	 */
	IfcElement getRelatedBuildingElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelFillsElement#getRelatedBuildingElement <em>Related Building Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Building Element</em>' reference.
	 * @see #getRelatedBuildingElement()
	 * @generated
	 */
	void setRelatedBuildingElement(IfcElement value);

} // IfcRelFillsElement
