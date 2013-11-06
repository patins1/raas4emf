/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcHalfSpaceSolidImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Half Space Solid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcHalfSpaceSolid#getBaseSurface <em>Base Surface</em>}</li>
 *   <li>{@link IFC2X3.IfcHalfSpaceSolid#getAgreementFlag <em>Agreement Flag</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcHalfSpaceSolid()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcHalfSpaceSolidImplAdapter.class)
public interface IfcHalfSpaceSolid extends IfcBooleanOperand, IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Base Surface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Surface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Surface</em>' reference.
	 * @see #setBaseSurface(IfcSurface)
	 * @see IFC2X3.IFC2X3Package#getIfcHalfSpaceSolid_BaseSurface()
	 * @model required="true"
	 * @generated
	 */
	IfcSurface getBaseSurface();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcHalfSpaceSolid#getBaseSurface <em>Base Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Surface</em>' reference.
	 * @see #getBaseSurface()
	 * @generated
	 */
	void setBaseSurface(IfcSurface value);

	/**
	 * Returns the value of the '<em><b>Agreement Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Flag</em>' attribute.
	 * @see #isSetAgreementFlag()
	 * @see #unsetAgreementFlag()
	 * @see #setAgreementFlag(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcHalfSpaceSolid_AgreementFlag()
	 * @model unsettable="true" dataType="IFC2X3.BOOLEAN" required="true"
	 * @generated
	 */
	Boolean getAgreementFlag();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcHalfSpaceSolid#getAgreementFlag <em>Agreement Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Flag</em>' attribute.
	 * @see #isSetAgreementFlag()
	 * @see #unsetAgreementFlag()
	 * @see #getAgreementFlag()
	 * @generated
	 */
	void setAgreementFlag(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcHalfSpaceSolid#getAgreementFlag <em>Agreement Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAgreementFlag()
	 * @see #getAgreementFlag()
	 * @see #setAgreementFlag(Boolean)
	 * @generated
	 */
	void unsetAgreementFlag();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcHalfSpaceSolid#getAgreementFlag <em>Agreement Flag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Agreement Flag</em>' attribute is set.
	 * @see #unsetAgreementFlag()
	 * @see #getAgreementFlag()
	 * @see #setAgreementFlag(Boolean)
	 * @generated
	 */
	boolean isSetAgreementFlag();

} // IfcHalfSpaceSolid
