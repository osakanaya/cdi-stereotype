package org.jboss.as.quickstarts.cdi.jsf;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.as.quickstarts.cdi.ejb.ItemService;
import org.jboss.as.quickstarts.cdi.entity.Item;
import org.jboss.as.quickstarts.cdi.interceptor.History;

@Named("itemBean")
@RequestScoped
public class ItemBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final String EMPTY_STRING = "";

	@Inject
	private ItemService itemService;

	@Inject
	private FacesContext context;

	private List<Item> items;
	private List<String> itemHistory;
	private String name;

	public void add() {
		if (name == EMPTY_STRING) {
			FacesMessage message = new FacesMessage("Name can't be empty");
			context.addMessage(message.getSummary(), message);
			refresh();

			return;
		}

		Item item = new Item();
		item.setName(name);

		itemService.create(item);
		name = EMPTY_STRING;
		refresh();
	}

	private void refresh() {
		itemHistory = History.getItemHistory();
		items = itemService.getList();
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<String> getItemHistory() {
		return itemHistory;
	}

	public void setItemHistory(List<String> itemHistory) {
		this.itemHistory = itemHistory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
