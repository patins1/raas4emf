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
import IFC2X3.IfcDraughtingPreDefinedCurveFont;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Draughting Pre Defined Curve Font</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDraughtingPreDefinedCurveFont")
@XmlRootElement(name = "IfcDraughtingPreDefinedCurveFontElement")
public class IfcDraughtingPreDefinedCurveFontImpl extends IfcPreDefinedCurveFontImpl implements IfcDraughtingPreDefinedCurveFont {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDraughtingPreDefinedCurveFontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDraughtingPreDefinedCurveFont();
	}

} //IfcDraughtingPreDefinedCurveFontImpl
