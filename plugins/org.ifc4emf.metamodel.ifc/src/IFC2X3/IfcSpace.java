/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcSpaceImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSpace#getInteriorOrExteriorSpace <em>Interior Or Exterior Space</em>}</li>
 *   <li>{@link IFC2X3.IfcSpace#getElevationWithFlooring <em>Elevation With Flooring</em>}</li>
 *   <li>{@link IFC2X3.IfcSpace#getHasCoverings <em>Has Coverings</em>}</li>
 *   <li>{@link IFC2X3.IfcSpace#getBoundedBy <em>Bounded By</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSpace()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSpaceImplAdapter.class)
public interface IfcSpace extends IfcSpatialStructureElement {
	/**
	 * Returns the value of the '<em><b>Has Coverings</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelCoversSpaces}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelCoversSpaces#getRelatedSpace <em>Related Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Coverings</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Coverings</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcSpace_HasCoverings()
	 * @see IFC2X3.IfcRelCoversSpaces#getRelatedSpace
	 * @model opposite="RelatedSpace" ordered="false"
	 * @generated
	 */
	EList<IfcRelCoversSpaces> getHasCoverings();

	/**
	 * Returns the value of the '<em><b>Bounded By</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelSpaceBoundary}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelSpaceBoundary#getRelatingSpace <em>Relating Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounded By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounded By</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcSpace_BoundedBy()
	 * @see IFC2X3.IfcRelSpaceBoundary#getRelatingSpace
	 * @model opposite="RelatingSpace" ordered="false"
	 * @generated
	 */
	EList<IfcRelSpaceBoundary> getBoundedBy();

	/**
	 * Returns the value of the '<em><b>Elevation With Flooring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevation With Flooring</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation With Flooring</em>' attribute.
	 * @see #isSetElevationWithFlooring()
	 * @see #unsetElevationWithFlooring()
	 * @see #setElevationWithFlooring(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSpace_ElevationWithFlooring()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getElevationWithFlooring();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSpace#getElevationWithFlooring <em>Elevation With Flooring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation With Flooring</em>' attribute.
	 * @see #isSetElevationWithFlooring()
	 * @see #unsetElevationWithFlooring()
	 * @see #getElevationWithFlooring()
	 * @generated
	 */
	void setElevationWithFlooring(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSpace#getElevationWithFlooring <em>Elevation With Flooring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElevationWithFlooring()
	 * @see #getElevationWithFlooring()
	 * @see #setElevationWithFlooring(Double)
	 * @generated
	 */
	void unsetElevationWithFlooring();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSpace#getElevationWithFlooring <em>Elevation With Flooring</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elevation With Flooring</em>' attribute is set.
	 * @see #unsetElevationWithFlooring()
	 * @see #getElevationWithFlooring()
	 * @see #setElevationWithFlooring(Double)
	 * @generated
	 */
	boolean isSetElevationWithFlooring();

	/**
	 * Returns the value of the '<em><b>Interior Or Exterior Space</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcInternalOrExternalEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interior Or Exterior Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interior Or Exterior Space</em>' attribute.
	 * @see IFC2X3.IfcInternalOrExternalEnum
	 * @see #isSetInteriorOrExteriorSpace()
	 * @see #unsetInteriorOrExteriorSpace()
	 * @see #setInteriorOrExteriorSpace(IfcInternalOrExternalEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcSpace_InteriorOrExteriorSpace()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcInternalOrExternalEnum getInteriorOrExteriorSpace();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSpace#getInteriorOrExteriorSpace <em>Interior Or Exterior Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interior Or Exterior Space</em>' attribute.
	 * @see IFC2X3.IfcInternalOrExternalEnum
	 * @see #isSetInteriorOrExteriorSpace()
	 * @see #unsetInteriorOrExteriorSpace()
	 * @see #getInteriorOrExteriorSpace()
	 * @generated
	 */
	void setInteriorOrExteriorSpace(IfcInternalOrExternalEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSpace#getInteriorOrExteriorSpace <em>Interior Or Exterior Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInteriorOrExteriorSpace()
	 * @see #getInteriorOrExteriorSpace()
	 * @see #setInteriorOrExteriorSpace(IfcInternalOrExternalEnum)
	 * @generated
	 */
	void unsetInteriorOrExteriorSpace();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSpace#getInteriorOrExteriorSpace <em>Interior Or Exterior Space</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interior Or Exterior Space</em>' attribute is set.
	 * @see #unsetInteriorOrExteriorSpace()
	 * @see #getInteriorOrExteriorSpace()
	 * @see #setInteriorOrExteriorSpace(IfcInternalOrExternalEnum)
	 * @generated
	 */
	boolean isSetInteriorOrExteriorSpace();

} // IfcSpace
