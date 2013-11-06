/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcPresentationLayerWithStyleImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Presentation Layer With Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcPresentationLayerWithStyle#getLayerOn <em>Layer On</em>}</li>
 *   <li>{@link IFC2X3.IfcPresentationLayerWithStyle#getLayerFrozen <em>Layer Frozen</em>}</li>
 *   <li>{@link IFC2X3.IfcPresentationLayerWithStyle#getLayerBlocked <em>Layer Blocked</em>}</li>
 *   <li>{@link IFC2X3.IfcPresentationLayerWithStyle#getLayerStyles <em>Layer Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcPresentationLayerWithStyle()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcPresentationLayerWithStyleImplAdapter.class)
public interface IfcPresentationLayerWithStyle extends IfcPresentationLayerAssignment {
	/**
	 * Returns the value of the '<em><b>Layer Styles</b></em>' containment reference list.
	 * The list contents are of type {@link IFC2X3.IfcPresentationStyleSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Styles</em>' containment reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcPresentationLayerWithStyle_LayerStyles()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<IfcPresentationStyleSelect> getLayerStyles();

	/**
	 * Returns the value of the '<em><b>Layer Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer Blocked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Blocked</em>' attribute.
	 * @see #isSetLayerBlocked()
	 * @see #unsetLayerBlocked()
	 * @see #setLayerBlocked(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcPresentationLayerWithStyle_LayerBlocked()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	Boolean getLayerBlocked();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPresentationLayerWithStyle#getLayerBlocked <em>Layer Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer Blocked</em>' attribute.
	 * @see #isSetLayerBlocked()
	 * @see #unsetLayerBlocked()
	 * @see #getLayerBlocked()
	 * @generated
	 */
	void setLayerBlocked(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPresentationLayerWithStyle#getLayerBlocked <em>Layer Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLayerBlocked()
	 * @see #getLayerBlocked()
	 * @see #setLayerBlocked(Boolean)
	 * @generated
	 */
	void unsetLayerBlocked();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPresentationLayerWithStyle#getLayerBlocked <em>Layer Blocked</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Layer Blocked</em>' attribute is set.
	 * @see #unsetLayerBlocked()
	 * @see #getLayerBlocked()
	 * @see #setLayerBlocked(Boolean)
	 * @generated
	 */
	boolean isSetLayerBlocked();

	/**
	 * Returns the value of the '<em><b>Layer Frozen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer Frozen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Frozen</em>' attribute.
	 * @see #isSetLayerFrozen()
	 * @see #unsetLayerFrozen()
	 * @see #setLayerFrozen(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcPresentationLayerWithStyle_LayerFrozen()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	Boolean getLayerFrozen();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPresentationLayerWithStyle#getLayerFrozen <em>Layer Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer Frozen</em>' attribute.
	 * @see #isSetLayerFrozen()
	 * @see #unsetLayerFrozen()
	 * @see #getLayerFrozen()
	 * @generated
	 */
	void setLayerFrozen(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPresentationLayerWithStyle#getLayerFrozen <em>Layer Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLayerFrozen()
	 * @see #getLayerFrozen()
	 * @see #setLayerFrozen(Boolean)
	 * @generated
	 */
	void unsetLayerFrozen();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPresentationLayerWithStyle#getLayerFrozen <em>Layer Frozen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Layer Frozen</em>' attribute is set.
	 * @see #unsetLayerFrozen()
	 * @see #getLayerFrozen()
	 * @see #setLayerFrozen(Boolean)
	 * @generated
	 */
	boolean isSetLayerFrozen();

	/**
	 * Returns the value of the '<em><b>Layer On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer On</em>' attribute.
	 * @see #isSetLayerOn()
	 * @see #unsetLayerOn()
	 * @see #setLayerOn(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcPresentationLayerWithStyle_LayerOn()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	Boolean getLayerOn();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcPresentationLayerWithStyle#getLayerOn <em>Layer On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer On</em>' attribute.
	 * @see #isSetLayerOn()
	 * @see #unsetLayerOn()
	 * @see #getLayerOn()
	 * @generated
	 */
	void setLayerOn(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcPresentationLayerWithStyle#getLayerOn <em>Layer On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLayerOn()
	 * @see #getLayerOn()
	 * @see #setLayerOn(Boolean)
	 * @generated
	 */
	void unsetLayerOn();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcPresentationLayerWithStyle#getLayerOn <em>Layer On</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Layer On</em>' attribute is set.
	 * @see #unsetLayerOn()
	 * @see #getLayerOn()
	 * @see #setLayerOn(Boolean)
	 * @generated
	 */
	boolean isSetLayerOn();

} // IfcPresentationLayerWithStyle
