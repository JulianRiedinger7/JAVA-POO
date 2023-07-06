package Servicios;

import Entidades.Curso;

import java.util.Scanner;

public class CursoService {
    private Scanner input = new Scanner(System.in);

    public String[] cargarAlumnos() {

        String alumnosArr[] = new String[5];

        for (int i = 0; i < alumnosArr.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1));
            alumnosArr[i] = input.nextLine();
        }

        return alumnosArr;
    }

    public Curso crearCurso() {
        Curso curso = new Curso();

        System.out.println("Ingrese el nombre del curso");
        curso.setNombreCurso(input.nextLine());

        String turno;
        do {
            System.out.println("Ingrese el turno del curso: m/t");
            turno = input.nextLine();

        } while (!turno.equals("m") && !turno.equals("t"));

        curso.setTurno(turno);

        System.out.println("Ingrese la cantidad de horas por dia");
        curso.setCantidadHorasPorDia(input.nextInt());

        System.out.println("Ingrese la cantidad de dias por semana");
        curso.setCantidadDiasPorSemana(input.nextInt());

        System.out.println("Ingrese el precio por hora del curso");
        curso.setPrecioPorHora(input.nextInt());
        input.nextLine();

        String alumnos[] = cargarAlumnos();

        curso.setAlumnos(alumnos);

        return curso;
    }

    public int calcularGananciaSemanal(Curso curso) {
        int horasPorDia = curso.getCantidadHorasPorDia();
        int precioPorHora = curso.getPrecioPorHora();
        int cantAlumnos = curso.getAlumnos().length;
        int diasPorSemana = curso.getCantidadDiasPorSemana();

        return cantAlumnos * ((precioPorHora * horasPorDia) * diasPorSemana);
    }
}
