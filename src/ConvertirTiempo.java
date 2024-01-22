import java.util.Scanner;

public class ConvertirTiempo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\tCONVERTIDOR DE TIEMPO A SEGUNDOS");

        System.out.print("Ingrese las horas: ");
        int horas = sc.nextInt();

        System.out.print("Ingrese los minutos: ");
        int minutos = sc.nextInt();

        System.out.print("Ingrese los segundos: ");
        int segundos = sc.nextInt();

        // Llamada a la función para convertir y mostrar el resultado
        int tiempoEnSegundos = convertirTiempoASegundos(horas, minutos, segundos);
        System.out.println("El tiempo ingresado es equivalente a " + tiempoEnSegundos + " segundos.");


    }

    // Función para convertir tiempo a segundos
    public static int convertirTiempoASegundos(int horas, int minutos, int segundos) {
        final int SegundosHora = 3600;
        final int SegundosMinutos = 60;

        int tiempoTotalEnSegundos = (horas * SegundosHora) + (minutos * SegundosMinutos) + segundos;

        return tiempoTotalEnSegundos;
    }
}
