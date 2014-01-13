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
import IFC2X3.IfcTendonAnchor;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Tendon Anchor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTendonAnchor")
@XmlRootElement(name = "IfcTendonAnchorElement")
public class IfcTendonAnchorImpl extends IfcReinforcingElementImpl implements IfcTendonAnchor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTendonAnchorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTendonAnchor();
	}

} //IfcTendonAnchorImpl