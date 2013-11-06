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

import org.eclipse.jqvt.jQVT.Import;
import org.eclipse.jqvt.jQVT.JQVTPackage;
import org.eclipse.jqvt.jQVT.PackageDeclaration;
import org.eclipse.jqvt.jQVT.Transformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.jqvt.jQVT.impl.PackageDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.impl.PackageDeclarationImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.impl.PackageDeclarationImpl#getTransformation <em>Transformation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageDeclarationImpl extends MinimalEObjectImpl.Container implements PackageDeclaration
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
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransformation()
   * @generated
   * @ordered
   */
  protected Transformation transformation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageDeclarationImpl()
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
    return JQVTPackage.Literals.PACKAGE_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, JQVTPackage.PACKAGE_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, JQVTPackage.PACKAGE_DECLARATION__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transformation getTransformation()
  {
    return transformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTransformation(Transformation newTransformation, NotificationChain msgs)
  {
    Transformation oldTransformation = transformation;
    transformation = newTransformation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JQVTPackage.PACKAGE_DECLARATION__TRANSFORMATION, oldTransformation, newTransformation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransformation(Transformation newTransformation)
  {
    if (newTransformation != transformation)
    {
      NotificationChain msgs = null;
      if (transformation != null)
        msgs = ((InternalEObject)transformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JQVTPackage.PACKAGE_DECLARATION__TRANSFORMATION, null, msgs);
      if (newTransformation != null)
        msgs = ((InternalEObject)newTransformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JQVTPackage.PACKAGE_DECLARATION__TRANSFORMATION, null, msgs);
      msgs = basicSetTransformation(newTransformation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JQVTPackage.PACKAGE_DECLARATION__TRANSFORMATION, newTransformation, newTransformation));
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
      case JQVTPackage.PACKAGE_DECLARATION__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case JQVTPackage.PACKAGE_DECLARATION__TRANSFORMATION:
        return basicSetTransformation(null, msgs);
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
      case JQVTPackage.PACKAGE_DECLARATION__NAME:
        return getName();
      case JQVTPackage.PACKAGE_DECLARATION__IMPORTS:
        return getImports();
      case JQVTPackage.PACKAGE_DECLARATION__TRANSFORMATION:
        return getTransformation();
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
      case JQVTPackage.PACKAGE_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case JQVTPackage.PACKAGE_DECLARATION__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case JQVTPackage.PACKAGE_DECLARATION__TRANSFORMATION:
        setTransformation((Transformation)newValue);
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
      case JQVTPackage.PACKAGE_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case JQVTPackage.PACKAGE_DECLARATION__IMPORTS:
        getImports().clear();
        return;
      case JQVTPackage.PACKAGE_DECLARATION__TRANSFORMATION:
        setTransformation((Transformation)null);
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
      case JQVTPackage.PACKAGE_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case JQVTPackage.PACKAGE_DECLARATION__IMPORTS:
        return imports != null && !imports.isEmpty();
      case JQVTPackage.PACKAGE_DECLARATION__TRANSFORMATION:
        return transformation != null;
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
    result.append(')');
    return result.toString();
  }

} //PackageDeclarationImpl
