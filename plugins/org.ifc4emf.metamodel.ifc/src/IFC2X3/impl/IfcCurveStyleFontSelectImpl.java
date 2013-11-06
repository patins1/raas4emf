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
import IFC2X3.IfcCurveStyleFontSelect;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Curve Style Font Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCurveStyleFontSelect")
@XmlSeeAlso({ IfcCurveStyleFontImpl.class, IfcPreDefinedCurveFontImpl.class, IfcDraughtingPreDefinedCurveFontImpl.class })
@XmlRootElement(name = "IfcCurveStyleFontSelectElement")
public abstract class IfcCurveStyleFontSelectImpl extends IfcCurveFontOrScaledCurveFontSelectImpl implements IfcCurveStyleFontSelect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCurveStyleFontSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCurveStyleFontSelect();
	}

} //IfcCurveStyleFontSelectImpl
