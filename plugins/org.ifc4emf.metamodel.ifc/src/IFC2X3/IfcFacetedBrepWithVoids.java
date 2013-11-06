/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcFacetedBrepWithVoidsImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Faceted Brep With Voids</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcFacetedBrepWithVoids#getVoids <em>Voids</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcFacetedBrepWithVoids()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcFacetedBrepWithVoidsImplAdapter.class)
public interface IfcFacetedBrepWithVoids extends IfcManifoldSolidBrep {
	/**
	 * Returns the value of the '<em><b>Voids</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcClosedShell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voids</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voids</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcFacetedBrepWithVoids_Voids()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcClosedShell> getVoids();

} // IfcFacetedBrepWithVoids
