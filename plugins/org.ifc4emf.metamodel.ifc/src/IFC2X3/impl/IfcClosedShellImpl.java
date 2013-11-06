/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcClosedShell;
import IFC2X3.IfcConnectedFaceSet;
import IFC2X3.IfcFace;
import IFC2X3.IfcLayeredItem;
import IFC2X3.IfcPresentationLayerAssignment;
import IFC2X3.IfcRepresentationItem;
import IFC2X3.IfcStyledItem;
import IFC2X3.IfcTopologicalRepresentationItem;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Closed Shell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcClosedShellImpl#getLayerAssignments <em>Layer Assignments</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcClosedShellImpl#getStyledByItem <em>Styled By Item</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcClosedShellImpl#getCfsFaces <em>Cfs Faces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcClosedShell")
@XmlRootElement(name = "IfcClosedShellElement")
public class IfcClosedShellImpl extends IfcShellImpl implements IfcClosedShell {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcClosedShellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcClosedShell();
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
	@SuppressWarnings("unchecked")
	@XmlElement
	public EList<IfcFace> getCfsFaces() {
		return (EList<IfcFace>)eGet(IFC2X3Package.eINSTANCE.getIfcConnectedFaceSet_CfsFaces(), true);
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
				case IFC2X3Package.IFC_CLOSED_SHELL__LAYER_ASSIGNMENTS: return IFC2X3Package.IFC_LAYERED_ITEM__LAYER_ASSIGNMENTS;
				default: return -1;
			}
		}
		if (baseClass == IfcRepresentationItem.class) {
			switch (derivedFeatureID) {
				case IFC2X3Package.IFC_CLOSED_SHELL__STYLED_BY_ITEM: return IFC2X3Package.IFC_REPRESENTATION_ITEM__STYLED_BY_ITEM;
				default: return -1;
			}
		}
		if (baseClass == IfcTopologicalRepresentationItem.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IfcConnectedFaceSet.class) {
			switch (derivedFeatureID) {
				case IFC2X3Package.IFC_CLOSED_SHELL__CFS_FACES: return IFC2X3Package.IFC_CONNECTED_FACE_SET__CFS_FACES;
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
				case IFC2X3Package.IFC_LAYERED_ITEM__LAYER_ASSIGNMENTS: return IFC2X3Package.IFC_CLOSED_SHELL__LAYER_ASSIGNMENTS;
				default: return -1;
			}
		}
		if (baseClass == IfcRepresentationItem.class) {
			switch (baseFeatureID) {
				case IFC2X3Package.IFC_REPRESENTATION_ITEM__STYLED_BY_ITEM: return IFC2X3Package.IFC_CLOSED_SHELL__STYLED_BY_ITEM;
				default: return -1;
			}
		}
		if (baseClass == IfcTopologicalRepresentationItem.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IfcConnectedFaceSet.class) {
			switch (baseFeatureID) {
				case IFC2X3Package.IFC_CONNECTED_FACE_SET__CFS_FACES: return IFC2X3Package.IFC_CLOSED_SHELL__CFS_FACES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IfcClosedShellImpl
