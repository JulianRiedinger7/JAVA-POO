import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        String mesSecreto = meses[(int) Math.round(Math.random() * 11)];

        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minusculas: ");
        String mesElegido = input.next();

        while(!mesElegido.equalsIgnoreCase(mesSecreto)) {

            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            mesElegido = input.next();
        }

        System.out.println("Ha acertado!");

    }
}