package raascms.util;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIHelperImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMISaveImpl;

public class XMIExportResource extends XMIResourceImpl {

	public XMIExportResource(URI uri, List<EObject> rootObjects) {
		super(uri);
		defaultSaveOptions = new HashMap<Object, Object>();
		defaultSaveOptions.put(XMLResource.OPTION_ROOT_OBJECTS, rootObjects);
		unloadingContents = new BasicEList.FastCompare<EObject>(rootObjects);
	}

	protected org.eclipse.emf.ecore.xmi.XMLSave createXMLSave() {

		return new XMISaveImpl(createXMLHelper()) {

			protected boolean shouldSaveFeature(org.eclipse.emf.ecore.EObject o, org.eclipse.emf.ecore.EStructuralFeature f) {
				// if (f ==
				// IntelligentbuildingmodelPackage.eINSTANCE.getElement_IfcTrace())
				if (f.getName().equals("ifcTrace"))
					return false;
				return super.shouldSaveFeature(o, f);
			};

			protected int sameDocMany(org.eclipse.emf.ecore.EObject o, org.eclipse.emf.ecore.EStructuralFeature f) {
				int result = super.sameDocMany(o, f);
				if (result == 2)
					result = 1;
				return result;
			};

			protected int sameDocSingle(org.eclipse.emf.ecore.EObject o, org.eclipse.emf.ecore.EStructuralFeature f) {
				int result = super.sameDocSingle(o, f);
				if (result == 2)
					result = 1;
				return result;
			};

			protected void saveElement(org.eclipse.emf.ecore.EObject o, org.eclipse.emf.ecore.EStructuralFeature f) {
				super.saveElement(o, f);
				worked(o);
			};

		};

	};

	@Override
	protected XMLHelper createXMLHelper() {
		return new XMIHelperImpl(this) {
			@Override
			protected String getURIFragment(Resource containingResource, EObject object) {
				String result = super.getURIFragment(containingResource, object);
				if (result.startsWith("///")) {
					// caused by missing resource of "object"
					result = result.substring("/".length());
				}
				return result;
			}
		};
	}

	protected void worked(EObject eObject) {

	}
}
