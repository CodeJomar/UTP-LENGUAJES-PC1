package compartido;

public class Empleado2 {
    private String nombre;
    private String apellido;
    private int edad;
    private String puesto;
    private double salario;
    private String fechaContrato;
    
    public Empleado2(String nombre, String apellido, int edad, String puesto, double salario, String fechaContrato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.puesto = puesto;
        this.salario = salario;
        this.fechaContrato = fechaContrato;
    }
    
    public Empleado2() {
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
    public String getFechaContrato() { 
        return fechaContrato;
    }

    public void setSalario(double salario) { 
        this.salario = salario; 
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " - " + puesto + " - S/. " + String.format("%.2f", salario);
    }
}