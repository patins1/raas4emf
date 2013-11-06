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

import IFC2X3.jaxb.IfcUnitAssignmentImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Unit Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcUnitAssignment#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcUnitAssignment()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcUnitAssignmentImplAdapter.class)
public interface IfcUnitAssignment extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcUnitAssignment_Units()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcUnit> getUnits();

} // IfcUnitAssignment
