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
import IFC2X3.IfcDefinedSymbolSelect;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Defined Symbol Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDefinedSymbolSelect")
@XmlSeeAlso({ IfcExternallyDefinedSymbolImpl.class, IfcPreDefinedDimensionSymbolImpl.class, IfcPreDefinedPointMarkerSymbolImpl.class, IfcPreDefinedTerminatorSymbolImpl.class, IfcPreDefinedSymbolImpl.class })
@XmlRootElement(name = "IfcDefinedSymbolSelectElement")
public abstract class IfcDefinedSymbolSelectImpl extends CDOObjectImpl implements IfcDefinedSymbolSelect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDefinedSymbolSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDefinedSymbolSelect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

} //IfcDefinedSymbolSelectImpl
