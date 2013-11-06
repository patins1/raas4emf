/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcDraughtingCallout;
import IFC2X3.IfcDraughtingCalloutElement;
import IFC2X3.IfcDraughtingCalloutRelationship;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Draughting Callout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcDraughtingCalloutImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDraughtingCalloutImpl#getIsRelatedFromCallout <em>Is Related From Callout</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDraughtingCalloutImpl#getIsRelatedToCallout <em>Is Related To Callout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDraughtingCallout")
@XmlSeeAlso({ IfcStructuredDimensionCalloutImpl.class, IfcDimensionCurveDirectedCalloutImpl.class, IfcAngularDimensionImpl.class, IfcDiameterDimensionImpl.class, IfcRadiusDimensionImpl.class, IfcLinearDimensionImpl.class })
@XmlRootElement(name = "IfcDraughtingCalloutElement")
public class IfcDraughtingCalloutImpl extends IfcGeometricRepresentationItemImpl implements IfcDraughtingCallout {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDraughtingCalloutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDraughtingCallout();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcDraughtingCalloutRelationship> getIsRelatedFromCallout() {
		return (EList<IfcDraughtingCalloutRelationship>)eGet(IFC2X3Package.eINSTANCE.getIfcDraughtingCallout_IsRelatedFromCallout(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcDraughtingCalloutRelationship> getIsRelatedToCallout() {
		return (EList<IfcDraughtingCalloutRelationship>)eGet(IFC2X3Package.eINSTANCE.getIfcDraughtingCallout_IsRelatedToCallout(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcDraughtingCalloutElement> getContents() {
		return (EList<IfcDraughtingCalloutElement>)eGet(IFC2X3Package.eINSTANCE.getIfcDraughtingCallout_Contents(), true);
	}

} //IfcDraughtingCalloutImpl
