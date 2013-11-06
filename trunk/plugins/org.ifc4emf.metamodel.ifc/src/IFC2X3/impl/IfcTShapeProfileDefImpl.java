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
import IFC2X3.IfcTShapeProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc TShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTShapeProfileDefImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTShapeProfileDefImpl#getFlangeWidth <em>Flange Width</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTShapeProfileDefImpl#getWebThickness <em>Web Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTShapeProfileDefImpl#getFlangeThickness <em>Flange Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTShapeProfileDefImpl#getFilletRadius <em>Fillet Radius</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTShapeProfileDefImpl#getFlangeEdgeRadius <em>Flange Edge Radius</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTShapeProfileDefImpl#getWebEdgeRadius <em>Web Edge Radius</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTShapeProfileDefImpl#getWebSlope <em>Web Slope</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTShapeProfileDefImpl#getFlangeSlope <em>Flange Slope</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTShapeProfileDefImpl#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTShapeProfileDef")
@XmlRootElement(name = "IfcTShapeProfileDefElement")
public class IfcTShapeProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcTShapeProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTShapeProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCentreOfGravityInY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_CentreOfGravityInY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInY(Double newCentreOfGravityInY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_CentreOfGravityInY(), newCentreOfGravityInY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_CentreOfGravityInY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_CentreOfGravityInY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFlangeSlope() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_FlangeSlope(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeSlope(Double newFlangeSlope) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_FlangeSlope(), newFlangeSlope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlangeSlope() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_FlangeSlope());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlangeSlope() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_FlangeSlope());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWebSlope() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_WebSlope(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebSlope(Double newWebSlope) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_WebSlope(), newWebSlope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWebSlope() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_WebSlope());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWebSlope() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_WebSlope());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWebEdgeRadius() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_WebEdgeRadius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebEdgeRadius(Double newWebEdgeRadius) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_WebEdgeRadius(), newWebEdgeRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWebEdgeRadius() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_WebEdgeRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWebEdgeRadius() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_WebEdgeRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFlangeEdgeRadius() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_FlangeEdgeRadius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeEdgeRadius(Double newFlangeEdgeRadius) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_FlangeEdgeRadius(), newFlangeEdgeRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlangeEdgeRadius() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_FlangeEdgeRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlangeEdgeRadius() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_FlangeEdgeRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFilletRadius() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_FilletRadius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilletRadius(Double newFilletRadius) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_FilletRadius(), newFilletRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFilletRadius() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_FilletRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFilletRadius() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_FilletRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFlangeThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_FlangeThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeThickness(Double newFlangeThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_FlangeThickness(), newFlangeThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlangeThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_FlangeThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlangeThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_FlangeThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWebThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_WebThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebThickness(Double newWebThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_WebThickness(), newWebThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWebThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_WebThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWebThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_WebThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFlangeWidth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_FlangeWidth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeWidth(Double newFlangeWidth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_FlangeWidth(), newFlangeWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlangeWidth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_FlangeWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlangeWidth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_FlangeWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDepth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_Depth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(Double newDepth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_Depth(), newDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDepth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_Depth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDepth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTShapeProfileDef_Depth());
	}

} //IfcTShapeProfileDefImpl
