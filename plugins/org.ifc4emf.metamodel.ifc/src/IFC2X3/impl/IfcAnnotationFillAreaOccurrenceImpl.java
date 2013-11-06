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
import IFC2X3.IfcAnnotationFillAreaOccurrence;
import IFC2X3.IfcGlobalOrLocalEnum;
import IFC2X3.IfcPoint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Annotation Fill Area Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcAnnotationFillAreaOccurrenceImpl#getFillStyleTarget <em>Fill Style Target</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAnnotationFillAreaOccurrenceImpl#getGlobalOrLocal <em>Global Or Local</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcAnnotationFillAreaOccurrence")
@XmlRootElement(name = "IfcAnnotationFillAreaOccurrenceElement")
public class IfcAnnotationFillAreaOccurrenceImpl extends IfcAnnotationOccurrenceImpl implements IfcAnnotationFillAreaOccurrence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcAnnotationFillAreaOccurrenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcAnnotationFillAreaOccurrence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPoint getFillStyleTarget() {
		return (IfcPoint)eGet(IFC2X3Package.eINSTANCE.getIfcAnnotationFillAreaOccurrence_FillStyleTarget(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillStyleTarget(IfcPoint newFillStyleTarget) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAnnotationFillAreaOccurrence_FillStyleTarget(), newFillStyleTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGlobalOrLocalEnum getGlobalOrLocal() {
		return (IfcGlobalOrLocalEnum)eGet(IFC2X3Package.eINSTANCE.getIfcAnnotationFillAreaOccurrence_GlobalOrLocal(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalOrLocal(IfcGlobalOrLocalEnum newGlobalOrLocal) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAnnotationFillAreaOccurrence_GlobalOrLocal(), newGlobalOrLocal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGlobalOrLocal() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcAnnotationFillAreaOccurrence_GlobalOrLocal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGlobalOrLocal() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcAnnotationFillAreaOccurrence_GlobalOrLocal());
	}

} //IfcAnnotationFillAreaOccurrenceImpl
