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
import IFC2X3.IfcEllipse;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Ellipse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcEllipseImpl#getSemiAxis1 <em>Semi Axis1</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcEllipseImpl#getSemiAxis2 <em>Semi Axis2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcEllipse")
@XmlRootElement(name = "IfcEllipseElement")
public class IfcEllipseImpl extends IfcConicImpl implements IfcEllipse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcEllipseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcEllipse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSemiAxis2() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcEllipse_SemiAxis2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemiAxis2(Double newSemiAxis2) {
		eSet(IFC2X3Package.eINSTANCE.getIfcEllipse_SemiAxis2(), newSemiAxis2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSemiAxis2() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcEllipse_SemiAxis2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSemiAxis2() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcEllipse_SemiAxis2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSemiAxis1() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcEllipse_SemiAxis1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemiAxis1(Double newSemiAxis1) {
		eSet(IFC2X3Package.eINSTANCE.getIfcEllipse_SemiAxis1(), newSemiAxis1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSemiAxis1() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcEllipse_SemiAxis1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSemiAxis1() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcEllipse_SemiAxis1());
	}

} //IfcEllipseImpl
