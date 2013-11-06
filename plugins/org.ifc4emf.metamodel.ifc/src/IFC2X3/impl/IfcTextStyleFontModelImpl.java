/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcSizeSelect;
import IFC2X3.IfcTextStyleFontModel;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Text Style Font Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTextStyleFontModelImpl#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTextStyleFontModelImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTextStyleFontModelImpl#getFontVariant <em>Font Variant</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTextStyleFontModelImpl#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTextStyleFontModelImpl#getFontSize <em>Font Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTextStyleFontModel")
@XmlRootElement(name = "IfcTextStyleFontModelElement")
public class IfcTextStyleFontModelImpl extends IfcPreDefinedTextFontImpl implements IfcTextStyleFontModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTextStyleFontModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTextStyleFontModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect getFontSize() {
		return (IfcSizeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcTextStyleFontModel_FontSize(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSize(IfcSizeSelect newFontSize) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextStyleFontModel_FontSize(), newFontSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontWeight() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcTextStyleFontModel_FontWeight(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontWeight(String newFontWeight) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextStyleFontModel_FontWeight(), newFontWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontWeight() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTextStyleFontModel_FontWeight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontWeight() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTextStyleFontModel_FontWeight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontVariant() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcTextStyleFontModel_FontVariant(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontVariant(String newFontVariant) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextStyleFontModel_FontVariant(), newFontVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontVariant() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTextStyleFontModel_FontVariant());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontVariant() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTextStyleFontModel_FontVariant());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontStyle() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcTextStyleFontModel_FontStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontStyle(String newFontStyle) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextStyleFontModel_FontStyle(), newFontStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontStyle() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTextStyleFontModel_FontStyle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontStyle() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTextStyleFontModel_FontStyle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getFontFamily() {
		return (EList<String>)eGet(IFC2X3Package.eINSTANCE.getIfcTextStyleFontModel_FontFamily(), true);
	}

} //IfcTextStyleFontModelImpl
