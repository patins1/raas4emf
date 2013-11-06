/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcLightDistributionCurveEnum;
import IFC2X3.IfcLightDistributionData;
import IFC2X3.IfcLightIntensityDistribution;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Light Intensity Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcLightIntensityDistributionImpl#getLightDistributionCurve <em>Light Distribution Curve</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcLightIntensityDistributionImpl#getDistributionData <em>Distribution Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcLightIntensityDistribution")
@XmlRootElement(name = "IfcLightIntensityDistributionElement")
public class IfcLightIntensityDistributionImpl extends IfcLightDistributionDataSourceSelectImpl implements IfcLightIntensityDistribution {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLightIntensityDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcLightIntensityDistribution();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcLightDistributionData> getDistributionData() {
		return (EList<IfcLightDistributionData>)eGet(IFC2X3Package.eINSTANCE.getIfcLightIntensityDistribution_DistributionData(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightDistributionCurveEnum getLightDistributionCurve() {
		return (IfcLightDistributionCurveEnum)eGet(IFC2X3Package.eINSTANCE.getIfcLightIntensityDistribution_LightDistributionCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightDistributionCurve(IfcLightDistributionCurveEnum newLightDistributionCurve) {
		eSet(IFC2X3Package.eINSTANCE.getIfcLightIntensityDistribution_LightDistributionCurve(), newLightDistributionCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLightDistributionCurve() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcLightIntensityDistribution_LightDistributionCurve());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLightDistributionCurve() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcLightIntensityDistribution_LightDistributionCurve());
	}

} //IfcLightIntensityDistributionImpl
