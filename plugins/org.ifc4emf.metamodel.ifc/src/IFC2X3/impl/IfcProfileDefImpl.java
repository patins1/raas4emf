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
import IFC2X3.IfcProfileDef;
import IFC2X3.IfcProfileTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcProfileDefImpl#getProfileType <em>Profile Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcProfileDefImpl#getProfileName <em>Profile Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcProfileDef")
@XmlSeeAlso({ IfcRectangleHollowProfileDefImpl.class, IfcCircleProfileDefImpl.class, IfcCraneRailAShapeProfileDefImpl.class, IfcIShapeProfileDefImpl.class, IfcArbitraryClosedProfileDefImpl.class, IfcUShapeProfileDefImpl.class, IfcLShapeProfileDefImpl.class,
		IfcAsymmetricIShapeProfileDefImpl.class, IfcTrapeziumProfileDefImpl.class, IfcTShapeProfileDefImpl.class, IfcCenterLineProfileDefImpl.class, IfcEllipseProfileDefImpl.class, IfcZShapeProfileDefImpl.class, IfcCShapeProfileDefImpl.class,
		IfcArbitraryProfileDefWithVoidsImpl.class, IfcRectangleProfileDefImpl.class, IfcCircleHollowProfileDefImpl.class, IfcCraneRailFShapeProfileDefImpl.class, IfcDerivedProfileDefImpl.class, IfcParameterizedProfileDefImpl.class, IfcCompositeProfileDefImpl.class,
		IfcRoundedRectangleProfileDefImpl.class, IfcArbitraryOpenProfileDefImpl.class })
@XmlRootElement(name = "IfcProfileDefElement")
public class IfcProfileDefImpl extends CDOObjectImpl implements IfcProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcProfileDef();
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
	public String getProfileName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcProfileDef_ProfileName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileName(String newProfileName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcProfileDef_ProfileName(), newProfileName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProfileName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcProfileDef_ProfileName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProfileName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcProfileDef_ProfileName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileTypeEnum getProfileType() {
		return (IfcProfileTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcProfileDef_ProfileType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileType(IfcProfileTypeEnum newProfileType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcProfileDef_ProfileType(), newProfileType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProfileType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcProfileDef_ProfileType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProfileType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcProfileDef_ProfileType());
	}

} //IfcProfileDefImpl
