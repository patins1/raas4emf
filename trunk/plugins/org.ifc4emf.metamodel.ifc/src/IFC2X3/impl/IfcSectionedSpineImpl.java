/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcAxis2Placement3D;
import IFC2X3.IfcCompositeCurve;
import IFC2X3.IfcProfileDef;
import IFC2X3.IfcSectionedSpine;

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
 * An implementation of the model object '<em><b>Ifc Sectioned Spine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSectionedSpineImpl#getSpineCurve <em>Spine Curve</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSectionedSpineImpl#getCrossSections <em>Cross Sections</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSectionedSpineImpl#getCrossSectionPositions <em>Cross Section Positions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSectionedSpine")
@XmlRootElement(name = "IfcSectionedSpineElement")
public class IfcSectionedSpineImpl extends IfcGeometricRepresentationItemImpl implements IfcSectionedSpine {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSectionedSpineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSectionedSpine();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcAxis2Placement3D> getCrossSectionPositions() {
		return (EList<IfcAxis2Placement3D>)eGet(IFC2X3Package.eINSTANCE.getIfcSectionedSpine_CrossSectionPositions(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCompositeCurve getSpineCurve() {
		return (IfcCompositeCurve)eGet(IFC2X3Package.eINSTANCE.getIfcSectionedSpine_SpineCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpineCurve(IfcCompositeCurve newSpineCurve) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSectionedSpine_SpineCurve(), newSpineCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcProfileDef> getCrossSections() {
		return (EList<IfcProfileDef>)eGet(IFC2X3Package.eINSTANCE.getIfcSectionedSpine_CrossSections(), true);
	}

} //IfcSectionedSpineImpl
