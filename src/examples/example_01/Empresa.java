package examples.example_01;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    // Nombre de la empresa
    private String nombre;

    // Lista de empleados (relación 1 a muchos)
    private List<Empleado> empleados;

    // Constructor: inicializa el nombre y la lista vacía de empleados
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    // Método para agregar un empleado a la lista
    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    // Getter para obtener la lista de empleados
    public List<Empleado> getEmpleados() {
        return empleados;
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Representación de la empresa como texto
    @Override
    public String toString() {
        return "Examples.Example_01.Empresa{" +
                "nombre='" + nombre + '\'' +
                ", empleados=" + empleados +
                '}';
    }
}
