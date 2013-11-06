/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcMaterialLayerSetUsageImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Material Layer Set Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcMaterialLayerSetUsage#getForLayerSet <em>For Layer Set</em>}</li>
 *   <li>{@link IFC2X3.IfcMaterialLayerSetUsage#getLayerSetDirection <em>Layer Set Direction</em>}</li>
 *   <li>{@link IFC2X3.IfcMaterialLayerSetUsage#getDirectionSense <em>Direction Sense</em>}</li>
 *   <li>{@link IFC2X3.IfcMaterialLayerSetUsage#getOffsetFromReferenceLine <em>Offset From Reference Line</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcMaterialLayerSetUsage()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcMaterialLayerSetUsageImplAdapter.class)
public interface IfcMaterialLayerSetUsage extends IfcMaterialSelect {
	/**
	 * Returns the value of the '<em><b>For Layer Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Layer Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Layer Set</em>' reference.
	 * @see #setForLayerSet(IfcMaterialLayerSet)
	 * @see IFC2X3.IFC2X3Package#getIfcMaterialLayerSetUsage_ForLayerSet()
	 * @model required="true"
	 * @generated
	 */
	IfcMaterialLayerSet getForLayerSet();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMaterialLayerSetUsage#getForLayerSet <em>For Layer Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Layer Set</em>' reference.
	 * @see #getForLayerSet()
	 * @generated
	 */
	void setForLayerSet(IfcMaterialLayerSet value);

	/**
	 * Returns the value of the '<em><b>Offset From Reference Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset From Reference Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset From Reference Line</em>' attribute.
	 * @see #isSetOffsetFromReferenceLine()
	 * @see #unsetOffsetFromReferenceLine()
	 * @see #setOffsetFromReferenceLine(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMaterialLayerSetUsage_OffsetFromReferenceLine()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getOffsetFromReferenceLine();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMaterialLayerSetUsage#getOffsetFromReferenceLine <em>Offset From Reference Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset From Reference Line</em>' attribute.
	 * @see #isSetOffsetFromReferenceLine()
	 * @see #unsetOffsetFromReferenceLine()
	 * @see #getOffsetFromReferenceLine()
	 * @generated
	 */
	void setOffsetFromReferenceLine(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMaterialLayerSetUsage#getOffsetFromReferenceLine <em>Offset From Reference Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOffsetFromReferenceLine()
	 * @see #getOffsetFromReferenceLine()
	 * @see #setOffsetFromReferenceLine(Double)
	 * @generated
	 */
	void unsetOffsetFromReferenceLine();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMaterialLayerSetUsage#getOffsetFromReferenceLine <em>Offset From Reference Line</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Offset From Reference Line</em>' attribute is set.
	 * @see #unsetOffsetFromReferenceLine()
	 * @see #getOffsetFromReferenceLine()
	 * @see #setOffsetFromReferenceLine(Double)
	 * @generated
	 */
	boolean isSetOffsetFromReferenceLine();

	/**
	 * Returns the value of the '<em><b>Direction Sense</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcDirectionSenseEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Sense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Sense</em>' attribute.
	 * @see IFC2X3.IfcDirectionSenseEnum
	 * @see #isSetDirectionSense()
	 * @see #unsetDirectionSense()
	 * @see #setDirectionSense(IfcDirectionSenseEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcMaterialLayerSetUsage_DirectionSense()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcDirectionSenseEnum getDirectionSense();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMaterialLayerSetUsage#getDirectionSense <em>Direction Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Sense</em>' attribute.
	 * @see IFC2X3.IfcDirectionSenseEnum
	 * @see #isSetDirectionSense()
	 * @see #unsetDirectionSense()
	 * @see #getDirectionSense()
	 * @generated
	 */
	void setDirectionSense(IfcDirectionSenseEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMaterialLayerSetUsage#getDirectionSense <em>Direction Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirectionSense()
	 * @see #getDirectionSense()
	 * @see #setDirectionSense(IfcDirectionSenseEnum)
	 * @generated
	 */
	void unsetDirectionSense();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMaterialLayerSetUsage#getDirectionSense <em>Direction Sense</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction Sense</em>' attribute is set.
	 * @see #unsetDirectionSense()
	 * @see #getDirectionSense()
	 * @see #setDirectionSense(IfcDirectionSenseEnum)
	 * @generated
	 */
	boolean isSetDirectionSense();

	/**
	 * Returns the value of the '<em><b>Layer Set Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcLayerSetDirectionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer Set Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Set Direction</em>' attribute.
	 * @see IFC2X3.IfcLayerSetDirectionEnum
	 * @see #isSetLayerSetDirection()
	 * @see #unsetLayerSetDirection()
	 * @see #setLayerSetDirection(IfcLayerSetDirectionEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcMaterialLayerSetUsage_LayerSetDirection()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcLayerSetDirectionEnum getLayerSetDirection();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMaterialLayerSetUsage#getLayerSetDirection <em>Layer Set Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer Set Direction</em>' attribute.
	 * @see IFC2X3.IfcLayerSetDirectionEnum
	 * @see #isSetLayerSetDirection()
	 * @see #unsetLayerSetDirection()
	 * @see #getLayerSetDirection()
	 * @generated
	 */
	void setLayerSetDirection(IfcLayerSetDirectionEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMaterialLayerSetUsage#getLayerSetDirection <em>Layer Set Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLayerSetDirection()
	 * @see #getLayerSetDirection()
	 * @see #setLayerSetDirection(IfcLayerSetDirectionEnum)
	 * @generated
	 */
	void unsetLayerSetDirection();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMaterialLayerSetUsage#getLayerSetDirection <em>Layer Set Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Layer Set Direction</em>' attribute is set.
	 * @see #unsetLayerSetDirection()
	 * @see #getLayerSetDirection()
	 * @see #setLayerSetDirection(IfcLayerSetDirectionEnum)
	 * @generated
	 */
	boolean isSetLayerSetDirection();

} // IfcMaterialLayerSetUsage
