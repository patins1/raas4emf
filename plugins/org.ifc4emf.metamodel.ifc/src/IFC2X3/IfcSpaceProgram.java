/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcSpaceProgramImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Space Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcSpaceProgram#getSpaceProgramIdentifier <em>Space Program Identifier</em>}</li>
 *   <li>{@link IFC2X3.IfcSpaceProgram#getMaxRequiredArea <em>Max Required Area</em>}</li>
 *   <li>{@link IFC2X3.IfcSpaceProgram#getMinRequiredArea <em>Min Required Area</em>}</li>
 *   <li>{@link IFC2X3.IfcSpaceProgram#getRequestedLocation <em>Requested Location</em>}</li>
 *   <li>{@link IFC2X3.IfcSpaceProgram#getStandardRequiredArea <em>Standard Required Area</em>}</li>
 *   <li>{@link IFC2X3.IfcSpaceProgram#getHasInteractionReqsFrom <em>Has Interaction Reqs From</em>}</li>
 *   <li>{@link IFC2X3.IfcSpaceProgram#getHasInteractionReqsTo <em>Has Interaction Reqs To</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcSpaceProgram()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcSpaceProgramImplAdapter.class)
public interface IfcSpaceProgram extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Has Interaction Reqs From</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelInteractionRequirements}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelInteractionRequirements#getRelatedSpaceProgram <em>Related Space Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Interaction Reqs From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Interaction Reqs From</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcSpaceProgram_HasInteractionReqsFrom()
	 * @see IFC2X3.IfcRelInteractionRequirements#getRelatedSpaceProgram
	 * @model opposite="RelatedSpaceProgram" ordered="false"
	 * @generated
	 */
	EList<IfcRelInteractionRequirements> getHasInteractionReqsFrom();

	/**
	 * Returns the value of the '<em><b>Has Interaction Reqs To</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelInteractionRequirements}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelInteractionRequirements#getRelatingSpaceProgram <em>Relating Space Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Interaction Reqs To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Interaction Reqs To</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcSpaceProgram_HasInteractionReqsTo()
	 * @see IFC2X3.IfcRelInteractionRequirements#getRelatingSpaceProgram
	 * @model opposite="RelatingSpaceProgram" ordered="false"
	 * @generated
	 */
	EList<IfcRelInteractionRequirements> getHasInteractionReqsTo();

	/**
	 * Returns the value of the '<em><b>Requested Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requested Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Location</em>' reference.
	 * @see #setRequestedLocation(IfcSpatialStructureElement)
	 * @see IFC2X3.IFC2X3Package#getIfcSpaceProgram_RequestedLocation()
	 * @model
	 * @generated
	 */
	IfcSpatialStructureElement getRequestedLocation();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSpaceProgram#getRequestedLocation <em>Requested Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Location</em>' reference.
	 * @see #getRequestedLocation()
	 * @generated
	 */
	void setRequestedLocation(IfcSpatialStructureElement value);

	/**
	 * Returns the value of the '<em><b>Standard Required Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Required Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Required Area</em>' attribute.
	 * @see #isSetStandardRequiredArea()
	 * @see #unsetStandardRequiredArea()
	 * @see #setStandardRequiredArea(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSpaceProgram_StandardRequiredArea()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getStandardRequiredArea();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSpaceProgram#getStandardRequiredArea <em>Standard Required Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Required Area</em>' attribute.
	 * @see #isSetStandardRequiredArea()
	 * @see #unsetStandardRequiredArea()
	 * @see #getStandardRequiredArea()
	 * @generated
	 */
	void setStandardRequiredArea(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSpaceProgram#getStandardRequiredArea <em>Standard Required Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStandardRequiredArea()
	 * @see #getStandardRequiredArea()
	 * @see #setStandardRequiredArea(Double)
	 * @generated
	 */
	void unsetStandardRequiredArea();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSpaceProgram#getStandardRequiredArea <em>Standard Required Area</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Standard Required Area</em>' attribute is set.
	 * @see #unsetStandardRequiredArea()
	 * @see #getStandardRequiredArea()
	 * @see #setStandardRequiredArea(Double)
	 * @generated
	 */
	boolean isSetStandardRequiredArea();

	/**
	 * Returns the value of the '<em><b>Min Required Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Required Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Required Area</em>' attribute.
	 * @see #isSetMinRequiredArea()
	 * @see #unsetMinRequiredArea()
	 * @see #setMinRequiredArea(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSpaceProgram_MinRequiredArea()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMinRequiredArea();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSpaceProgram#getMinRequiredArea <em>Min Required Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Required Area</em>' attribute.
	 * @see #isSetMinRequiredArea()
	 * @see #unsetMinRequiredArea()
	 * @see #getMinRequiredArea()
	 * @generated
	 */
	void setMinRequiredArea(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSpaceProgram#getMinRequiredArea <em>Min Required Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinRequiredArea()
	 * @see #getMinRequiredArea()
	 * @see #setMinRequiredArea(Double)
	 * @generated
	 */
	void unsetMinRequiredArea();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSpaceProgram#getMinRequiredArea <em>Min Required Area</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Required Area</em>' attribute is set.
	 * @see #unsetMinRequiredArea()
	 * @see #getMinRequiredArea()
	 * @see #setMinRequiredArea(Double)
	 * @generated
	 */
	boolean isSetMinRequiredArea();

	/**
	 * Returns the value of the '<em><b>Max Required Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Required Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Required Area</em>' attribute.
	 * @see #isSetMaxRequiredArea()
	 * @see #unsetMaxRequiredArea()
	 * @see #setMaxRequiredArea(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcSpaceProgram_MaxRequiredArea()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getMaxRequiredArea();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSpaceProgram#getMaxRequiredArea <em>Max Required Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Required Area</em>' attribute.
	 * @see #isSetMaxRequiredArea()
	 * @see #unsetMaxRequiredArea()
	 * @see #getMaxRequiredArea()
	 * @generated
	 */
	void setMaxRequiredArea(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSpaceProgram#getMaxRequiredArea <em>Max Required Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxRequiredArea()
	 * @see #getMaxRequiredArea()
	 * @see #setMaxRequiredArea(Double)
	 * @generated
	 */
	void unsetMaxRequiredArea();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSpaceProgram#getMaxRequiredArea <em>Max Required Area</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Required Area</em>' attribute is set.
	 * @see #unsetMaxRequiredArea()
	 * @see #getMaxRequiredArea()
	 * @see #setMaxRequiredArea(Double)
	 * @generated
	 */
	boolean isSetMaxRequiredArea();

	/**
	 * Returns the value of the '<em><b>Space Program Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Space Program Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space Program Identifier</em>' attribute.
	 * @see #isSetSpaceProgramIdentifier()
	 * @see #unsetSpaceProgramIdentifier()
	 * @see #setSpaceProgramIdentifier(String)
	 * @see IFC2X3.IFC2X3Package#getIfcSpaceProgram_SpaceProgramIdentifier()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getSpaceProgramIdentifier();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcSpaceProgram#getSpaceProgramIdentifier <em>Space Program Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space Program Identifier</em>' attribute.
	 * @see #isSetSpaceProgramIdentifier()
	 * @see #unsetSpaceProgramIdentifier()
	 * @see #getSpaceProgramIdentifier()
	 * @generated
	 */
	void setSpaceProgramIdentifier(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcSpaceProgram#getSpaceProgramIdentifier <em>Space Program Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpaceProgramIdentifier()
	 * @see #getSpaceProgramIdentifier()
	 * @see #setSpaceProgramIdentifier(String)
	 * @generated
	 */
	void unsetSpaceProgramIdentifier();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcSpaceProgram#getSpaceProgramIdentifier <em>Space Program Identifier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Space Program Identifier</em>' attribute is set.
	 * @see #unsetSpaceProgramIdentifier()
	 * @see #getSpaceProgramIdentifier()
	 * @see #setSpaceProgramIdentifier(String)
	 * @generated
	 */
	boolean isSetSpaceProgramIdentifier();

} // IfcSpaceProgram
