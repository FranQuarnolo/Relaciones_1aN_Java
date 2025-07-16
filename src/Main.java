public class Main {
    public static void main(String[] args) {
        // Crear una concesionaria
        Concesionaria conc = new Concesionaria("Java Motors");

        // Crear algunos autos
        Auto auto1 = new Auto("AB123CD", "Rojo");
        Auto auto2 = new Auto("EF456GH", "Azul");

        // Agregar los autos a la concesionaria
        conc.agregarAuto(auto1);
        conc.agregarAuto(auto2);

        // Mostrar los autos de la concesionaria
        System.out.println("Autos en " + conc.getNombre() + ":");
        for (Auto auto : conc.getAutos()) {
            System.out.println(auto);
        }

        // También podés mostrar la concesionaria entera
        System.out.println(conc);
    }
}
