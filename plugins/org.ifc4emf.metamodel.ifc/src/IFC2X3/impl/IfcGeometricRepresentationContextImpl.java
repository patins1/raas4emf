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
import IFC2X3.IfcAxis2Placement;
import IFC2X3.IfcDirection;
import IFC2X3.IfcGeometricRepresentationContext;
import IFC2X3.IfcGeometricRepresentationSubContext;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Geometric Representation Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcGeometricRepresentationContextImpl#getCoordinateSpaceDimension <em>Coordinate Space Dimension</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcGeometricRepresentationContextImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcGeometricRepresentationContextImpl#getWorldCoordinateSystem <em>World Coordinate System</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcGeometricRepresentationContextImpl#getTrueNorth <em>True North</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcGeometricRepresentationContextImpl#getHasSubContexts <em>Has Sub Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcGeometricRepresentationContext")
@XmlSeeAlso({ IfcGeometricRepresentationSubContextImpl.class })
@XmlRootElement(name = "IfcGeometricRepresentationContextElement")
public class IfcGeometricRepresentationContextImpl extends IfcRepresentationContextImpl implements IfcGeometricRepresentationContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGeometricRepresentationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationContext();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcGeometricRepresentationSubContext> getHasSubContexts() {
		return (EList<IfcGeometricRepresentationSubContext>)eGet(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationContext_HasSubContexts(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement getWorldCoordinateSystem() {
		return (IfcAxis2Placement)eGet(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationContext_WorldCoordinateSystem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorldCoordinateSystem(IfcAxis2Placement newWorldCoordinateSystem) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationContext_WorldCoordinateSystem(), newWorldCoordinateSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getTrueNorth() {
		return (IfcDirection)eGet(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationContext_TrueNorth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrueNorth(IfcDirection newTrueNorth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationContext_TrueNorth(), newTrueNorth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPrecision() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationContext_Precision(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(Double newPrecision) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationContext_Precision(), newPrecision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrecision() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationContext_Precision());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrecision() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationContext_Precision());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCoordinateSpaceDimension() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationContext_CoordinateSpaceDimension(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinateSpaceDimension(Integer newCoordinateSpaceDimension) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationContext_CoordinateSpaceDimension(), newCoordinateSpaceDimension);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCoordinateSpaceDimension() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationContext_CoordinateSpaceDimension());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCoordinateSpaceDimension() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcGeometricRepresentationContext_CoordinateSpaceDimension());
	}

} //IfcGeometricRepresentationContextImpl
