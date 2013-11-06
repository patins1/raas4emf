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

import IFC2X3.jaxb.IfcClassificationImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Classification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcClassification#getSource <em>Source</em>}</li>
 *   <li>{@link IFC2X3.IfcClassification#getEdition <em>Edition</em>}</li>
 *   <li>{@link IFC2X3.IfcClassification#getEditionDate <em>Edition Date</em>}</li>
 *   <li>{@link IFC2X3.IfcClassification#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.IfcClassification#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcClassification()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcClassificationImplAdapter.class)
public interface IfcClassification extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcClassificationItem}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcClassificationItem#getItemOf <em>Item Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcClassification_Contains()
	 * @see IFC2X3.IfcClassificationItem#getItemOf
	 * @model opposite="ItemOf" ordered="false"
	 * @generated
	 */
	EList<IfcClassificationItem> getContains();

	/**
	 * Returns the value of the '<em><b>Edition Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edition Date</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edition Date</em>' reference.
	 * @see #setEditionDate(IfcCalendarDate)
	 * @see IFC2X3.IFC2X3Package#getIfcClassification_EditionDate()
	 * @model
	 * @generated
	 */
	IfcCalendarDate getEditionDate();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcClassification#getEditionDate <em>Edition Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition Date</em>' reference.
	 * @see #getEditionDate()
	 * @generated
	 */
	void setEditionDate(IfcCalendarDate value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see IFC2X3.IFC2X3Package#getIfcClassification_Name()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcClassification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcClassification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcClassification#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Edition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edition</em>' attribute.
	 * @see #isSetEdition()
	 * @see #unsetEdition()
	 * @see #setEdition(String)
	 * @see IFC2X3.IFC2X3Package#getIfcClassification_Edition()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getEdition();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcClassification#getEdition <em>Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition</em>' attribute.
	 * @see #isSetEdition()
	 * @see #unsetEdition()
	 * @see #getEdition()
	 * @generated
	 */
	void setEdition(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcClassification#getEdition <em>Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEdition()
	 * @see #getEdition()
	 * @see #setEdition(String)
	 * @generated
	 */
	void unsetEdition();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcClassification#getEdition <em>Edition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Edition</em>' attribute is set.
	 * @see #unsetEdition()
	 * @see #getEdition()
	 * @see #setEdition(String)
	 * @generated
	 */
	boolean isSetEdition();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #isSetSource()
	 * @see #unsetSource()
	 * @see #setSource(String)
	 * @see IFC2X3.IFC2X3Package#getIfcClassification_Source()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcClassification#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #isSetSource()
	 * @see #unsetSource()
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcClassification#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSource()
	 * @see #getSource()
	 * @see #setSource(String)
	 * @generated
	 */
	void unsetSource();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcClassification#getSource <em>Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source</em>' attribute is set.
	 * @see #unsetSource()
	 * @see #getSource()
	 * @see #setSource(String)
	 * @generated
	 */
	boolean isSetSource();

} // IfcClassification
