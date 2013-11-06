/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcFurnitureTypeImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Furniture Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcFurnitureType#getAssemblyPlace <em>Assembly Place</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcFurnitureType()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcFurnitureTypeImplAdapter.class)
public interface IfcFurnitureType extends IfcFurnishingElementType {
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
	 * @see IFC2X3.IFC2X3Package#getIfcFurnitureType_AssemblyPlace()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcAssemblyPlaceEnum getAssemblyPlace();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFurnitureType#getAssemblyPlace <em>Assembly Place</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcFurnitureType#getAssemblyPlace <em>Assembly Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAssemblyPlace()
	 * @see #getAssemblyPlace()
	 * @see #setAssemblyPlace(IfcAssemblyPlaceEnum)
	 * @generated
	 */
	void unsetAssemblyPlace();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcFurnitureType#getAssemblyPlace <em>Assembly Place</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Assembly Place</em>' attribute is set.
	 * @see #unsetAssemblyPlace()
	 * @see #getAssemblyPlace()
	 * @see #setAssemblyPlace(IfcAssemblyPlaceEnum)
	 * @generated
	 */
	boolean isSetAssemblyPlace();

} // IfcFurnitureType
