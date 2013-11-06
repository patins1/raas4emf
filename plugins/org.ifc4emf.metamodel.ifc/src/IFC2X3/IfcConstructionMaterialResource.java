/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcConstructionMaterialResourceImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Construction Material Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcConstructionMaterialResource#getSuppliers <em>Suppliers</em>}</li>
 *   <li>{@link IFC2X3.IfcConstructionMaterialResource#getUsageRatio <em>Usage Ratio</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcConstructionMaterialResource()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcConstructionMaterialResourceImplAdapter.class)
public interface IfcConstructionMaterialResource extends IfcConstructionResource {
	/**
	 * Returns the value of the '<em><b>Suppliers</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcActorSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suppliers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppliers</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcConstructionMaterialResource_Suppliers()
	 * @model ordered="false"
	 * @generated
	 */
	EList<IfcActorSelect> getSuppliers();

	/**
	 * Returns the value of the '<em><b>Usage Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Ratio</em>' attribute.
	 * @see #isSetUsageRatio()
	 * @see #unsetUsageRatio()
	 * @see #setUsageRatio(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcConstructionMaterialResource_UsageRatio()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getUsageRatio();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcConstructionMaterialResource#getUsageRatio <em>Usage Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Ratio</em>' attribute.
	 * @see #isSetUsageRatio()
	 * @see #unsetUsageRatio()
	 * @see #getUsageRatio()
	 * @generated
	 */
	void setUsageRatio(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcConstructionMaterialResource#getUsageRatio <em>Usage Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsageRatio()
	 * @see #getUsageRatio()
	 * @see #setUsageRatio(Double)
	 * @generated
	 */
	void unsetUsageRatio();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcConstructionMaterialResource#getUsageRatio <em>Usage Ratio</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usage Ratio</em>' attribute is set.
	 * @see #unsetUsageRatio()
	 * @see #getUsageRatio()
	 * @see #setUsageRatio(Double)
	 * @generated
	 */
	boolean isSetUsageRatio();

} // IfcConstructionMaterialResource
