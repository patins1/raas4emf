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
import IFC2X3.IfcChamferEdgeFeature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Chamfer Edge Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcChamferEdgeFeatureImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcChamferEdgeFeatureImpl#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcChamferEdgeFeature")
@XmlRootElement(name = "IfcChamferEdgeFeatureElement")
public class IfcChamferEdgeFeatureImpl extends IfcEdgeFeatureImpl implements IfcChamferEdgeFeature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcChamferEdgeFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcChamferEdgeFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHeight() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcChamferEdgeFeature_Height(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(Double newHeight) {
		eSet(IFC2X3Package.eINSTANCE.getIfcChamferEdgeFeature_Height(), newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHeight() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcChamferEdgeFeature_Height());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHeight() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcChamferEdgeFeature_Height());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWidth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcChamferEdgeFeature_Width(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(Double newWidth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcChamferEdgeFeature_Width(), newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWidth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcChamferEdgeFeature_Width());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWidth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcChamferEdgeFeature_Width());
	}

} //IfcChamferEdgeFeatureImpl
