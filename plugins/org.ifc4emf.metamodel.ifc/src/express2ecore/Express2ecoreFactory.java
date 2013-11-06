/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package express2ecore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see express2ecore.Express2ecorePackage
 * @generated
 */
public interface Express2ecoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Express2ecoreFactory eINSTANCE = express2ecore.impl.Express2ecoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Type Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Map</em>'.
	 * @generated
	 */
	TypeMap createTypeMap();

	/**
	 * Returns a new object of class '<em>Entity2 Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity2 Class</em>'.
	 * @generated
	 */
	Entity2Class createEntity2Class();

	/**
	 * Returns a new object of class '<em>Schema2 Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema2 Package</em>'.
	 * @generated
	 */
	Schema2Package createSchema2Package();

	/**
	 * Returns a new object of class '<em>Attribute2 Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute2 Feature</em>'.
	 * @generated
	 */
	Attribute2Feature createAttribute2Feature();

	/**
	 * Returns a new object of class '<em>Attribute2 Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute2 Reference</em>'.
	 * @generated
	 */
	Attribute2Reference createAttribute2Reference();

	/**
	 * Returns a new object of class '<em>Attribute2 Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute2 Attribute</em>'.
	 * @generated
	 */
	Attribute2Attribute createAttribute2Attribute();

	/**
	 * Returns a new object of class '<em>Entity Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Select</em>'.
	 * @generated
	 */
	EntitySelect createEntitySelect();

	/**
	 * Returns a new object of class '<em>Non Entity Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Entity Select</em>'.
	 * @generated
	 */
	NonEntitySelect createNonEntitySelect();

	/**
	 * Returns a new object of class '<em>Select Member2 Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Member2 Feature</em>'.
	 * @generated
	 */
	SelectMember2Feature createSelectMember2Feature();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Express2ecorePackage getExpress2ecorePackage();

} //Express2ecoreFactory
