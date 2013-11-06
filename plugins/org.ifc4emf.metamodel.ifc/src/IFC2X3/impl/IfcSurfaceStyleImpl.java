/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcSurfaceSide;
import IFC2X3.IfcSurfaceStyle;
import IFC2X3.IfcSurfaceStyleElementSelect;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSurfaceStyleImpl#getSide <em>Side</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSurfaceStyleImpl#getStyles <em>Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSurfaceStyle")
@XmlRootElement(name = "IfcSurfaceStyleElement")
public class IfcSurfaceStyleImpl extends IfcPresentationStyleImpl implements IfcSurfaceStyle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSurfaceStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlElement
	@SuppressWarnings("unchecked")
	public EList<IfcSurfaceStyleElementSelect> getStyles() {
		return (EList<IfcSurfaceStyleElementSelect>)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyle_Styles(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceSide getSide() {
		return (IfcSurfaceSide)eGet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyle_Side(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSide(IfcSurfaceSide newSide) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyle_Side(), newSide);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSide() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSurfaceStyle_Side());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSide() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSurfaceStyle_Side());
	}

} //IfcSurfaceStyleImpl
