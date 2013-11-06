/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcTypeProductImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Type Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTypeProduct#getRepresentationMaps <em>Representation Maps</em>}</li>
 *   <li>{@link IFC2X3.IfcTypeProduct#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTypeProduct()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcTypeProductImplAdapter.class)
public interface IfcTypeProduct extends IfcTypeObject {
	/**
	 * Returns the value of the '<em><b>Representation Maps</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRepresentationMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation Maps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation Maps</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcTypeProduct_RepresentationMaps()
	 * @model
	 * @generated
	 */
	EList<IfcRepresentationMap> getRepresentationMaps();

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #isSetTag()
	 * @see #unsetTag()
	 * @see #setTag(String)
	 * @see IFC2X3.IFC2X3Package#getIfcTypeProduct_Tag()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTypeProduct#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #isSetTag()
	 * @see #unsetTag()
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTypeProduct#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTag()
	 * @see #getTag()
	 * @see #setTag(String)
	 * @generated
	 */
	void unsetTag();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTypeProduct#getTag <em>Tag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tag</em>' attribute is set.
	 * @see #unsetTag()
	 * @see #getTag()
	 * @see #setTag(String)
	 * @generated
	 */
	boolean isSetTag();

} // IfcTypeProduct
