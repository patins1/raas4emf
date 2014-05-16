/**
 */
package psets.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import psets.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PsetsFactoryImpl extends EFactoryImpl implements PsetsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PsetsFactory init() {
		try {
			PsetsFactory thePsetsFactory = (PsetsFactory)EPackage.Registry.INSTANCE.getEFactory(PsetsPackage.eNS_URI);
			if (thePsetsFactory != null) {
				return thePsetsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PsetsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsetsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PsetsPackage.IARTIFACT: return (EObject)createIArtifact();
			case PsetsPackage.IPROPERTY_SET: return (EObject)createIPropertySet();
			case PsetsPackage.IPROPERTY: return (EObject)createIProperty();
			case PsetsPackage.IPROPERTY_VALUE: return (EObject)createIPropertyValue();
			case PsetsPackage.IDEFAULT_VALUE: return (EObject)createIDefaultValue();
			case PsetsPackage.IMIN_MAX_VALUE: return (EObject)createIMinMaxValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IArtifact createIArtifact() {
		IArtifactImpl iArtifact = new IArtifactImpl();
		return iArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPropertySet createIPropertySet() {
		IPropertySetImpl iPropertySet = new IPropertySetImpl();
		return iPropertySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProperty createIProperty() {
		IPropertyImpl iProperty = new IPropertyImpl();
		return iProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPropertyValue createIPropertyValue() {
		IPropertyValueImpl iPropertyValue = new IPropertyValueImpl();
		return iPropertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDefaultValue createIDefaultValue() {
		IDefaultValueImpl iDefaultValue = new IDefaultValueImpl();
		return iDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMinMaxValue createIMinMaxValue() {
		IMinMaxValueImpl iMinMaxValue = new IMinMaxValueImpl();
		return iMinMaxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsetsPackage getPsetsPackage() {
		return (PsetsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PsetsPackage getPackage() {
		return PsetsPackage.eINSTANCE;
	}

} //PsetsFactoryImpl
