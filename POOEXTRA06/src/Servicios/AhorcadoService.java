package Servicios;

import Entidades.Ahorcado;

import java.util.Scanner;

public class AhorcadoService {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    private boolean gano = false, perdio = false;

    public Ahorcado crearJuego() {

        Ahorcado ahorcado = new Ahorcado();

        System.out.println("Ingrese la palabra");
        String palabra = input.next();

        System.out.println("Ingrese la cantidad maxima de jugadas");
        int jugadas = input.nextInt();

        String palabraArr[] = new String[palabra.length()];

        for (int i = 0; i < palabraArr.length; i++) {
            palabraArr[i] = palabra.substring(i, i + 1);
        }

        ahorcado.setPalabraABuscar(palabraArr);
        ahorcado.setJugadasMaximas(jugadas);
        ahorcado.setLetrasEncontradas(0);

        return ahorcado;

    }


    public void longitud(Ahorcado ahorcado) {
        System.out.println("La longitud de la palabra es de: " + ahorcado.getPalabraABuscar().length);
    }

    public void buscar(String letra, Ahorcado ahorcado) {
        boolean encontrada = false;

        for (int i = 0; i < ahorcado.getPalabraABuscar().length; i++) {
            if(letra.equalsIgnoreCase(ahorcado.getPalabraABuscar()[i])) {
                System.out.println("La letra " + letra + " SI se encuentra");
                encontrada = true;
                ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + 1);
                ahorcado.getPalabraABuscar()[i] = "";
                break;
            }
        }

        if(!encontrada) {
            System.out.println("La letra " + letra + " NO se encuentra");
            ahorcado.setJugadasMaximas(ahorcado.getJugadasMaximas() - 1);
        }
    }

    public void encontradas(Ahorcado ahorcado) {
        int encontradas = ahorcado.getLetrasEncontradas();
        int faltantes = ahorcado.getPalabraABuscar().length - encontradas;
        if(faltantes == 0 ) {
            System.out.println("Felicidades, Ganaste!!!");
            gano = true;
        } else {
            System.out.println("Numero de letras (encontradas, faltantes): (" + encontradas + "," + faltantes + ")");
        }
    }

    public void intentos(Ahorcado ahorcado) {
        if(ahorcado.getJugadasMaximas() == 0) {
            System.out.println("Lo sentimos, no hay mas oportunidades");
            perdio = true;
        } else {
            System.out.println("Numero de oportunidades restantes: " + ahorcado.getJugadasMaximas());
        }
    }

    public void juego() {

        Ahorcado ahorcado = crearJuego();
        
        while(ahorcado.getJugadasMaximas() >= 0 && !gano && !perdio) {
            System.out.println("Ingrese una letra: ");
            String letra = input.next();

            System.out.println("Longitud de la palabra: " + ahorcado.getPalabraABuscar().length);

            System.out.print("Mensaje: ");
            buscar(letra, ahorcado);

            encontradas(ahorcado);

            intentos(ahorcado);

            System.out.println("-------------------------------------");
        }

    }

}
