
        /*Realice una función que calcule el área y el perímetro de un
        rectángulo, dada su BASE y ALTURA.*/

import java.util.Scanner;

public class CalculaRectangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\tCALCULA AREA Y PERIMETRO DE RECTANGULO");

        System.out.print("Ingrese la base del rectángulo: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = sc.nextDouble();

        // Calcular área y perímetro usando la función
        double area = calcularAreaRectangulo(base, altura);
        double perimetro = calcularPerimetroRectangulo(base, altura);

        // Mostrar resultados
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);

    }

    // Función para calcular el área de un rectángulo
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Función para calcular el perímetro de un rectángulo
    public static double calcularPerimetroRectangulo(double base, double altura) {
        return 2 * (base + altura);
    }
}
