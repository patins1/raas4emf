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

import IFC2X3.jaxb.IfcSpecularHighlightSelectImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Specular Highlight Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSpecularHighlightSelect#getIfcSpecularRoughnessvalue <em>Ifc Specular Roughnessvalue</em>}</li>
 *   <li>{@link IFC2X3.IfcSpecularHighlightSelect#getIfcSpecularExponentvalue <em>Ifc Specular Exponentvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSpecularHighlightSelect()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcSpecularHighlightSelectImplAdapter.class)
public interface IfcSpecularHighlightSelect extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Ifc Specular Roughnessvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Specular Roughnessvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Specular Roughnessvalue</em>' attribute.
	 * @see #isSetIfcSpecularRoughnessvalue()
	 * @see #unsetIfcSpecularRoughnessvalue()
	 * @see #setIfcSpecularRoughnessvalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSpecularHighlightSelect_IfcSpecularRoughnessvalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcSpecularRoughnessvalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSpecularHighlightSelect#getIfcSpecularRoughnessvalue <em>Ifc Specular Roughnessvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Specular Roughnessvalue</em>' attribute.
	 * @see #isSetIfcSpecularRoughnessvalue()
	 * @see #unsetIfcSpecularRoughnessvalue()
	 * @see #getIfcSpecularRoughnessvalue()
	 * @generated
	 */
	void setIfcSpecularRoughnessvalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSpecularHighlightSelect#getIfcSpecularRoughnessvalue <em>Ifc Specular Roughnessvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcSpecularRoughnessvalue()
	 * @see #getIfcSpecularRoughnessvalue()
	 * @see #setIfcSpecularRoughnessvalue(Double)
	 * @generated
	 */
	void unsetIfcSpecularRoughnessvalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSpecularHighlightSelect#getIfcSpecularRoughnessvalue <em>Ifc Specular Roughnessvalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Specular Roughnessvalue</em>' attribute is set.
	 * @see #unsetIfcSpecularRoughnessvalue()
	 * @see #getIfcSpecularRoughnessvalue()
	 * @see #setIfcSpecularRoughnessvalue(Double)
	 * @generated
	 */
	boolean isSetIfcSpecularRoughnessvalue();

	/**
	 * Returns the value of the '<em><b>Ifc Specular Exponentvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Specular Exponentvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Specular Exponentvalue</em>' attribute.
	 * @see #isSetIfcSpecularExponentvalue()
	 * @see #unsetIfcSpecularExponentvalue()
	 * @see #setIfcSpecularExponentvalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSpecularHighlightSelect_IfcSpecularExponentvalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcSpecularExponentvalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSpecularHighlightSelect#getIfcSpecularExponentvalue <em>Ifc Specular Exponentvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Specular Exponentvalue</em>' attribute.
	 * @see #isSetIfcSpecularExponentvalue()
	 * @see #unsetIfcSpecularExponentvalue()
	 * @see #getIfcSpecularExponentvalue()
	 * @generated
	 */
	void setIfcSpecularExponentvalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSpecularHighlightSelect#getIfcSpecularExponentvalue <em>Ifc Specular Exponentvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcSpecularExponentvalue()
	 * @see #getIfcSpecularExponentvalue()
	 * @see #setIfcSpecularExponentvalue(Double)
	 * @generated
	 */
	void unsetIfcSpecularExponentvalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSpecularHighlightSelect#getIfcSpecularExponentvalue <em>Ifc Specular Exponentvalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Specular Exponentvalue</em>' attribute is set.
	 * @see #unsetIfcSpecularExponentvalue()
	 * @see #getIfcSpecularExponentvalue()
	 * @see #setIfcSpecularExponentvalue(Double)
	 * @generated
	 */
	boolean isSetIfcSpecularExponentvalue();

} // IfcSpecularHighlightSelect
