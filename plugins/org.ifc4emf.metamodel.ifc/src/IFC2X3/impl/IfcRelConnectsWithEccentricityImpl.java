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
import IFC2X3.IfcConnectionGeometry;
import IFC2X3.IfcRelConnectsWithEccentricity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects With Eccentricity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsWithEccentricityImpl#getConnectionConstraint <em>Connection Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelConnectsWithEccentricity")
@XmlRootElement(name = "IfcRelConnectsWithEccentricityElement")
public class IfcRelConnectsWithEccentricityImpl extends IfcRelConnectsStructuralMemberImpl implements IfcRelConnectsWithEccentricity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsWithEccentricityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelConnectsWithEccentricity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionGeometry getConnectionConstraint() {
		return (IfcConnectionGeometry)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsWithEccentricity_ConnectionConstraint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionConstraint(IfcConnectionGeometry newConnectionConstraint) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsWithEccentricity_ConnectionConstraint(), newConnectionConstraint);
	}

} //IfcRelConnectsWithEccentricityImpl
