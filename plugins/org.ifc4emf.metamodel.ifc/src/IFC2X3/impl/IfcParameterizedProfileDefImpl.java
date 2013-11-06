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
import IFC2X3.IfcAxis2Placement2D;
import IFC2X3.IfcParameterizedProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Parameterized Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcParameterizedProfileDefImpl#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcParameterizedProfileDef")
@XmlSeeAlso({ IfcRectangleHollowProfileDefImpl.class, IfcCircleProfileDefImpl.class, IfcCraneRailAShapeProfileDefImpl.class, IfcIShapeProfileDefImpl.class, IfcUShapeProfileDefImpl.class, IfcLShapeProfileDefImpl.class, IfcAsymmetricIShapeProfileDefImpl.class,
		IfcTrapeziumProfileDefImpl.class, IfcTShapeProfileDefImpl.class, IfcEllipseProfileDefImpl.class, IfcZShapeProfileDefImpl.class, IfcCShapeProfileDefImpl.class, IfcCircleHollowProfileDefImpl.class, IfcRectangleProfileDefImpl.class, IfcCraneRailFShapeProfileDefImpl.class,
		IfcRoundedRectangleProfileDefImpl.class })
@XmlRootElement(name = "IfcParameterizedProfileDefElement")
public class IfcParameterizedProfileDefImpl extends IfcProfileDefImpl implements IfcParameterizedProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcParameterizedProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcParameterizedProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement2D getPosition() {
		return (IfcAxis2Placement2D)eGet(IFC2X3Package.eINSTANCE.getIfcParameterizedProfileDef_Position(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(IfcAxis2Placement2D newPosition) {
		eSet(IFC2X3Package.eINSTANCE.getIfcParameterizedProfileDef_Position(), newPosition);
	}

} //IfcParameterizedProfileDefImpl
