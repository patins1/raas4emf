/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcFillAreaStyleImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Fill Area Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcFillAreaStyle#getFillStyles <em>Fill Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcFillAreaStyle()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcFillAreaStyleImplAdapter.class)
public interface IfcFillAreaStyle extends IfcPresentationStyle {
	/**
	 * Returns the value of the '<em><b>Fill Styles</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcFillStyleSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Styles</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcFillAreaStyle_FillStyles()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcFillStyleSelect> getFillStyles();

} // IfcFillAreaStyle
