/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcSurfaceStyleImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Surface Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSurfaceStyle#getSide <em>Side</em>}</li>
 *   <li>{@link IFC2X3.IfcSurfaceStyle#getStyles <em>Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyle()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSurfaceStyleImplAdapter.class)
public interface IfcSurfaceStyle extends IfcPresentationStyle {
	/**
	 * Returns the value of the '<em><b>Styles</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcSurfaceStyleElementSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyle_Styles()
	 * @model required="true" upper="5" ordered="false"
	 * @generated
	 */
	EList<IfcSurfaceStyleElementSelect> getStyles();

	/**
	 * Returns the value of the '<em><b>Side</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcSurfaceSide}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side</em>' attribute.
	 * @see IFC2X3.IfcSurfaceSide
	 * @see #isSetSide()
	 * @see #unsetSide()
	 * @see #setSide(IfcSurfaceSide)
	 * @see IFC2X3.IFC2X3Package#getIfcSurfaceStyle_Side()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcSurfaceSide getSide();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSurfaceStyle#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side</em>' attribute.
	 * @see IFC2X3.IfcSurfaceSide
	 * @see #isSetSide()
	 * @see #unsetSide()
	 * @see #getSide()
	 * @generated
	 */
	void setSide(IfcSurfaceSide value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSurfaceStyle#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSide()
	 * @see #getSide()
	 * @see #setSide(IfcSurfaceSide)
	 * @generated
	 */
	void unsetSide();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSurfaceStyle#getSide <em>Side</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Side</em>' attribute is set.
	 * @see #unsetSide()
	 * @see #getSide()
	 * @see #setSide(IfcSurfaceSide)
	 * @generated
	 */
	boolean isSetSide();

} // IfcSurfaceStyle
