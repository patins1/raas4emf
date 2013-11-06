/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcShellBasedSurfaceModelImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Shell Based Surface Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcShellBasedSurfaceModel#getSbsmBoundary <em>Sbsm Boundary</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcShellBasedSurfaceModel()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcShellBasedSurfaceModelImplAdapter.class)
public interface IfcShellBasedSurfaceModel extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Sbsm Boundary</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcShell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sbsm Boundary</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sbsm Boundary</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcShellBasedSurfaceModel_SbsmBoundary()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcShell> getSbsmBoundary();

} // IfcShellBasedSurfaceModel
