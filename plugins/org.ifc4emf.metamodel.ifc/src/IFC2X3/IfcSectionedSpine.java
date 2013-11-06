/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcSectionedSpineImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Sectioned Spine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSectionedSpine#getSpineCurve <em>Spine Curve</em>}</li>
 *   <li>{@link IFC2X3.IfcSectionedSpine#getCrossSections <em>Cross Sections</em>}</li>
 *   <li>{@link IFC2X3.IfcSectionedSpine#getCrossSectionPositions <em>Cross Section Positions</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSectionedSpine()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSectionedSpineImplAdapter.class)
public interface IfcSectionedSpine extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Cross Section Positions</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcAxis2Placement3D}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cross Section Positions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Section Positions</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcSectionedSpine_CrossSectionPositions()
	 * @model lower="2"
	 * @generated
	 */
	EList<IfcAxis2Placement3D> getCrossSectionPositions();

	/**
	 * Returns the value of the '<em><b>Spine Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spine Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spine Curve</em>' reference.
	 * @see #setSpineCurve(IfcCompositeCurve)
	 * @see IFC2X3.IFC2X3Package#getIfcSectionedSpine_SpineCurve()
	 * @model required="true"
	 * @generated
	 */
	IfcCompositeCurve getSpineCurve();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSectionedSpine#getSpineCurve <em>Spine Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spine Curve</em>' reference.
	 * @see #getSpineCurve()
	 * @generated
	 */
	void setSpineCurve(IfcCompositeCurve value);

	/**
	 * Returns the value of the '<em><b>Cross Sections</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcProfileDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cross Sections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Sections</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcSectionedSpine_CrossSections()
	 * @model lower="2"
	 * @generated
	 */
	EList<IfcProfileDef> getCrossSections();

} // IfcSectionedSpine
