/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcMaterialLayerImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Material Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcMaterialLayer#getMaterial <em>Material</em>}</li>
 *   <li>{@link IFC2X3.IfcMaterialLayer#getLayerThickness <em>Layer Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcMaterialLayer#getIsVentilated <em>Is Ventilated</em>}</li>
 *   <li>{@link IFC2X3.IfcMaterialLayer#getToMaterialLayerSet <em>To Material Layer Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcMaterialLayer()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcMaterialLayerImplAdapter.class)
public interface IfcMaterialLayer extends IfcMaterialSelect, IfcObjectReferenceSelect {
	/**
	 * Returns the value of the '<em><b>To Material Layer Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcMaterialLayerSet#getMaterialLayers <em>Material Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Material Layer Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Material Layer Set</em>' reference.
	 * @see #setToMaterialLayerSet(IfcMaterialLayerSet)
	 * @see IFC2X3.IFC2X3Package#getIfcMaterialLayer_ToMaterialLayerSet()
	 * @see IFC2X3.IfcMaterialLayerSet#getMaterialLayers
	 * @model opposite="MaterialLayers" required="true"
	 * @generated
	 */
	IfcMaterialLayerSet getToMaterialLayerSet();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMaterialLayer#getToMaterialLayerSet <em>To Material Layer Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Material Layer Set</em>' reference.
	 * @see #getToMaterialLayerSet()
	 * @generated
	 */
	void setToMaterialLayerSet(IfcMaterialLayerSet value);

	/**
	 * Returns the value of the '<em><b>Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' reference.
	 * @see #setMaterial(IfcMaterial)
	 * @see IFC2X3.IFC2X3Package#getIfcMaterialLayer_Material()
	 * @model
	 * @generated
	 */
	IfcMaterial getMaterial();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMaterialLayer#getMaterial <em>Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(IfcMaterial value);

	/**
	 * Returns the value of the '<em><b>Is Ventilated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ventilated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ventilated</em>' attribute.
	 * @see #isSetIsVentilated()
	 * @see #unsetIsVentilated()
	 * @see #setIsVentilated(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcMaterialLayer_IsVentilated()
	 * @model unsettable="true"
	 * @generated
	 */
	Boolean getIsVentilated();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMaterialLayer#getIsVentilated <em>Is Ventilated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ventilated</em>' attribute.
	 * @see #isSetIsVentilated()
	 * @see #unsetIsVentilated()
	 * @see #getIsVentilated()
	 * @generated
	 */
	void setIsVentilated(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMaterialLayer#getIsVentilated <em>Is Ventilated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsVentilated()
	 * @see #getIsVentilated()
	 * @see #setIsVentilated(Boolean)
	 * @generated
	 */
	void unsetIsVentilated();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMaterialLayer#getIsVentilated <em>Is Ventilated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Ventilated</em>' attribute is set.
	 * @see #unsetIsVentilated()
	 * @see #getIsVentilated()
	 * @see #setIsVentilated(Boolean)
	 * @generated
	 */
	boolean isSetIsVentilated();

	/**
	 * Returns the value of the '<em><b>Layer Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Thickness</em>' attribute.
	 * @see #isSetLayerThickness()
	 * @see #unsetLayerThickness()
	 * @see #setLayerThickness(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcMaterialLayer_LayerThickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getLayerThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMaterialLayer#getLayerThickness <em>Layer Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer Thickness</em>' attribute.
	 * @see #isSetLayerThickness()
	 * @see #unsetLayerThickness()
	 * @see #getLayerThickness()
	 * @generated
	 */
	void setLayerThickness(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMaterialLayer#getLayerThickness <em>Layer Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLayerThickness()
	 * @see #getLayerThickness()
	 * @see #setLayerThickness(Double)
	 * @generated
	 */
	void unsetLayerThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMaterialLayer#getLayerThickness <em>Layer Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Layer Thickness</em>' attribute is set.
	 * @see #unsetLayerThickness()
	 * @see #getLayerThickness()
	 * @see #setLayerThickness(Double)
	 * @generated
	 */
	boolean isSetLayerThickness();

} // IfcMaterialLayer
