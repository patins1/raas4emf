/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcDateTimeSelect;
import IFC2X3.IfcPerson;
import IFC2X3.IfcWorkControl;
import IFC2X3.IfcWorkControlTypeEnum;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Work Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcWorkControlImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWorkControlImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWorkControlImpl#getCreators <em>Creators</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWorkControlImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWorkControlImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWorkControlImpl#getTotalFloat <em>Total Float</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWorkControlImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWorkControlImpl#getFinishTime <em>Finish Time</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWorkControlImpl#getWorkControlType <em>Work Control Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWorkControlImpl#getUserDefinedControlType <em>User Defined Control Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcWorkControl")
@XmlSeeAlso({ IfcWorkScheduleImpl.class, IfcWorkPlanImpl.class })
@XmlRootElement(name = "IfcWorkControlElement")
public class IfcWorkControlImpl extends IfcControlImpl implements IfcWorkControl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcWorkControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcWorkControl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getFinishTime() {
		return (IfcDateTimeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcWorkControl_FinishTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinishTime(IfcDateTimeSelect newFinishTime) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWorkControl_FinishTime(), newFinishTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getStartTime() {
		return (IfcDateTimeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcWorkControl_StartTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(IfcDateTimeSelect newStartTime) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWorkControl_StartTime(), newStartTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcPerson> getCreators() {
		return (EList<IfcPerson>)eGet(IFC2X3Package.eINSTANCE.getIfcWorkControl_Creators(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getCreationDate() {
		return (IfcDateTimeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcWorkControl_CreationDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(IfcDateTimeSelect newCreationDate) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWorkControl_CreationDate(), newCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedControlType() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcWorkControl_UserDefinedControlType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedControlType(String newUserDefinedControlType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWorkControl_UserDefinedControlType(), newUserDefinedControlType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedControlType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWorkControl_UserDefinedControlType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedControlType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWorkControl_UserDefinedControlType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWorkControlTypeEnum getWorkControlType() {
		return (IfcWorkControlTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcWorkControl_WorkControlType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkControlType(IfcWorkControlTypeEnum newWorkControlType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWorkControl_WorkControlType(), newWorkControlType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWorkControlType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWorkControl_WorkControlType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWorkControlType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWorkControl_WorkControlType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTotalFloat() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcWorkControl_TotalFloat(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalFloat(Double newTotalFloat) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWorkControl_TotalFloat(), newTotalFloat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTotalFloat() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWorkControl_TotalFloat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTotalFloat() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWorkControl_TotalFloat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDuration() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcWorkControl_Duration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Double newDuration) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWorkControl_Duration(), newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDuration() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWorkControl_Duration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDuration() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWorkControl_Duration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcWorkControl_Purpose(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWorkControl_Purpose(), newPurpose);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPurpose() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWorkControl_Purpose());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPurpose() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWorkControl_Purpose());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcWorkControl_Identifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWorkControl_Identifier(), newIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIdentifier() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWorkControl_Identifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIdentifier() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWorkControl_Identifier());
	}

} //IfcWorkControlImpl
