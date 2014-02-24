/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.adapters;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.cdo.common.id.CDOIDUtil;
import org.eclipse.emf.cdo.common.revision.CDORevision;
import org.eclipse.emf.ecore.EObject;
import org.ifc4emf.metamodel.ifcheader.Model;
import org.ifc4emf.part21.loader.ContainmentTreeOrderedByNumberHelper;
import org.raas4emf.cms.core.IGeometricIDResolver;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.AdapterFactoryTyped;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.actions.QueryAction;
import org.raas4emf.cms.ui.views.DirectoryView;

import raascms.Artifact;
import IFC2X3.IfcRoot;

public class GeometricIDResolverAdapterFactory extends AdapterFactoryTyped<String, IGeometricIDResolver> {

	protected static String KEY0 = "KEY";
	private static String VALUE0 = "VALUE";
	private static String oldSql;

	@Override
	public IGeometricIDResolver getAdapterTyped(final String guid, Class<IGeometricIDResolver> adapterType) {
		return new IGeometricIDResolver() {

			@Override
			public EObject resolve(Artifact artifact) {
				if (guid.startsWith("cdo")) {
					return RAASUtils.findObjectById(guid.substring("cdo".length()), artifact.eResource());
				}
				if (guid.startsWith("_")) {
					try {
						EObject result = getFromIndex(new Integer(guid.substring(1)), artifact);
						if (result != null)
							return result;
					} catch (NumberFormatException e) {
						// do nothing
					}
				}
				for (EObject eObject : artifact.getContents()) {
					if (eObject instanceof Model) {
						Model model = (Model) eObject;
						long start = System.currentTimeMillis();
						Integer index = getIndexForGUID(model, guid);
						long end0 = System.currentTimeMillis();
						// EMap<String, Integer> guidToPart21 = model.getGuidToPart21() != null ? model.getGuidToPart21().getGuidToPart21() : new BasicEMap<String, Integer>();
						// long end1 = System.currentTimeMillis();
						// Integer index2 = guidToPart21.get(guid);
						// long end2 = System.currentTimeMillis();
						CMSActivator.log("SQL find index for guid took " + (end0 - start) + " milliseconds");
						// CMSActivator.log("Get index for guid took " + (end1 - end0) + " milliseconds");
						// CMSActivator.log("Find index for guid took " + (end2 - end1) + " milliseconds");
						// CMSActivator.log(index + "=" + index2);
						if (index != null) {
							EObject result = getFromIndex(index, artifact);
							if (result != null)
								return result;
						}
					}
				}
				return null;// findByName(artifact.getContents());
			}

			private Integer getIndexForGUID(Model model, String guid) {
				return getIndexForGUIDStatic(model, guid);
			}

			private EObject findByName(Collection<EObject> contents) {
				for (EObject eObject : contents) {
					if (eObject instanceof IfcRoot) {
						IfcRoot ifcRoot = (IfcRoot) eObject;
						if (guid.equals(ifcRoot.getName()))
							return ifcRoot;
					}
					EObject x = findByName(DirectoryView.getLogicalChildren(eObject));
					if (x != null)
						return x;
				}
				return null;
			}

		};
	}

	public static Integer getIndexForGUIDStatic(Model model, String guid) {
		try {
			// long id;
			// // Object obj = ((CDORevisionImpl) model.cdoRevision()).get(Part21Package.eINSTANCE.getModel_GuidToPart21(), -1);
			// // if (obj instanceof CDOID) {
			// // CDOID cdoid = (CDOID) obj;
			// // id = CDOIDUtil.getLong(cdoid);
			// // } else {
			//
			// CDOView view = model.cdoResource().cdoView();
			// GuidToPart21Container guidToPart21;
			// CDOCollectionLoadingPolicy or = view.getSession().options().getCollectionLoadingPolicy();
			// view.getSession().options().setCollectionLoadingPolicy(CDOUtil.createCollectionLoadingPolicy(0, 10));
			// try {
			// // CDORevisionPrefetchingPolicy ori = view.options().getRevisionPrefetchingPolicy();
			// // view.options().setRevisionPrefetchingPolicy(CDOUtil.createRevisionPrefetchingPolicy(10));
			//
			// guidToPart21 = model.getGuidToPart21();
			// view.getSession().options().setCollectionLoadingPolicy(CDOUtil.createCollectionLoadingPolicy(or.getInitialChunkSize(), or.getResolveChunkSize()));
			// } finally {
			// }

			CDORevision revision = model.getGuidToPart21().cdoRevision();
			int branch = revision.getBranch().getID();
			// int branch = model.cdoRevision().getBranch().getID();
			long id = CDOIDUtil.getLong(revision.getID());

			String sql = "SELECT map." + VALUE0 + " FROM IFCHEADER_GUIDTOPART21MAP map, IFCHEADER_GUIDTOPART21CONTAINER_GUIDTOPART21_LIST list";
			// String sql = "SELECT map."+VALUE+" FROM IFCHEADER_GUIDTOPART21MAP map, IFCHEADER_MODEL_GUIDTOPART21_LIST list";
			sql += " WHERE map.CDO_ID=list.CDO_VALUE AND map.CDO_BRANCH=" + branch + " AND (map.CDO_REVISED=0) ";
			sql += " AND list.CDO_SOURCE=" + id + " AND list.CDO_BRANCH=" + branch + " AND list.CDO_VERSION=" + revision.getVersion();
			// sql += " AND model.CDO_ID=" + id + " AND model.CDO_BRANCH=" + branch + " AND (model.CDO_REVISED=0)";
			sql += " AND map." + KEY0 + "='" + guid + "'";

			// sql = "CREATE INDEX GUID_INDEX ON IFCHEADER_GUIDTOPART21MAP ("+KEY0+")";

			// sql = "EXPLAIN SELECT map."+VALUE+" FROM IFCHEADER_GUIDTOPART21MAP map ";
			// sql += " WHERE map."+KEY0+"='" + guid + "'";

			// sql = "SELECT * FROM information_schema.indexes WHERE table_schema = 'PUBLIC' AND table_name='IFCHEADER_GUIDTOPART21MAP';";
			// sql = "CREATE INDEX GUID4_INDEX ON IFCHEADER_GUIDTOPART21MAP(CDO_ID, CDO_BRANCH, "+KEY0+")";

			// sql = "DROP INDEX GUID_INDEX";

			QueryAction.otherSearchStrings.remove(oldSql);
			QueryAction.otherSearchStrings.add(oldSql = sql);

			List<Object> result = QueryAction.execSql(sql, model.cdoResource().cdoView());
			if (result.size() == 1 && result.get(0) instanceof String) {
				CMSActivator.log((String) result.get(0));
			}
			if (result.size() == 1 && result.get(0) instanceof Integer) {
				return (Integer) result.get(0);
			}

		} catch (Exception e) {
			if (e.getMessage().contains("Column \"MAP.VALUE\" not found")) {
				VALUE0 = "VALUE0";
				KEY0 = "KEY0";
				return getIndexForGUIDStatic(model, guid);
			}
		}
		return null;
	}

	public static EObject getFromIndex(int integer, Artifact artifact) {
		for (EObject content : artifact.getContents()) {
			if (content instanceof Model) {
				Model model = (Model) content;
				long start = System.currentTimeMillis();
				ContainmentTreeOrderedByNumberHelper helper = new ContainmentTreeOrderedByNumberHelper(model);
				EObject result = helper.get(integer);
				long end = System.currentTimeMillis();
				CMSActivator.log("Find EObject from index " + (end - start) + " milliseconds");
				return result;
			}
		}
		return null;
	}

}
