/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelAssociatesLibraryImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Associates Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelAssociatesLibrary#getRelatingLibrary <em>Relating Library</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelAssociatesLibrary()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelAssociatesLibraryImplAdapter.class)
public interface IfcRelAssociatesLibrary extends IfcRelAssociates {
	/**
	 * Returns the value of the '<em><b>Relating Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Library</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Library</em>' reference.
	 * @see #setRelatingLibrary(IfcLibrarySelect)
	 * @see IFC2X3.IFC2X3Package#getIfcRelAssociatesLibrary_RelatingLibrary()
	 * @model required="true"
	 * @generated
	 */
	IfcLibrarySelect getRelatingLibrary();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelAssociatesLibrary#getRelatingLibrary <em>Relating Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Library</em>' reference.
	 * @see #getRelatingLibrary()
	 * @generated
	 */
	void setRelatingLibrary(IfcLibrarySelect value);

} // IfcRelAssociatesLibrary
