/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcPlanarExtentImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Planar Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPlanarExtent#getSizeInX <em>Size In X</em>}</li>
 *   <li>{@link IFC2X3.IfcPlanarExtent#getSizeInY <em>Size In Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPlanarExtent()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPlanarExtentImplAdapter.class)
public interface IfcPlanarExtent extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Size In Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size In Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size In Y</em>' attribute.
	 * @see #isSetSizeInY()
	 * @see #unsetSizeInY()
	 * @see #setSizeInY(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcPlanarExtent_SizeInY()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getSizeInY();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPlanarExtent#getSizeInY <em>Size In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size In Y</em>' attribute.
	 * @see #isSetSizeInY()
	 * @see #unsetSizeInY()
	 * @see #getSizeInY()
	 * @generated
	 */
	void setSizeInY(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPlanarExtent#getSizeInY <em>Size In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSizeInY()
	 * @see #getSizeInY()
	 * @see #setSizeInY(Double)
	 * @generated
	 */
	void unsetSizeInY();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPlanarExtent#getSizeInY <em>Size In Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size In Y</em>' attribute is set.
	 * @see #unsetSizeInY()
	 * @see #getSizeInY()
	 * @see #setSizeInY(Double)
	 * @generated
	 */
	boolean isSetSizeInY();

	/**
	 * Returns the value of the '<em><b>Size In X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size In X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size In X</em>' attribute.
	 * @see #isSetSizeInX()
	 * @see #unsetSizeInX()
	 * @see #setSizeInX(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcPlanarExtent_SizeInX()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getSizeInX();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPlanarExtent#getSizeInX <em>Size In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size In X</em>' attribute.
	 * @see #isSetSizeInX()
	 * @see #unsetSizeInX()
	 * @see #getSizeInX()
	 * @generated
	 */
	void setSizeInX(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPlanarExtent#getSizeInX <em>Size In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSizeInX()
	 * @see #getSizeInX()
	 * @see #setSizeInX(Double)
	 * @generated
	 */
	void unsetSizeInX();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPlanarExtent#getSizeInX <em>Size In X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size In X</em>' attribute is set.
	 * @see #unsetSizeInX()
	 * @see #getSizeInX()
	 * @see #setSizeInX(Double)
	 * @generated
	 */
	boolean isSetSizeInX();

} // IfcPlanarExtent
