package com.ss.estore.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "store")
public class Store implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2296726630269967889L;

	@Id
	@Column(name = "storeId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int storeId;

	@Column(name = "storeName")
	private String storeName;

	@OneToMany(cascade={CascadeType.ALL},fetch = FetchType.LAZY, mappedBy = "store")
	private Collection<Address> address;

	@Column(name = "createdDate")
	private Date createdDate;

	@Column(name = "storeLogoPath")
	private String storeLogoPath;

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public Collection<Address> getAddress() {
		return address;
	}

	public void setAddress(Collection<Address> address) {
		this.address = address;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getStoreLogoPath() {
		return storeLogoPath;
	}

	public void setStoreLogoPath(String storeLogoPath) {
		this.storeLogoPath = storeLogoPath;
	}

}
