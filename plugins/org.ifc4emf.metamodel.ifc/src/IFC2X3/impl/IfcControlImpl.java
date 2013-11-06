/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcControl;
import IFC2X3.IfcRelAssignsToControl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcControlImpl#getControls <em>Controls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcControl")
@XmlSeeAlso({ IfcWorkScheduleImpl.class, IfcActionRequestImpl.class, IfcSpaceProgramImpl.class, IfcEquipmentStandardImpl.class, IfcScheduleTimeControlImpl.class, IfcProjectOrderImpl.class, IfcCostScheduleImpl.class, IfcPerformanceHistoryImpl.class, IfcWorkControlImpl.class,
		IfcFurnitureStandardImpl.class, IfcWorkPlanImpl.class, IfcServiceLifeImpl.class, IfcProjectOrderRecordImpl.class, IfcTimeSeriesScheduleImpl.class, IfcConditionCriterionImpl.class, IfcPermitImpl.class, IfcCostItemImpl.class })
@XmlRootElement(name = "IfcControlElement")
public class IfcControlImpl extends IfcObjectImpl implements IfcControl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcControl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelAssignsToControl> getControls() {
		return (EList<IfcRelAssignsToControl>)eGet(IFC2X3Package.eINSTANCE.getIfcControl_Controls(), true);
	}

} //IfcControlImpl
