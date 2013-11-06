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
import IFC2X3.IfcLightDistributionDataSourceSelect;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Light Distribution Data Source Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcLightDistributionDataSourceSelect")
@XmlSeeAlso({ IfcExternallyDefinedSymbolImpl.class, IfcLightIntensityDistributionImpl.class, IfcDocumentReferenceImpl.class, IfcLibraryReferenceImpl.class, IfcClassificationReferenceImpl.class, IfcExternalReferenceImpl.class, IfcExternallyDefinedHatchStyleImpl.class,
		IfcExternallyDefinedSurfaceStyleImpl.class, IfcExternallyDefinedTextFontImpl.class })
@XmlRootElement(name = "IfcLightDistributionDataSourceSelectElement")
public abstract class IfcLightDistributionDataSourceSelectImpl extends CDOObjectImpl implements IfcLightDistributionDataSourceSelect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLightDistributionDataSourceSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcLightDistributionDataSourceSelect();
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

} //IfcLightDistributionDataSourceSelectImpl
