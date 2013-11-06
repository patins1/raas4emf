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
import IFC2X3.IfcTopologicalRepresentationItem;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Topological Representation Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTopologicalRepresentationItem")
@XmlSeeAlso({ IfcEdgeLoopImpl.class, IfcFaceSurfaceImpl.class, IfcFaceOuterBoundImpl.class, IfcFaceImpl.class, IfcLoopImpl.class, IfcEdgeCurveImpl.class, IfcOrientedEdgeImpl.class, IfcVertexLoopImpl.class, IfcVertexPointImpl.class, IfcPolyLoopImpl.class, IfcFaceBoundImpl.class,
		IfcOpenShellImpl.class, IfcConnectedFaceSetImpl.class, IfcSubedgeImpl.class, IfcEdgeImpl.class, IfcPathImpl.class, IfcClosedShellImpl.class, IfcVertexImpl.class })
@XmlRootElement(name = "IfcTopologicalRepresentationItemElement")
public class IfcTopologicalRepresentationItemImpl extends IfcRepresentationItemImpl implements IfcTopologicalRepresentationItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTopologicalRepresentationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTopologicalRepresentationItem();
	}

} //IfcTopologicalRepresentationItemImpl
