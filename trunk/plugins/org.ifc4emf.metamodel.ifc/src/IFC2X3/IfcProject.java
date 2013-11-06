/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcProjectImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcProject#getLongName <em>Long Name</em>}</li>
 *   <li>{@link IFC2X3.IfcProject#getPhase <em>Phase</em>}</li>
 *   <li>{@link IFC2X3.IfcProject#getRepresentationContexts <em>Representation Contexts</em>}</li>
 *   <li>{@link IFC2X3.IfcProject#getUnitsInContext <em>Units In Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcProject()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcProjectImplAdapter.class)
public interface IfcProject extends IfcObject {
	/**
	 * Returns the value of the '<em><b>Representation Contexts</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcRepresentationContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation Contexts</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcProject_RepresentationContexts()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<IfcRepresentationContext> getRepresentationContexts();

	/**
	 * Returns the value of the '<em><b>Units In Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units In Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units In Context</em>' reference.
	 * @see #setUnitsInContext(IfcUnitAssignment)
	 * @see IFC2X3.IFC2X3Package#getIfcProject_UnitsInContext()
	 * @model required="true"
	 * @generated
	 */
	IfcUnitAssignment getUnitsInContext();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcProject#getUnitsInContext <em>Units In Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units In Context</em>' reference.
	 * @see #getUnitsInContext()
	 * @generated
	 */
	void setUnitsInContext(IfcUnitAssignment value);

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' attribute.
	 * @see #isSetPhase()
	 * @see #unsetPhase()
	 * @see #setPhase(String)
	 * @see IFC2X3.IFC2X3Package#getIfcProject_Phase()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getPhase();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcProject#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' attribute.
	 * @see #isSetPhase()
	 * @see #unsetPhase()
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcProject#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhase()
	 * @see #getPhase()
	 * @see #setPhase(String)
	 * @generated
	 */
	void unsetPhase();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcProject#getPhase <em>Phase</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase</em>' attribute is set.
	 * @see #unsetPhase()
	 * @see #getPhase()
	 * @see #setPhase(String)
	 * @generated
	 */
	boolean isSetPhase();

	/**
	 * Returns the value of the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Name</em>' attribute.
	 * @see #isSetLongName()
	 * @see #unsetLongName()
	 * @see #setLongName(String)
	 * @see IFC2X3.IFC2X3Package#getIfcProject_LongName()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getLongName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcProject#getLongName <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Name</em>' attribute.
	 * @see #isSetLongName()
	 * @see #unsetLongName()
	 * @see #getLongName()
	 * @generated
	 */
	void setLongName(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcProject#getLongName <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLongName()
	 * @see #getLongName()
	 * @see #setLongName(String)
	 * @generated
	 */
	void unsetLongName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcProject#getLongName <em>Long Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Long Name</em>' attribute is set.
	 * @see #unsetLongName()
	 * @see #getLongName()
	 * @see #setLongName(String)
	 * @generated
	 */
	boolean isSetLongName();

} // IfcProject
