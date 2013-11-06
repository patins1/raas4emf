/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcProduct;
import IFC2X3.IfcRelContainedInSpatialStructure;
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
 * An implementation of the model object '<em><b>Ifc Rel Contained In Spatial Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelContainedInSpatialStructureImpl#getRelatedElements <em>Related Elements</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelContainedInSpatialStructureImpl#getRelatingStructure <em>Relating Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelContainedInSpatialStructure")
@XmlRootElement(name = "IfcRelContainedInSpatialStructureElement")
public class IfcRelContainedInSpatialStructureImpl extends IfcRelConnectsImpl implements IfcRelContainedInSpatialStructure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelContainedInSpatialStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelContainedInSpatialStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpatialStructureElement getRelatingStructure() {
		return (IfcSpatialStructureElement)eGet(IFC2X3Package.eINSTANCE.getIfcRelContainedInSpatialStructure_RelatingStructure(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingStructure(IfcSpatialStructureElement newRelatingStructure) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelContainedInSpatialStructure_RelatingStructure(), newRelatingStructure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcProduct> getRelatedElements() {
		return (EList<IfcProduct>)eGet(IFC2X3Package.eINSTANCE.getIfcRelContainedInSpatialStructure_RelatedElements(), true);
	}

} //IfcRelContainedInSpatialStructureImpl
