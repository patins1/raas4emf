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
import IFC2X3.IfcCurveFontOrScaledCurveFontSelect;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Curve Font Or Scaled Curve Font Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCurveFontOrScaledCurveFontSelect")
@XmlSeeAlso({ IfcCurveStyleFontImpl.class, IfcCurveStyleFontSelectImpl.class, IfcPreDefinedCurveFontImpl.class, IfcDraughtingPreDefinedCurveFontImpl.class, IfcCurveStyleFontAndScalingImpl.class })
@XmlRootElement(name = "IfcCurveFontOrScaledCurveFontSelectElement")
public abstract class IfcCurveFontOrScaledCurveFontSelectImpl extends CDOObjectImpl implements IfcCurveFontOrScaledCurveFontSelect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCurveFontOrScaledCurveFontSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCurveFontOrScaledCurveFontSelect();
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

} //IfcCurveFontOrScaledCurveFontSelectImpl
