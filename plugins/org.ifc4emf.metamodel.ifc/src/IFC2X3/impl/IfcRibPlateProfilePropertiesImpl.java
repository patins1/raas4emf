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
import IFC2X3.IfcRibPlateDirectionEnum;
import IFC2X3.IfcRibPlateProfileProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rib Plate Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRibPlateProfilePropertiesImpl#getThickness <em>Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRibPlateProfilePropertiesImpl#getRibHeight <em>Rib Height</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRibPlateProfilePropertiesImpl#getRibWidth <em>Rib Width</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRibPlateProfilePropertiesImpl#getRibSpacing <em>Rib Spacing</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRibPlateProfilePropertiesImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRibPlateProfileProperties")
@XmlRootElement(name = "IfcRibPlateProfilePropertiesElement")
public class IfcRibPlateProfilePropertiesImpl extends IfcProfilePropertiesImpl implements IfcRibPlateProfileProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRibPlateProfilePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRibPlateProfileProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRibPlateDirectionEnum getDirection() {
		return (IfcRibPlateDirectionEnum)eGet(IFC2X3Package.eINSTANCE.getIfcRibPlateProfileProperties_Direction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(IfcRibPlateDirectionEnum newDirection) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRibPlateProfileProperties_Direction(), newDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDirection() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRibPlateProfileProperties_Direction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirection() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRibPlateProfileProperties_Direction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRibSpacing() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibSpacing(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRibSpacing(Double newRibSpacing) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibSpacing(), newRibSpacing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRibSpacing() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibSpacing());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRibSpacing() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibSpacing());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRibWidth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibWidth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRibWidth(Double newRibWidth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibWidth(), newRibWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRibWidth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRibWidth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRibHeight() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibHeight(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRibHeight(Double newRibHeight) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibHeight(), newRibHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRibHeight() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibHeight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRibHeight() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibHeight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcRibPlateProfileProperties_Thickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThickness(Double newThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRibPlateProfileProperties_Thickness(), newThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRibPlateProfileProperties_Thickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRibPlateProfileProperties_Thickness());
	}

} //IfcRibPlateProfilePropertiesImpl
