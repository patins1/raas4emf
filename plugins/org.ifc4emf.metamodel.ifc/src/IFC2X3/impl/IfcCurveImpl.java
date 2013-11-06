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
import IFC2X3.IfcCurve;
import IFC2X3.IfcGeometricRepresentationItem;
import IFC2X3.IfcLayeredItem;
import IFC2X3.IfcPresentationLayerAssignment;
import IFC2X3.IfcRepresentationItem;
import IFC2X3.IfcStyledItem;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcCurveImpl#getLayerAssignments <em>Layer Assignments</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCurveImpl#getStyledByItem <em>Styled By Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCurve")
@XmlSeeAlso({ IfcEllipseImpl.class, IfcBSplineCurveImpl.class, IfcCompositeCurveImpl.class, IfcRationalBezierCurveImpl.class, IfcTrimmedCurveImpl.class, Ifc2DCompositeCurveImpl.class, IfcCircleImpl.class, IfcOffsetCurve3DImpl.class, IfcOffsetCurve2DImpl.class,
		IfcBezierCurveImpl.class, IfcPolylineImpl.class, IfcConicImpl.class, IfcBoundedCurveImpl.class, IfcLineImpl.class })
@XmlRootElement(name = "IfcCurveElement")
public class IfcCurveImpl extends IfcGeometricSetSelectImpl implements IfcCurve {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCurve();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcPresentationLayerAssignment> getLayerAssignments() {
		return (EList<IfcPresentationLayerAssignment>)eGet(IFC2X3Package.eINSTANCE.getIfcLayeredItem_LayerAssignments(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStyledItem getStyledByItem() {
		return (IfcStyledItem)eGet(IFC2X3Package.eINSTANCE.getIfcRepresentationItem_StyledByItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyledByItem(IfcStyledItem newStyledByItem) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRepresentationItem_StyledByItem(), newStyledByItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IfcLayeredItem.class) {
			switch (derivedFeatureID) {
				case IFC2X3Package.IFC_CURVE__LAYER_ASSIGNMENTS: return IFC2X3Package.IFC_LAYERED_ITEM__LAYER_ASSIGNMENTS;
				default: return -1;
			}
		}
		if (baseClass == IfcRepresentationItem.class) {
			switch (derivedFeatureID) {
				case IFC2X3Package.IFC_CURVE__STYLED_BY_ITEM: return IFC2X3Package.IFC_REPRESENTATION_ITEM__STYLED_BY_ITEM;
				default: return -1;
			}
		}
		if (baseClass == IfcGeometricRepresentationItem.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IfcLayeredItem.class) {
			switch (baseFeatureID) {
				case IFC2X3Package.IFC_LAYERED_ITEM__LAYER_ASSIGNMENTS: return IFC2X3Package.IFC_CURVE__LAYER_ASSIGNMENTS;
				default: return -1;
			}
		}
		if (baseClass == IfcRepresentationItem.class) {
			switch (baseFeatureID) {
				case IFC2X3Package.IFC_REPRESENTATION_ITEM__STYLED_BY_ITEM: return IFC2X3Package.IFC_CURVE__STYLED_BY_ITEM;
				default: return -1;
			}
		}
		if (baseClass == IfcGeometricRepresentationItem.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IfcCurveImpl
