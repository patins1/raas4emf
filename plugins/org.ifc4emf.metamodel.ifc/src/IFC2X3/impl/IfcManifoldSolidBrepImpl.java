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
import IFC2X3.IfcClosedShell;
import IFC2X3.IfcManifoldSolidBrep;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Manifold Solid Brep</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcManifoldSolidBrepImpl#getOuter <em>Outer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcManifoldSolidBrep")
@XmlSeeAlso({ IfcFacetedBrepWithVoidsImpl.class, IfcFacetedBrepImpl.class })
@XmlRootElement(name = "IfcManifoldSolidBrepElement")
public class IfcManifoldSolidBrepImpl extends IfcSolidModelImpl implements IfcManifoldSolidBrep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcManifoldSolidBrepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcManifoldSolidBrep();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClosedShell getOuter() {
		return (IfcClosedShell)eGet(IFC2X3Package.eINSTANCE.getIfcManifoldSolidBrep_Outer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuter(IfcClosedShell newOuter) {
		eSet(IFC2X3Package.eINSTANCE.getIfcManifoldSolidBrep_Outer(), newOuter);
	}

} //IfcManifoldSolidBrepImpl
