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
import IFC2X3.IfcColour;
import IFC2X3.IfcCurveFontOrScaledCurveFontSelect;
import IFC2X3.IfcCurveStyle;
import IFC2X3.IfcSizeSelect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Curve Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcCurveStyleImpl#getCurveFont <em>Curve Font</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCurveStyleImpl#getCurveWidth <em>Curve Width</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCurveStyleImpl#getCurveColour <em>Curve Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCurveStyle")
@XmlRootElement(name = "IfcCurveStyleElement")
public class IfcCurveStyleImpl extends IfcPresentationStyleImpl implements IfcCurveStyle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCurveStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCurveStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect getCurveWidth() {
		return (IfcSizeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcCurveStyle_CurveWidth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveWidth(IfcSizeSelect newCurveWidth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCurveStyle_CurveWidth(), newCurveWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveFontOrScaledCurveFontSelect getCurveFont() {
		return (IfcCurveFontOrScaledCurveFontSelect)eGet(IFC2X3Package.eINSTANCE.getIfcCurveStyle_CurveFont(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveFont(IfcCurveFontOrScaledCurveFontSelect newCurveFont) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCurveStyle_CurveFont(), newCurveFont);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColour getCurveColour() {
		return (IfcColour)eGet(IFC2X3Package.eINSTANCE.getIfcCurveStyle_CurveColour(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveColour(IfcColour newCurveColour) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCurveStyle_CurveColour(), newCurveColour);
	}

} //IfcCurveStyleImpl
