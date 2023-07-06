package Servicios;

import Entidades.Raices;

import java.util.Scanner;

public class RaicesService {
    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Raices crearRaices() {

        System.out.println("Ingrese el valor de a");
        double a = input.nextDouble();

        System.out.println("Ingrese el valor de b");
        double b = input.nextDouble();

        System.out.println("Ingrese el valor de c");
        double c = input.nextDouble();

        return new Raices(a,b,c);

    }

    public double getDiscriminante(Raices raices) {
        double potencia = Math.pow(raices.getB(), 2);

        return potencia - 4 * raices.getA() * raices.getC();
    }

    public boolean tieneRaices(Raices raices) {
        return getDiscriminante(raices) > 0;
    }

    public boolean tieneRaiz(Raices raices) {
        return getDiscriminante(raices) == 0;
    }

    public void obtenerRaices(Raices raices) {
        double a = raices.getA();
        double b = raices.getB();
        double c = raices.getC();

        if(tieneRaices(raices)) {
            final double calc = (Math.pow(b, 2)) - (4 * a * c);
            double solucion1 = ((-b + Math.sqrt(calc)) / (2 * a));
            double solucion2 = ((-b - Math.sqrt(calc)) / (2 * a));

            System.out.println("La primer solucion es " + solucion1);
            System.out.println("La segunda solucion es " + solucion2);
        }
    }

    public void obtenerRaiz(Raices raices) {
        double a = raices.getA();
        double b = raices.getB();
        double c = raices.getC();

        if(tieneRaiz(raices)) {
            final double calc = (Math.pow(b, 2)) - (4 * a * c);
            double solucion1 = ((-b - Math.sqrt(calc)) / (2 * a));

            System.out.println("La primer solucion es " + solucion1);
        }
    }

    public void calcular(Raices raices) {
        if(tieneRaices(raices)) {
            obtenerRaices(raices);
        } else if (tieneRaiz(raices)) {
            obtenerRaiz(raices);
        } else {
            System.out.println("No existe solucion");
        }
    }

}
