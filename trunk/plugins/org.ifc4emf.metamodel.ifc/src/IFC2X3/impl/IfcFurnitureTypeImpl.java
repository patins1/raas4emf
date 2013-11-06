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
import IFC2X3.IfcAssemblyPlaceEnum;
import IFC2X3.IfcFurnitureType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Furniture Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcFurnitureTypeImpl#getAssemblyPlace <em>Assembly Place</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcFurnitureType")
@XmlRootElement(name = "IfcFurnitureTypeElement")
public class IfcFurnitureTypeImpl extends IfcFurnishingElementTypeImpl implements IfcFurnitureType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFurnitureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcFurnitureType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAssemblyPlaceEnum getAssemblyPlace() {
		return (IfcAssemblyPlaceEnum)eGet(IFC2X3Package.eINSTANCE.getIfcFurnitureType_AssemblyPlace(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyPlace(IfcAssemblyPlaceEnum newAssemblyPlace) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFurnitureType_AssemblyPlace(), newAssemblyPlace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAssemblyPlace() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcFurnitureType_AssemblyPlace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAssemblyPlace() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcFurnitureType_AssemblyPlace());
	}

} //IfcFurnitureTypeImpl
