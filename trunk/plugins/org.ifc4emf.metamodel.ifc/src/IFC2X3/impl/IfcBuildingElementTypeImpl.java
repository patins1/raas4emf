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
import IFC2X3.IfcBuildingElementType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Building Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcBuildingElementType")
@XmlSeeAlso({ IfcColumnTypeImpl.class, IfcCurtainWallTypeImpl.class, IfcRailingTypeImpl.class, IfcCoveringTypeImpl.class, IfcSlabTypeImpl.class, IfcWallTypeImpl.class, IfcBuildingElementProxyTypeImpl.class, IfcBeamTypeImpl.class, IfcRampFlightTypeImpl.class,
		IfcStairFlightTypeImpl.class, IfcPlateTypeImpl.class, IfcMemberTypeImpl.class })
@XmlRootElement(name = "IfcBuildingElementTypeElement")
public class IfcBuildingElementTypeImpl extends IfcElementTypeImpl implements IfcBuildingElementType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBuildingElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcBuildingElementType();
	}

} //IfcBuildingElementTypeImpl
