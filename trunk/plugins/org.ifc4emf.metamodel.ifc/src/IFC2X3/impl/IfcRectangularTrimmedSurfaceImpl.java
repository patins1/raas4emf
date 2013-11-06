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
import IFC2X3.IfcRectangularTrimmedSurface;
import IFC2X3.IfcSurface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rectangular Trimmed Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRectangularTrimmedSurfaceImpl#getBasisSurface <em>Basis Surface</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRectangularTrimmedSurfaceImpl#getU1 <em>U1</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRectangularTrimmedSurfaceImpl#getV1 <em>V1</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRectangularTrimmedSurfaceImpl#getU2 <em>U2</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRectangularTrimmedSurfaceImpl#getV2 <em>V2</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRectangularTrimmedSurfaceImpl#getUsense <em>Usense</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRectangularTrimmedSurfaceImpl#getVsense <em>Vsense</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRectangularTrimmedSurface")
@XmlRootElement(name = "IfcRectangularTrimmedSurfaceElement")
public class IfcRectangularTrimmedSurfaceImpl extends IfcBoundedSurfaceImpl implements IfcRectangularTrimmedSurface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRectangularTrimmedSurfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurface getBasisSurface() {
		return (IfcSurface)eGet(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_BasisSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasisSurface(IfcSurface newBasisSurface) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_BasisSurface(), newBasisSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getVsense() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_Vsense(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVsense(Boolean newVsense) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_Vsense(), newVsense);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVsense() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_Vsense());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVsense() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_Vsense());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getUsense() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_Usense(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsense(Boolean newUsense) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_Usense(), newUsense);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUsense() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_Usense());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUsense() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_Usense());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getV2() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_V2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV2(Double newV2) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_V2(), newV2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetV2() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_V2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetV2() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_V2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getU2() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_U2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setU2(Double newU2) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_U2(), newU2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetU2() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_U2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetU2() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_U2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getV1() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_V1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV1(Double newV1) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_V1(), newV1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetV1() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_V1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetV1() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_V1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getU1() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_U1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setU1(Double newU1) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_U1(), newU1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetU1() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_U1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetU1() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRectangularTrimmedSurface_U1());
	}

} //IfcRectangularTrimmedSurfaceImpl
