/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcFillAreaStyleTileSymbolWithStyleImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Fill Area Style Tile Symbol With Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcFillAreaStyleTileSymbolWithStyle#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcFillAreaStyleTileSymbolWithStyle()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcFillAreaStyleTileSymbolWithStyleImplAdapter.class)
public interface IfcFillAreaStyleTileSymbolWithStyle extends IfcFillAreaStyleTileShapeSelect, IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' reference.
	 * @see #setSymbol(IfcAnnotationSymbolOccurrence)
	 * @see IFC2X3.IFC2X3Package#getIfcFillAreaStyleTileSymbolWithStyle_Symbol()
	 * @model required="true"
	 * @generated
	 */
	IfcAnnotationSymbolOccurrence getSymbol();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcFillAreaStyleTileSymbolWithStyle#getSymbol <em>Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' reference.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(IfcAnnotationSymbolOccurrence value);

} // IfcFillAreaStyleTileSymbolWithStyle
