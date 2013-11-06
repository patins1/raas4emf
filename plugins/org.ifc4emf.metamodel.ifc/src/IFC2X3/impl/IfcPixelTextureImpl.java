/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcPixelTexture;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Pixel Texture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcPixelTextureImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPixelTextureImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPixelTextureImpl#getColourComponents <em>Colour Components</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPixelTextureImpl#getPixel <em>Pixel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPixelTexture")
@XmlRootElement(name = "IfcPixelTextureElement")
public class IfcPixelTextureImpl extends IfcSurfaceTextureImpl implements IfcPixelTexture {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPixelTextureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPixelTexture();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Byte> getPixel() {
		return (EList<Byte>)eGet(IFC2X3Package.eINSTANCE.getIfcPixelTexture_Pixel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getColourComponents() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcPixelTexture_ColourComponents(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColourComponents(Integer newColourComponents) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPixelTexture_ColourComponents(), newColourComponents);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetColourComponents() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPixelTexture_ColourComponents());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetColourComponents() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPixelTexture_ColourComponents());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHeight() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcPixelTexture_Height(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(Integer newHeight) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPixelTexture_Height(), newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHeight() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPixelTexture_Height());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHeight() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPixelTexture_Height());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getWidth() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcPixelTexture_Width(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(Integer newWidth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPixelTexture_Width(), newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWidth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPixelTexture_Width());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWidth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPixelTexture_Width());
	}

} //IfcPixelTextureImpl
