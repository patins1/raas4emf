/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcRepresentationImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRepresentation#getContextOfItems <em>Context Of Items</em>}</li>
 *   <li>{@link IFC2X3.IfcRepresentation#getRepresentationIdentifier <em>Representation Identifier</em>}</li>
 *   <li>{@link IFC2X3.IfcRepresentation#getRepresentationType <em>Representation Type</em>}</li>
 *   <li>{@link IFC2X3.IfcRepresentation#getItems <em>Items</em>}</li>
 *   <li>{@link IFC2X3.IfcRepresentation#getRepresentationMap <em>Representation Map</em>}</li>
 *   <li>{@link IFC2X3.IfcRepresentation#getOfProductRepresentation <em>Of Product Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRepresentation()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRepresentationImplAdapter.class)
public interface IfcRepresentation extends IfcLayeredItem {
	/**
	 * Returns the value of the '<em><b>Representation Map</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRepresentationMap#getMappedRepresentation <em>Mapped Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation Map</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation Map</em>' reference.
	 * @see #setRepresentationMap(IfcRepresentationMap)
	 * @see IFC2X3.IFC2X3Package#getIfcRepresentation_RepresentationMap()
	 * @see IFC2X3.IfcRepresentationMap#getMappedRepresentation
	 * @model opposite="MappedRepresentation" ordered="false"
	 * @generated
	 */
	IfcRepresentationMap getRepresentationMap();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRepresentation#getRepresentationMap <em>Representation Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation Map</em>' reference.
	 * @see #getRepresentationMap()
	 * @generated
	 */
	void setRepresentationMap(IfcRepresentationMap value);

	/**
	 * Returns the value of the '<em><b>Of Product Representation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcProductRepresentation#getRepresentations <em>Representations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Of Product Representation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Of Product Representation</em>' reference.
	 * @see #setOfProductRepresentation(IfcProductRepresentation)
	 * @see IFC2X3.IFC2X3Package#getIfcRepresentation_OfProductRepresentation()
	 * @see IFC2X3.IfcProductRepresentation#getRepresentations
	 * @model opposite="Representations" ordered="false"
	 * @generated
	 */
	IfcProductRepresentation getOfProductRepresentation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRepresentation#getOfProductRepresentation <em>Of Product Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Of Product Representation</em>' reference.
	 * @see #getOfProductRepresentation()
	 * @generated
	 */
	void setOfProductRepresentation(IfcProductRepresentation value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRepresentationItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcRepresentation_Items()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcRepresentationItem> getItems();

	/**
	 * Returns the value of the '<em><b>Context Of Items</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRepresentationContext#getRepresentationsInContext <em>Representations In Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Of Items</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Of Items</em>' reference.
	 * @see #setContextOfItems(IfcRepresentationContext)
	 * @see IFC2X3.IFC2X3Package#getIfcRepresentation_ContextOfItems()
	 * @see IFC2X3.IfcRepresentationContext#getRepresentationsInContext
	 * @model opposite="RepresentationsInContext" required="true"
	 * @generated
	 */
	IfcRepresentationContext getContextOfItems();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRepresentation#getContextOfItems <em>Context Of Items</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Of Items</em>' reference.
	 * @see #getContextOfItems()
	 * @generated
	 */
	void setContextOfItems(IfcRepresentationContext value);

	/**
	 * Returns the value of the '<em><b>Representation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation Type</em>' attribute.
	 * @see #isSetRepresentationType()
	 * @see #unsetRepresentationType()
	 * @see #setRepresentationType(String)
	 * @see IFC2X3.IFC2X3Package#getIfcRepresentation_RepresentationType()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getRepresentationType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRepresentation#getRepresentationType <em>Representation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation Type</em>' attribute.
	 * @see #isSetRepresentationType()
	 * @see #unsetRepresentationType()
	 * @see #getRepresentationType()
	 * @generated
	 */
	void setRepresentationType(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRepresentation#getRepresentationType <em>Representation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepresentationType()
	 * @see #getRepresentationType()
	 * @see #setRepresentationType(String)
	 * @generated
	 */
	void unsetRepresentationType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRepresentation#getRepresentationType <em>Representation Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Representation Type</em>' attribute is set.
	 * @see #unsetRepresentationType()
	 * @see #getRepresentationType()
	 * @see #setRepresentationType(String)
	 * @generated
	 */
	boolean isSetRepresentationType();

	/**
	 * Returns the value of the '<em><b>Representation Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation Identifier</em>' attribute.
	 * @see #isSetRepresentationIdentifier()
	 * @see #unsetRepresentationIdentifier()
	 * @see #setRepresentationIdentifier(String)
	 * @see IFC2X3.IFC2X3Package#getIfcRepresentation_RepresentationIdentifier()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getRepresentationIdentifier();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRepresentation#getRepresentationIdentifier <em>Representation Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation Identifier</em>' attribute.
	 * @see #isSetRepresentationIdentifier()
	 * @see #unsetRepresentationIdentifier()
	 * @see #getRepresentationIdentifier()
	 * @generated
	 */
	void setRepresentationIdentifier(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRepresentation#getRepresentationIdentifier <em>Representation Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepresentationIdentifier()
	 * @see #getRepresentationIdentifier()
	 * @see #setRepresentationIdentifier(String)
	 * @generated
	 */
	void unsetRepresentationIdentifier();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRepresentation#getRepresentationIdentifier <em>Representation Identifier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Representation Identifier</em>' attribute is set.
	 * @see #unsetRepresentationIdentifier()
	 * @see #getRepresentationIdentifier()
	 * @see #setRepresentationIdentifier(String)
	 * @generated
	 */
	boolean isSetRepresentationIdentifier();

} // IfcRepresentation
