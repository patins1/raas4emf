/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcOpeningElementImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Opening Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcOpeningElement#getHasFillings <em>Has Fillings</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcOpeningElement()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcOpeningElementImplAdapter.class)
public interface IfcOpeningElement extends IfcFeatureElementSubtraction {
	/**
	 * Returns the value of the '<em><b>Has Fillings</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelFillsElement}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelFillsElement#getRelatingOpeningElement <em>Relating Opening Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Fillings</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Fillings</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcOpeningElement_HasFillings()
	 * @see IFC2X3.IfcRelFillsElement#getRelatingOpeningElement
	 * @model opposite="RelatingOpeningElement" ordered="false"
	 * @generated
	 */
	EList<IfcRelFillsElement> getHasFillings();

} // IfcOpeningElement
