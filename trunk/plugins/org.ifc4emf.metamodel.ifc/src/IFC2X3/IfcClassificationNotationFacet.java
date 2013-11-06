/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcClassificationNotationFacetImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Classification Notation Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcClassificationNotationFacet#getNotationValue <em>Notation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcClassificationNotationFacet()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcClassificationNotationFacetImplAdapter.class)
public interface IfcClassificationNotationFacet extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Notation Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notation Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation Value</em>' attribute.
	 * @see #isSetNotationValue()
	 * @see #unsetNotationValue()
	 * @see #setNotationValue(String)
	 * @see IFC2X3.IFC2X3Package#getIfcClassificationNotationFacet_NotationValue()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getNotationValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcClassificationNotationFacet#getNotationValue <em>Notation Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notation Value</em>' attribute.
	 * @see #isSetNotationValue()
	 * @see #unsetNotationValue()
	 * @see #getNotationValue()
	 * @generated
	 */
	void setNotationValue(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcClassificationNotationFacet#getNotationValue <em>Notation Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNotationValue()
	 * @see #getNotationValue()
	 * @see #setNotationValue(String)
	 * @generated
	 */
	void unsetNotationValue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcClassificationNotationFacet#getNotationValue <em>Notation Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Notation Value</em>' attribute is set.
	 * @see #unsetNotationValue()
	 * @see #getNotationValue()
	 * @see #setNotationValue(String)
	 * @generated
	 */
	boolean isSetNotationValue();

} // IfcClassificationNotationFacet
