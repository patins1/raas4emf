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
import IFC2X3.IfcCurveStyle;
import IFC2X3.IfcFillAreaStyle;
import IFC2X3.IfcNullStyle;
import IFC2X3.IfcPresentationStyleSelect;
import IFC2X3.IfcSurfaceStyle;
import IFC2X3.IfcSymbolStyle;
import IFC2X3.IfcTextStyle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Presentation Style Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcPresentationStyleSelectImpl#getIfcNullStylevalue <em>Ifc Null Stylevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPresentationStyleSelectImpl#getIfcSurfaceStylevalue <em>Ifc Surface Stylevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPresentationStyleSelectImpl#getIfcTextStylevalue <em>Ifc Text Stylevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPresentationStyleSelectImpl#getIfcFillAreaStylevalue <em>Ifc Fill Area Stylevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPresentationStyleSelectImpl#getIfcSymbolStylevalue <em>Ifc Symbol Stylevalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPresentationStyleSelectImpl#getIfcCurveStylevalue <em>Ifc Curve Stylevalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPresentationStyleSelect")
@XmlRootElement(name = "IfcPresentationStyleSelectElement")
public class IfcPresentationStyleSelectImpl extends CDOObjectImpl implements IfcPresentationStyleSelect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPresentationStyleSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPresentationStyleSelect();
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
	public IfcNullStyle getIfcNullStylevalue() {
		return (IfcNullStyle)eGet(IFC2X3Package.eINSTANCE.getIfcPresentationStyleSelect_IfcNullStylevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcNullStylevalue(IfcNullStyle newIfcNullStylevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPresentationStyleSelect_IfcNullStylevalue(), newIfcNullStylevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcNullStylevalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPresentationStyleSelect_IfcNullStylevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcNullStylevalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPresentationStyleSelect_IfcNullStylevalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextStyle getIfcTextStylevalue() {
		return (IfcTextStyle)eGet(IFC2X3Package.eINSTANCE.getIfcPresentationStyleSelect_IfcTextStylevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTextStylevalue(IfcTextStyle newIfcTextStylevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPresentationStyleSelect_IfcTextStylevalue(), newIfcTextStylevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceStyle getIfcSurfaceStylevalue() {
		return (IfcSurfaceStyle)eGet(IFC2X3Package.eINSTANCE.getIfcPresentationStyleSelect_IfcSurfaceStylevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSurfaceStylevalue(IfcSurfaceStyle newIfcSurfaceStylevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPresentationStyleSelect_IfcSurfaceStylevalue(), newIfcSurfaceStylevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveStyle getIfcCurveStylevalue() {
		return (IfcCurveStyle)eGet(IFC2X3Package.eINSTANCE.getIfcPresentationStyleSelect_IfcCurveStylevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcCurveStylevalue(IfcCurveStyle newIfcCurveStylevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPresentationStyleSelect_IfcCurveStylevalue(), newIfcCurveStylevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSymbolStyle getIfcSymbolStylevalue() {
		return (IfcSymbolStyle)eGet(IFC2X3Package.eINSTANCE.getIfcPresentationStyleSelect_IfcSymbolStylevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSymbolStylevalue(IfcSymbolStyle newIfcSymbolStylevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPresentationStyleSelect_IfcSymbolStylevalue(), newIfcSymbolStylevalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFillAreaStyle getIfcFillAreaStylevalue() {
		return (IfcFillAreaStyle)eGet(IFC2X3Package.eINSTANCE.getIfcPresentationStyleSelect_IfcFillAreaStylevalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcFillAreaStylevalue(IfcFillAreaStyle newIfcFillAreaStylevalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPresentationStyleSelect_IfcFillAreaStylevalue(), newIfcFillAreaStylevalue);
	}

} //IfcPresentationStyleSelectImpl
