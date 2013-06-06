package org.jboss.as.quickstarts.cdi.ejb;

import java.util.List;

import org.jboss.as.quickstarts.cdi.entity.Item;

public interface ItemService {
	public void create(Item item);
	List<Item> getList();
}
