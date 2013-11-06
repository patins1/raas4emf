/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelSpaceBoundaryImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Space Boundary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelSpaceBoundary#getRelatingSpace <em>Relating Space</em>}</li>
 *   <li>{@link IFC2X3.IfcRelSpaceBoundary#getRelatedBuildingElement <em>Related Building Element</em>}</li>
 *   <li>{@link IFC2X3.IfcRelSpaceBoundary#getConnectionGeometry <em>Connection Geometry</em>}</li>
 *   <li>{@link IFC2X3.IfcRelSpaceBoundary#getPhysicalOrVirtualBoundary <em>Physical Or Virtual Boundary</em>}</li>
 *   <li>{@link IFC2X3.IfcRelSpaceBoundary#getInternalOrExternalBoundary <em>Internal Or External Boundary</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelSpaceBoundary()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelSpaceBoundaryImplAdapter.class)
public interface IfcRelSpaceBoundary extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Space</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcSpace#getBoundedBy <em>Bounded By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Space</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Space</em>' reference.
	 * @see #setRelatingSpace(IfcSpace)
	 * @see IFC2X3.IFC2X3Package#getIfcRelSpaceBoundary_RelatingSpace()
	 * @see IFC2X3.IfcSpace#getBoundedBy
	 * @model opposite="BoundedBy" required="true"
	 * @generated
	 */
	IfcSpace getRelatingSpace();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelSpaceBoundary#getRelatingSpace <em>Relating Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Space</em>' reference.
	 * @see #getRelatingSpace()
	 * @generated
	 */
	void setRelatingSpace(IfcSpace value);

	/**
	 * Returns the value of the '<em><b>Related Building Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcElement#getProvidesBoundaries <em>Provides Boundaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Building Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Building Element</em>' reference.
	 * @see #setRelatedBuildingElement(IfcElement)
	 * @see IFC2X3.IFC2X3Package#getIfcRelSpaceBoundary_RelatedBuildingElement()
	 * @see IFC2X3.IfcElement#getProvidesBoundaries
	 * @model opposite="ProvidesBoundaries"
	 * @generated
	 */
	IfcElement getRelatedBuildingElement();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelSpaceBoundary#getRelatedBuildingElement <em>Related Building Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Building Element</em>' reference.
	 * @see #getRelatedBuildingElement()
	 * @generated
	 */
	void setRelatedBuildingElement(IfcElement value);

	/**
	 * Returns the value of the '<em><b>Connection Geometry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Geometry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Geometry</em>' reference.
	 * @see #setConnectionGeometry(IfcConnectionGeometry)
	 * @see IFC2X3.IFC2X3Package#getIfcRelSpaceBoundary_ConnectionGeometry()
	 * @model
	 * @generated
	 */
	IfcConnectionGeometry getConnectionGeometry();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelSpaceBoundary#getConnectionGeometry <em>Connection Geometry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Geometry</em>' reference.
	 * @see #getConnectionGeometry()
	 * @generated
	 */
	void setConnectionGeometry(IfcConnectionGeometry value);

	/**
	 * Returns the value of the '<em><b>Internal Or External Boundary</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcInternalOrExternalEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Or External Boundary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Or External Boundary</em>' attribute.
	 * @see IFC2X3.IfcInternalOrExternalEnum
	 * @see #isSetInternalOrExternalBoundary()
	 * @see #unsetInternalOrExternalBoundary()
	 * @see #setInternalOrExternalBoundary(IfcInternalOrExternalEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcRelSpaceBoundary_InternalOrExternalBoundary()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcInternalOrExternalEnum getInternalOrExternalBoundary();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelSpaceBoundary#getInternalOrExternalBoundary <em>Internal Or External Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Or External Boundary</em>' attribute.
	 * @see IFC2X3.IfcInternalOrExternalEnum
	 * @see #isSetInternalOrExternalBoundary()
	 * @see #unsetInternalOrExternalBoundary()
	 * @see #getInternalOrExternalBoundary()
	 * @generated
	 */
	void setInternalOrExternalBoundary(IfcInternalOrExternalEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRelSpaceBoundary#getInternalOrExternalBoundary <em>Internal Or External Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInternalOrExternalBoundary()
	 * @see #getInternalOrExternalBoundary()
	 * @see #setInternalOrExternalBoundary(IfcInternalOrExternalEnum)
	 * @generated
	 */
	void unsetInternalOrExternalBoundary();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRelSpaceBoundary#getInternalOrExternalBoundary <em>Internal Or External Boundary</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Internal Or External Boundary</em>' attribute is set.
	 * @see #unsetInternalOrExternalBoundary()
	 * @see #getInternalOrExternalBoundary()
	 * @see #setInternalOrExternalBoundary(IfcInternalOrExternalEnum)
	 * @generated
	 */
	boolean isSetInternalOrExternalBoundary();

	/**
	 * Returns the value of the '<em><b>Physical Or Virtual Boundary</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcPhysicalOrVirtualEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Or Virtual Boundary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Or Virtual Boundary</em>' attribute.
	 * @see IFC2X3.IfcPhysicalOrVirtualEnum
	 * @see #isSetPhysicalOrVirtualBoundary()
	 * @see #unsetPhysicalOrVirtualBoundary()
	 * @see #setPhysicalOrVirtualBoundary(IfcPhysicalOrVirtualEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcRelSpaceBoundary_PhysicalOrVirtualBoundary()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcPhysicalOrVirtualEnum getPhysicalOrVirtualBoundary();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelSpaceBoundary#getPhysicalOrVirtualBoundary <em>Physical Or Virtual Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Or Virtual Boundary</em>' attribute.
	 * @see IFC2X3.IfcPhysicalOrVirtualEnum
	 * @see #isSetPhysicalOrVirtualBoundary()
	 * @see #unsetPhysicalOrVirtualBoundary()
	 * @see #getPhysicalOrVirtualBoundary()
	 * @generated
	 */
	void setPhysicalOrVirtualBoundary(IfcPhysicalOrVirtualEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRelSpaceBoundary#getPhysicalOrVirtualBoundary <em>Physical Or Virtual Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhysicalOrVirtualBoundary()
	 * @see #getPhysicalOrVirtualBoundary()
	 * @see #setPhysicalOrVirtualBoundary(IfcPhysicalOrVirtualEnum)
	 * @generated
	 */
	void unsetPhysicalOrVirtualBoundary();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRelSpaceBoundary#getPhysicalOrVirtualBoundary <em>Physical Or Virtual Boundary</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Physical Or Virtual Boundary</em>' attribute is set.
	 * @see #unsetPhysicalOrVirtualBoundary()
	 * @see #getPhysicalOrVirtualBoundary()
	 * @see #setPhysicalOrVirtualBoundary(IfcPhysicalOrVirtualEnum)
	 * @generated
	 */
	boolean isSetPhysicalOrVirtualBoundary();

} // IfcRelSpaceBoundary
