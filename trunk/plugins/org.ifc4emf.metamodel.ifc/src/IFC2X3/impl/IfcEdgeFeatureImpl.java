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
import IFC2X3.IfcEdgeFeature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Edge Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcEdgeFeatureImpl#getFeatureLength <em>Feature Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcEdgeFeature")
@XmlSeeAlso({ IfcChamferEdgeFeatureImpl.class, IfcRoundedEdgeFeatureImpl.class })
@XmlRootElement(name = "IfcEdgeFeatureElement")
public class IfcEdgeFeatureImpl extends IfcFeatureElementSubtractionImpl implements IfcEdgeFeature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcEdgeFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcEdgeFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFeatureLength() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcEdgeFeature_FeatureLength(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureLength(Double newFeatureLength) {
		eSet(IFC2X3Package.eINSTANCE.getIfcEdgeFeature_FeatureLength(), newFeatureLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFeatureLength() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcEdgeFeature_FeatureLength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatureLength() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcEdgeFeature_FeatureLength());
	}

} //IfcEdgeFeatureImpl
