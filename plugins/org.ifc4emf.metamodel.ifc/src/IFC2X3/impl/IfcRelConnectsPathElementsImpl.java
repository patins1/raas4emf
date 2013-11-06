/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcConnectionTypeEnum;
import IFC2X3.IfcRelConnectsPathElements;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Path Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsPathElementsImpl#getRelatingPriorities <em>Relating Priorities</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsPathElementsImpl#getRelatedPriorities <em>Related Priorities</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsPathElementsImpl#getRelatedConnectionType <em>Related Connection Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsPathElementsImpl#getRelatingConnectionType <em>Relating Connection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelConnectsPathElements")
@XmlRootElement(name = "IfcRelConnectsPathElementsElement")
public class IfcRelConnectsPathElementsImpl extends IfcRelConnectsElementsImpl implements IfcRelConnectsPathElements {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsPathElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelConnectsPathElements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionTypeEnum getRelatingConnectionType() {
		return (IfcConnectionTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsPathElements_RelatingConnectionType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingConnectionType(IfcConnectionTypeEnum newRelatingConnectionType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsPathElements_RelatingConnectionType(), newRelatingConnectionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelatingConnectionType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRelConnectsPathElements_RelatingConnectionType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatingConnectionType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsPathElements_RelatingConnectionType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionTypeEnum getRelatedConnectionType() {
		return (IfcConnectionTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsPathElements_RelatedConnectionType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedConnectionType(IfcConnectionTypeEnum newRelatedConnectionType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsPathElements_RelatedConnectionType(), newRelatedConnectionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelatedConnectionType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRelConnectsPathElements_RelatedConnectionType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedConnectionType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsPathElements_RelatedConnectionType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Integer> getRelatedPriorities() {
		return (EList<Integer>)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsPathElements_RelatedPriorities(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Integer> getRelatingPriorities() {
		return (EList<Integer>)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsPathElements_RelatingPriorities(), true);
	}

} //IfcRelConnectsPathElementsImpl
