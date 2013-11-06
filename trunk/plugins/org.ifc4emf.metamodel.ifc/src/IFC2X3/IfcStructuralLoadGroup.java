/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcStructuralLoadGroupImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Load Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcStructuralLoadGroup#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadGroup#getActionType <em>Action Type</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadGroup#getActionSource <em>Action Source</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadGroup#getCoefficient <em>Coefficient</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadGroup#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadGroup#getSourceOfResultGroup <em>Source Of Result Group</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralLoadGroup#getLoadGroupFor <em>Load Group For</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadGroup()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcStructuralLoadGroupImplAdapter.class)
public interface IfcStructuralLoadGroup extends IfcGroup {
	/**
	 * Returns the value of the '<em><b>Source Of Result Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcStructuralResultGroup#getResultForLoadGroup <em>Result For Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Of Result Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Of Result Group</em>' reference.
	 * @see #setSourceOfResultGroup(IfcStructuralResultGroup)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadGroup_SourceOfResultGroup()
	 * @see IFC2X3.IfcStructuralResultGroup#getResultForLoadGroup
	 * @model opposite="ResultForLoadGroup" ordered="false"
	 * @generated
	 */
	IfcStructuralResultGroup getSourceOfResultGroup();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadGroup#getSourceOfResultGroup <em>Source Of Result Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Of Result Group</em>' reference.
	 * @see #getSourceOfResultGroup()
	 * @generated
	 */
	void setSourceOfResultGroup(IfcStructuralResultGroup value);

	/**
	 * Returns the value of the '<em><b>Load Group For</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcStructuralAnalysisModel}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcStructuralAnalysisModel#getLoadedBy <em>Loaded By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Group For</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Group For</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadGroup_LoadGroupFor()
	 * @see IFC2X3.IfcStructuralAnalysisModel#getLoadedBy
	 * @model opposite="LoadedBy" ordered="false"
	 * @generated
	 */
	EList<IfcStructuralAnalysisModel> getLoadGroupFor();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #isSetPurpose()
	 * @see #unsetPurpose()
	 * @see #setPurpose(String)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadGroup_Purpose()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadGroup#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #isSetPurpose()
	 * @see #unsetPurpose()
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadGroup#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPurpose()
	 * @see #getPurpose()
	 * @see #setPurpose(String)
	 * @generated
	 */
	void unsetPurpose();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadGroup#getPurpose <em>Purpose</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Purpose</em>' attribute is set.
	 * @see #unsetPurpose()
	 * @see #getPurpose()
	 * @see #setPurpose(String)
	 * @generated
	 */
	boolean isSetPurpose();

	/**
	 * Returns the value of the '<em><b>Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coefficient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coefficient</em>' attribute.
	 * @see #isSetCoefficient()
	 * @see #unsetCoefficient()
	 * @see #setCoefficient(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadGroup_Coefficient()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getCoefficient();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadGroup#getCoefficient <em>Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coefficient</em>' attribute.
	 * @see #isSetCoefficient()
	 * @see #unsetCoefficient()
	 * @see #getCoefficient()
	 * @generated
	 */
	void setCoefficient(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadGroup#getCoefficient <em>Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoefficient()
	 * @see #getCoefficient()
	 * @see #setCoefficient(Double)
	 * @generated
	 */
	void unsetCoefficient();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadGroup#getCoefficient <em>Coefficient</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Coefficient</em>' attribute is set.
	 * @see #unsetCoefficient()
	 * @see #getCoefficient()
	 * @see #setCoefficient(Double)
	 * @generated
	 */
	boolean isSetCoefficient();

	/**
	 * Returns the value of the '<em><b>Action Source</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcActionSourceTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Source</em>' attribute.
	 * @see IFC2X3.IfcActionSourceTypeEnum
	 * @see #isSetActionSource()
	 * @see #unsetActionSource()
	 * @see #setActionSource(IfcActionSourceTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadGroup_ActionSource()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcActionSourceTypeEnum getActionSource();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadGroup#getActionSource <em>Action Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Source</em>' attribute.
	 * @see IFC2X3.IfcActionSourceTypeEnum
	 * @see #isSetActionSource()
	 * @see #unsetActionSource()
	 * @see #getActionSource()
	 * @generated
	 */
	void setActionSource(IfcActionSourceTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadGroup#getActionSource <em>Action Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActionSource()
	 * @see #getActionSource()
	 * @see #setActionSource(IfcActionSourceTypeEnum)
	 * @generated
	 */
	void unsetActionSource();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadGroup#getActionSource <em>Action Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Action Source</em>' attribute is set.
	 * @see #unsetActionSource()
	 * @see #getActionSource()
	 * @see #setActionSource(IfcActionSourceTypeEnum)
	 * @generated
	 */
	boolean isSetActionSource();

	/**
	 * Returns the value of the '<em><b>Action Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcActionTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Type</em>' attribute.
	 * @see IFC2X3.IfcActionTypeEnum
	 * @see #isSetActionType()
	 * @see #unsetActionType()
	 * @see #setActionType(IfcActionTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadGroup_ActionType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcActionTypeEnum getActionType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadGroup#getActionType <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Type</em>' attribute.
	 * @see IFC2X3.IfcActionTypeEnum
	 * @see #isSetActionType()
	 * @see #unsetActionType()
	 * @see #getActionType()
	 * @generated
	 */
	void setActionType(IfcActionTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadGroup#getActionType <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActionType()
	 * @see #getActionType()
	 * @see #setActionType(IfcActionTypeEnum)
	 * @generated
	 */
	void unsetActionType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadGroup#getActionType <em>Action Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Action Type</em>' attribute is set.
	 * @see #unsetActionType()
	 * @see #getActionType()
	 * @see #setActionType(IfcActionTypeEnum)
	 * @generated
	 */
	boolean isSetActionType();

	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcLoadGroupTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcLoadGroupTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #setPredefinedType(IfcLoadGroupTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralLoadGroup_PredefinedType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcLoadGroupTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralLoadGroup#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcLoadGroupTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcLoadGroupTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralLoadGroup#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcLoadGroupTypeEnum)
	 * @generated
	 */
	void unsetPredefinedType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralLoadGroup#getPredefinedType <em>Predefined Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Predefined Type</em>' attribute is set.
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcLoadGroupTypeEnum)
	 * @generated
	 */
	boolean isSetPredefinedType();

} // IfcStructuralLoadGroup
