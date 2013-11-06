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
import IFC2X3.IfcShapeAspect;
import IFC2X3.IfcWindowLiningProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Window Lining Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcWindowLiningPropertiesImpl#getLiningDepth <em>Lining Depth</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWindowLiningPropertiesImpl#getLiningThickness <em>Lining Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWindowLiningPropertiesImpl#getTransomThickness <em>Transom Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWindowLiningPropertiesImpl#getMullionThickness <em>Mullion Thickness</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWindowLiningPropertiesImpl#getFirstTransomOffset <em>First Transom Offset</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWindowLiningPropertiesImpl#getSecondTransomOffset <em>Second Transom Offset</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWindowLiningPropertiesImpl#getFirstMullionOffset <em>First Mullion Offset</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWindowLiningPropertiesImpl#getSecondMullionOffset <em>Second Mullion Offset</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcWindowLiningPropertiesImpl#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcWindowLiningProperties")
@XmlRootElement(name = "IfcWindowLiningPropertiesElement")
public class IfcWindowLiningPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcWindowLiningProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcWindowLiningPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShapeAspect getShapeAspectStyle() {
		return (IfcShapeAspect)eGet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_ShapeAspectStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeAspectStyle(IfcShapeAspect newShapeAspectStyle) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_ShapeAspectStyle(), newShapeAspectStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSecondMullionOffset() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_SecondMullionOffset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondMullionOffset(Double newSecondMullionOffset) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_SecondMullionOffset(), newSecondMullionOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecondMullionOffset() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_SecondMullionOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecondMullionOffset() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_SecondMullionOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFirstMullionOffset() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_FirstMullionOffset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstMullionOffset(Double newFirstMullionOffset) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_FirstMullionOffset(), newFirstMullionOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFirstMullionOffset() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_FirstMullionOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFirstMullionOffset() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_FirstMullionOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSecondTransomOffset() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_SecondTransomOffset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondTransomOffset(Double newSecondTransomOffset) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_SecondTransomOffset(), newSecondTransomOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecondTransomOffset() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_SecondTransomOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecondTransomOffset() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_SecondTransomOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFirstTransomOffset() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_FirstTransomOffset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstTransomOffset(Double newFirstTransomOffset) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_FirstTransomOffset(), newFirstTransomOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFirstTransomOffset() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_FirstTransomOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFirstTransomOffset() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_FirstTransomOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMullionThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_MullionThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMullionThickness(Double newMullionThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_MullionThickness(), newMullionThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMullionThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_MullionThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMullionThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_MullionThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTransomThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_TransomThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransomThickness(Double newTransomThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_TransomThickness(), newTransomThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransomThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_TransomThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransomThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_TransomThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLiningThickness() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_LiningThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiningThickness(Double newLiningThickness) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_LiningThickness(), newLiningThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLiningThickness() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_LiningThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLiningThickness() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_LiningThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLiningDepth() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_LiningDepth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiningDepth(Double newLiningDepth) {
		eSet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_LiningDepth(), newLiningDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLiningDepth() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_LiningDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLiningDepth() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcWindowLiningProperties_LiningDepth());
	}

} //IfcWindowLiningPropertiesImpl
