package br.com.mhc.mhcws.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import br.com.mhc.mhcws.models.CPF;

/**
 * @WebService
 * @author Matheus Castiglioni
 * Classe responsável por retornar algumas informações referente a um CPF
 * @ReturnTypes JSON
 */
@Path("cpf")
public class CPFResource extends GenericResource {
	
	@GET
	@Path("information/{cpf}/json")
	public Response getInformation(@PathParam("cpf") String cpf) {
		return super.buildResponse(super.getGson().toJson(new CPF(new br.com.mhc.cpf.CPF(cpf))));
	}
	
}
