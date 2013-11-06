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
import IFC2X3.IfcMaterial;
import IFC2X3.IfcMaterialDefinitionRepresentation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Material Definition Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcMaterialDefinitionRepresentationImpl#getRepresentedMaterial <em>Represented Material</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcMaterialDefinitionRepresentation")
@XmlRootElement(name = "IfcMaterialDefinitionRepresentationElement")
public class IfcMaterialDefinitionRepresentationImpl extends IfcProductRepresentationImpl implements IfcMaterialDefinitionRepresentation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMaterialDefinitionRepresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcMaterialDefinitionRepresentation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterial getRepresentedMaterial() {
		return (IfcMaterial)eGet(IFC2X3Package.eINSTANCE.getIfcMaterialDefinitionRepresentation_RepresentedMaterial(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentedMaterial(IfcMaterial newRepresentedMaterial) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMaterialDefinitionRepresentation_RepresentedMaterial(), newRepresentedMaterial);
	}

} //IfcMaterialDefinitionRepresentationImpl
