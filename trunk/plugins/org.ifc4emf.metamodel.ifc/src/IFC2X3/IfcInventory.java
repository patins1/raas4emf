/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcInventoryImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Inventory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcInventory#getInventoryType <em>Inventory Type</em>}</li>
 *   <li>{@link IFC2X3.IfcInventory#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link IFC2X3.IfcInventory#getResponsiblePersons <em>Responsible Persons</em>}</li>
 *   <li>{@link IFC2X3.IfcInventory#getLastUpdateDate <em>Last Update Date</em>}</li>
 *   <li>{@link IFC2X3.IfcInventory#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link IFC2X3.IfcInventory#getOriginalValue <em>Original Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcInventory()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcInventoryImplAdapter.class)
public interface IfcInventory extends IfcGroup {
	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jurisdiction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' reference.
	 * @see #setJurisdiction(IfcActorSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcInventory_Jurisdiction()
	 * @model required="true"
	 * @generated
	 */
	IfcActorSelect getJurisdiction();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcInventory#getJurisdiction <em>Jurisdiction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jurisdiction</em>' reference.
	 * @see #getJurisdiction()
	 * @generated
	 */
	void setJurisdiction(IfcActorSelect value);

	/**
	 * Returns the value of the '<em><b>Last Update Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Update Date</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Update Date</em>' reference.
	 * @see #setLastUpdateDate(IfcCalendarDate)
	 * @see IFC2X3.IFC2X3Package#getIfcInventory_LastUpdateDate()
	 * @model required="true"
	 * @generated
	 */
	IfcCalendarDate getLastUpdateDate();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcInventory#getLastUpdateDate <em>Last Update Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Update Date</em>' reference.
	 * @see #getLastUpdateDate()
	 * @generated
	 */
	void setLastUpdateDate(IfcCalendarDate value);

	/**
	 * Returns the value of the '<em><b>Original Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Value</em>' reference.
	 * @see #setOriginalValue(IfcCostValue)
	 * @see IFC2X3.IFC2X3Package#getIfcInventory_OriginalValue()
	 * @model
	 * @generated
	 */
	IfcCostValue getOriginalValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcInventory#getOriginalValue <em>Original Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Value</em>' reference.
	 * @see #getOriginalValue()
	 * @generated
	 */
	void setOriginalValue(IfcCostValue value);

	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' reference.
	 * @see #setCurrentValue(IfcCostValue)
	 * @see IFC2X3.IFC2X3Package#getIfcInventory_CurrentValue()
	 * @model
	 * @generated
	 */
	IfcCostValue getCurrentValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcInventory#getCurrentValue <em>Current Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' reference.
	 * @see #getCurrentValue()
	 * @generated
	 */
	void setCurrentValue(IfcCostValue value);

	/**
	 * Returns the value of the '<em><b>Responsible Persons</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcPerson}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Persons</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcInventory_ResponsiblePersons()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcPerson> getResponsiblePersons();

	/**
	 * Returns the value of the '<em><b>Inventory Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcInventoryTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Type</em>' attribute.
	 * @see IFC2X3.IfcInventoryTypeEnum
	 * @see #isSetInventoryType()
	 * @see #unsetInventoryType()
	 * @see #setInventoryType(IfcInventoryTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcInventory_InventoryType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcInventoryTypeEnum getInventoryType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcInventory#getInventoryType <em>Inventory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Type</em>' attribute.
	 * @see IFC2X3.IfcInventoryTypeEnum
	 * @see #isSetInventoryType()
	 * @see #unsetInventoryType()
	 * @see #getInventoryType()
	 * @generated
	 */
	void setInventoryType(IfcInventoryTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcInventory#getInventoryType <em>Inventory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInventoryType()
	 * @see #getInventoryType()
	 * @see #setInventoryType(IfcInventoryTypeEnum)
	 * @generated
	 */
	void unsetInventoryType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcInventory#getInventoryType <em>Inventory Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inventory Type</em>' attribute is set.
	 * @see #unsetInventoryType()
	 * @see #getInventoryType()
	 * @see #setInventoryType(IfcInventoryTypeEnum)
	 * @generated
	 */
	boolean isSetInventoryType();

} // IfcInventory
