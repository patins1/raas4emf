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
import IFC2X3.IfcPlanarExtent;
import IFC2X3.IfcTextLiteralWithExtent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Text Literal With Extent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTextLiteralWithExtentImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTextLiteralWithExtentImpl#getBoxAlignment <em>Box Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTextLiteralWithExtent")
@XmlRootElement(name = "IfcTextLiteralWithExtentElement")
public class IfcTextLiteralWithExtentImpl extends IfcTextLiteralImpl implements IfcTextLiteralWithExtent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTextLiteralWithExtentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTextLiteralWithExtent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlanarExtent getExtent() {
		return (IfcPlanarExtent)eGet(IFC2X3Package.eINSTANCE.getIfcTextLiteralWithExtent_Extent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtent(IfcPlanarExtent newExtent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextLiteralWithExtent_Extent(), newExtent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoxAlignment() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcTextLiteralWithExtent_BoxAlignment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoxAlignment(String newBoxAlignment) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextLiteralWithExtent_BoxAlignment(), newBoxAlignment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoxAlignment() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTextLiteralWithExtent_BoxAlignment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBoxAlignment() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTextLiteralWithExtent_BoxAlignment());
	}

} //IfcTextLiteralWithExtentImpl
