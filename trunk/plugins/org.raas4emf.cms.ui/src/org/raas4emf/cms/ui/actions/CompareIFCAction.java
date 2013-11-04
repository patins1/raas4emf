/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.raas4emf.cms.ui.RAASUIUtils;
import org.raas4emf.cms.ui.views.DirectoryView;
import org.raas4emf.cms.ui.views.PreviewView;

import raascms.Artifact;
import IFC2X3.IfcRoot;

public class CompareIFCAction extends AbstractHandler {

	private String message;

	public CompareIFCAction() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final Shell shell = HandlerUtil.getActiveShell(event);
		List<Artifact> ifcFiles = RAASUIUtils.getSelection(event, Artifact.class);

		Map<String, IfcRoot> guidToIFC0 = new HashMap<String, IfcRoot>();
		for (EObject model : ifcFiles.get(0).getContents())
			examineIfcElement(model, guidToIFC0);

		Map<String, IfcRoot> guidToIFC1 = new HashMap<String, IfcRoot>();
		for (EObject model : ifcFiles.get(1).getContents())
			examineIfcElement(model, guidToIFC1);

		Map<String, IfcRoot> guidToIFC = new HashMap<String, IfcRoot>(guidToIFC0);
		guidToIFC0.keySet().removeAll(guidToIFC1.keySet());
		guidToIFC1.keySet().removeAll(guidToIFC.keySet());
		guidToIFC.keySet().removeAll(guidToIFC0.keySet());
		guidToIFC.keySet().removeAll(guidToIFC1.keySet());

		message = "";
		message += "New GUIDs: " + report(guidToIFC1) + "\n";
		message += "Deleted GUIDs: " + report(guidToIFC0) + "\n";
		message += "Unchanged GUIDs: " + report(guidToIFC) + "\n";

		for (PreviewView view : PreviewView.findView(Arrays.asList(ifcFiles.get(0)), false)) {
			view.isolate(guidToIFC0.values());
		}

		for (PreviewView view : PreviewView.findView(Arrays.asList(ifcFiles.get(1)), false)) {
			view.isolate(guidToIFC1.values());
		}

		MemoDialog.openInformation(shell, "IFC Comparison Report", message);
		return null;
	}

	private String report(Map<String, IfcRoot> guidToIFC) {
		final Map<Class<?>, Integer> accounting = new HashMap<Class<?>, Integer>();
		for (IfcRoot root : guidToIFC.values()) {
			Integer count = accounting.get(root.getClass());
			if (count == null)
				count = 0;
			accounting.put(root.getClass(), count + 1);
		}
		List<Class<?>> ifcClasses = new ArrayList<Class<?>>(accounting.keySet());
		Collections.sort(ifcClasses, new Comparator<Class<?>>() {

			@Override
			public int compare(Class<?> o1, Class<?> o2) {
				return accounting.get(o2) - accounting.get(o1);
			}

		});
		String result = "";
		for (Class<?> clazz : ifcClasses) {
			result += accounting.get(clazz) + " " + clazz.getSimpleName().substring(0, clazz.getSimpleName().length() - "Impl".length()) + ", ";
		}
		if (!"".equals(result)) {
			result = " (" + result.substring(0, result.length() - ", ".length()) + ")";
		}
		return guidToIFC.size() + result;
	}

	private void examineIfcElement(EObject model, Map<String, IfcRoot> guidToIFC) {
		if (model instanceof IfcRoot) {
			IfcRoot ifcRoot = (IfcRoot) model;
			guidToIFC.put(ifcRoot.getGlobalId(), ifcRoot);
		}
		for (EObject child : DirectoryView.getLogicalChildren(model))
			examineIfcElement(child, guidToIFC);
	}

}
