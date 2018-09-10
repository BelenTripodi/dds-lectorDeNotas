package model;



import java.util.LinkedList;
import java.util.List;

public class RepoUsuarios {

	private List<Estudiante> estudiantes = new LinkedList<>();
	private Estudiante estudianteLoggeado;

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void agregar(Estudiante unEstudiante) {
		this.estudiantes.add(unEstudiante);
	}

	public List<Estudiante> todosLosEstudiantes() {
		return estudiantes;
	}
	
	public Estudiante usuarioActual() {
		return estudianteLoggeado;
	}
	
	public void seLoggeo(Estudiante estudiante)
	{
		estudianteLoggeado = estudiante;
	}
	
//	public Estudiante encontrarUsuario(Integer legajo)	{
//		return estudiantes.stream();
//	}
}
