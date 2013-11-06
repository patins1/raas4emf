/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcBSplineCurve;
import IFC2X3.IfcBSplineCurveForm;
import IFC2X3.IfcCartesianPoint;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc BSpline Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcBSplineCurveImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBSplineCurveImpl#getControlPointsList <em>Control Points List</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBSplineCurveImpl#getCurveForm <em>Curve Form</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBSplineCurveImpl#getClosedCurve <em>Closed Curve</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBSplineCurveImpl#getSelfIntersect <em>Self Intersect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcBSplineCurve")
@XmlSeeAlso({ IfcBezierCurveImpl.class, IfcRationalBezierCurveImpl.class })
@XmlRootElement(name = "IfcBSplineCurveElement")
public class IfcBSplineCurveImpl extends IfcBoundedCurveImpl implements IfcBSplineCurve {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBSplineCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcBSplineCurve();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcCartesianPoint> getControlPointsList() {
		return (EList<IfcCartesianPoint>)eGet(IFC2X3Package.eINSTANCE.getIfcBSplineCurve_ControlPointsList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSelfIntersect() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcBSplineCurve_SelfIntersect(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfIntersect(Boolean newSelfIntersect) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBSplineCurve_SelfIntersect(), newSelfIntersect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSelfIntersect() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBSplineCurve_SelfIntersect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSelfIntersect() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBSplineCurve_SelfIntersect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getClosedCurve() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcBSplineCurve_ClosedCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosedCurve(Boolean newClosedCurve) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBSplineCurve_ClosedCurve(), newClosedCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClosedCurve() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBSplineCurve_ClosedCurve());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClosedCurve() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBSplineCurve_ClosedCurve());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBSplineCurveForm getCurveForm() {
		return (IfcBSplineCurveForm)eGet(IFC2X3Package.eINSTANCE.getIfcBSplineCurve_CurveForm(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveForm(IfcBSplineCurveForm newCurveForm) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBSplineCurve_CurveForm(), newCurveForm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurveForm() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBSplineCurve_CurveForm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurveForm() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBSplineCurve_CurveForm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDegree() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcBSplineCurve_Degree(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegree(Integer newDegree) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBSplineCurve_Degree(), newDegree);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDegree() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBSplineCurve_Degree());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDegree() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBSplineCurve_Degree());
	}

} //IfcBSplineCurveImpl
