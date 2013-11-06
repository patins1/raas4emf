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
import IFC2X3.IfcDocumentSelect;
import IFC2X3.IfcRelAssociatesDocument;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Associates Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelAssociatesDocumentImpl#getRelatingDocument <em>Relating Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelAssociatesDocument")
@XmlRootElement(name = "IfcRelAssociatesDocumentElement")
public class IfcRelAssociatesDocumentImpl extends IfcRelAssociatesImpl implements IfcRelAssociatesDocument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssociatesDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelAssociatesDocument();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentSelect getRelatingDocument() {
		return (IfcDocumentSelect)eGet(IFC2X3Package.eINSTANCE.getIfcRelAssociatesDocument_RelatingDocument(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingDocument(IfcDocumentSelect newRelatingDocument) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelAssociatesDocument_RelatingDocument(), newRelatingDocument);
	}

} //IfcRelAssociatesDocumentImpl
