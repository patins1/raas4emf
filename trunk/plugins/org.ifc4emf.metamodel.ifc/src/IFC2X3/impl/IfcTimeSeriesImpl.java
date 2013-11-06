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
import IFC2X3.IfcDataOriginEnum;
import IFC2X3.IfcDateTimeSelect;
import IFC2X3.IfcTimeSeries;
import IFC2X3.IfcTimeSeriesDataTypeEnum;
import IFC2X3.IfcTimeSeriesReferenceRelationship;
import IFC2X3.IfcUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Time Series</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTimeSeriesImpl#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTimeSeriesImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTimeSeriesImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTimeSeriesImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTimeSeriesImpl#getTimeSeriesDataType <em>Time Series Data Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTimeSeriesImpl#getDataOrigin <em>Data Origin</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTimeSeriesImpl#getUserDefinedDataOrigin <em>User Defined Data Origin</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTimeSeriesImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTimeSeriesImpl#getDocumentedBy <em>Documented By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTimeSeries")
@XmlSeeAlso({ IfcIrregularTimeSeriesImpl.class, IfcRegularTimeSeriesImpl.class })
@XmlRootElement(name = "IfcTimeSeriesElement")
public class IfcTimeSeriesImpl extends IfcObjectReferenceSelectImpl implements IfcTimeSeries {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTimeSeriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTimeSeries();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeriesReferenceRelationship getDocumentedBy() {
		return (IfcTimeSeriesReferenceRelationship)eGet(IFC2X3Package.eINSTANCE.getIfcTimeSeries_DocumentedBy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentedBy(IfcTimeSeriesReferenceRelationship newDocumentedBy) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTimeSeries_DocumentedBy(), newDocumentedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getEndTime() {
		return (IfcDateTimeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcTimeSeries_EndTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(IfcDateTimeSelect newEndTime) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTimeSeries_EndTime(), newEndTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getStartTime() {
		return (IfcDateTimeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcTimeSeries_StartTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(IfcDateTimeSelect newStartTime) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTimeSeries_StartTime(), newStartTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnit getUnit() {
		return (IfcUnit)eGet(IFC2X3Package.eINSTANCE.getIfcTimeSeries_Unit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(IfcUnit newUnit) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTimeSeries_Unit(), newUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedDataOrigin() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcTimeSeries_UserDefinedDataOrigin(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedDataOrigin(String newUserDefinedDataOrigin) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTimeSeries_UserDefinedDataOrigin(), newUserDefinedDataOrigin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedDataOrigin() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTimeSeries_UserDefinedDataOrigin());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedDataOrigin() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTimeSeries_UserDefinedDataOrigin());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDataOriginEnum getDataOrigin() {
		return (IfcDataOriginEnum)eGet(IFC2X3Package.eINSTANCE.getIfcTimeSeries_DataOrigin(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataOrigin(IfcDataOriginEnum newDataOrigin) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTimeSeries_DataOrigin(), newDataOrigin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataOrigin() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTimeSeries_DataOrigin());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataOrigin() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTimeSeries_DataOrigin());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeriesDataTypeEnum getTimeSeriesDataType() {
		return (IfcTimeSeriesDataTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcTimeSeries_TimeSeriesDataType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSeriesDataType(IfcTimeSeriesDataTypeEnum newTimeSeriesDataType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTimeSeries_TimeSeriesDataType(), newTimeSeriesDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimeSeriesDataType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTimeSeries_TimeSeriesDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimeSeriesDataType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTimeSeries_TimeSeriesDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcTimeSeries_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTimeSeries_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTimeSeries_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTimeSeries_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcTimeSeries_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTimeSeries_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTimeSeries_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTimeSeries_Name());
	}

} //IfcTimeSeriesImpl
