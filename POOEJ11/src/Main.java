import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el anio ");
        int anio = input.nextInt();

        System.out.println("Ingrese el mes");
        int mes = input.nextInt();

        System.out.println("Ingrese el dia");
        int dia = input.nextInt();

        Calendar fechaIngresada = new GregorianCalendar(anio, mes, dia);
        Calendar fechaActual = new GregorianCalendar();
        //Date fecha1 = new Date(anio - 1900,mes,dia);
        //Date fechaActual = new Date();

        System.out.println("La fecha ingresada fue " + fechaAString(fechaIngresada));
        System.out.println("La fecha actual es " + fechaAString(fechaActual));

        int aniosDiferencia = fechaActual.get(Calendar.YEAR) - fechaIngresada.get(Calendar.YEAR);

        System.out.println("Los anios de diferencia son: " + aniosDiferencia);

    }

    public static String fechaAString(Calendar fecha) {
        return fecha.get(Calendar.YEAR) + "/" + fecha.get(Calendar.MONTH) + "/" + fecha.get(Calendar.DATE);
    }
}