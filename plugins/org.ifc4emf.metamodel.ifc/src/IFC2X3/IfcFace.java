/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcFaceImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Face</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcFace#getBounds <em>Bounds</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcFace()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcFaceImplAdapter.class)
public interface IfcFace extends IfcTopologicalRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcFaceBound}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcFace_Bounds()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcFaceBound> getBounds();

} // IfcFace
