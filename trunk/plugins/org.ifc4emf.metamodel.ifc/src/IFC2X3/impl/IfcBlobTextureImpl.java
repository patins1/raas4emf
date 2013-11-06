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
import IFC2X3.IfcBlobTexture;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Blob Texture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcBlobTextureImpl#getRasterFormat <em>Raster Format</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcBlobTextureImpl#getRasterCode <em>Raster Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcBlobTexture")
@XmlRootElement(name = "IfcBlobTextureElement")
public class IfcBlobTextureImpl extends IfcSurfaceTextureImpl implements IfcBlobTexture {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBlobTextureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcBlobTexture();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRasterCode() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcBlobTexture_RasterCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRasterCode(Boolean newRasterCode) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBlobTexture_RasterCode(), newRasterCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRasterCode() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBlobTexture_RasterCode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRasterCode() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBlobTexture_RasterCode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRasterFormat() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcBlobTexture_RasterFormat(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRasterFormat(String newRasterFormat) {
		eSet(IFC2X3Package.eINSTANCE.getIfcBlobTexture_RasterFormat(), newRasterFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRasterFormat() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcBlobTexture_RasterFormat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRasterFormat() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcBlobTexture_RasterFormat());
	}

} //IfcBlobTextureImpl
