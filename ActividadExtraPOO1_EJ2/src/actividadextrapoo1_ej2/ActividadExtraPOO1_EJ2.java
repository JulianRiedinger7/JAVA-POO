/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadextrapoo1_ej2;

import Entidades.Cuadrado;
import Entidades.Rectangulo;
import Entidades.Triangulo;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ActividadExtraPOO1_EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Cuadrado cuad1 = new Cuadrado();
        Rectangulo rect1 = new Rectangulo();
        Triangulo tri1 = new Triangulo();

        System.out.println("Ingrese la figura");
        String figura = leer.nextLine();

        switch (figura) {
            case "cuadrado":
                cuad1.crearCuadrado();
                cuad1.mostrarCalculos();
                break;
            case "rectangulo":
                rect1.crearRectangulo();
                rect1.mostrarCalculos();
                break;
            case "triangulo":
                tri1.crearTriangulo();
                tri1.mostrarCalculos();
                break;
            default:
                System.out.println("No es una figura valida");
        }
    }

}
