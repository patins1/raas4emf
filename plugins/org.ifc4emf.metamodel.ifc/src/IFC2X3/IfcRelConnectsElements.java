/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelConnectsElementsImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Connects Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelConnectsElements#getConnectionGeometry <em>Connection Geometry</em>}</li>
 *   <li>{@link IFC2X3.IfcRelConnectsElements#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link IFC2X3.IfcRelConnectsElements#getRelatedElement <em>Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsElements()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelConnectsElementsImplAdapter.class)
public interface IfcRelConnectsElements extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Connection Geometry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Geometry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Geometry</em>' reference.
	 * @see #setConnectionGeometry(IfcConnectionGeometry)
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsElements_ConnectionGeometry()
	 * @model
	 * @generated
	 */
	IfcConnectionGeometry getConnectionGeometry();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelConnectsElements#getConnectionGeometry <em>Connection Geometry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Geometry</em>' reference.
	 * @see #getConnectionGeometry()
	 * @generated
	 */
	void setConnectionGeometry(IfcConnectionGeometry value);

	/**
	 * Returns the value of the '<em><b>Related Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcElement#getConnectedFrom <em>Connected From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Element</em>' reference.
	 * @see #setRelatedElement(IfcElement)
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsElements_RelatedElement()
	 * @see IFC2X3.IfcElement#getConnectedFrom
	 * @model opposite="ConnectedFrom" required="true"
	 * @generated
	 */
	IfcElement getRelatedElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelConnectsElements#getRelatedElement <em>Related Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Element</em>' reference.
	 * @see #getRelatedElement()
	 * @generated
	 */
	void setRelatedElement(IfcElement value);

	/**
	 * Returns the value of the '<em><b>Relating Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcElement#getConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Element</em>' reference.
	 * @see #setRelatingElement(IfcElement)
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsElements_RelatingElement()
	 * @see IFC2X3.IfcElement#getConnectedTo
	 * @model opposite="ConnectedTo" required="true"
	 * @generated
	 */
	IfcElement getRelatingElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelConnectsElements#getRelatingElement <em>Relating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Element</em>' reference.
	 * @see #getRelatingElement()
	 * @generated
	 */
	void setRelatingElement(IfcElement value);

} // IfcRelConnectsElements
