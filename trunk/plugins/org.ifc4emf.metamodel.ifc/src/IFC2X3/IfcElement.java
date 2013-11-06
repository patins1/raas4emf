/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcElementImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcElement#getTag <em>Tag</em>}</li>
 *   <li>{@link IFC2X3.IfcElement#getFillsVoids <em>Fills Voids</em>}</li>
 *   <li>{@link IFC2X3.IfcElement#getConnectedTo <em>Connected To</em>}</li>
 *   <li>{@link IFC2X3.IfcElement#getHasCoverings <em>Has Coverings</em>}</li>
 *   <li>{@link IFC2X3.IfcElement#getHasProjections <em>Has Projections</em>}</li>
 *   <li>{@link IFC2X3.IfcElement#getHasStructuralMember <em>Has Structural Member</em>}</li>
 *   <li>{@link IFC2X3.IfcElement#getHasPorts <em>Has Ports</em>}</li>
 *   <li>{@link IFC2X3.IfcElement#getHasOpenings <em>Has Openings</em>}</li>
 *   <li>{@link IFC2X3.IfcElement#getIsConnectionRealization <em>Is Connection Realization</em>}</li>
 *   <li>{@link IFC2X3.IfcElement#getProvidesBoundaries <em>Provides Boundaries</em>}</li>
 *   <li>{@link IFC2X3.IfcElement#getConnectedFrom <em>Connected From</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcElement()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcElementImplAdapter.class)
public interface IfcElement extends IfcStructuralActivityAssignmentSelect, IfcProduct {
	/**
	 * Returns the value of the '<em><b>Fills Voids</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelFillsElement#getRelatedBuildingElement <em>Related Building Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fills Voids</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fills Voids</em>' reference.
	 * @see #setFillsVoids(IfcRelFillsElement)
	 * @see IFC2X3.IFC2X3Package#getIfcElement_FillsVoids()
	 * @see IFC2X3.IfcRelFillsElement#getRelatedBuildingElement
	 * @model opposite="RelatedBuildingElement" ordered="false"
	 * @generated
	 */
	IfcRelFillsElement getFillsVoids();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcElement#getFillsVoids <em>Fills Voids</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fills Voids</em>' reference.
	 * @see #getFillsVoids()
	 * @generated
	 */
	void setFillsVoids(IfcRelFillsElement value);

	/**
	 * Returns the value of the '<em><b>Connected To</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelConnectsElements}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelConnectsElements#getRelatingElement <em>Relating Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected To</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcElement_ConnectedTo()
	 * @see IFC2X3.IfcRelConnectsElements#getRelatingElement
	 * @model opposite="RelatingElement" ordered="false"
	 * @generated
	 */
	EList<IfcRelConnectsElements> getConnectedTo();

	/**
	 * Returns the value of the '<em><b>Has Coverings</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelCoversBldgElements}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelCoversBldgElements#getRelatingBuildingElement <em>Relating Building Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Coverings</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Coverings</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcElement_HasCoverings()
	 * @see IFC2X3.IfcRelCoversBldgElements#getRelatingBuildingElement
	 * @model opposite="RelatingBuildingElement" ordered="false"
	 * @generated
	 */
	EList<IfcRelCoversBldgElements> getHasCoverings();

	/**
	 * Returns the value of the '<em><b>Has Projections</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelProjectsElement}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelProjectsElement#getRelatingElement <em>Relating Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Projections</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Projections</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcElement_HasProjections()
	 * @see IFC2X3.IfcRelProjectsElement#getRelatingElement
	 * @model opposite="RelatingElement" ordered="false"
	 * @generated
	 */
	EList<IfcRelProjectsElement> getHasProjections();

	/**
	 * Returns the value of the '<em><b>Has Structural Member</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelConnectsStructuralElement}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelConnectsStructuralElement#getRelatingElement <em>Relating Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Structural Member</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Structural Member</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcElement_HasStructuralMember()
	 * @see IFC2X3.IfcRelConnectsStructuralElement#getRelatingElement
	 * @model opposite="RelatingElement" ordered="false"
	 * @generated
	 */
	EList<IfcRelConnectsStructuralElement> getHasStructuralMember();

	/**
	 * Returns the value of the '<em><b>Has Ports</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelConnectsPortToElement}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelConnectsPortToElement#getRelatedElement <em>Related Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Ports</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Ports</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcElement_HasPorts()
	 * @see IFC2X3.IfcRelConnectsPortToElement#getRelatedElement
	 * @model opposite="RelatedElement" ordered="false"
	 * @generated
	 */
	EList<IfcRelConnectsPortToElement> getHasPorts();

	/**
	 * Returns the value of the '<em><b>Has Openings</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelVoidsElement}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelVoidsElement#getRelatingBuildingElement <em>Relating Building Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Openings</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Openings</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcElement_HasOpenings()
	 * @see IFC2X3.IfcRelVoidsElement#getRelatingBuildingElement
	 * @model opposite="RelatingBuildingElement" ordered="false"
	 * @generated
	 */
	EList<IfcRelVoidsElement> getHasOpenings();

	/**
	 * Returns the value of the '<em><b>Is Connection Realization</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelConnectsWithRealizingElements}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelConnectsWithRealizingElements#getRealizingElements <em>Realizing Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Connection Realization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Connection Realization</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcElement_IsConnectionRealization()
	 * @see IFC2X3.IfcRelConnectsWithRealizingElements#getRealizingElements
	 * @model opposite="RealizingElements" ordered="false"
	 * @generated
	 */
	EList<IfcRelConnectsWithRealizingElements> getIsConnectionRealization();

	/**
	 * Returns the value of the '<em><b>Provides Boundaries</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelSpaceBoundary}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelSpaceBoundary#getRelatedBuildingElement <em>Related Building Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides Boundaries</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides Boundaries</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcElement_ProvidesBoundaries()
	 * @see IFC2X3.IfcRelSpaceBoundary#getRelatedBuildingElement
	 * @model opposite="RelatedBuildingElement" ordered="false"
	 * @generated
	 */
	EList<IfcRelSpaceBoundary> getProvidesBoundaries();

	/**
	 * Returns the value of the '<em><b>Connected From</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRelConnectsElements}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelConnectsElements#getRelatedElement <em>Related Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected From</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcElement_ConnectedFrom()
	 * @see IFC2X3.IfcRelConnectsElements#getRelatedElement
	 * @model opposite="RelatedElement" ordered="false"
	 * @generated
	 */
	EList<IfcRelConnectsElements> getConnectedFrom();

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #isSetTag()
	 * @see #unsetTag()
	 * @see #setTag(String)
	 * @see IFC2X3.IFC2X3Package#getIfcElement_Tag()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcElement#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #isSetTag()
	 * @see #unsetTag()
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcElement#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTag()
	 * @see #getTag()
	 * @see #setTag(String)
	 * @generated
	 */
	void unsetTag();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcElement#getTag <em>Tag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tag</em>' attribute is set.
	 * @see #unsetTag()
	 * @see #getTag()
	 * @see #setTag(String)
	 * @generated
	 */
	boolean isSetTag();

} // IfcElement
