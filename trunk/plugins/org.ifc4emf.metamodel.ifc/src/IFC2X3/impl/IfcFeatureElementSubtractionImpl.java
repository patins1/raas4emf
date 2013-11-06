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
import IFC2X3.IfcFeatureElementSubtraction;
import IFC2X3.IfcRelVoidsElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Feature Element Subtraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcFeatureElementSubtractionImpl#getVoidsElements <em>Voids Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcFeatureElementSubtraction")
@XmlSeeAlso({ IfcChamferEdgeFeatureImpl.class, IfcRoundedEdgeFeatureImpl.class, IfcEdgeFeatureImpl.class, IfcOpeningElementImpl.class })
@XmlRootElement(name = "IfcFeatureElementSubtractionElement")
public class IfcFeatureElementSubtractionImpl extends IfcFeatureElementImpl implements IfcFeatureElementSubtraction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFeatureElementSubtractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcFeatureElementSubtraction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelVoidsElement getVoidsElements() {
		return (IfcRelVoidsElement)eGet(IFC2X3Package.eINSTANCE.getIfcFeatureElementSubtraction_VoidsElements(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoidsElements(IfcRelVoidsElement newVoidsElements) {
		eSet(IFC2X3Package.eINSTANCE.getIfcFeatureElementSubtraction_VoidsElements(), newVoidsElements);
	}

} //IfcFeatureElementSubtractionImpl
