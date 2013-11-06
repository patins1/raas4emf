/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcBoxedHalfSpaceImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Boxed Half Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcBoxedHalfSpace#getEnclosure <em>Enclosure</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcBoxedHalfSpace()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcBoxedHalfSpaceImplAdapter.class)
public interface IfcBoxedHalfSpace extends IfcHalfSpaceSolid {
	/**
	 * Returns the value of the '<em><b>Enclosure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclosure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosure</em>' reference.
	 * @see #setEnclosure(IfcBoundingBox)
	 * @see IFC2X3.IFC2X3Package#getIfcBoxedHalfSpace_Enclosure()
	 * @model required="true"
	 * @generated
	 */
	IfcBoundingBox getEnclosure();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcBoxedHalfSpace#getEnclosure <em>Enclosure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosure</em>' reference.
	 * @see #getEnclosure()
	 * @generated
	 */
	void setEnclosure(IfcBoundingBox value);

} // IfcBoxedHalfSpace
