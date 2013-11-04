/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.cdo.common.lob.CDOBlob;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.progress.UIJob;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.RAASUIUtils;

import raascms.Artifact;
import raascms.Folder;
import raascms.RaascmsFactory;

public class NewArtifactAction extends AbstractHandler {

	public NewArtifactAction() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		for (Object element : RAASUIUtils.getSelection(event)) {
			if (element instanceof Folder) {
				Folder folder = (Folder) element;
				Shell shell = HandlerUtil.getActiveShell(event);
				InputDialog dialog = new InputDialog(shell, "Specify Name", "Enter name for new artifact", null, new FilenameInputValidator());
				if (dialog.open() == Window.OK) {
					String name = dialog.getValue();
					if (RAASUtils.getChildWithName(folder, name) != null) {
						MessageDialog.openError(shell, "Error", "File with this name already exists!");
						return null;
					}
					RegisteredPackageDialog registeredPackageDialog = new RegisteredPackageDialog(shell);
					registeredPackageDialog.open();
					Object[] result = registeredPackageDialog.getResult();
					if (result != null) {
						final Map<String, EClass> allClasses = new HashMap<String, EClass>();

						for (Object element2 : result) {
							EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(element2.toString());
							if (ePackage != null)
								for (EClassifier eClassifier : ePackage.getEClassifiers()) {
									if (eClassifier instanceof EClass) {
										EClass eClass = (EClass) eClassifier;
										allClasses.put(eClass.getName(), eClass);
									}
								}
						}
						String[] items = allClasses.keySet().toArray(new String[] {});
						Arrays.sort(items);
						ComboInputDialog inputdialog = new ComboInputDialog(items, shell, "Select Type", "Select type to instantiate:", "", new IInputValidator() {

							@Override
							public String isValid(String newText) {
								if (!allClasses.containsKey(newText))
									return "Cannot find type " + newText;
								return null;
							}
						});
						if (inputdialog.open() == Window.OK) {
							EClass eClass = allClasses.get(inputdialog.getValue());
							EObject rootElement = EcoreUtil.create(eClass);
							Artifact artifact = RaascmsFactory.eINSTANCE.createArtifact();
							artifact.setName(name);
							artifact.getContents().add(rootElement);
							String blob = "Blob";
							ComboInputDialog blobdialog = new ComboInputDialog(new String[] { blob, "Model tree" }, shell, "Select Memory Management", "Select how the model should be stored:", blob, null);
							if (blobdialog.open() != Window.OK)
								return null;
							if (blob.equals(blobdialog.getValue())) {
								try {
									InputStream is = artifact.asFile(artifact.getName());
									artifact.setFileContent(new CDOBlob(is));
								} catch (IOException e) {
									e.printStackTrace();
									throw new RuntimeException(e);
								}
								artifact.getContents().clear();
							}
							folder.getArtifacts().add(artifact);
							RAASUtils.doSave(artifact, "NewArtifactAction.run(" + name + ")");
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * As in org.eclipse.emf.ecore.presentation.RegisteredPackageDialog, but with two modifications for RAP, despite it is not available for RAP at all
	 * 
	 * @author kiegelan
	 * 
	 */
	public static class RegisteredPackageDialog extends ElementListSelectionDialog {
		protected boolean isDevelopmentTimeVersion = true;

		public RegisteredPackageDialog(Shell parent) {
			super(parent, new LabelProvider() {

				@Override
				public Image getImage(Object element) {
					// return ExtendedImageRegistry.getInstance().getImage(Activator.INSTANCE.getImage("full/obj16/EPackage"));
					return super.getImage(element);
				}
			});

			setMultipleSelection(true);
			setMessage("Select a registered package URI:");
			setFilter("*");
			setTitle("Metamodel Package Selection");
		}

		public boolean isDevelopmentTimeVersion() {
			return isDevelopmentTimeVersion;
		}

		protected void updateElements() {
			if (isDevelopmentTimeVersion) {
				Map<String, URI> ePackageNsURItoGenModelLocationMap = EcorePlugin.getEPackageNsURIToGenModelLocationMap(true);
				Object[] result = ePackageNsURItoGenModelLocationMap.keySet().toArray(new Object[ePackageNsURItoGenModelLocationMap.size()]);
				Arrays.sort(result);
				setListElements(result);
			} else {
				Object[] result = EPackage.Registry.INSTANCE.keySet().toArray(new Object[EPackage.Registry.INSTANCE.size()]);
				Arrays.sort(result);
				setListElements(result);
			}
		}

		/**
		 * This override is required in the RAP version as the UI Job to update the list not returns from sleeping
		 */
		@Override
		protected void setListElements(Object[] elements) {
			super.setListElements(elements);
			if (elements != null)
				try {
					Field f = this.fFilteredList.getClass().getDeclaredField("fUpdateJob");
					f.setAccessible(true);
					UIJob job = (UIJob) f.get(this.fFilteredList);
					for (int i = 0; i < elements.length / 10 + 1; i++)
						job.runInUIThread(new NullProgressMonitor());
				} catch (Exception e) {
					e.printStackTrace();
				}
		}

		@Override
		protected Control createDialogArea(Composite parent) {
			Composite result = (Composite) super.createDialogArea(parent);
			Composite buttonGroup = new Composite(result, SWT.NONE);
			GridLayout layout = new GridLayout();
			layout.numColumns = 2;
			buttonGroup.setLayout(layout);
			final Button developmentTimeVersionButton = new Button(buttonGroup, SWT.RADIO);
			developmentTimeVersionButton.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent event) {
					isDevelopmentTimeVersion = developmentTimeVersionButton.getSelection();
					updateElements();
				}
			});
			developmentTimeVersionButton.setText("Development Time Version");
			Button runtimeTimeVersionButton = new Button(buttonGroup, SWT.RADIO);
			runtimeTimeVersionButton.setText("Runtime Version");
			/**
			 * For the RAP version, we need selection listener also here
			 */
			runtimeTimeVersionButton.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent event) {
					isDevelopmentTimeVersion = developmentTimeVersionButton.getSelection();
					updateElements();
				}
			});
			developmentTimeVersionButton.setSelection(true);

			updateElements();

			return result;
		}
	}

}
