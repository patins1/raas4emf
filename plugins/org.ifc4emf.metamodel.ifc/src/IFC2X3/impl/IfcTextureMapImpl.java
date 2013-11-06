/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcTextureMap;
import IFC2X3.IfcVertexBasedTextureMap;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Texture Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTextureMapImpl#getTextureMaps <em>Texture Maps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTextureMap")
@XmlRootElement(name = "IfcTextureMapElement")
public class IfcTextureMapImpl extends IfcTextureCoordinateImpl implements IfcTextureMap {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTextureMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTextureMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcVertexBasedTextureMap> getTextureMaps() {
		return (EList<IfcVertexBasedTextureMap>)eGet(IFC2X3Package.eINSTANCE.getIfcTextureMap_TextureMaps(), true);
	}

} //IfcTextureMapImpl
