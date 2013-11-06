/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcSimpleValueImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Simple Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSimpleValue#getIfcLogicalvalue <em>Ifc Logicalvalue</em>}</li>
 *   <li>{@link IFC2X3.IfcSimpleValue#getIfcLabelvalue <em>Ifc Labelvalue</em>}</li>
 *   <li>{@link IFC2X3.IfcSimpleValue#getIfcTextvalue <em>Ifc Textvalue</em>}</li>
 *   <li>{@link IFC2X3.IfcSimpleValue#getIfcIdentifiervalue <em>Ifc Identifiervalue</em>}</li>
 *   <li>{@link IFC2X3.IfcSimpleValue#getIfcBooleanvalue <em>Ifc Booleanvalue</em>}</li>
 *   <li>{@link IFC2X3.IfcSimpleValue#getIfcRealvalue <em>Ifc Realvalue</em>}</li>
 *   <li>{@link IFC2X3.IfcSimpleValue#getIfcIntegervalue <em>Ifc Integervalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSimpleValue()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcSimpleValueImplAdapter.class)
public interface IfcSimpleValue extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Ifc Logicalvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Logicalvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Logicalvalue</em>' attribute.
	 * @see #isSetIfcLogicalvalue()
	 * @see #unsetIfcLogicalvalue()
	 * @see #setIfcLogicalvalue(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcSimpleValue_IfcLogicalvalue()
	 * @model unsettable="true"
	 * @generated
	 */
	Boolean getIfcLogicalvalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSimpleValue#getIfcLogicalvalue <em>Ifc Logicalvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Logicalvalue</em>' attribute.
	 * @see #isSetIfcLogicalvalue()
	 * @see #unsetIfcLogicalvalue()
	 * @see #getIfcLogicalvalue()
	 * @generated
	 */
	void setIfcLogicalvalue(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSimpleValue#getIfcLogicalvalue <em>Ifc Logicalvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcLogicalvalue()
	 * @see #getIfcLogicalvalue()
	 * @see #setIfcLogicalvalue(Boolean)
	 * @generated
	 */
	void unsetIfcLogicalvalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSimpleValue#getIfcLogicalvalue <em>Ifc Logicalvalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Logicalvalue</em>' attribute is set.
	 * @see #unsetIfcLogicalvalue()
	 * @see #getIfcLogicalvalue()
	 * @see #setIfcLogicalvalue(Boolean)
	 * @generated
	 */
	boolean isSetIfcLogicalvalue();

	/**
	 * Returns the value of the '<em><b>Ifc Labelvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Labelvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Labelvalue</em>' attribute.
	 * @see #isSetIfcLabelvalue()
	 * @see #unsetIfcLabelvalue()
	 * @see #setIfcLabelvalue(String)
	 * @see IFC2X3.IFC2X3Package#getIfcSimpleValue_IfcLabelvalue()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getIfcLabelvalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSimpleValue#getIfcLabelvalue <em>Ifc Labelvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Labelvalue</em>' attribute.
	 * @see #isSetIfcLabelvalue()
	 * @see #unsetIfcLabelvalue()
	 * @see #getIfcLabelvalue()
	 * @generated
	 */
	void setIfcLabelvalue(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSimpleValue#getIfcLabelvalue <em>Ifc Labelvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcLabelvalue()
	 * @see #getIfcLabelvalue()
	 * @see #setIfcLabelvalue(String)
	 * @generated
	 */
	void unsetIfcLabelvalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSimpleValue#getIfcLabelvalue <em>Ifc Labelvalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Labelvalue</em>' attribute is set.
	 * @see #unsetIfcLabelvalue()
	 * @see #getIfcLabelvalue()
	 * @see #setIfcLabelvalue(String)
	 * @generated
	 */
	boolean isSetIfcLabelvalue();

	/**
	 * Returns the value of the '<em><b>Ifc Textvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Textvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Textvalue</em>' attribute.
	 * @see #isSetIfcTextvalue()
	 * @see #unsetIfcTextvalue()
	 * @see #setIfcTextvalue(String)
	 * @see IFC2X3.IFC2X3Package#getIfcSimpleValue_IfcTextvalue()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getIfcTextvalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSimpleValue#getIfcTextvalue <em>Ifc Textvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Textvalue</em>' attribute.
	 * @see #isSetIfcTextvalue()
	 * @see #unsetIfcTextvalue()
	 * @see #getIfcTextvalue()
	 * @generated
	 */
	void setIfcTextvalue(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSimpleValue#getIfcTextvalue <em>Ifc Textvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcTextvalue()
	 * @see #getIfcTextvalue()
	 * @see #setIfcTextvalue(String)
	 * @generated
	 */
	void unsetIfcTextvalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSimpleValue#getIfcTextvalue <em>Ifc Textvalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Textvalue</em>' attribute is set.
	 * @see #unsetIfcTextvalue()
	 * @see #getIfcTextvalue()
	 * @see #setIfcTextvalue(String)
	 * @generated
	 */
	boolean isSetIfcTextvalue();

	/**
	 * Returns the value of the '<em><b>Ifc Identifiervalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Identifiervalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Identifiervalue</em>' attribute.
	 * @see #isSetIfcIdentifiervalue()
	 * @see #unsetIfcIdentifiervalue()
	 * @see #setIfcIdentifiervalue(String)
	 * @see IFC2X3.IFC2X3Package#getIfcSimpleValue_IfcIdentifiervalue()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getIfcIdentifiervalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSimpleValue#getIfcIdentifiervalue <em>Ifc Identifiervalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Identifiervalue</em>' attribute.
	 * @see #isSetIfcIdentifiervalue()
	 * @see #unsetIfcIdentifiervalue()
	 * @see #getIfcIdentifiervalue()
	 * @generated
	 */
	void setIfcIdentifiervalue(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSimpleValue#getIfcIdentifiervalue <em>Ifc Identifiervalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcIdentifiervalue()
	 * @see #getIfcIdentifiervalue()
	 * @see #setIfcIdentifiervalue(String)
	 * @generated
	 */
	void unsetIfcIdentifiervalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSimpleValue#getIfcIdentifiervalue <em>Ifc Identifiervalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Identifiervalue</em>' attribute is set.
	 * @see #unsetIfcIdentifiervalue()
	 * @see #getIfcIdentifiervalue()
	 * @see #setIfcIdentifiervalue(String)
	 * @generated
	 */
	boolean isSetIfcIdentifiervalue();

	/**
	 * Returns the value of the '<em><b>Ifc Booleanvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Booleanvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Booleanvalue</em>' attribute.
	 * @see #isSetIfcBooleanvalue()
	 * @see #unsetIfcBooleanvalue()
	 * @see #setIfcBooleanvalue(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcSimpleValue_IfcBooleanvalue()
	 * @model unsettable="true" dataType="IFC2X3.BOOLEAN"
	 * @generated
	 */
	Boolean getIfcBooleanvalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSimpleValue#getIfcBooleanvalue <em>Ifc Booleanvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Booleanvalue</em>' attribute.
	 * @see #isSetIfcBooleanvalue()
	 * @see #unsetIfcBooleanvalue()
	 * @see #getIfcBooleanvalue()
	 * @generated
	 */
	void setIfcBooleanvalue(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSimpleValue#getIfcBooleanvalue <em>Ifc Booleanvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcBooleanvalue()
	 * @see #getIfcBooleanvalue()
	 * @see #setIfcBooleanvalue(Boolean)
	 * @generated
	 */
	void unsetIfcBooleanvalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSimpleValue#getIfcBooleanvalue <em>Ifc Booleanvalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Booleanvalue</em>' attribute is set.
	 * @see #unsetIfcBooleanvalue()
	 * @see #getIfcBooleanvalue()
	 * @see #setIfcBooleanvalue(Boolean)
	 * @generated
	 */
	boolean isSetIfcBooleanvalue();

	/**
	 * Returns the value of the '<em><b>Ifc Realvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Realvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Realvalue</em>' attribute.
	 * @see #isSetIfcRealvalue()
	 * @see #unsetIfcRealvalue()
	 * @see #setIfcRealvalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSimpleValue_IfcRealvalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcRealvalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSimpleValue#getIfcRealvalue <em>Ifc Realvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Realvalue</em>' attribute.
	 * @see #isSetIfcRealvalue()
	 * @see #unsetIfcRealvalue()
	 * @see #getIfcRealvalue()
	 * @generated
	 */
	void setIfcRealvalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSimpleValue#getIfcRealvalue <em>Ifc Realvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcRealvalue()
	 * @see #getIfcRealvalue()
	 * @see #setIfcRealvalue(Double)
	 * @generated
	 */
	void unsetIfcRealvalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSimpleValue#getIfcRealvalue <em>Ifc Realvalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Realvalue</em>' attribute is set.
	 * @see #unsetIfcRealvalue()
	 * @see #getIfcRealvalue()
	 * @see #setIfcRealvalue(Double)
	 * @generated
	 */
	boolean isSetIfcRealvalue();

	/**
	 * Returns the value of the '<em><b>Ifc Integervalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Integervalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Integervalue</em>' attribute.
	 * @see #isSetIfcIntegervalue()
	 * @see #unsetIfcIntegervalue()
	 * @see #setIfcIntegervalue(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcSimpleValue_IfcIntegervalue()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER"
	 * @generated
	 */
	Integer getIfcIntegervalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSimpleValue#getIfcIntegervalue <em>Ifc Integervalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Integervalue</em>' attribute.
	 * @see #isSetIfcIntegervalue()
	 * @see #unsetIfcIntegervalue()
	 * @see #getIfcIntegervalue()
	 * @generated
	 */
	void setIfcIntegervalue(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSimpleValue#getIfcIntegervalue <em>Ifc Integervalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcIntegervalue()
	 * @see #getIfcIntegervalue()
	 * @see #setIfcIntegervalue(Integer)
	 * @generated
	 */
	void unsetIfcIntegervalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSimpleValue#getIfcIntegervalue <em>Ifc Integervalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Integervalue</em>' attribute is set.
	 * @see #unsetIfcIntegervalue()
	 * @see #getIfcIntegervalue()
	 * @see #setIfcIntegervalue(Integer)
	 * @generated
	 */
	boolean isSetIfcIntegervalue();

} // IfcSimpleValue
