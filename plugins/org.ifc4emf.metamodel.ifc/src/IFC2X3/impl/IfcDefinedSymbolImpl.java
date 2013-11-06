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
import IFC2X3.IfcCartesianTransformationOperator2D;
import IFC2X3.IfcDefinedSymbol;
import IFC2X3.IfcDefinedSymbolSelect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Defined Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcDefinedSymbolImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcDefinedSymbolImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDefinedSymbol")
@XmlRootElement(name = "IfcDefinedSymbolElement")
public class IfcDefinedSymbolImpl extends IfcGeometricRepresentationItemImpl implements IfcDefinedSymbol {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDefinedSymbolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDefinedSymbol();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianTransformationOperator2D getTarget() {
		return (IfcCartesianTransformationOperator2D)eGet(IFC2X3Package.eINSTANCE.getIfcDefinedSymbol_Target(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(IfcCartesianTransformationOperator2D newTarget) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDefinedSymbol_Target(), newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDefinedSymbolSelect getDefinition() {
		return (IfcDefinedSymbolSelect)eGet(IFC2X3Package.eINSTANCE.getIfcDefinedSymbol_Definition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(IfcDefinedSymbolSelect newDefinition) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDefinedSymbol_Definition(), newDefinition);
	}

} //IfcDefinedSymbolImpl
