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
import IFC2X3.IfcEdge;
import IFC2X3.IfcVertex;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcEdgeImpl#getEdgeStart <em>Edge Start</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcEdgeImpl#getEdgeEnd <em>Edge End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcEdge")
@XmlSeeAlso({ IfcOrientedEdgeImpl.class, IfcSubedgeImpl.class, IfcEdgeCurveImpl.class })
@XmlRootElement(name = "IfcEdgeElement")
public class IfcEdgeImpl extends IfcTopologicalRepresentationItemImpl implements IfcEdge {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcEdge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVertex getEdgeStart() {
		return (IfcVertex)eGet(IFC2X3Package.eINSTANCE.getIfcEdge_EdgeStart(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeStart(IfcVertex newEdgeStart) {
		eSet(IFC2X3Package.eINSTANCE.getIfcEdge_EdgeStart(), newEdgeStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVertex getEdgeEnd() {
		return (IfcVertex)eGet(IFC2X3Package.eINSTANCE.getIfcEdge_EdgeEnd(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeEnd(IfcVertex newEdgeEnd) {
		eSet(IFC2X3Package.eINSTANCE.getIfcEdge_EdgeEnd(), newEdgeEnd);
	}

} //IfcEdgeImpl
