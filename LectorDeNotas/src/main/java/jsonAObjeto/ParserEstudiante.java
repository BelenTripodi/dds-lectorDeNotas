package jsonAObjeto;

import com.google.gson.Gson;
import model.Estudiante;
import model.dto.EstudianteDTO;

public class ParserEstudiante {

    public static Estudiante parsear(String json) {
        EstudianteDTO estudianteDTO;
        Gson gson = new Gson();
        estudianteDTO = gson.fromJson(json, EstudianteDTO.class);
        return estudianteDTO.getEstudiante();
    }
}
