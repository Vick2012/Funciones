
/*cree un programa que le pida al usuario el tamaño de elementos
aleatorios, los guarde en un vector y los imprima */

//Librerias
import java.util.Scanner;
import java.util.Random;

public class VectorAleatorio {

    public static void main(String[] args) {
        //instancia de clase
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\tVECTOR CON NUMEROS ALEATORIOS\n");

       //Se solicita al usuario el tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        int tam = sc.nextInt();

        // Crear el vector
        int[] vector = new int[tam];

        // Llenar el vector con elementos aleatorios
        llenarVectorAleatorio(vector);

        // Imprimir el vector
        System.out.println("Vector Creado: ");
        imprimirVector(vector);

    }

    // Función para llenar el vector con elementos aleatorios
    public static void llenarVectorAleatorio(int[] vector) {
        Random aleatorio = new Random();

        for (int i = 0; i < vector.length; i++) {
            // Números aleatorios entre 0 y 99
            vector[i] = aleatorio.nextInt(100);
        }
    }

    // Función para imprimir el vector
    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
}
