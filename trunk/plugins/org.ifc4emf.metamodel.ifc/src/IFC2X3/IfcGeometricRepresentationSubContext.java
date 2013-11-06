/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcGeometricRepresentationSubContextImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Geometric Representation Sub Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcGeometricRepresentationSubContext#getParentContext <em>Parent Context</em>}</li>
 *   <li>{@link IFC2X3.IfcGeometricRepresentationSubContext#getTargetScale <em>Target Scale</em>}</li>
 *   <li>{@link IFC2X3.IfcGeometricRepresentationSubContext#getTargetView <em>Target View</em>}</li>
 *   <li>{@link IFC2X3.IfcGeometricRepresentationSubContext#getUserDefinedTargetView <em>User Defined Target View</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcGeometricRepresentationSubContext()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcGeometricRepresentationSubContextImplAdapter.class)
public interface IfcGeometricRepresentationSubContext extends IfcGeometricRepresentationContext {
	/**
	 * Returns the value of the '<em><b>Parent Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcGeometricRepresentationContext#getHasSubContexts <em>Has Sub Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Context</em>' reference.
	 * @see #setParentContext(IfcGeometricRepresentationContext)
	 * @see IFC2X3.IFC2X3Package#getIfcGeometricRepresentationSubContext_ParentContext()
	 * @see IFC2X3.IfcGeometricRepresentationContext#getHasSubContexts
	 * @model opposite="HasSubContexts" required="true"
	 * @generated
	 */
	IfcGeometricRepresentationContext getParentContext();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGeometricRepresentationSubContext#getParentContext <em>Parent Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Context</em>' reference.
	 * @see #getParentContext()
	 * @generated
	 */
	void setParentContext(IfcGeometricRepresentationContext value);

	/**
	 * Returns the value of the '<em><b>User Defined Target View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Target View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Target View</em>' attribute.
	 * @see #isSetUserDefinedTargetView()
	 * @see #unsetUserDefinedTargetView()
	 * @see #setUserDefinedTargetView(String)
	 * @see IFC2X3.IFC2X3Package#getIfcGeometricRepresentationSubContext_UserDefinedTargetView()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getUserDefinedTargetView();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGeometricRepresentationSubContext#getUserDefinedTargetView <em>User Defined Target View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Target View</em>' attribute.
	 * @see #isSetUserDefinedTargetView()
	 * @see #unsetUserDefinedTargetView()
	 * @see #getUserDefinedTargetView()
	 * @generated
	 */
	void setUserDefinedTargetView(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcGeometricRepresentationSubContext#getUserDefinedTargetView <em>User Defined Target View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedTargetView()
	 * @see #getUserDefinedTargetView()
	 * @see #setUserDefinedTargetView(String)
	 * @generated
	 */
	void unsetUserDefinedTargetView();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcGeometricRepresentationSubContext#getUserDefinedTargetView <em>User Defined Target View</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Target View</em>' attribute is set.
	 * @see #unsetUserDefinedTargetView()
	 * @see #getUserDefinedTargetView()
	 * @see #setUserDefinedTargetView(String)
	 * @generated
	 */
	boolean isSetUserDefinedTargetView();

	/**
	 * Returns the value of the '<em><b>Target View</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcGeometricProjectionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target View</em>' attribute.
	 * @see IFC2X3.IfcGeometricProjectionEnum
	 * @see #isSetTargetView()
	 * @see #unsetTargetView()
	 * @see #setTargetView(IfcGeometricProjectionEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcGeometricRepresentationSubContext_TargetView()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcGeometricProjectionEnum getTargetView();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGeometricRepresentationSubContext#getTargetView <em>Target View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target View</em>' attribute.
	 * @see IFC2X3.IfcGeometricProjectionEnum
	 * @see #isSetTargetView()
	 * @see #unsetTargetView()
	 * @see #getTargetView()
	 * @generated
	 */
	void setTargetView(IfcGeometricProjectionEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcGeometricRepresentationSubContext#getTargetView <em>Target View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTargetView()
	 * @see #getTargetView()
	 * @see #setTargetView(IfcGeometricProjectionEnum)
	 * @generated
	 */
	void unsetTargetView();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcGeometricRepresentationSubContext#getTargetView <em>Target View</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target View</em>' attribute is set.
	 * @see #unsetTargetView()
	 * @see #getTargetView()
	 * @see #setTargetView(IfcGeometricProjectionEnum)
	 * @generated
	 */
	boolean isSetTargetView();

	/**
	 * Returns the value of the '<em><b>Target Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Scale</em>' attribute.
	 * @see #isSetTargetScale()
	 * @see #unsetTargetScale()
	 * @see #setTargetScale(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcGeometricRepresentationSubContext_TargetScale()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getTargetScale();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcGeometricRepresentationSubContext#getTargetScale <em>Target Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Scale</em>' attribute.
	 * @see #isSetTargetScale()
	 * @see #unsetTargetScale()
	 * @see #getTargetScale()
	 * @generated
	 */
	void setTargetScale(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcGeometricRepresentationSubContext#getTargetScale <em>Target Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTargetScale()
	 * @see #getTargetScale()
	 * @see #setTargetScale(Double)
	 * @generated
	 */
	void unsetTargetScale();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcGeometricRepresentationSubContext#getTargetScale <em>Target Scale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target Scale</em>' attribute is set.
	 * @see #unsetTargetScale()
	 * @see #getTargetScale()
	 * @see #setTargetScale(Double)
	 * @generated
	 */
	boolean isSetTargetScale();

} // IfcGeometricRepresentationSubContext
