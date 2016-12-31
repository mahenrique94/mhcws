package br.com.mhc.mhcws.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import br.com.mhc.function.StringFunction;
import br.com.mhc.mhcws.models.CEP;
import br.com.mhc.mhcws.models.CEPJSON;
import br.com.mhc.mhcws.models.CNPJ;
import br.com.mhc.mhcws.models.CNPJJSON;
import br.com.mhc.mhcws.models.Document;
import br.com.mhc.mhcws.util.Types;

/**
 * @WebService
 * @author Matheus Castiglioni
 * Classe responsável por retornar algumas informações referente a um CPF ou CNPJ
 * @ReturnTypes JSON
 */
@Path("document")
public class DocumentResource extends GenericResource {
	
	private final static String FROM = "http://www.receitaws.com.br";
	private final static String FROM_CEP = "http://mhcws.herokuapp.com";
	
	@GET
	@Path("cpf/information/{cpf}/json")
	public Response getCPFInformation(@PathParam("cpf") String cpf) {
		return super.buildResponse(super.getGson().toJson(new Document(new br.com.mhc.document.CPF(cpf))));
	}
	
	@GET
	@Path("cnpj/information/{cnpj}/json")
	public Response getCNPJInformation(@PathParam("cnpj") String cnpj) {
		return super.buildResponse(super.getGson().toJson(new Document(new br.com.mhc.document.CNPJ(cnpj))));
	}
	
	@GET
	@Path("cnpj/data/{cnpj}/json")
	public Response getCNPJData(@PathParam("cnpj") String cnpj) {
		CNPJ cnpjObject = super.getGson().fromJson(getNewCNPJJSON(cnpj).validate().getJson(), CNPJ.class);
		cnpjObject.setEndereco(super.getGson().fromJson(super.getJsonFrom(FROM_CEP, "/ws/cep/find/" + cnpjObject.getCep().replaceAll("[\\.\\-]", "") + "/" + Types.JSON.getType()), CEP.class));
		cnpjObject.setNomefantasia(StringFunction.firstLetterUpperPhrase(cnpjObject.getNomefantasia()));
		cnpjObject.setRazaosocial(StringFunction.firstLetterUpperPhrase(cnpjObject.getRazaosocial()));
		cnpjObject.setCep(null);
		return super.buildResponse(super.getGson().toJson(cnpjObject));
	}
	
	@GET
	@Path("cnpj/data/{cnpj}/json/simple")
	public Response getCNPJDataSimple(@PathParam("cnpj") String cnpj) {
		CNPJ cnpjObject = super.getGson().fromJson(getNewCNPJJSON(cnpj).validate().getJson(), CNPJ.class);
		cnpjObject.setEndereco(super.getGson().fromJson(super.getJsonFrom(FROM_CEP, "/ws/cep/find/" + cnpjObject.getCep().replaceAll("[\\.\\-]", "") + "/" + Types.JSON.getType() + "/simple"), CEP.class));
		cnpjObject.setCnpj(cnpjObject.getCnpj().replaceAll("[\\.\\-\\/]", ""));
		cnpjObject.setNomefantasia(StringFunction.firstLetterUpperPhrase(cnpjObject.getNomefantasia()));
		cnpjObject.setRazaosocial(StringFunction.firstLetterUpperPhrase(cnpjObject.getRazaosocial()).replace("-", ""));
		cnpjObject.setCep(null);
		return super.buildResponse(super.getGson().toJson(cnpjObject));
	}
	
	@GET
	@Path("cnpj/data/{cnpj}/json/simple/upper")
	public Response getCNPJDataSimpleUpper(@PathParam("cnpj") String cnpj) {
		CNPJ cnpjObject = super.getGson().fromJson(getNewCNPJJSON(cnpj).validate().getJson(), CNPJ.class);
		cnpjObject.setEndereco(super.getGson().fromJson(super.getJsonFrom(FROM_CEP, "/ws/cep/find/" + cnpjObject.getCep().replaceAll("[\\.\\-]", "") + "/" + Types.JSON.getType() + "/simple/upper"), CEP.class));
		cnpjObject.setCnpj(cnpjObject.getCnpj().replaceAll("[\\.\\-\\/]", ""));
		cnpjObject.setRazaosocial(cnpjObject.getRazaosocial().replace("-", ""));
		cnpjObject.setCep(null);
		return super.buildResponse(super.getGson().toJson(cnpjObject));
	}
	
	@GET
	@Path("cnpj/data/{cnpj}/json/upper")
	public Response getCNPJDataUpper(@PathParam("cnpj") String cnpj) {
		CNPJ cnpjObject = super.getGson().fromJson(getNewCNPJJSON(cnpj).validate().getJson(), CNPJ.class);
		cnpjObject.setEndereco(super.getGson().fromJson(super.getJsonFrom(FROM_CEP, "/ws/cep/find/" + cnpjObject.getCep().replaceAll("[\\.\\-]", "") + "/" + Types.JSON.getType() + "/upper"), CEP.class));
		cnpjObject.setCep(null);
		return super.buildResponse(super.getGson().toJson(cnpjObject));
	}
	
	private CNPJJSON getNewCNPJJSON(String cnpj) {
		CNPJJSON json = new CNPJJSON(super.getJsonFrom(FROM, "/v1/cnpj/" + cnpj));
		return json;
	}
	
}
