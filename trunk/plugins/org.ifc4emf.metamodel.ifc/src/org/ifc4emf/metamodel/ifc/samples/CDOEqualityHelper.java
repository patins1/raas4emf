package org.ifc4emf.metamodel.ifc.samples;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper;
import org.eclipse.net4j.util.om.monitor.MonitorCanceledException;

public class CDOEqualityHelper extends EqualityHelper {

	private final IProgressMonitor monitor;

	public CDOEqualityHelper(IProgressMonitor monitor) {
		this.monitor = monitor;
	}

	private static final long serialVersionUID = 1L;
	boolean calledByCrossReferenceComparison;
	private EObject lhs;
	private EObject rhs;
	private int comparedObjects;

	@Override
	public EObject put(EObject key, EObject value) {
		// do not store eobjects since we have large models!
		return null;
	}

	@Override
	protected boolean haveEqualReference(EObject eObject1, EObject eObject2, EReference reference) {
		if (calledByCrossReferenceComparison) {
			return true;
		}
		if (!reference.isContainment()) {
			calledByCrossReferenceComparison = true;
			try {
				return super.haveEqualReference(eObject1, eObject2, reference);
			} finally {
				calledByCrossReferenceComparison = false;
			}
		}
		return super.haveEqualReference(eObject1, eObject2, reference);
	}

	@Override
	public boolean equals(EObject eObject1, EObject eObject2) {
		comparedObjects++;
		if (monitor.isCanceled()) {
			throw new MonitorCanceledException();
		}
		boolean result = super.equals(eObject1, eObject2);
		if (!result) {
			System.out.println("Differing " + eObject1 + " and " + eObject2);
			if (lhs == null && rhs == null) {
				lhs = eObject1;
				rhs = eObject2;
			}
		}
		return result;
	}

	@Override
	public boolean equals(List<EObject> list1, List<EObject> list2) {
		if (list1.size() != list2.size()) {
			System.out.println("Differing in list size: " + list1.size() + "!=" + list2.size());
		}
		return super.equals(list1, list2);
	}

	@Override
	protected boolean haveEqualAttribute(EObject eObject1, EObject eObject2, EAttribute attribute) {

		Object value1 = eObject1.eGet(attribute);
		Object value2 = eObject2.eGet(attribute);
		if (value1 instanceof Double && value2 instanceof Double) {
			Double double2 = (Double) value2;
			Double double1 = (Double) value1;
			return (double1 - double2 == 0);
		}
		return super.haveEqualAttribute(eObject1, eObject2, attribute);
	}

	@Override
	protected boolean haveEqualFeature(EObject eObject1, EObject eObject2, EStructuralFeature feature) {
		if (feature.getName().startsWith("cdo"))
			return true;
		boolean result;
		if (/* feature.isMany() && */feature instanceof EAttribute) {
			result = haveEqualAttribute(eObject1, eObject2, (EAttribute) feature);
		} else
			result = super.haveEqualFeature(eObject1, eObject2, feature);
		if (!result) {
			System.out.println("Differing in " + feature.getEContainingClass().getName() + "." + feature.getName());
			if (feature.getEType() instanceof EDataType) {
				EDataType eDataType = (EDataType) feature.getEType();
				System.out.println(EcoreUtil.convertToString(eDataType, eObject1.eGet(feature)) + "<>" + EcoreUtil.convertToString(eDataType, eObject2.eGet(feature)));
			} else
				System.out.println(eObject1.eGet(feature) + "<>" + eObject2.eGet(feature));
		}
		return result;
	}

	public EObject getLhs() {
		return lhs;
	}

	public void setLhs(EObject lhs) {
		this.lhs = lhs;
	}

	public EObject getRhs() {
		return rhs;
	}

	public void setRhs(EObject rhs) {
		this.rhs = rhs;
	}

	public int getComparedObjects() {
		return comparedObjects;
	}
}
