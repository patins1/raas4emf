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
import IFC2X3.IfcConnectionGeometry;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Connection Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcConnectionGeometry")
@XmlSeeAlso({ IfcConnectionCurveGeometryImpl.class, IfcConnectionPointGeometryImpl.class, IfcConnectionSurfaceGeometryImpl.class, IfcConnectionPortGeometryImpl.class, IfcConnectionPointEccentricityImpl.class })
@XmlRootElement(name = "IfcConnectionGeometryElement")
public class IfcConnectionGeometryImpl extends CDOObjectImpl implements IfcConnectionGeometry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConnectionGeometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcConnectionGeometry();
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

} //IfcConnectionGeometryImpl
