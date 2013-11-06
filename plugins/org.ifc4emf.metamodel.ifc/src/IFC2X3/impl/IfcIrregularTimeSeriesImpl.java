/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcIrregularTimeSeries;
import IFC2X3.IfcIrregularTimeSeriesValue;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Irregular Time Series</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcIrregularTimeSeriesImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcIrregularTimeSeries")
@XmlRootElement(name = "IfcIrregularTimeSeriesElement")
public class IfcIrregularTimeSeriesImpl extends IfcTimeSeriesImpl implements IfcIrregularTimeSeries {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcIrregularTimeSeriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcIrregularTimeSeries();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcIrregularTimeSeriesValue> getValues() {
		return (EList<IfcIrregularTimeSeriesValue>)eGet(IFC2X3Package.eINSTANCE.getIfcIrregularTimeSeries_Values(), true);
	}

} //IfcIrregularTimeSeriesImpl
