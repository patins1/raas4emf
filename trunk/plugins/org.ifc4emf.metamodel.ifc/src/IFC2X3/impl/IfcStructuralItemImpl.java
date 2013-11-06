/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcObject;
import IFC2X3.IfcObjectDefinition;
import IFC2X3.IfcObjectPlacement;
import IFC2X3.IfcOwnerHistory;
import IFC2X3.IfcProduct;
import IFC2X3.IfcProductRepresentation;
import IFC2X3.IfcRelAssigns;
import IFC2X3.IfcRelAssignsToProduct;
import IFC2X3.IfcRelAssociates;
import IFC2X3.IfcRelContainedInSpatialStructure;
import IFC2X3.IfcRelDecomposes;
import IFC2X3.IfcRelDefines;
import IFC2X3.IfcRelReferencedInSpatialStructure;
import IFC2X3.IfcRoot;
import IFC2X3.IfcStructuralItem;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStructuralItemImpl#getGlobalId <em>Global Id</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralItemImpl#getOwnerHistory <em>Owner History</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralItemImpl#getHasAssociations <em>Has Associations</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralItemImpl#getHasAssignments <em>Has Assignments</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralItemImpl#getIsDecomposedBy <em>Is Decomposed By</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralItemImpl#getDecomposes <em>Decomposes</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralItemImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralItemImpl#getIsDefinedBy <em>Is Defined By</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralItemImpl#getObjectPlacement <em>Object Placement</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralItemImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralItemImpl#getReferencedBy <em>Referenced By</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralItemImpl#getReferencedInStructures <em>Referenced In Structures</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralItemImpl#getContainedInStructure <em>Contained In Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStructuralItem")
@XmlSeeAlso({ IfcStructuralSurfaceMemberVaryingImpl.class, IfcStructuralConnectionImpl.class, IfcStructuralMemberImpl.class, IfcStructuralCurveMemberImpl.class, IfcStructuralSurfaceMemberImpl.class, IfcStructuralSurfaceConnectionImpl.class,
		IfcStructuralPointConnectionImpl.class, IfcStructuralCurveMemberVaryingImpl.class, IfcStructuralCurveConnectionImpl.class })
@XmlRootElement(name = "IfcStructuralItemElement")
public class IfcStructuralItemImpl extends IfcStructuralActivityAssignmentSelectImpl implements IfcStructuralItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOwnerHistory getOwnerHistory() {
		return (IfcOwnerHistory)eGet(IFC2X3Package.eINSTANCE.getIfcRoot_OwnerHistory(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerHistory(IfcOwnerHistory newOwnerHistory) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRoot_OwnerHistory(), newOwnerHistory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcRoot_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRoot_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRoot_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRoot_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelAssociates> getHasAssociations() {
		return (EList<IfcRelAssociates>)eGet(IFC2X3Package.eINSTANCE.getIfcRoot_HasAssociations(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcRoot_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRoot_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRoot_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRoot_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlobalId() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcRoot_GlobalId(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalId(String newGlobalId) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRoot_GlobalId(), newGlobalId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGlobalId() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRoot_GlobalId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGlobalId() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRoot_GlobalId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelAssigns> getHasAssignments() {
		return (EList<IfcRelAssigns>)eGet(IFC2X3Package.eINSTANCE.getIfcObjectDefinition_HasAssignments(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelDecomposes> getIsDecomposedBy() {
		return (EList<IfcRelDecomposes>)eGet(IFC2X3Package.eINSTANCE.getIfcObjectDefinition_IsDecomposedBy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelDecomposes getDecomposes() {
		return (IfcRelDecomposes)eGet(IFC2X3Package.eINSTANCE.getIfcObjectDefinition_Decomposes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposes(IfcRelDecomposes newDecomposes) {
		eSet(IFC2X3Package.eINSTANCE.getIfcObjectDefinition_Decomposes(), newDecomposes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelDefines> getIsDefinedBy() {
		return (EList<IfcRelDefines>)eGet(IFC2X3Package.eINSTANCE.getIfcObject_IsDefinedBy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectType() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcObject_ObjectType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectType(String newObjectType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcObject_ObjectType(), newObjectType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetObjectType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcObject_ObjectType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetObjectType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcObject_ObjectType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelAssignsToProduct> getReferencedBy() {
		return (EList<IfcRelAssignsToProduct>)eGet(IFC2X3Package.eINSTANCE.getIfcProduct_ReferencedBy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelReferencedInSpatialStructure> getReferencedInStructures() {
		return (EList<IfcRelReferencedInSpatialStructure>)eGet(IFC2X3Package.eINSTANCE.getIfcProduct_ReferencedInStructures(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelContainedInSpatialStructure getContainedInStructure() {
		return (IfcRelContainedInSpatialStructure)eGet(IFC2X3Package.eINSTANCE.getIfcProduct_ContainedInStructure(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedInStructure(IfcRelContainedInSpatialStructure newContainedInStructure) {
		eSet(IFC2X3Package.eINSTANCE.getIfcProduct_ContainedInStructure(), newContainedInStructure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProductRepresentation getRepresentation() {
		return (IfcProductRepresentation)eGet(IFC2X3Package.eINSTANCE.getIfcProduct_Representation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(IfcProductRepresentation newRepresentation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcProduct_Representation(), newRepresentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectPlacement getObjectPlacement() {
		return (IfcObjectPlacement)eGet(IFC2X3Package.eINSTANCE.getIfcProduct_ObjectPlacement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectPlacement(IfcObjectPlacement newObjectPlacement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcProduct_ObjectPlacement(), newObjectPlacement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IfcRoot.class) {
			switch (derivedFeatureID) {
				case IFC2X3Package.IFC_STRUCTURAL_ITEM__GLOBAL_ID: return IFC2X3Package.IFC_ROOT__GLOBAL_ID;
				case IFC2X3Package.IFC_STRUCTURAL_ITEM__OWNER_HISTORY: return IFC2X3Package.IFC_ROOT__OWNER_HISTORY;
				case IFC2X3Package.IFC_STRUCTURAL_ITEM__NAME: return IFC2X3Package.IFC_ROOT__NAME;
				case IFC2X3Package.IFC_STRUCTURAL_ITEM__DESCRIPTION: return IFC2X3Package.IFC_ROOT__DESCRIPTION;
				case IFC2X3Package.IFC_STRUCTURAL_ITEM__HAS_ASSOCIATIONS: return IFC2X3Package.IFC_ROOT__HAS_ASSOCIATIONS;
				default: return -1;
			}
		}
		if (baseClass == IfcObjectDefinition.class) {
			switch (derivedFeatureID) {
				case IFC2X3Package.IFC_STRUCTURAL_ITEM__HAS_ASSIGNMENTS: return IFC2X3Package.IFC_OBJECT_DEFINITION__HAS_ASSIGNMENTS;
				case IFC2X3Package.IFC_STRUCTURAL_ITEM__IS_DECOMPOSED_BY: return IFC2X3Package.IFC_OBJECT_DEFINITION__IS_DECOMPOSED_BY;
				case IFC2X3Package.IFC_STRUCTURAL_ITEM__DECOMPOSES: return IFC2X3Package.IFC_OBJECT_DEFINITION__DECOMPOSES;
				default: return -1;
			}
		}
		if (baseClass == IfcObject.class) {
			switch (derivedFeatureID) {
				case IFC2X3Package.IFC_STRUCTURAL_ITEM__OBJECT_TYPE: return IFC2X3Package.IFC_OBJECT__OBJECT_TYPE;
				case IFC2X3Package.IFC_STRUCTURAL_ITEM__IS_DEFINED_BY: return IFC2X3Package.IFC_OBJECT__IS_DEFINED_BY;
				default: return -1;
			}
		}
		if (baseClass == IfcProduct.class) {
			switch (derivedFeatureID) {
				case IFC2X3Package.IFC_STRUCTURAL_ITEM__OBJECT_PLACEMENT: return IFC2X3Package.IFC_PRODUCT__OBJECT_PLACEMENT;
				case IFC2X3Package.IFC_STRUCTURAL_ITEM__REPRESENTATION: return IFC2X3Package.IFC_PRODUCT__REPRESENTATION;
				case IFC2X3Package.IFC_STRUCTURAL_ITEM__REFERENCED_BY: return IFC2X3Package.IFC_PRODUCT__REFERENCED_BY;
				case IFC2X3Package.IFC_STRUCTURAL_ITEM__REFERENCED_IN_STRUCTURES: return IFC2X3Package.IFC_PRODUCT__REFERENCED_IN_STRUCTURES;
				case IFC2X3Package.IFC_STRUCTURAL_ITEM__CONTAINED_IN_STRUCTURE: return IFC2X3Package.IFC_PRODUCT__CONTAINED_IN_STRUCTURE;
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
		if (baseClass == IfcRoot.class) {
			switch (baseFeatureID) {
				case IFC2X3Package.IFC_ROOT__GLOBAL_ID: return IFC2X3Package.IFC_STRUCTURAL_ITEM__GLOBAL_ID;
				case IFC2X3Package.IFC_ROOT__OWNER_HISTORY: return IFC2X3Package.IFC_STRUCTURAL_ITEM__OWNER_HISTORY;
				case IFC2X3Package.IFC_ROOT__NAME: return IFC2X3Package.IFC_STRUCTURAL_ITEM__NAME;
				case IFC2X3Package.IFC_ROOT__DESCRIPTION: return IFC2X3Package.IFC_STRUCTURAL_ITEM__DESCRIPTION;
				case IFC2X3Package.IFC_ROOT__HAS_ASSOCIATIONS: return IFC2X3Package.IFC_STRUCTURAL_ITEM__HAS_ASSOCIATIONS;
				default: return -1;
			}
		}
		if (baseClass == IfcObjectDefinition.class) {
			switch (baseFeatureID) {
				case IFC2X3Package.IFC_OBJECT_DEFINITION__HAS_ASSIGNMENTS: return IFC2X3Package.IFC_STRUCTURAL_ITEM__HAS_ASSIGNMENTS;
				case IFC2X3Package.IFC_OBJECT_DEFINITION__IS_DECOMPOSED_BY: return IFC2X3Package.IFC_STRUCTURAL_ITEM__IS_DECOMPOSED_BY;
				case IFC2X3Package.IFC_OBJECT_DEFINITION__DECOMPOSES: return IFC2X3Package.IFC_STRUCTURAL_ITEM__DECOMPOSES;
				default: return -1;
			}
		}
		if (baseClass == IfcObject.class) {
			switch (baseFeatureID) {
				case IFC2X3Package.IFC_OBJECT__OBJECT_TYPE: return IFC2X3Package.IFC_STRUCTURAL_ITEM__OBJECT_TYPE;
				case IFC2X3Package.IFC_OBJECT__IS_DEFINED_BY: return IFC2X3Package.IFC_STRUCTURAL_ITEM__IS_DEFINED_BY;
				default: return -1;
			}
		}
		if (baseClass == IfcProduct.class) {
			switch (baseFeatureID) {
				case IFC2X3Package.IFC_PRODUCT__OBJECT_PLACEMENT: return IFC2X3Package.IFC_STRUCTURAL_ITEM__OBJECT_PLACEMENT;
				case IFC2X3Package.IFC_PRODUCT__REPRESENTATION: return IFC2X3Package.IFC_STRUCTURAL_ITEM__REPRESENTATION;
				case IFC2X3Package.IFC_PRODUCT__REFERENCED_BY: return IFC2X3Package.IFC_STRUCTURAL_ITEM__REFERENCED_BY;
				case IFC2X3Package.IFC_PRODUCT__REFERENCED_IN_STRUCTURES: return IFC2X3Package.IFC_STRUCTURAL_ITEM__REFERENCED_IN_STRUCTURES;
				case IFC2X3Package.IFC_PRODUCT__CONTAINED_IN_STRUCTURE: return IFC2X3Package.IFC_STRUCTURAL_ITEM__CONTAINED_IN_STRUCTURE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IfcStructuralItemImpl
