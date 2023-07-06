package Servicios;

import Entidades.Movil;

import java.util.Scanner;

public class MovilService {

    private Scanner input = new Scanner(System.in);

    public int[] ingresarCodigo() {
        int codigoArr[] = new int[7];

        for (int i = 0; i < codigoArr.length; i++) {
            System.out.println("Ingrese el codigo " + (i + 1) + " de " + codigoArr.length);
            codigoArr[i] = input.nextInt();
        }

        return codigoArr;
    }

    public Movil cargarCelular() {
        Movil movil = new Movil();
        System.out.println("Ingrese la marca del celular: ");
        movil.setMarca(input.next());

        System.out.println("Ingrese el precio del celular: ");
        movil.setPrecio(input.nextInt());

        System.out.println("Ingrese el modelo del celular: ");
        movil.setModelo(input.next());

        System.out.println("Ingrese la memoria ram del celular: ");
        movil.setMemoriaRam(input.nextInt());

        System.out.println("Ingrese el almacenamiento del celular: ");
        movil.setAlmacenamiento(input.nextInt());

        movil.setCodigo(ingresarCodigo());

        return movil;
    }
}
