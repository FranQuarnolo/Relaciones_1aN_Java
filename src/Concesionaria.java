import java.util.ArrayList;
import java.util.Collection;

public class Concesionaria {

    private String nombre;
    private Collection<Auto> autos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Auto> getAutos() {
        return autos;
    }

    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    public void removerAuto(Auto auto) {
        autos.remove(auto);
    }

    @Override
    public String toString() {
        return "Concesionaria(nombre=" + nombre + ", autos=" + autos + ")";
    }
}
