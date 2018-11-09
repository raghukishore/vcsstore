package com.ss.estore.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.journaldev.spring.controller.EmpRestURIConstants;
import com.ss.estore.model.Store;

/**
 * Handles requests for the Store service.
 */
@Controller
public class StoreController {
	
	private static final Logger logger = LoggerFactory.getLogger(StoreController.class);
	
	//Map to store Stores, ideally we should use database
	Map<Integer, Store> storeData = new HashMap<Integer, Store>();
	
	@RequestMapping(value = "/rest/store/first", method = RequestMethod.GET)
	public @ResponseBody Store getDummyStore() {
		logger.info("Start getFirstStore");
		Store store = new Store();
		store.setStoreId(9999);
		store.setStoreName("First Store");
		//store.setCreatedDate(new java.sql.Date(, arg1, arg2));
		storeData.put(9999, store);
		return store;
	}
	
	@RequestMapping(value = "/rest/store/{id}", method = RequestMethod.GET)
	public @ResponseBody Store getStore(@PathVariable("id") int empId) {
		logger.info("Start getStore. ID="+empId);
		
		return storeData.get(empId);
	}
	
	@RequestMapping(value = "/rest/stores", method = RequestMethod.GET)
	public @ResponseBody List<Store> getAllStores() {
		logger.info("Start getAllStores.");
		List<Store> emps = new ArrayList<Store>();
		Set<Integer> empIdKeys = storeData.keySet();
		for(Integer i : empIdKeys){
			emps.add(storeData.get(i));
		}
		return emps;
	}
	
	@RequestMapping(value = "/rest/store/create", method = RequestMethod.POST)
	public @ResponseBody Store createStore(@RequestBody Store emp) {
		logger.info("Start createStore.");
		//emp.setCreatedDate(new Date());
		storeData.put(emp.getStoreId(), emp);
		return emp;
	}
	
	@RequestMapping(value = "/rest/store/delete/{id}", method = RequestMethod.PUT)
	public @ResponseBody Store deleteStore(@PathVariable("id") int empId) {
		logger.info("Start deleteStore.");
		Store emp = storeData.get(empId);
		storeData.remove(empId);
		return emp;
	}
	
}
