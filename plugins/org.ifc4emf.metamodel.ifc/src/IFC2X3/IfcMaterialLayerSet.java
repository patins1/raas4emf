/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcMaterialLayerSetImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Material Layer Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcMaterialLayerSet#getMaterialLayers <em>Material Layers</em>}</li>
 *   <li>{@link IFC2X3.IfcMaterialLayerSet#getLayerSetName <em>Layer Set Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcMaterialLayerSet()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcMaterialLayerSetImplAdapter.class)
public interface IfcMaterialLayerSet extends IfcMaterialSelect {
	/**
	 * Returns the value of the '<em><b>Material Layers</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcMaterialLayer}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcMaterialLayer#getToMaterialLayerSet <em>To Material Layer Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Layers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Layers</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcMaterialLayerSet_MaterialLayers()
	 * @see IFC2X3.IfcMaterialLayer#getToMaterialLayerSet
	 * @model opposite="ToMaterialLayerSet" required="true"
	 * @generated
	 */
	EList<IfcMaterialLayer> getMaterialLayers();

	/**
	 * Returns the value of the '<em><b>Layer Set Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer Set Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Set Name</em>' attribute.
	 * @see #isSetLayerSetName()
	 * @see #unsetLayerSetName()
	 * @see #setLayerSetName(String)
	 * @see IFC2X3.IFC2X3Package#getIfcMaterialLayerSet_LayerSetName()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getLayerSetName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcMaterialLayerSet#getLayerSetName <em>Layer Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer Set Name</em>' attribute.
	 * @see #isSetLayerSetName()
	 * @see #unsetLayerSetName()
	 * @see #getLayerSetName()
	 * @generated
	 */
	void setLayerSetName(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcMaterialLayerSet#getLayerSetName <em>Layer Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLayerSetName()
	 * @see #getLayerSetName()
	 * @see #setLayerSetName(String)
	 * @generated
	 */
	void unsetLayerSetName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcMaterialLayerSet#getLayerSetName <em>Layer Set Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Layer Set Name</em>' attribute is set.
	 * @see #unsetLayerSetName()
	 * @see #getLayerSetName()
	 * @see #setLayerSetName(String)
	 * @generated
	 */
	boolean isSetLayerSetName();

} // IfcMaterialLayerSet
