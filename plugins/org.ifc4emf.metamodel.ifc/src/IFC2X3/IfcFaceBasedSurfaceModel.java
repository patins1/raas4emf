/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcFaceBasedSurfaceModelImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Face Based Surface Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcFaceBasedSurfaceModel#getFbsmFaces <em>Fbsm Faces</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcFaceBasedSurfaceModel()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcFaceBasedSurfaceModelImplAdapter.class)
public interface IfcFaceBasedSurfaceModel extends IfcSurfaceOrFaceSurface, IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Fbsm Faces</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcConnectedFaceSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fbsm Faces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fbsm Faces</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcFaceBasedSurfaceModel_FbsmFaces()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcConnectedFaceSet> getFbsmFaces();

} // IfcFaceBasedSurfaceModel
