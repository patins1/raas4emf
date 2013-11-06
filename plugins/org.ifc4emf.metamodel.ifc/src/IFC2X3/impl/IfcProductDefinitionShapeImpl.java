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
import IFC2X3.IfcProductDefinitionShape;
import IFC2X3.IfcShapeAspect;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Product Definition Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcProductDefinitionShapeImpl#getHasShapeAspects <em>Has Shape Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcProductDefinitionShape")
@XmlRootElement(name = "IfcProductDefinitionShapeElement")
public class IfcProductDefinitionShapeImpl extends IfcProductRepresentationImpl implements IfcProductDefinitionShape {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcProductDefinitionShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcProductDefinitionShape();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcShapeAspect> getHasShapeAspects() {
		return (EList<IfcShapeAspect>)eGet(IFC2X3Package.eINSTANCE.getIfcProductDefinitionShape_HasShapeAspects(), true);
	}

} //IfcProductDefinitionShapeImpl
