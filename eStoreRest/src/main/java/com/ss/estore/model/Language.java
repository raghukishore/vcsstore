/**
 * 
 */
package com.ss.estore.model;

/**
 * @author Raghu Kishore
 *
 */
public class Language {
	private int langId;
	private String localeName;
	private String language;
	private String country;
	private String variant;
	private String encoding;
	private String mimeCharSet;

	public int getLangId() {
		return langId;
	}

	public void setLangId(int langId) {
		this.langId = langId;
	}

	public String getLocaleName() {
		return localeName;
	}

	public void setLocaleName(String localeName) {
		this.localeName = localeName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getVariant() {
		return variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public String getMimeCharSet() {
		return mimeCharSet;
	}

	public void setMimeCharSet(String mimeCharSet) {
		this.mimeCharSet = mimeCharSet;
	}

}
