/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcGeneralProfilePropertiesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc General Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcGeneralProfileProperties#getPhysicalWeight <em>Physical Weight</em>}</li>
 *   <li>{@link IFC2X3.IfcGeneralProfileProperties#getPerimeter <em>Perimeter</em>}</li>
 *   <li>{@link IFC2X3.IfcGeneralProfileProperties#getMinimumPlateThickness <em>Minimum Plate Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcGeneralProfileProperties#getMaximumPlateThickness <em>Maximum Plate Thickness</em>}</li>
 *   <li>{@link IFC2X3.IfcGeneralProfileProperties#getCrossSectionArea <em>Cross Section Area</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcGeneralProfileProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcGeneralProfilePropertiesImplAdapter.class)
public interface IfcGeneralProfileProperties extends IfcProfileProperties {
	/**
	 * Returns the value of the '<em><b>Cross Section Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cross Section Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Section Area</em>' attribute.
	 * @see #isSetCrossSectionArea()
	 * @see #unsetCrossSectionArea()
	 * @see #setCrossSectionArea(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcGeneralProfileProperties_CrossSectionArea()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getCrossSectionArea();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGeneralProfileProperties#getCrossSectionArea <em>Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cross Section Area</em>' attribute.
	 * @see #isSetCrossSectionArea()
	 * @see #unsetCrossSectionArea()
	 * @see #getCrossSectionArea()
	 * @generated
	 */
	void setCrossSectionArea(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcGeneralProfileProperties#getCrossSectionArea <em>Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCrossSectionArea()
	 * @see #getCrossSectionArea()
	 * @see #setCrossSectionArea(Double)
	 * @generated
	 */
	void unsetCrossSectionArea();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcGeneralProfileProperties#getCrossSectionArea <em>Cross Section Area</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cross Section Area</em>' attribute is set.
	 * @see #unsetCrossSectionArea()
	 * @see #getCrossSectionArea()
	 * @see #setCrossSectionArea(Double)
	 * @generated
	 */
	boolean isSetCrossSectionArea();

	/**
	 * Returns the value of the '<em><b>Maximum Plate Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Plate Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Plate Thickness</em>' attribute.
	 * @see #isSetMaximumPlateThickness()
	 * @see #unsetMaximumPlateThickness()
	 * @see #setMaximumPlateThickness(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcGeneralProfileProperties_MaximumPlateThickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMaximumPlateThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGeneralProfileProperties#getMaximumPlateThickness <em>Maximum Plate Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Plate Thickness</em>' attribute.
	 * @see #isSetMaximumPlateThickness()
	 * @see #unsetMaximumPlateThickness()
	 * @see #getMaximumPlateThickness()
	 * @generated
	 */
	void setMaximumPlateThickness(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcGeneralProfileProperties#getMaximumPlateThickness <em>Maximum Plate Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumPlateThickness()
	 * @see #getMaximumPlateThickness()
	 * @see #setMaximumPlateThickness(Double)
	 * @generated
	 */
	void unsetMaximumPlateThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcGeneralProfileProperties#getMaximumPlateThickness <em>Maximum Plate Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Plate Thickness</em>' attribute is set.
	 * @see #unsetMaximumPlateThickness()
	 * @see #getMaximumPlateThickness()
	 * @see #setMaximumPlateThickness(Double)
	 * @generated
	 */
	boolean isSetMaximumPlateThickness();

	/**
	 * Returns the value of the '<em><b>Minimum Plate Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Plate Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Plate Thickness</em>' attribute.
	 * @see #isSetMinimumPlateThickness()
	 * @see #unsetMinimumPlateThickness()
	 * @see #setMinimumPlateThickness(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcGeneralProfileProperties_MinimumPlateThickness()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMinimumPlateThickness();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGeneralProfileProperties#getMinimumPlateThickness <em>Minimum Plate Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Plate Thickness</em>' attribute.
	 * @see #isSetMinimumPlateThickness()
	 * @see #unsetMinimumPlateThickness()
	 * @see #getMinimumPlateThickness()
	 * @generated
	 */
	void setMinimumPlateThickness(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcGeneralProfileProperties#getMinimumPlateThickness <em>Minimum Plate Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumPlateThickness()
	 * @see #getMinimumPlateThickness()
	 * @see #setMinimumPlateThickness(Double)
	 * @generated
	 */
	void unsetMinimumPlateThickness();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcGeneralProfileProperties#getMinimumPlateThickness <em>Minimum Plate Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Plate Thickness</em>' attribute is set.
	 * @see #unsetMinimumPlateThickness()
	 * @see #getMinimumPlateThickness()
	 * @see #setMinimumPlateThickness(Double)
	 * @generated
	 */
	boolean isSetMinimumPlateThickness();

	/**
	 * Returns the value of the '<em><b>Perimeter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perimeter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perimeter</em>' attribute.
	 * @see #isSetPerimeter()
	 * @see #unsetPerimeter()
	 * @see #setPerimeter(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcGeneralProfileProperties_Perimeter()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getPerimeter();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGeneralProfileProperties#getPerimeter <em>Perimeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perimeter</em>' attribute.
	 * @see #isSetPerimeter()
	 * @see #unsetPerimeter()
	 * @see #getPerimeter()
	 * @generated
	 */
	void setPerimeter(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcGeneralProfileProperties#getPerimeter <em>Perimeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPerimeter()
	 * @see #getPerimeter()
	 * @see #setPerimeter(Double)
	 * @generated
	 */
	void unsetPerimeter();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcGeneralProfileProperties#getPerimeter <em>Perimeter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Perimeter</em>' attribute is set.
	 * @see #unsetPerimeter()
	 * @see #getPerimeter()
	 * @see #setPerimeter(Double)
	 * @generated
	 */
	boolean isSetPerimeter();

	/**
	 * Returns the value of the '<em><b>Physical Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Weight</em>' attribute.
	 * @see #isSetPhysicalWeight()
	 * @see #unsetPhysicalWeight()
	 * @see #setPhysicalWeight(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcGeneralProfileProperties_PhysicalWeight()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getPhysicalWeight();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGeneralProfileProperties#getPhysicalWeight <em>Physical Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Weight</em>' attribute.
	 * @see #isSetPhysicalWeight()
	 * @see #unsetPhysicalWeight()
	 * @see #getPhysicalWeight()
	 * @generated
	 */
	void setPhysicalWeight(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcGeneralProfileProperties#getPhysicalWeight <em>Physical Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhysicalWeight()
	 * @see #getPhysicalWeight()
	 * @see #setPhysicalWeight(Double)
	 * @generated
	 */
	void unsetPhysicalWeight();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcGeneralProfileProperties#getPhysicalWeight <em>Physical Weight</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Physical Weight</em>' attribute is set.
	 * @see #unsetPhysicalWeight()
	 * @see #getPhysicalWeight()
	 * @see #setPhysicalWeight(Double)
	 * @generated
	 */
	boolean isSetPhysicalWeight();

} // IfcGeneralProfileProperties
