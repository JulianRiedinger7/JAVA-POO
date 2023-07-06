package Servicios;

import Entidades.Nif;

import java.util.Scanner;

public class NifService {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    private final String caracteres[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

    public Nif crearNif() {
        System.out.println("Ingrese el dni sin puntos");
        long dni = input.nextLong();

        String letra = calcularLetra(dni);

        return new Nif(dni,letra);

    }

    public String calcularLetra(long dni) {
        int resto = (int) (dni % 23);

        return caracteres[resto];
    }

    public void mostrar(Nif nif) {
        System.out.println("El NIF es: " + nif.getDNI() + "-" + nif.getLetra().toUpperCase());
    }

}
