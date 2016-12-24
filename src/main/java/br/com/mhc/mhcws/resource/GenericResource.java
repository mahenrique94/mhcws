package br.com.mhc.mhcws.resource;

import javax.ws.rs.core.Response;

import com.google.gson.Gson;

public abstract class GenericResource {
	
	private final Gson gson = new Gson();
	
	protected Response buildResponse(String json) {
		return Response
				.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.header("Access-Control-Max-Age", "1209600")
				.entity(json)
				.build();
	}
	
	protected Gson getGson() {
		return this.gson;
	}

}
