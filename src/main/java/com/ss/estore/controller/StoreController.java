package com.ss.estore.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ss.estore.model.Address;
import com.ss.estore.model.Store;
import com.ss.estore.spring.service.StoreService;

/**
 * Handles requests for the Store service.
 */
@Controller
public class StoreController {

	private static final Logger logger = LoggerFactory
			.getLogger(StoreController.class);

	// Map to store Stores, ideally we should use database
	Map<Integer, Store> storeData = new HashMap<Integer, Store>();
	@Autowired
	StoreService service;

	/*
	 * public void setService(StoreService service) { this.service = service; }
	 */

	@RequestMapping(value = "/rest/store/test", method = RequestMethod.GET)
	public @ResponseBody Store getTestStore() {
		logger.info("Start getFirstStore");
		Address address1 = new Address();
		address1.setAddressType("S");
		address1.setAddrLine1("Street1");
		address1.setCity("Hyderabad");
		address1.setCountry("India");
		address1.setEmail1("test@test.com");
		address1.setFirstName("fName");
		address1.setLastName("lName");
		address1.setPinCode(500001);
		address1.setState("Telangana");
		address1.setStatus("P");
		List<Address> addrList = new ArrayList<Address>();
		addrList.add(address1);
		Store store = new Store();
		store.setStoreName("Test Store");
		store.setAddress(addrList);
		// store.setCreatedDate(new java.sql.Date(, arg1, arg2));
		return store;
	}

	@RequestMapping(value = "/rest/store/{id}", method = RequestMethod.GET)
	public @ResponseBody Store getStore(@PathVariable("id") int empId) {
		logger.info("Start getStore. ID=" + empId);

		return storeData.get(empId);
	}

	@RequestMapping(value = "/rest/stores", method = RequestMethod.GET)
	public @ResponseBody List<Store> getAllStores() {
		logger.info("Start getAllStores.");
		List<Store> emps = new ArrayList<Store>();
		Set<Integer> empIdKeys = storeData.keySet();
		for (Integer i : empIdKeys) {
			emps.add(storeData.get(i));
		}
		return emps;
	}

	@RequestMapping(value = "/rest/store/create", method = RequestMethod.POST)
	public @ResponseBody String createStore(@RequestBody Store store) {
		logger.info("Start createStore.");
		// emp.setCreatedDate(new Date());
		store.getAddress().forEach(address->address.setStore(store));
		service.add(store);
		return "new Store saved";
	}

	@RequestMapping(value = "/rest/store/delete/{id}", method = RequestMethod.PUT)
	public @ResponseBody Store deleteStore(@PathVariable("id") int empId) {
		logger.info("Start deleteStore.");
		Store emp = storeData.get(empId);
		storeData.remove(empId);
		return emp;
	}

}
