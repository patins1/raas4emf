/**
 */
package org.eclipse.jqvt.jQVT;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.jqvt.jQVT.JQVTFactory
 * @model kind="package"
 * @generated
 */
public interface JQVTPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jQVT";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/jqvt/JQVT";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "jQVT";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JQVTPackage eINSTANCE = org.eclipse.jqvt.jQVT.impl.JQVTPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.jqvt.jQVT.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.jqvt.jQVT.impl.PackageDeclarationImpl
   * @see org.eclipse.jqvt.jQVT.impl.JQVTPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__IMPORT_SECTION = 1;

  /**
   * The feature id for the '<em><b>Transformation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__TRANSFORMATION = 2;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.jqvt.jQVT.impl.TransformationImpl <em>Transformation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.jqvt.jQVT.impl.TransformationImpl
   * @see org.eclipse.jqvt.jQVT.impl.JQVTPackageImpl#getTransformation()
   * @generated
   */
  int TRANSFORMATION = 1;

  /**
   * The feature id for the '<em><b>Transformation Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__TRANSFORMATION_NAME = 0;

  /**
   * The feature id for the '<em><b>Directions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__DIRECTIONS = 1;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__RULES = 2;

  /**
   * The feature id for the '<em><b>Queries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__QUERIES = 3;

  /**
   * The number of structural features of the '<em>Transformation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.jqvt.jQVT.impl.QueryImpl <em>Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.jqvt.jQVT.impl.QueryImpl
   * @see org.eclipse.jqvt.jQVT.impl.JQVTPackageImpl#getQuery()
   * @generated
   */
  int QUERY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__TYPE = 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__BODY = 3;

  /**
   * The number of structural features of the '<em>Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.jqvt.jQVT.impl.DirectionImpl <em>Direction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.jqvt.jQVT.impl.DirectionImpl
   * @see org.eclipse.jqvt.jQVT.impl.JQVTPackageImpl#getDirection()
   * @generated
   */
  int DIRECTION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Imp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTION__IMP = 1;

  /**
   * The number of structural features of the '<em>Direction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.jqvt.jQVT.impl.RelationImpl <em>Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.jqvt.jQVT.impl.RelationImpl
   * @see org.eclipse.jqvt.jQVT.impl.JQVTPackageImpl#getRelation()
   * @generated
   */
  int RELATION = 4;

  /**
   * The feature id for the '<em><b>Top Relation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__TOP_RELATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Vars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__VARS = 2;

  /**
   * The feature id for the '<em><b>Domains</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__DOMAINS = 3;

  /**
   * The feature id for the '<em><b>When</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__WHEN = 4;

  /**
   * The feature id for the '<em><b>Where</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__WHERE = 5;

  /**
   * The number of structural features of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.eclipse.jqvt.jQVT.impl.RelationDomainImpl <em>Relation Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.jqvt.jQVT.impl.RelationDomainImpl
   * @see org.eclipse.jqvt.jQVT.impl.JQVTPackageImpl#getRelationDomain()
   * @generated
   */
  int RELATION_DOMAIN = 5;

  /**
   * The feature id for the '<em><b>Direction</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_DOMAIN__DIRECTION = 0;

  /**
   * The feature id for the '<em><b>Root Template</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_DOMAIN__ROOT_TEMPLATE = 1;

  /**
   * The number of structural features of the '<em>Relation Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_DOMAIN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.jqvt.jQVT.impl.PropertyTemplateItemImpl <em>Property Template Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.jqvt.jQVT.impl.PropertyTemplateItemImpl
   * @see org.eclipse.jqvt.jQVT.impl.JQVTPackageImpl#getPropertyTemplateItem()
   * @generated
   */
  int PROPERTY_TEMPLATE_ITEM = 6;

  /**
   * The feature id for the '<em><b>Referred Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_TEMPLATE_ITEM__REFERRED_PROPERTY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_TEMPLATE_ITEM__VALUE = 1;

  /**
   * The number of structural features of the '<em>Property Template Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_TEMPLATE_ITEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.jqvt.jQVT.impl.ObjectTemplateImpl <em>Object Template</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.jqvt.jQVT.impl.ObjectTemplateImpl
   * @see org.eclipse.jqvt.jQVT.impl.JQVTPackageImpl#getObjectTemplate()
   * @generated
   */
  int OBJECT_TEMPLATE = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPLATE__TYPE = XbasePackage.XVARIABLE_DECLARATION__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPLATE__NAME = XbasePackage.XVARIABLE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPLATE__RIGHT = XbasePackage.XVARIABLE_DECLARATION__RIGHT;

  /**
   * The feature id for the '<em><b>Writeable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPLATE__WRITEABLE = XbasePackage.XVARIABLE_DECLARATION__WRITEABLE;

  /**
   * The feature id for the '<em><b>Part</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPLATE__PART = XbasePackage.XVARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object Template</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPLATE_FEATURE_COUNT = XbasePackage.XVARIABLE_DECLARATION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.eclipse.jqvt.jQVT.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see org.eclipse.jqvt.jQVT.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.jqvt.jQVT.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.jqvt.jQVT.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.jqvt.jQVT.PackageDeclaration#getImportSection <em>Import Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import Section</em>'.
   * @see org.eclipse.jqvt.jQVT.PackageDeclaration#getImportSection()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_ImportSection();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.jqvt.jQVT.PackageDeclaration#getTransformation <em>Transformation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Transformation</em>'.
   * @see org.eclipse.jqvt.jQVT.PackageDeclaration#getTransformation()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_Transformation();

  /**
   * Returns the meta object for class '{@link org.eclipse.jqvt.jQVT.Transformation <em>Transformation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transformation</em>'.
   * @see org.eclipse.jqvt.jQVT.Transformation
   * @generated
   */
  EClass getTransformation();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.jqvt.jQVT.Transformation#getTransformationName <em>Transformation Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Transformation Name</em>'.
   * @see org.eclipse.jqvt.jQVT.Transformation#getTransformationName()
   * @see #getTransformation()
   * @generated
   */
  EAttribute getTransformation_TransformationName();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.jqvt.jQVT.Transformation#getDirections <em>Directions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Directions</em>'.
   * @see org.eclipse.jqvt.jQVT.Transformation#getDirections()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_Directions();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.jqvt.jQVT.Transformation#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see org.eclipse.jqvt.jQVT.Transformation#getRules()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_Rules();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.jqvt.jQVT.Transformation#getQueries <em>Queries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Queries</em>'.
   * @see org.eclipse.jqvt.jQVT.Transformation#getQueries()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_Queries();

  /**
   * Returns the meta object for class '{@link org.eclipse.jqvt.jQVT.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query</em>'.
   * @see org.eclipse.jqvt.jQVT.Query
   * @generated
   */
  EClass getQuery();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.jqvt.jQVT.Query#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.jqvt.jQVT.Query#getName()
   * @see #getQuery()
   * @generated
   */
  EAttribute getQuery_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.jqvt.jQVT.Query#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.eclipse.jqvt.jQVT.Query#getParams()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.jqvt.jQVT.Query#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipse.jqvt.jQVT.Query#getType()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.jqvt.jQVT.Query#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.eclipse.jqvt.jQVT.Query#getBody()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Body();

  /**
   * Returns the meta object for class '{@link org.eclipse.jqvt.jQVT.Direction <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Direction</em>'.
   * @see org.eclipse.jqvt.jQVT.Direction
   * @generated
   */
  EClass getDirection();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.jqvt.jQVT.Direction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.jqvt.jQVT.Direction#getName()
   * @see #getDirection()
   * @generated
   */
  EAttribute getDirection_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.jqvt.jQVT.Direction#getImp <em>Imp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imp</em>'.
   * @see org.eclipse.jqvt.jQVT.Direction#getImp()
   * @see #getDirection()
   * @generated
   */
  EAttribute getDirection_Imp();

  /**
   * Returns the meta object for class '{@link org.eclipse.jqvt.jQVT.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation</em>'.
   * @see org.eclipse.jqvt.jQVT.Relation
   * @generated
   */
  EClass getRelation();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.jqvt.jQVT.Relation#isTopRelation <em>Top Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Top Relation</em>'.
   * @see org.eclipse.jqvt.jQVT.Relation#isTopRelation()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_TopRelation();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.jqvt.jQVT.Relation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.jqvt.jQVT.Relation#getName()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.jqvt.jQVT.Relation#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vars</em>'.
   * @see org.eclipse.jqvt.jQVT.Relation#getVars()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Vars();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.jqvt.jQVT.Relation#getDomains <em>Domains</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Domains</em>'.
   * @see org.eclipse.jqvt.jQVT.Relation#getDomains()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Domains();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.jqvt.jQVT.Relation#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>When</em>'.
   * @see org.eclipse.jqvt.jQVT.Relation#getWhen()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_When();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.jqvt.jQVT.Relation#getWhere <em>Where</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Where</em>'.
   * @see org.eclipse.jqvt.jQVT.Relation#getWhere()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Where();

  /**
   * Returns the meta object for class '{@link org.eclipse.jqvt.jQVT.RelationDomain <em>Relation Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Domain</em>'.
   * @see org.eclipse.jqvt.jQVT.RelationDomain
   * @generated
   */
  EClass getRelationDomain();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.jqvt.jQVT.RelationDomain#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Direction</em>'.
   * @see org.eclipse.jqvt.jQVT.RelationDomain#getDirection()
   * @see #getRelationDomain()
   * @generated
   */
  EReference getRelationDomain_Direction();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.jqvt.jQVT.RelationDomain#getRootTemplate <em>Root Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root Template</em>'.
   * @see org.eclipse.jqvt.jQVT.RelationDomain#getRootTemplate()
   * @see #getRelationDomain()
   * @generated
   */
  EReference getRelationDomain_RootTemplate();

  /**
   * Returns the meta object for class '{@link org.eclipse.jqvt.jQVT.PropertyTemplateItem <em>Property Template Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Template Item</em>'.
   * @see org.eclipse.jqvt.jQVT.PropertyTemplateItem
   * @generated
   */
  EClass getPropertyTemplateItem();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.jqvt.jQVT.PropertyTemplateItem#getReferredProperty <em>Referred Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Referred Property</em>'.
   * @see org.eclipse.jqvt.jQVT.PropertyTemplateItem#getReferredProperty()
   * @see #getPropertyTemplateItem()
   * @generated
   */
  EReference getPropertyTemplateItem_ReferredProperty();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.jqvt.jQVT.PropertyTemplateItem#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipse.jqvt.jQVT.PropertyTemplateItem#getValue()
   * @see #getPropertyTemplateItem()
   * @generated
   */
  EReference getPropertyTemplateItem_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.jqvt.jQVT.ObjectTemplate <em>Object Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Template</em>'.
   * @see org.eclipse.jqvt.jQVT.ObjectTemplate
   * @generated
   */
  EClass getObjectTemplate();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.jqvt.jQVT.ObjectTemplate#getPart <em>Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Part</em>'.
   * @see org.eclipse.jqvt.jQVT.ObjectTemplate#getPart()
   * @see #getObjectTemplate()
   * @generated
   */
  EReference getObjectTemplate_Part();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JQVTFactory getJQVTFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.jqvt.jQVT.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.jqvt.jQVT.impl.PackageDeclarationImpl
     * @see org.eclipse.jqvt.jQVT.impl.JQVTPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getPackageDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Import Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__IMPORT_SECTION = eINSTANCE.getPackageDeclaration_ImportSection();

    /**
     * The meta object literal for the '<em><b>Transformation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__TRANSFORMATION = eINSTANCE.getPackageDeclaration_Transformation();

    /**
     * The meta object literal for the '{@link org.eclipse.jqvt.jQVT.impl.TransformationImpl <em>Transformation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.jqvt.jQVT.impl.TransformationImpl
     * @see org.eclipse.jqvt.jQVT.impl.JQVTPackageImpl#getTransformation()
     * @generated
     */
    EClass TRANSFORMATION = eINSTANCE.getTransformation();

    /**
     * The meta object literal for the '<em><b>Transformation Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSFORMATION__TRANSFORMATION_NAME = eINSTANCE.getTransformation_TransformationName();

    /**
     * The meta object literal for the '<em><b>Directions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION__DIRECTIONS = eINSTANCE.getTransformation_Directions();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION__RULES = eINSTANCE.getTransformation_Rules();

    /**
     * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION__QUERIES = eINSTANCE.getTransformation_Queries();

    /**
     * The meta object literal for the '{@link org.eclipse.jqvt.jQVT.impl.QueryImpl <em>Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.jqvt.jQVT.impl.QueryImpl
     * @see org.eclipse.jqvt.jQVT.impl.JQVTPackageImpl#getQuery()
     * @generated
     */
    EClass QUERY = eINSTANCE.getQuery();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUERY__NAME = eINSTANCE.getQuery_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__PARAMS = eINSTANCE.getQuery_Params();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__TYPE = eINSTANCE.getQuery_Type();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__BODY = eINSTANCE.getQuery_Body();

    /**
     * The meta object literal for the '{@link org.eclipse.jqvt.jQVT.impl.DirectionImpl <em>Direction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.jqvt.jQVT.impl.DirectionImpl
     * @see org.eclipse.jqvt.jQVT.impl.JQVTPackageImpl#getDirection()
     * @generated
     */
    EClass DIRECTION = eINSTANCE.getDirection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIRECTION__NAME = eINSTANCE.getDirection_Name();

    /**
     * The meta object literal for the '<em><b>Imp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIRECTION__IMP = eINSTANCE.getDirection_Imp();

    /**
     * The meta object literal for the '{@link org.eclipse.jqvt.jQVT.impl.RelationImpl <em>Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.jqvt.jQVT.impl.RelationImpl
     * @see org.eclipse.jqvt.jQVT.impl.JQVTPackageImpl#getRelation()
     * @generated
     */
    EClass RELATION = eINSTANCE.getRelation();

    /**
     * The meta object literal for the '<em><b>Top Relation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__TOP_RELATION = eINSTANCE.getRelation_TopRelation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__NAME = eINSTANCE.getRelation_Name();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__VARS = eINSTANCE.getRelation_Vars();

    /**
     * The meta object literal for the '<em><b>Domains</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__DOMAINS = eINSTANCE.getRelation_Domains();

    /**
     * The meta object literal for the '<em><b>When</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__WHEN = eINSTANCE.getRelation_When();

    /**
     * The meta object literal for the '<em><b>Where</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__WHERE = eINSTANCE.getRelation_Where();

    /**
     * The meta object literal for the '{@link org.eclipse.jqvt.jQVT.impl.RelationDomainImpl <em>Relation Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.jqvt.jQVT.impl.RelationDomainImpl
     * @see org.eclipse.jqvt.jQVT.impl.JQVTPackageImpl#getRelationDomain()
     * @generated
     */
    EClass RELATION_DOMAIN = eINSTANCE.getRelationDomain();

    /**
     * The meta object literal for the '<em><b>Direction</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION_DOMAIN__DIRECTION = eINSTANCE.getRelationDomain_Direction();

    /**
     * The meta object literal for the '<em><b>Root Template</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION_DOMAIN__ROOT_TEMPLATE = eINSTANCE.getRelationDomain_RootTemplate();

    /**
     * The meta object literal for the '{@link org.eclipse.jqvt.jQVT.impl.PropertyTemplateItemImpl <em>Property Template Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.jqvt.jQVT.impl.PropertyTemplateItemImpl
     * @see org.eclipse.jqvt.jQVT.impl.JQVTPackageImpl#getPropertyTemplateItem()
     * @generated
     */
    EClass PROPERTY_TEMPLATE_ITEM = eINSTANCE.getPropertyTemplateItem();

    /**
     * The meta object literal for the '<em><b>Referred Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_TEMPLATE_ITEM__REFERRED_PROPERTY = eINSTANCE.getPropertyTemplateItem_ReferredProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_TEMPLATE_ITEM__VALUE = eINSTANCE.getPropertyTemplateItem_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.jqvt.jQVT.impl.ObjectTemplateImpl <em>Object Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.jqvt.jQVT.impl.ObjectTemplateImpl
     * @see org.eclipse.jqvt.jQVT.impl.JQVTPackageImpl#getObjectTemplate()
     * @generated
     */
    EClass OBJECT_TEMPLATE = eINSTANCE.getObjectTemplate();

    /**
     * The meta object literal for the '<em><b>Part</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_TEMPLATE__PART = eINSTANCE.getObjectTemplate_Part();

  }

} //JQVTPackage
