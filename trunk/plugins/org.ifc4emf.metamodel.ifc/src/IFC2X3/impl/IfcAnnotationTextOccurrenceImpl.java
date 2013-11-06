/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcAnnotationOccurrence;
import IFC2X3.IfcAnnotationTextOccurrence;
import IFC2X3.IfcLayeredItem;
import IFC2X3.IfcPresentationLayerAssignment;
import IFC2X3.IfcPresentationStyleAssignment;
import IFC2X3.IfcRepresentationItem;
import IFC2X3.IfcStyledItem;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Ifc Annotation Text Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcAnnotationTextOccurrenceImpl#getLayerAssignments <em>Layer Assignments</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAnnotationTextOccurrenceImpl#getStyledByItem <em>Styled By Item</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAnnotationTextOccurrenceImpl#getItem <em>Item</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAnnotationTextOccurrenceImpl#getStyles <em>Styles</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAnnotationTextOccurrenceImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcAnnotationTextOccurrence")
@XmlRootElement(name = "IfcAnnotationTextOccurrenceElement")
public class IfcAnnotationTextOccurrenceImpl extends IfcDraughtingCalloutElementImpl implements IfcAnnotationTextOccurrence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcAnnotationTextOccurrenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcAnnotationTextOccurrence();
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
	public EList<IfcPresentationStyleAssignment> getStyles() {
		return (EList<IfcPresentationStyleAssignment>)eGet(IFC2X3Package.eINSTANCE.getIfcStyledItem_Styles(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRepresentationItem getItem() {
		return (IfcRepresentationItem)eGet(IFC2X3Package.eINSTANCE.getIfcStyledItem_Item(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(IfcRepresentationItem newItem) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStyledItem_Item(), newItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcStyledItem_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStyledItem_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStyledItem_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStyledItem_Name());
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
				case IFC2X3Package.IFC_ANNOTATION_TEXT_OCCURRENCE__LAYER_ASSIGNMENTS: return IFC2X3Package.IFC_LAYERED_ITEM__LAYER_ASSIGNMENTS;
				default: return -1;
			}
		}
		if (baseClass == IfcRepresentationItem.class) {
			switch (derivedFeatureID) {
				case IFC2X3Package.IFC_ANNOTATION_TEXT_OCCURRENCE__STYLED_BY_ITEM: return IFC2X3Package.IFC_REPRESENTATION_ITEM__STYLED_BY_ITEM;
				default: return -1;
			}
		}
		if (baseClass == IfcStyledItem.class) {
			switch (derivedFeatureID) {
				case IFC2X3Package.IFC_ANNOTATION_TEXT_OCCURRENCE__ITEM: return IFC2X3Package.IFC_STYLED_ITEM__ITEM;
				case IFC2X3Package.IFC_ANNOTATION_TEXT_OCCURRENCE__STYLES: return IFC2X3Package.IFC_STYLED_ITEM__STYLES;
				case IFC2X3Package.IFC_ANNOTATION_TEXT_OCCURRENCE__NAME: return IFC2X3Package.IFC_STYLED_ITEM__NAME;
				default: return -1;
			}
		}
		if (baseClass == IfcAnnotationOccurrence.class) {
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
				case IFC2X3Package.IFC_LAYERED_ITEM__LAYER_ASSIGNMENTS: return IFC2X3Package.IFC_ANNOTATION_TEXT_OCCURRENCE__LAYER_ASSIGNMENTS;
				default: return -1;
			}
		}
		if (baseClass == IfcRepresentationItem.class) {
			switch (baseFeatureID) {
				case IFC2X3Package.IFC_REPRESENTATION_ITEM__STYLED_BY_ITEM: return IFC2X3Package.IFC_ANNOTATION_TEXT_OCCURRENCE__STYLED_BY_ITEM;
				default: return -1;
			}
		}
		if (baseClass == IfcStyledItem.class) {
			switch (baseFeatureID) {
				case IFC2X3Package.IFC_STYLED_ITEM__ITEM: return IFC2X3Package.IFC_ANNOTATION_TEXT_OCCURRENCE__ITEM;
				case IFC2X3Package.IFC_STYLED_ITEM__STYLES: return IFC2X3Package.IFC_ANNOTATION_TEXT_OCCURRENCE__STYLES;
				case IFC2X3Package.IFC_STYLED_ITEM__NAME: return IFC2X3Package.IFC_ANNOTATION_TEXT_OCCURRENCE__NAME;
				default: return -1;
			}
		}
		if (baseClass == IfcAnnotationOccurrence.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IfcAnnotationTextOccurrenceImpl
