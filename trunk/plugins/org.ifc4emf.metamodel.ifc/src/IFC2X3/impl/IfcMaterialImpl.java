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
import IFC2X3.IfcMaterialClassificationRelationship;
import IFC2X3.IfcMaterialDefinitionRepresentation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcMaterialImpl#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMaterialImpl#getHasRepresentation <em>Has Representation</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMaterialImpl#getClassifiedAs <em>Classified As</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcMaterial")
@XmlRootElement(name = "IfcMaterialElement")
public class IfcMaterialImpl extends IfcMaterialSelectImpl implements IfcMaterial {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMaterialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcMaterial();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialDefinitionRepresentation getHasRepresentation() {
		return (IfcMaterialDefinitionRepresentation)eGet(IFC2X3Package.eINSTANCE.getIfcMaterial_HasRepresentation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasRepresentation(IfcMaterialDefinitionRepresentation newHasRepresentation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMaterial_HasRepresentation(), newHasRepresentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialClassificationRelationship getClassifiedAs() {
		return (IfcMaterialClassificationRelationship)eGet(IFC2X3Package.eINSTANCE.getIfcMaterial_ClassifiedAs(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifiedAs(IfcMaterialClassificationRelationship newClassifiedAs) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMaterial_ClassifiedAs(), newClassifiedAs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcMaterial_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMaterial_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMaterial_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMaterial_Name());
	}

} //IfcMaterialImpl
