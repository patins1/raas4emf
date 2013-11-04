/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.editor.editor;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.eclipse.emf.cdo.common.lob.CDOBlob;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.raas4emf.cms.core.RAASUtils;

import raascms.Artifact;
import raascms.RaascmsPackage;

public class BlobFormPage extends FormPage {

	private EditingDomain editingDomain;

	private FormToolkit toolkit;

	public BlobFormPage(RAASEditorExt editor) {
		super(editor, "RAASForms", "Blob editor");
		editingDomain = editor.getEditingDomain();
	}

	@Override
	protected void createFormContent(IManagedForm managedForm) {
		Composite body = managedForm.getForm().getBody();
		final Artifact artifact = (Artifact) getRAASEditor().viewerInput;

		TableWrapLayout bodyLayout = new TableWrapLayout();
		body.setLayout(bodyLayout);
		toolkit = managedForm.getToolkit();

		Section section = toolkit.createSection(body, Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		section.setText("Text");
		section.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB));
		section.setLayout(new TableWrapLayout());
		final Composite sectionClient = toolkit.createComposite(section);
		TableWrapLayout sectionClientLayout = new TableWrapLayout();
		sectionClientLayout.numColumns = 1;
		sectionClient.setLayout(sectionClientLayout);
		section.setClient(sectionClient);

		final Text propNameFilter = toolkit.createText(sectionClient, RAASUtils.getBlobAsString(artifact), SWT.V_SCROLL);
		propNameFilter.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB, 1, 1));
		Button modeButton = toolkit.createButton(sectionClient, "Modify", SWT.NONE);
		modeButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					editingDomain.getCommandStack().execute(SetCommand.create(editingDomain, artifact, RaascmsPackage.eINSTANCE.getArtifact_FileContent(), new CDOBlob(new ByteArrayInputStream(propNameFilter.getText().getBytes()))));
				} catch (IOException ex) {
					throw new RuntimeException(ex);
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		body.layout();

	}

	private RAASEditorExt getRAASEditor() {
		return (RAASEditorExt) getEditor();
	}

	public static boolean canDisplay(Object viewerInput) {
		if (viewerInput instanceof Artifact) {
			Artifact artifact = (Artifact) viewerInput;
			return artifact.getContents().isEmpty() && artifact.getFileContent() != null;
		}
		return false;
	}

}
