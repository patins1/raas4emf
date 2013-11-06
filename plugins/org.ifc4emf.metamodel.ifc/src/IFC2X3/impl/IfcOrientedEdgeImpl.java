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
import IFC2X3.IfcEdge;
import IFC2X3.IfcOrientedEdge;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Oriented Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcOrientedEdgeImpl#getEdgeElement <em>Edge Element</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcOrientedEdgeImpl#getOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcOrientedEdge")
@XmlRootElement(name = "IfcOrientedEdgeElement")
public class IfcOrientedEdgeImpl extends IfcEdgeImpl implements IfcOrientedEdge {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcOrientedEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcOrientedEdge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEdge getEdgeElement() {
		return (IfcEdge)eGet(IFC2X3Package.eINSTANCE.getIfcOrientedEdge_EdgeElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeElement(IfcEdge newEdgeElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOrientedEdge_EdgeElement(), newEdgeElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getOrientation() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcOrientedEdge_Orientation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(Boolean newOrientation) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOrientedEdge_Orientation(), newOrientation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOrientation() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcOrientedEdge_Orientation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOrientation() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcOrientedEdge_Orientation());
	}

} //IfcOrientedEdgeImpl
