package com.ss.estore.spring.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ss.estore.dao.StoreDAO;
import com.ss.estore.model.Store;

@Component
public class StoreServiceImpl implements StoreService {
	@Autowired
	private StoreDAO storeDAO;

	public void setStoreDAO(StoreDAO storeDAO) {
		this.storeDAO = storeDAO;
	}

	@Transactional
	public void add(Store store) {
		storeDAO.save(store);
	}

	@Transactional
	public void addAll(Collection<Store> stores) {
		for (Store store : stores) {
			storeDAO.save(store);
		}
	}

	@Transactional(readOnly = true)
	public List<Store> listAll() {
		return storeDAO.list();

	}
}
