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
import IFC2X3.IfcDraughtingPreDefinedColour;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Draughting Pre Defined Colour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDraughtingPreDefinedColour")
@XmlRootElement(name = "IfcDraughtingPreDefinedColourElement")
public class IfcDraughtingPreDefinedColourImpl extends IfcPreDefinedColourImpl implements IfcDraughtingPreDefinedColour {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDraughtingPreDefinedColourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDraughtingPreDefinedColour();
	}

} //IfcDraughtingPreDefinedColourImpl
