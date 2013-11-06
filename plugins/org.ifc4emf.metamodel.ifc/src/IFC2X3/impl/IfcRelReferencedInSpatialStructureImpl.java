/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcProduct;
import IFC2X3.IfcRelReferencedInSpatialStructure;
import IFC2X3.IfcSpatialStructureElement;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
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
 * An implementation of the model object '<em><b>Ifc Rel Referenced In Spatial Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelReferencedInSpatialStructureImpl#getRelatedElements <em>Related Elements</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelReferencedInSpatialStructureImpl#getRelatingStructure <em>Relating Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelReferencedInSpatialStructure")
@XmlRootElement(name = "IfcRelReferencedInSpatialStructureElement")
public class IfcRelReferencedInSpatialStructureImpl extends IfcRelConnectsImpl implements IfcRelReferencedInSpatialStructure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelReferencedInSpatialStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelReferencedInSpatialStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpatialStructureElement getRelatingStructure() {
		return (IfcSpatialStructureElement)eGet(IFC2X3Package.eINSTANCE.getIfcRelReferencedInSpatialStructure_RelatingStructure(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingStructure(IfcSpatialStructureElement newRelatingStructure) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelReferencedInSpatialStructure_RelatingStructure(), newRelatingStructure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcProduct> getRelatedElements() {
		return (EList<IfcProduct>)eGet(IFC2X3Package.eINSTANCE.getIfcRelReferencedInSpatialStructure_RelatedElements(), true);
	}

} //IfcRelReferencedInSpatialStructureImpl
