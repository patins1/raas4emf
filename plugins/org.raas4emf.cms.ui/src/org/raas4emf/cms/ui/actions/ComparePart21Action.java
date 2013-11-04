/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.ifc4emf.metamodel.ifc.samples.IFCComparer;
import org.raas4emf.cms.ui.RAASUIUtils;

import raascms.Artifact;

public class ComparePart21Action extends AbstractHandler {

	private String message;

	public ComparePart21Action() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final Shell shell = HandlerUtil.getActiveShell(event);
		List<Artifact> part21Files = RAASUIUtils.getSelection(event, Artifact.class);
		message = "";
		try {
			IFCComparer comparer = new IFCComparer(part21Files.get(0).getFileContent().getContents(), part21Files.get(1).getFileContent().getContents()) {

				int lineCount = 0;

				@Override
				protected void handleMismatch(String string, boolean isOriginal) {
					if (monitor.isCanceled())
						return;
					lineCount++;
					if (lineCount > 1000) {
						monitor.setCanceled(true);
						message += "Stopped comparison after too many found differences.." + "\n";
						return;
					}
					message += (isOriginal ? "- " : "+ ") + string + "\n";
				}
			};
			comparer.assertEqual();
			if ("".equals(message))
				message = "Found no differences!";
			MemoDialog.openInformation(shell, "Part21 Comparison Report", message);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return null;
	}

}
