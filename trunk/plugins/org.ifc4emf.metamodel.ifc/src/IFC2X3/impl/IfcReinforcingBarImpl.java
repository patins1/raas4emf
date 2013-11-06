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
import IFC2X3.IfcReinforcingBar;
import IFC2X3.IfcReinforcingBarRoleEnum;
import IFC2X3.IfcReinforcingBarSurfaceEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Reinforcing Bar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcReinforcingBarImpl#getNominalDiameter <em>Nominal Diameter</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcReinforcingBarImpl#getCrossSectionArea <em>Cross Section Area</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcReinforcingBarImpl#getBarLength <em>Bar Length</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcReinforcingBarImpl#getBarRole <em>Bar Role</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcReinforcingBarImpl#getBarSurface <em>Bar Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcReinforcingBar")
@XmlRootElement(name = "IfcReinforcingBarElement")
public class IfcReinforcingBarImpl extends IfcReinforcingElementImpl implements IfcReinforcingBar {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcReinforcingBarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcReinforcingBar();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingBarSurfaceEnum getBarSurface() {
		return (IfcReinforcingBarSurfaceEnum)eGet(IFC2X3Package.eINSTANCE.getIfcReinforcingBar_BarSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarSurface(IfcReinforcingBarSurfaceEnum newBarSurface) {
		eSet(IFC2X3Package.eINSTANCE.getIfcReinforcingBar_BarSurface(), newBarSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBarSurface() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcReinforcingBar_BarSurface());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBarSurface() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcReinforcingBar_BarSurface());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingBarRoleEnum getBarRole() {
		return (IfcReinforcingBarRoleEnum)eGet(IFC2X3Package.eINSTANCE.getIfcReinforcingBar_BarRole(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarRole(IfcReinforcingBarRoleEnum newBarRole) {
		eSet(IFC2X3Package.eINSTANCE.getIfcReinforcingBar_BarRole(), newBarRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBarRole() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcReinforcingBar_BarRole());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBarRole() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcReinforcingBar_BarRole());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBarLength() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcReinforcingBar_BarLength(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarLength(Double newBarLength) {
		eSet(IFC2X3Package.eINSTANCE.getIfcReinforcingBar_BarLength(), newBarLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBarLength() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcReinforcingBar_BarLength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBarLength() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcReinforcingBar_BarLength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCrossSectionArea() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcReinforcingBar_CrossSectionArea(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrossSectionArea(Double newCrossSectionArea) {
		eSet(IFC2X3Package.eINSTANCE.getIfcReinforcingBar_CrossSectionArea(), newCrossSectionArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCrossSectionArea() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcReinforcingBar_CrossSectionArea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCrossSectionArea() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcReinforcingBar_CrossSectionArea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getNominalDiameter() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcReinforcingBar_NominalDiameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalDiameter(Double newNominalDiameter) {
		eSet(IFC2X3Package.eINSTANCE.getIfcReinforcingBar_NominalDiameter(), newNominalDiameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNominalDiameter() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcReinforcingBar_NominalDiameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNominalDiameter() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcReinforcingBar_NominalDiameter());
	}

} //IfcReinforcingBarImpl
