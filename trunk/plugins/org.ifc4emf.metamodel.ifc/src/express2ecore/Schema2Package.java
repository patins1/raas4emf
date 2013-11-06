/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package express2ecore;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.ifc4emf.metamodel.express.core.Schema;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema2 Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link express2ecore.Schema2Package#getSchema <em>Schema</em>}</li>
 *   <li>{@link express2ecore.Schema2Package#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see express2ecore.Express2ecorePackage#getSchema2Package()
 * @model
 * @generated
 */
public interface Schema2Package extends EObject {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' reference.
	 * @see #setSchema(Schema)
	 * @see express2ecore.Express2ecorePackage#getSchema2Package_Schema()
	 * @model
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link express2ecore.Schema2Package#getSchema <em>Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(EPackage)
	 * @see express2ecore.Express2ecorePackage#getSchema2Package_Package()
	 * @model
	 * @generated
	 */
	EPackage getPackage();

	/**
	 * Sets the value of the '{@link express2ecore.Schema2Package#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(EPackage value);

} // Schema2Package
