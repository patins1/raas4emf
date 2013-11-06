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
import IFC2X3.IfcCartesianTransformationOperator2D;
import IFC2X3.IfcDerivedProfileDef;
import IFC2X3.IfcProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Derived Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcDerivedProfileDefImpl#getParentProfile <em>Parent Profile</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedProfileDefImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDerivedProfileDefImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDerivedProfileDef")
@XmlRootElement(name = "IfcDerivedProfileDefElement")
public class IfcDerivedProfileDefImpl extends IfcProfileDefImpl implements IfcDerivedProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDerivedProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDerivedProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianTransformationOperator2D getOperator() {
		return (IfcCartesianTransformationOperator2D)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedProfileDef_Operator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(IfcCartesianTransformationOperator2D newOperator) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedProfileDef_Operator(), newOperator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileDef getParentProfile() {
		return (IfcProfileDef)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedProfileDef_ParentProfile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentProfile(IfcProfileDef newParentProfile) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedProfileDef_ParentProfile(), newParentProfile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcDerivedProfileDef_Label(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDerivedProfileDef_Label(), newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLabel() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcDerivedProfileDef_Label());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLabel() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcDerivedProfileDef_Label());
	}

} //IfcDerivedProfileDefImpl
