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
import IFC2X3.IfcBuildingElementComponent;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Building Element Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcBuildingElementComponent")
@XmlSeeAlso({ IfcTendonAnchorImpl.class, IfcReinforcingBarImpl.class, IfcReinforcingElementImpl.class, IfcBuildingElementPartImpl.class, IfcReinforcingMeshImpl.class, IfcTendonImpl.class })
@XmlRootElement(name = "IfcBuildingElementComponentElement")
public class IfcBuildingElementComponentImpl extends IfcBuildingElementImpl implements IfcBuildingElementComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBuildingElementComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcBuildingElementComponent();
	}

} //IfcBuildingElementComponentImpl
