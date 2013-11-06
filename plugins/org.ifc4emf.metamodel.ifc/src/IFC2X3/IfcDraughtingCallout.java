/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcDraughtingCalloutImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Draughting Callout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcDraughtingCallout#getContents <em>Contents</em>}</li>
 *   <li>{@link IFC2X3.IfcDraughtingCallout#getIsRelatedFromCallout <em>Is Related From Callout</em>}</li>
 *   <li>{@link IFC2X3.IfcDraughtingCallout#getIsRelatedToCallout <em>Is Related To Callout</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcDraughtingCallout()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcDraughtingCalloutImplAdapter.class)
public interface IfcDraughtingCallout extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Is Related From Callout</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcDraughtingCalloutRelationship}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcDraughtingCalloutRelationship#getRelatedDraughtingCallout <em>Related Draughting Callout</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Related From Callout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Related From Callout</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcDraughtingCallout_IsRelatedFromCallout()
	 * @see IFC2X3.IfcDraughtingCalloutRelationship#getRelatedDraughtingCallout
	 * @model opposite="RelatedDraughtingCallout" ordered="false"
	 * @generated
	 */
	EList<IfcDraughtingCalloutRelationship> getIsRelatedFromCallout();

	/**
	 * Returns the value of the '<em><b>Is Related To Callout</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcDraughtingCalloutRelationship}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcDraughtingCalloutRelationship#getRelatingDraughtingCallout <em>Relating Draughting Callout</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Related To Callout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Related To Callout</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcDraughtingCallout_IsRelatedToCallout()
	 * @see IFC2X3.IfcDraughtingCalloutRelationship#getRelatingDraughtingCallout
	 * @model opposite="RelatingDraughtingCallout" ordered="false"
	 * @generated
	 */
	EList<IfcDraughtingCalloutRelationship> getIsRelatedToCallout();

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcDraughtingCalloutElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcDraughtingCallout_Contents()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcDraughtingCalloutElement> getContents();

} // IfcDraughtingCallout
