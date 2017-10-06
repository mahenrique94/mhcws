package br.com.mhc.mhcws.util;

public enum Types {

	JSON("json", "application/json"),
	XML("xml", "application/xml");
	
	private String type;
	private String mimeType;
	
	private Types(String type, String mimeType) {
		this.type = type;
		this.mimeType = mimeType;
	}
	
	public String getType() {
		return type;
	}
	public String getMimeType() {
		return mimeType;
	}
	
}
