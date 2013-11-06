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
import IFC2X3.IfcSymbolStyle;
import IFC2X3.IfcSymbolStyleSelect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Symbol Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSymbolStyleImpl#getStyleOfSymbol <em>Style Of Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSymbolStyle")
@XmlRootElement(name = "IfcSymbolStyleElement")
public class IfcSymbolStyleImpl extends IfcPresentationStyleImpl implements IfcSymbolStyle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSymbolStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSymbolStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSymbolStyleSelect getStyleOfSymbol() {
		return (IfcSymbolStyleSelect)eGet(IFC2X3Package.eINSTANCE.getIfcSymbolStyle_StyleOfSymbol(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleOfSymbol(IfcSymbolStyleSelect newStyleOfSymbol) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSymbolStyle_StyleOfSymbol(), newStyleOfSymbol);
	}

} //IfcSymbolStyleImpl
