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
import IFC2X3.IfcSimpleProperty;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Simple Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSimpleProperty")
@XmlSeeAlso({ IfcPropertyEnumeratedValueImpl.class, IfcPropertyTableValueImpl.class, IfcPropertyReferenceValueImpl.class, IfcPropertySingleValueImpl.class, IfcPropertyBoundedValueImpl.class, IfcPropertyListValueImpl.class })
@XmlRootElement(name = "IfcSimplePropertyElement")
public class IfcSimplePropertyImpl extends IfcPropertyImpl implements IfcSimpleProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSimplePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSimpleProperty();
	}

} //IfcSimplePropertyImpl
