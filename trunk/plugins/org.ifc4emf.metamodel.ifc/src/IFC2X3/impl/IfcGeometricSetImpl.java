/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcGeometricSet;
import IFC2X3.IfcGeometricSetSelect;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Geometric Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcGeometricSetImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcGeometricSet")
@XmlSeeAlso({ IfcGeometricCurveSetImpl.class })
@XmlRootElement(name = "IfcGeometricSetElement")
public class IfcGeometricSetImpl extends IfcGeometricRepresentationItemImpl implements IfcGeometricSet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGeometricSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcGeometricSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@XmlElement
	public EList<IfcGeometricSetSelect> getElements() {
		return (EList<IfcGeometricSetSelect>)eGet(IFC2X3Package.eINSTANCE.getIfcGeometricSet_Elements(), true);
	}

} //IfcGeometricSetImpl
