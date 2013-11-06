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
import IFC2X3.IfcReinforcingElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Reinforcing Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcReinforcingElementImpl#getSteelGrade <em>Steel Grade</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcReinforcingElement")
@XmlSeeAlso({ IfcTendonAnchorImpl.class, IfcReinforcingBarImpl.class, IfcReinforcingMeshImpl.class, IfcTendonImpl.class })
@XmlRootElement(name = "IfcReinforcingElementElement")
public class IfcReinforcingElementImpl extends IfcBuildingElementComponentImpl implements IfcReinforcingElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcReinforcingElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcReinforcingElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSteelGrade() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcReinforcingElement_SteelGrade(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSteelGrade(String newSteelGrade) {
		eSet(IFC2X3Package.eINSTANCE.getIfcReinforcingElement_SteelGrade(), newSteelGrade);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSteelGrade() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcReinforcingElement_SteelGrade());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSteelGrade() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcReinforcingElement_SteelGrade());
	}

} //IfcReinforcingElementImpl
