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
import IFC2X3.IfcPile;
import IFC2X3.IfcPileConstructionEnum;
import IFC2X3.IfcPileTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Pile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcPileImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPileImpl#getConstructionType <em>Construction Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPile")
@XmlRootElement(name = "IfcPileElement")
public class IfcPileImpl extends IfcBuildingElementImpl implements IfcPile {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPile();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPileConstructionEnum getConstructionType() {
		return (IfcPileConstructionEnum)eGet(IFC2X3Package.eINSTANCE.getIfcPile_ConstructionType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructionType(IfcPileConstructionEnum newConstructionType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPile_ConstructionType(), newConstructionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConstructionType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPile_ConstructionType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstructionType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPile_ConstructionType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPileTypeEnum getPredefinedType() {
		return (IfcPileTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcPile_PredefinedType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcPileTypeEnum newPredefinedType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPile_PredefinedType(), newPredefinedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPredefinedType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPile_PredefinedType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredefinedType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPile_PredefinedType());
	}

} //IfcPileImpl
