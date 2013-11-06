/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcCovering;
import IFC2X3.IfcRelCoversSpaces;
import IFC2X3.IfcSpace;

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
 * An implementation of the model object '<em><b>Ifc Rel Covers Spaces</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelCoversSpacesImpl#getRelatedSpace <em>Related Space</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelCoversSpacesImpl#getRelatedCoverings <em>Related Coverings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelCoversSpaces")
@XmlRootElement(name = "IfcRelCoversSpacesElement")
public class IfcRelCoversSpacesImpl extends IfcRelConnectsImpl implements IfcRelCoversSpaces {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelCoversSpacesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelCoversSpaces();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpace getRelatedSpace() {
		return (IfcSpace)eGet(IFC2X3Package.eINSTANCE.getIfcRelCoversSpaces_RelatedSpace(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedSpace(IfcSpace newRelatedSpace) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelCoversSpaces_RelatedSpace(), newRelatedSpace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcCovering> getRelatedCoverings() {
		return (EList<IfcCovering>)eGet(IFC2X3Package.eINSTANCE.getIfcRelCoversSpaces_RelatedCoverings(), true);
	}

} //IfcRelCoversSpacesImpl
