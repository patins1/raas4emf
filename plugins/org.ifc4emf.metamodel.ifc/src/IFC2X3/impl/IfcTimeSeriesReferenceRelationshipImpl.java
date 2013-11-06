/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcDocumentSelect;
import IFC2X3.IfcTimeSeries;
import IFC2X3.IfcTimeSeriesReferenceRelationship;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Time Series Reference Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTimeSeriesReferenceRelationshipImpl#getReferencedTimeSeries <em>Referenced Time Series</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTimeSeriesReferenceRelationshipImpl#getTimeSeriesReferences <em>Time Series References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTimeSeriesReferenceRelationship")
@XmlRootElement(name = "IfcTimeSeriesReferenceRelationshipElement")
public class IfcTimeSeriesReferenceRelationshipImpl extends CDOObjectImpl implements IfcTimeSeriesReferenceRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTimeSeriesReferenceRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTimeSeriesReferenceRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getReferencedTimeSeries() {
		return (IfcTimeSeries)eGet(IFC2X3Package.eINSTANCE.getIfcTimeSeriesReferenceRelationship_ReferencedTimeSeries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedTimeSeries(IfcTimeSeries newReferencedTimeSeries) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTimeSeriesReferenceRelationship_ReferencedTimeSeries(), newReferencedTimeSeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcDocumentSelect> getTimeSeriesReferences() {
		return (EList<IfcDocumentSelect>)eGet(IFC2X3Package.eINSTANCE.getIfcTimeSeriesReferenceRelationship_TimeSeriesReferences(), true);
	}

} //IfcTimeSeriesReferenceRelationshipImpl
