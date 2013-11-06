/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcClosedShell;
import IFC2X3.IfcFacetedBrepWithVoids;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Faceted Brep With Voids</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcFacetedBrepWithVoidsImpl#getVoids <em>Voids</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcFacetedBrepWithVoids")
@XmlRootElement(name = "IfcFacetedBrepWithVoidsElement")
public class IfcFacetedBrepWithVoidsImpl extends IfcManifoldSolidBrepImpl implements IfcFacetedBrepWithVoids {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFacetedBrepWithVoidsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcFacetedBrepWithVoids();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcClosedShell> getVoids() {
		return (EList<IfcClosedShell>)eGet(IFC2X3Package.eINSTANCE.getIfcFacetedBrepWithVoids_Voids(), true);
	}

} //IfcFacetedBrepWithVoidsImpl
