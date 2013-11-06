/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcControlImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcControl#getControls <em>Controls</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcControl()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcControlImplAdapter.class)
public interface IfcControl extends IfcObject {
	/**
	 * Returns the value of the '<em><b>Controls</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelAssignsToControl}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelAssignsToControl#getRelatingControl <em>Relating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcControl_Controls()
	 * @see IFC2X3.IfcRelAssignsToControl#getRelatingControl
	 * @model opposite="RelatingControl" ordered="false"
	 * @generated
	 */
	EList<IfcRelAssignsToControl> getControls();

} // IfcControl
