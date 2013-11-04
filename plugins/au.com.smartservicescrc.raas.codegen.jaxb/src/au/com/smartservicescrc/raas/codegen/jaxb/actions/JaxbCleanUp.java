/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package au.com.smartservicescrc.raas.codegen.jaxb.actions;

import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.internal.ui.fix.AbstractCleanUp;
import org.eclipse.jdt.ui.cleanup.CleanUpContext;
import org.eclipse.jdt.ui.cleanup.CleanUpRequirements;
import org.eclipse.jdt.ui.cleanup.ICleanUpFix;

import au.com.smartservicescrc.raas.codegen.jaxb.classes.JaxbGenInfo;
import au.com.smartservicescrc.raas.codegen.jaxb.quickfix.JaxbCodeFix;

public class JaxbCleanUp extends AbstractCleanUp {
	private JaxbGenInfo jaxbGenInfo;

	public JaxbCleanUp() {
		super();
	}

	public JaxbCleanUp(@SuppressWarnings("rawtypes") Map options, JaxbGenInfo jaxbGenInfo) {
		super(options);
		this.jaxbGenInfo = jaxbGenInfo;
	}

	@Override
	public CleanUpRequirements getRequirements() {
		return new CleanUpRequirements(true, true, false, null);
	}

	@Override
	public ICleanUpFix createFix(CleanUpContext context) throws CoreException {
		CompilationUnit compilationUnit = context.getAST();
		if (compilationUnit == null) {
			return null;
		}
		List<AbstractTypeDeclaration> tlts = compilationUnit.types();
		return JaxbCodeFix.createCleanUp(compilationUnit, tlts, jaxbGenInfo);
	}
}
