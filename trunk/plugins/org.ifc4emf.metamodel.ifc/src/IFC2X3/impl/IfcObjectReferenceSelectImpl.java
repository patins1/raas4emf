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
import IFC2X3.IfcObjectReferenceSelect;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Object Reference Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcObjectReferenceSelect")
@XmlSeeAlso({ IfcDateAndTimeImpl.class, IfcMaterialLayerImpl.class, IfcPersonAndOrganizationImpl.class, IfcExternallyDefinedSurfaceStyleImpl.class, IfcLocalTimeImpl.class, IfcTimeSeriesImpl.class, IfcAddressImpl.class, IfcIrregularTimeSeriesImpl.class, IfcAppliedValueImpl.class,
		IfcLibraryReferenceImpl.class, IfcCalendarDateImpl.class, IfcExternalReferenceImpl.class, IfcPersonImpl.class, IfcExternallyDefinedTextFontImpl.class, IfcMaterialListImpl.class, IfcMaterialImpl.class, IfcOrganizationImpl.class, IfcExternallyDefinedSymbolImpl.class,
		IfcTelecomAddressImpl.class, IfcDocumentReferenceImpl.class, IfcPostalAddressImpl.class, IfcClassificationReferenceImpl.class, IfcExternallyDefinedHatchStyleImpl.class, IfcCostValueImpl.class, IfcRegularTimeSeriesImpl.class, IfcEnvironmentalImpactValueImpl.class })
@XmlRootElement(name = "IfcObjectReferenceSelectElement")
public abstract class IfcObjectReferenceSelectImpl extends CDOObjectImpl implements IfcObjectReferenceSelect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcObjectReferenceSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcObjectReferenceSelect();
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

} //IfcObjectReferenceSelectImpl
