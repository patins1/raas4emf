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
import IFC2X3.IfcCurve;
import IFC2X3.IfcGrid;
import IFC2X3.IfcGridAxis;
import IFC2X3.IfcVirtualGridIntersection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Grid Axis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcGridAxisImpl#getAxisTag <em>Axis Tag</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcGridAxisImpl#getAxisCurve <em>Axis Curve</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcGridAxisImpl#getSameSense <em>Same Sense</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcGridAxisImpl#getPartOfW <em>Part Of W</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcGridAxisImpl#getPartOfV <em>Part Of V</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcGridAxisImpl#getPartOfU <em>Part Of U</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcGridAxisImpl#getHasIntersections <em>Has Intersections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcGridAxis")
@XmlRootElement(name = "IfcGridAxisElement")
public class IfcGridAxisImpl extends CDOObjectImpl implements IfcGridAxis {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGridAxisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcGridAxis();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGrid getPartOfW() {
		return (IfcGrid)eGet(IFC2X3Package.eINSTANCE.getIfcGridAxis_PartOfW(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOfW(IfcGrid newPartOfW) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGridAxis_PartOfW(), newPartOfW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGrid getPartOfV() {
		return (IfcGrid)eGet(IFC2X3Package.eINSTANCE.getIfcGridAxis_PartOfV(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOfV(IfcGrid newPartOfV) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGridAxis_PartOfV(), newPartOfV);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGrid getPartOfU() {
		return (IfcGrid)eGet(IFC2X3Package.eINSTANCE.getIfcGridAxis_PartOfU(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOfU(IfcGrid newPartOfU) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGridAxis_PartOfU(), newPartOfU);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcVirtualGridIntersection> getHasIntersections() {
		return (EList<IfcVirtualGridIntersection>)eGet(IFC2X3Package.eINSTANCE.getIfcGridAxis_HasIntersections(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getAxisCurve() {
		return (IfcCurve)eGet(IFC2X3Package.eINSTANCE.getIfcGridAxis_AxisCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisCurve(IfcCurve newAxisCurve) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGridAxis_AxisCurve(), newAxisCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSameSense() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcGridAxis_SameSense(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSameSense(Boolean newSameSense) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGridAxis_SameSense(), newSameSense);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSameSense() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcGridAxis_SameSense());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSameSense() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcGridAxis_SameSense());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAxisTag() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcGridAxis_AxisTag(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisTag(String newAxisTag) {
		eSet(IFC2X3Package.eINSTANCE.getIfcGridAxis_AxisTag(), newAxisTag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAxisTag() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcGridAxis_AxisTag());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAxisTag() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcGridAxis_AxisTag());
	}

} //IfcGridAxisImpl
