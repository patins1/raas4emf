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

import IFC2X3.jaxb.IfcTrimmingSelectImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Trimming Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTrimmingSelect#getIfcParameterValuevalue <em>Ifc Parameter Valuevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcTrimmingSelect#getIfcCartesianPointvalue <em>Ifc Cartesian Pointvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTrimmingSelect()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcTrimmingSelectImplAdapter.class)
public interface IfcTrimmingSelect extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Ifc Parameter Valuevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Parameter Valuevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Parameter Valuevalue</em>' attribute.
	 * @see #isSetIfcParameterValuevalue()
	 * @see #unsetIfcParameterValuevalue()
	 * @see #setIfcParameterValuevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcTrimmingSelect_IfcParameterValuevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcParameterValuevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTrimmingSelect#getIfcParameterValuevalue <em>Ifc Parameter Valuevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Parameter Valuevalue</em>' attribute.
	 * @see #isSetIfcParameterValuevalue()
	 * @see #unsetIfcParameterValuevalue()
	 * @see #getIfcParameterValuevalue()
	 * @generated
	 */
	void setIfcParameterValuevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTrimmingSelect#getIfcParameterValuevalue <em>Ifc Parameter Valuevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcParameterValuevalue()
	 * @see #getIfcParameterValuevalue()
	 * @see #setIfcParameterValuevalue(Double)
	 * @generated
	 */
	void unsetIfcParameterValuevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTrimmingSelect#getIfcParameterValuevalue <em>Ifc Parameter Valuevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Parameter Valuevalue</em>' attribute is set.
	 * @see #unsetIfcParameterValuevalue()
	 * @see #getIfcParameterValuevalue()
	 * @see #setIfcParameterValuevalue(Double)
	 * @generated
	 */
	boolean isSetIfcParameterValuevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Cartesian Pointvalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Cartesian Pointvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Cartesian Pointvalue</em>' reference.
	 * @see #setIfcCartesianPointvalue(IfcCartesianPoint)
	 * @see IFC2X3.IFC2X3Package#getIfcTrimmingSelect_IfcCartesianPointvalue()
	 * @model
	 * @generated
	 */
	IfcCartesianPoint getIfcCartesianPointvalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTrimmingSelect#getIfcCartesianPointvalue <em>Ifc Cartesian Pointvalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Cartesian Pointvalue</em>' reference.
	 * @see #getIfcCartesianPointvalue()
	 * @generated
	 */
	void setIfcCartesianPointvalue(IfcCartesianPoint value);

} // IfcTrimmingSelect
