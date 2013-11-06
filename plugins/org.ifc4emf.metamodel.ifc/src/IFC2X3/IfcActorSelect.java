/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EObject;

import IFC2X3.jaxb.IfcActorSelectImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Actor Select</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcActorSelect()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
@XmlJavaTypeAdapter(IfcActorSelectImplAdapter.class)
public interface IfcActorSelect extends CDOObject {
} // IfcActorSelect
