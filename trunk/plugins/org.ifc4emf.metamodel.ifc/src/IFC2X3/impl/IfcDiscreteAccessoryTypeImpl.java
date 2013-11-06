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
import IFC2X3.IfcDiscreteAccessoryType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Discrete Accessory Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDiscreteAccessoryType")
@XmlSeeAlso({ IfcVibrationIsolatorTypeImpl.class })
@XmlRootElement(name = "IfcDiscreteAccessoryTypeElement")
public class IfcDiscreteAccessoryTypeImpl extends IfcElementComponentTypeImpl implements IfcDiscreteAccessoryType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDiscreteAccessoryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDiscreteAccessoryType();
	}

} //IfcDiscreteAccessoryTypeImpl
