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
import IFC2X3.IfcConnectionGeometry;
import IFC2X3.IfcElement;
import IFC2X3.IfcRelConnectsElements;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsElementsImpl#getConnectionGeometry <em>Connection Geometry</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsElementsImpl#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelConnectsElementsImpl#getRelatedElement <em>Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelConnectsElements")
@XmlSeeAlso({ IfcRelConnectsPathElementsImpl.class, IfcRelConnectsWithRealizingElementsImpl.class })
@XmlRootElement(name = "IfcRelConnectsElementsElement")
public class IfcRelConnectsElementsImpl extends IfcRelConnectsImpl implements IfcRelConnectsElements {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelConnectsElements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionGeometry getConnectionGeometry() {
		return (IfcConnectionGeometry)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsElements_ConnectionGeometry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionGeometry(IfcConnectionGeometry newConnectionGeometry) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsElements_ConnectionGeometry(), newConnectionGeometry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement getRelatedElement() {
		return (IfcElement)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsElements_RelatedElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedElement(IfcElement newRelatedElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsElements_RelatedElement(), newRelatedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement getRelatingElement() {
		return (IfcElement)eGet(IFC2X3Package.eINSTANCE.getIfcRelConnectsElements_RelatingElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingElement(IfcElement newRelatingElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelConnectsElements_RelatingElement(), newRelatingElement);
	}

} //IfcRelConnectsElementsImpl
