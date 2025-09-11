package compartido;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.List;

public class CargaJsonJv {

    public static List<EmpleadoJv> cargarEmpleados(String rutaJson) {
        try {
            InputStream input = CargaJsonJv.class.getResourceAsStream(rutaJson);
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(input, new TypeReference<List<EmpleadoJv>>() {});
        } catch (Exception e) {
            System.out.println("Error al leer el JSON: " + e.getMessage());
            return List.of();
        }
    }
}

