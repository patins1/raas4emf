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
import IFC2X3.IfcCraneRailFShapeProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Crane Rail FShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcCraneRailFShapeProfileDefImpl#getOverallHeight <em>Overall Height</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCraneRailFShapeProfileDefImpl#getHeadWidth <em>Head Width</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCraneRailFShapeProfileDefImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCraneRailFShapeProfileDefImpl#getHeadDepth2 <em>Head Depth2</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCraneRailFShapeProfileDefImpl#getHeadDepth3 <em>Head Depth3</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCraneRailFShapeProfileDefImpl#getWebThickness <em>Web Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCraneRailFShapeProfileDefImpl#getBaseDepth1 <em>Base Depth1</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCraneRailFShapeProfileDefImpl#getBaseDepth2 <em>Base Depth2</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCraneRailFShapeProfileDefImpl#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCraneRailFShapeProfileDef")
@XmlRootElement(name = "IfcCraneRailFShapeProfileDefElement")
public class IfcCraneRailFShapeProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcCraneRailFShapeProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCraneRailFShapeProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCentreOfGravityInY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_CentreOfGravityInY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInY(Double newCentreOfGravityInY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_CentreOfGravityInY(), newCentreOfGravityInY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_CentreOfGravityInY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_CentreOfGravityInY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBaseDepth2() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_BaseDepth2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseDepth2(Double newBaseDepth2) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_BaseDepth2(), newBaseDepth2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBaseDepth2() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_BaseDepth2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBaseDepth2() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_BaseDepth2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBaseDepth1() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_BaseDepth1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseDepth1(Double newBaseDepth1) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_BaseDepth1(), newBaseDepth1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBaseDepth1() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_BaseDepth1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBaseDepth1() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_BaseDepth1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWebThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_WebThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebThickness(Double newWebThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_WebThickness(), newWebThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWebThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_WebThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWebThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_WebThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHeadDepth3() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_HeadDepth3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadDepth3(Double newHeadDepth3) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_HeadDepth3(), newHeadDepth3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHeadDepth3() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_HeadDepth3());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHeadDepth3() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_HeadDepth3());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHeadDepth2() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_HeadDepth2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadDepth2(Double newHeadDepth2) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_HeadDepth2(), newHeadDepth2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHeadDepth2() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_HeadDepth2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHeadDepth2() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_HeadDepth2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRadius() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_Radius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(Double newRadius) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_Radius(), newRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRadius() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_Radius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRadius() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_Radius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHeadWidth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_HeadWidth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadWidth(Double newHeadWidth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_HeadWidth(), newHeadWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHeadWidth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_HeadWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHeadWidth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_HeadWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getOverallHeight() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_OverallHeight(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallHeight(Double newOverallHeight) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_OverallHeight(), newOverallHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverallHeight() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_OverallHeight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverallHeight() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCraneRailFShapeProfileDef_OverallHeight());
	}

} //IfcCraneRailFShapeProfileDefImpl
