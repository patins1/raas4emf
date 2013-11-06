/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelAssignsToProductImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Assigns To Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelAssignsToProduct#getRelatingProduct <em>Relating Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelAssignsToProduct()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelAssignsToProductImplAdapter.class)
public interface IfcRelAssignsToProduct extends IfcRelAssigns {
	/**
	 * Returns the value of the '<em><b>Relating Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcProduct#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Product</em>' reference.
	 * @see #setRelatingProduct(IfcProduct)
	 * @see IFC2X3.IFC2X3Package#getIfcRelAssignsToProduct_RelatingProduct()
	 * @see IFC2X3.IfcProduct#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 * @generated
	 */
	IfcProduct getRelatingProduct();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelAssignsToProduct#getRelatingProduct <em>Relating Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Product</em>' reference.
	 * @see #getRelatingProduct()
	 * @generated
	 */
	void setRelatingProduct(IfcProduct value);

} // IfcRelAssignsToProduct
