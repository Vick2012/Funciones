import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("\n\t\t CONVERSOR DE TEMPERATURAS");

        while (continuar) {

            System.out.print("Ingrese la temperatura en grados Celsius (°C): ");
            double temCelsius = sc.nextDouble();

            System.out.println("\nSeleccione la unidad de temperatura a la cual desea convertir:");
            System.out.println("1. Fahrenheit (°F)");
            System.out.println("2. Kelvin (°K)");
            System.out.println("3. Cerrar el programa \n");
            System.out.print("Opcion N°: ");

            int opcion = sc.nextInt();

            //Menu de seleccion
            switch (opcion) {
                case 1:
                    // Convertir a Fahrenheit
                    double temFahrenheit = convertirTemperatura(temCelsius, 'F');
                    System.out.println("La temperatura en grados Fahrenheit es: " + temFahrenheit + " °F");
                    break;
                case 2:
                    // Convertir a Kelvin
                    double temKelvin = convertirTemperatura(temCelsius, 'K');
                    System.out.println("La temperatura en grados Kelvin es: " + temKelvin + " °K");
                    break;
                case 3:
                    // Cerrar el programa
                    System.out.println("Cerrando el programa. ¡Hasta luego!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione 1, 2 o 3.");
            }
        }


    }

    // Función para convertir temperatura
    public static double convertirTemperatura(double temCelsius, char unidadDestino) {
        switch (unidadDestino) {
            case 'F':
                return (temCelsius * 9 / 5) + 32; // Fórmula para Celsius a Fahrenheit
            case 'K':
                return temCelsius + 273.15; // Fórmula para Celsius a Kelvin
            default:
                throw new IllegalArgumentException("Unidad de temperatura no válida.");
        }
    }
}
