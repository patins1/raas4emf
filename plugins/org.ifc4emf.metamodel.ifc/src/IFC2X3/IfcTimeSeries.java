/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcTimeSeriesImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Time Series</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTimeSeries#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.IfcTimeSeries#getDescription <em>Description</em>}</li>
 *   <li>{@link IFC2X3.IfcTimeSeries#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link IFC2X3.IfcTimeSeries#getEndTime <em>End Time</em>}</li>
 *   <li>{@link IFC2X3.IfcTimeSeries#getTimeSeriesDataType <em>Time Series Data Type</em>}</li>
 *   <li>{@link IFC2X3.IfcTimeSeries#getDataOrigin <em>Data Origin</em>}</li>
 *   <li>{@link IFC2X3.IfcTimeSeries#getUserDefinedDataOrigin <em>User Defined Data Origin</em>}</li>
 *   <li>{@link IFC2X3.IfcTimeSeries#getUnit <em>Unit</em>}</li>
 *   <li>{@link IFC2X3.IfcTimeSeries#getDocumentedBy <em>Documented By</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTimeSeries()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcTimeSeriesImplAdapter.class)
public interface IfcTimeSeries extends IfcObjectReferenceSelect {
	/**
	 * Returns the value of the '<em><b>Documented By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcTimeSeriesReferenceRelationship#getReferencedTimeSeries <em>Referenced Time Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documented By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documented By</em>' reference.
	 * @see #setDocumentedBy(IfcTimeSeriesReferenceRelationship)
	 * @see IFC2X3.IFC2X3Package#getIfcTimeSeries_DocumentedBy()
	 * @see IFC2X3.IfcTimeSeriesReferenceRelationship#getReferencedTimeSeries
	 * @model opposite="ReferencedTimeSeries" ordered="false"
	 * @generated
	 */
	IfcTimeSeriesReferenceRelationship getDocumentedBy();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTimeSeries#getDocumentedBy <em>Documented By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documented By</em>' reference.
	 * @see #getDocumentedBy()
	 * @generated
	 */
	void setDocumentedBy(IfcTimeSeriesReferenceRelationship value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' reference.
	 * @see #setEndTime(IfcDateTimeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcTimeSeries_EndTime()
	 * @model required="true"
	 * @generated
	 */
	IfcDateTimeSelect getEndTime();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTimeSeries#getEndTime <em>End Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' reference.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' reference.
	 * @see #setStartTime(IfcDateTimeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcTimeSeries_StartTime()
	 * @model required="true"
	 * @generated
	 */
	IfcDateTimeSelect getStartTime();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTimeSeries#getStartTime <em>Start Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' reference.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(IfcUnit)
	 * @see IFC2X3.IFC2X3Package#getIfcTimeSeries_Unit()
	 * @model
	 * @generated
	 */
	IfcUnit getUnit();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTimeSeries#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(IfcUnit value);

	/**
	 * Returns the value of the '<em><b>User Defined Data Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Data Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Data Origin</em>' attribute.
	 * @see #isSetUserDefinedDataOrigin()
	 * @see #unsetUserDefinedDataOrigin()
	 * @see #setUserDefinedDataOrigin(String)
	 * @see IFC2X3.IFC2X3Package#getIfcTimeSeries_UserDefinedDataOrigin()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getUserDefinedDataOrigin();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTimeSeries#getUserDefinedDataOrigin <em>User Defined Data Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Data Origin</em>' attribute.
	 * @see #isSetUserDefinedDataOrigin()
	 * @see #unsetUserDefinedDataOrigin()
	 * @see #getUserDefinedDataOrigin()
	 * @generated
	 */
	void setUserDefinedDataOrigin(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTimeSeries#getUserDefinedDataOrigin <em>User Defined Data Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedDataOrigin()
	 * @see #getUserDefinedDataOrigin()
	 * @see #setUserDefinedDataOrigin(String)
	 * @generated
	 */
	void unsetUserDefinedDataOrigin();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTimeSeries#getUserDefinedDataOrigin <em>User Defined Data Origin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Data Origin</em>' attribute is set.
	 * @see #unsetUserDefinedDataOrigin()
	 * @see #getUserDefinedDataOrigin()
	 * @see #setUserDefinedDataOrigin(String)
	 * @generated
	 */
	boolean isSetUserDefinedDataOrigin();

	/**
	 * Returns the value of the '<em><b>Data Origin</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcDataOriginEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Origin</em>' attribute.
	 * @see IFC2X3.IfcDataOriginEnum
	 * @see #isSetDataOrigin()
	 * @see #unsetDataOrigin()
	 * @see #setDataOrigin(IfcDataOriginEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcTimeSeries_DataOrigin()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcDataOriginEnum getDataOrigin();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTimeSeries#getDataOrigin <em>Data Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Origin</em>' attribute.
	 * @see IFC2X3.IfcDataOriginEnum
	 * @see #isSetDataOrigin()
	 * @see #unsetDataOrigin()
	 * @see #getDataOrigin()
	 * @generated
	 */
	void setDataOrigin(IfcDataOriginEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTimeSeries#getDataOrigin <em>Data Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataOrigin()
	 * @see #getDataOrigin()
	 * @see #setDataOrigin(IfcDataOriginEnum)
	 * @generated
	 */
	void unsetDataOrigin();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTimeSeries#getDataOrigin <em>Data Origin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Origin</em>' attribute is set.
	 * @see #unsetDataOrigin()
	 * @see #getDataOrigin()
	 * @see #setDataOrigin(IfcDataOriginEnum)
	 * @generated
	 */
	boolean isSetDataOrigin();

	/**
	 * Returns the value of the '<em><b>Time Series Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcTimeSeriesDataTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Series Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Series Data Type</em>' attribute.
	 * @see IFC2X3.IfcTimeSeriesDataTypeEnum
	 * @see #isSetTimeSeriesDataType()
	 * @see #unsetTimeSeriesDataType()
	 * @see #setTimeSeriesDataType(IfcTimeSeriesDataTypeEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcTimeSeries_TimeSeriesDataType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcTimeSeriesDataTypeEnum getTimeSeriesDataType();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTimeSeries#getTimeSeriesDataType <em>Time Series Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Series Data Type</em>' attribute.
	 * @see IFC2X3.IfcTimeSeriesDataTypeEnum
	 * @see #isSetTimeSeriesDataType()
	 * @see #unsetTimeSeriesDataType()
	 * @see #getTimeSeriesDataType()
	 * @generated
	 */
	void setTimeSeriesDataType(IfcTimeSeriesDataTypeEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTimeSeries#getTimeSeriesDataType <em>Time Series Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeSeriesDataType()
	 * @see #getTimeSeriesDataType()
	 * @see #setTimeSeriesDataType(IfcTimeSeriesDataTypeEnum)
	 * @generated
	 */
	void unsetTimeSeriesDataType();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTimeSeries#getTimeSeriesDataType <em>Time Series Data Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Series Data Type</em>' attribute is set.
	 * @see #unsetTimeSeriesDataType()
	 * @see #getTimeSeriesDataType()
	 * @see #setTimeSeriesDataType(IfcTimeSeriesDataTypeEnum)
	 * @generated
	 */
	boolean isSetTimeSeriesDataType();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(String)
	 * @see IFC2X3.IFC2X3Package#getIfcTimeSeries_Description()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTimeSeries#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTimeSeries#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTimeSeries#getDescription <em>Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' attribute is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	boolean isSetDescription();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see IFC2X3.IFC2X3Package#getIfcTimeSeries_Name()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTimeSeries#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTimeSeries#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTimeSeries#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

} // IfcTimeSeries
