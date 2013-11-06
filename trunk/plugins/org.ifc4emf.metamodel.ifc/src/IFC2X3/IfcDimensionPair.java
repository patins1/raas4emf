/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcDimensionPairImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Dimension Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFC2X3.IFC2X3Package#getIfcDimensionPair()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcDimensionPairImplAdapter.class)
public interface IfcDimensionPair extends IfcDraughtingCalloutRelationship {
} // IfcDimensionPair
