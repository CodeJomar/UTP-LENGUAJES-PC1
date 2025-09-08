package Pascual_Evelyn.CasoJv;
import compartido.Empleado2;
import java.util.List;

public class aplicarAumentoMain {

    public static void main(String[] args) {
        
        List<Empleado2> empleados = CargaJson.cargarEmpleados("/empleados.json");

        long inicio = System.nanoTime();
        List<Empleado2> actualizados = AumentoSalarial.calcularAumento(empleados);
        long fin = System.nanoTime();

        double duracionMs = (fin - inicio) / 1e6;
        System.out.printf("Tiempo de ejecución para función de Aumento Salarial: %.2f ms%n", duracionMs);

        System.out.println("Lista de empleados con sueldo actualizado:");
        actualizados.forEach(e ->
                System.out.printf("%s %s - %s: S/. %.2f%n", e.getNombre(), e.getApellido(), e.getPuesto(), e.getSalario())
        );
    }
}