/**
 */
package org.eclipse.jqvt.jQVT.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jqvt.jQVT.JQVTPackage;
import org.eclipse.jqvt.jQVT.ObjectTemplate;
import org.eclipse.jqvt.jQVT.PropertyTemplateItem;

import org.eclipse.xtext.xbase.impl.XVariableDeclarationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.jqvt.jQVT.impl.ObjectTemplateImpl#getPart <em>Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectTemplateImpl extends XVariableDeclarationImpl implements ObjectTemplate
{
  /**
   * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPart()
   * @generated
   * @ordered
   */
  protected EList<PropertyTemplateItem> part;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectTemplateImpl()
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
    return JQVTPackage.Literals.OBJECT_TEMPLATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PropertyTemplateItem> getPart()
  {
    if (part == null)
    {
      part = new EObjectContainmentEList<PropertyTemplateItem>(PropertyTemplateItem.class, this, JQVTPackage.OBJECT_TEMPLATE__PART);
    }
    return part;
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
      case JQVTPackage.OBJECT_TEMPLATE__PART:
        return ((InternalEList<?>)getPart()).basicRemove(otherEnd, msgs);
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
      case JQVTPackage.OBJECT_TEMPLATE__PART:
        return getPart();
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
      case JQVTPackage.OBJECT_TEMPLATE__PART:
        getPart().clear();
        getPart().addAll((Collection<? extends PropertyTemplateItem>)newValue);
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
      case JQVTPackage.OBJECT_TEMPLATE__PART:
        getPart().clear();
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
      case JQVTPackage.OBJECT_TEMPLATE__PART:
        return part != null && !part.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ObjectTemplateImpl
