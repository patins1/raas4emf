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
import IFC2X3.IfcColourRgb;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Colour Rgb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcColourRgbImpl#getRed <em>Red</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcColourRgbImpl#getGreen <em>Green</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcColourRgbImpl#getBlue <em>Blue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcColourRgb")
@XmlRootElement(name = "IfcColourRgbElement")
public class IfcColourRgbImpl extends IfcColourSpecificationImpl implements IfcColourRgb {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcColourRgbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcColourRgb();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBlue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcColourRgb_Blue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlue(Double newBlue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcColourRgb_Blue(), newBlue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBlue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcColourRgb_Blue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBlue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcColourRgb_Blue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getGreen() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcColourRgb_Green(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreen(Double newGreen) {
		eSet(IFC2X3Package.eINSTANCE.getIfcColourRgb_Green(), newGreen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGreen() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcColourRgb_Green());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGreen() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcColourRgb_Green());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRed() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcColourRgb_Red(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRed(Double newRed) {
		eSet(IFC2X3Package.eINSTANCE.getIfcColourRgb_Red(), newRed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRed() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcColourRgb_Red());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRed() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcColourRgb_Red());
	}

} //IfcColourRgbImpl
