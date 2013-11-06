/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcGeometricSetImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Geometric Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcGeometricSet#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcGeometricSet()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcGeometricSetImplAdapter.class)
public interface IfcGeometricSet extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcGeometricSetSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcGeometricSet_Elements()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcGeometricSetSelect> getElements();

} // IfcGeometricSet
