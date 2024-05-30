public class objecController {
    
        // Método de búsqueda secuencial
        public static Object buscarPorAtributo(Object[] array, String atributo, String valorBuscado) {
            for (Object objeto : array) {
                // Supongamos que el atributo se llama "nombre"
                if (objeto instanceof Station) {
                    Station estacion = (Station) objeto;
                    if (estacion.getNombre().equals(valorBuscado)) {
                        return estacion;
                    }
                }
                // Agrega más condiciones para otros atributos si es necesario
            }
            return null; // Si no se encuentra el valor buscado
        }
    
        public static void main(String[] args) {
            // Ejemplo de uso
            Station[] estaciones = new Station[3];
            estaciones[0] = new Station("Estación A");
            estaciones[1] = new Station("Estación B");
            estaciones[2] = new Station("Estación C");
    
            String nombreBuscado = "Estación B";
            Station resultado = (Station) buscarPorAtributo(estaciones, "nombre", nombreBuscado);
    
            if (resultado != null) {
                System.out.println("Estación encontrada: " + resultado.getNombre());
            } else {
                System.out.println("Estación no encontrada.");
            }
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
    

