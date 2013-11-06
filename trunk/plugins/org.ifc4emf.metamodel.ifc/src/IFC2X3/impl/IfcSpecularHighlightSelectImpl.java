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
import IFC2X3.IfcSpecularHighlightSelect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Specular Highlight Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSpecularHighlightSelectImpl#getIfcSpecularRoughnessvalue <em>Ifc Specular Roughnessvalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSpecularHighlightSelectImpl#getIfcSpecularExponentvalue <em>Ifc Specular Exponentvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSpecularHighlightSelect")
@XmlRootElement(name = "IfcSpecularHighlightSelectElement")
public class IfcSpecularHighlightSelectImpl extends CDOObjectImpl implements IfcSpecularHighlightSelect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSpecularHighlightSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSpecularHighlightSelect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcSpecularRoughnessvalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSpecularHighlightSelect_IfcSpecularRoughnessvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSpecularRoughnessvalue(Double newIfcSpecularRoughnessvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSpecularHighlightSelect_IfcSpecularRoughnessvalue(), newIfcSpecularRoughnessvalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcSpecularRoughnessvalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSpecularHighlightSelect_IfcSpecularRoughnessvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcSpecularRoughnessvalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSpecularHighlightSelect_IfcSpecularRoughnessvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcSpecularExponentvalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSpecularHighlightSelect_IfcSpecularExponentvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSpecularExponentvalue(Double newIfcSpecularExponentvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSpecularHighlightSelect_IfcSpecularExponentvalue(), newIfcSpecularExponentvalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcSpecularExponentvalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSpecularHighlightSelect_IfcSpecularExponentvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcSpecularExponentvalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSpecularHighlightSelect_IfcSpecularExponentvalue());
	}

} //IfcSpecularHighlightSelectImpl
