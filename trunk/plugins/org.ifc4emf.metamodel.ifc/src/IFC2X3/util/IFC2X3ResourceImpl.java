/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.ifc4emf.part21.loader.Part21ResourceImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see IFC2X3.util.IFC2X3ResourceFactoryImpl
 * @generated
 */
public class IFC2X3ResourceImpl extends Part21ResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public IFC2X3ResourceImpl(URI uri) {
		super(uri);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl#doLoad(java.io.InputStream, java.util.Map)
	 */
	@Override
	public void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		//TODO The construction of the helper could be replaced by something that simply reads the
		//transformation trace
		super.doLoad(inputStream, options, new IfcLoadHelper(new ResourceSetImpl()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl#doSave(java.io.OutputStream, java.util.Map)
	 */
	@Override
	public void doSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {
		//throw new UnsupportedOperationException("Save not supported for this resource type");
		super.doSave(outputStream, options, new IfcLoadHelper(new ResourceSetImpl()));
	}

	
	
} //IFC2X3ResourceImpl
