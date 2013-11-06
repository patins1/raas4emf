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
import IFC2X3.IfcArbitraryOpenProfileDef;
import IFC2X3.IfcBoundedCurve;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Arbitrary Open Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcArbitraryOpenProfileDefImpl#getCurve <em>Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcArbitraryOpenProfileDef")
@XmlSeeAlso({ IfcCenterLineProfileDefImpl.class })
@XmlRootElement(name = "IfcArbitraryOpenProfileDefElement")
public class IfcArbitraryOpenProfileDefImpl extends IfcProfileDefImpl implements IfcArbitraryOpenProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcArbitraryOpenProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcArbitraryOpenProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundedCurve getCurve() {
		return (IfcBoundedCurve)eGet(IFC2X3Package.eINSTANCE.getIfcArbitraryOpenProfileDef_Curve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurve(IfcBoundedCurve newCurve) {
		eSet(IFC2X3Package.eINSTANCE.getIfcArbitraryOpenProfileDef_Curve(), newCurve);
	}

} //IfcArbitraryOpenProfileDefImpl
