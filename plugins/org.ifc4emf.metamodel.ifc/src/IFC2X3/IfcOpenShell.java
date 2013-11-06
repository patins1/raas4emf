/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcOpenShellImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Open Shell</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcOpenShell()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcOpenShellImplAdapter.class)
public interface IfcOpenShell extends IfcShell, IfcConnectedFaceSet {
} // IfcOpenShell
