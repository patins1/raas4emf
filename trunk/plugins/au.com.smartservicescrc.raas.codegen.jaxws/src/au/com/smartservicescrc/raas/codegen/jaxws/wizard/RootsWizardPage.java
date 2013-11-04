/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package au.com.smartservicescrc.raas.codegen.jaxws.wizard;

import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;

import au.com.smartservicescrc.raas.codegen.jaxws.util.MetamodelUtil;

/**
 * Wizard page to select the root classes. UI is created with WindowBuilder and should only be modified with WindowBuilder!
 */
public class RootsWizardPage extends WizardPage {
	private class TableLabelProvider extends LabelProvider implements ITableLabelProvider {
		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}

		public String getColumnText(Object element, int columnIndex) {
			if (element instanceof EClass) {
				EClass eClass = (EClass) element;
				return eClass.getName();
			}
			return element.toString();
		}
	}

	private static class ContentProvider implements IStructuredContentProvider {
		@Override
		public Object[] getElements(Object inputElement) {
			if (inputElement instanceof GenModel) {
				GenModel genModel = (GenModel) inputElement;
				return MetamodelUtil.getEClasses(genModel).toArray();
			}
			return new Object[0];
		}

		public void dispose() {
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}
	}

	private Table table;
	private final GenModel genModel;
	private CheckboxTableViewer checkboxTableViewer;

	public GenModel getGenModel() {
		return this.genModel;
	}

	/**
	 * Create the wizard.
	 * 
	 * @param genModel
	 */
	public RootsWizardPage(GenModel genModel) {
		super("wizardPage");
		this.genModel = genModel;
		setTitle("Choose classes");
		setDescription("Select the classes for which to generate RAAS webservices");
	}

	/**
	 * Create contents of the wizard.
	 * 
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		checkboxTableViewer = CheckboxTableViewer.newCheckList(container, SWT.BORDER | SWT.FULL_SELECTION);
		table = checkboxTableViewer.getTable();
		table.setBounds(10, 10, 379, 230);
		checkboxTableViewer.setLabelProvider(new TableLabelProvider());
		checkboxTableViewer.setContentProvider(new ContentProvider());
		checkboxTableViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				for (Object obj : ((IStructuredSelection) event.getSelection()).toArray()) {
					EClass eClass = (EClass) obj;
					Collection<EStructuralFeature> refs = MetamodelUtil.getAllReferences(genModel);
					System.out.println(eClass.getName() + ":");
					for (EStructuralFeature ref : refs) {
						EClass referencedClass = (EClass) ref.getEType();
						if (referencedClass.isSuperTypeOf(eClass)) {
							System.out.println("Referenced by " + ref.getEContainingClass().getName() + "." + ref.getName() + " (" + referencedClass.getName() + ")");
						}
					}
				}
			}

		});
		Button btnSelectAll = new Button(container, SWT.NONE);
		btnSelectAll.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getCheckboxTableViewer().setCheckedElements(MetamodelUtil.getEClasses(genModel).toArray());
			}
		});
		btnSelectAll.setBounds(10, 246, 68, 23);
		btnSelectAll.setText("Select All");
		Button btnDeselectAll = new Button(container, SWT.NONE);
		btnDeselectAll.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getCheckboxTableViewer().setCheckedElements(new Object[0]);
			}
		});
		btnDeselectAll.setBounds(82, 246, 68, 23);
		btnDeselectAll.setText("Deselect All");
		Button btnSelectProposed = new Button(container, SWT.NONE);
		btnSelectProposed.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getCheckboxTableViewer().setCheckedElements(MetamodelUtil.getRootClasses(genModel).toArray());
			}
		});
		btnSelectProposed.setBounds(155, 246, 107, 23);
		btnSelectProposed.setText("Select Root Classes");
		getCheckboxTableViewer().setInput(genModel);
		getCheckboxTableViewer().setCheckedElements(MetamodelUtil.getRootClasses(genModel).toArray());
	}

	public CheckboxTableViewer getCheckboxTableViewer() {
		return checkboxTableViewer;
	}

}
