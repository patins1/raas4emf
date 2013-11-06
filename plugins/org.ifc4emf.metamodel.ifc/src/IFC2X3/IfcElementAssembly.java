/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcElementAssemblyImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Element Assembly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcElementAssembly#getAssemblyPlace <em>Assembly Place</em>}</li>
 *   <li>{@link IFC2X3.IfcElementAssembly#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcElementAssembly()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcElementAssemblyImplAdapter.class)
public interface IfcElementAssembly extends IfcElement {
	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcElementAssemblyTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcElementAssemblyTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #setPredefinedType(IfcElementAssemblyTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcElementAssembly_PredefinedType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcElementAssemblyTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcElementAssembly#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcElementAssemblyTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcElementAssemblyTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcElementAssembly#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcElementAssemblyTypeEnum)
	 * @generated
	 */
	void unsetPredefinedType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcElementAssembly#getPredefinedType <em>Predefined Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Predefined Type</em>' attribute is set.
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcElementAssemblyTypeEnum)
	 * @generated
	 */
	boolean isSetPredefinedType();

	/**
	 * Returns the value of the '<em><b>Assembly Place</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcAssemblyPlaceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Place</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Place</em>' attribute.
	 * @see IFC2X3.IfcAssemblyPlaceEnum
	 * @see #isSetAssemblyPlace()
	 * @see #unsetAssemblyPlace()
	 * @see #setAssemblyPlace(IfcAssemblyPlaceEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcElementAssembly_AssemblyPlace()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcAssemblyPlaceEnum getAssemblyPlace();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcElementAssembly#getAssemblyPlace <em>Assembly Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Place</em>' attribute.
	 * @see IFC2X3.IfcAssemblyPlaceEnum
	 * @see #isSetAssemblyPlace()
	 * @see #unsetAssemblyPlace()
	 * @see #getAssemblyPlace()
	 * @generated
	 */
	void setAssemblyPlace(IfcAssemblyPlaceEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcElementAssembly#getAssemblyPlace <em>Assembly Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAssemblyPlace()
	 * @see #getAssemblyPlace()
	 * @see #setAssemblyPlace(IfcAssemblyPlaceEnum)
	 * @generated
	 */
	void unsetAssemblyPlace();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcElementAssembly#getAssemblyPlace <em>Assembly Place</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Assembly Place</em>' attribute is set.
	 * @see #unsetAssemblyPlace()
	 * @see #getAssemblyPlace()
	 * @see #setAssemblyPlace(IfcAssemblyPlaceEnum)
	 * @generated
	 */
	boolean isSetAssemblyPlace();

} // IfcElementAssembly
