/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui;

import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;

public abstract class MenuCreator implements IMenuCreator {

	private MenuManager dropDownMenuMgr;

	/**
	 * Creates the menu manager for the drop-down.
	 */
	private void createDropDownMenuMgr() {
		if (dropDownMenuMgr == null) {
			dropDownMenuMgr = new MenuManager();
			fillMenu(dropDownMenuMgr);
		}
	}

	protected abstract void fillMenu(MenuManager dropDownMenuMgr);

	public Menu getMenu(Control parent) {
		createDropDownMenuMgr();
		return dropDownMenuMgr.createContextMenu(parent);
	}

	public Menu getMenu(Menu parent) {
		createDropDownMenuMgr();
		Menu menu = new Menu(parent);
		IContributionItem[] items = dropDownMenuMgr.getItems();
		for (int i = 0; i < items.length; i++) {
			IContributionItem item = items[i];
			IContributionItem newItem = item;
			if (item instanceof ActionContributionItem) {
				newItem = new ActionContributionItem(((ActionContributionItem) item).getAction());
			}
			newItem.fill(menu, -1);
		}
		return menu;
	}

	public void dispose() {
		if (dropDownMenuMgr != null) {
			dropDownMenuMgr.dispose();
			dropDownMenuMgr = null;
		}
	}

}
