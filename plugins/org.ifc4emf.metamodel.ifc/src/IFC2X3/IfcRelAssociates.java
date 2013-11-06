/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcRelAssociatesImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Associates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelAssociates#getRelatedObjects <em>Related Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelAssociates()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelAssociatesImplAdapter.class)
public interface IfcRelAssociates extends IfcRelationship {
	/**
	 * Returns the value of the '<em><b>Related Objects</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRoot}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRoot#getHasAssociations <em>Has Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Objects</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcRelAssociates_RelatedObjects()
	 * @see IFC2X3.IfcRoot#getHasAssociations
	 * @model opposite="HasAssociations" required="true" ordered="false"
	 * @generated
	 */
	EList<IfcRoot> getRelatedObjects();

} // IfcRelAssociates
