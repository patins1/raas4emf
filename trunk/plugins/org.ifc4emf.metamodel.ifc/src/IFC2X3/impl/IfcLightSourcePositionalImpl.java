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
import IFC2X3.IfcCartesianPoint;
import IFC2X3.IfcLightSourcePositional;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Light Source Positional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcLightSourcePositionalImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLightSourcePositionalImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLightSourcePositionalImpl#getConstantAttenuation <em>Constant Attenuation</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLightSourcePositionalImpl#getDistanceAttenuation <em>Distance Attenuation</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLightSourcePositionalImpl#getQuadricAttenuation <em>Quadric Attenuation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcLightSourcePositional")
@XmlSeeAlso({ IfcLightSourceSpotImpl.class })
@XmlRootElement(name = "IfcLightSourcePositionalElement")
public class IfcLightSourcePositionalImpl extends IfcLightSourceImpl implements IfcLightSourcePositional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLightSourcePositionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcLightSourcePositional();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianPoint getPosition() {
		return (IfcCartesianPoint)eGet(IFC2X3Package.eINSTANCE.getIfcLightSourcePositional_Position(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(IfcCartesianPoint newPosition) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLightSourcePositional_Position(), newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getQuadricAttenuation() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcLightSourcePositional_QuadricAttenuation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuadricAttenuation(Double newQuadricAttenuation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLightSourcePositional_QuadricAttenuation(), newQuadricAttenuation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuadricAttenuation() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcLightSourcePositional_QuadricAttenuation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuadricAttenuation() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcLightSourcePositional_QuadricAttenuation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDistanceAttenuation() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcLightSourcePositional_DistanceAttenuation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceAttenuation(Double newDistanceAttenuation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLightSourcePositional_DistanceAttenuation(), newDistanceAttenuation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDistanceAttenuation() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcLightSourcePositional_DistanceAttenuation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDistanceAttenuation() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcLightSourcePositional_DistanceAttenuation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getConstantAttenuation() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcLightSourcePositional_ConstantAttenuation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstantAttenuation(Double newConstantAttenuation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLightSourcePositional_ConstantAttenuation(), newConstantAttenuation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConstantAttenuation() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcLightSourcePositional_ConstantAttenuation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstantAttenuation() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcLightSourcePositional_ConstantAttenuation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRadius() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcLightSourcePositional_Radius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(Double newRadius) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLightSourcePositional_Radius(), newRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRadius() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcLightSourcePositional_Radius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRadius() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcLightSourcePositional_Radius());
	}

} //IfcLightSourcePositionalImpl
