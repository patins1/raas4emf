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
import IFC2X3.IfcStructuralLoadStatic;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Static</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStructuralLoadStatic")
@XmlSeeAlso({ IfcStructuralLoadLinearForceImpl.class, IfcStructuralLoadSingleDisplacementDistortionImpl.class, IfcStructuralLoadSingleDisplacementImpl.class, IfcStructuralLoadTemperatureImpl.class, IfcStructuralLoadSingleForceImpl.class,
		IfcStructuralLoadSingleForceWarpingImpl.class, IfcStructuralLoadPlanarForceImpl.class })
@XmlRootElement(name = "IfcStructuralLoadStaticElement")
public class IfcStructuralLoadStaticImpl extends IfcStructuralLoadImpl implements IfcStructuralLoadStatic {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadStaticImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralLoadStatic();
	}

} //IfcStructuralLoadStaticImpl
