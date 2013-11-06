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
import IFC2X3.IfcAxis2Placement3D;
import IFC2X3.IfcColourRgb;
import IFC2X3.IfcLightDistributionDataSourceSelect;
import IFC2X3.IfcLightEmissionSourceEnum;
import IFC2X3.IfcLightSourceGoniometric;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Light Source Goniometric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcLightSourceGoniometricImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLightSourceGoniometricImpl#getColourAppearance <em>Colour Appearance</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLightSourceGoniometricImpl#getColourTemperature <em>Colour Temperature</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLightSourceGoniometricImpl#getLuminousFlux <em>Luminous Flux</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLightSourceGoniometricImpl#getLightEmissionSource <em>Light Emission Source</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLightSourceGoniometricImpl#getLightDistributionDataSource <em>Light Distribution Data Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcLightSourceGoniometric")
@XmlRootElement(name = "IfcLightSourceGoniometricElement")
public class IfcLightSourceGoniometricImpl extends IfcLightSourceImpl implements IfcLightSourceGoniometric {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLightSourceGoniometricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcLightSourceGoniometric();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightDistributionDataSourceSelect getLightDistributionDataSource() {
		return (IfcLightDistributionDataSourceSelect)eGet(IFC2X3Package.eINSTANCE.getIfcLightSourceGoniometric_LightDistributionDataSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightDistributionDataSource(IfcLightDistributionDataSourceSelect newLightDistributionDataSource) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLightSourceGoniometric_LightDistributionDataSource(), newLightDistributionDataSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgb getColourAppearance() {
		return (IfcColourRgb)eGet(IFC2X3Package.eINSTANCE.getIfcLightSourceGoniometric_ColourAppearance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColourAppearance(IfcColourRgb newColourAppearance) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLightSourceGoniometric_ColourAppearance(), newColourAppearance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement3D getPosition() {
		return (IfcAxis2Placement3D)eGet(IFC2X3Package.eINSTANCE.getIfcLightSourceGoniometric_Position(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(IfcAxis2Placement3D newPosition) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLightSourceGoniometric_Position(), newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightEmissionSourceEnum getLightEmissionSource() {
		return (IfcLightEmissionSourceEnum)eGet(IFC2X3Package.eINSTANCE.getIfcLightSourceGoniometric_LightEmissionSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightEmissionSource(IfcLightEmissionSourceEnum newLightEmissionSource) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLightSourceGoniometric_LightEmissionSource(), newLightEmissionSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLightEmissionSource() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcLightSourceGoniometric_LightEmissionSource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLightEmissionSource() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcLightSourceGoniometric_LightEmissionSource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLuminousFlux() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcLightSourceGoniometric_LuminousFlux(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLuminousFlux(Double newLuminousFlux) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLightSourceGoniometric_LuminousFlux(), newLuminousFlux);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLuminousFlux() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcLightSourceGoniometric_LuminousFlux());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLuminousFlux() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcLightSourceGoniometric_LuminousFlux());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getColourTemperature() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcLightSourceGoniometric_ColourTemperature(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColourTemperature(Double newColourTemperature) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLightSourceGoniometric_ColourTemperature(), newColourTemperature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetColourTemperature() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcLightSourceGoniometric_ColourTemperature());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetColourTemperature() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcLightSourceGoniometric_ColourTemperature());
	}

} //IfcLightSourceGoniometricImpl
