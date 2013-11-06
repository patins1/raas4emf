/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcManifoldSolidBrepImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Manifold Solid Brep</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcManifoldSolidBrep#getOuter <em>Outer</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcManifoldSolidBrep()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcManifoldSolidBrepImplAdapter.class)
public interface IfcManifoldSolidBrep extends IfcSolidModel {
	/**
	 * Returns the value of the '<em><b>Outer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer</em>' reference.
	 * @see #setOuter(IfcClosedShell)
	 * @see IFC2X3.IFC2X3Package#getIfcManifoldSolidBrep_Outer()
	 * @model required="true"
	 * @generated
	 */
	IfcClosedShell getOuter();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcManifoldSolidBrep#getOuter <em>Outer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer</em>' reference.
	 * @see #getOuter()
	 * @generated
	 */
	void setOuter(IfcClosedShell value);

} // IfcManifoldSolidBrep
