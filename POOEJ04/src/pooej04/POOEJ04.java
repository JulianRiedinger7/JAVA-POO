/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooej04;

import Entidades.Rectangulo;

/**
 *
 * @author User
 */
public class POOEJ04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo rect1 = new Rectangulo();
        
        rect1.crearRectangulo();
        
        System.out.println("El perimetro es ");
        System.out.println(rect1.calcularPerimetro());
        System.out.println("La superficie es ");
        System.out.println(rect1.calcularSuperficie());
        System.out.println("Dibujo: ");
        rect1.dibujar();
    }
    
}
