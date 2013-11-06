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
import IFC2X3.IfcFeatureElement;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Feature Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcFeatureElement")
@XmlSeeAlso({ IfcChamferEdgeFeatureImpl.class, IfcRoundedEdgeFeatureImpl.class, IfcFeatureElementSubtractionImpl.class, IfcEdgeFeatureImpl.class, IfcProjectionElementImpl.class, IfcOpeningElementImpl.class, IfcFeatureElementAdditionImpl.class })
@XmlRootElement(name = "IfcFeatureElementElement")
public class IfcFeatureElementImpl extends IfcElementImpl implements IfcFeatureElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFeatureElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcFeatureElement();
	}

} //IfcFeatureElementImpl
