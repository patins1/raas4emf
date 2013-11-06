/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcRepresentation;
import IFC2X3.IfcRepresentationContext;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Representation Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRepresentationContextImpl#getContextIdentifier <em>Context Identifier</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRepresentationContextImpl#getContextType <em>Context Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRepresentationContextImpl#getRepresentationsInContext <em>Representations In Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRepresentationContext")
@XmlSeeAlso({ IfcGeometricRepresentationSubContextImpl.class, IfcGeometricRepresentationContextImpl.class })
@XmlRootElement(name = "IfcRepresentationContextElement")
public class IfcRepresentationContextImpl extends CDOObjectImpl implements IfcRepresentationContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRepresentationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRepresentationContext();
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
	public EList<IfcRepresentation> getRepresentationsInContext() {
		return (EList<IfcRepresentation>)eGet(IFC2X3Package.eINSTANCE.getIfcRepresentationContext_RepresentationsInContext(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContextType() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcRepresentationContext_ContextType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextType(String newContextType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRepresentationContext_ContextType(), newContextType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContextType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRepresentationContext_ContextType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContextType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRepresentationContext_ContextType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContextIdentifier() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcRepresentationContext_ContextIdentifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextIdentifier(String newContextIdentifier) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRepresentationContext_ContextIdentifier(), newContextIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContextIdentifier() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcRepresentationContext_ContextIdentifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContextIdentifier() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcRepresentationContext_ContextIdentifier());
	}

} //IfcRepresentationContextImpl
