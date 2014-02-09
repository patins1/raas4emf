/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.common.lob.CDOBlob;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.RAASUIUtils;

import raascms.Artifact;
import raascms.Folder;
import raascms.RaascmsFactory;
import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcColourOrFactor;
import IFC2X3.IfcColourRgb;
import IFC2X3.IfcElement;
import IFC2X3.IfcMappedItem;
import IFC2X3.IfcObjectPlacement;
import IFC2X3.IfcOpeningElement;
import IFC2X3.IfcPresentationStyleAssignment;
import IFC2X3.IfcPresentationStyleSelect;
import IFC2X3.IfcProductRepresentation;
import IFC2X3.IfcRepresentation;
import IFC2X3.IfcRepresentationContext;
import IFC2X3.IfcRepresentationItem;
import IFC2X3.IfcRepresentationMap;
import IFC2X3.IfcStyledItem;
import IFC2X3.IfcSurfaceStyle;
import IFC2X3.IfcSurfaceStyleElementSelect;
import IFC2X3.IfcSurfaceStyleRendering;
import IFC2X3.IfcSurfaceStyleShading;
import IFC2X3.IfcWall;

public class MaterializeIFCAction extends AbstractHandler {

	private List<Artifact> importables;
	private Shell shell;
	private Map<IfcSurfaceStyle, String> noNamedStyles = new WeakHashMap<IfcSurfaceStyle, String>();

	public MaterializeIFCAction() {
		super();
	}

	protected IStatus runJob(final IProgressMonitor monitor, List<EObject> selection) {
		IStatus result = Status.OK_STATUS;
		for (EObject element : selection) {
			if (monitor.isCanceled())
				return Status.CANCEL_STATUS;
			collectImportable(element);
		}
		monitor.beginTask("Separating materials", importables.size());
		for (Artifact artifact : importables) {
			if (monitor.isCanceled())
				return Status.CANCEL_STATUS;
			result = process(monitor, result, artifact);
		}
		monitor.done();
		return result;
	}

	private void collectImportable(EObject element) {
		if (element instanceof Folder) {
			Folder folder = (Folder) element;

			Artifact artifact = RAASUtils.getGeometryArtifact(folder, ".ifc");
			if (artifact != null)
				collectImportable(artifact);
			for (Folder subfolder : folder.getFolders())
				collectImportable(subfolder);
		}
		if (element instanceof Artifact) {
			Artifact artifact = (Artifact) element;
			if (RAASUtils.hasExtension(artifact, ".ifc")) {
				importables.add(artifact);
			}
		}
	}

	private IStatus process(final IProgressMonitor monitor, IStatus result, final Artifact artifact) {
		shell.getDisplay().syncExec(new Runnable() {
			public void run() {
				shell.getDisplay().readAndDispatch();
				monitor.subTask("Parse " + artifact.getName());

				Folder folder = (Folder) artifact.eContainer();
				Artifact ifcModel;
				try {
					Map<IfcSurfaceStyle, Collection<IfcRepresentationItem>> styleMap = new HashMap<IfcSurfaceStyle, Collection<IfcRepresentationItem>>();
					Map<IfcRepresentationItem, Collection<IfcElement>> itemMap = new HashMap<IfcRepresentationItem, Collection<IfcElement>>();
					Map<IfcElement, Collection<IfcSurfaceStyle>> elementMap = new HashMap<IfcElement, Collection<IfcSurfaceStyle>>();
					Map<IfcElement, Collection<IfcRepresentationItem>> elementToItem = new HashMap<IfcElement, Collection<IfcRepresentationItem>>();

					ifcModel = RAASUtils.assureModelTree(RAASUtils.getModelBlob(artifact));
					if (ifcModel != null) {
						// ifcModel.setName(ifcModel.getName().replace(".ifc", ".mat.ifc"));
						ifcModel.setName("index.ifc");
						monitor.subTask("Separate materials in " + folder.getName());
						String gColors = "";
						TreeIterator<EObject> it = ifcModel.eAllContents();
						while (it.hasNext()) {
							EObject eo = it.next();
							if (eo instanceof IfcElement) {
								IfcElement ifcElement = (IfcElement) eo;
								if (ifcElement instanceof IfcWall)
									continue;
								if (ifcElement instanceof IfcOpeningElement)
									continue;
								if (ifcElement.getRepresentation() != null) {
									for (IfcRepresentation ifcRepresentation : ifcElement.getRepresentation().getRepresentations()) {
										IfcRepresentationContext context = ifcRepresentation.getContextOfItems();
										if (context != null && "Box".equals(context.getContextIdentifier())) {
											// bounding box
											break;
										}
										for (IfcRepresentationItem item : ifcRepresentation.getItems()) {
											if (item instanceof IfcMappedItem) {
												IfcMappedItem solid = (IfcMappedItem) item;
												IfcRepresentationMap repMap = solid.getMappingSource();
												IfcRepresentation rep = repMap.getMappedRepresentation();
												for (IfcRepresentationItem repItem : rep.getItems()) {
													addItem(ifcElement, repItem, styleMap, itemMap, elementToItem);
												}
											} else {
												addItem(ifcElement, item, styleMap, itemMap, elementToItem);
											}
										}
									}
								}
							}
						}
						Set<String> styleNames = new HashSet<String>();
						for (IfcSurfaceStyle style : styleMap.keySet()) {
							Set<IfcElement> diffElements = new HashSet<IfcElement>();
							int count = 0;
							for (IfcRepresentationItem item : styleMap.get(style)) {
								count += itemMap.get(item).size();
								diffElements.addAll(itemMap.get(item));
							}
							for (IfcElement element : diffElements) {
								Collection<IfcSurfaceStyle> styles = elementMap.get(element);
								if (styles == null)
									elementMap.put(element, styles = new HashSet<IfcSurfaceStyle>());
								styles.add(style);
							}
							if (!styleNames.add(style.getName())) {
								CMSActivator.err(style.getName() + " added twice!");
							}
							CMSActivator.log(style.getName() + " has " + styleMap.get(style).size() + " repitems from " + count + " elements" + (count != diffElements.size() ? "(" + diffElements.size() + " different elements)" : ""));
							gColors += addItem2(style);
						}
						if (styleMap.isEmpty())
							CMSActivator.log("Stylemap empty!");
						if (gColors.length() > 0) {
							gColors = "{\n" + gColors.substring(0, gColors.length() - 1) + "\n}";
							CMSActivator.log(gColors);

							monitor.subTask("Restructure geometry in " + folder.getName());

							for (IfcElement ifcElement : elementMap.keySet()) {
								boolean handledFirst = false;
								IfcRepresentation origRepresentation = ifcElement.getRepresentation().getRepresentations().get(0);
								IfcRepresentationContext context = ifcElement.getRepresentation().getRepresentations().get(0).getContextOfItems();
								ifcElement.getRepresentation().getRepresentations().clear();
								Collection<IfcRepresentationItem> remaining = new HashSet<IfcRepresentationItem>(elementToItem.get(ifcElement));
								for (IfcSurfaceStyle style : elementMap.get(ifcElement)) {
									separate(elementToItem, ifcElement, handledFirst, origRepresentation, context, remaining, style, new HashSet<IfcRepresentationItem>(styleMap.get(style)));
									handledFirst = true;
								}
								if (!remaining.isEmpty()) {
									separate(elementToItem, ifcElement, handledFirst, origRepresentation, context, remaining, null, remaining);
								}
								// EcoreUtil.delete(ifcElement);
							}
							RAASUtils.setModificationDate(ifcModel, new Date());
							InputStream is = ifcModel.asFile(ifcModel.getName());
							ifcModel.setFileContent(new CDOBlob(is));
							ifcModel.getContents().clear();
							ifcModel.setModelDate(null);
							RAASUtils.setModificationDate(ifcModel, new Date());
							Artifact colorscheme = RaascmsFactory.eINSTANCE.createArtifact();
							colorscheme.setFileContent(new CDOBlob(new ByteArrayInputStream(gColors.getBytes())));
							colorscheme.setName("default.colorscheme");
							for (Artifact artifact : new ArrayList<Artifact>(folder.getArtifacts())) {
								if (artifact.getName().equals(ifcModel.getName()) || artifact.getName().equals(colorscheme.getName()) || artifact.getName().endsWith(".mod.ifc") || artifact.getName().endsWith(".mat.ifc")) {
									folder.getArtifacts().remove(artifact);
								}
							}
							folder.getArtifacts().add(ifcModel);
							folder.getArtifacts().add(colorscheme);
							monitor.subTask("Save changes in " + folder.getName());
							RAASUtils.doSave(folder, "Save tree editor");
						}
					}
				} catch (Exception e) {
					CMSActivator.err("Failed to separate materials for " + artifact.getName());
					CMSActivator.err(e);
				}
				monitor.worked(1);
				shell.getDisplay().readAndDispatch();
			}

			private void separate(Map<IfcElement, Collection<IfcRepresentationItem>> elementToItem, IfcElement ifcElement, boolean handledFirst, IfcRepresentation origRepresentation, IfcRepresentationContext context, Collection<IfcRepresentationItem> remaining, IfcSurfaceStyle style, Collection<IfcRepresentationItem> reps) {
				IfcElement copyElement = ifcElement;
				if (handledFirst) {
					copyElement = RAASUtils.addIfcObjectToModel(copy(ifcElement), ifcElement);
					IfcProductRepresentation productRepresentation = RAASUtils.addIfcObjectToModel(IFC2X3Factory.eINSTANCE.createIfcProductRepresentation(), ifcElement);
					copyElement.setRepresentation(productRepresentation);
					IfcObjectPlacement placement = RAASUtils.addIfcObjectToModel(copy(ifcElement.getObjectPlacement()), ifcElement);
					copyElement.setObjectPlacement(placement);
				}
				copyElement.setGlobalId(ifcElement.getGlobalId().substring(0, 22) + (style == null ? "_nostyle" : getStyleName(style)));
				IfcRepresentation representation = RAASUtils.addIfcObjectToModel(copy(origRepresentation), ifcElement);
				representation.getItems().clear();
				representation.setContextOfItems(context);
				copyElement.getRepresentation().getRepresentations().add(representation);
				reps.retainAll(elementToItem.get(ifcElement));
				representation.getItems().addAll(reps);
				remaining.removeAll(reps);
			}
		});
		return result;
	}

	public static <T extends EObject> T copy(T eObject) {
		EcoreUtil.Copier copier = new EcoreUtil.Copier() {

			protected void copyReference(EReference eReference, EObject eObject, EObject copyEObject) {
				if (eObject.eIsSet(eReference)) {
					if (eReference.isMany()) {
						@SuppressWarnings("unchecked")
						InternalEList<EObject> source = (InternalEList<EObject>) eObject.eGet(eReference);
						@SuppressWarnings("unchecked")
						InternalEList<EObject> target = (InternalEList<EObject>) copyEObject.eGet(getTarget(eReference));
						if (source.isEmpty()) {
							target.clear();
						} else {
							boolean isBidirectional = eReference.getEOpposite() != null;
							int index = 0;
							for (Iterator<EObject> k = resolveProxies ? source.iterator() : source.basicIterator(); k.hasNext();) {
								EObject referencedEObject = k.next();
								EObject copyReferencedEObject = get(referencedEObject);
								if (copyReferencedEObject == null) {
									if (useOriginalReferences && !isBidirectional) {
										target.addUnique(index, referencedEObject);
										++index;
									}
								} else {
									if (isBidirectional) {
										int position = target.indexOf(copyReferencedEObject);
										if (position == -1) {
											target.addUnique(index, copyReferencedEObject);
										} else if (index != position) {
											target.move(index, copyReferencedEObject);
										}
									} else {
										target.addUnique(index, copyReferencedEObject);
									}
									++index;
								}
							}
						}
					} else {
						Object referencedEObject = eObject.eGet(eReference, resolveProxies);
						if (referencedEObject == null) {
							copyEObject.eSet(getTarget(eReference), null);
						} else {
							Object copyReferencedEObject = get(referencedEObject);
							if (copyReferencedEObject == null) {
								if (useOriginalReferences && (eReference.getEOpposite() == null || (eReference.getEOpposite().isMany()/* OWN CODE */))) {
									copyEObject.eSet(getTarget(eReference), referencedEObject);
								}
							} else {
								copyEObject.eSet(getTarget(eReference), copyReferencedEObject);
							}
						}
					}
				}
			}
		};
		EObject result = copier.copy(eObject);
		copier.copyReferences();

		@SuppressWarnings("unchecked")
		T t = (T) result;
		return t;
	}

	private String getStyleName(IfcSurfaceStyle style) {
		String name = style.getName();
		if (name == null) {
			name = noNamedStyles.get(style);
			if (name == null) {
				noNamedStyles.put(style, name = "style" + noNamedStyles.size());
			}
		}
		return '_' + name.replace(' ', '_').replace(",", "");
	}

	private String addItem(IfcElement element, IfcRepresentationItem item, Map<IfcSurfaceStyle, Collection<IfcRepresentationItem>> styleMap, Map<IfcRepresentationItem, Collection<IfcElement>> itemMap, Map<IfcElement, Collection<IfcRepresentationItem>> elementToItem) {
		Collection<IfcElement> elements = itemMap.get(item);
		if (elements == null) {
			itemMap.put(item, elements = new HashSet<IfcElement>());
		}
		elements.add(element);

		Collection<IfcRepresentationItem> itemsOfElement = elementToItem.get(element);
		if (itemsOfElement == null) {
			elementToItem.put(element, itemsOfElement = new HashSet<IfcRepresentationItem>());
		}
		itemsOfElement.add(item);

		String js = "";
		IfcStyledItem styledByItem = item.getStyledByItem();
		if (styledByItem != null) {
			for (IfcPresentationStyleAssignment _as : styledByItem.getStyles()) {
				for (IfcPresentationStyleSelect sel : _as.getStyles()) {
					IfcSurfaceStyle surfaceStyle = sel.getIfcSurfaceStylevalue();
					if (surfaceStyle != null) {
						Collection<IfcRepresentationItem> items = styleMap.get(surfaceStyle);
						if (items == null)
							styleMap.put(surfaceStyle, items = new HashSet<IfcRepresentationItem>());
						if (!items.add(item)) {
							CMSActivator.err("repitem has style twice!");
						}
					} else {
						CMSActivator.err("No style for " + element.getGlobalId() + " of type " + element.eClass().getName());
						CMSActivator.err("getIfcCurveStylevalue=" + sel.getIfcCurveStylevalue());
						CMSActivator.err("getIfcFillAreaStylevalue=" + sel.getIfcFillAreaStylevalue());
						CMSActivator.err("getIfcNullStylevalue=" + sel.getIfcNullStylevalue());
						CMSActivator.err("getIfcSurfaceStylevalue=" + sel.getIfcSurfaceStylevalue());
						CMSActivator.err("getIfcSymbolStylevalue=" + sel.getIfcSymbolStylevalue());
						CMSActivator.err("getIfcTextStylevalue=" + sel.getIfcTextStylevalue());
					}
				}
			}
		}
		return js;
	}

	private String addItem2(IfcSurfaceStyle surfaceStyle) {
		String styleName = getStyleName(surfaceStyle);
		String options = "";

		for (IfcSurfaceStyleElementSelect ifcSurfaceStyleElementSelect : surfaceStyle.getStyles()) {
			if (ifcSurfaceStyleElementSelect instanceof IfcSurfaceStyleShading) {
				IfcSurfaceStyleShading ifcSurfaceStyleShading = (IfcSurfaceStyleShading) ifcSurfaceStyleElementSelect;
				IfcColourRgb col = ifcSurfaceStyleShading.getSurfaceColour();
				if (col != null) {
					options += "color:" + toHexColor(col, 1) + ",";
				}
				if (ifcSurfaceStyleElementSelect instanceof IfcSurfaceStyleRendering) {
					IfcSurfaceStyleRendering ifcSurfaceStyleRendering = (IfcSurfaceStyleRendering) ifcSurfaceStyleElementSelect;
					Double tranparency = ifcSurfaceStyleRendering.getTransparency();
					if (tranparency != null && tranparency != 0) {
						options += "opacity:" + (1 - tranparency) + ", transparent:true ,";
					}
					IfcColourOrFactor colourOrFactor = ifcSurfaceStyleRendering.getSpecularColour();
					if (colourOrFactor != null && colourOrFactor.getIfcColourRgbvalue() != null) {
						options += "specular:" + toHexColor(colourOrFactor.getIfcColourRgbvalue(), 1) + ",";
					} else if (colourOrFactor != null && colourOrFactor.getIfcNormalisedRatioMeasurevalue() != null && col != null) {
						options += "specular:" + toHexColor(col, colourOrFactor.getIfcNormalisedRatioMeasurevalue()) + ",";
					}
					colourOrFactor = ifcSurfaceStyleRendering.getReflectionColour();
					if (colourOrFactor != null && colourOrFactor.getIfcNormalisedRatioMeasurevalue() != null) {
						options += "reflectivity:" + colourOrFactor.getIfcNormalisedRatioMeasurevalue() + ",";
					}
				}
			}
		}
		if (options.length() > 0) {
			return "\"" + styleName + "\": {" + options.substring(0, options.length() - 1) + "},\n";
		}
		return "";
	}

	private String toHexColor(IfcColourRgb col, double factor) {
		return "0x" + Long.toHexString(Math.round(col.getRed() * 0xFF * factor) * 256 * 256 + Math.round(col.getGreen() * 0xFF * factor) * 256 + Math.round(col.getBlue() * 0xFF * factor));
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		shell = HandlerUtil.getActiveShellChecked(event);
		final List<EObject> selection = RAASUIUtils.getSelection(event, EObject.class);
		importables = new ArrayList<Artifact>();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) {
				runJob(monitor, selection);
			}
		};
		shell.getDisplay().readAndDispatch();
		try {
			ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(shell) {

				protected void configureShell(final Shell shell) {
					super.configureShell(shell);
					shell.setText("Separating materials");
				}

			};
			progressMonitorDialog.run(true, true, op);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return null;
	}
}
