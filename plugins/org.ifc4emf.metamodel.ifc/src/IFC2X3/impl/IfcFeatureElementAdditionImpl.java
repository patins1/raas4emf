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
import IFC2X3.IfcFeatureElementAddition;
import IFC2X3.IfcRelProjectsElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Feature Element Addition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcFeatureElementAdditionImpl#getProjectsElements <em>Projects Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcFeatureElementAddition")
@XmlSeeAlso({ IfcProjectionElementImpl.class })
@XmlRootElement(name = "IfcFeatureElementAdditionElement")
public class IfcFeatureElementAdditionImpl extends IfcFeatureElementImpl implements IfcFeatureElementAddition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFeatureElementAdditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcFeatureElementAddition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelProjectsElement getProjectsElements() {
		return (IfcRelProjectsElement)eGet(IFC2X3Package.eINSTANCE.getIfcFeatureElementAddition_ProjectsElements(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectsElements(IfcRelProjectsElement newProjectsElements) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFeatureElementAddition_ProjectsElements(), newProjectsElements);
	}

} //IfcFeatureElementAdditionImpl
