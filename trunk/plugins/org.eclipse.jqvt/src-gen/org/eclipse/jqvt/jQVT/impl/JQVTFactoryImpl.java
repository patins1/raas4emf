/**
 */
package org.eclipse.jqvt.jQVT.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.jqvt.jQVT.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JQVTFactoryImpl extends EFactoryImpl implements JQVTFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JQVTFactory init()
  {
    try
    {
      JQVTFactory theJQVTFactory = (JQVTFactory)EPackage.Registry.INSTANCE.getEFactory(JQVTPackage.eNS_URI);
      if (theJQVTFactory != null)
      {
        return theJQVTFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JQVTFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JQVTFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JQVTPackage.PACKAGE_DECLARATION: return createPackageDeclaration();
      case JQVTPackage.IMPORT: return createImport();
      case JQVTPackage.TRANSFORMATION: return createTransformation();
      case JQVTPackage.QUERY: return createQuery();
      case JQVTPackage.DIRECTION: return createDirection();
      case JQVTPackage.RELATION: return createRelation();
      case JQVTPackage.RELATION_DOMAIN: return createRelationDomain();
      case JQVTPackage.PROPERTY_TEMPLATE_ITEM: return createPropertyTemplateItem();
      case JQVTPackage.OBJECT_TEMPLATE: return createObjectTemplate();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transformation createTransformation()
  {
    TransformationImpl transformation = new TransformationImpl();
    return transformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query createQuery()
  {
    QueryImpl query = new QueryImpl();
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Direction createDirection()
  {
    DirectionImpl direction = new DirectionImpl();
    return direction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relation createRelation()
  {
    RelationImpl relation = new RelationImpl();
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationDomain createRelationDomain()
  {
    RelationDomainImpl relationDomain = new RelationDomainImpl();
    return relationDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyTemplateItem createPropertyTemplateItem()
  {
    PropertyTemplateItemImpl propertyTemplateItem = new PropertyTemplateItemImpl();
    return propertyTemplateItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectTemplate createObjectTemplate()
  {
    ObjectTemplateImpl objectTemplate = new ObjectTemplateImpl();
    return objectTemplate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JQVTPackage getJQVTPackage()
  {
    return (JQVTPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JQVTPackage getPackage()
  {
    return JQVTPackage.eINSTANCE;
  }

} //JQVTFactoryImpl
