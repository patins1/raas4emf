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
import IFC2X3.IfcCShapeProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc CShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcCShapeProfileDefImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCShapeProfileDefImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCShapeProfileDefImpl#getWallThickness <em>Wall Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCShapeProfileDefImpl#getGirth <em>Girth</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCShapeProfileDefImpl#getInternalFilletRadius <em>Internal Fillet Radius</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCShapeProfileDefImpl#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCShapeProfileDef")
@XmlRootElement(name = "IfcCShapeProfileDefElement")
public class IfcCShapeProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcCShapeProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCShapeProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCentreOfGravityInX() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_CentreOfGravityInX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInX(Double newCentreOfGravityInX) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_CentreOfGravityInX(), newCentreOfGravityInX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInX() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_CentreOfGravityInX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInX() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_CentreOfGravityInX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getInternalFilletRadius() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_InternalFilletRadius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalFilletRadius(Double newInternalFilletRadius) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_InternalFilletRadius(), newInternalFilletRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInternalFilletRadius() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_InternalFilletRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInternalFilletRadius() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_InternalFilletRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getGirth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_Girth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGirth(Double newGirth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_Girth(), newGirth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGirth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_Girth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGirth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_Girth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWallThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_WallThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWallThickness(Double newWallThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_WallThickness(), newWallThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWallThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_WallThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWallThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_WallThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWidth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_Width(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(Double newWidth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_Width(), newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWidth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_Width());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWidth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_Width());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDepth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_Depth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(Double newDepth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_Depth(), newDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDepth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_Depth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDepth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCShapeProfileDef_Depth());
	}

} //IfcCShapeProfileDefImpl
