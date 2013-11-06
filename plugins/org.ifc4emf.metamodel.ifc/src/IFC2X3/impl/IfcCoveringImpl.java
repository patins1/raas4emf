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
import IFC2X3.IfcCovering;
import IFC2X3.IfcCoveringTypeEnum;
import IFC2X3.IfcRelCoversBldgElements;
import IFC2X3.IfcRelCoversSpaces;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Covering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcCoveringImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCoveringImpl#getCoversSpaces <em>Covers Spaces</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCoveringImpl#getCovers <em>Covers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCovering")
@XmlRootElement(name = "IfcCoveringElement")
public class IfcCoveringImpl extends IfcBuildingElementImpl implements IfcCovering {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCoveringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCovering();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelCoversSpaces getCoversSpaces() {
		return (IfcRelCoversSpaces)eGet(IFC2X3Package.eINSTANCE.getIfcCovering_CoversSpaces(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoversSpaces(IfcRelCoversSpaces newCoversSpaces) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCovering_CoversSpaces(), newCoversSpaces);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelCoversBldgElements getCovers() {
		return (IfcRelCoversBldgElements)eGet(IFC2X3Package.eINSTANCE.getIfcCovering_Covers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCovers(IfcRelCoversBldgElements newCovers) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCovering_Covers(), newCovers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCoveringTypeEnum getPredefinedType() {
		return (IfcCoveringTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcCovering_PredefinedType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcCoveringTypeEnum newPredefinedType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCovering_PredefinedType(), newPredefinedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPredefinedType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCovering_PredefinedType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredefinedType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCovering_PredefinedType());
	}

} //IfcCoveringImpl
