package Pascual_Evelyn.CasoJv;

import compartido.Empleado2;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.List;

public class CargaJson {

    public static List<Empleado2> cargarEmpleados(String rutaJson) {
        try {
            InputStream input = CargaJson.class.getResourceAsStream(rutaJson);
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(input, new TypeReference<List<Empleado2>>() {});
        } catch (Exception e) {
            System.out.println("Error al leer el JSON: " + e.getMessage());
            return List.of();
        }
    }
}

