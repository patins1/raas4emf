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
import IFC2X3.IfcCurveStyleFontPattern;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Curve Style Font Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcCurveStyleFontPatternImpl#getVisibleSegmentLength <em>Visible Segment Length</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCurveStyleFontPatternImpl#getInvisibleSegmentLength <em>Invisible Segment Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCurveStyleFontPattern")
@XmlRootElement(name = "IfcCurveStyleFontPatternElement")
public class IfcCurveStyleFontPatternImpl extends CDOObjectImpl implements IfcCurveStyleFontPattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCurveStyleFontPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCurveStyleFontPattern();
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
	public Double getInvisibleSegmentLength() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCurveStyleFontPattern_InvisibleSegmentLength(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvisibleSegmentLength(Double newInvisibleSegmentLength) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCurveStyleFontPattern_InvisibleSegmentLength(), newInvisibleSegmentLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInvisibleSegmentLength() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCurveStyleFontPattern_InvisibleSegmentLength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInvisibleSegmentLength() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCurveStyleFontPattern_InvisibleSegmentLength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getVisibleSegmentLength() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcCurveStyleFontPattern_VisibleSegmentLength(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleSegmentLength(Double newVisibleSegmentLength) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCurveStyleFontPattern_VisibleSegmentLength(), newVisibleSegmentLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibleSegmentLength() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCurveStyleFontPattern_VisibleSegmentLength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibleSegmentLength() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCurveStyleFontPattern_VisibleSegmentLength());
	}

} //IfcCurveStyleFontPatternImpl
