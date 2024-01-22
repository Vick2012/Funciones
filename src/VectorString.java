import java.util.Scanner;

public class VectorString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Titulo
        System.out.println("\n\t\t VECTOR STRING");

        // Se solicita el tamaño del vector
        System.out.print("Ingrese el tamaño del vector de nombres: ");
        int tamano = sc.nextInt();
        sc.nextLine(); //de entero a string

        // Crear el vector nombres
        String[] Nombres = new String[tamano];

        // Llenar el vector con nombres
        llenarNombres(Nombres);

        // Imprimir el vector nombres
        System.out.println("\n\t\tVector de nombres: \n");
        imprimirNombres(Nombres);

    }

    // Función para llenar el vector con nombres ingresados por el usuario
    public static void llenarNombres(String[] Nombres) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < Nombres.length; i++) {
            System.out.print("Ingrese el nombre # " + (i + 1) + ": ");
            Nombres[i] = sc.nextLine();
        }
    }

    // Función para imprimir el vector de nombres
    public static void imprimirNombres(String[] vectorNombres) {
        for (int i = 0; i < vectorNombres.length; i++) {
            System.out.println(vectorNombres[i]);
        }
    }
}
