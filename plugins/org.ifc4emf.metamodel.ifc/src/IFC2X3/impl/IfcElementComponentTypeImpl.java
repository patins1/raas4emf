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
import IFC2X3.IfcElementComponentType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Element Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcElementComponentType")
@XmlSeeAlso({ IfcMechanicalFastenerTypeImpl.class, IfcFastenerTypeImpl.class, IfcDiscreteAccessoryTypeImpl.class, IfcVibrationIsolatorTypeImpl.class })
@XmlRootElement(name = "IfcElementComponentTypeElement")
public class IfcElementComponentTypeImpl extends IfcElementTypeImpl implements IfcElementComponentType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcElementComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcElementComponentType();
	}

} //IfcElementComponentTypeImpl
