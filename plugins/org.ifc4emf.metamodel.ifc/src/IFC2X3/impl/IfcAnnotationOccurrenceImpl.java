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
import IFC2X3.IfcAnnotationOccurrence;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Annotation Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcAnnotationOccurrence")
@XmlSeeAlso({ IfcDimensionCurveImpl.class, IfcTerminatorSymbolImpl.class, IfcAnnotationFillAreaOccurrenceImpl.class, IfcDimensionCurveTerminatorImpl.class, IfcProjectionCurveImpl.class, IfcAnnotationSurfaceOccurrenceImpl.class, IfcAnnotationTextOccurrenceImpl.class,
		IfcAnnotationSymbolOccurrenceImpl.class, IfcAnnotationCurveOccurrenceImpl.class })
@XmlRootElement(name = "IfcAnnotationOccurrenceElement")
public class IfcAnnotationOccurrenceImpl extends IfcStyledItemImpl implements IfcAnnotationOccurrence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcAnnotationOccurrenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcAnnotationOccurrence();
	}

} //IfcAnnotationOccurrenceImpl
