/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooej06;

import Entidades.Cafetera;

/**
 *
 * @author User
 */
public class POOEJ06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cafetera Nespresso = new Cafetera(50, 25);
        
        System.out.println("La capacidad maxima de la cafetera Nespresso es " + Nespresso.getCapacidadMaxima());
        System.out.println("La cantidad actual de la cafetera Nespresso es " + Nespresso.getCantidadActual());  
        
        System.out.println("Le agregamos 10 a la cafetera");
        Nespresso.agregarCafe(10);
        System.out.println("La cantidad actual de la cafetera Nespresso es " + Nespresso.getCantidadActual());
        
        System.out.println("Quiero servir una taza con 20");
        Nespresso.servirTaza(20);
        
        System.out.println("La cantidad actual de la cafetera Nespresso es " + Nespresso.getCantidadActual());  

        System.out.println("Quiero servir una taza con 20");
        Nespresso.servirTaza(20);
        
        
        System.out.println("La cantidad actual de la cafetera Nespresso es " + Nespresso.getCantidadActual());  

    }
    
}
