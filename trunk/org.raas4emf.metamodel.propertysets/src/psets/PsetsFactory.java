/**
 */
package psets;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see psets.PsetsPackage
 * @generated
 */
public interface PsetsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PsetsFactory eINSTANCE = psets.impl.PsetsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>IArtifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IArtifact</em>'.
	 * @generated
	 */
	IArtifact createIArtifact();

	/**
	 * Returns a new object of class '<em>IProperty Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IProperty Set</em>'.
	 * @generated
	 */
	IPropertySet createIPropertySet();

	/**
	 * Returns a new object of class '<em>IProperty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IProperty</em>'.
	 * @generated
	 */
	IProperty createIProperty();

	/**
	 * Returns a new object of class '<em>IProperty Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IProperty Value</em>'.
	 * @generated
	 */
	IPropertyValue createIPropertyValue();

	/**
	 * Returns a new object of class '<em>IDefault Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IDefault Value</em>'.
	 * @generated
	 */
	IDefaultValue createIDefaultValue();

	/**
	 * Returns a new object of class '<em>IMin Max Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IMin Max Value</em>'.
	 * @generated
	 */
	IMinMaxValue createIMinMaxValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PsetsPackage getPsetsPackage();

} //PsetsFactory
