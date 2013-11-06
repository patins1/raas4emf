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
import IFC2X3.IfcDistributionControlElementType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Distribution Control Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDistributionControlElementType")
@XmlSeeAlso({ IfcControllerTypeImpl.class, IfcSensorTypeImpl.class, IfcAlarmTypeImpl.class, IfcFlowInstrumentTypeImpl.class, IfcActuatorTypeImpl.class })
@XmlRootElement(name = "IfcDistributionControlElementTypeElement")
public class IfcDistributionControlElementTypeImpl extends IfcDistributionElementTypeImpl implements IfcDistributionControlElementType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDistributionControlElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDistributionControlElementType();
	}

} //IfcDistributionControlElementTypeImpl
