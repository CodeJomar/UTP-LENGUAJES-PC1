package Artola_Paola.CasoJ;
import Pascual_Evelyn.CasoJv.CargaJson;
import compartido.Empleado2;
import java.util.Scanner;
import java.util.List;

public class AumentoCondicional {
    public static void main(String[] args) {
        List<Empleado2> empleados = CargaJson.cargarEmpleados("/empleados.json");
        Scanner sc = new Scanner(System.in);
        double umbral = 5500;
        System.out.println("Se incrementó en un 10% el salario de los siguientes empleados que tuvieron su salario debajo de 5500:");
        for (int i = 0; i<empleados.size(); i++) {
            Empleado2 emp = empleados.get(i);
            if (emp.getSalario()< umbral) {
                String formato = String.format(
                        "Nombre: %s Antiguo: %.2f Nuevo: %.2f",
                        emp.getNombre(), emp.getSalario(), emp.getSalario() * (double) 1.1);
                emp.setSalario((double)1.1*emp.getSalario());
                System.out.println(formato);
            }
        }
    }
}
