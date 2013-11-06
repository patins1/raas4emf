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
import IFC2X3.IfcCompositeCurve;
import IFC2X3.IfcCompositeCurveSegment;
import IFC2X3.IfcCurve;
import IFC2X3.IfcTransitionCode;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Composite Curve Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcCompositeCurveSegmentImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCompositeCurveSegmentImpl#getSameSense <em>Same Sense</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCompositeCurveSegmentImpl#getParentCurve <em>Parent Curve</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCompositeCurveSegmentImpl#getUsingCurves <em>Using Curves</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCompositeCurveSegment")
@XmlRootElement(name = "IfcCompositeCurveSegmentElement")
public class IfcCompositeCurveSegmentImpl extends IfcGeometricRepresentationItemImpl implements IfcCompositeCurveSegment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCompositeCurveSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCompositeCurveSegment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcCompositeCurve> getUsingCurves() {
		return (EList<IfcCompositeCurve>)eGet(IFC2X3Package.eINSTANCE.getIfcCompositeCurveSegment_UsingCurves(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getParentCurve() {
		return (IfcCurve)eGet(IFC2X3Package.eINSTANCE.getIfcCompositeCurveSegment_ParentCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentCurve(IfcCurve newParentCurve) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCompositeCurveSegment_ParentCurve(), newParentCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSameSense() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcCompositeCurveSegment_SameSense(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSameSense(Boolean newSameSense) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCompositeCurveSegment_SameSense(), newSameSense);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSameSense() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCompositeCurveSegment_SameSense());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSameSense() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCompositeCurveSegment_SameSense());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTransitionCode getTransition() {
		return (IfcTransitionCode)eGet(IFC2X3Package.eINSTANCE.getIfcCompositeCurveSegment_Transition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(IfcTransitionCode newTransition) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCompositeCurveSegment_Transition(), newTransition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransition() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCompositeCurveSegment_Transition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransition() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCompositeCurveSegment_Transition());
	}

} //IfcCompositeCurveSegmentImpl
