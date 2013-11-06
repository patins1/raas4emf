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
import IFC2X3.IfcTwoDirectionRepeatFactor;
import IFC2X3.IfcVector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Two Direction Repeat Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTwoDirectionRepeatFactorImpl#getSecondRepeatFactor <em>Second Repeat Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTwoDirectionRepeatFactor")
@XmlRootElement(name = "IfcTwoDirectionRepeatFactorElement")
public class IfcTwoDirectionRepeatFactorImpl extends IfcOneDirectionRepeatFactorImpl implements IfcTwoDirectionRepeatFactor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTwoDirectionRepeatFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTwoDirectionRepeatFactor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVector getSecondRepeatFactor() {
		return (IfcVector)eGet(IFC2X3Package.eINSTANCE.getIfcTwoDirectionRepeatFactor_SecondRepeatFactor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondRepeatFactor(IfcVector newSecondRepeatFactor) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTwoDirectionRepeatFactor_SecondRepeatFactor(), newSecondRepeatFactor);
	}

} //IfcTwoDirectionRepeatFactorImpl
