package jsonAObjeto;

import com.google.gson.Gson;
import model.Asignacion;
import model.dto.AsignacionesDTO;
import model.dto.EstudianteDTO;

import java.util.List;

public class ParserAsignaciones {

    public static List<Asignacion> parsear(String json) {
        AsignacionesDTO asignacionesDTO;
        Gson gson = new Gson();
        asignacionesDTO = gson.fromJson(json, AsignacionesDTO.class);
        return asignacionesDTO.getAsignaciones();
    }

    public static String toJson(EstudianteDTO estudianteDTO){
        Gson gson = new Gson();
        return gson.toJson(estudianteDTO);
    }
}
