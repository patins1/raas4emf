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
import IFC2X3.IfcTrapeziumProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Trapezium Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTrapeziumProfileDefImpl#getBottomXDim <em>Bottom XDim</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTrapeziumProfileDefImpl#getTopXDim <em>Top XDim</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTrapeziumProfileDefImpl#getYDim <em>YDim</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTrapeziumProfileDefImpl#getTopXOffset <em>Top XOffset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTrapeziumProfileDef")
@XmlRootElement(name = "IfcTrapeziumProfileDefElement")
public class IfcTrapeziumProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcTrapeziumProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTrapeziumProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTrapeziumProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTopXOffset() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTrapeziumProfileDef_TopXOffset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopXOffset(Double newTopXOffset) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTrapeziumProfileDef_TopXOffset(), newTopXOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTopXOffset() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTrapeziumProfileDef_TopXOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTopXOffset() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTrapeziumProfileDef_TopXOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getYDim() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTrapeziumProfileDef_YDim(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYDim(Double newYDim) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTrapeziumProfileDef_YDim(), newYDim);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetYDim() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTrapeziumProfileDef_YDim());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetYDim() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTrapeziumProfileDef_YDim());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTopXDim() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTrapeziumProfileDef_TopXDim(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopXDim(Double newTopXDim) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTrapeziumProfileDef_TopXDim(), newTopXDim);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTopXDim() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTrapeziumProfileDef_TopXDim());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTopXDim() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTrapeziumProfileDef_TopXDim());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBottomXDim() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTrapeziumProfileDef_BottomXDim(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottomXDim(Double newBottomXDim) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTrapeziumProfileDef_BottomXDim(), newBottomXDim);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBottomXDim() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTrapeziumProfileDef_BottomXDim());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBottomXDim() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTrapeziumProfileDef_BottomXDim());
	}

} //IfcTrapeziumProfileDefImpl
