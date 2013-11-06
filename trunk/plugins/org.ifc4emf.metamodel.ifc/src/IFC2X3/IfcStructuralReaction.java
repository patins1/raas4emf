/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcStructuralReactionImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Reaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcStructuralReaction#getCauses <em>Causes</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcStructuralReaction()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcStructuralReactionImplAdapter.class)
public interface IfcStructuralReaction extends IfcStructuralActivity {
	/**
	 * Returns the value of the '<em><b>Causes</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcStructuralAction}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcStructuralAction#getCausedBy <em>Caused By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Causes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Causes</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralReaction_Causes()
	 * @see IFC2X3.IfcStructuralAction#getCausedBy
	 * @model opposite="CausedBy" ordered="false"
	 * @generated
	 */
	EList<IfcStructuralAction> getCauses();

} // IfcStructuralReaction
