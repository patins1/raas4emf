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
import IFC2X3.IfcLibrarySelect;
import IFC2X3.IfcRelAssociatesLibrary;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Associates Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcRelAssociatesLibraryImpl#getRelatingLibrary <em>Relating Library</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcRelAssociatesLibrary")
@XmlRootElement(name = "IfcRelAssociatesLibraryElement")
public class IfcRelAssociatesLibraryImpl extends IfcRelAssociatesImpl implements IfcRelAssociatesLibrary {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssociatesLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcRelAssociatesLibrary();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLibrarySelect getRelatingLibrary() {
		return (IfcLibrarySelect)eGet(IFC2X3Package.eINSTANCE.getIfcRelAssociatesLibrary_RelatingLibrary(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingLibrary(IfcLibrarySelect newRelatingLibrary) {
		eSet(IFC2X3Package.eINSTANCE.getIfcRelAssociatesLibrary_RelatingLibrary(), newRelatingLibrary);
	}

} //IfcRelAssociatesLibraryImpl
