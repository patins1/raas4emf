/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcSymbolStyleImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Symbol Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSymbolStyle#getStyleOfSymbol <em>Style Of Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSymbolStyle()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSymbolStyleImplAdapter.class)
public interface IfcSymbolStyle extends IfcPresentationStyle {
	/**
	 * Returns the value of the '<em><b>Style Of Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Of Symbol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Of Symbol</em>' reference.
	 * @see #setStyleOfSymbol(IfcSymbolStyleSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcSymbolStyle_StyleOfSymbol()
	 * @model required="true"
	 * @generated
	 */
	IfcSymbolStyleSelect getStyleOfSymbol();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSymbolStyle#getStyleOfSymbol <em>Style Of Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Of Symbol</em>' reference.
	 * @see #getStyleOfSymbol()
	 * @generated
	 */
	void setStyleOfSymbol(IfcSymbolStyleSelect value);

} // IfcSymbolStyle
