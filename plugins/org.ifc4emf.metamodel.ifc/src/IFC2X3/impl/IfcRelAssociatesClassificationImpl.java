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
import IFC2X3.IfcClassificationNotationSelect;
import IFC2X3.IfcRelAssociatesClassification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Associates Classification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelAssociatesClassificationImpl#getRelatingClassification <em>Relating Classification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelAssociatesClassification")
@XmlRootElement(name = "IfcRelAssociatesClassificationElement")
public class IfcRelAssociatesClassificationImpl extends IfcRelAssociatesImpl implements IfcRelAssociatesClassification {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssociatesClassificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelAssociatesClassification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassificationNotationSelect getRelatingClassification() {
		return (IfcClassificationNotationSelect)eGet(IFC2X3Package.eINSTANCE.getIfcRelAssociatesClassification_RelatingClassification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingClassification(IfcClassificationNotationSelect newRelatingClassification) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelAssociatesClassification_RelatingClassification(), newRelatingClassification);
	}

} //IfcRelAssociatesClassificationImpl
