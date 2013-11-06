/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcOrientationSelectImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Orientation Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcOrientationSelect#getIfcPlaneAngleMeasurevalue <em>Ifc Plane Angle Measurevalue</em>}</li>
 *   <li>{@link IFC2X3.IfcOrientationSelect#getIfcDirectionvalue <em>Ifc Directionvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcOrientationSelect()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcOrientationSelectImplAdapter.class)
public interface IfcOrientationSelect extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Ifc Plane Angle Measurevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Plane Angle Measurevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Plane Angle Measurevalue</em>' attribute.
	 * @see #isSetIfcPlaneAngleMeasurevalue()
	 * @see #unsetIfcPlaneAngleMeasurevalue()
	 * @see #setIfcPlaneAngleMeasurevalue(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcOrientationSelect_IfcPlaneAngleMeasurevalue()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getIfcPlaneAngleMeasurevalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOrientationSelect#getIfcPlaneAngleMeasurevalue <em>Ifc Plane Angle Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Plane Angle Measurevalue</em>' attribute.
	 * @see #isSetIfcPlaneAngleMeasurevalue()
	 * @see #unsetIfcPlaneAngleMeasurevalue()
	 * @see #getIfcPlaneAngleMeasurevalue()
	 * @generated
	 */
	void setIfcPlaneAngleMeasurevalue(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcOrientationSelect#getIfcPlaneAngleMeasurevalue <em>Ifc Plane Angle Measurevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfcPlaneAngleMeasurevalue()
	 * @see #getIfcPlaneAngleMeasurevalue()
	 * @see #setIfcPlaneAngleMeasurevalue(Double)
	 * @generated
	 */
	void unsetIfcPlaneAngleMeasurevalue();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcOrientationSelect#getIfcPlaneAngleMeasurevalue <em>Ifc Plane Angle Measurevalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ifc Plane Angle Measurevalue</em>' attribute is set.
	 * @see #unsetIfcPlaneAngleMeasurevalue()
	 * @see #getIfcPlaneAngleMeasurevalue()
	 * @see #setIfcPlaneAngleMeasurevalue(Double)
	 * @generated
	 */
	boolean isSetIfcPlaneAngleMeasurevalue();

	/**
	 * Returns the value of the '<em><b>Ifc Directionvalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Directionvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Directionvalue</em>' reference.
	 * @see #setIfcDirectionvalue(IfcDirection)
	 * @see IFC2X3.IFC2X3Package#getIfcOrientationSelect_IfcDirectionvalue()
	 * @model
	 * @generated
	 */
	IfcDirection getIfcDirectionvalue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcOrientationSelect#getIfcDirectionvalue <em>Ifc Directionvalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Directionvalue</em>' reference.
	 * @see #getIfcDirectionvalue()
	 * @generated
	 */
	void setIfcDirectionvalue(IfcDirection value);

} // IfcOrientationSelect
