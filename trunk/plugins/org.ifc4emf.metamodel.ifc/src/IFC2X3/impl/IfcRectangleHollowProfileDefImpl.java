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
import IFC2X3.IfcRectangleHollowProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rectangle Hollow Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRectangleHollowProfileDefImpl#getWallThickness <em>Wall Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRectangleHollowProfileDefImpl#getInnerFilletRadius <em>Inner Fillet Radius</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRectangleHollowProfileDefImpl#getOuterFilletRadius <em>Outer Fillet Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRectangleHollowProfileDef")
@XmlRootElement(name = "IfcRectangleHollowProfileDefElement")
public class IfcRectangleHollowProfileDefImpl extends IfcRectangleProfileDefImpl implements IfcRectangleHollowProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRectangleHollowProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRectangleHollowProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getOuterFilletRadius() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRectangleHollowProfileDef_OuterFilletRadius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterFilletRadius(Double newOuterFilletRadius) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRectangleHollowProfileDef_OuterFilletRadius(), newOuterFilletRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOuterFilletRadius() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRectangleHollowProfileDef_OuterFilletRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOuterFilletRadius() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRectangleHollowProfileDef_OuterFilletRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getInnerFilletRadius() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRectangleHollowProfileDef_InnerFilletRadius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerFilletRadius(Double newInnerFilletRadius) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRectangleHollowProfileDef_InnerFilletRadius(), newInnerFilletRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInnerFilletRadius() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRectangleHollowProfileDef_InnerFilletRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInnerFilletRadius() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRectangleHollowProfileDef_InnerFilletRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWallThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRectangleHollowProfileDef_WallThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWallThickness(Double newWallThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRectangleHollowProfileDef_WallThickness(), newWallThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWallThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRectangleHollowProfileDef_WallThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWallThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRectangleHollowProfileDef_WallThickness());
	}

} //IfcRectangleHollowProfileDefImpl
