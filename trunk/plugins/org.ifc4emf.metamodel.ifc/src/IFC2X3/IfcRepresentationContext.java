/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcRepresentationContextImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Representation Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRepresentationContext#getContextIdentifier <em>Context Identifier</em>}</li>
 *   <li>{@link IFC2X3.IfcRepresentationContext#getContextType <em>Context Type</em>}</li>
 *   <li>{@link IFC2X3.IfcRepresentationContext#getRepresentationsInContext <em>Representations In Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRepresentationContext()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcRepresentationContextImplAdapter.class)
public interface IfcRepresentationContext extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Representations In Context</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRepresentation}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRepresentation#getContextOfItems <em>Context Of Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representations In Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representations In Context</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcRepresentationContext_RepresentationsInContext()
	 * @see IFC2X3.IfcRepresentation#getContextOfItems
	 * @model opposite="ContextOfItems" ordered="false"
	 * @generated
	 */
	EList<IfcRepresentation> getRepresentationsInContext();

	/**
	 * Returns the value of the '<em><b>Context Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Type</em>' attribute.
	 * @see #isSetContextType()
	 * @see #unsetContextType()
	 * @see #setContextType(String)
	 * @see IFC2X3.IFC2X3Package#getIfcRepresentationContext_ContextType()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getContextType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRepresentationContext#getContextType <em>Context Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Type</em>' attribute.
	 * @see #isSetContextType()
	 * @see #unsetContextType()
	 * @see #getContextType()
	 * @generated
	 */
	void setContextType(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRepresentationContext#getContextType <em>Context Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContextType()
	 * @see #getContextType()
	 * @see #setContextType(String)
	 * @generated
	 */
	void unsetContextType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRepresentationContext#getContextType <em>Context Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Context Type</em>' attribute is set.
	 * @see #unsetContextType()
	 * @see #getContextType()
	 * @see #setContextType(String)
	 * @generated
	 */
	boolean isSetContextType();

	/**
	 * Returns the value of the '<em><b>Context Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Identifier</em>' attribute.
	 * @see #isSetContextIdentifier()
	 * @see #unsetContextIdentifier()
	 * @see #setContextIdentifier(String)
	 * @see IFC2X3.IFC2X3Package#getIfcRepresentationContext_ContextIdentifier()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getContextIdentifier();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRepresentationContext#getContextIdentifier <em>Context Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Identifier</em>' attribute.
	 * @see #isSetContextIdentifier()
	 * @see #unsetContextIdentifier()
	 * @see #getContextIdentifier()
	 * @generated
	 */
	void setContextIdentifier(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRepresentationContext#getContextIdentifier <em>Context Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContextIdentifier()
	 * @see #getContextIdentifier()
	 * @see #setContextIdentifier(String)
	 * @generated
	 */
	void unsetContextIdentifier();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRepresentationContext#getContextIdentifier <em>Context Identifier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Context Identifier</em>' attribute is set.
	 * @see #unsetContextIdentifier()
	 * @see #getContextIdentifier()
	 * @see #setContextIdentifier(String)
	 * @generated
	 */
	boolean isSetContextIdentifier();

} // IfcRepresentationContext
