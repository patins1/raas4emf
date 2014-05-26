/**
 */
package psets.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import psets.IArtifact;
import psets.IProperty;
import psets.IPropertySet;
import psets.IPropertyValue;
import psets.PsetsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>IArtifact</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link psets.impl.IArtifactImpl#getPropertySets <em>Property Sets</em>}</li>
 *   <li>{@link psets.impl.IArtifactImpl#getTemplateType <em>Template Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IArtifactImpl extends CDOObjectImpl implements IArtifact {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsetsPackage.Literals.IARTIFACT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IPropertySet> getPropertySets() {
		return (EList<IPropertySet>)eGet(PsetsPackage.Literals.IARTIFACT__PROPERTY_SETS, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getTemplateType() {
		// return (String)eGet(PsetsPackage.Literals.IARTIFACT__TEMPLATE_TYPE, true);

		for (IPropertySet pset : getPropertySets()) {
			String templateType = extractTemplateTypeOfPSet(pset);
			if (templateType != null) {
				return templateType;
			}
		}
		return null;
	}

	/**
	 * @param pset
	 * @return returns non-normalised name for template type if can be extracted from given property set, otherwise <code>null</code>
	 */
	public static String extractTemplateTypeOfPSet(IPropertySet pset) {
		if (pset.getName().endsWith("_inherent")) {
			return pset.getName();
		}
		if (pset.getName().equals("Pset_Revit")) {
			for (IProperty prop : pset.getProperties()) {
				if (prop.getFullName().endsWith(".IfcExportAs")) {
					for (IPropertyValue val : prop.getPropertyValues()) {
						return val.getDisplayValue();
					}
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateType(String newTemplateType) {
		eSet(PsetsPackage.Literals.IARTIFACT__TEMPLATE_TYPE, newTemplateType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IPropertySet createPropertySet(String psetName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PsetsPackage.IARTIFACT___CREATE_PROPERTY_SET__STRING:
				return createPropertySet((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // IArtifactImpl
