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
import IFC2X3.IfcProjectedOrTrueLengthEnum;
import IFC2X3.IfcStructuralLinearAction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Linear Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStructuralLinearActionImpl#getProjectedOrTrue <em>Projected Or True</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStructuralLinearAction")
@XmlSeeAlso({ IfcStructuralLinearActionVaryingImpl.class })
@XmlRootElement(name = "IfcStructuralLinearActionElement")
public class IfcStructuralLinearActionImpl extends IfcStructuralActionImpl implements IfcStructuralLinearAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLinearActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStructuralLinearAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProjectedOrTrueLengthEnum getProjectedOrTrue() {
		return (IfcProjectedOrTrueLengthEnum)eGet(IFC2X3Package.eINSTANCE.getIfcStructuralLinearAction_ProjectedOrTrue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectedOrTrue(IfcProjectedOrTrueLengthEnum newProjectedOrTrue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStructuralLinearAction_ProjectedOrTrue(), newProjectedOrTrue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProjectedOrTrue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStructuralLinearAction_ProjectedOrTrue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProjectedOrTrue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStructuralLinearAction_ProjectedOrTrue());
	}

} //IfcStructuralLinearActionImpl
