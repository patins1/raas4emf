/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcCoveringImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Covering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCovering#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link IFC2X3.IfcCovering#getCoversSpaces <em>Covers Spaces</em>}</li>
 *   <li>{@link IFC2X3.IfcCovering#getCovers <em>Covers</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCovering()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcCoveringImplAdapter.class)
public interface IfcCovering extends IfcBuildingElement {
	/**
	 * Returns the value of the '<em><b>Covers Spaces</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelCoversSpaces#getRelatedCoverings <em>Related Coverings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covers Spaces</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covers Spaces</em>' reference.
	 * @see #setCoversSpaces(IfcRelCoversSpaces)
	 * @see IFC2X3.IFC2X3Package#getIfcCovering_CoversSpaces()
	 * @see IFC2X3.IfcRelCoversSpaces#getRelatedCoverings
	 * @model opposite="RelatedCoverings" ordered="false"
	 * @generated
	 */
	IfcRelCoversSpaces getCoversSpaces();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCovering#getCoversSpaces <em>Covers Spaces</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Covers Spaces</em>' reference.
	 * @see #getCoversSpaces()
	 * @generated
	 */
	void setCoversSpaces(IfcRelCoversSpaces value);

	/**
	 * Returns the value of the '<em><b>Covers</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelCoversBldgElements#getRelatedCoverings <em>Related Coverings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covers</em>' reference.
	 * @see #setCovers(IfcRelCoversBldgElements)
	 * @see IFC2X3.IFC2X3Package#getIfcCovering_Covers()
	 * @see IFC2X3.IfcRelCoversBldgElements#getRelatedCoverings
	 * @model opposite="RelatedCoverings" ordered="false"
	 * @generated
	 */
	IfcRelCoversBldgElements getCovers();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCovering#getCovers <em>Covers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Covers</em>' reference.
	 * @see #getCovers()
	 * @generated
	 */
	void setCovers(IfcRelCoversBldgElements value);

	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcCoveringTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcCoveringTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #setPredefinedType(IfcCoveringTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcCovering_PredefinedType()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcCoveringTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCovering#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcCoveringTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcCoveringTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCovering#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcCoveringTypeEnum)
	 * @generated
	 */
	void unsetPredefinedType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCovering#getPredefinedType <em>Predefined Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Predefined Type</em>' attribute is set.
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcCoveringTypeEnum)
	 * @generated
	 */
	boolean isSetPredefinedType();

} // IfcCovering
