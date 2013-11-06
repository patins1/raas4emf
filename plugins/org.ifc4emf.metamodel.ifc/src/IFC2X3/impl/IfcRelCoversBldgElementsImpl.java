/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcCovering;
import IFC2X3.IfcElement;
import IFC2X3.IfcRelCoversBldgElements;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Covers Bldg Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelCoversBldgElementsImpl#getRelatingBuildingElement <em>Relating Building Element</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelCoversBldgElementsImpl#getRelatedCoverings <em>Related Coverings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelCoversBldgElements")
@XmlRootElement(name = "IfcRelCoversBldgElementsElement")
public class IfcRelCoversBldgElementsImpl extends IfcRelConnectsImpl implements IfcRelCoversBldgElements {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelCoversBldgElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelCoversBldgElements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement getRelatingBuildingElement() {
		return (IfcElement)eGet(IFC2X3Package.eINSTANCE.getIfcRelCoversBldgElements_RelatingBuildingElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingBuildingElement(IfcElement newRelatingBuildingElement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelCoversBldgElements_RelatingBuildingElement(), newRelatingBuildingElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcCovering> getRelatedCoverings() {
		return (EList<IfcCovering>)eGet(IFC2X3Package.eINSTANCE.getIfcRelCoversBldgElements_RelatedCoverings(), true);
	}

} //IfcRelCoversBldgElementsImpl
