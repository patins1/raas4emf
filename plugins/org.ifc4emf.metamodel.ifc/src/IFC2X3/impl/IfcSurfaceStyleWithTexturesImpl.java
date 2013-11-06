/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcSurfaceStyleWithTextures;
import IFC2X3.IfcSurfaceTexture;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Style With Textures</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSurfaceStyleWithTexturesImpl#getTextures <em>Textures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSurfaceStyleWithTextures")
@XmlRootElement(name = "IfcSurfaceStyleWithTexturesElement")
public class IfcSurfaceStyleWithTexturesImpl extends IfcSurfaceStyleElementSelectImpl implements IfcSurfaceStyleWithTextures {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceStyleWithTexturesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSurfaceStyleWithTextures();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcSurfaceTexture> getTextures() {
		return (EList<IfcSurfaceTexture>)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyleWithTextures_Textures(), true);
	}

} //IfcSurfaceStyleWithTexturesImpl
