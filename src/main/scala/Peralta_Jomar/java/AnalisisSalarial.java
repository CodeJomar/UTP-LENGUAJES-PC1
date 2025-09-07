package Peralta_Jomar.java;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnalisisSalarial {
    public static void main(String[] args) {
        List<Empleado> empleados = Database.EMPLEADOS;
        double umbralSalario = 6000.0;
        
        Map<String, Double> salariosPromedioPorPuesto = empleados.stream()
            .filter(e -> e.getSalario() > umbralSalario)
            .collect(Collectors.groupingBy(
                Empleado::getPuesto,
                Collectors.averagingDouble(Empleado::getSalario)
            ));
        
        salariosPromedioPorPuesto.forEach((puesto, promedio) ->
            System.out.println("Salario promedio de " + puesto + ": $" + String.format("%.2f", promedio))
        );
    }
}
