/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcGridImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcGrid#getUAxes <em>UAxes</em>}</li>
 *   <li>{@link IFC2X3.IfcGrid#getVAxes <em>VAxes</em>}</li>
 *   <li>{@link IFC2X3.IfcGrid#getWAxes <em>WAxes</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcGrid()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcGridImplAdapter.class)
public interface IfcGrid extends IfcProduct {
	/**
	 * Returns the value of the '<em><b>WAxes</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcGridAxis}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcGridAxis#getPartOfW <em>Part Of W</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>WAxes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WAxes</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcGrid_WAxes()
	 * @see IFC2X3.IfcGridAxis#getPartOfW
	 * @model opposite="PartOfW"
	 * @generated
	 */
	EList<IfcGridAxis> getWAxes();

	/**
	 * Returns the value of the '<em><b>VAxes</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcGridAxis}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcGridAxis#getPartOfV <em>Part Of V</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VAxes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VAxes</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcGrid_VAxes()
	 * @see IFC2X3.IfcGridAxis#getPartOfV
	 * @model opposite="PartOfV" required="true"
	 * @generated
	 */
	EList<IfcGridAxis> getVAxes();

	/**
	 * Returns the value of the '<em><b>UAxes</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcGridAxis}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcGridAxis#getPartOfU <em>Part Of U</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UAxes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UAxes</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcGrid_UAxes()
	 * @see IFC2X3.IfcGridAxis#getPartOfU
	 * @model opposite="PartOfU" required="true"
	 * @generated
	 */
	EList<IfcGridAxis> getUAxes();

} // IfcGrid
