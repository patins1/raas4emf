/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcRelCoversSpacesImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Covers Spaces</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelCoversSpaces#getRelatedSpace <em>Related Space</em>}</li>
 *   <li>{@link IFC2X3.IfcRelCoversSpaces#getRelatedCoverings <em>Related Coverings</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelCoversSpaces()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelCoversSpacesImplAdapter.class)
public interface IfcRelCoversSpaces extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Related Space</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcSpace#getHasCoverings <em>Has Coverings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Space</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Space</em>' reference.
	 * @see #setRelatedSpace(IfcSpace)
	 * @see IFC2X3.IFC2X3Package#getIfcRelCoversSpaces_RelatedSpace()
	 * @see IFC2X3.IfcSpace#getHasCoverings
	 * @model opposite="HasCoverings" required="true"
	 * @generated
	 */
	IfcSpace getRelatedSpace();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelCoversSpaces#getRelatedSpace <em>Related Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Space</em>' reference.
	 * @see #getRelatedSpace()
	 * @generated
	 */
	void setRelatedSpace(IfcSpace value);

	/**
	 * Returns the value of the '<em><b>Related Coverings</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcCovering}.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcCovering#getCoversSpaces <em>Covers Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Coverings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Coverings</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcRelCoversSpaces_RelatedCoverings()
	 * @see IFC2X3.IfcCovering#getCoversSpaces
	 * @model opposite="CoversSpaces" required="true" ordered="false"
	 * @generated
	 */
	EList<IfcCovering> getRelatedCoverings();

} // IfcRelCoversSpaces
