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
import IFC2X3.IfcMechanicalFastener;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Mechanical Fastener</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcMechanicalFastenerImpl#getNominalDiameter <em>Nominal Diameter</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcMechanicalFastenerImpl#getNominalLength <em>Nominal Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcMechanicalFastener")
@XmlRootElement(name = "IfcMechanicalFastenerElement")
public class IfcMechanicalFastenerImpl extends IfcFastenerImpl implements IfcMechanicalFastener {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMechanicalFastenerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcMechanicalFastener();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getNominalLength() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMechanicalFastener_NominalLength(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalLength(Double newNominalLength) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMechanicalFastener_NominalLength(), newNominalLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNominalLength() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMechanicalFastener_NominalLength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNominalLength() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMechanicalFastener_NominalLength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getNominalDiameter() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcMechanicalFastener_NominalDiameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalDiameter(Double newNominalDiameter) {
		eSet(IFC2X3Package.eINSTANCE.getIfcMechanicalFastener_NominalDiameter(), newNominalDiameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNominalDiameter() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcMechanicalFastener_NominalDiameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNominalDiameter() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcMechanicalFastener_NominalDiameter());
	}

} //IfcMechanicalFastenerImpl
