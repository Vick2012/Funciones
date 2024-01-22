import java.util.Scanner;

public class CentimetrosAPulgadas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\tCONVERSOR DE CENTIMETROS A PULGADAS");

        System.out.print("Ingrese una medida en centímetros (cm): ");
        double Centimetros = sc.nextDouble();

        // Llamada a la función para convertir y mostrar el resultado
        double Pulgadas = convertirCentimetrosAPulgadas(Centimetros);
        System.out.println(Centimetros + " cm es equivalente a " + Pulgadas + " pulgadas.");

    }

    // Función para convertir centímetros a pulgadas
    public static double convertirCentimetrosAPulgadas(double centimetros) {
        double PulgadaPorCentimetro = 2.54;
        return centimetros / PulgadaPorCentimetro;
    }
}
