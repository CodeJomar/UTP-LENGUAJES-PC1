package Pascual_Evelyn.CasoJv;

import compartido.Empleado2;
import java.util.List;
import java.util.stream.Collectors;

public class AumentoSalarial {

    public static List<Empleado2> calcularAumento(List<Empleado2> empleados) {
        return empleados.stream()
                .map(e -> {
                    if ("Analista de Datos".equalsIgnoreCase(e.getPuesto())&& e.getSalario() < 5000) {
                        return new Empleado2(
                                e.getNombre(),
                                e.getApellido(),
                                e.getEdad(),
                                e.getPuesto(),
                                e.getSalario() * 1.12,
                                e.getFechaContrato()
                        );
                    } else {
                        return e;
                    }
                })
                .collect(Collectors.toList());
    }
}

