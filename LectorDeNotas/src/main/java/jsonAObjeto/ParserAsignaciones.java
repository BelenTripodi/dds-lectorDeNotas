package jsonAObjeto;

import com.google.gson.Gson;
import model.Asignacion;
import model.dto.AsignacionDTO;
import model.dto.AsignacionesDTO;

import java.util.List;

public class ParserAsignaciones {

    public static List<Asignacion> parsear(String json) {
        AsignacionesDTO asignacionesDTO;
        Gson gson = new Gson();
        asignacionesDTO = gson.fromJson(json, AsignacionesDTO.class);
        return asignacionesDTO.getAsignaciones();
    }
}
