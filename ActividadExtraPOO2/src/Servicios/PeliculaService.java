package Servicios;

import Entidades.Pelicula;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaService {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    private static ArrayList<Pelicula> listadoPeliculas = new ArrayList<>();
    public Pelicula crearPelicula() {
        Pelicula peli = new Pelicula();

        System.out.println("Ingrese el titulo de la pelicula");
        peli.setTitulo(input.next());

        System.out.println("Ingrese el genero");
        peli.setGenero(input.next());

        System.out.println("Ingrese el año");
        peli.setAnio(input.nextInt());

        System.out.println("Ingrese la duracion");
        peli.setDuracion(input.nextInt());

        listadoPeliculas.add(peli);

        return peli;

    }

    public void listarPeliculas() {

       // for (int i = 0; i < listadoPeliculas.size(); i++) {
        //            System.out.println(listadoPeliculas.get(i));
        //        }

        for(Pelicula peli: listadoPeliculas) {
            System.out.println(peli);
        }
    }

    public static Pelicula buscarPorTitulo(String titulo) {
        for(Pelicula peli: listadoPeliculas) {
            if (peli.getTitulo().equalsIgnoreCase(titulo)) {
                return peli;
            }
        }
        return null;
    }

    public static Pelicula buscarPorGenero(String genero) {
        for(Pelicula peli: listadoPeliculas) {
            if (peli.getGenero().equalsIgnoreCase(genero)) {
                return peli;
            }
        }
        return null;
    }

}
