/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelConnectsWithEccentricityImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Connects With Eccentricity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelConnectsWithEccentricity#getConnectionConstraint <em>Connection Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsWithEccentricity()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelConnectsWithEccentricityImplAdapter.class)
public interface IfcRelConnectsWithEccentricity extends IfcRelConnectsStructuralMember {
	/**
	 * Returns the value of the '<em><b>Connection Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Constraint</em>' reference.
	 * @see #setConnectionConstraint(IfcConnectionGeometry)
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsWithEccentricity_ConnectionConstraint()
	 * @model required="true"
	 * @generated
	 */
	IfcConnectionGeometry getConnectionConstraint();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelConnectsWithEccentricity#getConnectionConstraint <em>Connection Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Constraint</em>' reference.
	 * @see #getConnectionConstraint()
	 * @generated
	 */
	void setConnectionConstraint(IfcConnectionGeometry value);

} // IfcRelConnectsWithEccentricity
