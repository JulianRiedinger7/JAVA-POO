package Services;

import Entidades.Puntos;

import java.util.Scanner;

public class PuntosService {

    private Scanner input = new Scanner(System.in);

    public Puntos crearPuntos() {
        System.out.println("Ingrese el x del primer punto");
        int x1 = input.nextInt();

        System.out.println("Ingrese el y del primer punto");
        int y1 = input.nextInt();

        System.out.println("Ingrese el x del segundo punto");
        int x2 = input.nextInt();

        System.out.println("Ingrese el y del segundo punto");
        int y2 = input.nextInt();

        return new Puntos(x1,y1,x2,y2);
    }

    public double distanciaPuntos(Puntos puntos) {
        int x1 = puntos.getX1();
        int y1 = puntos.getY1();
        int x2 = puntos.getX2();
        int y2 = puntos.getY2();

        double potenciaX = Math.pow((x2-x1), 2);
        double potenciaY = Math.pow((y2-y1), 2);

        return Math.sqrt(potenciaX + potenciaY);
    }
}
