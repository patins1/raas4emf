/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcClassificationNotationImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Classification Notation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcClassificationNotation#getNotationFacets <em>Notation Facets</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcClassificationNotation()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcClassificationNotationImplAdapter.class)
public interface IfcClassificationNotation extends IfcClassificationNotationSelect {
	/**
	 * Returns the value of the '<em><b>Notation Facets</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcClassificationNotationFacet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notation Facets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation Facets</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcClassificationNotation_NotationFacets()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcClassificationNotationFacet> getNotationFacets();

} // IfcClassificationNotation
