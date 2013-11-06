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
import IFC2X3.IfcSizeSelect;
import IFC2X3.IfcTextStyleTextModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Text Style Text Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTextStyleTextModelImpl#getTextIndent <em>Text Indent</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTextStyleTextModelImpl#getTextAlign <em>Text Align</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTextStyleTextModelImpl#getTextDecoration <em>Text Decoration</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTextStyleTextModelImpl#getLetterSpacing <em>Letter Spacing</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTextStyleTextModelImpl#getWordSpacing <em>Word Spacing</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTextStyleTextModelImpl#getTextTransform <em>Text Transform</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTextStyleTextModelImpl#getLineHeight <em>Line Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTextStyleTextModel")
@XmlRootElement(name = "IfcTextStyleTextModelElement")
public class IfcTextStyleTextModelImpl extends IfcTextStyleSelectImpl implements IfcTextStyleTextModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTextStyleTextModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTextStyleTextModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect getTextIndent() {
		return (IfcSizeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcTextStyleTextModel_TextIndent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextIndent(IfcSizeSelect newTextIndent) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextStyleTextModel_TextIndent(), newTextIndent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect getLetterSpacing() {
		return (IfcSizeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcTextStyleTextModel_LetterSpacing(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLetterSpacing(IfcSizeSelect newLetterSpacing) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextStyleTextModel_LetterSpacing(), newLetterSpacing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect getWordSpacing() {
		return (IfcSizeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcTextStyleTextModel_WordSpacing(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWordSpacing(IfcSizeSelect newWordSpacing) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextStyleTextModel_WordSpacing(), newWordSpacing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect getLineHeight() {
		return (IfcSizeSelect)eGet(IFC2X3Package.eINSTANCE.getIfcTextStyleTextModel_LineHeight(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineHeight(IfcSizeSelect newLineHeight) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextStyleTextModel_LineHeight(), newLineHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextTransform() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcTextStyleTextModel_TextTransform(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextTransform(String newTextTransform) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextStyleTextModel_TextTransform(), newTextTransform);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextTransform() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTextStyleTextModel_TextTransform());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextTransform() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTextStyleTextModel_TextTransform());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextDecoration() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcTextStyleTextModel_TextDecoration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextDecoration(String newTextDecoration) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextStyleTextModel_TextDecoration(), newTextDecoration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextDecoration() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTextStyleTextModel_TextDecoration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextDecoration() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTextStyleTextModel_TextDecoration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextAlign() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcTextStyleTextModel_TextAlign(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextAlign(String newTextAlign) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTextStyleTextModel_TextAlign(), newTextAlign);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextAlign() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTextStyleTextModel_TextAlign());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextAlign() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTextStyleTextModel_TextAlign());
	}

} //IfcTextStyleTextModelImpl
