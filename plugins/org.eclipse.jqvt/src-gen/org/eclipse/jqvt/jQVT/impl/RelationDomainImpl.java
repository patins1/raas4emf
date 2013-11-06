/**
 */
package org.eclipse.jqvt.jQVT.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.jqvt.jQVT.Direction;
import org.eclipse.jqvt.jQVT.JQVTPackage;
import org.eclipse.jqvt.jQVT.RelationDomain;

import org.eclipse.xtext.xbase.XVariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.jqvt.jQVT.impl.RelationDomainImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.impl.RelationDomainImpl#getRootTemplate <em>Root Template</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationDomainImpl extends MinimalEObjectImpl.Container implements RelationDomain
{
  /**
   * The cached value of the '{@link #getDirection() <em>Direction</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected Direction direction;

  /**
   * The cached value of the '{@link #getRootTemplate() <em>Root Template</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootTemplate()
   * @generated
   * @ordered
   */
  protected XVariableDeclaration rootTemplate;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationDomainImpl()
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
    return JQVTPackage.Literals.RELATION_DOMAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Direction getDirection()
  {
    if (direction != null && direction.eIsProxy())
    {
      InternalEObject oldDirection = (InternalEObject)direction;
      direction = (Direction)eResolveProxy(oldDirection);
      if (direction != oldDirection)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, JQVTPackage.RELATION_DOMAIN__DIRECTION, oldDirection, direction));
      }
    }
    return direction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Direction basicGetDirection()
  {
    return direction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirection(Direction newDirection)
  {
    Direction oldDirection = direction;
    direction = newDirection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JQVTPackage.RELATION_DOMAIN__DIRECTION, oldDirection, direction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XVariableDeclaration getRootTemplate()
  {
    return rootTemplate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRootTemplate(XVariableDeclaration newRootTemplate, NotificationChain msgs)
  {
    XVariableDeclaration oldRootTemplate = rootTemplate;
    rootTemplate = newRootTemplate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JQVTPackage.RELATION_DOMAIN__ROOT_TEMPLATE, oldRootTemplate, newRootTemplate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRootTemplate(XVariableDeclaration newRootTemplate)
  {
    if (newRootTemplate != rootTemplate)
    {
      NotificationChain msgs = null;
      if (rootTemplate != null)
        msgs = ((InternalEObject)rootTemplate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JQVTPackage.RELATION_DOMAIN__ROOT_TEMPLATE, null, msgs);
      if (newRootTemplate != null)
        msgs = ((InternalEObject)newRootTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JQVTPackage.RELATION_DOMAIN__ROOT_TEMPLATE, null, msgs);
      msgs = basicSetRootTemplate(newRootTemplate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JQVTPackage.RELATION_DOMAIN__ROOT_TEMPLATE, newRootTemplate, newRootTemplate));
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
      case JQVTPackage.RELATION_DOMAIN__ROOT_TEMPLATE:
        return basicSetRootTemplate(null, msgs);
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
      case JQVTPackage.RELATION_DOMAIN__DIRECTION:
        if (resolve) return getDirection();
        return basicGetDirection();
      case JQVTPackage.RELATION_DOMAIN__ROOT_TEMPLATE:
        return getRootTemplate();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JQVTPackage.RELATION_DOMAIN__DIRECTION:
        setDirection((Direction)newValue);
        return;
      case JQVTPackage.RELATION_DOMAIN__ROOT_TEMPLATE:
        setRootTemplate((XVariableDeclaration)newValue);
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
      case JQVTPackage.RELATION_DOMAIN__DIRECTION:
        setDirection((Direction)null);
        return;
      case JQVTPackage.RELATION_DOMAIN__ROOT_TEMPLATE:
        setRootTemplate((XVariableDeclaration)null);
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
      case JQVTPackage.RELATION_DOMAIN__DIRECTION:
        return direction != null;
      case JQVTPackage.RELATION_DOMAIN__ROOT_TEMPLATE:
        return rootTemplate != null;
    }
    return super.eIsSet(featureID);
  }

} //RelationDomainImpl
