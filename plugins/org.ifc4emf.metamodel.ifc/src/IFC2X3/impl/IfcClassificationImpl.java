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
import IFC2X3.IfcCalendarDate;
import IFC2X3.IfcClassification;
import IFC2X3.IfcClassificationItem;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Classification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcClassificationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcClassificationImpl#getEdition <em>Edition</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcClassificationImpl#getEditionDate <em>Edition Date</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcClassificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcClassificationImpl#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcClassification")
@XmlRootElement(name = "IfcClassificationElement")
public class IfcClassificationImpl extends CDOObjectImpl implements IfcClassification {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcClassificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcClassification();
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcClassificationItem> getContains() {
		return (EList<IfcClassificationItem>)eGet(IFC2X3Package.eINSTANCE.getIfcClassification_Contains(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate getEditionDate() {
		return (IfcCalendarDate)eGet(IFC2X3Package.eINSTANCE.getIfcClassification_EditionDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditionDate(IfcCalendarDate newEditionDate) {
		eSet(IFC2X3Package.eINSTANCE.getIfcClassification_EditionDate(), newEditionDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcClassification_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcClassification_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcClassification_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcClassification_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEdition() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcClassification_Edition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdition(String newEdition) {
		eSet(IFC2X3Package.eINSTANCE.getIfcClassification_Edition(), newEdition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEdition() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcClassification_Edition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEdition() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcClassification_Edition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcClassification_Source(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		eSet(IFC2X3Package.eINSTANCE.getIfcClassification_Source(), newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSource() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcClassification_Source());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSource() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcClassification_Source());
	}

} //IfcClassificationImpl
