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
import IFC2X3.IfcColourRgb;
import IFC2X3.IfcLightSource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Light Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcLightSourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLightSourceImpl#getLightColour <em>Light Colour</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLightSourceImpl#getAmbientIntensity <em>Ambient Intensity</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLightSourceImpl#getIntensity <em>Intensity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcLightSource")
@XmlSeeAlso({ IfcLightSourceAmbientImpl.class, IfcLightSourceGoniometricImpl.class, IfcLightSourcePositionalImpl.class, IfcLightSourceSpotImpl.class, IfcLightSourceDirectionalImpl.class })
@XmlRootElement(name = "IfcLightSourceElement")
public class IfcLightSourceImpl extends IfcGeometricRepresentationItemImpl implements IfcLightSource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLightSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcLightSource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgb getLightColour() {
		return (IfcColourRgb)eGet(IFC2X3Package.eINSTANCE.getIfcLightSource_LightColour(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightColour(IfcColourRgb newLightColour) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLightSource_LightColour(), newLightColour);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIntensity() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcLightSource_Intensity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntensity(Double newIntensity) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLightSource_Intensity(), newIntensity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIntensity() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcLightSource_Intensity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIntensity() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcLightSource_Intensity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAmbientIntensity() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcLightSource_AmbientIntensity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmbientIntensity(Double newAmbientIntensity) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLightSource_AmbientIntensity(), newAmbientIntensity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAmbientIntensity() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcLightSource_AmbientIntensity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAmbientIntensity() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcLightSource_AmbientIntensity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcLightSource_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLightSource_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcLightSource_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcLightSource_Name());
	}

} //IfcLightSourceImpl
