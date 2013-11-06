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
import IFC2X3.IfcStructuralSurfaceMember;
import IFC2X3.IfcStructuralSurfaceTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Surface Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStructuralSurfaceMemberImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralSurfaceMemberImpl#getThickness <em>Thickness</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStructuralSurfaceMember")
@XmlSeeAlso({ IfcStructuralSurfaceMemberVaryingImpl.class })
@XmlRootElement(name = "IfcStructuralSurfaceMemberElement")
public class IfcStructuralSurfaceMemberImpl extends IfcStructuralMemberImpl implements IfcStructuralSurfaceMember {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralSurfaceMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralSurfaceMember();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralSurfaceMember_Thickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThickness(Double newThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralSurfaceMember_Thickness(), newThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralSurfaceMember_Thickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralSurfaceMember_Thickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralSurfaceTypeEnum getPredefinedType() {
		return (IfcStructuralSurfaceTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralSurfaceMember_PredefinedType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcStructuralSurfaceTypeEnum newPredefinedType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralSurfaceMember_PredefinedType(), newPredefinedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPredefinedType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralSurfaceMember_PredefinedType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredefinedType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralSurfaceMember_PredefinedType());
	}

} //IfcStructuralSurfaceMemberImpl
