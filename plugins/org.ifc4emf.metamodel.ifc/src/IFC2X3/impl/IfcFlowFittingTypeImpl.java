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
import IFC2X3.IfcFlowFittingType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Flow Fitting Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcFlowFittingType")
@XmlSeeAlso({ IfcJunctionBoxTypeImpl.class, IfcDuctFittingTypeImpl.class, IfcCableCarrierFittingTypeImpl.class, IfcPipeFittingTypeImpl.class })
@XmlRootElement(name = "IfcFlowFittingTypeElement")
public class IfcFlowFittingTypeImpl extends IfcDistributionFlowElementTypeImpl implements IfcFlowFittingType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFlowFittingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcFlowFittingType();
	}

} //IfcFlowFittingTypeImpl
