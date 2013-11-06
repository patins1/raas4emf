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
import IFC2X3.IfcCsgSelect;
import IFC2X3.IfcCsgSolid;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Csg Solid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcCsgSolidImpl#getTreeRootExpression <em>Tree Root Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcCsgSolid")
@XmlRootElement(name = "IfcCsgSolidElement")
public class IfcCsgSolidImpl extends IfcSolidModelImpl implements IfcCsgSolid {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCsgSolidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcCsgSolid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCsgSelect getTreeRootExpression() {
		return (IfcCsgSelect)eGet(IFC2X3Package.eINSTANCE.getIfcCsgSolid_TreeRootExpression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreeRootExpression(IfcCsgSelect newTreeRootExpression) {
		eSet(IFC2X3Package.eINSTANCE.getIfcCsgSolid_TreeRootExpression(), newTreeRootExpression);
	}

} //IfcCsgSolidImpl
