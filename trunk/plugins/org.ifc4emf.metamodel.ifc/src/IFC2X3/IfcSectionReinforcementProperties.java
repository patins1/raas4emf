/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcSectionReinforcementPropertiesImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Section Reinforcement Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSectionReinforcementProperties#getLongitudinalStartPosition <em>Longitudinal Start Position</em>}</li>
 *   <li>{@link IFC2X3.IfcSectionReinforcementProperties#getLongitudinalEndPosition <em>Longitudinal End Position</em>}</li>
 *   <li>{@link IFC2X3.IfcSectionReinforcementProperties#getTransversePosition <em>Transverse Position</em>}</li>
 *   <li>{@link IFC2X3.IfcSectionReinforcementProperties#getReinforcementRole <em>Reinforcement Role</em>}</li>
 *   <li>{@link IFC2X3.IfcSectionReinforcementProperties#getSectionDefinition <em>Section Definition</em>}</li>
 *   <li>{@link IFC2X3.IfcSectionReinforcementProperties#getCrossSectionReinforcementDefinitions <em>Cross Section Reinforcement Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSectionReinforcementProperties()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcSectionReinforcementPropertiesImplAdapter.class)
public interface IfcSectionReinforcementProperties extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Section Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Definition</em>' reference.
	 * @see #setSectionDefinition(IfcSectionProperties)
	 * @see IFC2X3.IFC2X3Package#getIfcSectionReinforcementProperties_SectionDefinition()
	 * @model required="true"
	 * @generated
	 */
	IfcSectionProperties getSectionDefinition();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSectionReinforcementProperties#getSectionDefinition <em>Section Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Definition</em>' reference.
	 * @see #getSectionDefinition()
	 * @generated
	 */
	void setSectionDefinition(IfcSectionProperties value);

	/**
	 * Returns the value of the '<em><b>Cross Section Reinforcement Definitions</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcReinforcementBarProperties}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cross Section Reinforcement Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Section Reinforcement Definitions</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcSectionReinforcementProperties_CrossSectionReinforcementDefinitions()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcReinforcementBarProperties> getCrossSectionReinforcementDefinitions();

	/**
	 * Returns the value of the '<em><b>Reinforcement Role</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcReinforcingBarRoleEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reinforcement Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reinforcement Role</em>' attribute.
	 * @see IFC2X3.IfcReinforcingBarRoleEnum
	 * @see #isSetReinforcementRole()
	 * @see #unsetReinforcementRole()
	 * @see #setReinforcementRole(IfcReinforcingBarRoleEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcSectionReinforcementProperties_ReinforcementRole()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcReinforcingBarRoleEnum getReinforcementRole();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSectionReinforcementProperties#getReinforcementRole <em>Reinforcement Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reinforcement Role</em>' attribute.
	 * @see IFC2X3.IfcReinforcingBarRoleEnum
	 * @see #isSetReinforcementRole()
	 * @see #unsetReinforcementRole()
	 * @see #getReinforcementRole()
	 * @generated
	 */
	void setReinforcementRole(IfcReinforcingBarRoleEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSectionReinforcementProperties#getReinforcementRole <em>Reinforcement Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReinforcementRole()
	 * @see #getReinforcementRole()
	 * @see #setReinforcementRole(IfcReinforcingBarRoleEnum)
	 * @generated
	 */
	void unsetReinforcementRole();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSectionReinforcementProperties#getReinforcementRole <em>Reinforcement Role</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reinforcement Role</em>' attribute is set.
	 * @see #unsetReinforcementRole()
	 * @see #getReinforcementRole()
	 * @see #setReinforcementRole(IfcReinforcingBarRoleEnum)
	 * @generated
	 */
	boolean isSetReinforcementRole();

	/**
	 * Returns the value of the '<em><b>Transverse Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transverse Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transverse Position</em>' attribute.
	 * @see #isSetTransversePosition()
	 * @see #unsetTransversePosition()
	 * @see #setTransversePosition(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSectionReinforcementProperties_TransversePosition()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getTransversePosition();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSectionReinforcementProperties#getTransversePosition <em>Transverse Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transverse Position</em>' attribute.
	 * @see #isSetTransversePosition()
	 * @see #unsetTransversePosition()
	 * @see #getTransversePosition()
	 * @generated
	 */
	void setTransversePosition(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSectionReinforcementProperties#getTransversePosition <em>Transverse Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransversePosition()
	 * @see #getTransversePosition()
	 * @see #setTransversePosition(Double)
	 * @generated
	 */
	void unsetTransversePosition();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSectionReinforcementProperties#getTransversePosition <em>Transverse Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transverse Position</em>' attribute is set.
	 * @see #unsetTransversePosition()
	 * @see #getTransversePosition()
	 * @see #setTransversePosition(Double)
	 * @generated
	 */
	boolean isSetTransversePosition();

	/**
	 * Returns the value of the '<em><b>Longitudinal End Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitudinal End Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitudinal End Position</em>' attribute.
	 * @see #isSetLongitudinalEndPosition()
	 * @see #unsetLongitudinalEndPosition()
	 * @see #setLongitudinalEndPosition(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSectionReinforcementProperties_LongitudinalEndPosition()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getLongitudinalEndPosition();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSectionReinforcementProperties#getLongitudinalEndPosition <em>Longitudinal End Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitudinal End Position</em>' attribute.
	 * @see #isSetLongitudinalEndPosition()
	 * @see #unsetLongitudinalEndPosition()
	 * @see #getLongitudinalEndPosition()
	 * @generated
	 */
	void setLongitudinalEndPosition(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSectionReinforcementProperties#getLongitudinalEndPosition <em>Longitudinal End Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLongitudinalEndPosition()
	 * @see #getLongitudinalEndPosition()
	 * @see #setLongitudinalEndPosition(Double)
	 * @generated
	 */
	void unsetLongitudinalEndPosition();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSectionReinforcementProperties#getLongitudinalEndPosition <em>Longitudinal End Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Longitudinal End Position</em>' attribute is set.
	 * @see #unsetLongitudinalEndPosition()
	 * @see #getLongitudinalEndPosition()
	 * @see #setLongitudinalEndPosition(Double)
	 * @generated
	 */
	boolean isSetLongitudinalEndPosition();

	/**
	 * Returns the value of the '<em><b>Longitudinal Start Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitudinal Start Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitudinal Start Position</em>' attribute.
	 * @see #isSetLongitudinalStartPosition()
	 * @see #unsetLongitudinalStartPosition()
	 * @see #setLongitudinalStartPosition(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSectionReinforcementProperties_LongitudinalStartPosition()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getLongitudinalStartPosition();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSectionReinforcementProperties#getLongitudinalStartPosition <em>Longitudinal Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitudinal Start Position</em>' attribute.
	 * @see #isSetLongitudinalStartPosition()
	 * @see #unsetLongitudinalStartPosition()
	 * @see #getLongitudinalStartPosition()
	 * @generated
	 */
	void setLongitudinalStartPosition(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSectionReinforcementProperties#getLongitudinalStartPosition <em>Longitudinal Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLongitudinalStartPosition()
	 * @see #getLongitudinalStartPosition()
	 * @see #setLongitudinalStartPosition(Double)
	 * @generated
	 */
	void unsetLongitudinalStartPosition();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSectionReinforcementProperties#getLongitudinalStartPosition <em>Longitudinal Start Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Longitudinal Start Position</em>' attribute is set.
	 * @see #unsetLongitudinalStartPosition()
	 * @see #getLongitudinalStartPosition()
	 * @see #setLongitudinalStartPosition(Double)
	 * @generated
	 */
	boolean isSetLongitudinalStartPosition();

} // IfcSectionReinforcementProperties
