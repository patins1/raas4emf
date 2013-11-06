/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcPresentationStyleAssignment;
import IFC2X3.IfcRepresentationItem;
import IFC2X3.IfcStyledItem;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Styled Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcStyledItemImpl#getItem <em>Item</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStyledItemImpl#getStyles <em>Styles</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcStyledItemImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcStyledItem")
@XmlSeeAlso({ IfcDimensionCurveImpl.class, IfcTerminatorSymbolImpl.class, IfcAnnotationFillAreaOccurrenceImpl.class, IfcDimensionCurveTerminatorImpl.class, IfcProjectionCurveImpl.class, IfcAnnotationOccurrenceImpl.class, IfcAnnotationSurfaceOccurrenceImpl.class,
		IfcAnnotationTextOccurrenceImpl.class, IfcAnnotationSymbolOccurrenceImpl.class, IfcAnnotationCurveOccurrenceImpl.class })
@XmlRootElement(name = "IfcStyledItemElement")
public class IfcStyledItemImpl extends IfcRepresentationItemImpl implements IfcStyledItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStyledItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcStyledItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@XmlElement
	public EList<IfcPresentationStyleAssignment> getStyles() {
		return (EList<IfcPresentationStyleAssignment>)eGet(IFC2X3Package.eINSTANCE.getIfcStyledItem_Styles(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@XmlTransient
	public IfcRepresentationItem getItem() {
		return (IfcRepresentationItem)eGet(IFC2X3Package.eINSTANCE.getIfcStyledItem_Item(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(IfcRepresentationItem newItem) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStyledItem_Item(), newItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcStyledItem_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(IFC2X3Package.eINSTANCE.getIfcStyledItem_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcStyledItem_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcStyledItem_Name());
	}

} //IfcStyledItemImpl
