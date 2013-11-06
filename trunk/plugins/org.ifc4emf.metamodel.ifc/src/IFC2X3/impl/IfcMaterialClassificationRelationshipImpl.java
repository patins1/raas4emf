/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcClassificationNotationSelect;
import IFC2X3.IfcMaterial;
import IFC2X3.IfcMaterialClassificationRelationship;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Material Classification Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcMaterialClassificationRelationshipImpl#getMaterialClassifications <em>Material Classifications</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMaterialClassificationRelationshipImpl#getClassifiedMaterial <em>Classified Material</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcMaterialClassificationRelationship")
@XmlRootElement(name = "IfcMaterialClassificationRelationshipElement")
public class IfcMaterialClassificationRelationshipImpl extends CDOObjectImpl implements IfcMaterialClassificationRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMaterialClassificationRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcMaterialClassificationRelationship();
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
	@SuppressWarnings("unchecked")
	public EList<IfcClassificationNotationSelect> getMaterialClassifications() {
		return (EList<IfcClassificationNotationSelect>)eGet(IFC2X3Package.eINSTANCE.getIfcMaterialClassificationRelationship_MaterialClassifications(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterial getClassifiedMaterial() {
		return (IfcMaterial)eGet(IFC2X3Package.eINSTANCE.getIfcMaterialClassificationRelationship_ClassifiedMaterial(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifiedMaterial(IfcMaterial newClassifiedMaterial) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMaterialClassificationRelationship_ClassifiedMaterial(), newClassifiedMaterial);
	}

} //IfcMaterialClassificationRelationshipImpl
