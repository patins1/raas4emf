/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcCompositeCurve;
import IFC2X3.IfcCompositeCurveSegment;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Composite Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcCompositeCurveImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcCompositeCurveImpl#getSelfIntersect <em>Self Intersect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCompositeCurve")
@XmlSeeAlso({ Ifc2DCompositeCurveImpl.class })
@XmlRootElement(name = "IfcCompositeCurveElement")
public class IfcCompositeCurveImpl extends IfcBoundedCurveImpl implements IfcCompositeCurve {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCompositeCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCompositeCurve();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcCompositeCurveSegment> getSegments() {
		return (EList<IfcCompositeCurveSegment>)eGet(IFC2X3Package.eINSTANCE.getIfcCompositeCurve_Segments(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSelfIntersect() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcCompositeCurve_SelfIntersect(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfIntersect(Boolean newSelfIntersect) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCompositeCurve_SelfIntersect(), newSelfIntersect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSelfIntersect() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcCompositeCurve_SelfIntersect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSelfIntersect() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcCompositeCurve_SelfIntersect());
	}

} //IfcCompositeCurveImpl
