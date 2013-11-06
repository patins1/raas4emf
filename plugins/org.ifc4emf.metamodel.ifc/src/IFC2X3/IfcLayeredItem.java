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

import IFC2X3.jaxb.IfcLayeredItemImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Layered Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcLayeredItem#getLayerAssignments <em>Layer Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcLayeredItem()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcLayeredItemImplAdapter.class)
public interface IfcLayeredItem extends CDOObject {

	/**
	 * Returns the value of the '<em><b>Layer Assignments</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcPresentationLayerAssignment}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcPresentationLayerAssignment#getAssignedItems <em>Assigned Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer Assignments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Assignments</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcLayeredItem_LayerAssignments()
	 * @see IFC2X3.IfcPresentationLayerAssignment#getAssignedItems
	 * @model opposite="AssignedItems" ordered="false"
	 * @generated
	 */
	EList<IfcPresentationLayerAssignment> getLayerAssignments();

} // IfcLayeredItem
