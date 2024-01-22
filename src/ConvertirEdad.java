import java.util.Scanner;

public class ConvertirEdad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\tCONVIERTE TU EDAD EN HORAS\n");

        System.out.print("Ingrese la edad en años: ");
        int anos = sc.nextInt();

        System.out.print("Ingrese la edad en meses: ");
        int meses = sc.nextInt();

        System.out.print("Ingrese la edad en días: ");
        int dias = sc.nextInt();

        // Llamada a la función para convertir y mostrar el resultado
        int edadEnHoras = convertirEdadAHoras(anos, meses, dias);
        System.out.println("La edad ingresada es equivalente a " + edadEnHoras + " horas.");


    }

    // Función para convertir edad a horas
    public static int convertirEdadAHoras(int anos, int meses, int dias) {
        final int HorasDias = 24;
        final int DiasEnUnAno = 365;
        final int DiasEnUnMes = 30; // Usado como un valor promedio

        int edadTotalEnDias = (anos * DiasEnUnAno) + (meses * DiasEnUnMes) + dias;
        int edadTotalEnHoras = edadTotalEnDias * HorasDias;

        return edadTotalEnHoras;
    }
}
