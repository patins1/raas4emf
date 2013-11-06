/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcStructuralMemberImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcStructuralMember#getReferencesElement <em>References Element</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralMember#getConnectedBy <em>Connected By</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcStructuralMember()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcStructuralMemberImplAdapter.class)
public interface IfcStructuralMember extends IfcStructuralItem {
	/**
	 * Returns the value of the '<em><b>References Element</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelConnectsStructuralElement}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelConnectsStructuralElement#getRelatedStructuralMember <em>Related Structural Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References Element</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralMember_ReferencesElement()
	 * @see IFC2X3.IfcRelConnectsStructuralElement#getRelatedStructuralMember
	 * @model opposite="RelatedStructuralMember" ordered="false"
	 * @generated
	 */
	EList<IfcRelConnectsStructuralElement> getReferencesElement();

	/**
	 * Returns the value of the '<em><b>Connected By</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelConnectsStructuralMember}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelConnectsStructuralMember#getRelatingStructuralMember <em>Relating Structural Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected By</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralMember_ConnectedBy()
	 * @see IFC2X3.IfcRelConnectsStructuralMember#getRelatingStructuralMember
	 * @model opposite="RelatingStructuralMember" ordered="false"
	 * @generated
	 */
	EList<IfcRelConnectsStructuralMember> getConnectedBy();

} // IfcStructuralMember
