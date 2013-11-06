/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcLibraryReferenceImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Library Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcLibraryReference#getReferenceIntoLibrary <em>Reference Into Library</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcLibraryReference()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcLibraryReferenceImplAdapter.class)
public interface IfcLibraryReference extends IfcLibrarySelect, IfcExternalReference {
	/**
	 * Returns the value of the '<em><b>Reference Into Library</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcLibraryInformation#getLibraryReference <em>Library Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Into Library</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Into Library</em>' reference.
	 * @see #setReferenceIntoLibrary(IfcLibraryInformation)
	 * @see IFC2X3.IFC2X3Package#getIfcLibraryReference_ReferenceIntoLibrary()
	 * @see IFC2X3.IfcLibraryInformation#getLibraryReference
	 * @model opposite="LibraryReference" ordered="false"
	 * @generated
	 */
	IfcLibraryInformation getReferenceIntoLibrary();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcLibraryReference#getReferenceIntoLibrary <em>Reference Into Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Into Library</em>' reference.
	 * @see #getReferenceIntoLibrary()
	 * @generated
	 */
	void setReferenceIntoLibrary(IfcLibraryInformation value);

} // IfcLibraryReference
