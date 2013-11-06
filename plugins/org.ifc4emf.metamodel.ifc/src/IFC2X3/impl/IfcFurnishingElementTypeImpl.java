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
import IFC2X3.IfcFurnishingElementType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Furnishing Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcFurnishingElementType")
@XmlSeeAlso({ IfcFurnitureTypeImpl.class, IfcSystemFurnitureElementTypeImpl.class })
@XmlRootElement(name = "IfcFurnishingElementTypeElement")
public class IfcFurnishingElementTypeImpl extends IfcElementTypeImpl implements IfcFurnishingElementType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFurnishingElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcFurnishingElementType();
	}

} //IfcFurnishingElementTypeImpl
