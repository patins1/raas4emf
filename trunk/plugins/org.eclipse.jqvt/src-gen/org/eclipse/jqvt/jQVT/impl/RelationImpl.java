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

import org.eclipse.jqvt.jQVT.JQVTPackage;
import org.eclipse.jqvt.jQVT.Relation;
import org.eclipse.jqvt.jQVT.RelationDomain;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.jqvt.jQVT.impl.RelationImpl#isTopRelation <em>Top Relation</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.impl.RelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.impl.RelationImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.impl.RelationImpl#getDomains <em>Domains</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.impl.RelationImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.impl.RelationImpl#getWhere <em>Where</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationImpl extends MinimalEObjectImpl.Container implements Relation
{
  /**
   * The default value of the '{@link #isTopRelation() <em>Top Relation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTopRelation()
   * @generated
   * @ordered
   */
  protected static final boolean TOP_RELATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTopRelation() <em>Top Relation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTopRelation()
   * @generated
   * @ordered
   */
  protected boolean topRelation = TOP_RELATION_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getVars() <em>Vars</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected EList<XVariableDeclaration> vars;

  /**
   * The cached value of the '{@link #getDomains() <em>Domains</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomains()
   * @generated
   * @ordered
   */
  protected EList<RelationDomain> domains;

  /**
   * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhen()
   * @generated
   * @ordered
   */
  protected EList<XExpression> when;

  /**
   * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhere()
   * @generated
   * @ordered
   */
  protected EList<XExpression> where;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationImpl()
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
    return JQVTPackage.Literals.RELATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTopRelation()
  {
    return topRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTopRelation(boolean newTopRelation)
  {
    boolean oldTopRelation = topRelation;
    topRelation = newTopRelation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JQVTPackage.RELATION__TOP_RELATION, oldTopRelation, topRelation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JQVTPackage.RELATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XVariableDeclaration> getVars()
  {
    if (vars == null)
    {
      vars = new EObjectContainmentEList<XVariableDeclaration>(XVariableDeclaration.class, this, JQVTPackage.RELATION__VARS);
    }
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RelationDomain> getDomains()
  {
    if (domains == null)
    {
      domains = new EObjectContainmentEList<RelationDomain>(RelationDomain.class, this, JQVTPackage.RELATION__DOMAINS);
    }
    return domains;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XExpression> getWhen()
  {
    if (when == null)
    {
      when = new EObjectContainmentEList<XExpression>(XExpression.class, this, JQVTPackage.RELATION__WHEN);
    }
    return when;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XExpression> getWhere()
  {
    if (where == null)
    {
      where = new EObjectContainmentEList<XExpression>(XExpression.class, this, JQVTPackage.RELATION__WHERE);
    }
    return where;
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
      case JQVTPackage.RELATION__VARS:
        return ((InternalEList<?>)getVars()).basicRemove(otherEnd, msgs);
      case JQVTPackage.RELATION__DOMAINS:
        return ((InternalEList<?>)getDomains()).basicRemove(otherEnd, msgs);
      case JQVTPackage.RELATION__WHEN:
        return ((InternalEList<?>)getWhen()).basicRemove(otherEnd, msgs);
      case JQVTPackage.RELATION__WHERE:
        return ((InternalEList<?>)getWhere()).basicRemove(otherEnd, msgs);
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
      case JQVTPackage.RELATION__TOP_RELATION:
        return isTopRelation();
      case JQVTPackage.RELATION__NAME:
        return getName();
      case JQVTPackage.RELATION__VARS:
        return getVars();
      case JQVTPackage.RELATION__DOMAINS:
        return getDomains();
      case JQVTPackage.RELATION__WHEN:
        return getWhen();
      case JQVTPackage.RELATION__WHERE:
        return getWhere();
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
      case JQVTPackage.RELATION__TOP_RELATION:
        setTopRelation((Boolean)newValue);
        return;
      case JQVTPackage.RELATION__NAME:
        setName((String)newValue);
        return;
      case JQVTPackage.RELATION__VARS:
        getVars().clear();
        getVars().addAll((Collection<? extends XVariableDeclaration>)newValue);
        return;
      case JQVTPackage.RELATION__DOMAINS:
        getDomains().clear();
        getDomains().addAll((Collection<? extends RelationDomain>)newValue);
        return;
      case JQVTPackage.RELATION__WHEN:
        getWhen().clear();
        getWhen().addAll((Collection<? extends XExpression>)newValue);
        return;
      case JQVTPackage.RELATION__WHERE:
        getWhere().clear();
        getWhere().addAll((Collection<? extends XExpression>)newValue);
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
      case JQVTPackage.RELATION__TOP_RELATION:
        setTopRelation(TOP_RELATION_EDEFAULT);
        return;
      case JQVTPackage.RELATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case JQVTPackage.RELATION__VARS:
        getVars().clear();
        return;
      case JQVTPackage.RELATION__DOMAINS:
        getDomains().clear();
        return;
      case JQVTPackage.RELATION__WHEN:
        getWhen().clear();
        return;
      case JQVTPackage.RELATION__WHERE:
        getWhere().clear();
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
      case JQVTPackage.RELATION__TOP_RELATION:
        return topRelation != TOP_RELATION_EDEFAULT;
      case JQVTPackage.RELATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case JQVTPackage.RELATION__VARS:
        return vars != null && !vars.isEmpty();
      case JQVTPackage.RELATION__DOMAINS:
        return domains != null && !domains.isEmpty();
      case JQVTPackage.RELATION__WHEN:
        return when != null && !when.isEmpty();
      case JQVTPackage.RELATION__WHERE:
        return where != null && !where.isEmpty();
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
    result.append(" (topRelation: ");
    result.append(topRelation);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //RelationImpl
