/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcReinforcingBarImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Reinforcing Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcReinforcingBar#getNominalDiameter <em>Nominal Diameter</em>}</li>
 *   <li>{@link IFC2X3.IfcReinforcingBar#getCrossSectionArea <em>Cross Section Area</em>}</li>
 *   <li>{@link IFC2X3.IfcReinforcingBar#getBarLength <em>Bar Length</em>}</li>
 *   <li>{@link IFC2X3.IfcReinforcingBar#getBarRole <em>Bar Role</em>}</li>
 *   <li>{@link IFC2X3.IfcReinforcingBar#getBarSurface <em>Bar Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcReinforcingBar()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcReinforcingBarImplAdapter.class)
public interface IfcReinforcingBar extends IfcReinforcingElement {
	/**
	 * Returns the value of the '<em><b>Bar Surface</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcReinforcingBarSurfaceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bar Surface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bar Surface</em>' attribute.
	 * @see IFC2X3.IfcReinforcingBarSurfaceEnum
	 * @see #isSetBarSurface()
	 * @see #unsetBarSurface()
	 * @see #setBarSurface(IfcReinforcingBarSurfaceEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcReinforcingBar_BarSurface()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcReinforcingBarSurfaceEnum getBarSurface();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcReinforcingBar#getBarSurface <em>Bar Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bar Surface</em>' attribute.
	 * @see IFC2X3.IfcReinforcingBarSurfaceEnum
	 * @see #isSetBarSurface()
	 * @see #unsetBarSurface()
	 * @see #getBarSurface()
	 * @generated
	 */
	void setBarSurface(IfcReinforcingBarSurfaceEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcReinforcingBar#getBarSurface <em>Bar Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBarSurface()
	 * @see #getBarSurface()
	 * @see #setBarSurface(IfcReinforcingBarSurfaceEnum)
	 * @generated
	 */
	void unsetBarSurface();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcReinforcingBar#getBarSurface <em>Bar Surface</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bar Surface</em>' attribute is set.
	 * @see #unsetBarSurface()
	 * @see #getBarSurface()
	 * @see #setBarSurface(IfcReinforcingBarSurfaceEnum)
	 * @generated
	 */
	boolean isSetBarSurface();

	/**
	 * Returns the value of the '<em><b>Bar Role</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcReinforcingBarRoleEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bar Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bar Role</em>' attribute.
	 * @see IFC2X3.IfcReinforcingBarRoleEnum
	 * @see #isSetBarRole()
	 * @see #unsetBarRole()
	 * @see #setBarRole(IfcReinforcingBarRoleEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcReinforcingBar_BarRole()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcReinforcingBarRoleEnum getBarRole();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcReinforcingBar#getBarRole <em>Bar Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bar Role</em>' attribute.
	 * @see IFC2X3.IfcReinforcingBarRoleEnum
	 * @see #isSetBarRole()
	 * @see #unsetBarRole()
	 * @see #getBarRole()
	 * @generated
	 */
	void setBarRole(IfcReinforcingBarRoleEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcReinforcingBar#getBarRole <em>Bar Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBarRole()
	 * @see #getBarRole()
	 * @see #setBarRole(IfcReinforcingBarRoleEnum)
	 * @generated
	 */
	void unsetBarRole();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcReinforcingBar#getBarRole <em>Bar Role</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bar Role</em>' attribute is set.
	 * @see #unsetBarRole()
	 * @see #getBarRole()
	 * @see #setBarRole(IfcReinforcingBarRoleEnum)
	 * @generated
	 */
	boolean isSetBarRole();

	/**
	 * Returns the value of the '<em><b>Bar Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bar Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bar Length</em>' attribute.
	 * @see #isSetBarLength()
	 * @see #unsetBarLength()
	 * @see #setBarLength(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcReinforcingBar_BarLength()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getBarLength();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcReinforcingBar#getBarLength <em>Bar Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bar Length</em>' attribute.
	 * @see #isSetBarLength()
	 * @see #unsetBarLength()
	 * @see #getBarLength()
	 * @generated
	 */
	void setBarLength(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcReinforcingBar#getBarLength <em>Bar Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBarLength()
	 * @see #getBarLength()
	 * @see #setBarLength(Double)
	 * @generated
	 */
	void unsetBarLength();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcReinforcingBar#getBarLength <em>Bar Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bar Length</em>' attribute is set.
	 * @see #unsetBarLength()
	 * @see #getBarLength()
	 * @see #setBarLength(Double)
	 * @generated
	 */
	boolean isSetBarLength();

	/**
	 * Returns the value of the '<em><b>Cross Section Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cross Section Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Section Area</em>' attribute.
	 * @see #isSetCrossSectionArea()
	 * @see #unsetCrossSectionArea()
	 * @see #setCrossSectionArea(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcReinforcingBar_CrossSectionArea()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getCrossSectionArea();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcReinforcingBar#getCrossSectionArea <em>Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cross Section Area</em>' attribute.
	 * @see #isSetCrossSectionArea()
	 * @see #unsetCrossSectionArea()
	 * @see #getCrossSectionArea()
	 * @generated
	 */
	void setCrossSectionArea(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcReinforcingBar#getCrossSectionArea <em>Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCrossSectionArea()
	 * @see #getCrossSectionArea()
	 * @see #setCrossSectionArea(Double)
	 * @generated
	 */
	void unsetCrossSectionArea();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcReinforcingBar#getCrossSectionArea <em>Cross Section Area</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cross Section Area</em>' attribute is set.
	 * @see #unsetCrossSectionArea()
	 * @see #getCrossSectionArea()
	 * @see #setCrossSectionArea(Double)
	 * @generated
	 */
	boolean isSetCrossSectionArea();

	/**
	 * Returns the value of the '<em><b>Nominal Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Diameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Diameter</em>' attribute.
	 * @see #isSetNominalDiameter()
	 * @see #unsetNominalDiameter()
	 * @see #setNominalDiameter(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcReinforcingBar_NominalDiameter()
	 * @model unsettable="true" dataType="IFC2X3.REAL" required="true"
	 * @generated
	 */
	Double getNominalDiameter();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcReinforcingBar#getNominalDiameter <em>Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Diameter</em>' attribute.
	 * @see #isSetNominalDiameter()
	 * @see #unsetNominalDiameter()
	 * @see #getNominalDiameter()
	 * @generated
	 */
	void setNominalDiameter(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcReinforcingBar#getNominalDiameter <em>Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNominalDiameter()
	 * @see #getNominalDiameter()
	 * @see #setNominalDiameter(Double)
	 * @generated
	 */
	void unsetNominalDiameter();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcReinforcingBar#getNominalDiameter <em>Nominal Diameter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nominal Diameter</em>' attribute is set.
	 * @see #unsetNominalDiameter()
	 * @see #getNominalDiameter()
	 * @see #setNominalDiameter(Double)
	 * @generated
	 */
	boolean isSetNominalDiameter();

} // IfcReinforcingBar
