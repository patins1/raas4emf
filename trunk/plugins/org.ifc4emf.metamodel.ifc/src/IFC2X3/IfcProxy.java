/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcProxyImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcProxy#getProxyType <em>Proxy Type</em>}</li>
 *   <li>{@link IFC2X3.IfcProxy#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcProxy()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcProxyImplAdapter.class)
public interface IfcProxy extends IfcProduct {
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
	 * @see IFC2X3.IFC2X3Package#getIfcProxy_Tag()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcProxy#getTag <em>Tag</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcProxy#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTag()
	 * @see #getTag()
	 * @see #setTag(String)
	 * @generated
	 */
	void unsetTag();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcProxy#getTag <em>Tag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tag</em>' attribute is set.
	 * @see #unsetTag()
	 * @see #getTag()
	 * @see #setTag(String)
	 * @generated
	 */
	boolean isSetTag();

	/**
	 * Returns the value of the '<em><b>Proxy Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcObjectTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Type</em>' attribute.
	 * @see IFC2X3.IfcObjectTypeEnum
	 * @see #isSetProxyType()
	 * @see #unsetProxyType()
	 * @see #setProxyType(IfcObjectTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcProxy_ProxyType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcObjectTypeEnum getProxyType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcProxy#getProxyType <em>Proxy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Type</em>' attribute.
	 * @see IFC2X3.IfcObjectTypeEnum
	 * @see #isSetProxyType()
	 * @see #unsetProxyType()
	 * @see #getProxyType()
	 * @generated
	 */
	void setProxyType(IfcObjectTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcProxy#getProxyType <em>Proxy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProxyType()
	 * @see #getProxyType()
	 * @see #setProxyType(IfcObjectTypeEnum)
	 * @generated
	 */
	void unsetProxyType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcProxy#getProxyType <em>Proxy Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Proxy Type</em>' attribute is set.
	 * @see #unsetProxyType()
	 * @see #getProxyType()
	 * @see #setProxyType(IfcObjectTypeEnum)
	 * @generated
	 */
	boolean isSetProxyType();

} // IfcProxy
