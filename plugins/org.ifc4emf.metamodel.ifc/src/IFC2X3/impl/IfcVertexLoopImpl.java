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
import IFC2X3.IfcVertex;
import IFC2X3.IfcVertexLoop;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Vertex Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcVertexLoopImpl#getLoopVertex <em>Loop Vertex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcVertexLoop")
@XmlRootElement(name = "IfcVertexLoopElement")
public class IfcVertexLoopImpl extends IfcLoopImpl implements IfcVertexLoop {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcVertexLoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcVertexLoop();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVertex getLoopVertex() {
		return (IfcVertex)eGet(IFC2X3Package.eINSTANCE.getIfcVertexLoop_LoopVertex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopVertex(IfcVertex newLoopVertex) {
		eSet(IFC2X3Package.eINSTANCE.getIfcVertexLoop_LoopVertex(), newLoopVertex);
	}

} //IfcVertexLoopImpl
