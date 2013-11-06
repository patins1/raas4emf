/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcArbitraryProfileDefWithVoids;
import IFC2X3.IfcCurve;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Arbitrary Profile Def With Voids</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcArbitraryProfileDefWithVoidsImpl#getInnerCurves <em>Inner Curves</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcArbitraryProfileDefWithVoids")
@XmlRootElement(name = "IfcArbitraryProfileDefWithVoidsElement")
public class IfcArbitraryProfileDefWithVoidsImpl extends IfcArbitraryClosedProfileDefImpl implements IfcArbitraryProfileDefWithVoids {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcArbitraryProfileDefWithVoidsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcArbitraryProfileDefWithVoids();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@XmlElement
	public EList<IfcCurve> getInnerCurves() {
		return (EList<IfcCurve>)eGet(IFC2X3Package.eINSTANCE.getIfcArbitraryProfileDefWithVoids_InnerCurves(), true);
	}

} //IfcArbitraryProfileDefWithVoidsImpl
