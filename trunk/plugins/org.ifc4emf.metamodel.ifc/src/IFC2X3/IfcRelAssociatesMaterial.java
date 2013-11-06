/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelAssociatesMaterialImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Associates Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelAssociatesMaterial#getRelatingMaterial <em>Relating Material</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelAssociatesMaterial()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelAssociatesMaterialImplAdapter.class)
public interface IfcRelAssociatesMaterial extends IfcRelAssociates {
	/**
	 * Returns the value of the '<em><b>Relating Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Material</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Material</em>' reference.
	 * @see #setRelatingMaterial(IfcMaterialSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcRelAssociatesMaterial_RelatingMaterial()
	 * @model required="true"
	 * @generated
	 */
	IfcMaterialSelect getRelatingMaterial();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelAssociatesMaterial#getRelatingMaterial <em>Relating Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Material</em>' reference.
	 * @see #getRelatingMaterial()
	 * @generated
	 */
	void setRelatingMaterial(IfcMaterialSelect value);

} // IfcRelAssociatesMaterial
