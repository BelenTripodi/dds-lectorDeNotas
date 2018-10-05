package httpclient;

import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class ServiceGet {

	private Client client;
    private static ServiceGet instance = null; 
	private static final String URL = "http://notitas.herokuapp.com";
	private static final String TOKEN = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho";

	public ServiceGet() {
		this.client = Client.create();
 	}
	
	public static ServiceGet getInstance()	{
		if(instance == null) {
			instance = new ServiceGet();
		}
		return instance;
	}


	@GET
	public String get(String resource) {
		WebResource recurso = this.client.resource(URL).path(resource);
		WebResource.Builder builder = recurso.header("Authorization", TOKEN).accept(MediaType.TEXT_PLAIN);
		String response = builder.get(String.class);
		return response;
	}
}
