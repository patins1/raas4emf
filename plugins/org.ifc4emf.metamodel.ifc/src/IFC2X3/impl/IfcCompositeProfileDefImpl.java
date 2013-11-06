/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcCompositeProfileDef;
import IFC2X3.IfcProfileDef;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Composite Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcCompositeProfileDefImpl#getProfiles <em>Profiles</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCompositeProfileDefImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCompositeProfileDef")
@XmlRootElement(name = "IfcCompositeProfileDefElement")
public class IfcCompositeProfileDefImpl extends IfcProfileDefImpl implements IfcCompositeProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCompositeProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCompositeProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcProfileDef> getProfiles() {
		return (EList<IfcProfileDef>)eGet(IFC2X3Package.eINSTANCE.getIfcCompositeProfileDef_Profiles(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcCompositeProfileDef_Label(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCompositeProfileDef_Label(), newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLabel() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCompositeProfileDef_Label());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLabel() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCompositeProfileDef_Label());
	}

} //IfcCompositeProfileDefImpl
