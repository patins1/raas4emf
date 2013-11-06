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

import IFC2X3.jaxb.IfcPresentationStyleAssignmentImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Presentation Style Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPresentationStyleAssignment#getStyles <em>Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPresentationStyleAssignment()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcPresentationStyleAssignmentImplAdapter.class)
public interface IfcPresentationStyleAssignment extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Styles</b></em>' containment reference list.
	 * The list contents are of type {@link IFC2X3.IfcPresentationStyleSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' containment reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcPresentationStyleAssignment_Styles()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<IfcPresentationStyleSelect> getStyles();

} // IfcPresentationStyleAssignment
