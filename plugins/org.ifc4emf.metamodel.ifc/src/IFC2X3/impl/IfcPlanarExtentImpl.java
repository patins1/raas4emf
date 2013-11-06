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
import IFC2X3.IfcPlanarExtent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Planar Extent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcPlanarExtentImpl#getSizeInX <em>Size In X</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPlanarExtentImpl#getSizeInY <em>Size In Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPlanarExtent")
@XmlSeeAlso({ IfcPlanarBoxImpl.class })
@XmlRootElement(name = "IfcPlanarExtentElement")
public class IfcPlanarExtentImpl extends IfcGeometricRepresentationItemImpl implements IfcPlanarExtent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPlanarExtentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPlanarExtent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSizeInY() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcPlanarExtent_SizeInY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeInY(Double newSizeInY) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPlanarExtent_SizeInY(), newSizeInY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSizeInY() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPlanarExtent_SizeInY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSizeInY() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPlanarExtent_SizeInY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSizeInX() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcPlanarExtent_SizeInX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeInX(Double newSizeInX) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPlanarExtent_SizeInX(), newSizeInX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSizeInX() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPlanarExtent_SizeInX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSizeInX() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPlanarExtent_SizeInX());
	}

} //IfcPlanarExtentImpl
