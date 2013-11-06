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
import IFC2X3.IfcBuildingElement;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Building Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcBuildingElement")
@XmlSeeAlso({ IfcCoveringImpl.class, IfcSlabImpl.class, IfcRoofImpl.class, IfcTendonAnchorImpl.class, IfcBuildingElementProxyImpl.class, IfcReinforcingBarImpl.class, IfcPileImpl.class, IfcColumnImpl.class, IfcCurtainWallImpl.class, IfcWallImpl.class, IfcBeamImpl.class,
		IfcWallStandardCaseImpl.class, IfcReinforcingElementImpl.class, IfcBuildingElementComponentImpl.class, IfcBuildingElementPartImpl.class, IfcReinforcingMeshImpl.class, IfcWindowImpl.class, IfcPlateImpl.class, IfcFootingImpl.class, IfcRailingImpl.class,
		IfcStairFlightImpl.class, IfcStairImpl.class, IfcTendonImpl.class, IfcRampFlightImpl.class, IfcMemberImpl.class, IfcDoorImpl.class, IfcRampImpl.class })
@XmlRootElement(name = "IfcBuildingElementElement")
public class IfcBuildingElementImpl extends IfcElementImpl implements IfcBuildingElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBuildingElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcBuildingElement();
	}

} //IfcBuildingElementImpl
