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
import IFC2X3.IfcCraneRailAShapeProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Crane Rail AShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcCraneRailAShapeProfileDefImpl#getOverallHeight <em>Overall Height</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCraneRailAShapeProfileDefImpl#getBaseWidth2 <em>Base Width2</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCraneRailAShapeProfileDefImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCraneRailAShapeProfileDefImpl#getHeadWidth <em>Head Width</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCraneRailAShapeProfileDefImpl#getHeadDepth2 <em>Head Depth2</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCraneRailAShapeProfileDefImpl#getHeadDepth3 <em>Head Depth3</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCraneRailAShapeProfileDefImpl#getWebThickness <em>Web Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCraneRailAShapeProfileDefImpl#getBaseWidth4 <em>Base Width4</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCraneRailAShapeProfileDefImpl#getBaseDepth1 <em>Base Depth1</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCraneRailAShapeProfileDefImpl#getBaseDepth2 <em>Base Depth2</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCraneRailAShapeProfileDefImpl#getBaseDepth3 <em>Base Depth3</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCraneRailAShapeProfileDefImpl#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCraneRailAShapeProfileDef")
@XmlRootElement(name = "IfcCraneRailAShapeProfileDefElement")
public class IfcCraneRailAShapeProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcCraneRailAShapeProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCraneRailAShapeProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCentreOfGravityInY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_CentreOfGravityInY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInY(Double newCentreOfGravityInY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_CentreOfGravityInY(), newCentreOfGravityInY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_CentreOfGravityInY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_CentreOfGravityInY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBaseDepth3() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseDepth3(Double newBaseDepth3) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth3(), newBaseDepth3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBaseDepth3() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth3());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBaseDepth3() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth3());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBaseDepth2() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseDepth2(Double newBaseDepth2) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth2(), newBaseDepth2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBaseDepth2() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBaseDepth2() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBaseDepth1() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseDepth1(Double newBaseDepth1) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth1(), newBaseDepth1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBaseDepth1() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBaseDepth1() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBaseWidth4() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth4(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseWidth4(Double newBaseWidth4) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth4(), newBaseWidth4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBaseWidth4() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth4());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBaseWidth4() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth4());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWebThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_WebThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebThickness(Double newWebThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_WebThickness(), newWebThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWebThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_WebThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWebThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_WebThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHeadDepth3() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadDepth3(Double newHeadDepth3) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth3(), newHeadDepth3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHeadDepth3() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth3());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHeadDepth3() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth3());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHeadDepth2() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadDepth2(Double newHeadDepth2) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth2(), newHeadDepth2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHeadDepth2() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHeadDepth2() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHeadWidth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadWidth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadWidth(Double newHeadWidth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadWidth(), newHeadWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHeadWidth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHeadWidth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRadius() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_Radius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(Double newRadius) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_Radius(), newRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRadius() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_Radius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRadius() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_Radius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBaseWidth2() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseWidth2(Double newBaseWidth2) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth2(), newBaseWidth2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBaseWidth2() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBaseWidth2() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getOverallHeight() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_OverallHeight(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallHeight(Double newOverallHeight) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_OverallHeight(), newOverallHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverallHeight() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_OverallHeight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverallHeight() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_OverallHeight());
	}

} //IfcCraneRailAShapeProfileDefImpl
