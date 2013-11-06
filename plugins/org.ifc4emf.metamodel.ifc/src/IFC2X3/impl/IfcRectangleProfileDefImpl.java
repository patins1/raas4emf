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
import IFC2X3.IfcRectangleProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rectangle Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRectangleProfileDefImpl#getXDim <em>XDim</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRectangleProfileDefImpl#getYDim <em>YDim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRectangleProfileDef")
@XmlSeeAlso({ IfcRectangleHollowProfileDefImpl.class, IfcRoundedRectangleProfileDefImpl.class })
@XmlRootElement(name = "IfcRectangleProfileDefElement")
public class IfcRectangleProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcRectangleProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRectangleProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRectangleProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getYDim() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRectangleProfileDef_YDim(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYDim(Double newYDim) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRectangleProfileDef_YDim(), newYDim);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetYDim() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRectangleProfileDef_YDim());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetYDim() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRectangleProfileDef_YDim());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getXDim() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRectangleProfileDef_XDim(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXDim(Double newXDim) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRectangleProfileDef_XDim(), newXDim);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetXDim() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRectangleProfileDef_XDim());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetXDim() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRectangleProfileDef_XDim());
	}

} //IfcRectangleProfileDefImpl
