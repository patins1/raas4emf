/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcCartesianPoint;
import IFC2X3.IfcTextureVertex;
import IFC2X3.IfcVertexBasedTextureMap;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Vertex Based Texture Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcVertexBasedTextureMapImpl#getTextureVertices <em>Texture Vertices</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcVertexBasedTextureMapImpl#getTexturePoints <em>Texture Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcVertexBasedTextureMap")
@XmlRootElement(name = "IfcVertexBasedTextureMapElement")
public class IfcVertexBasedTextureMapImpl extends CDOObjectImpl implements IfcVertexBasedTextureMap {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcVertexBasedTextureMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcVertexBasedTextureMap();
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
	public EList<IfcTextureVertex> getTextureVertices() {
		return (EList<IfcTextureVertex>)eGet(IFC2X3Package.eINSTANCE.getIfcVertexBasedTextureMap_TextureVertices(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcCartesianPoint> getTexturePoints() {
		return (EList<IfcCartesianPoint>)eGet(IFC2X3Package.eINSTANCE.getIfcVertexBasedTextureMap_TexturePoints(), true);
	}

} //IfcVertexBasedTextureMapImpl
