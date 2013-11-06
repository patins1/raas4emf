/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcDistributionPortImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Distribution Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcDistributionPort#getFlowDirection <em>Flow Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcDistributionPort()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcDistributionPortImplAdapter.class)
public interface IfcDistributionPort extends IfcPort {
	/**
	 * Returns the value of the '<em><b>Flow Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcFlowDirectionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Direction</em>' attribute.
	 * @see IFC2X3.IfcFlowDirectionEnum
	 * @see #isSetFlowDirection()
	 * @see #unsetFlowDirection()
	 * @see #setFlowDirection(IfcFlowDirectionEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcDistributionPort_FlowDirection()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcFlowDirectionEnum getFlowDirection();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDistributionPort#getFlowDirection <em>Flow Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Direction</em>' attribute.
	 * @see IFC2X3.IfcFlowDirectionEnum
	 * @see #isSetFlowDirection()
	 * @see #unsetFlowDirection()
	 * @see #getFlowDirection()
	 * @generated
	 */
	void setFlowDirection(IfcFlowDirectionEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDistributionPort#getFlowDirection <em>Flow Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlowDirection()
	 * @see #getFlowDirection()
	 * @see #setFlowDirection(IfcFlowDirectionEnum)
	 * @generated
	 */
	void unsetFlowDirection();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDistributionPort#getFlowDirection <em>Flow Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flow Direction</em>' attribute is set.
	 * @see #unsetFlowDirection()
	 * @see #getFlowDirection()
	 * @see #setFlowDirection(IfcFlowDirectionEnum)
	 * @generated
	 */
	boolean isSetFlowDirection();

} // IfcDistributionPort
