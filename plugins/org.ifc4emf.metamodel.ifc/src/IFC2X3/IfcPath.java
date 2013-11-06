/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcPathImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPath#getEdgeList <em>Edge List</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPath()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPathImplAdapter.class)
public interface IfcPath extends IfcTopologicalRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Edge List</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcOrientedEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge List</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcPath_EdgeList()
	 * @model required="true"
	 * @generated
	 */
	EList<IfcOrientedEdge> getEdgeList();

} // IfcPath
