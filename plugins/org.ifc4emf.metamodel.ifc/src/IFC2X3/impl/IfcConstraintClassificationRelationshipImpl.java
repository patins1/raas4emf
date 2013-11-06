/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcClassificationNotationSelect;
import IFC2X3.IfcConstraint;
import IFC2X3.IfcConstraintClassificationRelationship;

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
 * An implementation of the model object '<em><b>Ifc Constraint Classification Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcConstraintClassificationRelationshipImpl#getClassifiedConstraint <em>Classified Constraint</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConstraintClassificationRelationshipImpl#getRelatedClassifications <em>Related Classifications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcConstraintClassificationRelationship")
@XmlRootElement(name = "IfcConstraintClassificationRelationshipElement")
public class IfcConstraintClassificationRelationshipImpl extends CDOObjectImpl implements IfcConstraintClassificationRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConstraintClassificationRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcConstraintClassificationRelationship();
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
	public EList<IfcClassificationNotationSelect> getRelatedClassifications() {
		return (EList<IfcClassificationNotationSelect>)eGet(IFC2X3Package.eINSTANCE.getIfcConstraintClassificationRelationship_RelatedClassifications(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConstraint getClassifiedConstraint() {
		return (IfcConstraint)eGet(IFC2X3Package.eINSTANCE.getIfcConstraintClassificationRelationship_ClassifiedConstraint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifiedConstraint(IfcConstraint newClassifiedConstraint) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConstraintClassificationRelationship_ClassifiedConstraint(), newClassifiedConstraint);
	}

} //IfcConstraintClassificationRelationshipImpl
