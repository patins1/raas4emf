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
import IFC2X3.IfcOrientationSelect;
import IFC2X3.IfcProfileProperties;
import IFC2X3.IfcRelAssociatesProfileProperties;
import IFC2X3.IfcShapeAspect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Associates Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelAssociatesProfilePropertiesImpl#getRelatingProfileProperties <em>Relating Profile Properties</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelAssociatesProfilePropertiesImpl#getProfileSectionLocation <em>Profile Section Location</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelAssociatesProfilePropertiesImpl#getProfileOrientation <em>Profile Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelAssociatesProfileProperties")
@XmlRootElement(name = "IfcRelAssociatesProfilePropertiesElement")
public class IfcRelAssociatesProfilePropertiesImpl extends IfcRelAssociatesImpl implements IfcRelAssociatesProfileProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssociatesProfilePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelAssociatesProfileProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOrientationSelect getProfileOrientation() {
		return (IfcOrientationSelect)eGet(IFC2X3Package.eINSTANCE.getIfcRelAssociatesProfileProperties_ProfileOrientation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileOrientation(IfcOrientationSelect newProfileOrientation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelAssociatesProfileProperties_ProfileOrientation(), newProfileOrientation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShapeAspect getProfileSectionLocation() {
		return (IfcShapeAspect)eGet(IFC2X3Package.eINSTANCE.getIfcRelAssociatesProfileProperties_ProfileSectionLocation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileSectionLocation(IfcShapeAspect newProfileSectionLocation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelAssociatesProfileProperties_ProfileSectionLocation(), newProfileSectionLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileProperties getRelatingProfileProperties() {
		return (IfcProfileProperties)eGet(IFC2X3Package.eINSTANCE.getIfcRelAssociatesProfileProperties_RelatingProfileProperties(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingProfileProperties(IfcProfileProperties newRelatingProfileProperties) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelAssociatesProfileProperties_RelatingProfileProperties(), newRelatingProfileProperties);
	}

} //IfcRelAssociatesProfilePropertiesImpl
