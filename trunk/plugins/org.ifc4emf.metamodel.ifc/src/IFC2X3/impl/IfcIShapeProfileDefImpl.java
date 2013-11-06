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
import IFC2X3.IfcIShapeProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc IShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcIShapeProfileDefImpl#getOverallWidth <em>Overall Width</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcIShapeProfileDefImpl#getOverallDepth <em>Overall Depth</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcIShapeProfileDefImpl#getWebThickness <em>Web Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcIShapeProfileDefImpl#getFlangeThickness <em>Flange Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcIShapeProfileDefImpl#getFilletRadius <em>Fillet Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcIShapeProfileDef")
@XmlSeeAlso({ IfcAsymmetricIShapeProfileDefImpl.class })
@XmlRootElement(name = "IfcIShapeProfileDefElement")
public class IfcIShapeProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcIShapeProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcIShapeProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcIShapeProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFilletRadius() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcIShapeProfileDef_FilletRadius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilletRadius(Double newFilletRadius) {
		eSet(IFC2X3Package.eINSTANCE.getIfcIShapeProfileDef_FilletRadius(), newFilletRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFilletRadius() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcIShapeProfileDef_FilletRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFilletRadius() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcIShapeProfileDef_FilletRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFlangeThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcIShapeProfileDef_FlangeThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeThickness(Double newFlangeThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcIShapeProfileDef_FlangeThickness(), newFlangeThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlangeThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcIShapeProfileDef_FlangeThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlangeThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcIShapeProfileDef_FlangeThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWebThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcIShapeProfileDef_WebThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebThickness(Double newWebThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcIShapeProfileDef_WebThickness(), newWebThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWebThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcIShapeProfileDef_WebThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWebThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcIShapeProfileDef_WebThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getOverallDepth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcIShapeProfileDef_OverallDepth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallDepth(Double newOverallDepth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcIShapeProfileDef_OverallDepth(), newOverallDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverallDepth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcIShapeProfileDef_OverallDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverallDepth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcIShapeProfileDef_OverallDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getOverallWidth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcIShapeProfileDef_OverallWidth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallWidth(Double newOverallWidth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcIShapeProfileDef_OverallWidth(), newOverallWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverallWidth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcIShapeProfileDef_OverallWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverallWidth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcIShapeProfileDef_OverallWidth());
	}

} //IfcIShapeProfileDefImpl
