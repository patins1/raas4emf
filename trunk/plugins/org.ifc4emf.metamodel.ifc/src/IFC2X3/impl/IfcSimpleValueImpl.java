/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcSimpleValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Simple Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcSimpleValueImpl#getIfcLogicalvalue <em>Ifc Logicalvalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSimpleValueImpl#getIfcLabelvalue <em>Ifc Labelvalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSimpleValueImpl#getIfcTextvalue <em>Ifc Textvalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSimpleValueImpl#getIfcIdentifiervalue <em>Ifc Identifiervalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSimpleValueImpl#getIfcBooleanvalue <em>Ifc Booleanvalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSimpleValueImpl#getIfcRealvalue <em>Ifc Realvalue</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcSimpleValueImpl#getIfcIntegervalue <em>Ifc Integervalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcSimpleValue")
@XmlRootElement(name = "IfcSimpleValueElement")
public class IfcSimpleValueImpl extends CDOObjectImpl implements IfcSimpleValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSimpleValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcSimpleValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIfcLogicalvalue() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcLogicalvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLogicalvalue(Boolean newIfcLogicalvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcLogicalvalue(), newIfcLogicalvalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcLogicalvalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcLogicalvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcLogicalvalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcLogicalvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIfcLabelvalue() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcLabelvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLabelvalue(String newIfcLabelvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcLabelvalue(), newIfcLabelvalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcLabelvalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcLabelvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcLabelvalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcLabelvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIfcTextvalue() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcTextvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTextvalue(String newIfcTextvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcTextvalue(), newIfcTextvalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcTextvalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcTextvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcTextvalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcTextvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIfcIdentifiervalue() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcIdentifiervalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcIdentifiervalue(String newIfcIdentifiervalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcIdentifiervalue(), newIfcIdentifiervalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcIdentifiervalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcIdentifiervalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcIdentifiervalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcIdentifiervalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIfcBooleanvalue() {
		return (Boolean)eGet(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcBooleanvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcBooleanvalue(Boolean newIfcBooleanvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcBooleanvalue(), newIfcBooleanvalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcBooleanvalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcBooleanvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcBooleanvalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcBooleanvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIfcRealvalue() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcRealvalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRealvalue(Double newIfcRealvalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcRealvalue(), newIfcRealvalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcRealvalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcRealvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcRealvalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcRealvalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIfcIntegervalue() {
		return (Integer)eGet(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcIntegervalue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcIntegervalue(Integer newIfcIntegervalue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcIntegervalue(), newIfcIntegervalue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfcIntegervalue() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcIntegervalue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfcIntegervalue() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcSimpleValue_IfcIntegervalue());
	}

} //IfcSimpleValueImpl
