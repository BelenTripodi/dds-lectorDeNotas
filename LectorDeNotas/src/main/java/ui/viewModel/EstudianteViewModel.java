package ui.viewModel;


import model.Estudiante;
import org.uqbar.commons.utils.Observable;

@Observable
public class EstudianteViewModel {

    private Estudiante estudiante = new Estudiante("Belen", "Tripodi", "123456", "@beltripo");


    public EstudianteViewModel() {
        super();
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
