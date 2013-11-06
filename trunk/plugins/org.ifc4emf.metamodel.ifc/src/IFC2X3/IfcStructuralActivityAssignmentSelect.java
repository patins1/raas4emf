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

import IFC2X3.jaxb.IfcStructuralActivityAssignmentSelectImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Activity Assignment Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcStructuralActivityAssignmentSelect#getAssignedStructuralActivity <em>Assigned Structural Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcStructuralActivityAssignmentSelect()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcStructuralActivityAssignmentSelectImplAdapter.class)
public interface IfcStructuralActivityAssignmentSelect extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Assigned Structural Activity</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelConnectsStructuralActivity}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelConnectsStructuralActivity#getRelatingElement <em>Relating Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Structural Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Structural Activity</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralActivityAssignmentSelect_AssignedStructuralActivity()
	 * @see IFC2X3.IfcRelConnectsStructuralActivity#getRelatingElement
	 * @model opposite="RelatingElement" ordered="false"
	 * @generated
	 */
	EList<IfcRelConnectsStructuralActivity> getAssignedStructuralActivity();

} // IfcStructuralActivityAssignmentSelect
