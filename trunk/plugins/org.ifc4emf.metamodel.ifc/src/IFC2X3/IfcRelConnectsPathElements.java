/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcRelConnectsPathElementsImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Connects Path Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelConnectsPathElements#getRelatingPriorities <em>Relating Priorities</em>}</li>
 *   <li>{@link IFC2X3.IfcRelConnectsPathElements#getRelatedPriorities <em>Related Priorities</em>}</li>
 *   <li>{@link IFC2X3.IfcRelConnectsPathElements#getRelatedConnectionType <em>Related Connection Type</em>}</li>
 *   <li>{@link IFC2X3.IfcRelConnectsPathElements#getRelatingConnectionType <em>Relating Connection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsPathElements()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelConnectsPathElementsImplAdapter.class)
public interface IfcRelConnectsPathElements extends IfcRelConnectsElements {
	/**
	 * Returns the value of the '<em><b>Relating Connection Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcConnectionTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Connection Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Connection Type</em>' attribute.
	 * @see IFC2X3.IfcConnectionTypeEnum
	 * @see #isSetRelatingConnectionType()
	 * @see #unsetRelatingConnectionType()
	 * @see #setRelatingConnectionType(IfcConnectionTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsPathElements_RelatingConnectionType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcConnectionTypeEnum getRelatingConnectionType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelConnectsPathElements#getRelatingConnectionType <em>Relating Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Connection Type</em>' attribute.
	 * @see IFC2X3.IfcConnectionTypeEnum
	 * @see #isSetRelatingConnectionType()
	 * @see #unsetRelatingConnectionType()
	 * @see #getRelatingConnectionType()
	 * @generated
	 */
	void setRelatingConnectionType(IfcConnectionTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRelConnectsPathElements#getRelatingConnectionType <em>Relating Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelatingConnectionType()
	 * @see #getRelatingConnectionType()
	 * @see #setRelatingConnectionType(IfcConnectionTypeEnum)
	 * @generated
	 */
	void unsetRelatingConnectionType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRelConnectsPathElements#getRelatingConnectionType <em>Relating Connection Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relating Connection Type</em>' attribute is set.
	 * @see #unsetRelatingConnectionType()
	 * @see #getRelatingConnectionType()
	 * @see #setRelatingConnectionType(IfcConnectionTypeEnum)
	 * @generated
	 */
	boolean isSetRelatingConnectionType();

	/**
	 * Returns the value of the '<em><b>Related Connection Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcConnectionTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Connection Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Connection Type</em>' attribute.
	 * @see IFC2X3.IfcConnectionTypeEnum
	 * @see #isSetRelatedConnectionType()
	 * @see #unsetRelatedConnectionType()
	 * @see #setRelatedConnectionType(IfcConnectionTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsPathElements_RelatedConnectionType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcConnectionTypeEnum getRelatedConnectionType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelConnectsPathElements#getRelatedConnectionType <em>Related Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Connection Type</em>' attribute.
	 * @see IFC2X3.IfcConnectionTypeEnum
	 * @see #isSetRelatedConnectionType()
	 * @see #unsetRelatedConnectionType()
	 * @see #getRelatedConnectionType()
	 * @generated
	 */
	void setRelatedConnectionType(IfcConnectionTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRelConnectsPathElements#getRelatedConnectionType <em>Related Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelatedConnectionType()
	 * @see #getRelatedConnectionType()
	 * @see #setRelatedConnectionType(IfcConnectionTypeEnum)
	 * @generated
	 */
	void unsetRelatedConnectionType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRelConnectsPathElements#getRelatedConnectionType <em>Related Connection Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Related Connection Type</em>' attribute is set.
	 * @see #unsetRelatedConnectionType()
	 * @see #getRelatedConnectionType()
	 * @see #setRelatedConnectionType(IfcConnectionTypeEnum)
	 * @generated
	 */
	boolean isSetRelatedConnectionType();

	/**
	 * Returns the value of the '<em><b>Related Priorities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Priorities</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Priorities</em>' attribute list.
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsPathElements_RelatedPriorities()
	 * @model unique="false" dataType="IFC2X3.INTEGER"
	 * @generated
	 */
	EList<Integer> getRelatedPriorities();

	/**
	 * Returns the value of the '<em><b>Relating Priorities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Priorities</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Priorities</em>' attribute list.
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsPathElements_RelatingPriorities()
	 * @model unique="false" dataType="IFC2X3.INTEGER"
	 * @generated
	 */
	EList<Integer> getRelatingPriorities();

} // IfcRelConnectsPathElements
