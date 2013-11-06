/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcRelAssociates;
import IFC2X3.IfcRoot;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Associates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelAssociatesImpl#getRelatedObjects <em>Related Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelAssociates")
@XmlSeeAlso({ IfcRelAssociatesClassificationImpl.class, IfcRelAssociatesProfilePropertiesImpl.class, IfcRelAssociatesMaterialImpl.class, IfcRelAssociatesApprovalImpl.class, IfcRelAssociatesDocumentImpl.class, IfcRelAssociatesAppliedValueImpl.class,
		IfcRelAssociatesConstraintImpl.class, IfcRelAssociatesLibraryImpl.class })
@XmlRootElement(name = "IfcRelAssociatesElement")
public class IfcRelAssociatesImpl extends IfcRelationshipImpl implements IfcRelAssociates {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssociatesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelAssociates();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRoot> getRelatedObjects() {
		return (EList<IfcRoot>)eGet(IFC2X3Package.eINSTANCE.getIfcRelAssociates_RelatedObjects(), true);
	}

} //IfcRelAssociatesImpl
