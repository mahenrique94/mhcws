package br.com.mhc.mhcws.models;

public class CNPJJSON {

	private String json;
	
	public CNPJJSON(String json) {
		// TODO Auto-generated constructor stub
		this.json = json;
	}
	
	public String getJson() {
		return this.json;
	}
	private void setJson(String json) {
		this.json = json;
	}
	
	public CNPJJSON validate() {
		setJson(getJson().replace("nome", "razaosocial").replace("fantasia", "nomefantasia"));
		return this;
	}
	
	public CNPJJSON simple() {
		String json = getJson();
		String regExA = "[áàãâ]";
		String regExAUpper = "[ÁÀÃÂ]";
		String regExE = "[éèê]";
		String regExEUpper = "[ÉÈÊ]";
		String regExI = "[íìî]";
		String regExIUpper = "[ÍÌÎ]";
		String regExO = "[óòõô]";
		String regExOUpper = "[ÓÒÕÔ]";
		String regExU = "[úùû]";
		String regExUUpper = "[ÚÙÛ]";
		json = json.replaceAll(regExA, "a");
		json = json.replaceAll(regExAUpper, "A");
		json = json.replaceAll(regExE, "e");
		json = json.replaceAll(regExEUpper, "E");
		json = json.replaceAll(regExI, "i");
		json = json.replaceAll(regExIUpper, "I");
		json = json.replaceAll(regExO, "o");
		json = json.replaceAll(regExOUpper, "O");
		json = json.replaceAll(regExU, "u");
		json = json.replaceAll(regExUUpper, "U");
		setJson(json.replace("ç", "c").replace("Ç", "C").replace("'", ""));
		return this;
	}
	
}
