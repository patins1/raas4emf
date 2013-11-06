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
import IFC2X3.IfcFillStyleSelect;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Fill Style Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcFillStyleSelect")
@XmlSeeAlso({ IfcFillAreaStyleTilesImpl.class, IfcColourImpl.class, IfcDraughtingPreDefinedColourImpl.class, IfcColourSpecificationImpl.class, IfcFillAreaStyleHatchingImpl.class, IfcExternallyDefinedHatchStyleImpl.class, IfcColourRgbImpl.class, IfcPreDefinedColourImpl.class })
@XmlRootElement(name = "IfcFillStyleSelectElement")
public abstract class IfcFillStyleSelectImpl extends CDOObjectImpl implements IfcFillStyleSelect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFillStyleSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcFillStyleSelect();
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

} //IfcFillStyleSelectImpl
