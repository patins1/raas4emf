/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcGrid;
import IFC2X3.IfcGridAxis;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Grid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcGridImpl#getUAxes <em>UAxes</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcGridImpl#getVAxes <em>VAxes</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcGridImpl#getWAxes <em>WAxes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcGrid")
@XmlRootElement(name = "IfcGridElement")
public class IfcGridImpl extends IfcProductImpl implements IfcGrid {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcGrid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcGridAxis> getWAxes() {
		return (EList<IfcGridAxis>)eGet(IFC2X3Package.eINSTANCE.getIfcGrid_WAxes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcGridAxis> getVAxes() {
		return (EList<IfcGridAxis>)eGet(IFC2X3Package.eINSTANCE.getIfcGrid_VAxes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcGridAxis> getUAxes() {
		return (EList<IfcGridAxis>)eGet(IFC2X3Package.eINSTANCE.getIfcGrid_UAxes(), true);
	}

} //IfcGridImpl
