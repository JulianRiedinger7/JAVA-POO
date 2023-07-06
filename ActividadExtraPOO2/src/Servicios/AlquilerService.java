package Servicios;

import Entidades.Alquiler;
import Entidades.Pelicula;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

public class AlquilerService {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    private static ArrayList<Alquiler> listadoAlquileres = new ArrayList<>();

    public Alquiler crearAlquiler() {
        Alquiler alquiler = new Alquiler();

        Pelicula peliEncontrada;
        do {
            System.out.println("Ingrese un titulo valido de la pelicula a alquilar");
            String titulo = input.next();
            peliEncontrada = PeliculaService.buscarPorTitulo(titulo);
        } while(peliEncontrada == null);

        alquiler.setPeliculaAlquilada(peliEncontrada);

        System.out.println("Ingrese la fecha de inicio del alquiler");
        System.out.println("Dia: ");
        int dia = input.nextInt();

        System.out.println("Mes: ");
        int mes = input.nextInt();

        System.out.println("Año: ");
        int anio = input.nextInt();

        LocalDate fechaInicio = LocalDate.of(anio,mes,dia);

        alquiler.setFechaInicio(fechaInicio);

        System.out.println("Ingrese la fecha de fin del alquiler");
        System.out.println("Dia: ");
        dia = input.nextInt();

        System.out.println("Mes: ");
        mes = input.nextInt();

        System.out.println("Año: ");
        anio = input.nextInt();

        LocalDate fechaFin = LocalDate.of(anio,mes,dia);

        alquiler.setFechaFin(fechaFin);

        alquiler.setPrecio(precioAlquiler(alquiler));

        listadoAlquileres.add(alquiler);

        return alquiler;
    }

    public void listarAlquileres() {
        for(Alquiler alquiler: listadoAlquileres) {
            System.out.println(alquiler);
        }
    }

    public double precioAlquiler(Alquiler alq) {
        Period diferencia = Period.between(alq.getFechaInicio(), alq.getFechaFin());

        final double precioInicial = 10;

        if(diferencia.getDays() <= 3) {
            return precioInicial;
        }

        double precioInteres = (precioInicial * 0.1) * (diferencia.getDays() - 3);

        return precioInicial + precioInteres;
    }

    public Alquiler buscarPorFecha(LocalDate fecha) {
        for(Alquiler alq: listadoAlquileres) {
            if(fecha.equals(alq.getFechaInicio())) {
                return alq;
            }
        }
        return null;
    }
}
