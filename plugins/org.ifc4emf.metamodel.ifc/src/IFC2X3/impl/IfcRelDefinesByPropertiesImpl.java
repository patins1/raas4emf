/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcPropertySetDefinition;
import IFC2X3.IfcRelDefinesByProperties;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Defines By Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelDefinesByPropertiesImpl#getRelatingPropertyDefinition <em>Relating Property Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelDefinesByProperties")
@XmlSeeAlso({ IfcRelOverridesPropertiesImpl.class })
@XmlRootElement(name = "IfcRelDefinesByPropertiesElement")
public class IfcRelDefinesByPropertiesImpl extends IfcRelDefinesImpl implements IfcRelDefinesByProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelDefinesByPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelDefinesByProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertySetDefinition getRelatingPropertyDefinition() {
		return (IfcPropertySetDefinition)eGet(IFC2X3Package.eINSTANCE.getIfcRelDefinesByProperties_RelatingPropertyDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingPropertyDefinition(IfcPropertySetDefinition newRelatingPropertyDefinition) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelDefinesByProperties_RelatingPropertyDefinition(), newRelatingPropertyDefinition);
	}

} //IfcRelDefinesByPropertiesImpl
