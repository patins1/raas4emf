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
import IFC2X3.IfcFaceBound;
import IFC2X3.IfcLoop;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Face Bound</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcFaceBoundImpl#getBound <em>Bound</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcFaceBoundImpl#getOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcFaceBound")
@XmlSeeAlso({ IfcFaceOuterBoundImpl.class })
@XmlRootElement(name = "IfcFaceBoundElement")
public class IfcFaceBoundImpl extends IfcTopologicalRepresentationItemImpl implements IfcFaceBound {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFaceBoundImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcFaceBound();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLoop getBound() {
		return (IfcLoop)eGet(IFC2X3Package.eINSTANCE.getIfcFaceBound_Bound(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBound(IfcLoop newBound) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFaceBound_Bound(), newBound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getOrientation() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcFaceBound_Orientation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(Boolean newOrientation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFaceBound_Orientation(), newOrientation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOrientation() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcFaceBound_Orientation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOrientation() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcFaceBound_Orientation());
	}

} //IfcFaceBoundImpl
