/**
 */
package org.eclipse.jqvt.jQVT.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jqvt.jQVT.Direction;
import org.eclipse.jqvt.jQVT.JQVTPackage;
import org.eclipse.jqvt.jQVT.Query;
import org.eclipse.jqvt.jQVT.Relation;
import org.eclipse.jqvt.jQVT.Transformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.jqvt.jQVT.impl.TransformationImpl#getTransformationName <em>Transformation Name</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.impl.TransformationImpl#getDirections <em>Directions</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.impl.TransformationImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.impl.TransformationImpl#getQueries <em>Queries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationImpl extends MinimalEObjectImpl.Container implements Transformation
{
  /**
   * The default value of the '{@link #getTransformationName() <em>Transformation Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransformationName()
   * @generated
   * @ordered
   */
  protected static final String TRANSFORMATION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTransformationName() <em>Transformation Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransformationName()
   * @generated
   * @ordered
   */
  protected String transformationName = TRANSFORMATION_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDirections() <em>Directions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirections()
   * @generated
   * @ordered
   */
  protected EList<Direction> directions;

  /**
   * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected EList<Relation> rules;

  /**
   * The cached value of the '{@link #getQueries() <em>Queries</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueries()
   * @generated
   * @ordered
   */
  protected EList<Query> queries;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransformationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JQVTPackage.Literals.TRANSFORMATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTransformationName()
  {
    return transformationName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransformationName(String newTransformationName)
  {
    String oldTransformationName = transformationName;
    transformationName = newTransformationName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JQVTPackage.TRANSFORMATION__TRANSFORMATION_NAME, oldTransformationName, transformationName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Direction> getDirections()
  {
    if (directions == null)
    {
      directions = new EObjectContainmentEList<Direction>(Direction.class, this, JQVTPackage.TRANSFORMATION__DIRECTIONS);
    }
    return directions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Relation> getRules()
  {
    if (rules == null)
    {
      rules = new EObjectContainmentEList<Relation>(Relation.class, this, JQVTPackage.TRANSFORMATION__RULES);
    }
    return rules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Query> getQueries()
  {
    if (queries == null)
    {
      queries = new EObjectContainmentEList<Query>(Query.class, this, JQVTPackage.TRANSFORMATION__QUERIES);
    }
    return queries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JQVTPackage.TRANSFORMATION__DIRECTIONS:
        return ((InternalEList<?>)getDirections()).basicRemove(otherEnd, msgs);
      case JQVTPackage.TRANSFORMATION__RULES:
        return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
      case JQVTPackage.TRANSFORMATION__QUERIES:
        return ((InternalEList<?>)getQueries()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JQVTPackage.TRANSFORMATION__TRANSFORMATION_NAME:
        return getTransformationName();
      case JQVTPackage.TRANSFORMATION__DIRECTIONS:
        return getDirections();
      case JQVTPackage.TRANSFORMATION__RULES:
        return getRules();
      case JQVTPackage.TRANSFORMATION__QUERIES:
        return getQueries();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JQVTPackage.TRANSFORMATION__TRANSFORMATION_NAME:
        setTransformationName((String)newValue);
        return;
      case JQVTPackage.TRANSFORMATION__DIRECTIONS:
        getDirections().clear();
        getDirections().addAll((Collection<? extends Direction>)newValue);
        return;
      case JQVTPackage.TRANSFORMATION__RULES:
        getRules().clear();
        getRules().addAll((Collection<? extends Relation>)newValue);
        return;
      case JQVTPackage.TRANSFORMATION__QUERIES:
        getQueries().clear();
        getQueries().addAll((Collection<? extends Query>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JQVTPackage.TRANSFORMATION__TRANSFORMATION_NAME:
        setTransformationName(TRANSFORMATION_NAME_EDEFAULT);
        return;
      case JQVTPackage.TRANSFORMATION__DIRECTIONS:
        getDirections().clear();
        return;
      case JQVTPackage.TRANSFORMATION__RULES:
        getRules().clear();
        return;
      case JQVTPackage.TRANSFORMATION__QUERIES:
        getQueries().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JQVTPackage.TRANSFORMATION__TRANSFORMATION_NAME:
        return TRANSFORMATION_NAME_EDEFAULT == null ? transformationName != null : !TRANSFORMATION_NAME_EDEFAULT.equals(transformationName);
      case JQVTPackage.TRANSFORMATION__DIRECTIONS:
        return directions != null && !directions.isEmpty();
      case JQVTPackage.TRANSFORMATION__RULES:
        return rules != null && !rules.isEmpty();
      case JQVTPackage.TRANSFORMATION__QUERIES:
        return queries != null && !queries.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (transformationName: ");
    result.append(transformationName);
    result.append(')');
    return result.toString();
  }

} //TransformationImpl
