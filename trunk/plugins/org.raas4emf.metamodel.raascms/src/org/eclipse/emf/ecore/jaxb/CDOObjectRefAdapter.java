package org.eclipse.emf.ecore.jaxb;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.internal.common.id.CDOIDObjectLongImpl;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;
import org.eclipse.emf.spi.cdo.InternalCDOObject;

abstract public class CDOObjectRefAdapter<BoundRefType extends CDOObjectRef, BoundType extends CDOObject> extends EObjectRefAdapter<BoundRefType, BoundType> {

	@Override
	public BoundType unmarshal(BoundRefType v) throws Exception {
		BoundType eObject = createInstance(v);
		((InternalCDOObject) eObject).cdoInternalSetID(CDOIDObjectLongImpl.create(v.getID()));
		((BasicEObjectImpl) eObject).eSetProxyURI(RESOURCEURI.appendFragment(v.getID()));
		return eObject;
	}

	@Override
	public BoundRefType marshal(BoundType eObject) throws Exception {
		BoundRefType result = createInstanceRef(eObject);
		result.setID(eObject.cdoID().toURIFragment());
		return result;
	}

}
