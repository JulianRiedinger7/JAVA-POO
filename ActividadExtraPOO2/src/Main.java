import Entidades.Alquiler;
import Entidades.Pelicula;
import Servicios.AlquilerService;
import Servicios.PeliculaService;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        PeliculaService ps = new PeliculaService();
        AlquilerService as = new AlquilerService();

        int opcion;
        do {
            mostrarMenu();
            System.out.println("Elija una opcion");
            opcion = input.nextInt();

             switch (opcion) {
                 case 1:
                     ps.crearPelicula();
                     break;
                 case 2:
                     ps.listarPeliculas();
                     break;
                 case 3:
                     as.crearAlquiler();
                     break;
                 case 4:
                     as.listarAlquileres();
                     break;
                 case 5:
                     System.out.println("Ingrese el titulo de la pelicula");
                     String titulo = input.next();
                     Pelicula peliPorTitulo = ps.buscarPorTitulo(titulo);
                     if( peliPorTitulo != null) {
                         System.out.println(peliPorTitulo);
                     } else {
                         System.out.println("La pelicula no fue encontrada");
                     }
                     break;
                 case 6:
                     System.out.println("Ingrese el genero de la pelicula");
                     String genero = input.next();
                     Pelicula peliPorGenero = ps.buscarPorGenero(genero);
                     if( peliPorGenero != null) {
                         System.out.println(peliPorGenero);
                     } else {
                         System.out.println("La pelicula no fue encontrada");
                     }
                     break;
                 case 7:
                     System.out.println("Ingrese el dia del alquiler");
                     int dia = input.nextInt();
                     System.out.println("Ingrese el mes del alquiler");
                     int mes = input.nextInt();
                     System.out.println("Ingrese el año del alquiler");
                     int anio = input.nextInt();
                     LocalDate fecha = LocalDate.of(anio,mes,dia);
                     Alquiler alquilerPorFecha = as.buscarPorFecha(fecha);
                     if( alquilerPorFecha != null) {
                         System.out.println(alquilerPorFecha);
                     } else {
                         System.out.println("El alquiler no fue encontrado");
                     }
                     break;
                 default:
                     break;
             }
        } while (opcion != 8);

        System.out.println("Gracias por utilizar el sistema!");
    }

    public static void mostrarMenu() {
        System.out.println("ALQUILER DE PELICULAS");
        System.out.println("1. Cargar una pelicula");
        System.out.println("2. Listar las peliculas disponibles");
        System.out.println("3. Crear un alquiler");
        System.out.println("4. Listar todos los alquileres");
        System.out.println("5. Buscar pelicula por titulo");
        System.out.println("6. Buscar pelicula por genero");
        System.out.println("7. Buscar alquiler por fecha");
        System.out.println("8. SALIR");
    }
}