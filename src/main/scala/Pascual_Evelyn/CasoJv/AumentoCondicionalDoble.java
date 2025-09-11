package Pascual_Evelyn.CasoJv;
import compartido.CargaJsonJv;
import compartido.EmpleadoJv;
import java.util.List;
import java.util.stream.Collectors;

public class AumentoCondicionalDoble {

    public static void main(String[] args) {
        
        List<EmpleadoJv> empleados = CargaJsonJv.cargarEmpleados("/empleados.json");

        long inicio = System.nanoTime();
        
        List<EmpleadoJv> actualizados = empleados.stream()
                .filter(e -> "Analista de Datos".equalsIgnoreCase(e.getPuesto()) && e.getSalario() < 5000)
                .peek(e -> e.setSalario(e.getSalario()*1.12))
                .collect(Collectors.toList());
        
        long fin = System.nanoTime();

        double duracionMs = (fin - inicio) / 1e6;
        System.out.printf("Tiempo de ejecución para función de Aumento Salarial: %.2f ms%n", duracionMs);

        System.out.println("Lista de empleados con sueldo actualizado:");
        actualizados.forEach(e ->
                System.out.printf("%s %s - %s: S/. %.2f%n", e.getNombre(), e.getApellido(), e.getPuesto(), e.getSalario())
        );
    }
}