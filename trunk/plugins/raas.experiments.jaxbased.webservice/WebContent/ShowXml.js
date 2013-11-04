
	Ext.app.BookLoader = Ext.extend(Ext.ux.tree.XmlTreeLoader, {
		processAttributes : function(attr) {
			attr.loaded = true;
			attr.expanded = true;
			attr.text = '(not labled)';
				attr.text = typeof attr;
		}
	});

	Ext
			.onReady(function() {

				new Ext.Panel(
						{
							title : 'Reading List',
							renderTo : 'tree',
							layout : 'border',
							width : 500,
							height : 500,
							items : [
									{
										xtype : 'treepanel',
										id : 'tree-panel',
										region : 'center',
										margins : '2 2 0 2',
										autoScroll : true,
										rootVisible : false,
										root : new Ext.tree.AsyncTreeNode(),

										// Our custom TreeLoader:
										loader : new Ext.app.BookLoader(
												{
													dataUrl : 'http://localhost:8483/raas.experiments.jaxbased.webservice/services/ReposRoot/GetAllReposRoot',
													requestMethod : 'get'
												})

									}, {
										region : 'south',
										title : 'Book Details',
										id : 'details-panel',
										autoScroll : true,
										collapsible : true,
										split : true,
										margins : '0 2 2 2',
										cmargins : '2 2 2 2',
										height : 220
									} ]
						});

			});