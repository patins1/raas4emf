/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcTable;
import IFC2X3.IfcTableRow;
import IFC2X3.IfcValue;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Table Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTableRowImpl#getRowCells <em>Row Cells</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTableRowImpl#getIsHeading <em>Is Heading</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTableRowImpl#getOfTable <em>Of Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTableRow")
@XmlRootElement(name = "IfcTableRowElement")
public class IfcTableRowImpl extends CDOObjectImpl implements IfcTableRow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTableRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTableRow();
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
	public EList<IfcValue> getRowCells() {
		return (EList<IfcValue>)eGet(IFC2X3Package.eINSTANCE.getIfcTableRow_RowCells(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTable getOfTable() {
		return (IfcTable)eGet(IFC2X3Package.eINSTANCE.getIfcTableRow_OfTable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOfTable(IfcTable newOfTable) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTableRow_OfTable(), newOfTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsHeading() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcTableRow_IsHeading(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHeading(Boolean newIsHeading) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTableRow_IsHeading(), newIsHeading);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsHeading() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTableRow_IsHeading());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsHeading() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTableRow_IsHeading());
	}

} //IfcTableRowImpl
