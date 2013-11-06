/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcGeometricRepresentationContextImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Geometric Representation Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcGeometricRepresentationContext#getCoordinateSpaceDimension <em>Coordinate Space Dimension</em>}</li>
 *   <li>{@link IFC2X3.IfcGeometricRepresentationContext#getPrecision <em>Precision</em>}</li>
 *   <li>{@link IFC2X3.IfcGeometricRepresentationContext#getWorldCoordinateSystem <em>World Coordinate System</em>}</li>
 *   <li>{@link IFC2X3.IfcGeometricRepresentationContext#getTrueNorth <em>True North</em>}</li>
 *   <li>{@link IFC2X3.IfcGeometricRepresentationContext#getHasSubContexts <em>Has Sub Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcGeometricRepresentationContext()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcGeometricRepresentationContextImplAdapter.class)
public interface IfcGeometricRepresentationContext extends IfcRepresentationContext {
	/**
	 * Returns the value of the '<em><b>Has Sub Contexts</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcGeometricRepresentationSubContext}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcGeometricRepresentationSubContext#getParentContext <em>Parent Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Sub Contexts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Sub Contexts</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcGeometricRepresentationContext_HasSubContexts()
	 * @see IFC2X3.IfcGeometricRepresentationSubContext#getParentContext
	 * @model opposite="ParentContext" ordered="false"
	 * @generated
	 */
	EList<IfcGeometricRepresentationSubContext> getHasSubContexts();

	/**
	 * Returns the value of the '<em><b>World Coordinate System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>World Coordinate System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>World Coordinate System</em>' reference.
	 * @see #setWorldCoordinateSystem(IfcAxis2Placement)
	 * @see IFC2X3.IFC2X3Package#getIfcGeometricRepresentationContext_WorldCoordinateSystem()
	 * @model required="true"
	 * @generated
	 */
	IfcAxis2Placement getWorldCoordinateSystem();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGeometricRepresentationContext#getWorldCoordinateSystem <em>World Coordinate System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>World Coordinate System</em>' reference.
	 * @see #getWorldCoordinateSystem()
	 * @generated
	 */
	void setWorldCoordinateSystem(IfcAxis2Placement value);

	/**
	 * Returns the value of the '<em><b>True North</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>True North</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True North</em>' reference.
	 * @see #setTrueNorth(IfcDirection)
	 * @see IFC2X3.IFC2X3Package#getIfcGeometricRepresentationContext_TrueNorth()
	 * @model
	 * @generated
	 */
	IfcDirection getTrueNorth();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGeometricRepresentationContext#getTrueNorth <em>True North</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True North</em>' reference.
	 * @see #getTrueNorth()
	 * @generated
	 */
	void setTrueNorth(IfcDirection value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #isSetPrecision()
	 * @see #unsetPrecision()
	 * @see #setPrecision(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcGeometricRepresentationContext_Precision()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getPrecision();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGeometricRepresentationContext#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #isSetPrecision()
	 * @see #unsetPrecision()
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcGeometricRepresentationContext#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecision()
	 * @see #getPrecision()
	 * @see #setPrecision(Double)
	 * @generated
	 */
	void unsetPrecision();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcGeometricRepresentationContext#getPrecision <em>Precision</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision</em>' attribute is set.
	 * @see #unsetPrecision()
	 * @see #getPrecision()
	 * @see #setPrecision(Double)
	 * @generated
	 */
	boolean isSetPrecision();

	/**
	 * Returns the value of the '<em><b>Coordinate Space Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinate Space Dimension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate Space Dimension</em>' attribute.
	 * @see #isSetCoordinateSpaceDimension()
	 * @see #unsetCoordinateSpaceDimension()
	 * @see #setCoordinateSpaceDimension(Integer)
	 * @see IFC2X3.IFC2X3Package#getIfcGeometricRepresentationContext_CoordinateSpaceDimension()
	 * @model unsettable="true" dataType="IFC2X3.INTEGER" required="true"
	 * @generated
	 */
	Integer getCoordinateSpaceDimension();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGeometricRepresentationContext#getCoordinateSpaceDimension <em>Coordinate Space Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate Space Dimension</em>' attribute.
	 * @see #isSetCoordinateSpaceDimension()
	 * @see #unsetCoordinateSpaceDimension()
	 * @see #getCoordinateSpaceDimension()
	 * @generated
	 */
	void setCoordinateSpaceDimension(Integer value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcGeometricRepresentationContext#getCoordinateSpaceDimension <em>Coordinate Space Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoordinateSpaceDimension()
	 * @see #getCoordinateSpaceDimension()
	 * @see #setCoordinateSpaceDimension(Integer)
	 * @generated
	 */
	void unsetCoordinateSpaceDimension();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcGeometricRepresentationContext#getCoordinateSpaceDimension <em>Coordinate Space Dimension</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Coordinate Space Dimension</em>' attribute is set.
	 * @see #unsetCoordinateSpaceDimension()
	 * @see #getCoordinateSpaceDimension()
	 * @see #setCoordinateSpaceDimension(Integer)
	 * @generated
	 */
	boolean isSetCoordinateSpaceDimension();

} // IfcGeometricRepresentationContext
