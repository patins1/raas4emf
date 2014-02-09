/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.editor.editor;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.util.CDOURIUtil;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.cdo.view.CDOViewTargetChangedEvent;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.net4j.util.event.IEvent;
import org.eclipse.net4j.util.event.IListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.IFormPage;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertySheetPage;

public class RAASEditorExt extends RAASEditor {

	/**
	 * @ADDED
	 */
	private static final Object EMPTY_INPUT = new Object();

	public static final List<IFormPageFactory> FORMPAGEFACTORIES = new ArrayList<IFormPageFactory>();

	/**
	 * @ADDED
	 */
	protected CDOView view;

	/**
	 * @ADDED
	 */
	public Object viewerInput;

	/**
	 * Adapter that provides the current EditingDomain
	 * 
	 * @since 2.0
	 */
	private class EditingDomainProviderAdapter implements Adapter, IEditingDomainProvider {
		public boolean isAdapterForType(Object type) {
			return type == IEditingDomainProvider.class;
		}

		public EditingDomain getEditingDomain() {
			return editingDomain;
		}

		public Notifier getTarget() {
			return null;
		}

		public void notifyChanged(Notification notification) {
		}

		public void setTarget(Notifier newTarget) {
		}
	}

	private IListener viewTargetListener = new IListener() {
		private CDOID inputID;

		public void notifyEvent(IEvent event) {
			if (event instanceof CDOViewTargetChangedEvent) {
				Object input = selectionViewer.getInput();
				if (input == EMPTY_INPUT) {
					if (inputID != null) {
						try {
							CDOObject object = view.getObject(inputID);
							selectionViewer.setInput(object);
							inputID = null;
						} catch (Exception ex) {
							// Ignore
						}
					}
				} else if (input instanceof EObject) {
					CDOObject object = CDOUtil.getCDOObject((EObject) input);
					if (object.cdoInvalid()) {
						inputID = object.cdoID();
						selectionViewer.setInput(EMPTY_INPUT);
					}
				}
			}
		}
	};

	/**
	 * @ADDED
	 */
	public void createModel() {
		try {
			RAASEditorInput editorInput = (RAASEditorInput) getEditorInput();
			ResourceSet resourceSet = null;
			view = editorInput.getView();
			if (view != null) {
				view.addListener(viewTargetListener);

				resourceSet = view.getResourceSet();
				editingDomain = new AdapterFactoryEditingDomain(adapterFactory, editingDomain.getCommandStack(), resourceSet);

				// This adapter provides the EditingDomain of the Editor
				resourceSet.eAdapters().add(new EditingDomainProviderAdapter());
			} else {
				editingDomain = new AdapterFactoryEditingDomain(adapterFactory, editingDomain.getCommandStack(), new HashMap<Resource, Boolean>());
				adapterFactory = new RAASComposedAdapterFactory(adapterFactory, editingDomain);
			}
			String resourcePath = editorInput.getResourcePath();
			if (editorInput.getModelElement() != null)
				viewerInput = editorInput.getModelElement();
			else if (resourcePath == null) {
				viewerInput = resourceSet;
			} else {
				URI resourceURI = CDOURIUtil.createResourceURI(view, resourcePath);
				viewerInput = resourceSet.getResource(resourceURI, true);
			}

			// resourceSet.eAdapters().add(problemIndicationAdapter);
		} catch (RuntimeException ex) {
			throw ex;
		}
	}

	/**
	 * @ADDED
	 */
	public void refreshViewer(final Object element) {
		try {
			selectionViewer.getControl().getDisplay().asyncExec(new Runnable() {
				public void run() {
					try {
						if (element == null) {
							selectionViewer.refresh(true);
						} else {
							selectionViewer.refresh(element, true);
						}
					} catch (RuntimeException ignore) {
						// Do nothing
					}
				}
			});
		} catch (RuntimeException ignore) {
			// Do nothing
		}
	}

	@Override
	public void createPages() {
		// Creates the model from the editor input
		//
		createModel();

		// Only creates the other pages if there is something that can be edited
		//
		if (!BlobFormPage.canDisplay(viewerInput) && !this.isSearchPage()) {
			// Create a page for the selection tree view.
			//
			Tree tree = new Tree(getContainer(), SWT.MULTI);
			selectionViewer = new TreeViewer(tree);
			selectionViewer.setAutoExpandLevel(2);
			setCurrentViewer(selectionViewer);

			selectionViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory) {

				@Override
				public Object getParent(Object object) {
					Object result = super.getParent(object);
					if (result == object)
						return null;
					return result;
				}

			});
			selectionViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
			// selectionViewer.setInput(editingDomain.getResourceSet());
			selectionViewer.setInput(viewerInput);
			// selectionViewer.setSelection(new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)), true);

			new AdapterFactoryTreeEditor(selectionViewer.getTree(), adapterFactory);

			createContextMenuFor(selectionViewer);
			int pageIndex = addPage(tree);
			setPageText(pageIndex, "Tree");
		}

		getSite().getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				updateProblemIndication();
			}
		});

		for (IFormPageFactory factory : FORMPAGEFACTORIES)
			// master details page
			if (factory.canDisplay(viewerInput)) {
				try {
					IFormPage masterDetailsPage = factory.createInstance(this);
					final int pageIndex = addPage(masterDetailsPage);
					setPageText(pageIndex, factory.getPageText());
					getSite().getShell().getDisplay().asyncExec(new Runnable() {
						public void run() {
							setActivePage(pageIndex);
						}
					});
				} catch (PartInitException e1) {
					e1.printStackTrace();
				}
			}

		// addMEPage();

		if (BlobFormPage.canDisplay(viewerInput)) {
			try {
				IFormPage masterDetailsPage = new BlobFormPage(this);
				final int pageIndex = addPage(masterDetailsPage);
				setPageText(pageIndex, "Blob");
			} catch (PartInitException e1) {
				e1.printStackTrace();
			}
		}

		if (getPageCount() == 1) {
			this.hideTabs();
		}
	}

	// private void addMEPage() {
	// String editorID = "Edit";
	// String editorDesc = "ECP Form";
	// ECPModelelementContext modelElementContext = new ECPModelelementContext() {
	//
	// @Override
	// public void addModelElementContextListener(ModelElementContextListener modelElementContextListener) {
	// }
	//
	// @Override
	// public void removeModelElementContextListener(ModelElementContextListener modelElementContextListener) {
	// }
	//
	// @Override
	// public Collection<EObject> getAllModelElements() {
	// return Collections.EMPTY_LIST;
	// }
	//
	// @Override
	// public Collection<EObject> getAllModelElementsbyClass(EClass clazz, boolean association) {
	// return Collections.EMPTY_LIST;
	// }
	//
	// @Override
	// public EditingDomain getEditingDomain() {
	// return editingDomain;
	// }
	//
	// @Override
	// public ECPMetaModelElementContext getMetaModelElementContext() {
	// return new AbstractECPMetaModelElementContext() {
	//
	// @Override
	// public boolean isAssociationClassElement(EObject eObject) {
	// return false;
	// }
	//
	// @Override
	// public boolean isAssociationClassElement(EClass eClazz) {
	// return false;
	// }
	//
	// @Override
	// public ECPAssociationClassElement getAssociationClassElement(EObject eObject) {
	// return null;
	// }
	//
	// @Override
	// public boolean isNonDomainElement(EClass eClass) {
	// return false;
	// }
	//
	// };
	// }
	//
	// @Override
	// public boolean contains(EObject eObject) {
	// return true;
	// }
	//
	// @Override
	// public void dispose() {
	// }
	// };
	// MEEditorPage mePage = new MEEditorPage(this, editorID, editorDesc, modelElementContext, (EObject) viewerInput) {
	//
	// protected void sortAndOrderAttributes() {
	//
	// AdapterFactoryItemDelegator adapterFactoryItemDelegator = new AdapterFactoryItemDelegator(adapterFactory);
	//
	// Collection<IItemPropertyDescriptor> propertyDescriptors = adapterFactoryItemDelegator.getPropertyDescriptors(modelElement);
	//
	// filterHiddenAttributes(propertyDescriptors);
	//
	// if (propertyDescriptors != null) {
	// AnnotationPositionDescriptor positionDescriptor = new AnnotationPositionDescriptor();
	// for (IItemPropertyDescriptor itemPropertyDescriptor : propertyDescriptors) {
	// String value = positionDescriptor.getValue(itemPropertyDescriptor, modelElement);
	// if (value.equals("left")) {
	// leftColumnAttributes.add(itemPropertyDescriptor);
	// } else if (value.equals("right")) {
	// rightColumnAttributes.add(itemPropertyDescriptor);
	// } else if (value.equals("bottom")) {
	// bottomAttributes.add(itemPropertyDescriptor);
	// } else {
	// leftColumnAttributes.add(itemPropertyDescriptor);
	// }
	// }
	//
	// final HashMap<IItemPropertyDescriptor, Double> priorityMap = new HashMap<IItemPropertyDescriptor, Double>();
	// AnnotationPriorityDescriptor priorityDescriptor = new AnnotationPriorityDescriptor();
	// for (IItemPropertyDescriptor itemPropertyDescriptor : propertyDescriptors) {
	// priorityMap.put(itemPropertyDescriptor, priorityDescriptor.getValue(itemPropertyDescriptor, modelElement));
	// }
	//
	// Comparator<IItemPropertyDescriptor> comparator = new Comparator<IItemPropertyDescriptor>() {
	// public int compare(IItemPropertyDescriptor o1, IItemPropertyDescriptor o2) {
	// return Double.compare(priorityMap.get(o1), priorityMap.get(o2));
	// }
	// };
	// Collections.sort(leftColumnAttributes, comparator);
	// Collections.sort(rightColumnAttributes, comparator);
	// Collections.sort(bottomAttributes, comparator);
	//
	// }
	//
	// }
	//
	// };
	// try {
	// addPage(mePage);
	// } catch (PartInitException e) {
	// CMSActivator.err(e);
	// }
	// }

	public boolean isDirty() {
		if (isSearchPage())
			return false;
		return super.isDirty();
	}

	public boolean isSearchPage() {
		return !((RAASEditorInput) getEditorInput()).isPersistent();
	}

	/**
	 * This accesses a cached version of the property sheet. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IPropertySheetPage getPropertySheetPage() {
		PropertySheetPage propertySheetPage = (PropertySheetPage) super.getPropertySheetPage();
		propertySheetPage.setPropertySourceProvider(new AdapterFactoryContentProvider(adapterFactory) {
			@Override
			protected IPropertySource createPropertySource(final Object object, final IItemPropertySource itemPropertySource) {
				return new PropertySource(object, itemPropertySource) {
					@Override
					protected IPropertyDescriptor createPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor) {
						return new PropertyDescriptor(object, itemPropertyDescriptor) {

							public ILabelProvider getLabelProvider() {
								final IItemLabelProvider itemLabelProvider = itemPropertyDescriptor.getLabelProvider(object);
								return new LabelProvider() {
									@Override
									public String getText(Object object) {
										if (object instanceof Date) {
											return object.toString();
										}
										return itemLabelProvider.getText(object);
									}

									@Override
									public Image getImage(Object object) {
										return ExtendedImageRegistry.getInstance().getImage(itemLabelProvider.getImage(object));
									}
								};
							}

							@Override
							public CellEditor createPropertyEditor(Composite composite) {
								EStructuralFeature eStructuralFeature = (EStructuralFeature) itemPropertyDescriptor.getFeature(object);
								EClassifier eType = eStructuralFeature.getEType();
								if (eType instanceof EDataType) {
									EDataType eDataType = (EDataType) eType;
									if (eDataType.getInstanceClass() == Date.class) {
										EObject eObject = (EObject) object;
										final Date aDate2 = (Date) eObject.eGet(eStructuralFeature);
										return new ExtendedDialogCellEditor(composite, getEditLabelProvider()) {
											protected Object openDialogBox(Control cellEditorWindow) {
												final DateTime dateTime[] = new DateTime[1];
												final Date[] date = new Date[1];
												Dialog d = new Dialog(cellEditorWindow.getShell()) {
													protected Control createDialogArea(Composite parent) {
														Composite dialogArea = (Composite) super.createDialogArea(parent);
														dateTime[0] = new DateTime(dialogArea, SWT.CALENDAR);
														final Date aDate = aDate2 != null ? aDate2 : new Date();
														if (aDate != null) {
															GregorianCalendar calendar = new GregorianCalendar();
															calendar.setTime(aDate);
															dateTime[0].setDate(calendar.get(GregorianCalendar.YEAR), calendar.get(GregorianCalendar.MONTH), calendar.get(GregorianCalendar.DAY_OF_MONTH));
														}
														dateTime[0].addSelectionListener(new SelectionAdapter() {
															public void widgetSelected(SelectionEvent e) {
																Date dateValue = new GregorianCalendar(dateTime[0].getYear(), dateTime[0].getMonth(), dateTime[0].getDay()).getTime();
																date[0] = dateValue;
																super.widgetSelected(e);
															}
														});
														return dialogArea;
													}
												};
												d.setBlockOnOpen(true);
												d.open();
												if (d.getReturnCode() == Dialog.OK) {
													return date[0];
												}
												return null;
											}
										};
									}
								}
								return super.createPropertyEditor(composite);
							}
						};
					}
				};
			}
		});

		return propertySheetPage;
	}

	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		((RAASEditorInput) getEditorInput()).doSave(progressMonitor);
		super.doSave(progressMonitor);
	}

	protected boolean showOutlineView() {
		return false;
	}

}
