/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.eclipse.jqvt;

import org.eclipse.jqvt.compiler.JQVTCompiler;
import org.eclipse.jqvt.jvmmodel.DependencyProcessor;
import org.eclipse.jqvt.scoping.JQVTBatchScopeProvider;
import org.eclipse.jqvt.scoping.JQVTFeatureScopes;
import org.eclipse.jqvt.scoping.JQVTScopeProvider;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.scoping.batch.FeatureScopes;
import org.eclipse.xtext.xbase.scoping.batch.XbaseBatchScopeProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class JQVTRuntimeModule extends org.eclipse.jqvt.AbstractJQVTRuntimeModule {

	@Override
	public Class<? extends IScopeProvider> bindIScopeProvider() {
		return JQVTScopeProvider.class;
	}

	public Class<? extends FeatureScopes> bindFeatureScopes() {
		return JQVTFeatureScopes.class;
	}

	public Class<? extends XbaseBatchScopeProvider> bindXbaseBatchScopeProvider() {
		return JQVTBatchScopeProvider.class;
	}

	@SuppressWarnings("restriction")
	public Class<? extends XbaseCompiler> bindXbaseCompiler() {
		return JQVTCompiler.class;
	}

	public Class<? extends DependencyProcessor> bindDependencyProcessor() {
		return DependencyProcessor.class;
	}

}
