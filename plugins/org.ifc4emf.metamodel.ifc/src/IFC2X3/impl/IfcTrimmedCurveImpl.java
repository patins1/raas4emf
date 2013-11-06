/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcCurve;
import IFC2X3.IfcTrimmedCurve;
import IFC2X3.IfcTrimmingPreference;
import IFC2X3.IfcTrimmingSelect;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Trimmed Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTrimmedCurveImpl#getBasisCurve <em>Basis Curve</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTrimmedCurveImpl#getTrim1 <em>Trim1</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTrimmedCurveImpl#getTrim2 <em>Trim2</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTrimmedCurveImpl#getSenseAgreement <em>Sense Agreement</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTrimmedCurveImpl#getMasterRepresentation <em>Master Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTrimmedCurve")
@XmlRootElement(name = "IfcTrimmedCurveElement")
public class IfcTrimmedCurveImpl extends IfcBoundedCurveImpl implements IfcTrimmedCurve {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTrimmedCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTrimmedCurve();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcTrimmingSelect> getTrim1() {
		return (EList<IfcTrimmingSelect>)eGet(IFC2X3Package.eINSTANCE.getIfcTrimmedCurve_Trim1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcTrimmingSelect> getTrim2() {
		return (EList<IfcTrimmingSelect>)eGet(IFC2X3Package.eINSTANCE.getIfcTrimmedCurve_Trim2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getBasisCurve() {
		return (IfcCurve)eGet(IFC2X3Package.eINSTANCE.getIfcTrimmedCurve_BasisCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasisCurve(IfcCurve newBasisCurve) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTrimmedCurve_BasisCurve(), newBasisCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTrimmingPreference getMasterRepresentation() {
		return (IfcTrimmingPreference)eGet(IFC2X3Package.eINSTANCE.getIfcTrimmedCurve_MasterRepresentation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterRepresentation(IfcTrimmingPreference newMasterRepresentation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTrimmedCurve_MasterRepresentation(), newMasterRepresentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMasterRepresentation() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTrimmedCurve_MasterRepresentation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMasterRepresentation() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTrimmedCurve_MasterRepresentation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSenseAgreement() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcTrimmedCurve_SenseAgreement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenseAgreement(Boolean newSenseAgreement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTrimmedCurve_SenseAgreement(), newSenseAgreement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSenseAgreement() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTrimmedCurve_SenseAgreement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSenseAgreement() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTrimmedCurve_SenseAgreement());
	}

} //IfcTrimmedCurveImpl
