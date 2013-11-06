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
import IFC2X3.IfcAsymmetricIShapeProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Asymmetric IShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcAsymmetricIShapeProfileDefImpl#getTopFlangeWidth <em>Top Flange Width</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAsymmetricIShapeProfileDefImpl#getTopFlangeThickness <em>Top Flange Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAsymmetricIShapeProfileDefImpl#getTopFlangeFilletRadius <em>Top Flange Fillet Radius</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAsymmetricIShapeProfileDefImpl#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcAsymmetricIShapeProfileDef")
@XmlRootElement(name = "IfcAsymmetricIShapeProfileDefElement")
public class IfcAsymmetricIShapeProfileDefImpl extends IfcIShapeProfileDefImpl implements IfcAsymmetricIShapeProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcAsymmetricIShapeProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCentreOfGravityInY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_CentreOfGravityInY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInY(Double newCentreOfGravityInY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_CentreOfGravityInY(), newCentreOfGravityInY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_CentreOfGravityInY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_CentreOfGravityInY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTopFlangeFilletRadius() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_TopFlangeFilletRadius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopFlangeFilletRadius(Double newTopFlangeFilletRadius) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_TopFlangeFilletRadius(), newTopFlangeFilletRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTopFlangeFilletRadius() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_TopFlangeFilletRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTopFlangeFilletRadius() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_TopFlangeFilletRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTopFlangeThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_TopFlangeThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopFlangeThickness(Double newTopFlangeThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_TopFlangeThickness(), newTopFlangeThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTopFlangeThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_TopFlangeThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTopFlangeThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_TopFlangeThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTopFlangeWidth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_TopFlangeWidth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopFlangeWidth(Double newTopFlangeWidth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_TopFlangeWidth(), newTopFlangeWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTopFlangeWidth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_TopFlangeWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTopFlangeWidth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef_TopFlangeWidth());
	}

} //IfcAsymmetricIShapeProfileDefImpl
