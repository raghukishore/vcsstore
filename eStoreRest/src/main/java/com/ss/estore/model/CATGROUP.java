package com.ss.estore.model;

import java.sql.Date;

/**
 * @author Raghu Kishore
 *
 */
public class CATGROUP {
	private String catGrpId;
	private String memberId;
	private String identifier;
	private int markForDelete;
	private Date lastUpdated;

	public String getCatGrpId() {
		return catGrpId;
	}

	public void setCatGrpId(String catGrpId) {
		this.catGrpId = catGrpId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public int getMarkForDelete() {
		return markForDelete;
	}

	public void setMarkForDelete(int markForDelete) {
		this.markForDelete = markForDelete;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

}
