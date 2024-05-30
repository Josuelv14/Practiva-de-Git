public class ObjectView {
    public static void mostrarInformacion(Object objeto) {
        if (objeto instanceof Station) {
            Station estacion = (Station) objeto;
            System.out.println("Nombre de la estación: " + estacion.getNombre());
            // Agrega más atributos aquí si es necesario
        } else {
            System.out.println("Objeto no reconocido.");
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Station estacionA = new Station("Estación A");
        ObjectView.mostrarInformacion(estacionA);

        // Puedes crear más objetos y mostrar su información aquí
    }
}

class Station {
    private String nombre;

    public Station(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
