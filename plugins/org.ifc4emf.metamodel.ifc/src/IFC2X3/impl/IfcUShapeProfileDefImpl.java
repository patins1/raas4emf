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
import IFC2X3.IfcUShapeProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc UShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcUShapeProfileDefImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcUShapeProfileDefImpl#getFlangeWidth <em>Flange Width</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcUShapeProfileDefImpl#getWebThickness <em>Web Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcUShapeProfileDefImpl#getFlangeThickness <em>Flange Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcUShapeProfileDefImpl#getFilletRadius <em>Fillet Radius</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcUShapeProfileDefImpl#getEdgeRadius <em>Edge Radius</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcUShapeProfileDefImpl#getFlangeSlope <em>Flange Slope</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcUShapeProfileDefImpl#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcUShapeProfileDef")
@XmlRootElement(name = "IfcUShapeProfileDefElement")
public class IfcUShapeProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcUShapeProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcUShapeProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCentreOfGravityInX() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_CentreOfGravityInX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInX(Double newCentreOfGravityInX) {
		eSet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_CentreOfGravityInX(), newCentreOfGravityInX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInX() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_CentreOfGravityInX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInX() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_CentreOfGravityInX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFlangeSlope() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_FlangeSlope(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeSlope(Double newFlangeSlope) {
		eSet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_FlangeSlope(), newFlangeSlope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlangeSlope() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_FlangeSlope());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlangeSlope() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_FlangeSlope());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getEdgeRadius() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_EdgeRadius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeRadius(Double newEdgeRadius) {
		eSet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_EdgeRadius(), newEdgeRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEdgeRadius() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_EdgeRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEdgeRadius() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_EdgeRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFilletRadius() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_FilletRadius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilletRadius(Double newFilletRadius) {
		eSet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_FilletRadius(), newFilletRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFilletRadius() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_FilletRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFilletRadius() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_FilletRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFlangeThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_FlangeThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeThickness(Double newFlangeThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_FlangeThickness(), newFlangeThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlangeThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_FlangeThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlangeThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_FlangeThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWebThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_WebThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebThickness(Double newWebThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_WebThickness(), newWebThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWebThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_WebThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWebThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_WebThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFlangeWidth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_FlangeWidth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeWidth(Double newFlangeWidth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_FlangeWidth(), newFlangeWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlangeWidth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_FlangeWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlangeWidth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_FlangeWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDepth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_Depth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(Double newDepth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_Depth(), newDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDepth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_Depth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDepth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcUShapeProfileDef_Depth());
	}

} //IfcUShapeProfileDefImpl
