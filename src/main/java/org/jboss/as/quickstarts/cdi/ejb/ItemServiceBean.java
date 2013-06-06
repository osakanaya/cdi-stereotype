package org.jboss.as.quickstarts.cdi.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.jboss.as.quickstarts.cdi.entity.Item;

@Stateless
public class ItemServiceBean implements ItemService {
	@Inject
	private EntityManager em;
	
	public void create(Item item) {
		em.persist(item);
	}

	public List<Item> getList() {
		return em.createQuery("SELECT i FROM Item i", Item.class).getResultList();
	}

}
