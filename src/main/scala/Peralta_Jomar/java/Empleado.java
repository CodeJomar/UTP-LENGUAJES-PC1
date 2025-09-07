package Peralta_Jomar.java;

import java.time.LocalDate;

public class Empleado {
    private final String nombre;
    private final String apellido;
    private final int edad;
    private final String puesto;
    private final double salario;
    private final LocalDate fechaContrato;
    
    public Empleado(String nombre, String apellido, int edad, String puesto, double salario, LocalDate fechaContrato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.puesto = puesto;
        this.salario = salario;
        this.fechaContrato = fechaContrato;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getPuesto() {
        return puesto;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public LocalDate getFechaContrato() {
        return fechaContrato;
    }
    
    @Override
    public String toString() {
        return "Empleado{" +
            "nombre='" + nombre + '\'' +
            ", apellido='" + apellido + '\'' +
            ", edad=" + edad +
            ", puesto='" + puesto + '\'' +
            ", salario=" + salario +
            ", fechaContrato=" + fechaContrato +
            '}';
    }
}
