/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcBoundingBox;
import IFC2X3.IfcBoxedHalfSpace;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boxed Half Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcBoxedHalfSpaceImpl#getEnclosure <em>Enclosure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcBoxedHalfSpace")
@XmlRootElement(name = "IfcBoxedHalfSpaceElement")
public class IfcBoxedHalfSpaceImpl extends IfcHalfSpaceSolidImpl implements IfcBoxedHalfSpace {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBoxedHalfSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcBoxedHalfSpace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundingBox getEnclosure() {
		return (IfcBoundingBox)eGet(IFC2X3Package.eINSTANCE.getIfcBoxedHalfSpace_Enclosure(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosure(IfcBoundingBox newEnclosure) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBoxedHalfSpace_Enclosure(), newEnclosure);
	}

} //IfcBoxedHalfSpaceImpl
