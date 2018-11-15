package com.ss.estore.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address implements Serializable {
	public Address() {
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -8400298588798183132L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "addressId")
	private int addressId;

	@Column(name = "nickName")
	private String nickName;
	
	@Column(name = "addressType")
	private String addressType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "memberId", nullable = false, insertable=true)
	private Store store;
	
	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Column(name = "billingCode")
	private String billingCode;

	@Column(name = "status")
	private String status;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "personTitle")
	private String personTitle;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "addrLine1")
	private String addrLine1;

	@Column(name = "addrLine2")
	private String addrLine2;

	@Column(name = "addrLine3")
	private String addrLine3;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;

	@Column(name = "pinCode")
	private int pinCode;

	@Column(name = "email1")
	private String email1;

	@Column(name = "email2")
	private String email2;

	@Column(name = "phoneNo1")
	private String phoneNo1;

	@Column(name = "phoneNo2")
	private String phoneNo2;

	@Column(name = "mobilePhoneNo1")
	private String mobilePhoneNo1;

	@Column(name = "mobilePhoneNo2")
	private String mobilePhoneNo2;

	@Column(name = "taxCode")
	private String taxCode;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public String getBillingCode() {
		return billingCode;
	}

	public void setBillingCode(String billingCode) {
		this.billingCode = billingCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPersonTitle() {
		return personTitle;
	}

	public void setPersonTitle(String personTitle) {
		this.personTitle = personTitle;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddrLine1() {
		return addrLine1;
	}

	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}

	public String getAddrLine2() {
		return addrLine2;
	}

	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}

	public String getAddrLine3() {
		return addrLine3;
	}

	public void setAddrLine3(String addrLine3) {
		this.addrLine3 = addrLine3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getPhoneNo1() {
		return phoneNo1;
	}

	public void setPhoneNo1(String phoneNo1) {
		this.phoneNo1 = phoneNo1;
	}

	public String getPhoneNo2() {
		return phoneNo2;
	}

	public void setPhoneNo2(String phoneNo2) {
		this.phoneNo2 = phoneNo2;
	}

	public String getMobilePhoneNo1() {
		return mobilePhoneNo1;
	}

	public void setMobilePhoneNo1(String mobilePhoneNo1) {
		this.mobilePhoneNo1 = mobilePhoneNo1;
	}

	public String getMobilePhoneNo2() {
		return mobilePhoneNo2;
	}

	public void setMobilePhoneNo2(String mobilePhoneNo2) {
		this.mobilePhoneNo2 = mobilePhoneNo2;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}
