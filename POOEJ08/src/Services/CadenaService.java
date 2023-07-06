package Services;

import Entidades.Cadena;

import java.util.Scanner;

public class CadenaService {

    private Scanner input = new Scanner(System.in);

    public Cadena crearCadena() {

        Cadena cadena = new Cadena();
        System.out.println("Ingrese una frase (una palabra o varias separadas por espacio)");
        cadena.setFrase(input.nextLine());
        int longitudFrase = cadena.getFrase().length();
        cadena.setLongitud(longitudFrase);

        return cadena;
    }

    public void mostrarVocales(Cadena cadena) {
        int cantVocales = 0;
        String fraseCadena = cadena.getFrase();

        for (int i = 0; i < cadena.getLongitud(); i++) {
            String letra = fraseCadena.substring(i, i + 1).toLowerCase();
            if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u"))
                cantVocales++;
        }

        System.out.println(fraseCadena + " tiene " + cantVocales + " vocales");
    }

    public void invertirFrase(Cadena cadena) {
        char[] letrasFrase = cadena.getFrase().toCharArray();
        String fraseInvertida = "";
        for (int i = letrasFrase.length-1; i >= 0; i--) {
            fraseInvertida = fraseInvertida.concat(String.valueOf(letrasFrase[i]));
        }

        System.out.println(cadena.getFrase() + " invertida es " + fraseInvertida);
    }

    public int vecesRepetido(Cadena cadena, String letra) {
        int veces = 0;
        String fraseCadena = cadena.getFrase();

        for (int i = 0; i < cadena.getLongitud(); i++) {
            if(fraseCadena.substring(i, i+1).equals(letra)) veces++;
        }

        return veces;
    }

    public void compararLongitud(String fraseIngresada, Cadena cadena) {
        if(cadena.getFrase().compareTo(fraseIngresada) > 0) {
            System.out.println(cadena.getFrase() + " tiene mas longitud que " + fraseIngresada);
        } else if (fraseIngresada.compareTo(cadena.getFrase()) > 0) {
            System.out.println(fraseIngresada + " tiene mas longitud que " + cadena.getFrase());
        } else {
            System.out.println("Ambas frases tienen la misma longitud");
        }

    }

    public void unirFrases(String frase, Cadena cadena) {
        String fraseCadena = cadena.getFrase();

        System.out.println("El resultado es " + fraseCadena.concat(frase));
    }


    public void reemplazar(String letra, Cadena cadena) {
        String fraseCadena = cadena.getFrase();

        System.out.println("EL resultado de reemplazar todas las 'a' por " + letra + " es " + fraseCadena.replace("a", letra));
    }

    public boolean contiene(String letra, Cadena cadena) {
        return cadena.getFrase().contains(letra);
    }
}
