/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcCompositeProfileDefImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Composite Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCompositeProfileDef#getProfiles <em>Profiles</em>}</li>
 *   <li>{@link IFC2X3.IfcCompositeProfileDef#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCompositeProfileDef()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcCompositeProfileDefImplAdapter.class)
public interface IfcCompositeProfileDef extends IfcProfileDef {
	/**
	 * Returns the value of the '<em><b>Profiles</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcProfileDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profiles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profiles</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcCompositeProfileDef_Profiles()
	 * @model lower="2" ordered="false"
	 * @generated
	 */
	EList<IfcProfileDef> getProfiles();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #isSetLabel()
	 * @see #unsetLabel()
	 * @see #setLabel(String)
	 * @see IFC2X3.IFC2X3Package#getIfcCompositeProfileDef_Label()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCompositeProfileDef#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #isSetLabel()
	 * @see #unsetLabel()
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCompositeProfileDef#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLabel()
	 * @see #getLabel()
	 * @see #setLabel(String)
	 * @generated
	 */
	void unsetLabel();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCompositeProfileDef#getLabel <em>Label</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Label</em>' attribute is set.
	 * @see #unsetLabel()
	 * @see #getLabel()
	 * @see #setLabel(String)
	 * @generated
	 */
	boolean isSetLabel();

} // IfcCompositeProfileDef
