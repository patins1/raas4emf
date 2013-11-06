/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelInteractionRequirementsImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Interaction Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelInteractionRequirements#getDailyInteraction <em>Daily Interaction</em>}</li>
 *   <li>{@link IFC2X3.IfcRelInteractionRequirements#getImportanceRating <em>Importance Rating</em>}</li>
 *   <li>{@link IFC2X3.IfcRelInteractionRequirements#getLocationOfInteraction <em>Location Of Interaction</em>}</li>
 *   <li>{@link IFC2X3.IfcRelInteractionRequirements#getRelatedSpaceProgram <em>Related Space Program</em>}</li>
 *   <li>{@link IFC2X3.IfcRelInteractionRequirements#getRelatingSpaceProgram <em>Relating Space Program</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelInteractionRequirements()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelInteractionRequirementsImplAdapter.class)
public interface IfcRelInteractionRequirements extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Location Of Interaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Of Interaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Of Interaction</em>' reference.
	 * @see #setLocationOfInteraction(IfcSpatialStructureElement)
	 * @see IFC2X3.IFC2X3Package#getIfcRelInteractionRequirements_LocationOfInteraction()
	 * @model
	 * @generated
	 */
	IfcSpatialStructureElement getLocationOfInteraction();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelInteractionRequirements#getLocationOfInteraction <em>Location Of Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Of Interaction</em>' reference.
	 * @see #getLocationOfInteraction()
	 * @generated
	 */
	void setLocationOfInteraction(IfcSpatialStructureElement value);

	/**
	 * Returns the value of the '<em><b>Relating Space Program</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcSpaceProgram#getHasInteractionReqsTo <em>Has Interaction Reqs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Space Program</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Space Program</em>' reference.
	 * @see #setRelatingSpaceProgram(IfcSpaceProgram)
	 * @see IFC2X3.IFC2X3Package#getIfcRelInteractionRequirements_RelatingSpaceProgram()
	 * @see IFC2X3.IfcSpaceProgram#getHasInteractionReqsTo
	 * @model opposite="HasInteractionReqsTo" required="true"
	 * @generated
	 */
	IfcSpaceProgram getRelatingSpaceProgram();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelInteractionRequirements#getRelatingSpaceProgram <em>Relating Space Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Space Program</em>' reference.
	 * @see #getRelatingSpaceProgram()
	 * @generated
	 */
	void setRelatingSpaceProgram(IfcSpaceProgram value);

	/**
	 * Returns the value of the '<em><b>Related Space Program</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcSpaceProgram#getHasInteractionReqsFrom <em>Has Interaction Reqs From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Space Program</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Space Program</em>' reference.
	 * @see #setRelatedSpaceProgram(IfcSpaceProgram)
	 * @see IFC2X3.IFC2X3Package#getIfcRelInteractionRequirements_RelatedSpaceProgram()
	 * @see IFC2X3.IfcSpaceProgram#getHasInteractionReqsFrom
	 * @model opposite="HasInteractionReqsFrom" required="true"
	 * @generated
	 */
	IfcSpaceProgram getRelatedSpaceProgram();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelInteractionRequirements#getRelatedSpaceProgram <em>Related Space Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Space Program</em>' reference.
	 * @see #getRelatedSpaceProgram()
	 * @generated
	 */
	void setRelatedSpaceProgram(IfcSpaceProgram value);

	/**
	 * Returns the value of the '<em><b>Importance Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importance Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importance Rating</em>' attribute.
	 * @see #isSetImportanceRating()
	 * @see #unsetImportanceRating()
	 * @see #setImportanceRating(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRelInteractionRequirements_ImportanceRating()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getImportanceRating();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelInteractionRequirements#getImportanceRating <em>Importance Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importance Rating</em>' attribute.
	 * @see #isSetImportanceRating()
	 * @see #unsetImportanceRating()
	 * @see #getImportanceRating()
	 * @generated
	 */
	void setImportanceRating(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRelInteractionRequirements#getImportanceRating <em>Importance Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImportanceRating()
	 * @see #getImportanceRating()
	 * @see #setImportanceRating(Double)
	 * @generated
	 */
	void unsetImportanceRating();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRelInteractionRequirements#getImportanceRating <em>Importance Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Importance Rating</em>' attribute is set.
	 * @see #unsetImportanceRating()
	 * @see #getImportanceRating()
	 * @see #setImportanceRating(Double)
	 * @generated
	 */
	boolean isSetImportanceRating();

	/**
	 * Returns the value of the '<em><b>Daily Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daily Interaction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daily Interaction</em>' attribute.
	 * @see #isSetDailyInteraction()
	 * @see #unsetDailyInteraction()
	 * @see #setDailyInteraction(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRelInteractionRequirements_DailyInteraction()
	 * @model unsettable="true" dataType="IFC2X3.NUMBER"
	 * @generated
	 */
	Double getDailyInteraction();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelInteractionRequirements#getDailyInteraction <em>Daily Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daily Interaction</em>' attribute.
	 * @see #isSetDailyInteraction()
	 * @see #unsetDailyInteraction()
	 * @see #getDailyInteraction()
	 * @generated
	 */
	void setDailyInteraction(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRelInteractionRequirements#getDailyInteraction <em>Daily Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDailyInteraction()
	 * @see #getDailyInteraction()
	 * @see #setDailyInteraction(Double)
	 * @generated
	 */
	void unsetDailyInteraction();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRelInteractionRequirements#getDailyInteraction <em>Daily Interaction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Daily Interaction</em>' attribute is set.
	 * @see #unsetDailyInteraction()
	 * @see #getDailyInteraction()
	 * @see #setDailyInteraction(Double)
	 * @generated
	 */
	boolean isSetDailyInteraction();

} // IfcRelInteractionRequirements
