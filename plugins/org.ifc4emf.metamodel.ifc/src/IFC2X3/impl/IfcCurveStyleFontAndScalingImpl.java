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
import IFC2X3.IfcCurveStyleFontAndScaling;
import IFC2X3.IfcCurveStyleFontSelect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Curve Style Font And Scaling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcCurveStyleFontAndScalingImpl#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCurveStyleFontAndScalingImpl#getCurveFont <em>Curve Font</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCurveStyleFontAndScalingImpl#getCurveFontScaling <em>Curve Font Scaling</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCurveStyleFontAndScaling")
@XmlRootElement(name = "IfcCurveStyleFontAndScalingElement")
public class IfcCurveStyleFontAndScalingImpl extends IfcCurveFontOrScaledCurveFontSelectImpl implements IfcCurveStyleFontAndScaling {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCurveStyleFontAndScalingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCurveStyleFontAndScaling();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveStyleFontSelect getCurveFont() {
		return (IfcCurveStyleFontSelect)eGet(IFC2X3Package.eINSTANCE.getIfcCurveStyleFontAndScaling_CurveFont(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveFont(IfcCurveStyleFontSelect newCurveFont) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCurveStyleFontAndScaling_CurveFont(), newCurveFont);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCurveFontScaling() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCurveStyleFontAndScaling_CurveFontScaling(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveFontScaling(Double newCurveFontScaling) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCurveStyleFontAndScaling_CurveFontScaling(), newCurveFontScaling);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurveFontScaling() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCurveStyleFontAndScaling_CurveFontScaling());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurveFontScaling() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCurveStyleFontAndScaling_CurveFontScaling());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcCurveStyleFontAndScaling_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCurveStyleFontAndScaling_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCurveStyleFontAndScaling_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCurveStyleFontAndScaling_Name());
	}

} //IfcCurveStyleFontAndScalingImpl
