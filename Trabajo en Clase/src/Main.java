public class Main {
    public static void main(String[] args) {
        // Definimos la matriz de objetos
        Object[][] matrizObjetos = new Object[2][3]; // Por ejemplo, una matriz 2x3
        
        // Inicializamos los objetos en la matriz con diferentes valores
        matrizObjetos[0][0] = "Hola";  // String
        matrizObjetos[0][1] = 123;     // Integer
        matrizObjetos[0][2] = 3.14;    // Double
        matrizObjetos[1][0] = true;    // Boolean
        matrizObjetos[1][1] = 'a';     // Char
        
        // Imprimimos los valores de la matriz
        for (Object[] fila : matrizObjetos) {
            for (Object elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        // Llamada al método de búsqueda en ObjectController
        Station[] estaciones = new Station[3];
        estaciones[0] = new Station("Estación A");
        estaciones[1] = new Station("Estación B");
        estaciones[2] = new Station("Estación C");

        String nombreBuscado = "Estación B";
        Station resultado = (Station) objecController.buscarPorAtributo(estaciones, "nombre", nombreBuscado);

        if (resultado != null) {
            System.out.println("Estación encontrada: " + resultado.getNombre());
        } else {
            System.out.println("Estación no encontrada.");
        }

        // Llamada al método de visualización en ObjectView
        Station estacionA = new Station("Estación A");
        ObjectView.mostrarInformacion(estacionA);
    }
}
