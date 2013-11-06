/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcMaterialListImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Material List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcMaterialList#getMaterials <em>Materials</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcMaterialList()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcMaterialListImplAdapter.class)
public interface IfcMaterialList extends IfcMaterialSelect, IfcObjectReferenceSelect {
	/**
	 * Returns the value of the '<em><b>Materials</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcMaterial}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Materials</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Materials</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcMaterialList_Materials()
	 * @model required="true"
	 * @generated
	 */
	EList<IfcMaterial> getMaterials();

} // IfcMaterialList
