/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package express2ecore.impl;

import express2ecore.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Express2ecoreFactoryImpl extends EFactoryImpl implements Express2ecoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Express2ecoreFactory init() {
		try {
			Express2ecoreFactory theExpress2ecoreFactory = (Express2ecoreFactory)EPackage.Registry.INSTANCE.getEFactory(Express2ecorePackage.eNS_URI);
			if (theExpress2ecoreFactory != null) {
				return theExpress2ecoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Express2ecoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Express2ecoreFactoryImpl() {
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
			case Express2ecorePackage.TYPE_MAP: return createTypeMap();
			case Express2ecorePackage.ENTITY2_CLASS: return createEntity2Class();
			case Express2ecorePackage.SCHEMA2_PACKAGE: return createSchema2Package();
			case Express2ecorePackage.ATTRIBUTE2_FEATURE: return createAttribute2Feature();
			case Express2ecorePackage.ATTRIBUTE2_REFERENCE: return createAttribute2Reference();
			case Express2ecorePackage.ATTRIBUTE2_ATTRIBUTE: return createAttribute2Attribute();
			case Express2ecorePackage.ENTITY_SELECT: return createEntitySelect();
			case Express2ecorePackage.NON_ENTITY_SELECT: return createNonEntitySelect();
			case Express2ecorePackage.SELECT_MEMBER2_FEATURE: return createSelectMember2Feature();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMap createTypeMap() {
		TypeMapImpl typeMap = new TypeMapImpl();
		return typeMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity2Class createEntity2Class() {
		Entity2ClassImpl entity2Class = new Entity2ClassImpl();
		return entity2Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema2Package createSchema2Package() {
		Schema2PackageImpl schema2Package = new Schema2PackageImpl();
		return schema2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute2Feature createAttribute2Feature() {
		Attribute2FeatureImpl attribute2Feature = new Attribute2FeatureImpl();
		return attribute2Feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute2Reference createAttribute2Reference() {
		Attribute2ReferenceImpl attribute2Reference = new Attribute2ReferenceImpl();
		return attribute2Reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute2Attribute createAttribute2Attribute() {
		Attribute2AttributeImpl attribute2Attribute = new Attribute2AttributeImpl();
		return attribute2Attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitySelect createEntitySelect() {
		EntitySelectImpl entitySelect = new EntitySelectImpl();
		return entitySelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonEntitySelect createNonEntitySelect() {
		NonEntitySelectImpl nonEntitySelect = new NonEntitySelectImpl();
		return nonEntitySelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectMember2Feature createSelectMember2Feature() {
		SelectMember2FeatureImpl selectMember2Feature = new SelectMember2FeatureImpl();
		return selectMember2Feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Express2ecorePackage getExpress2ecorePackage() {
		return (Express2ecorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Express2ecorePackage getPackage() {
		return Express2ecorePackage.eINSTANCE;
	}

} //Express2ecoreFactoryImpl
