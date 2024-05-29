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
        matrizObjetos[1][2] = new MiObjeto(); // Objeto personalizado
        
        // Imprimimos los valores de la matriz
        for (Object[] fila : matrizObjetos) {
            for (Object elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}

// Clase de ejemplo para un objeto personalizado
class MiObjeto {
    private int valor;

    public MiObjeto() {
        this.valor = 10;
    }

    @Override
    public String toString() {
        return "MiObjeto con valor: " + valor;
    }
}

