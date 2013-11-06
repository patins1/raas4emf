/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcAnnotationFillArea;
import IFC2X3.IfcCurve;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Annotation Fill Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcAnnotationFillAreaImpl#getOuterBoundary <em>Outer Boundary</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAnnotationFillAreaImpl#getInnerBoundaries <em>Inner Boundaries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcAnnotationFillArea")
@XmlRootElement(name = "IfcAnnotationFillAreaElement")
public class IfcAnnotationFillAreaImpl extends IfcGeometricRepresentationItemImpl implements IfcAnnotationFillArea {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcAnnotationFillAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcAnnotationFillArea();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getOuterBoundary() {
		return (IfcCurve)eGet(IFC2X3Package.eINSTANCE.getIfcAnnotationFillArea_OuterBoundary(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterBoundary(IfcCurve newOuterBoundary) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAnnotationFillArea_OuterBoundary(), newOuterBoundary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcCurve> getInnerBoundaries() {
		return (EList<IfcCurve>)eGet(IFC2X3Package.eINSTANCE.getIfcAnnotationFillArea_InnerBoundaries(), true);
	}

} //IfcAnnotationFillAreaImpl
