package com.ss.estore.model;

import java.sql.Date;

/**
 * @author Raghu Kishore
 *
 */
public class CATTOGRP {
	private int catId;
	private int catGrpId;
	private Date lastUpdated;

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public int getCatGrpId() {
		return catGrpId;
	}

	public void setCatGrpId(int catGrpId) {
		this.catGrpId = catGrpId;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

}
