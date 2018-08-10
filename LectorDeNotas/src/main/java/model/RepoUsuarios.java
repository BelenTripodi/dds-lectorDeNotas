package model;



import java.util.LinkedList;
import java.util.List;

public class RepoUsuarios {

	private List<Estudiante> estudiantes = new LinkedList<>();

	public void agregar(Estudiante unEstudiante) {
		this.estudiantes.add(unEstudiante);
	}

	public List<Estudiante> todosLosEstudiantes() {
		return estudiantes;
	}
	
	public Estudiante usuarioActual() {
		return estudiantes.get(0);
	}
}
