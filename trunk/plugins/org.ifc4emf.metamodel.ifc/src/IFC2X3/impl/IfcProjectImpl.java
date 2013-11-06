/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcProject;
import IFC2X3.IfcRepresentationContext;
import IFC2X3.IfcUnitAssignment;

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
 * An implementation of the model object '<em><b>Ifc Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcProjectImpl#getLongName <em>Long Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcProjectImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcProjectImpl#getRepresentationContexts <em>Representation Contexts</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcProjectImpl#getUnitsInContext <em>Units In Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcProject")
@XmlRootElement(name = "IfcProjectElement")
public class IfcProjectImpl extends IfcObjectImpl implements IfcProject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcProject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRepresentationContext> getRepresentationContexts() {
		return (EList<IfcRepresentationContext>)eGet(IFC2X3Package.eINSTANCE.getIfcProject_RepresentationContexts(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnitAssignment getUnitsInContext() {
		return (IfcUnitAssignment)eGet(IFC2X3Package.eINSTANCE.getIfcProject_UnitsInContext(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitsInContext(IfcUnitAssignment newUnitsInContext) {
		eSet(IFC2X3Package.eINSTANCE.getIfcProject_UnitsInContext(), newUnitsInContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhase() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcProject_Phase(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(String newPhase) {
		eSet(IFC2X3Package.eINSTANCE.getIfcProject_Phase(), newPhase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPhase() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcProject_Phase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPhase() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcProject_Phase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcProject_LongName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongName(String newLongName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcProject_LongName(), newLongName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLongName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcProject_LongName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLongName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcProject_LongName());
	}

} //IfcProjectImpl
