/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcSimpleValue;
import IFC2X3.IfcTextureCoordinateGenerator;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Texture Coordinate Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTextureCoordinateGeneratorImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTextureCoordinateGeneratorImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTextureCoordinateGenerator")
@XmlRootElement(name = "IfcTextureCoordinateGeneratorElement")
public class IfcTextureCoordinateGeneratorImpl extends IfcTextureCoordinateImpl implements IfcTextureCoordinateGenerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTextureCoordinateGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTextureCoordinateGenerator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcSimpleValue> getParameter() {
		return (EList<IfcSimpleValue>)eGet(IFC2X3Package.eINSTANCE.getIfcTextureCoordinateGenerator_Parameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMode() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcTextureCoordinateGenerator_Mode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(String newMode) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextureCoordinateGenerator_Mode(), newMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMode() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTextureCoordinateGenerator_Mode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMode() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTextureCoordinateGenerator_Mode());
	}

} //IfcTextureCoordinateGeneratorImpl
