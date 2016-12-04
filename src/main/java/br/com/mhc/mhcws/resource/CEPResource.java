package br.com.mhc.mhcws.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import br.com.mhc.mhcws.models.CEP;
import br.com.mhc.mhcws.models.CEPJSON;
import br.com.mhc.mhcws.util.Types;

/**
 * @WebService
 * @author Matheus Castiglioni
 * Classe responsável por retornar o endereço de um determinado CEP
 * @ReturnTypes JSON, XML
 */
@Path("cep")
public class CEPResource {
	
	private final static String FROM = "http://viacep.com.br";
	private final Gson gson = new Gson();

	@GET
	@Path("find/{cep}/json")
	@Produces(MediaType.APPLICATION_JSON)
	public String findToJSON(@PathParam("cep") String cep) {
		CEPJSON json = new CEPJSON(getJsonToCEP(cep));
		CEP obj = getGson().fromJson(json.validate().getJson(), CEP.class);
		return getGson().toJson(obj);
	}
	
	@GET
	@Path("find/{cep}/json/simple")
	@Produces(MediaType.APPLICATION_JSON)
	public String findToJSONSimple(@PathParam("cep") String cep) {
		CEPJSON json = new CEPJSON(getJsonToCEP(cep));
		CEP obj = getGson().fromJson(json.validate().simple().getJson(), CEP.class);
		return getGson().toJson(obj);
	}
	
	private String getJsonToCEP(String cep) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(FROM);
		return target.path("/ws/" + cep + "/" + Types.JSON.getType()).request().get(String.class);
	}
	
	private Gson getGson() {
		return this.gson;
	}
	
}