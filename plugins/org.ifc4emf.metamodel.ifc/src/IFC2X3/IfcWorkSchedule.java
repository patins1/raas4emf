/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcWorkScheduleImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Work Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcWorkSchedule()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcWorkScheduleImplAdapter.class)
public interface IfcWorkSchedule extends IfcWorkControl {
} // IfcWorkSchedule