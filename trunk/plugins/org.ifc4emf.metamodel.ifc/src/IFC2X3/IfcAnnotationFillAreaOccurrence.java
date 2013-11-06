/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcAnnotationFillAreaOccurrenceImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Annotation Fill Area Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcAnnotationFillAreaOccurrence#getFillStyleTarget <em>Fill Style Target</em>}</li>
 *   <li>{@link IFC2X3.IfcAnnotationFillAreaOccurrence#getGlobalOrLocal <em>Global Or Local</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcAnnotationFillAreaOccurrence()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcAnnotationFillAreaOccurrenceImplAdapter.class)
public interface IfcAnnotationFillAreaOccurrence extends IfcAnnotationOccurrence {
	/**
	 * Returns the value of the '<em><b>Fill Style Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Style Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Style Target</em>' reference.
	 * @see #setFillStyleTarget(IfcPoint)
	 * @see IFC2X3.IFC2X3Package#getIfcAnnotationFillAreaOccurrence_FillStyleTarget()
	 * @model
	 * @generated
	 */
	IfcPoint getFillStyleTarget();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAnnotationFillAreaOccurrence#getFillStyleTarget <em>Fill Style Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Style Target</em>' reference.
	 * @see #getFillStyleTarget()
	 * @generated
	 */
	void setFillStyleTarget(IfcPoint value);

	/**
	 * Returns the value of the '<em><b>Global Or Local</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcGlobalOrLocalEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Or Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Or Local</em>' attribute.
	 * @see IFC2X3.IfcGlobalOrLocalEnum
	 * @see #isSetGlobalOrLocal()
	 * @see #unsetGlobalOrLocal()
	 * @see #setGlobalOrLocal(IfcGlobalOrLocalEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcAnnotationFillAreaOccurrence_GlobalOrLocal()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcGlobalOrLocalEnum getGlobalOrLocal();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAnnotationFillAreaOccurrence#getGlobalOrLocal <em>Global Or Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Or Local</em>' attribute.
	 * @see IFC2X3.IfcGlobalOrLocalEnum
	 * @see #isSetGlobalOrLocal()
	 * @see #unsetGlobalOrLocal()
	 * @see #getGlobalOrLocal()
	 * @generated
	 */
	void setGlobalOrLocal(IfcGlobalOrLocalEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcAnnotationFillAreaOccurrence#getGlobalOrLocal <em>Global Or Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGlobalOrLocal()
	 * @see #getGlobalOrLocal()
	 * @see #setGlobalOrLocal(IfcGlobalOrLocalEnum)
	 * @generated
	 */
	void unsetGlobalOrLocal();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcAnnotationFillAreaOccurrence#getGlobalOrLocal <em>Global Or Local</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Global Or Local</em>' attribute is set.
	 * @see #unsetGlobalOrLocal()
	 * @see #getGlobalOrLocal()
	 * @see #setGlobalOrLocal(IfcGlobalOrLocalEnum)
	 * @generated
	 */
	boolean isSetGlobalOrLocal();

} // IfcAnnotationFillAreaOccurrence
