/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.views;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.command.PasteFromClipboardCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.jface.resource.ResourceManager;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.rap.rwt.client.ClientFile;
import org.eclipse.rap.rwt.dnd.ClientFileTransfer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.dnd.TransferData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.raas4emf.cms.core.IGeometricIDResolver;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.DemoActionBarAdvisor;
import org.raas4emf.cms.ui.FilteredTreeWithoutExpansion;
import org.raas4emf.cms.ui.IInputChanged;
import org.raas4emf.cms.ui.RAASUIUtils;
import org.raas4emf.cms.ui.ViewAsEditor;
import org.raas4emf.cms.ui.actions.AddArtifactAction;
import org.raas4emf.cms.ui.actions.EditAction;
import org.raas4emf.cms.ui.actions.RAASDeleteAction;
import org.raas4emf.cms.ui.editor.editor.PersistentRAASActionBarContributor;
import org.raas4emf.cms.ui.editor.editor.RAASActionBarContributor;

import raascms.Artifact;
import raascms.Folder;
import raascms.RaascmsFactory;

public class FilesView extends ViewPart implements IDoubleClickListener, ISelectionListener, IViewerProvider, IEditingDomainProvider, IMenuListener, IInputChanged {

	public static final String RECYCLE_BIN = "Recycle Bin";
	private boolean ENABLE_FULL_MENU = true;
	private TreeViewer viewer;
	private ExtendedPropertySheetPage propertySheetPage;
	private LocalResourceManager resourceManager;
	private ComposedAdapterFactory adapterFactory;
	private RAASActionBarContributor menuContributor;
	private MenuManager menuMgr;
	private AdapterFactoryEditingDomain editingDomain;
	public PatternFilter patternFilter;
	protected Composite tree;
	private boolean causedSelection = false;

	public void createPartControl(final Composite parent) {
		patternFilter = new PatternFilter() {
			private String[] patternStrings;

			@Override
			protected boolean isParentMatch(Viewer viewer, Object element) {
				if (!(element instanceof Folder))
					return false;
				return super.isParentMatch(viewer, element);
			}

			public void setPattern(String patternString) {
				super.setPattern(patternString);
				if (patternString == null)
					patternString = "";
				this.patternStrings = patternString.trim().toLowerCase().split(" ");
			}

			protected boolean wordMatches(String text) {
				if (text == null) {
					text = "";
				}
				if (patternStrings == null) {
					return true;
				}
				text = text.toLowerCase();
				for (String patternString : patternStrings)
					if (!text.contains(patternString))
						return false;
				return true;
			}
		};

		patternFilter.setIncludeLeadingWildcard(true);
		if (Boolean.valueOf(CMSActivator.getSessionInstance().getParameter("notreefilter"))) {
			viewer = new TreeViewer(parent);
			viewer.setAutoExpandLevel(5);
			tree = viewer.getTree();
		} else {
			tree = new FilteredTreeWithoutExpansion(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL, patternFilter, true);
			viewer = ((FilteredTreeWithoutExpansion) tree).getViewer();
		}
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(allowWriteAccess() ? new ReflectiveItemProviderAdapterFactory() : new ReadonlyReflectiveItemProviderAdapterFactory());
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, new BasicCommandStack(), new HashMap<Resource, Boolean>()) {

			@Override
			public Command createCommand(Class<? extends Command> commandClass, final CommandParameter commandParameter) {
				if (!allowWriteAccess()) {
					return UnexecutableCommand.INSTANCE;
				}
				final Object parent = commandParameter.getOwner();
				Command result = null;
				if (commandClass == PasteFromClipboardCommand.class) {
					result = new PasteFromClipboardCommand(this, commandParameter.getOwner(), commandParameter.getFeature(), commandParameter.getIndex(), getOptimizeCopy())

					{

						@Override
						public void doExecute() {
							// We need to check canExecute() here in case prepare() went down the "optimize" path.
							//
							if (command.canExecute()) {
								if (parent instanceof Folder) {
									Folder folder = (Folder) parent;
									uniqueNamesForChildren(folder, command.getResult());
								}
								command.execute();
							} else {
								// Thread.dumpStack();
							}
						}

					};
				} else if (commandClass == DragAndDropCommand.class) {
					// DragAndDropCommand.Detail detail = (DragAndDropCommand.Detail) commandParameter.getFeature();
					boolean allArtifactsOrFolders = true;
					for (Object element : commandParameter.getCollection()) {
						allArtifactsOrFolders &= element instanceof Artifact || element instanceof Folder;
					}
					if (allArtifactsOrFolders && commandParameter.getOwner() instanceof Folder) {
						final Folder parentFolder = (Folder) commandParameter.getOwner();
						if (!DirectoryView.checkCanWrite(parentFolder, null) || !RAASDeleteAction.canBeRemoved(commandParameter.getCollection())) {
							return UnexecutableCommand.INSTANCE;
						}
						result = new AbstractCommand() {

							@Override
							public void execute() {
								uniqueNamesForChildren(parentFolder, commandParameter.getCollection());
								for (Object element : commandParameter.getCollection()) {
									if (element != parentFolder) {
										if (element instanceof Folder) {
											Folder folder = (Folder) element;
											parentFolder.getFolders().add(folder);
										} else {
											Artifact artifact = (Artifact) element;
											parentFolder.getArtifacts().add(artifact);
										}
									}
								}
							}

							protected boolean prepare() {
								return true;
							}

							@Override
							public void redo() {
								// cannot redo
							}
						};

					}
				}
				if (result == null)
					result = super.createCommand(commandClass, commandParameter);
				if (!(result instanceof UnexecutableCommand || result instanceof CommandActionDelegate)) {
					result = new CommandWrapper(result) {

						@Override
						public void execute() {
							super.execute();
							RAASUtils.doSaveAsSubTask(CMSActivator.getSessionInstance().openTransaction().getRootResource(), this.getLabel(), new NullProgressMonitor());
						}

					};
				}
				return result;
			}

		};
		viewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory) {
			@Override
			public Object[] getElements(Object object) {
				Object[] result = getChildrenFor(object);
				if (result != null)
					return result;
				return super.getElements(object);
			}

			@Override
			public Object[] getChildren(Object object) {
				Object[] result = getChildrenFor(object);
				if (result != null)
					return result;
				result = super.getChildren(object);
				if (Arrays.asList(result).contains(null)) {
					List<Object> list = new ArrayList<Object>(Arrays.asList(result));
					RAASUtils.removeNulls(object, list);
					result = list.toArray();
				}
				return result;
			}

			@Override
			public Object getParent(Object object) {
				Object result = getParentFor(object);
				if (result != null)
					return result;
				result = super.getParent(object);
				if (result == object)
					return null;
				return result;
			}

			@Override
			public boolean hasChildren(Object object) {
				Boolean result = hasChildrenFor(object);
				if (result != null)
					return result;
				return super.hasChildren(object);
			}

		});
		viewer.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return showElement(element);
			}

		});
		// viewer.setLabelProvider(new
		// AdapterFactoryLabelProvider(adapterFactory));
		// IServiceManager manager = RWT.getServiceManager();
		// IServiceHandler handler = new DownloadServiceHandler(this);
		// manager.registerServiceHandler( "downloadServiceHandler", handler );

		ILabelDecorator labelDecorator = PlatformUI.getWorkbench().getDecoratorManager().getLabelDecorator();
		ILabelProvider labelProvider = new DecoratingLabelProvider(createLabelProvider(adapterFactory), labelDecorator);
		viewer.setLabelProvider(labelProvider);
		updateInput();
		viewer.addDoubleClickListener(this);
		getSite().setSelectionProvider(viewer);

		if ((allowWriteAccess() || true) && !Boolean.valueOf(CMSActivator.getSessionInstance().getParameter("nocontextmenu"))) {
			IActionBars actionBars = ((IViewSite) getSite()).getActionBars();
			menuMgr = (MenuManager) actionBars.getMenuManager();
			menuMgr.setRemoveAllWhenShown(true);
			Menu menu = menuMgr.createContextMenu(viewer.getControl());
			viewer.getControl().setMenu(menu);
			getSite().registerContextMenu(menuMgr, viewer);

			if (ENABLE_FULL_MENU && CMSActivator.getSessionInstance().isLibarian()) {
				menuMgr.add(new Separator("additions")); //$NON-NLS-1$
				menuMgr.add(new Separator("edit")); //$NON-NLS-1$
				menuMgr.addMenuListener(this);
				menuContributor = new PersistentRAASActionBarContributor(this.getClass().getName());
				menuContributor.init(actionBars, this.getSite().getPage());
				menuContributor.setActiveEditor(new ViewAsEditor(this, this, viewer));
			}
		}

		if (allowWriteAccess()) {
			int dndOperations = DND.DROP_MOVE;
			Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance(), ClientFileTransfer.getInstance() };
			viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(viewer));
			viewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(editingDomain, viewer) {

				@Override
				public void drop(DropTargetEvent event) {
					super.drop(event);
					if (event.data instanceof ClientFile[]) {
						ClientFile[] clientFiles = (ClientFile[]) event.data;
						
						Folder repoRoot = (Folder) RAASUtils.findByPath("RepositoryRoot");						
						for (Object object: RAASUIUtils.getSelection(viewer.getSelection())) {
							if (object instanceof Folder) {
								Folder folder = (Folder) object;
								repoRoot = folder;
							}
							if (object instanceof Artifact) {
								Artifact artifact = (Artifact) object;
								repoRoot = (Folder) artifact.eContainer();
							}
						}						

						new AddArtifactAction() {
							
							public FileDialog createFileDialog(org.eclipse.swt.widgets.Shell shell) {

								return new FileDialog(shell, SWT.TITLE | SWT.MULTI) {

									  protected void runEventLoop( Shell shell ) {									    
									    try {
											Method m = FileDialog.class.getDeclaredMethod("handleFileDrop", ClientFile[].class);
											m.setAccessible(true);
											m.invoke(this, (Object)clientFiles);
										} catch (Exception e) {
											e.printStackTrace();
										}
									    super.runEventLoop(shell);
									  }
									  
								};
								
							}
							
						}.execute(repoRoot, getSite().getShell(), false, null);
						
					}
				}				

				public void dropAccept(DropTargetEvent event) {
					if (event.dataTypes==null && event.currentDataType!=null)
						event.dataTypes = new TransferData[] {event.currentDataType};						
					super.dropAccept(event);
				}
				
			});
		}

		selectionChanged(null, getSite().getPage().getSelection());
		getSite().getPage().addSelectionListener(this);

		Browser browser = new Browser(parent, CMSActivator.getSessionInstance().getBrowserType());
		browser.setText("<script type=\"text/javascript\">var inSyncSelection; window.addEventListener('message', function (event) { if (event.data.select3d && !inSyncSelection) { inSyncSelection=true; syncSelection(event.data.select3d); setTimeout(function(){ inSyncSelection = false; },100); } } );</script>");
		browser.setVisible(false);
		new BrowserFunction(browser, "syncSelection") {

			public Object function(Object[] arguments) {
				List<Object> newSel = new ArrayList<Object>();
				for (Object guid : (Object[]) arguments[0]) {
					Object adapter = Platform.getAdapterManager().getAdapter(guid, IGeometricIDResolver.class);
					if (adapter instanceof IGeometricIDResolver) {
						IGeometricIDResolver iGeometricIDResolver = (IGeometricIDResolver) adapter;
						Object eObject = iGeometricIDResolver.resolve((Artifact) viewer.getInput());
						newSel.add(eObject);
					}
				}
				causedSelection = true;
				try {
					FilesView.this.selectionChanged(null, new StructuredSelection(newSel));
				} finally {
					causedSelection = false;
				}
				return true;
			}

		};
		GridLayout grid = new GridLayout(1, false);
		grid.marginBottom = grid.marginHeight = grid.marginLeft = grid.marginRight = grid.marginTop = grid.marginWidth = grid.verticalSpacing = grid.horizontalSpacing = 0;
		parent.setLayout(grid);
		browser.setLayoutData(new GridData(0, 0));
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

	}

	public void clearInput() {
		viewer.getTree().clearAll(true); // prevent problems with StructuredViewer.preservingSelection
		viewer.setInput(new Object[] {});
	}

	public void updateInput() {
		try {
			CDOView trans = CMSActivator.getSessionInstance().openTransaction();
			getRootContent(trans.getRootResource(), trans);
			viewer.setInput(getInitialInput(trans));
		} catch (Exception e) {
			CMSActivator.err(e);
			// do nothing
		}
	}

	protected boolean allowWriteAccess() {
		return CMSActivator.getSessionInstance().isLibarian() && !Boolean.valueOf(CMSActivator.getSessionInstance().getParameter("readonly"));
	}

	protected Object getInitialInput(CDOView trans) {
		return trans.getRootResource();
	}

	protected Boolean hasChildrenFor(Object object) {
		if (object instanceof Folder) {
			// for speed
			Folder folder = (Folder) object;
			return !folder.getFolders().isEmpty() || !folder.getArtifacts().isEmpty();
		}
		return null;
	}

	public AdapterFactoryLabelProvider createLabelProvider(ComposedAdapterFactory adapterFactory) {
		return new AdapterFactoryLabelProvider(adapterFactory) {

			@Override
			public String getText(Object object) {
				String result = getLabelFor(object);
				if (result != null && !"".equals(result))
					return result;
				return super.getText(object);
			}

			@Override
			public Image getImage(Object object) {
				Image result = getImageFor(object);
				if (result != null)
					return result;
				return super.getImage(object);
			}

		};
	}

	public String getLabelFor(Object object) {
		return RAASUtils.getNameOf(object);
	}

	/**
	 * Returns an image descriptor for this file system element
	 */
	public ImageDescriptor getImageDescriptor(Object object) {
		if (object instanceof Folder) {
			return PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_OBJ_FOLDER);
		} else if (object instanceof Artifact) {
			Artifact artifact = (Artifact) object;
			String name = artifact.getName();
			return PlatformUI.getWorkbench().getEditorRegistry().getImageDescriptor(name != null ? name : "");
		}
		return null;
	}

	/**
	 * See WorkbenchLabelProvider
	 * 
	 * @param object
	 * @return
	 */

	public Image getImageFor(Object element) {
		ImageDescriptor descriptor = getImageDescriptor(element);
		if (descriptor == null) {
			return null;
		}

		return (Image) getResourceManager().get(descriptor);
	}

	/**
	 * Lazy load the resource manager
	 * 
	 * @return The resource manager, create one if necessary
	 */
	private ResourceManager getResourceManager() {
		if (resourceManager == null) {
			resourceManager = new LocalResourceManager(JFaceResources.getResources());
		}

		return resourceManager;
	}

	@SuppressWarnings("rawtypes")
	public Object getAdapter(final Class adapter) {
		Object result = super.getAdapter(adapter);
		if (adapter == IPropertySheetPage.class) {
			if (propertySheetPage == null) {
				propertySheetPage = getPropertySheetPage();
			}
			result = propertySheetPage;
		}
		return result;
	}

	public void setFocus() {
		viewer.getTree().setFocus();
	}

	public void doubleClick(final DoubleClickEvent event) {
		if (event.getSelection() instanceof IStructuredSelection) {
			IStructuredSelection iStructuredSelection = (IStructuredSelection) event.getSelection();
			Object firstElement = iStructuredSelection.getFirstElement();
			if (firstElement instanceof Folder) {
				Folder folder = (Folder) firstElement;
				viewer.setExpandedState(folder, !viewer.getExpandedState(folder));
			} else if (firstElement instanceof EObject && !(firstElement instanceof Artifact)) {
				EObject eObject = (EObject) firstElement;
				for (PreviewView preview : PreviewView.findView()) {
					if (preview.locate(Arrays.asList(eObject)))
						return;
				}
				if (CMSActivator.getSessionInstance().propagateTreeSelection(event.getSelection(), true))
					return;
			}
		}
		EditAction.openEditor(event.getSelection());
	}

	public TreeViewer getViewer() {
		return viewer;
	}

	public EList<EObject> getRootContent(CDOResource modelElement, CDOView trans) {
		EList<EObject> result = modelElement.getContents();
		if (!allowWriteAccess()) return result;
		if (result.isEmpty()) {
			CMSActivator.log("Adding root resource");
			((CDOTransaction) trans).createResource(RAASUtils.ROOT_RESOURCE_NAME);
			result = modelElement.getContents();
		}
		for (EObject res : result) {
			Folder repositoryRoot = addFolder(res, "RepositoryRoot");
			addCustomFolders(repositoryRoot);
			Folder experimentsFolder = addFolder(repositoryRoot, "Experiments");
			addFolder(repositoryRoot, RECYCLE_BIN);
			addFolder(experimentsFolder, TypeSelectionView.TEMPLATE_TYPE_SELECTION_BUILDING);
			addFolder(experimentsFolder, DemoActionBarAdvisor.USER_INTERFACE);
			try {
				if (res instanceof CDOResource) {
					CDOResource cdoResource = (CDOResource) res;
//					if (cdoResource.isModified()) {
						cdoResource.save(Collections.EMPTY_MAP);
						CMSActivator.log("Saving root resource");
//					}
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			break;
		}
		return result;
	}

	protected void addCustomFolders(Folder repositoryRoot) {
		// nothing to add by default
	}

	protected Folder addFolder(EObject parent, String name) {
		Object existingFolder = RAASUtils.getChildWithName(parent, name);
		if (existingFolder instanceof Folder)
			return (Folder) existingFolder;
		if (!CMSActivator.getSessionInstance().isLibarian()) {
			throw new RuntimeException("No RAAS content exists yet! Note: Only a libarian can add content.");
		}
		Folder result = RaascmsFactory.eINSTANCE.createFolder();
		result.setName(name);
		CMSActivator.log("Adding folder " + name);
		RAASUtils.addToContent(parent, result);
		return result;
	}

	public boolean showElement(Object element) {
		return true;
	}

	public EObject[] getChildrenFor(Object object) {
		return null;
	}

	public EObject getParentFor(Object object) {
		return null;
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (!causedSelection) {
			CMSActivator.getSessionInstance().propagateTreeSelection(selection, false);
		}
		if (selection != null && !selection.equals(viewer.getSelection()) && !selection.isEmpty()) {
			viewer.setSelection(selection, true);
		}
		if (menuContributor != null && selection != null)
			menuContributor.selectionChanged(new SelectionChangedEvent(viewer, selection));
	}

	@Override
	public void dispose() {
		getSite().getPage().removeSelectionListener(this);
		super.dispose();
	}

	@Override
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	/**
	 * This accesses a cached version of the property sheet. <br>
	 * Note: copied from the CDOEditor class
	 */
	public ExtendedPropertySheetPage getPropertySheetPage() {
		if (propertySheetPage == null) {
			propertySheetPage = new ExtendedPropertySheetPage((AdapterFactoryEditingDomain) getEditingDomain()) {
				@Override
				public void setSelectionToViewer(List<?> selection) {
					FilesView.this.setSelectionToViewer(selection);
					FilesView.this.setFocus();
				}

				@Override
				public void setActionBars(IActionBars actionBars) {
					super.setActionBars(actionBars);
					// getActionBarContributor().shareGlobalActions(this, actionBars);
				}

				@Override
				public void makeContributions(IMenuManager menuManager, IToolBarManager toolBarManager, IStatusLineManager statusLineManager) {
					// do nothing
				}

			};
			propertySheetPage.setPropertySourceProvider(new AdapterFactoryContentProvider(adapterFactory));
		}

		return propertySheetPage;
	}

	protected void setSelectionToViewer(List<?> selection) {
		// nothing to do
	}

	@Override
	public void menuAboutToShow(IMenuManager manager) {
		if (menuContributor != null)
			menuContributor.menuAboutToShow(menuMgr);
	}

	public static void uniqueNamesForChildren(Folder folder, Collection<?> newChildren) {
		Set<String> names = RAASUtils.getNamesOfChildren(folder);
		for (Object object : newChildren) {
			String name = RAASUtils.getNameOf(object);
			if (names.contains(name)) {
				String copyName = name.endsWith(" - Copy") ? name : name + " - Copy";
				if (names.contains(copyName)) {
					for (int i = 1;; i++) {
						String copyNameIth = copyName + " (" + i + ")";
						if (!names.contains(copyNameIth)) {
							copyName = copyNameIth;
							break;
						}
					}
				}
				RAASUtils.setNameOf((EObject) object, copyName);
				names.add(copyName);
			}
		}
	}

	public Composite getTree() {
		return tree;
	}

}
