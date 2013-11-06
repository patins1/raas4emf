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
import IFC2X3.IfcMaterialSelect;
import IFC2X3.IfcRelAssociatesMaterial;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Associates Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelAssociatesMaterialImpl#getRelatingMaterial <em>Relating Material</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelAssociatesMaterial")
@XmlRootElement(name = "IfcRelAssociatesMaterialElement")
public class IfcRelAssociatesMaterialImpl extends IfcRelAssociatesImpl implements IfcRelAssociatesMaterial {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssociatesMaterialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelAssociatesMaterial();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialSelect getRelatingMaterial() {
		return (IfcMaterialSelect)eGet(IFC2X3Package.eINSTANCE.getIfcRelAssociatesMaterial_RelatingMaterial(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingMaterial(IfcMaterialSelect newRelatingMaterial) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelAssociatesMaterial_RelatingMaterial(), newRelatingMaterial);
	}

} //IfcRelAssociatesMaterialImpl
