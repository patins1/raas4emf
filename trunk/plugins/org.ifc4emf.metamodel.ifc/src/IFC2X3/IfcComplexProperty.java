/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcComplexPropertyImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Complex Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcComplexProperty#getUsageName <em>Usage Name</em>}</li>
 *   <li>{@link IFC2X3.IfcComplexProperty#getHasProperties <em>Has Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcComplexProperty()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcComplexPropertyImplAdapter.class)
public interface IfcComplexProperty extends IfcProperty {
	/**
	 * Returns the value of the '<em><b>Has Properties</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcProperty}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcProperty#getPartOfComplex <em>Part Of Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Properties</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcComplexProperty_HasProperties()
	 * @see IFC2X3.IfcProperty#getPartOfComplex
	 * @model opposite="PartOfComplex" required="true" ordered="false"
	 * @generated
	 */
	EList<IfcProperty> getHasProperties();

	/**
	 * Returns the value of the '<em><b>Usage Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Name</em>' attribute.
	 * @see #isSetUsageName()
	 * @see #unsetUsageName()
	 * @see #setUsageName(String)
	 * @see IFC2X3.IFC2X3Package#getIfcComplexProperty_UsageName()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getUsageName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcComplexProperty#getUsageName <em>Usage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Name</em>' attribute.
	 * @see #isSetUsageName()
	 * @see #unsetUsageName()
	 * @see #getUsageName()
	 * @generated
	 */
	void setUsageName(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcComplexProperty#getUsageName <em>Usage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsageName()
	 * @see #getUsageName()
	 * @see #setUsageName(String)
	 * @generated
	 */
	void unsetUsageName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcComplexProperty#getUsageName <em>Usage Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usage Name</em>' attribute is set.
	 * @see #unsetUsageName()
	 * @see #getUsageName()
	 * @see #setUsageName(String)
	 * @generated
	 */
	boolean isSetUsageName();

} // IfcComplexProperty
