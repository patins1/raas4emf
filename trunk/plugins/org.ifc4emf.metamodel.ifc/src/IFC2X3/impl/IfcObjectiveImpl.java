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
import IFC2X3.IfcMetric;
import IFC2X3.IfcObjective;
import IFC2X3.IfcObjectiveEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcObjectiveImpl#getBenchmarkValues <em>Benchmark Values</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcObjectiveImpl#getResultValues <em>Result Values</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcObjectiveImpl#getObjectiveQualifier <em>Objective Qualifier</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcObjectiveImpl#getUserDefinedQualifier <em>User Defined Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcObjective")
@XmlRootElement(name = "IfcObjectiveElement")
public class IfcObjectiveImpl extends IfcConstraintImpl implements IfcObjective {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcObjective();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMetric getBenchmarkValues() {
		return (IfcMetric)eGet(IFC2X3Package.eINSTANCE.getIfcObjective_BenchmarkValues(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenchmarkValues(IfcMetric newBenchmarkValues) {
		eSet(IFC2X3Package.eINSTANCE.getIfcObjective_BenchmarkValues(), newBenchmarkValues);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMetric getResultValues() {
		return (IfcMetric)eGet(IFC2X3Package.eINSTANCE.getIfcObjective_ResultValues(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultValues(IfcMetric newResultValues) {
		eSet(IFC2X3Package.eINSTANCE.getIfcObjective_ResultValues(), newResultValues);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedQualifier() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcObjective_UserDefinedQualifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedQualifier(String newUserDefinedQualifier) {
		eSet(IFC2X3Package.eINSTANCE.getIfcObjective_UserDefinedQualifier(), newUserDefinedQualifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedQualifier() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcObjective_UserDefinedQualifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedQualifier() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcObjective_UserDefinedQualifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectiveEnum getObjectiveQualifier() {
		return (IfcObjectiveEnum)eGet(IFC2X3Package.eINSTANCE.getIfcObjective_ObjectiveQualifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectiveQualifier(IfcObjectiveEnum newObjectiveQualifier) {
		eSet(IFC2X3Package.eINSTANCE.getIfcObjective_ObjectiveQualifier(), newObjectiveQualifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetObjectiveQualifier() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcObjective_ObjectiveQualifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetObjectiveQualifier() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcObjective_ObjectiveQualifier());
	}

} //IfcObjectiveImpl
