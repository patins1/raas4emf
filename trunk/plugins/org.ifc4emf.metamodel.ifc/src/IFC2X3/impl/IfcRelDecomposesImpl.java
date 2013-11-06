/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcObjectDefinition;
import IFC2X3.IfcRelDecomposes;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * An implementation of the model object '<em><b>Ifc Rel Decomposes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelDecomposesImpl#getRelatingObject <em>Relating Object</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcRelDecomposesImpl#getRelatedObjects <em>Related Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelDecomposes")
@XmlSeeAlso({ IfcRelAggregatesImpl.class, IfcRelNestsImpl.class })
@XmlRootElement(name = "IfcRelDecomposesElement")
public class IfcRelDecomposesImpl extends IfcRelationshipImpl implements IfcRelDecomposes {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelDecomposesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelDecomposes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectDefinition getRelatingObject() {
		return (IfcObjectDefinition)eGet(IFC2X3Package.eINSTANCE.getIfcRelDecomposes_RelatingObject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingObject(IfcObjectDefinition newRelatingObject) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelDecomposes_RelatingObject(), newRelatingObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcObjectDefinition> getRelatedObjects() {
		return (EList<IfcObjectDefinition>)eGet(IFC2X3Package.eINSTANCE.getIfcRelDecomposes_RelatedObjects(), true);
	}

} //IfcRelDecomposesImpl
