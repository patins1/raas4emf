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
import IFC2X3.IfcCartesianPoint;
import IFC2X3.IfcCurveStyle;
import IFC2X3.IfcFillAreaStyleHatching;
import IFC2X3.IfcGeometricRepresentationItem;
import IFC2X3.IfcHatchLineDistanceSelect;
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
 * An implementation of the model object '<em><b>Ifc Fill Area Style Hatching</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcFillAreaStyleHatchingImpl#getLayerAssignments <em>Layer Assignments</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFillAreaStyleHatchingImpl#getStyledByItem <em>Styled By Item</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFillAreaStyleHatchingImpl#getHatchLineAppearance <em>Hatch Line Appearance</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFillAreaStyleHatchingImpl#getStartOfNextHatchLine <em>Start Of Next Hatch Line</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFillAreaStyleHatchingImpl#getPointOfReferenceHatchLine <em>Point Of Reference Hatch Line</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFillAreaStyleHatchingImpl#getPatternStart <em>Pattern Start</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFillAreaStyleHatchingImpl#getHatchLineAngle <em>Hatch Line Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcFillAreaStyleHatching")
@XmlRootElement(name = "IfcFillAreaStyleHatchingElement")
public class IfcFillAreaStyleHatchingImpl extends IfcFillStyleSelectImpl implements IfcFillAreaStyleHatching {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFillAreaStyleHatchingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcFillAreaStyleHatching();
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
	public IfcHatchLineDistanceSelect getStartOfNextHatchLine() {
		return (IfcHatchLineDistanceSelect)eGet(IFC2X3Package.eINSTANCE.getIfcFillAreaStyleHatching_StartOfNextHatchLine(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartOfNextHatchLine(IfcHatchLineDistanceSelect newStartOfNextHatchLine) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFillAreaStyleHatching_StartOfNextHatchLine(), newStartOfNextHatchLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianPoint getPatternStart() {
		return (IfcCartesianPoint)eGet(IFC2X3Package.eINSTANCE.getIfcFillAreaStyleHatching_PatternStart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternStart(IfcCartesianPoint newPatternStart) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFillAreaStyleHatching_PatternStart(), newPatternStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianPoint getPointOfReferenceHatchLine() {
		return (IfcCartesianPoint)eGet(IFC2X3Package.eINSTANCE.getIfcFillAreaStyleHatching_PointOfReferenceHatchLine(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointOfReferenceHatchLine(IfcCartesianPoint newPointOfReferenceHatchLine) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFillAreaStyleHatching_PointOfReferenceHatchLine(), newPointOfReferenceHatchLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveStyle getHatchLineAppearance() {
		return (IfcCurveStyle)eGet(IFC2X3Package.eINSTANCE.getIfcFillAreaStyleHatching_HatchLineAppearance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHatchLineAppearance(IfcCurveStyle newHatchLineAppearance) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFillAreaStyleHatching_HatchLineAppearance(), newHatchLineAppearance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHatchLineAngle() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcFillAreaStyleHatching_HatchLineAngle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHatchLineAngle(Double newHatchLineAngle) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFillAreaStyleHatching_HatchLineAngle(), newHatchLineAngle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHatchLineAngle() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcFillAreaStyleHatching_HatchLineAngle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHatchLineAngle() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcFillAreaStyleHatching_HatchLineAngle());
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
				case IFC2X3Package.IFC_FILL_AREA_STYLE_HATCHING__LAYER_ASSIGNMENTS: return IFC2X3Package.IFC_LAYERED_ITEM__LAYER_ASSIGNMENTS;
				default: return -1;
			}
		}
		if (baseClass == IfcRepresentationItem.class) {
			switch (derivedFeatureID) {
				case IFC2X3Package.IFC_FILL_AREA_STYLE_HATCHING__STYLED_BY_ITEM: return IFC2X3Package.IFC_REPRESENTATION_ITEM__STYLED_BY_ITEM;
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
				case IFC2X3Package.IFC_LAYERED_ITEM__LAYER_ASSIGNMENTS: return IFC2X3Package.IFC_FILL_AREA_STYLE_HATCHING__LAYER_ASSIGNMENTS;
				default: return -1;
			}
		}
		if (baseClass == IfcRepresentationItem.class) {
			switch (baseFeatureID) {
				case IFC2X3Package.IFC_REPRESENTATION_ITEM__STYLED_BY_ITEM: return IFC2X3Package.IFC_FILL_AREA_STYLE_HATCHING__STYLED_BY_ITEM;
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

} //IfcFillAreaStyleHatchingImpl
