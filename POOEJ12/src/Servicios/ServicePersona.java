package Servicios;

import Entidades.Persona;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ServicePersona {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        Persona persona = new Persona();

        System.out.println("Ingrese el nombre: ");
        persona.setNombre(input.nextLine());

        System.out.println("Ingrese el anio en que nacio: ");
        int anio = input.nextInt();

        System.out.println("Ingrese el mes en que nacio: ");
        int mes = input.nextInt();

        System.out.println("Ingrese el dia en que nacio: ");
        int dia = input.nextInt();
        input.nextLine();

        Calendar fechaNacimiento = new GregorianCalendar(anio, mes - 1, dia);

        persona.setFechaNacimiento(fechaNacimiento.getTime());
        return persona;
    }

    public int calcularEdad(Persona persona) {
        Date fechaActual = new Date();

        return fechaActual.getYear() - (persona.getFechaNacimiento().getYear());
    }

    public boolean menorQue(int edad, Persona persona) {
        int edadPersona = calcularEdad(persona);

        return edadPersona < edad;
    }

    public void mostrarPersona(Persona persona) {
        Date fechaNacimiento = persona.getFechaNacimiento();
        String nombre = persona.getNombre();

        System.out.println("La persona es " + nombre + " y nacio el " + dateAString(fechaNacimiento));
    }


    public static String dateAString(Date fecha) {
        Calendar calendario = new GregorianCalendar();

        calendario.setTime(fecha);

        int anio = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH) + 1;
        int dia = calendario.get(Calendar.DATE);

        return dia + "/" + mes + "/" + anio;
    }
}
