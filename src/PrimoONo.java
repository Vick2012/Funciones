import java.util.Scanner;

public class PrimoONo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\tIDENTIFICADOR DE NUMEROS PRIMOS");

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        String resultado = verificarPrimo(numero);

        System.out.println("El número ingresado es: " + resultado);

        sc.close();
    }

    // Función para verificar si un número es primo
    public static String verificarPrimo(int num) {

        for (int i = 2; i <= Math.sqrt (num); i++) {
            if (num % i == 0) {
                return "No Primo (NP)"; // Si es divisible por algún número, no es primo
            }
        }

        return "Primo (P)"; // Si no se encontraron divisores, es primo
    }
}
