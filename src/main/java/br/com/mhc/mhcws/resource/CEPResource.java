package br.com.mhc.mhcws.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import br.com.mhc.mhcws.models.CEP;
import br.com.mhc.mhcws.models.CEPJSON;
import br.com.mhc.mhcws.util.Types;

/**
 * @WebService
 * @author Matheus Castiglioni
 * Classe responsável por retornar o endereço de um determinado CEP
 * @ReturnTypes JSON
 */
@Path("cep")
public class CEPResource extends GenericResource {
	
	private final static String FROM = "http://viacep.com.br";

	@GET
	@Path("find/{cep}/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findToJSON(@PathParam("cep") String cep) {
		CEP obj = super.getGson().fromJson(getNewCEPJSON(cep).validate().getJson(), CEP.class);
		return super.buildResponse(super.getGson().toJson(obj.addCodEstado()));
	}
	
	@GET
	@Path("find/{cep}/json/simple")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findToJSONSimple(@PathParam("cep") String cep) {
		CEP obj = super.getGson().fromJson(getNewCEPJSON(cep).validate().simple().getJson(), CEP.class);
		return super.buildResponse(super.getGson().toJson(obj.addCodEstado()));
	}
	
	@GET
	@Path("find/{cep}/json/simple/upper")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findToJSONSimpleUpper(@PathParam("cep") String cep) {
		CEP obj = super.getGson().fromJson(getNewCEPJSON(cep).validate().simple().getJson(), CEP.class);
		return super.buildResponse(super.getGson().toJson(obj.addCodEstado().toUpper()));
	}
	
	@GET
	@Path("find/{cep}/json/upper")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findToJSONUpper(@PathParam("cep") String cep) {
		CEP obj = super.getGson().fromJson(getNewCEPJSON(cep).validate().getJson(), CEP.class);
		return super.buildResponse(super.getGson().toJson(obj.addCodEstado().toUpper()));
	}
	
	private CEPJSON getNewCEPJSON(String cep) {
		CEPJSON json = new CEPJSON(super.getJsonFrom(FROM, "/ws/" + cep + "/" + Types.JSON.getType()));
		return json;
	}
	
}