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
import IFC2X3.IfcEdge;
import IFC2X3.IfcEdgeCurve;
import IFC2X3.IfcLayeredItem;
import IFC2X3.IfcPresentationLayerAssignment;
import IFC2X3.IfcRepresentationItem;
import IFC2X3.IfcStyledItem;
import IFC2X3.IfcTopologicalRepresentationItem;
import IFC2X3.IfcVertex;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Edge Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcEdgeCurveImpl#getLayerAssignments <em>Layer Assignments</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcEdgeCurveImpl#getStyledByItem <em>Styled By Item</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcEdgeCurveImpl#getEdgeStart <em>Edge Start</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcEdgeCurveImpl#getEdgeEnd <em>Edge End</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcEdgeCurveImpl#getEdgeGeometry <em>Edge Geometry</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcEdgeCurveImpl#getSameSense <em>Same Sense</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcEdgeCurve")
@XmlRootElement(name = "IfcEdgeCurveElement")
public class IfcEdgeCurveImpl extends IfcCurveOrEdgeCurveImpl implements IfcEdgeCurve {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcEdgeCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcEdgeCurve();
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
	public IfcVertex getEdgeStart() {
		return (IfcVertex)eGet(IFC2X3Package.eINSTANCE.getIfcEdge_EdgeStart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeStart(IfcVertex newEdgeStart) {
		eSet(IFC2X3Package.eINSTANCE.getIfcEdge_EdgeStart(), newEdgeStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVertex getEdgeEnd() {
		return (IfcVertex)eGet(IFC2X3Package.eINSTANCE.getIfcEdge_EdgeEnd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeEnd(IfcVertex newEdgeEnd) {
		eSet(IFC2X3Package.eINSTANCE.getIfcEdge_EdgeEnd(), newEdgeEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getEdgeGeometry() {
		return (IfcCurve)eGet(IFC2X3Package.eINSTANCE.getIfcEdgeCurve_EdgeGeometry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeGeometry(IfcCurve newEdgeGeometry) {
		eSet(IFC2X3Package.eINSTANCE.getIfcEdgeCurve_EdgeGeometry(), newEdgeGeometry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSameSense() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcEdgeCurve_SameSense(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSameSense(Boolean newSameSense) {
		eSet(IFC2X3Package.eINSTANCE.getIfcEdgeCurve_SameSense(), newSameSense);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSameSense() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcEdgeCurve_SameSense());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSameSense() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcEdgeCurve_SameSense());
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
				case IFC2X3Package.IFC_EDGE_CURVE__LAYER_ASSIGNMENTS: return IFC2X3Package.IFC_LAYERED_ITEM__LAYER_ASSIGNMENTS;
				default: return -1;
			}
		}
		if (baseClass == IfcRepresentationItem.class) {
			switch (derivedFeatureID) {
				case IFC2X3Package.IFC_EDGE_CURVE__STYLED_BY_ITEM: return IFC2X3Package.IFC_REPRESENTATION_ITEM__STYLED_BY_ITEM;
				default: return -1;
			}
		}
		if (baseClass == IfcTopologicalRepresentationItem.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IfcEdge.class) {
			switch (derivedFeatureID) {
				case IFC2X3Package.IFC_EDGE_CURVE__EDGE_START: return IFC2X3Package.IFC_EDGE__EDGE_START;
				case IFC2X3Package.IFC_EDGE_CURVE__EDGE_END: return IFC2X3Package.IFC_EDGE__EDGE_END;
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
				case IFC2X3Package.IFC_LAYERED_ITEM__LAYER_ASSIGNMENTS: return IFC2X3Package.IFC_EDGE_CURVE__LAYER_ASSIGNMENTS;
				default: return -1;
			}
		}
		if (baseClass == IfcRepresentationItem.class) {
			switch (baseFeatureID) {
				case IFC2X3Package.IFC_REPRESENTATION_ITEM__STYLED_BY_ITEM: return IFC2X3Package.IFC_EDGE_CURVE__STYLED_BY_ITEM;
				default: return -1;
			}
		}
		if (baseClass == IfcTopologicalRepresentationItem.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IfcEdge.class) {
			switch (baseFeatureID) {
				case IFC2X3Package.IFC_EDGE__EDGE_START: return IFC2X3Package.IFC_EDGE_CURVE__EDGE_START;
				case IFC2X3Package.IFC_EDGE__EDGE_END: return IFC2X3Package.IFC_EDGE_CURVE__EDGE_END;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IfcEdgeCurveImpl
