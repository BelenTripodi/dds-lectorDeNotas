package httpclient;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import jsonAObjeto.ParserAsignaciones;
import jsonAObjeto.ParserEstudiante;
import model.Asignacion;
import model.Estudiante;
import model.dto.EstudianteDTO;
import model.dto.StudentDTO;

import org.mortbay.util.ajax.JSON;
import org.uqbar.commons.model.Entity;

import java.util.List;

public class NotitasService {

	private Client client;
    private static NotitasService instance = null;
	private static final String URL = "http://notitas.herokuapp.com";
	private static final String TOKEN = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho";
	private static final String RESOURCE_STUDENT = "/student";
	private static final String RESOURCE_STUDENT_ASSIGNMENTS = "/student/assignments";

	public NotitasService() {
		this.client = Client.create();
 	}
	
	public static NotitasService getInstance()	{
		if(instance == null) {
			instance = new NotitasService();
		}
		return instance;
	}


	@GET
	public Estudiante getStudent() {
		WebResource recurso = this.client.resource(URL).path(RESOURCE_STUDENT);
		WebResource.Builder builder = recurso.header("Authorization", TOKEN).accept(MediaType.TEXT_PLAIN);
		String response = builder.get(String.class);
		return ParserEstudiante.parsear(response);
	}

	@GET
	public List<Asignacion> getStudentsAssignments() {
		WebResource recurso = this.client.resource(URL).path(RESOURCE_STUDENT_ASSIGNMENTS);
		WebResource.Builder builder = recurso.header("Authorization", TOKEN).accept(MediaType.TEXT_PLAIN);
		String response = builder.get(String.class);
		return ParserAsignaciones.parsear(response);
	}

	@PUT
	public void putStudent(Estudiante estudiante) {
		WebResource recurso = this.client.resource(URL).path(RESOURCE_STUDENT);
		WebResource.Builder builder = recurso.header("Authorization", TOKEN).accept(MediaType.APPLICATION_JSON);
		String json = ParserAsignaciones.toJson(estudiante.toDto());
        StudentDTO response = builder.put(StudentDTO.class, json);
        System.out.println(response);
    }
}
