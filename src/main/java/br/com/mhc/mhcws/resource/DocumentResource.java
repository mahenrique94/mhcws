package br.com.mhc.mhcws.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import br.com.mhc.mhcws.models.Document;

/**
 * @WebService
 * @author Matheus Castiglioni
 * Classe responsável por retornar algumas informações referente a um CPF ou CNPJ
 * @ReturnTypes JSON
 */
@Path("document")
public class DocumentResource extends GenericResource {
	
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
	
}
