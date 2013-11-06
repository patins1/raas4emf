/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcSoundPropertiesImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Sound Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSoundProperties#getIsAttenuating <em>Is Attenuating</em>}</li>
 *   <li>{@link IFC2X3.IfcSoundProperties#getSoundScale <em>Sound Scale</em>}</li>
 *   <li>{@link IFC2X3.IfcSoundProperties#getSoundValues <em>Sound Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSoundProperties()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSoundPropertiesImplAdapter.class)
public interface IfcSoundProperties extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Sound Values</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcSoundValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sound Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sound Values</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcSoundProperties_SoundValues()
	 * @model required="true" upper="8"
	 * @generated
	 */
	EList<IfcSoundValue> getSoundValues();

	/**
	 * Returns the value of the '<em><b>Sound Scale</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcSoundScaleEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sound Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sound Scale</em>' attribute.
	 * @see IFC2X3.IfcSoundScaleEnum
	 * @see #isSetSoundScale()
	 * @see #unsetSoundScale()
	 * @see #setSoundScale(IfcSoundScaleEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcSoundProperties_SoundScale()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcSoundScaleEnum getSoundScale();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSoundProperties#getSoundScale <em>Sound Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sound Scale</em>' attribute.
	 * @see IFC2X3.IfcSoundScaleEnum
	 * @see #isSetSoundScale()
	 * @see #unsetSoundScale()
	 * @see #getSoundScale()
	 * @generated
	 */
	void setSoundScale(IfcSoundScaleEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSoundProperties#getSoundScale <em>Sound Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSoundScale()
	 * @see #getSoundScale()
	 * @see #setSoundScale(IfcSoundScaleEnum)
	 * @generated
	 */
	void unsetSoundScale();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSoundProperties#getSoundScale <em>Sound Scale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sound Scale</em>' attribute is set.
	 * @see #unsetSoundScale()
	 * @see #getSoundScale()
	 * @see #setSoundScale(IfcSoundScaleEnum)
	 * @generated
	 */
	boolean isSetSoundScale();

	/**
	 * Returns the value of the '<em><b>Is Attenuating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Attenuating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Attenuating</em>' attribute.
	 * @see #isSetIsAttenuating()
	 * @see #unsetIsAttenuating()
	 * @see #setIsAttenuating(Boolean)
	 * @see IFC2X3.IFC2X3Package#getIfcSoundProperties_IsAttenuating()
	 * @model unsettable="true" dataType="IFC2X3.BOOLEAN" required="true"
	 * @generated
	 */
	Boolean getIsAttenuating();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSoundProperties#getIsAttenuating <em>Is Attenuating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Attenuating</em>' attribute.
	 * @see #isSetIsAttenuating()
	 * @see #unsetIsAttenuating()
	 * @see #getIsAttenuating()
	 * @generated
	 */
	void setIsAttenuating(Boolean value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSoundProperties#getIsAttenuating <em>Is Attenuating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsAttenuating()
	 * @see #getIsAttenuating()
	 * @see #setIsAttenuating(Boolean)
	 * @generated
	 */
	void unsetIsAttenuating();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSoundProperties#getIsAttenuating <em>Is Attenuating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Attenuating</em>' attribute is set.
	 * @see #unsetIsAttenuating()
	 * @see #getIsAttenuating()
	 * @see #setIsAttenuating(Boolean)
	 * @generated
	 */
	boolean isSetIsAttenuating();

} // IfcSoundProperties
