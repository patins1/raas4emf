/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcConnectedFaceSetImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Connected Face Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcConnectedFaceSet#getCfsFaces <em>Cfs Faces</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcConnectedFaceSet()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcConnectedFaceSetImplAdapter.class)
public interface IfcConnectedFaceSet extends IfcTopologicalRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Cfs Faces</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcFace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cfs Faces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cfs Faces</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcConnectedFaceSet_CfsFaces()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcFace> getCfsFaces();

} // IfcConnectedFaceSet
