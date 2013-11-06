/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcShapeAspect;
import IFC2X3.IfcStructuralLoad;
import IFC2X3.IfcStructuralPlanarActionVarying;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Planar Action Varying</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStructuralPlanarActionVaryingImpl#getVaryingAppliedLoadLocation <em>Varying Applied Load Location</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralPlanarActionVaryingImpl#getSubsequentAppliedLoads <em>Subsequent Applied Loads</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStructuralPlanarActionVarying")
@XmlRootElement(name = "IfcStructuralPlanarActionVaryingElement")
public class IfcStructuralPlanarActionVaryingImpl extends IfcStructuralPlanarActionImpl implements IfcStructuralPlanarActionVarying {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralPlanarActionVaryingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralPlanarActionVarying();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcStructuralLoad> getSubsequentAppliedLoads() {
		return (EList<IfcStructuralLoad>)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralPlanarActionVarying_SubsequentAppliedLoads(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShapeAspect getVaryingAppliedLoadLocation() {
		return (IfcShapeAspect)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralPlanarActionVarying_VaryingAppliedLoadLocation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaryingAppliedLoadLocation(IfcShapeAspect newVaryingAppliedLoadLocation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralPlanarActionVarying_VaryingAppliedLoadLocation(), newVaryingAppliedLoadLocation);
	}

} //IfcStructuralPlanarActionVaryingImpl
