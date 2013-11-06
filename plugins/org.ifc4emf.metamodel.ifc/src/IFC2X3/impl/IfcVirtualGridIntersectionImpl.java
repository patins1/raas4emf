/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcGridAxis;
import IFC2X3.IfcVirtualGridIntersection;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Virtual Grid Intersection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcVirtualGridIntersectionImpl#getIntersectingAxes <em>Intersecting Axes</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcVirtualGridIntersectionImpl#getOffsetDistances <em>Offset Distances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcVirtualGridIntersection")
@XmlRootElement(name = "IfcVirtualGridIntersectionElement")
public class IfcVirtualGridIntersectionImpl extends CDOObjectImpl implements IfcVirtualGridIntersection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcVirtualGridIntersectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcVirtualGridIntersection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcGridAxis> getIntersectingAxes() {
		return (EList<IfcGridAxis>)eGet(IFC2X3Package.eINSTANCE.getIfcVirtualGridIntersection_IntersectingAxes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Double> getOffsetDistances() {
		return (EList<Double>)eGet(IFC2X3Package.eINSTANCE.getIfcVirtualGridIntersection_OffsetDistances(), true);
	}

} //IfcVirtualGridIntersectionImpl
