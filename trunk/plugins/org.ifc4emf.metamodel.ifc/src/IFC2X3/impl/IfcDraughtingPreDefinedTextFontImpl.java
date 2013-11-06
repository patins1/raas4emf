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
import IFC2X3.IfcDraughtingPreDefinedTextFont;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Draughting Pre Defined Text Font</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDraughtingPreDefinedTextFont")
@XmlRootElement(name = "IfcDraughtingPreDefinedTextFontElement")
public class IfcDraughtingPreDefinedTextFontImpl extends IfcPreDefinedTextFontImpl implements IfcDraughtingPreDefinedTextFont {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDraughtingPreDefinedTextFontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDraughtingPreDefinedTextFont();
	}

} //IfcDraughtingPreDefinedTextFontImpl
