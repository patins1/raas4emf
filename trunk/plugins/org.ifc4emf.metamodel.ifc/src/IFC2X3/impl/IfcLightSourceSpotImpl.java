/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcDirection;
import IFC2X3.IfcLightSourceSpot;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Light Source Spot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcLightSourceSpotImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLightSourceSpotImpl#getConcentrationExponent <em>Concentration Exponent</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLightSourceSpotImpl#getSpreadAngle <em>Spread Angle</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLightSourceSpotImpl#getBeamWidthAngle <em>Beam Width Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcLightSourceSpot")
@XmlRootElement(name = "IfcLightSourceSpotElement")
public class IfcLightSourceSpotImpl extends IfcLightSourcePositionalImpl implements IfcLightSourceSpot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLightSourceSpotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcLightSourceSpot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getOrientation() {
		return (IfcDirection)eGet(IFC2X3Package.eINSTANCE.getIfcLightSourceSpot_Orientation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(IfcDirection newOrientation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLightSourceSpot_Orientation(), newOrientation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBeamWidthAngle() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcLightSourceSpot_BeamWidthAngle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeamWidthAngle(Double newBeamWidthAngle) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLightSourceSpot_BeamWidthAngle(), newBeamWidthAngle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBeamWidthAngle() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcLightSourceSpot_BeamWidthAngle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBeamWidthAngle() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcLightSourceSpot_BeamWidthAngle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSpreadAngle() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcLightSourceSpot_SpreadAngle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpreadAngle(Double newSpreadAngle) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLightSourceSpot_SpreadAngle(), newSpreadAngle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpreadAngle() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcLightSourceSpot_SpreadAngle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpreadAngle() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcLightSourceSpot_SpreadAngle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getConcentrationExponent() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcLightSourceSpot_ConcentrationExponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcentrationExponent(Double newConcentrationExponent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLightSourceSpot_ConcentrationExponent(), newConcentrationExponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConcentrationExponent() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcLightSourceSpot_ConcentrationExponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConcentrationExponent() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcLightSourceSpot_ConcentrationExponent());
	}

} //IfcLightSourceSpotImpl
