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
import IFC2X3.IfcAnnotationCurveOccurrence;
import IFC2X3.IfcTerminatorSymbol;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Terminator Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTerminatorSymbolImpl#getAnnotatedCurve <em>Annotated Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTerminatorSymbol")
@XmlSeeAlso({ IfcDimensionCurveTerminatorImpl.class })
@XmlRootElement(name = "IfcTerminatorSymbolElement")
public class IfcTerminatorSymbolImpl extends IfcAnnotationSymbolOccurrenceImpl implements IfcTerminatorSymbol {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTerminatorSymbolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTerminatorSymbol();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnnotationCurveOccurrence getAnnotatedCurve() {
		return (IfcAnnotationCurveOccurrence)eGet(IFC2X3Package.eINSTANCE.getIfcTerminatorSymbol_AnnotatedCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatedCurve(IfcAnnotationCurveOccurrence newAnnotatedCurve) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTerminatorSymbol_AnnotatedCurve(), newAnnotatedCurve);
	}

} //IfcTerminatorSymbolImpl
