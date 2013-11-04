/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package au.com.smartservicescrc.raas.codegen.jaxws.util;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.pde.core.IBaseModel;
import org.eclipse.pde.internal.core.ibundle.IBundle;
import org.eclipse.pde.internal.core.ibundle.IBundlePluginModelBase;
import org.eclipse.pde.internal.core.ibundle.IManifestHeader;
import org.eclipse.pde.internal.core.text.bundle.ExportPackageHeader;
import org.eclipse.pde.internal.core.text.bundle.RequireBundleHeader;
import org.eclipse.pde.internal.ui.util.ModelModification;
import org.eclipse.pde.internal.ui.util.PDEModelUtility;
import org.osgi.framework.Constants;

/**
 * Offers some utilities to configure a plugin project
 */
@SuppressWarnings("restriction")
public class PDEHelper {

	private static void doModifyManifestModel(IBaseModel model, String[] pluginIDs) {
		// Make sure we have a base model
		if ((model instanceof IBundlePluginModelBase) == false) {
			return;
		}
		IBundlePluginModelBase modelBase = (IBundlePluginModelBase) model;
		IBundle bundle = modelBase.getBundleModel().getBundle();
		IManifestHeader header = bundle.getManifestHeader(Constants.REQUIRE_BUNDLE);
		if (header == null) {
			// if not yet exists, create it
			bundle.setHeader(Constants.REQUIRE_BUNDLE, "");
			header = bundle.getManifestHeader(Constants.REQUIRE_BUNDLE);
		}
		if (header instanceof RequireBundleHeader) {
			RequireBundleHeader require = (RequireBundleHeader) header;
			// Add plug-ins to the list of required bundles
			for (String pluginID : pluginIDs)
				if (require.hasElement(pluginID) == false) {
					require.addBundle(pluginID);
				}
		}
	}

	public static void addPluginDependencies(IProject project, final String[] pluginIDs) {
		ModelModification mod = new ModelModification(project) {
			protected void modifyModel(IBaseModel model, IProgressMonitor monitor) throws CoreException {
				doModifyManifestModel(model, pluginIDs);
			}
		};
		PDEModelUtility.modifyModel(mod, null);
	}

	public static void exportPackages(IProject project, final String[] packageNames) {
		ModelModification mod = new ModelModification(project) {
			protected void modifyModel(IBaseModel model, IProgressMonitor monitor) throws CoreException {
				if (model instanceof IBundlePluginModelBase) {
					IBundle bundle = ((IBundlePluginModelBase) model).getBundleModel().getBundle();

					ExportPackageHeader header = (ExportPackageHeader) bundle.getManifestHeader(Constants.EXPORT_PACKAGE);
					if (header == null) {
						bundle.setHeader(Constants.EXPORT_PACKAGE, ""); //$NON-NLS-1$
						header = (ExportPackageHeader) bundle.getManifestHeader(Constants.EXPORT_PACKAGE);
					}
					for (String packageName : packageNames) {
						if (header.getPackage(packageName) == null) {
							header.addPackage(packageName);
						}
					}
				}
			}
		};
		PDEModelUtility.modifyModel(mod, null);
	}

}
