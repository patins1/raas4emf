/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcRelDefinesImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Defines</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelDefines#getRelatedObjects <em>Related Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelDefines()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelDefinesImplAdapter.class)
public interface IfcRelDefines extends IfcRelationship {
	/**
	 * Returns the value of the '<em><b>Related Objects</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcObject}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcObject#getIsDefinedBy <em>Is Defined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Objects</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcRelDefines_RelatedObjects()
	 * @see IFC2X3.IfcObject#getIsDefinedBy
	 * @model opposite="IsDefinedBy" required="true" ordered="false"
	 * @generated
	 */
	EList<IfcObject> getRelatedObjects();

} // IfcRelDefines
