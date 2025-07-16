package examples.example_01;

public class Empleado {
    // Atributos privados (encapsulados)
    private int id;
    private String nombre;

    // Constructor: se ejecuta al crear un nuevo Examples.Example_01.Empleado
    public Empleado(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Métodos para obtener y modificar los atributos (getters y setters)
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    // Método que devuelve una representación en texto del objeto
    @Override
    public String toString() {
        return "Examples.Example_01.Empleado{id=" + id + ", nombre='" + nombre + "'}";
    }
}
