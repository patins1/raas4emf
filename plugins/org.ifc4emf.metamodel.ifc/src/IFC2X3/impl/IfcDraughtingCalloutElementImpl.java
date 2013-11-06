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
import IFC2X3.IfcDraughtingCalloutElement;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Draughting Callout Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDraughtingCalloutElement")
@XmlSeeAlso({ IfcDimensionCurveImpl.class, IfcTerminatorSymbolImpl.class, IfcDimensionCurveTerminatorImpl.class, IfcProjectionCurveImpl.class, IfcAnnotationTextOccurrenceImpl.class, IfcAnnotationSymbolOccurrenceImpl.class, IfcAnnotationCurveOccurrenceImpl.class })
@XmlRootElement(name = "IfcDraughtingCalloutElementElement")
public abstract class IfcDraughtingCalloutElementImpl extends CDOObjectImpl implements IfcDraughtingCalloutElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDraughtingCalloutElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDraughtingCalloutElement();
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

} //IfcDraughtingCalloutElementImpl
