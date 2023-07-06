import Entidades.Cadena;
import Services.CadenaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CadenaService cs = new CadenaService();
        Cadena cadena = cs.crearCadena();

        System.out.println(cadena);
        cs.mostrarVocales(cadena);
        cs.invertirFrase(cadena);

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese una letra para ver cuantas veces aparece en Cadena");
        String letra = input.nextLine();

        int cantRepetido = cs.vecesRepetido(cadena, letra);
        System.out.println("La letra " + letra + " esta repetida " + cantRepetido + " veces");

        System.out.println("Ingrese una frase para comparar la longitud");
        String frase = input.nextLine();

        cs.compararLongitud(frase, cadena);

        System.out.println("Ingrese una frase para unir a la cadena original");
        String fraseUnir = input.nextLine();

        cs.unirFrases(fraseUnir,cadena);

        System.out.println("Ingrese una letra para reemplazar");
        String letraReemplazo = input.nextLine();

        cs.reemplazar(letraReemplazo, cadena);
        System.out.println(cadena);

        System.out.println("Ingrese una letra para ver si se contiene en cadena");
        String letraContiene = input.nextLine();

        System.out.println("Contiene " + letraContiene + " ?: " + cs.contiene(letraContiene, cadena));
    }
}