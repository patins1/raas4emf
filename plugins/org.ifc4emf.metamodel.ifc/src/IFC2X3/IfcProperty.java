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

import IFC2X3.jaxb.IfcPropertyImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcProperty#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.IfcProperty#getDescription <em>Description</em>}</li>
 *   <li>{@link IFC2X3.IfcProperty#getPropertyForDependance <em>Property For Dependance</em>}</li>
 *   <li>{@link IFC2X3.IfcProperty#getPropertyDependsOn <em>Property Depends On</em>}</li>
 *   <li>{@link IFC2X3.IfcProperty#getPartOfComplex <em>Part Of Complex</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcProperty()
 * @model
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcPropertyImplAdapter.class)
public interface IfcProperty extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Property For Dependance</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcPropertyDependencyRelationship}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcPropertyDependencyRelationship#getDependingProperty <em>Depending Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property For Dependance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property For Dependance</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcProperty_PropertyForDependance()
	 * @see IFC2X3.IfcPropertyDependencyRelationship#getDependingProperty
	 * @model opposite="DependingProperty" ordered="false"
	 * @generated
	 */
	EList<IfcPropertyDependencyRelationship> getPropertyForDependance();

	/**
	 * Returns the value of the '<em><b>Property Depends On</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcPropertyDependencyRelationship}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcPropertyDependencyRelationship#getDependantProperty <em>Dependant Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Depends On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Depends On</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcProperty_PropertyDependsOn()
	 * @see IFC2X3.IfcPropertyDependencyRelationship#getDependantProperty
	 * @model opposite="DependantProperty" ordered="false"
	 * @generated
	 */
	EList<IfcPropertyDependencyRelationship> getPropertyDependsOn();

	/**
	 * Returns the value of the '<em><b>Part Of Complex</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcComplexProperty#getHasProperties <em>Has Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of Complex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of Complex</em>' reference.
	 * @see #setPartOfComplex(IfcComplexProperty)
	 * @see IFC2X3.IFC2X3Package#getIfcProperty_PartOfComplex()
	 * @see IFC2X3.IfcComplexProperty#getHasProperties
	 * @model opposite="HasProperties" ordered="false"
	 * @generated
	 */
	IfcComplexProperty getPartOfComplex();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcProperty#getPartOfComplex <em>Part Of Complex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of Complex</em>' reference.
	 * @see #getPartOfComplex()
	 * @generated
	 */
	void setPartOfComplex(IfcComplexProperty value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(String)
	 * @see IFC2X3.IFC2X3Package#getIfcProperty_Description()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcProperty#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcProperty#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcProperty#getDescription <em>Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' attribute is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	boolean isSetDescription();

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
	 * @see IFC2X3.IFC2X3Package#getIfcProperty_Name()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcProperty#getName <em>Name</em>}' attribute.
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
	 * Unsets the value of the '{@link IFC2X3.IfcProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcProperty#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

} // IfcProperty
