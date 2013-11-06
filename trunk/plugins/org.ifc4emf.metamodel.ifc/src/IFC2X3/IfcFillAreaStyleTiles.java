/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcFillAreaStyleTilesImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Fill Area Style Tiles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcFillAreaStyleTiles#getTilingPattern <em>Tiling Pattern</em>}</li>
 *   <li>{@link IFC2X3.IfcFillAreaStyleTiles#getTiles <em>Tiles</em>}</li>
 *   <li>{@link IFC2X3.IfcFillAreaStyleTiles#getTilingScale <em>Tiling Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcFillAreaStyleTiles()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcFillAreaStyleTilesImplAdapter.class)
public interface IfcFillAreaStyleTiles extends IfcFillStyleSelect, IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Tiles</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcFillAreaStyleTileShapeSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiles</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcFillAreaStyleTiles_Tiles()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcFillAreaStyleTileShapeSelect> getTiles();

	/**
	 * Returns the value of the '<em><b>Tiling Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiling Pattern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiling Pattern</em>' reference.
	 * @see #setTilingPattern(IfcOneDirectionRepeatFactor)
	 * @see IFC2X3.IFC2X3Package#getIfcFillAreaStyleTiles_TilingPattern()
	 * @model required="true"
	 * @generated
	 */
	IfcOneDirectionRepeatFactor getTilingPattern();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFillAreaStyleTiles#getTilingPattern <em>Tiling Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiling Pattern</em>' reference.
	 * @see #getTilingPattern()
	 * @generated
	 */
	void setTilingPattern(IfcOneDirectionRepeatFactor value);

	/**
	 * Returns the value of the '<em><b>Tiling Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiling Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiling Scale</em>' attribute.
	 * @see #isSetTilingScale()
	 * @see #unsetTilingScale()
	 * @see #setTilingScale(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcFillAreaStyleTiles_TilingScale()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getTilingScale();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFillAreaStyleTiles#getTilingScale <em>Tiling Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiling Scale</em>' attribute.
	 * @see #isSetTilingScale()
	 * @see #unsetTilingScale()
	 * @see #getTilingScale()
	 * @generated
	 */
	void setTilingScale(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcFillAreaStyleTiles#getTilingScale <em>Tiling Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTilingScale()
	 * @see #getTilingScale()
	 * @see #setTilingScale(Double)
	 * @generated
	 */
	void unsetTilingScale();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcFillAreaStyleTiles#getTilingScale <em>Tiling Scale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tiling Scale</em>' attribute is set.
	 * @see #unsetTilingScale()
	 * @see #getTilingScale()
	 * @see #setTilingScale(Double)
	 * @generated
	 */
	boolean isSetTilingScale();

} // IfcFillAreaStyleTiles
