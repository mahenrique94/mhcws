package br.com.mhc.mhcws.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.mhc.documenteletronic.CTE;
import br.com.mhc.documenteletronic.MDFE;
import br.com.mhc.documenteletronic.NFE;
import br.com.mhc.mhcws.models.DocumentEletronic;

/**
 * @WebService
 * @author Matheus Castiglioni
 * Classe responsável por retornar algumas informações referente aos documentos eletrônicos: CTE, MDFE e NFE
 * @ReturnTypes JSON
 */
@Path("document/eletronic")
public class DocumentEletronicResource extends GenericResource {
	
	@GET
	@Path("cte/information/{chave}/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getInformationCTE(@PathParam("chave") String chave) {
		return super.buildResponse(super.getGson().toJson(new DocumentEletronic(new CTE(chave))));
	}
	
	@GET
	@Path("mdfe/information/{chave}/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getInformationMDFE(@PathParam("chave") String chave) {
		return super.buildResponse(super.getGson().toJson(new DocumentEletronic(new MDFE(chave))));
	}
	
	@GET
	@Path("nfe/information/{chave}/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getInformationNFE(@PathParam("chave") String chave) {
		return super.buildResponse(super.getGson().toJson(new DocumentEletronic(new NFE(chave))));
	}

}
