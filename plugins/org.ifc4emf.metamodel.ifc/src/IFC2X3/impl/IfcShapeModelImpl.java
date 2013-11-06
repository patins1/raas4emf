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
import IFC2X3.IfcShapeAspect;
import IFC2X3.IfcShapeModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Shape Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcShapeModelImpl#getOfShapeAspect <em>Of Shape Aspect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcShapeModel")
@XmlSeeAlso({ IfcTopologyRepresentationImpl.class, IfcShapeRepresentationImpl.class })
@XmlRootElement(name = "IfcShapeModelElement")
public class IfcShapeModelImpl extends IfcRepresentationImpl implements IfcShapeModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcShapeModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcShapeModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShapeAspect getOfShapeAspect() {
		return (IfcShapeAspect)eGet(IFC2X3Package.eINSTANCE.getIfcShapeModel_OfShapeAspect(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOfShapeAspect(IfcShapeAspect newOfShapeAspect) {
		eSet(IFC2X3Package.eINSTANCE.getIfcShapeModel_OfShapeAspect(), newOfShapeAspect);
	}

} //IfcShapeModelImpl
