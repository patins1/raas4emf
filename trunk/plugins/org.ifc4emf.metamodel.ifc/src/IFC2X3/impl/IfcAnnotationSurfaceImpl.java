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
import IFC2X3.IfcAnnotationSurface;
import IFC2X3.IfcGeometricRepresentationItem;
import IFC2X3.IfcTextureCoordinate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Annotation Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcAnnotationSurfaceImpl#getItem <em>Item</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAnnotationSurfaceImpl#getTextureCoordinates <em>Texture Coordinates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcAnnotationSurface")
@XmlRootElement(name = "IfcAnnotationSurfaceElement")
public class IfcAnnotationSurfaceImpl extends IfcGeometricRepresentationItemImpl implements IfcAnnotationSurface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcAnnotationSurfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcAnnotationSurface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeometricRepresentationItem getItem() {
		return (IfcGeometricRepresentationItem)eGet(IFC2X3Package.eINSTANCE.getIfcAnnotationSurface_Item(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(IfcGeometricRepresentationItem newItem) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAnnotationSurface_Item(), newItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextureCoordinate getTextureCoordinates() {
		return (IfcTextureCoordinate)eGet(IFC2X3Package.eINSTANCE.getIfcAnnotationSurface_TextureCoordinates(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextureCoordinates(IfcTextureCoordinate newTextureCoordinates) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAnnotationSurface_TextureCoordinates(), newTextureCoordinates);
	}

} //IfcAnnotationSurfaceImpl
