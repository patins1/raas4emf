/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcStructuralAnalysisModelImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Analysis Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcStructuralAnalysisModel#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralAnalysisModel#getOrientationOf2DPlane <em>Orientation Of2 DPlane</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralAnalysisModel#getLoadedBy <em>Loaded By</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralAnalysisModel#getHasResults <em>Has Results</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcStructuralAnalysisModel()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcStructuralAnalysisModelImplAdapter.class)
public interface IfcStructuralAnalysisModel extends IfcSystem {
	/**
	 * Returns the value of the '<em><b>Loaded By</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcStructuralLoadGroup}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcStructuralLoadGroup#getLoadGroupFor <em>Load Group For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loaded By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loaded By</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralAnalysisModel_LoadedBy()
	 * @see IFC2X3.IfcStructuralLoadGroup#getLoadGroupFor
	 * @model opposite="LoadGroupFor" ordered="false"
	 * @generated
	 */
	EList<IfcStructuralLoadGroup> getLoadedBy();

	/**
	 * Returns the value of the '<em><b>Has Results</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcStructuralResultGroup}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcStructuralResultGroup#getResultGroupFor <em>Result Group For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Results</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Results</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralAnalysisModel_HasResults()
	 * @see IFC2X3.IfcStructuralResultGroup#getResultGroupFor
	 * @model opposite="ResultGroupFor" ordered="false"
	 * @generated
	 */
	EList<IfcStructuralResultGroup> getHasResults();

	/**
	 * Returns the value of the '<em><b>Orientation Of2 DPlane</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation Of2 DPlane</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation Of2 DPlane</em>' reference.
	 * @see #setOrientationOf2DPlane(IfcAxis2Placement3D)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralAnalysisModel_OrientationOf2DPlane()
	 * @model
	 * @generated
	 */
	IfcAxis2Placement3D getOrientationOf2DPlane();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralAnalysisModel#getOrientationOf2DPlane <em>Orientation Of2 DPlane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation Of2 DPlane</em>' reference.
	 * @see #getOrientationOf2DPlane()
	 * @generated
	 */
	void setOrientationOf2DPlane(IfcAxis2Placement3D value);

	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcAnalysisModelTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcAnalysisModelTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #setPredefinedType(IfcAnalysisModelTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralAnalysisModel_PredefinedType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcAnalysisModelTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralAnalysisModel#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see IFC2X3.IfcAnalysisModelTypeEnum
	 * @see #isSetPredefinedType()
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcAnalysisModelTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralAnalysisModel#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcAnalysisModelTypeEnum)
	 * @generated
	 */
	void unsetPredefinedType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralAnalysisModel#getPredefinedType <em>Predefined Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Predefined Type</em>' attribute is set.
	 * @see #unsetPredefinedType()
	 * @see #getPredefinedType()
	 * @see #setPredefinedType(IfcAnalysisModelTypeEnum)
	 * @generated
	 */
	boolean isSetPredefinedType();

} // IfcStructuralAnalysisModel
