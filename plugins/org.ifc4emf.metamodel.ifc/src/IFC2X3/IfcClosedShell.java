/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcClosedShellImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Closed Shell</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcClosedShell()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcClosedShellImplAdapter.class)
public interface IfcClosedShell extends IfcShell, IfcConnectedFaceSet {
} // IfcClosedShell
