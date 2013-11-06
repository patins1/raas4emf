/**
 */
package org.eclipse.jqvt.jQVT.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.jqvt.jQVT.Direction;
import org.eclipse.jqvt.jQVT.JQVTPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.jqvt.jQVT.impl.DirectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.impl.DirectionImpl#getImp <em>Imp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DirectionImpl extends MinimalEObjectImpl.Container implements Direction
{
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
   * The default value of the '{@link #getImp() <em>Imp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImp()
   * @generated
   * @ordered
   */
  protected static final String IMP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImp() <em>Imp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImp()
   * @generated
   * @ordered
   */
  protected String imp = IMP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DirectionImpl()
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
    return JQVTPackage.Literals.DIRECTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, JQVTPackage.DIRECTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImp()
  {
    return imp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImp(String newImp)
  {
    String oldImp = imp;
    imp = newImp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JQVTPackage.DIRECTION__IMP, oldImp, imp));
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
      case JQVTPackage.DIRECTION__NAME:
        return getName();
      case JQVTPackage.DIRECTION__IMP:
        return getImp();
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
      case JQVTPackage.DIRECTION__NAME:
        setName((String)newValue);
        return;
      case JQVTPackage.DIRECTION__IMP:
        setImp((String)newValue);
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
      case JQVTPackage.DIRECTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case JQVTPackage.DIRECTION__IMP:
        setImp(IMP_EDEFAULT);
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
      case JQVTPackage.DIRECTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case JQVTPackage.DIRECTION__IMP:
        return IMP_EDEFAULT == null ? imp != null : !IMP_EDEFAULT.equals(imp);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", imp: ");
    result.append(imp);
    result.append(')');
    return result.toString();
  }

} //DirectionImpl
