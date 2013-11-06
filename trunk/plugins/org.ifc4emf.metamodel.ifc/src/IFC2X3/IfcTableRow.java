/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcTableRowImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Table Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTableRow#getRowCells <em>Row Cells</em>}</li>
 *   <li>{@link IFC2X3.IfcTableRow#getIsHeading <em>Is Heading</em>}</li>
 *   <li>{@link IFC2X3.IfcTableRow#getOfTable <em>Of Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTableRow()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcTableRowImplAdapter.class)
public interface IfcTableRow extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Row Cells</b></em>' containment reference list.
	 * The list contents are of type {@link IFC2X3.IfcValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Cells</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Cells</em>' containment reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcTableRow_RowCells()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IfcValue> getRowCells();

	/**
	 * Returns the value of the '<em><b>Of Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcTable#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Of Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Of Table</em>' reference.
	 * @see #setOfTable(IfcTable)
	 * @see IFC2X3.IFC2X3Package#getIfcTableRow_OfTable()
	 * @see IFC2X3.IfcTable#getRows
	 * @model opposite="Rows" required="true"
	 * @generated
	 */
	IfcTable getOfTable();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTableRow#getOfTable <em>Of Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Of Table</em>' reference.
	 * @see #getOfTable()
	 * @generated
	 */
	void setOfTable(IfcTable value);

	/**
	 * Returns the value of the '<em><b>Is Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Heading</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Heading</em>' attribute.
	 * @see #isSetIsHeading()
	 * @see #unsetIsHeading()
	 * @see #setIsHeading(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcTableRow_IsHeading()
	 * @model unsettable="true" dataType="IFC2X3.BOOLEAN" required="true"
	 * @generated
	 */
	Boolean getIsHeading();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTableRow#getIsHeading <em>Is Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Heading</em>' attribute.
	 * @see #isSetIsHeading()
	 * @see #unsetIsHeading()
	 * @see #getIsHeading()
	 * @generated
	 */
	void setIsHeading(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTableRow#getIsHeading <em>Is Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsHeading()
	 * @see #getIsHeading()
	 * @see #setIsHeading(Boolean)
	 * @generated
	 */
	void unsetIsHeading();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTableRow#getIsHeading <em>Is Heading</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Heading</em>' attribute is set.
	 * @see #unsetIsHeading()
	 * @see #getIsHeading()
	 * @see #setIsHeading(Boolean)
	 * @generated
	 */
	boolean isSetIsHeading();

} // IfcTableRow
