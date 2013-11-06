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
import IFC2X3.IfcOneDirectionRepeatFactor;
import IFC2X3.IfcVector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc One Direction Repeat Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcOneDirectionRepeatFactorImpl#getRepeatFactor <em>Repeat Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcOneDirectionRepeatFactor")
@XmlSeeAlso({ IfcTwoDirectionRepeatFactorImpl.class })
@XmlRootElement(name = "IfcOneDirectionRepeatFactorElement")
public class IfcOneDirectionRepeatFactorImpl extends IfcGeometricRepresentationItemImpl implements IfcOneDirectionRepeatFactor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcOneDirectionRepeatFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcOneDirectionRepeatFactor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVector getRepeatFactor() {
		return (IfcVector)eGet(IFC2X3Package.eINSTANCE.getIfcOneDirectionRepeatFactor_RepeatFactor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatFactor(IfcVector newRepeatFactor) {
		eSet(IFC2X3Package.eINSTANCE.getIfcOneDirectionRepeatFactor_RepeatFactor(), newRepeatFactor);
	}

} //IfcOneDirectionRepeatFactorImpl
