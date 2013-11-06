/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcShapeAspect;
import IFC2X3.IfcStructuralLinearActionVarying;
import IFC2X3.IfcStructuralLoad;

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
 * An implementation of the model object '<em><b>Ifc Structural Linear Action Varying</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStructuralLinearActionVaryingImpl#getVaryingAppliedLoadLocation <em>Varying Applied Load Location</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralLinearActionVaryingImpl#getSubsequentAppliedLoads <em>Subsequent Applied Loads</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStructuralLinearActionVarying")
@XmlRootElement(name = "IfcStructuralLinearActionVaryingElement")
public class IfcStructuralLinearActionVaryingImpl extends IfcStructuralLinearActionImpl implements IfcStructuralLinearActionVarying {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLinearActionVaryingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralLinearActionVarying();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcStructuralLoad> getSubsequentAppliedLoads() {
		return (EList<IfcStructuralLoad>)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLinearActionVarying_SubsequentAppliedLoads(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShapeAspect getVaryingAppliedLoadLocation() {
		return (IfcShapeAspect)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLinearActionVarying_VaryingAppliedLoadLocation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaryingAppliedLoadLocation(IfcShapeAspect newVaryingAppliedLoadLocation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLinearActionVarying_VaryingAppliedLoadLocation(), newVaryingAppliedLoadLocation);
	}

} //IfcStructuralLinearActionVaryingImpl
