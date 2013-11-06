/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcShapeAspect;
import IFC2X3.IfcStructuralSurfaceMemberVarying;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Surface Member Varying</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStructuralSurfaceMemberVaryingImpl#getSubsequentThickness <em>Subsequent Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralSurfaceMemberVaryingImpl#getVaryingThicknessLocation <em>Varying Thickness Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStructuralSurfaceMemberVarying")
@XmlRootElement(name = "IfcStructuralSurfaceMemberVaryingElement")
public class IfcStructuralSurfaceMemberVaryingImpl extends IfcStructuralSurfaceMemberImpl implements IfcStructuralSurfaceMemberVarying {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralSurfaceMemberVaryingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralSurfaceMemberVarying();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShapeAspect getVaryingThicknessLocation() {
		return (IfcShapeAspect)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralSurfaceMemberVarying_VaryingThicknessLocation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaryingThicknessLocation(IfcShapeAspect newVaryingThicknessLocation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralSurfaceMemberVarying_VaryingThicknessLocation(), newVaryingThicknessLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Double> getSubsequentThickness() {
		return (EList<Double>)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralSurfaceMemberVarying_SubsequentThickness(), true);
	}

} //IfcStructuralSurfaceMemberVaryingImpl
