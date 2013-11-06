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
import IFC2X3.IfcConstraint;
import IFC2X3.IfcRelAssociatesConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Associates Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelAssociatesConstraintImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelAssociatesConstraintImpl#getRelatingConstraint <em>Relating Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelAssociatesConstraint")
@XmlRootElement(name = "IfcRelAssociatesConstraintElement")
public class IfcRelAssociatesConstraintImpl extends IfcRelAssociatesImpl implements IfcRelAssociatesConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssociatesConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelAssociatesConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConstraint getRelatingConstraint() {
		return (IfcConstraint)eGet(IFC2X3Package.eINSTANCE.getIfcRelAssociatesConstraint_RelatingConstraint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingConstraint(IfcConstraint newRelatingConstraint) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelAssociatesConstraint_RelatingConstraint(), newRelatingConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntent() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcRelAssociatesConstraint_Intent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntent(String newIntent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelAssociatesConstraint_Intent(), newIntent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIntent() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRelAssociatesConstraint_Intent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIntent() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRelAssociatesConstraint_Intent());
	}

} //IfcRelAssociatesConstraintImpl
