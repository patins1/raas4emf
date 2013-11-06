/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcStructuralActionImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcStructuralAction#getDestabilizingLoad <em>Destabilizing Load</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralAction#getCausedBy <em>Caused By</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcStructuralAction()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcStructuralActionImplAdapter.class)
public interface IfcStructuralAction extends IfcStructuralActivity {
	/**
	 * Returns the value of the '<em><b>Caused By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcStructuralReaction#getCauses <em>Causes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caused By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caused By</em>' reference.
	 * @see #setCausedBy(IfcStructuralReaction)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralAction_CausedBy()
	 * @see IFC2X3.IfcStructuralReaction#getCauses
	 * @model opposite="Causes"
	 * @generated
	 */
	IfcStructuralReaction getCausedBy();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralAction#getCausedBy <em>Caused By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caused By</em>' reference.
	 * @see #getCausedBy()
	 * @generated
	 */
	void setCausedBy(IfcStructuralReaction value);

	/**
	 * Returns the value of the '<em><b>Destabilizing Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destabilizing Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destabilizing Load</em>' attribute.
	 * @see #isSetDestabilizingLoad()
	 * @see #unsetDestabilizingLoad()
	 * @see #setDestabilizingLoad(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralAction_DestabilizingLoad()
	 * @model unsettable="true" dataType="IFC2X3.BOOLEAN" required="true"
	 * @generated
	 */
	Boolean getDestabilizingLoad();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralAction#getDestabilizingLoad <em>Destabilizing Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destabilizing Load</em>' attribute.
	 * @see #isSetDestabilizingLoad()
	 * @see #unsetDestabilizingLoad()
	 * @see #getDestabilizingLoad()
	 * @generated
	 */
	void setDestabilizingLoad(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralAction#getDestabilizingLoad <em>Destabilizing Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDestabilizingLoad()
	 * @see #getDestabilizingLoad()
	 * @see #setDestabilizingLoad(Boolean)
	 * @generated
	 */
	void unsetDestabilizingLoad();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralAction#getDestabilizingLoad <em>Destabilizing Load</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Destabilizing Load</em>' attribute is set.
	 * @see #unsetDestabilizingLoad()
	 * @see #getDestabilizingLoad()
	 * @see #setDestabilizingLoad(Boolean)
	 * @generated
	 */
	boolean isSetDestabilizingLoad();

} // IfcStructuralAction
