/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcStructuralResultGroupImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Result Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcStructuralResultGroup#getTheoryType <em>Theory Type</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralResultGroup#getResultForLoadGroup <em>Result For Load Group</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralResultGroup#getIsLinear <em>Is Linear</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralResultGroup#getResultGroupFor <em>Result Group For</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcStructuralResultGroup()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcStructuralResultGroupImplAdapter.class)
public interface IfcStructuralResultGroup extends IfcGroup {
	/**
	 * Returns the value of the '<em><b>Result Group For</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcStructuralAnalysisModel#getHasResults <em>Has Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Group For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Group For</em>' reference.
	 * @see #setResultGroupFor(IfcStructuralAnalysisModel)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralResultGroup_ResultGroupFor()
	 * @see IFC2X3.IfcStructuralAnalysisModel#getHasResults
	 * @model opposite="HasResults" ordered="false"
	 * @generated
	 */
	IfcStructuralAnalysisModel getResultGroupFor();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralResultGroup#getResultGroupFor <em>Result Group For</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Group For</em>' reference.
	 * @see #getResultGroupFor()
	 * @generated
	 */
	void setResultGroupFor(IfcStructuralAnalysisModel value);

	/**
	 * Returns the value of the '<em><b>Result For Load Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcStructuralLoadGroup#getSourceOfResultGroup <em>Source Of Result Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result For Load Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result For Load Group</em>' reference.
	 * @see #setResultForLoadGroup(IfcStructuralLoadGroup)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralResultGroup_ResultForLoadGroup()
	 * @see IFC2X3.IfcStructuralLoadGroup#getSourceOfResultGroup
	 * @model opposite="SourceOfResultGroup"
	 * @generated
	 */
	IfcStructuralLoadGroup getResultForLoadGroup();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralResultGroup#getResultForLoadGroup <em>Result For Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result For Load Group</em>' reference.
	 * @see #getResultForLoadGroup()
	 * @generated
	 */
	void setResultForLoadGroup(IfcStructuralLoadGroup value);

	/**
	 * Returns the value of the '<em><b>Is Linear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Linear</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Linear</em>' attribute.
	 * @see #isSetIsLinear()
	 * @see #unsetIsLinear()
	 * @see #setIsLinear(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralResultGroup_IsLinear()
	 * @model unsettable="true" dataType="IFC2X3.BOOLEAN" required="true"
	 * @generated
	 */
	Boolean getIsLinear();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralResultGroup#getIsLinear <em>Is Linear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Linear</em>' attribute.
	 * @see #isSetIsLinear()
	 * @see #unsetIsLinear()
	 * @see #getIsLinear()
	 * @generated
	 */
	void setIsLinear(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralResultGroup#getIsLinear <em>Is Linear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsLinear()
	 * @see #getIsLinear()
	 * @see #setIsLinear(Boolean)
	 * @generated
	 */
	void unsetIsLinear();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralResultGroup#getIsLinear <em>Is Linear</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Linear</em>' attribute is set.
	 * @see #unsetIsLinear()
	 * @see #getIsLinear()
	 * @see #setIsLinear(Boolean)
	 * @generated
	 */
	boolean isSetIsLinear();

	/**
	 * Returns the value of the '<em><b>Theory Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcAnalysisTheoryTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Theory Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theory Type</em>' attribute.
	 * @see IFC2X3.IfcAnalysisTheoryTypeEnum
	 * @see #isSetTheoryType()
	 * @see #unsetTheoryType()
	 * @see #setTheoryType(IfcAnalysisTheoryTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralResultGroup_TheoryType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcAnalysisTheoryTypeEnum getTheoryType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralResultGroup#getTheoryType <em>Theory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theory Type</em>' attribute.
	 * @see IFC2X3.IfcAnalysisTheoryTypeEnum
	 * @see #isSetTheoryType()
	 * @see #unsetTheoryType()
	 * @see #getTheoryType()
	 * @generated
	 */
	void setTheoryType(IfcAnalysisTheoryTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralResultGroup#getTheoryType <em>Theory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTheoryType()
	 * @see #getTheoryType()
	 * @see #setTheoryType(IfcAnalysisTheoryTypeEnum)
	 * @generated
	 */
	void unsetTheoryType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralResultGroup#getTheoryType <em>Theory Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Theory Type</em>' attribute is set.
	 * @see #unsetTheoryType()
	 * @see #getTheoryType()
	 * @see #setTheoryType(IfcAnalysisTheoryTypeEnum)
	 * @generated
	 */
	boolean isSetTheoryType();

} // IfcStructuralResultGroup
