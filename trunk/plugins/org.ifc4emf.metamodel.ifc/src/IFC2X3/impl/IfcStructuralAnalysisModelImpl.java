/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcAnalysisModelTypeEnum;
import IFC2X3.IfcAxis2Placement3D;
import IFC2X3.IfcStructuralAnalysisModel;
import IFC2X3.IfcStructuralLoadGroup;
import IFC2X3.IfcStructuralResultGroup;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Analysis Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStructuralAnalysisModelImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralAnalysisModelImpl#getOrientationOf2DPlane <em>Orientation Of2 DPlane</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralAnalysisModelImpl#getLoadedBy <em>Loaded By</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStructuralAnalysisModelImpl#getHasResults <em>Has Results</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStructuralAnalysisModel")
@XmlRootElement(name = "IfcStructuralAnalysisModelElement")
public class IfcStructuralAnalysisModelImpl extends IfcSystemImpl implements IfcStructuralAnalysisModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralAnalysisModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralAnalysisModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcStructuralLoadGroup> getLoadedBy() {
		return (EList<IfcStructuralLoadGroup>)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralAnalysisModel_LoadedBy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcStructuralResultGroup> getHasResults() {
		return (EList<IfcStructuralResultGroup>)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralAnalysisModel_HasResults(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement3D getOrientationOf2DPlane() {
		return (IfcAxis2Placement3D)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralAnalysisModel_OrientationOf2DPlane(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientationOf2DPlane(IfcAxis2Placement3D newOrientationOf2DPlane) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralAnalysisModel_OrientationOf2DPlane(), newOrientationOf2DPlane);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnalysisModelTypeEnum getPredefinedType() {
		return (IfcAnalysisModelTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralAnalysisModel_PredefinedType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcAnalysisModelTypeEnum newPredefinedType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralAnalysisModel_PredefinedType(), newPredefinedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPredefinedType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralAnalysisModel_PredefinedType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredefinedType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralAnalysisModel_PredefinedType());
	}

} //IfcStructuralAnalysisModelImpl
