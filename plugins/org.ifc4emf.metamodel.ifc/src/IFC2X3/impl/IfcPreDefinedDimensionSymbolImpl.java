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
import IFC2X3.IfcPreDefinedDimensionSymbol;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Pre Defined Dimension Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPreDefinedDimensionSymbol")
@XmlRootElement(name = "IfcPreDefinedDimensionSymbolElement")
public class IfcPreDefinedDimensionSymbolImpl extends IfcPreDefinedSymbolImpl implements IfcPreDefinedDimensionSymbol {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPreDefinedDimensionSymbolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPreDefinedDimensionSymbol();
	}

} //IfcPreDefinedDimensionSymbolImpl
