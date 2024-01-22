
        //Realice una función que reciba como parámetro un número entero y
        //escriba la tabla de multiplicar de ese número.

import java.util.Scanner;

public class TablaDeMultiplicar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\tTABLA DE MULTIPLICAR");

        System.out.print("Ingrese un número entero para ver su tabla de multiplicar: ");
        int numero = sc.nextInt();

        // Llamada a la función para imprimir la tabla de multiplicar
        imprimirTablaMultiplicar(numero);


    }

    // Función para imprimir la tabla de multiplicar de un número
    public static void imprimirTablaMultiplicar(int numero) {
        System.out.println("\nTabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
