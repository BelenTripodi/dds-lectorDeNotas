import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;

import model.AlgunosDatos;
import model.Estudiante;
import model.Repos;
import ui.windows.LoginWindow;

public class CigaApp extends Application {

	public static void main(String[] args) {
		AlgunosDatos.initialize();
    	Estudiante estudiante = new Estudiante("Nombre", "Apellido", "unGithub");
    	Repos.repoUsuarios.agregar(estudiante);
		new CigaApp().start();
	}

	@Override
	protected Window<?> createMainWindow() {
		//return new MyMainWindow(this);
		return new LoginWindow(this);

	}
}