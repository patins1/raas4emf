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
import IFC2X3.IfcAnnotationSurface;
import IFC2X3.IfcTextureCoordinate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Texture Coordinate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTextureCoordinateImpl#getAnnotatedSurface <em>Annotated Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTextureCoordinate")
@XmlSeeAlso({ IfcTextureCoordinateGeneratorImpl.class, IfcTextureMapImpl.class })
@XmlRootElement(name = "IfcTextureCoordinateElement")
public class IfcTextureCoordinateImpl extends CDOObjectImpl implements IfcTextureCoordinate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTextureCoordinateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTextureCoordinate();
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
	public IfcAnnotationSurface getAnnotatedSurface() {
		return (IfcAnnotationSurface)eGet(IFC2X3Package.eINSTANCE.getIfcTextureCoordinate_AnnotatedSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatedSurface(IfcAnnotationSurface newAnnotatedSurface) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextureCoordinate_AnnotatedSurface(), newAnnotatedSurface);
	}

} //IfcTextureCoordinateImpl
