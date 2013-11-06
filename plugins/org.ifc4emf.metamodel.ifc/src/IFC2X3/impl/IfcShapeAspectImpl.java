/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcProductDefinitionShape;
import IFC2X3.IfcShapeAspect;
import IFC2X3.IfcShapeModel;

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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Shape Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcShapeAspectImpl#getShapeRepresentations <em>Shape Representations</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcShapeAspectImpl#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcShapeAspectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcShapeAspectImpl#getProductDefinitional <em>Product Definitional</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcShapeAspectImpl#getPartOfProductDefinitionShape <em>Part Of Product Definition Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcShapeAspect")
@XmlRootElement(name = "IfcShapeAspectElement")
public class IfcShapeAspectImpl extends CDOObjectImpl implements IfcShapeAspect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcShapeAspectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcShapeAspect();
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
	public EList<IfcShapeModel> getShapeRepresentations() {
		return (EList<IfcShapeModel>)eGet(IFC2X3Package.eINSTANCE.getIfcShapeAspect_ShapeRepresentations(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProductDefinitionShape getPartOfProductDefinitionShape() {
		return (IfcProductDefinitionShape)eGet(IFC2X3Package.eINSTANCE.getIfcShapeAspect_PartOfProductDefinitionShape(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOfProductDefinitionShape(IfcProductDefinitionShape newPartOfProductDefinitionShape) {
		eSet(IFC2X3Package.eINSTANCE.getIfcShapeAspect_PartOfProductDefinitionShape(), newPartOfProductDefinitionShape);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getProductDefinitional() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcShapeAspect_ProductDefinitional(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductDefinitional(Boolean newProductDefinitional) {
		eSet(IFC2X3Package.eINSTANCE.getIfcShapeAspect_ProductDefinitional(), newProductDefinitional);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProductDefinitional() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcShapeAspect_ProductDefinitional());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProductDefinitional() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcShapeAspect_ProductDefinitional());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcShapeAspect_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(IFC2X3Package.eINSTANCE.getIfcShapeAspect_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcShapeAspect_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcShapeAspect_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcShapeAspect_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcShapeAspect_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcShapeAspect_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcShapeAspect_Name());
	}

} //IfcShapeAspectImpl
