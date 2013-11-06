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
import IFC2X3.IfcAxis2Placement;
import IFC2X3.IfcTextLiteral;
import IFC2X3.IfcTextPath;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Text Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTextLiteralImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTextLiteralImpl#getPlacement <em>Placement</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTextLiteralImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTextLiteral")
@XmlSeeAlso({ IfcTextLiteralWithExtentImpl.class })
@XmlRootElement(name = "IfcTextLiteralElement")
public class IfcTextLiteralImpl extends IfcGeometricRepresentationItemImpl implements IfcTextLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTextLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTextLiteral();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement getPlacement() {
		return (IfcAxis2Placement)eGet(IFC2X3Package.eINSTANCE.getIfcTextLiteral_Placement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacement(IfcAxis2Placement newPlacement) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextLiteral_Placement(), newPlacement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextPath getPath() {
		return (IfcTextPath)eGet(IFC2X3Package.eINSTANCE.getIfcTextLiteral_Path(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(IfcTextPath newPath) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextLiteral_Path(), newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPath() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTextLiteral_Path());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPath() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTextLiteral_Path());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcTextLiteral_Literal(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteral(String newLiteral) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextLiteral_Literal(), newLiteral);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLiteral() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTextLiteral_Literal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLiteral() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTextLiteral_Literal());
	}

} //IfcTextLiteralImpl
